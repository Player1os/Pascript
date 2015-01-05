package pascript;

import java.util.ArrayList;
import java.util.Map;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptBaseVisitor;
import pascript.grammar.PascriptParser;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.*;
import pascript.SymbolTable.*;

/**
 *
 * @author Osama Hassanein
 */
public class CodeVisitor extends PascriptBaseVisitor<CodeVisitor.CodeFragment>
{
    public static class CodeFragment
    {
        protected StringBuilder _code = new StringBuilder();

        public CodeFragment()
        {
            super();
        }

        public CodeFragment(String codeString)
        {
            super();
            this._code.append(codeString);
        }

        public CodeFragment addCode(String codeString)
        {
            this._code.append(codeString);
            return this;
        }

        @Override
        public String toString()
        {
            return this._code.toString();
        }
    }
    
    private final SymbolTable _symbolTable;
    private final DataTypeVisitor _dataTypeVisitor;
    private final ExpressionCodeVisitor _expressionCodeVisitor;
        
    public CodeVisitor()
    {
        super();
        this._symbolTable = new SymbolTable();
        this._dataTypeVisitor = new DataTypeVisitor();
        this._expressionCodeVisitor = new ExpressionCodeVisitor(this._symbolTable);
    }
    
    private void printCompilationError(String errorMessage, Token errorToken)
    {
        String position = String.format("%d:%d", errorToken.getLine(), errorToken.getCharPositionInLine());
        System.err.println(errorMessage + " @ " + position);
    }
    
    @Override
    public CodeFragment visit(ParseTree pt)
    {
        return pt == null ? new CodeFragment() : super.visit(pt);
    }
    
    @Override
    public CodeFragment visitModule(PascriptParser.ModuleContext ctx)
    {
        CodeFragment externalFunctionsCodeFragment = this.visit(ctx.externalSection());
        CodeFragment globalVariablesCodeFragment = this.visit(ctx.variableSection());
        CodeFragment localFunctionsCodeFragment = this.visit(ctx.functionSection());
        CodeFragment mainCodeFragment = this.visit(ctx.mainSection());
        
        ST template = new ST(
            "<external_functions_code>\n" +
            "<global_variables_code>\n" +
            "<string_constants_code>\n" +
            "<local_functions_code>\n" +
            "define i32 @main()\n" +
            "{\n" +
            "start:\n" +
            "<global_variable_initializers_code>" +
            "<main_code>" +
            "ret i32 0\n" +
            "}"
        );
        
        StringBuilder stringConstantsCode = new StringBuilder();
        String stringConstantCodeTemplateString =
            "<memory_register> = constant [<length> x i8] c\"<value>\\00\"\n";
        for (Map.Entry<String, String> stringConstant : this._symbolTable.getStringConstants().entrySet())
        {
            String value = stringConstant.getValue();
            
            ST stringConstantCodeTemplate = new ST(stringConstantCodeTemplateString);
            stringConstantCodeTemplate.add("memory_register", stringConstant.getKey());
            stringConstantCodeTemplate.add("length", Integer.toString(value.length() + 1));
            stringConstantCodeTemplate.add("value", value);
            
            stringConstantsCode.append(stringConstantCodeTemplate.render());
        }
        
        StringBuilder globalVarableInitializersCode = new StringBuilder();
        String globalVarableInitializerCodeTemplateString = 
            "<value_code>" +
            "store <data_type> <value_register>, <data_type>* <variable_register>\n";
        for (Map.Entry<String, ExpressionCodeFragment> globalVarableInitializer : this._symbolTable.getGlobalVarableInitializers().entrySet()) //@todo implement
        {
            ExpressionCodeFragment expressionCodeFragment = globalVarableInitializer.getValue();
            
            ST globalVarableInitializerCodeTemplate = new ST(globalVarableInitializerCodeTemplateString);
            globalVarableInitializerCodeTemplate.add("value_code", expressionCodeFragment.toString());
            globalVarableInitializerCodeTemplate.add("value_register", expressionCodeFragment.getRegister());
            globalVarableInitializerCodeTemplate.add("data_type", expressionCodeFragment.getDataType().getOutputType());
            globalVarableInitializerCodeTemplate.add("variable_register", globalVarableInitializer.getKey());
            
            globalVarableInitializersCode.append(globalVarableInitializerCodeTemplate.render());
        }
        
        template.add("external_functions_code", externalFunctionsCodeFragment.toString());
        template.add("global_variables_code", globalVariablesCodeFragment.toString());
        template.add("string_constants_code", stringConstantsCode.toString());
        template.add("local_functions_code", localFunctionsCodeFragment.toString());
        template.add("global_variable_initializers_code", globalVarableInitializersCode.toString());
        template.add("main_code", mainCodeFragment.toString());

        return new CodeFragment(template.render());
    }
    
    @Override
    public CodeFragment visitExternalSection(PascriptParser.ExternalSectionContext ctx)
    {
        String externalFunctionCodeTemplateString = 
            "declare <return_data_type> <function_name>(<parameter_data_types>)\n";
        CodeFragment codeFragment = new CodeFragment();
        
        for (PascriptParser.ExternalFunctionDeclarationContext functionDeclarationCtx : ctx.externalFunctionDeclaration())
        {
            String name = functionDeclarationCtx.functionName.getText();
            DataType returnDataType = this._dataTypeVisitor.visit(functionDeclarationCtx.returnDataType());
            
            ArrayList<DataType> parameterDataTypes = new ArrayList<>();
            StringBuilder parameterDataTypesCode = new StringBuilder();
            boolean firstParameter = true;
            for (PascriptParser.DataTypeContext dataTypeContext : functionDeclarationCtx.parameterList().dataType())
            {
                DataType dataType = this._dataTypeVisitor.visit(dataTypeContext);
                parameterDataTypes.add(dataType);
                
                if (!firstParameter)
                {
                    parameterDataTypesCode.append(", ");
                }
                else
                {
                    firstParameter = false;
                }
                parameterDataTypesCode.append(dataType.getOutputType());
            }
            
            FunctionRecord functionRecord = this._symbolTable.addExternalFunction(name, returnDataType, parameterDataTypes);
            
            if (functionRecord == null)
            {
                this.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
            
            ST externalFunctionCodeTemplate = new ST(externalFunctionCodeTemplateString);
            externalFunctionCodeTemplate.add("return_data_type", returnDataType.getOutputType());
            externalFunctionCodeTemplate.add("function_name", functionRecord.getOutputFunctionName());
            externalFunctionCodeTemplate.add("parameter_data_types", parameterDataTypesCode.toString());
            codeFragment.addCode(externalFunctionCodeTemplate.render());
        }
        
        return codeFragment;
    }

    public CodeFragment processGlobalVariableDeclaration(Token nameToken, DataType dataType, ExpressionCodeFragment expressionCodeFragment)
    {
        CodeFragment codeFragment = new CodeFragment();
        
        VariableRecord variableRecord = this._symbolTable.addGlobalVariable(nameToken.getText(), dataType);
        if (variableRecord == null)
        {
            this.printCompilationError("A global variable with the same name already exists", nameToken);
            System.exit(-1);
        }
        
        this._symbolTable.addGlobalVariableInitializer(variableRecord.getMemoryRegister(), expressionCodeFragment); //@todo implement
        
        ST globalVariableCodeTemplate = new ST("<memory_register> = global <data_type> <value>\n");
        globalVariableCodeTemplate.add("memory_register", variableRecord.getMemoryRegister());
        globalVariableCodeTemplate.add("data_type", dataType.getOutputType());
        globalVariableCodeTemplate.add("value", dataType.getDefaultOutputValue()); //@todo implement
        
        return codeFragment.addCode(globalVariableCodeTemplate.render());
    }

    @Override
    public CodeFragment visitSimpleGlobalDeclaration(PascriptParser.SimpleGlobalDeclarationContext ctx)
    {
        ValueDataType valueDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression(valueDataType); //@todo implement
        
        return this.processGlobalVariableDeclaration(ctx.IDENTIFIER().getSymbol(), valueDataType, expressionCodeFragment);
    }
    
    @Override
    public CodeFragment visitAssignGlobalDeclaration(PascriptParser.AssignGlobalDeclarationContext ctx)
    {
        ValueDataType valueDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.literal());
        if (valueDataType.equals(expressionCodeFragment.getDataType()))
        {
            this.printCompilationError("Attempting to assign an expression that evaluates to a non-matching data type", ctx.literal().getStart());
            System.exit(-1);
        }
        
        return this.processGlobalVariableDeclaration(ctx.IDENTIFIER().getSymbol(), valueDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitFunctionSection(PascriptParser.FunctionSectionContext ctx)
    {
        String functionHeaderTemplateString = 
            "define <return_data_type> <function_name>(<parameter_list>)\n" +
            "{\n";
        String functionFooterTemplateString =
            "<dynamic_variable_deallocation_code>" +
            "<return_value_code>" +
            "ret <return_value>\n" +
            "}\n";
        
        ArrayList<String> functionHeaders = new ArrayList<>();
        ArrayList<FunctionRecord> functionRecords = new ArrayList<>();
        ArrayList<ArrayList<String>> functionParameterNames = new ArrayList<>();
        ArrayList<ArrayList<String>> functionParameterRegisters = new ArrayList<>();
        
        for (PascriptParser.FunctionDeclarationContext functionDeclarationCtx : ctx.functionDeclaration())
        {
            String functionName = functionDeclarationCtx.functionName.getText();
            DataType returnDataType = this._dataTypeVisitor.visit(functionDeclarationCtx.returnDataType());
            ArrayList<DataType> parameterDataTypes = new ArrayList<>();
            ArrayList<String> parameterNames = new ArrayList<>();
            ArrayList<String> parameterRegisters = new ArrayList<>();
            
            ST functionHeaderTemplate = new ST(functionHeaderTemplateString);
            StringBuilder parameterListString = new StringBuilder();
            
            PascriptParser.NamedParameterListContext parameterListCtx = functionDeclarationCtx.namedParameterList();
            int parameterCount = parameterListCtx.dataType().size();
            for (int iParameter = 0; iParameter < parameterCount; iParameter++)
            {
                if (iParameter > 0)
                {
                    parameterListString.append(", ");
                }
                
                DataType parameterDataType = this._dataTypeVisitor.visit(parameterListCtx.dataType(iParameter));
                String parameterName = parameterListCtx.IDENTIFIER(iParameter).toString();
                String parameterRegister = this._symbolTable.generateNewRegisterName();
                
                parameterDataTypes.add(parameterDataType);
                parameterNames.add(parameterName);
                parameterRegisters.add(parameterRegister);
                
                parameterListString.append(parameterDataType.getOutputType()).append(" ").append(parameterRegister);
            }
            
            FunctionRecord functionRecord = this._symbolTable.addLocalFunction(functionName, returnDataType, parameterDataTypes);
            if (functionRecord == null)
            {
                this.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
            
            functionHeaderTemplate.add("return_data_type", returnDataType.getOutputType());
            functionHeaderTemplate.add("function_name", functionName);
            functionHeaderTemplate.add("parameter_list", parameterListString.toString());
            
            functionHeaders.add(functionHeaderTemplate.render());
            functionRecords.add(functionRecord);
            functionParameterNames.add(parameterNames);
            functionParameterRegisters.add(parameterRegisters);
        }
        
        CodeFragment codeFragment = new CodeFragment();
        
        String argumentToVariableTemplateString =
            "<variable_register> = alloca <data_type>\n" +
            "store <data_type> <parameter_register>, <data_type>* <variable_register>\n";
        
        String dynamicVariableDealocationTemplateString =
            "call void <deallocation_function_name>(<data_type> <memory_register>)\n";
        
        int functionCount = functionHeaders.size();
        for (int iFunction = 0; iFunction < functionCount; iFunction++)
        {
            FunctionRecord functionRecord = functionRecords.get(iFunction);
            DataType functionReturnDataType = functionRecord.getReturnDataType();
            this._symbolTable.enterFunction(functionReturnDataType);
            
            ArrayList<DataType> parameterDataTypes = functionRecord.getParameterDataTypes();
            ArrayList<String> parameterNames = functionParameterNames.get(iFunction);
            ArrayList<String> parameterRegisters = functionParameterRegisters.get(iFunction);
            
            StringBuilder argumentAllocationCodeString = new StringBuilder();
            
            int parameterCount = parameterDataTypes.size();
            for (int iParameter = 0; iParameter < parameterCount; iParameter++)
            {
                DataType parameterDataType = parameterDataTypes.get(iParameter);
                VariableRecord parameterVariableRecord = this._symbolTable
                    .addLocalVariable(parameterNames.get(iParameter), parameterDataType);
                
                if (parameterVariableRecord == null)
                {
                    Token identifierToken = ctx.functionDeclaration(iFunction).namedParameterList().IDENTIFIER(iParameter).getSymbol();
                    this.printCompilationError("A parameter with the same name already exists", identifierToken);
                    System.exit(-1);
                }
                
                ST argumentToVariableTemplate = new ST(argumentToVariableTemplateString);
                argumentToVariableTemplate.add("parameter_register", parameterRegisters.get(iParameter));
                argumentToVariableTemplate.add("variable_register", parameterVariableRecord.getMemoryRegister());
                argumentToVariableTemplate.add("data_type", parameterDataType.getOutputType());
                
                argumentAllocationCodeString.append(argumentToVariableTemplate.render());
            }
            
            CodeFragment functionDefinitionCodeFragment = this.visit(ctx.functionDefinition(iFunction).blockStatement());
            
            ST functionFooterTemplate = new ST(functionFooterTemplateString);
            
            StringBuilder dynamicVariableDeallocationCode = new StringBuilder();
            for (VariableRecord variableRecord : this._symbolTable.getFunctionDynamicVariableRecords()) //@todo implement
            {
                DynamicDataType dataType = (DynamicDataType)variableRecord.getDataType();
                
                ST dynamicVariableDealocationTemplate = new ST(dynamicVariableDealocationTemplateString);
                dynamicVariableDealocationTemplate.add("deallocation_function_name", dataType.getDeallocationFunctionName()); //@todo implement
                dynamicVariableDealocationTemplate.add("data_type", dataType.getOutputType());
                dynamicVariableDealocationTemplate.add("memory_register", variableRecord.getMemoryRegister());
            }
            
            VoidDataType voidDataType = new VoidDataType();
            if (functionReturnDataType.equals(voidDataType))
            {
                functionFooterTemplate.add("return_value", functionReturnDataType.getDefaultFunctionReturnValue());
            }
            else
            {
                
            }
            
            
            codeFragment
                .addCode(functionHeaders.get(iFunction))
                .addCode(argumentAllocationCodeString.toString())
                .addCode(functionDefinitionCodeFragment.toString())
                .addCode(functionFooterTemplate.toString());
        }
        
        return codeFragment;
    }

    @Override
    public CodeFragment visitMainSection(PascriptParser.MainSectionContext ctx)
    {
        this._symbolTable.enterFunction(new IntegerDataType());
        
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.StatementContext statement : ctx.statement())
        {
            codeFragment.addCode(this.visit(statement).toString());
        }
        return codeFragment;
    }

    @Override
    public CodeFragment visitBlockStatement(PascriptParser.BlockStatementContext ctx)
    {
        this._symbolTable.enterBlock();
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.StatementContext statement : ctx.statement())
        {
            codeFragment.addCode(this.visit(statement).toString());
        }
        this._symbolTable.exitBlock();
        return codeFragment;
    }

    @Override
    public CodeFragment visitIfStatement(PascriptParser.IfStatementContext ctx)
    {
        String templateCommonPrefix = 
            "<condition_code>" +
            "br i1 <condition_register>, label %<true_label>, label %<false_label>\n" +
            "<true_label>:\n" +
            "<statement_true_code>" +
            "br label %<end_label>\n";
        String templateElseBody =
            "<false_label>:\n" +
            "<statement_false_code>" +
            "br label %<end_label>\n";
        String templateCommonSuffix = 
            "<end_label>:\n";
        
        ExpressionCodeFragment conditionCodeFramgent = this._expressionCodeVisitor.visit(ctx.condition);
        if (conditionCodeFramgent.getDataType().equals(PrimitiveDataType.PrimitiveDataTypeId.BOOLEAN)) //@todo refactor
        {
            this.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        ST template;
        if (ctx.falseStatement == null)
        {
            template = new ST(templateCommonPrefix + templateCommonSuffix);
            
            String endLabel = this._symbolTable.generateNewLabelName();
            template.add("false_label", endLabel);
            template.add("end_label", endLabel);
        }
        else
        {
            template = new ST(templateCommonPrefix + templateElseBody + templateCommonSuffix);

            template.add("statement_false_code", this.visit(ctx.falseStatement).toString());
            template.add("false_label", this._symbolTable.generateNewLabelName());
            template.add("end_label", this._symbolTable.generateNewLabelName());
        }
        
        template.add("condition_code", conditionCodeFramgent.toString());
        template.add("condition_register", conditionCodeFramgent.getRegister());
        
        template.add("true_label", this._symbolTable.generateNewLabelName());
        template.add("statement_true_code", this.visit(ctx.trueStatement).toString());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitWhileLoop(PascriptParser.WhileLoopContext ctx)
    {
        ST template = new ST(
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "br i1 <condition_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFramgent = this._expressionCodeVisitor.visit(ctx.condition);
        if (conditionCodeFramgent.getDataType().equals(PrimitiveDataType.PrimitiveDataTypeId.BOOLEAN)) //@todo refactor
        {
            this.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("condition_code", conditionCodeFramgent.toString());
        template.add("condition_register", conditionCodeFramgent.getRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitDoWhileLoop(PascriptParser.DoWhileLoopContext ctx)
    {
        ST template = new ST(
            "br label %<body_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "br i1 <condition_register>, label %<body_label>, label %<end_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFramgent = this._expressionCodeVisitor.visit(ctx.condition);
        if (conditionCodeFramgent.getDataType().equals(PrimitiveDataType.PrimitiveDataTypeId.BOOLEAN)) //@todo refactor
        {
            this.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("condition_code", conditionCodeFramgent.toString());
        template.add("condition_register", conditionCodeFramgent.getRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitForLoop(PascriptParser.ForLoopContext ctx)
    {
        ST template = new ST(
            "<initializer_code>" +
            "br label %<condition_label>\n" +
            "<condition_label>:\n" +
            "<condition_code>" +
            "br i1 <condition_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "<step_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFramgent = this._expressionCodeVisitor.visit(ctx.condition);
        if (conditionCodeFramgent.getDataType().equals(PrimitiveDataType.PrimitiveDataTypeId.BOOLEAN)) //@todo refactor
        {
            this.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("initializer_code", this.visit(ctx.initializer).toString());
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("condition_code", conditionCodeFramgent.toString());
        template.add("condition_register", conditionCodeFramgent.getRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("step_code", this._expressionCodeVisitor.visit(ctx.step).toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitSimpleDeclaration(PascriptParser.SimpleDeclarationContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        DataType variableDataType = this._dataTypeVisitor.visit(ctx.dataType());
        
        VariableRecord variableRecord = this._symbolTable.addLocalVariable(variableName, variableDataType);
        if (variableRecord == null)
        {
            this.printCompilationError("A local variable with the name already exists in the current scope", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<variable_register> = alloca <data_type>\n" +
            "store <data_type> <value_register>, <data_type>* <variable_register>\n"
        );
        
        template.add("variable_register", variableRecord.getMemoryRegister());
        template.add("data_type", variableDataType.getOutputType());
        template.add("value_register", value.getRegister()); //@todo rethink for string and arrays
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitAssignDeclaration(PascriptParser.AssignDeclarationContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        DataType variableDataType = this._dataTypeVisitor.visit(ctx.dataType());
        
        VariableRecord variableRecord = this._symbolTable.addLocalVariable(variableName, variableDataType);
        if (variableRecord == null)
        {
            this.printCompilationError("A local variable with the name already exists in the current scope", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        if (variableDataType != expressionCodeFragment.getDataType()) //@ refactor datatype comparison
        {
            this.printCompilationError("Attempting to assign an expression that evaluates to a non-matching data type", ctx.expression().getStart());
            System.exit(1);
        }
        
        ST template = new ST(
            "<value_code>" + 
            "<variable_register> = alloca <data_type>\n" +
            "store <data_type> <value_register>, <data_type>* <variable_register>\n"
        );
        
        template.add("value_code", expressionCodeFragment.toString());
        template.add("variable_register", variableRecord.getMemoryRegister());
        template.add("data_type", variableDataType.getOutputType());
        template.add("value_register", value.getRegister()); //@todo rethink for string and arrays
                
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitPrintStatement(PascriptParser.PrintStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        DataType dataType = expressionCodeFragment.getDataType();
        
        ST template = new ST(
            "<value_code>" + 
            "call void @<function_name>(<data_type> <value_register>)\n"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("value_register", expressionCodeFragment.getRegister());
        template.add("function_name", dataType.getOutputPrintFunction());
        template.add("data_type", dataType.getOutputType());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReadStatement(PascriptParser.ReadStatementContext ctx)
    {
        VariableRecord variableRecord = this._variableVisitor.visit(ctx.variable());
        DataType dataType = variableRecord.getDataType();
        
        ST template = new ST(
            "<variable_register> = call void @<function_name>(<data_type> <value_register>)\n"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("value_register", expressionCodeFragment.getRegister());
        template.add("function_name", dataType.getOutputPrintFunction());
        template.add("data_type", dataType.getOutputType());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitDeleteStatement(PascriptParser.DeleteStatementContext ctx)
    {
        return super.visitDeleteStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CodeFragment visitReturnValueStatement(PascriptParser.ReturnValueStatementContext ctx)
    {
        ExpressionCodeFragment value = this._expressionCodeVisitor.visit(ctx.expression());
        DataType functionDataType = this.functionStack.peekLast().returnType;
        
        if (value.getDataType() != functionDataType)
        {
            System.err.println("Error: returned expression doesn't" +
                " match the function's return data type");
            System.exit(1);
        }
        
        ST template = new ST(
            "<val_code>" +
            "ret <data_type> <val_register>\n"
        );
        template.add("val_code", value.toString());
        template.add("data_type", (functionDataType == DataType.INT) ? "i32" : "double");
        template.add("val_register", value.getRegister());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReturnVoidStatement(PascriptParser.ReturnVoidStatementContext ctx)
    {
        if (this._symbolTable.getCurrentFunctionReturnDataType() != new VoidDataType()) //@todo refactor data type
        {
            this.printCompilationError("The expression does not evaluate to the same data"
                + " type as the function's return data type", ctx.start);
            System.exit(-1);
        }
        return new CodeFragment("ret void\n");
    }

    @Override
    public CodeFragment visitExpressionStatement(PascriptParser.ExpressionStatementContext ctx)
    {
        return this._expressionCodeVisitor.visit(ctx.expression());
    }
    
/*
    @Override
    public CodeFragment visitFunctionReturn(PascriptParser.FunctionReturnContext ctx)
    {
        CodeFragment value = this.visit(ctx.expression());
        DataType functionDataType = this.functionStack.peekLast().returnType;
        
        if (value.getDataType() != functionDataType)
        {
            System.err.println("Error: returned expression doesn't" +
                " match the function's return data type");
            System.exit(1);
        }
        
        ST template = new ST(
            "<val_code>" +
            "ret <data_type> <val_register>\n"
        );
        template.add("val_code", value.toString());
        template.add("data_type", (functionDataType == DataType.INT) ? "i32" : "double");
        template.add("val_register", value.getRegister());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitAssign(PascriptParser.AssignContext ctx)
    {
        String varName = ctx.lvalue().getText();
        VariableRecord varRecord = this.variableTable.getVar(varName);
        
        if (varRecord == null)
        {
            System.err.println(String.format("Error: cannot assign value to a "
                + "variable '%s', which doesn't exist in the current scope", varName));
            System.exit(1);
        }
        
        CodeFragment value = this.visit(ctx.expression());
        if (value.getDataType() != varRecord.dataType)
        {
            System.err.println(String.format("Error: cannot assign an expression that "
                + "doesn't have a matching datatype to the variable '%s'", varName));
            System.exit(1);
        }
        
        ST template = new ST(
            "<value_code>" + 
            "store <data_type> <value_register>, <data_type>* <var_register>\n"
        );
        template.add("value_code", value.toString());
        template.add("data_type", (varRecord.dataType == DataType.INT) ? "i32" : "double");
        template.add("value_register", value.getRegister());
        template.add("var_register", varRecord.register);
        return new CodeFragment(template.render());
    }  
    
    */
    
}
