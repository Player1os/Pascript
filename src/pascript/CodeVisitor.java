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

    @Override
    public CodeFragment visit(ParseTree pt)
    {
        return ((pt == null) ? new CodeFragment() : super.visit(pt));
    }
    
    @Override
    protected CodeFragment aggregateResult(CodeFragment aggregate, CodeFragment nextResult)
    {
        if (aggregate == null)
        {
            return nextResult;
        }
        return aggregate;
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
        
        String externalFunctionCodeTemplateString = 
            "declare <return_data_type> <function_name>(<parameter_data_types>)\n";
        
        for (FunctionRecord externalFunctionRecord : this._symbolTable.getExternalFunctions())
        {
            StringBuilder parameterDataTypesCode = new StringBuilder();
            boolean firstParameter = true;
            for (DataType parameterDataType : externalFunctionRecord.getParameterDataTypes())
            {
                if (!firstParameter)
                {
                    parameterDataTypesCode.append(", ");
                }
                else
                {
                    firstParameter = false;
                }
                parameterDataTypesCode.append(parameterDataType.getOutputType());
            }
                        
            ST externalFunctionCodeTemplate = new ST(externalFunctionCodeTemplateString);
            externalFunctionCodeTemplate.add("return_data_type", externalFunctionRecord.getReturnDataType().getOutputType());
            externalFunctionCodeTemplate.add("function_name", externalFunctionRecord.getOutputFunctionName());
            externalFunctionCodeTemplate.add("parameter_data_types", parameterDataTypesCode.toString());
            externalFunctionsCodeFragment.addCode(externalFunctionCodeTemplate.render());
        }
        
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
        for (Map.Entry<String, ExpressionCodeFragment> globalVarableInitializer : this._symbolTable.getGlobalVarableInitializers().entrySet())
        {
            ExpressionCodeFragment expressionCodeFragment = globalVarableInitializer.getValue();
            
            ST globalVarableInitializerCodeTemplate = new ST(globalVarableInitializerCodeTemplateString);
            globalVarableInitializerCodeTemplate.add("value_code", expressionCodeFragment.toString());
            globalVarableInitializerCodeTemplate.add("value_register", expressionCodeFragment.getValueRegister());
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
        for (PascriptParser.ExternalFunctionDeclarationContext functionDeclarationCtx : ctx.externalFunctionDeclaration())
        {
            String functionName = functionDeclarationCtx.functionName.getText();
            DataType returnDataType = this._dataTypeVisitor.visit(functionDeclarationCtx.returnDataType());
            
            ArrayList<DataType> parameterDataTypes = new ArrayList<>();
            for (PascriptParser.DataTypeContext dataTypeContext : functionDeclarationCtx.parameterList().dataType())
            {
                parameterDataTypes.add(this._dataTypeVisitor.visit(dataTypeContext));
            }
            
            FunctionRecord functionRecord = this._symbolTable.addExternalFunction(functionName, returnDataType, parameterDataTypes);
            if (functionRecord == null)
            {
                Compiler.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
        }
        
        return new CodeFragment();
    }

    public CodeFragment processGlobalVariableDeclaration(Token nameToken, ValueDataType dataType, ExpressionCodeFragment expressionCodeFragment)
    {
        VariableRecord variableRecord = this._symbolTable.addGlobalVariable(nameToken.getText(), dataType);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A global variable with the same name already exists", nameToken);
            System.exit(-1);
        }
        
        this._symbolTable.addGlobalVariableInitializer(variableRecord.getMemoryRegister(), expressionCodeFragment);
        
        ST globalVariableCodeTemplate = new ST("<memory_register> = global <data_type> <value>\n");
        globalVariableCodeTemplate.add("memory_register", variableRecord.getMemoryRegister());
        globalVariableCodeTemplate.add("data_type", dataType.getOutputType());
        globalVariableCodeTemplate.add("value", dataType.getDefaultOutputValue());
        
        return new CodeFragment(globalVariableCodeTemplate.render());
    }

    @Override
    public CodeFragment visitSimpleGlobalDeclaration(PascriptParser.SimpleGlobalDeclarationContext ctx)
    {
        ValueDataType valueDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression(valueDataType);
        if (expressionCodeFragment == null)
        {
            Compiler.printCompilationError("An internal error occured while parsing the global variable's data type", ctx.dataType().getStart());
            System.exit(-2);
        }
        
        return this.processGlobalVariableDeclaration(ctx.IDENTIFIER().getSymbol(), valueDataType, expressionCodeFragment);
    }
    
    @Override
    public CodeFragment visitAssignGlobalDeclaration(PascriptParser.AssignGlobalDeclarationContext ctx)
    {
        ValueDataType valueDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.literal());
        if (!valueDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Attempting to assign an expression that evaluates to a non-matching data type", ctx.literal().getStart());
            System.exit(-1);
        }
        
        return this.processGlobalVariableDeclaration(ctx.IDENTIFIER().getSymbol(), valueDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitFunctionSection(PascriptParser.FunctionSectionContext ctx)
    {
        String functionHeaderTemplateString = 
            "define <return_data_type> <function_name>(<parameter_list>)\n" +
            "{\n" +
            "<start_label>:\n";
        String functionFooterTemplateString =
            "<return_value_code>" +
            "<dynamic_variable_deallocation_code>" +
            "ret <return_data_type_value>\n" +
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
                Compiler.printCompilationError("A function with the same name already exists", functionDeclarationCtx.functionName);
                System.exit(-1);
            }
            
            functionHeaderTemplate.add("return_data_type", returnDataType.getOutputType());
            functionHeaderTemplate.add("function_name", functionName);
            functionHeaderTemplate.add("parameter_list", parameterListString.toString());
            functionHeaderTemplate.add("start_label", this._symbolTable.generateNewLabelName());
            
            functionHeaders.add(functionHeaderTemplate.render());
            functionRecords.add(functionRecord);
            functionParameterNames.add(parameterNames);
            functionParameterRegisters.add(parameterRegisters);
        }
        
        CodeFragment codeFragment = new CodeFragment();
        
        String argumentToVariableTemplateString =
            "<variable_register> = alloca <data_type>\n" +
            "<dynammic_copy_allocation_code>" +
            "store <data_type> <parameter_register>, <data_type>* <variable_register>\n";
        String dynamicCopyAllocationTemplateString =
            "<value_register> = <copy_function_call>";
        String loadValueFromVariableTemplateString =
            "<value_register> = load <data_type>* <memory_register>\n";
        
        int functionCount = functionHeaders.size();
        for (int iFunction = 0; iFunction < functionCount; iFunction++)
        {
            FunctionRecord functionRecord = functionRecords.get(iFunction);
            DataType functionReturnDataType = functionRecord.getReturnDataType();
            this._symbolTable.enterFunction(functionReturnDataType, false);
            
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
                    Compiler.printCompilationError("A parameter with the same name already exists", identifierToken);
                    System.exit(-1);
                }
                
                ST argumentToVariableTemplate = new ST(argumentToVariableTemplateString);
                argumentToVariableTemplate.add("variable_register", parameterVariableRecord.getMemoryRegister());
                argumentToVariableTemplate.add("data_type", parameterDataType.getOutputType());
                
                if (parameterDataType instanceof DynamicDataType)
                {
                    DynamicDataType parameterDynamicDataType = (DynamicDataType)parameterDataType;
                    String valueRegister = this._symbolTable.generateNewRegisterName();
                    
                    ST dynamicCopyAllocationTemplate = new ST(dynamicCopyAllocationTemplateString);
                    dynamicCopyAllocationTemplate.add("value_register", valueRegister);
                    dynamicCopyAllocationTemplate.add("data_type", parameterDataType.getOutputType());
                    dynamicCopyAllocationTemplate.add("copy_function_name", parameterDynamicDataType.getCopyFunctionCall(parameterRegisters.get(iParameter)));
                    
                    argumentToVariableTemplate.add("dynammic_copy_allocation_code", dynamicCopyAllocationTemplate.render());
                    argumentToVariableTemplate.add("parameter_register", valueRegister);
                }
                else
                {
                    argumentToVariableTemplate.add("dynammic_copy_allocation_code", "");
                    argumentToVariableTemplate.add("parameter_register", parameterRegisters.get(iParameter));
                }
                
                argumentAllocationCodeString.append(argumentToVariableTemplate.render());
            }
            
            CodeFragment functionDefinitionCodeFragment = this.visit(ctx.functionDefinition(iFunction).blockStatement());
            
            ST functionFooterTemplate = new ST(functionFooterTemplateString);
            
            StringBuilder dynamicVariableDeallocationCode = new StringBuilder();
            for (VariableRecord variableRecord : this._symbolTable.getFunctionDynamicVariableRecords())
            {
                String valueRegister = this._symbolTable.generateNewRegisterName();
                
                ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
                loadValueFromVariableTemplate.add("value_register", valueRegister);
                loadValueFromVariableTemplate.add("data_type", variableRecord.getDataType().getOutputType());
                loadValueFromVariableTemplate.add("memory_register", variableRecord.getMemoryRegister());
                dynamicVariableDeallocationCode.append(loadValueFromVariableTemplate.render());
                
                DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
                dynamicVariableDeallocationCode.append(dynamicDataType.getDeallocationFunctionCall(valueRegister));
            }
            functionFooterTemplate.add("dynamic_variable_deallocation_code", dynamicVariableDeallocationCode.toString());
            
            VoidDataType voidDataType = new VoidDataType();
            if (functionReturnDataType.equals(voidDataType))
            {
                functionFooterTemplate.add("return_value_code", "");
                functionFooterTemplate.add("return_data_type_value", voidDataType.getOutputType());
            }
            else
            {
                ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression((ValueDataType)functionReturnDataType);
                if (expressionCodeFragment == null)
                {
                    Compiler.printCompilationError("An internal error occured while parsing the function's return data type",
                        ctx.functionDeclaration(iFunction).returnDataType().getStart());
                    System.exit(-2);
                }
                
                functionFooterTemplate.add("return_value_code", expressionCodeFragment.toString());
                functionFooterTemplate.add("return_data_type_value",
                    functionReturnDataType.getOutputType() + " " + expressionCodeFragment.getValueRegister());
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
        this._symbolTable.enterFunction(new IntegerDataType(), true);
        
        CodeFragment codeFragment = new CodeFragment();
        for (PascriptParser.StatementContext statement : ctx.statement())
        {
            codeFragment.addCode(this.visit(statement).toString());
        }
        
        String loadValueFromVariableTemplateString =
            "<value_register> = load <data_type>* <memory_register>\n";
        
        for (VariableRecord variableRecord : this._symbolTable.getFunctionDynamicVariableRecords())
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
            loadValueFromVariableTemplate.add("value_register", valueRegister);
            loadValueFromVariableTemplate.add("data_type", variableRecord.getDataType().getOutputType());
            loadValueFromVariableTemplate.add("memory_register", variableRecord.getMemoryRegister());
            codeFragment.addCode(loadValueFromVariableTemplate.render());
            
            DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
            codeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(valueRegister));
        }
        for (VariableRecord globalVariableRecord : this._symbolTable.getGlobalDynamicVariableRecords())
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
            loadValueFromVariableTemplate.add("value_register", valueRegister);
            loadValueFromVariableTemplate.add("data_type", globalVariableRecord.getDataType().getOutputType());
            loadValueFromVariableTemplate.add("memory_register", globalVariableRecord.getMemoryRegister());
            codeFragment.addCode(loadValueFromVariableTemplate.render());
            
            DynamicDataType dynamicDataType = (DynamicDataType)globalVariableRecord.getDataType();
            codeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(valueRegister));
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
        
        String loadValueFromVariableTemplateString =
            "<value_register> = load <data_type>* <memory_register>\n";
        
        for (VariableRecord variableRecord : this._symbolTable.getBlockDynamicVariableRecords())
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
            loadValueFromVariableTemplate.add("value_register", valueRegister);
            loadValueFromVariableTemplate.add("data_type", variableRecord.getDataType().getOutputType());
            loadValueFromVariableTemplate.add("memory_register", variableRecord.getMemoryRegister());
            codeFragment.addCode(loadValueFromVariableTemplate.render());
            
            DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
            codeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(valueRegister));
        }
        
        this._symbolTable.exitBlock();
        return codeFragment;
    }

    @Override
    public CodeFragment visitIfStatement(PascriptParser.IfStatementContext ctx)
    {
        String templateCommonPrefix = 
            "<condition_code>" +
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<true_label>, label %<false_label>\n" +
            "<true_label>:\n" +
            "<statement_true_code>" +
            "br label %<end_label>\n";
        String templateElseBody =
            "<false_label>:\n" +
            "<statement_false_code>" +
            "br label %<end_label>\n";
        String templateCommonSuffix = 
            "<end_label>:\n";
        
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(new BooleanDataType()))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
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
        
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", (new BooleanDataType()).getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
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
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(new BooleanDataType()))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", (new BooleanDataType()).getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
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
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(new BooleanDataType()))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", (new BooleanDataType()).getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
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
            "<break_register> = trunc <boolean_data_type> <condition_register> to i1\n" +
            "br i1 <break_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +
            "<step_code>" +
            "<step_dynamic_value_deallocation_code>" +
            "br label %<condition_label>\n" +
            "<end_label>:\n"
        );
        
        ExpressionCodeFragment conditionCodeFragment = this._expressionCodeVisitor.visit(ctx.condition);
        if (!conditionCodeFragment.getDataType().equals(new BooleanDataType()))
        {
            Compiler.printCompilationError("The condition expression must evaluate to a boolean data type", ctx.condition.getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment stepCodeFragment = this._expressionCodeVisitor.visit(ctx.step);
        
        template.add("initializer_code", this.visit(ctx.initializer).toString());
        template.add("condition_label", this._symbolTable.generateNewLabelName());
        template.add("break_register", this._symbolTable.generateNewRegisterName());
        template.add("boolean_data_type", (new BooleanDataType()).getOutputType());
        template.add("condition_code", conditionCodeFragment.toString());
        template.add("condition_register", conditionCodeFragment.getValueRegister());
        template.add("body_label", this._symbolTable.generateNewLabelName());
        template.add("body_code", this.visit(ctx.statement()).toString());
        template.add("step_code", stepCodeFragment.toString());
        template.add("end_label", this._symbolTable.generateNewLabelName());
        
        DataType stepDataType = stepCodeFragment.getDataType();
        if (stepDataType instanceof DynamicDataType)
        {
            DynamicDataType stepDynamicDataType = (DynamicDataType)stepDataType;
            template.add("step_dynamic_value_deallocation_code",
                stepDynamicDataType.getDeallocationFunctionCall(stepCodeFragment.getValueRegister()));
        }
        else
        {
            template.add("step_dynamic_value_deallocation_code", "");
        }
                
        return new CodeFragment(template.render());
    }
    
    public CodeFragment processVariableDeclaration(Token nameToken, ValueDataType dataType, ExpressionCodeFragment expressionCodeFragment)
    {
        VariableRecord variableRecord = this._symbolTable.addLocalVariable(nameToken.getText(), dataType);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A local variable with the same name already exists in the current block", nameToken);
            System.exit(-1);
        }
        
        this._symbolTable.addGlobalVariableInitializer(variableRecord.getMemoryRegister(), expressionCodeFragment);
        
        ST localVariableCodeTemplate = new ST(
            "<value_code>" +
            "<variable_register> = alloca <data_type>\n" +
            "store <data_type> <value_register>, <data_type>* <variable_register>\n"
        );
        
        localVariableCodeTemplate.add("value_code", expressionCodeFragment.toString());
        localVariableCodeTemplate.add("variable_register", variableRecord.getMemoryRegister());
        localVariableCodeTemplate.add("data_type", dataType.getOutputType());
        localVariableCodeTemplate.add("value_register", expressionCodeFragment.getValueRegister());
        
        return new CodeFragment(localVariableCodeTemplate.render());
    }

    @Override
    public CodeFragment visitSimpleDeclaration(PascriptParser.SimpleDeclarationContext ctx)
    {
        ValueDataType variableDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.getDefaultExpression(variableDataType);
        if (expressionCodeFragment == null)
        {
            Compiler.printCompilationError("An internal error occured while parsing the variable's data type", ctx.dataType().getStart());
            System.exit(-2);
        }
                
        return this.processVariableDeclaration(ctx.IDENTIFIER().getSymbol(), variableDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitAssignDeclaration(PascriptParser.AssignDeclarationContext ctx)
    {
        ValueDataType variableDataType = (ValueDataType)this._dataTypeVisitor.visit(ctx.dataType());
        
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        if (!variableDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Attempting to assign an expression that evaluates to a non-matching data type", ctx.expression().getStart());
            System.exit(-1);
        }
                
        return this.processVariableDeclaration(ctx.IDENTIFIER().getSymbol(), variableDataType, expressionCodeFragment);
    }

    @Override
    public CodeFragment visitPrintStatement(PascriptParser.PrintStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        DataType dataType = expressionCodeFragment.getDataType();
        if (!(dataType instanceof PrimitiveDataType))
        {
            Compiler.printCompilationError("Can only print an expression that evaluates to a primitive data types", ctx.expression().getStart());
            System.exit(-1);
        }
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)dataType;
        
        ST template = new ST(
            "<value_code>" + 
            "call void @<function_name>(<data_type> <value_register>)\n" +
            "<value_deallocation_code>"
        );
        String valueRegister = expressionCodeFragment.getValueRegister();
        template.add("value_code", expressionCodeFragment.toString());
        template.add("value_register", valueRegister);
        template.add("function_name", primitiveDataType.getOutputPrintFunction());
        template.add("data_type", dataType.getOutputType());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            template.add("value_deallocation_code", dynamicDataType.getDeallocationFunctionCall(valueRegister));
        }
        else
        {
            template.add("value_deallocation_code", "");
        }
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReadStatement(PascriptParser.ReadStatementContext ctx)
    {
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(ctx.IDENTIFIER().getText());
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A variable with this name does not exist", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        DataType dataType = variableRecord.getDataType();
        if (!(dataType instanceof PrimitiveDataType))
        {
            Compiler.printCompilationError("Can only read to a variable with a primitive data type", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)dataType;
        
        ST template = new ST(
            "<value_deallocation_code>" +
            "<value_register> = call <data_type> @<function_name>()\n" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        template.add("value_register", this._symbolTable.generateNewRegisterName());
        template.add("data_type", dataType.getOutputType());
        template.add("function_name", primitiveDataType.getOutputReadFunction());
        template.add("memory_register", variableRecord.getMemoryRegister());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            
            ST valueDeallocationtemplate = new ST(
                "<value_register> = load <data_type>* <memory_register>\n" +
                "<value_deallocation_code>"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            valueDeallocationtemplate.add("value_register", valueRegister);
            valueDeallocationtemplate.add("data_type", dataType.getOutputType());
            valueDeallocationtemplate.add("memory_register", variableRecord.getMemoryRegister());
            valueDeallocationtemplate.add("value_deallocation_code", dynamicDataType.getDeallocationFunctionCall(valueRegister));
            
            template.add("value_deallocation_code", valueDeallocationtemplate.render());
        }
        else
        {
            template.add("value_deallocation_code", "");
        }
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitDeleteStatement(PascriptParser.DeleteStatementContext ctx)
    {
        VariableRecord variableRecord = this._symbolTable.removeVariableRecord(ctx.IDENTIFIER().getText());
        if (variableRecord == null)
        {
            Compiler.printCompilationError("A local variable with this name does not exist", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        DataType dataType = variableRecord.getDataType();
        CodeFragment codeFragment = new CodeFragment();
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            
            ST valueDeallocationtemplate = new ST(
                "<value_register> = load <data_type>* <memory_register>\n" +
                "<value_deallocation_code>"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            valueDeallocationtemplate.add("value_register", valueRegister);
            valueDeallocationtemplate.add("data_type", dataType.getOutputType());
            valueDeallocationtemplate.add("memory_register", variableRecord.getMemoryRegister());
            valueDeallocationtemplate.add("value_deallocation_code", dynamicDataType.getDeallocationFunctionCall(valueRegister));
            
            codeFragment.addCode(valueDeallocationtemplate.render());
        }
        
        return codeFragment;
    }

    @Override
    public CodeFragment visitReturnValueStatement(PascriptParser.ReturnValueStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        DataType functionReturnDataType = this._symbolTable.getCurrentFunctionReturnDataType();
        
        if (!functionReturnDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Returned expression evaluates to a data type"
                + " that doesn't match the function's return data type", ctx.expression().getStart());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_code>" +
            "<dynamic_variable_deallocation_code>" +
            "ret <data_type> <value_register>\n"
        );
        template.add("value_code", expressionCodeFragment.toString());
        template.add("data_type", functionReturnDataType.getOutputType());
        template.add("value_register", expressionCodeFragment.getValueRegister());
        
        String loadValueFromVariableTemplateString =
            "<value_register> = load <data_type>* <memory_register>\n";
        
        StringBuilder dynamicVariableDeallocationCode = new StringBuilder();
        for (VariableRecord variableRecord : this._symbolTable.getFunctionDynamicVariableRecords())
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
            loadValueFromVariableTemplate.add("value_register", valueRegister);
            loadValueFromVariableTemplate.add("data_type", variableRecord.getDataType().getOutputType());
            loadValueFromVariableTemplate.add("memory_register", variableRecord.getMemoryRegister());
            dynamicVariableDeallocationCode.append(loadValueFromVariableTemplate.render());
            
            DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
            dynamicVariableDeallocationCode.append(dynamicDataType.getDeallocationFunctionCall(valueRegister));
        }
        if (this._symbolTable.isCurrentFunctionMain())
        {
            for (VariableRecord globalVariableRecord : this._symbolTable.getGlobalDynamicVariableRecords())
            {
                String valueRegister = this._symbolTable.generateNewRegisterName();

                ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
                loadValueFromVariableTemplate.add("value_register", valueRegister);
                loadValueFromVariableTemplate.add("data_type", globalVariableRecord.getDataType().getOutputType());
                loadValueFromVariableTemplate.add("memory_register", globalVariableRecord.getMemoryRegister());
                dynamicVariableDeallocationCode.append(loadValueFromVariableTemplate.render());

                DynamicDataType dynamicDataType = (DynamicDataType)globalVariableRecord.getDataType();
                dynamicVariableDeallocationCode.append(dynamicDataType.getDeallocationFunctionCall(valueRegister));
            }
        }
        template.add("dynamic_variable_deallocation_code", dynamicVariableDeallocationCode.toString());
        
        return new CodeFragment(template.render());
    }

    @Override
    public CodeFragment visitReturnVoidStatement(PascriptParser.ReturnVoidStatementContext ctx)
    {
        VoidDataType voidDataType = new VoidDataType();
        if (!voidDataType.equals(this._symbolTable.getCurrentFunctionReturnDataType()))
        {
            Compiler.printCompilationError("The function has a non-void return data type", ctx.getStart());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<dynamic_variable_deallocation_code>" +
            "ret <data_type>\n"
        );
        template.add("data_type", voidDataType.getOutputType());
        
        String loadValueFromVariableTemplateString =
            "<value_register> = load <data_type>* <memory_register>\n";
        
        StringBuilder dynamicVariableDeallocationCode = new StringBuilder();
        for (VariableRecord variableRecord : this._symbolTable.getFunctionDynamicVariableRecords())
        {
            String valueRegister = this._symbolTable.generateNewRegisterName();
            
            ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
            loadValueFromVariableTemplate.add("value_register", valueRegister);
            loadValueFromVariableTemplate.add("data_type", variableRecord.getDataType().getOutputType());
            loadValueFromVariableTemplate.add("memory_register", variableRecord.getMemoryRegister());
            dynamicVariableDeallocationCode.append(loadValueFromVariableTemplate.render());
            
            DynamicDataType dynamicDataType = (DynamicDataType)variableRecord.getDataType();
            dynamicVariableDeallocationCode.append(dynamicDataType.getDeallocationFunctionCall(valueRegister));
        }
        if (this._symbolTable.isCurrentFunctionMain())
        {
            for (VariableRecord globalVariableRecord : this._symbolTable.getGlobalDynamicVariableRecords())
            {
                String valueRegister = this._symbolTable.generateNewRegisterName();

                ST loadValueFromVariableTemplate = new ST(loadValueFromVariableTemplateString);
                loadValueFromVariableTemplate.add("value_register", valueRegister);
                loadValueFromVariableTemplate.add("data_type", globalVariableRecord.getDataType().getOutputType());
                loadValueFromVariableTemplate.add("memory_register", globalVariableRecord.getMemoryRegister());
                dynamicVariableDeallocationCode.append(loadValueFromVariableTemplate.render());

                DynamicDataType dynamicDataType = (DynamicDataType)globalVariableRecord.getDataType();
                dynamicVariableDeallocationCode.append(dynamicDataType.getDeallocationFunctionCall(valueRegister));
            }
        }
        template.add("dynamic_variable_deallocation_code", dynamicVariableDeallocationCode.toString());
        
        return new CodeFragment("ret " + (new VoidDataType()).getOutputType() + "\n");
    }

    @Override
    public CodeFragment visitExpressionStatement(PascriptParser.ExpressionStatementContext ctx)
    {
        ExpressionCodeFragment expressionCodeFragment = this._expressionCodeVisitor.visit(ctx.expression());
        
        ST template = new ST(
            "<value_code>" +
            "<dynamic_value_deallocation_code>"
        );
        template.add("value_code", expressionCodeFragment.toString());
        
        DataType dataType = expressionCodeFragment.getDataType();        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            template.add("dynamic_value_deallocation_code", dynamicDataType.getDeallocationFunctionCall(expressionCodeFragment.getValueRegister()));
        }
        else
        {
            template.add("dynamic_value_deallocation_code", "");
        }
        
        
        
        return new CodeFragment(template.toString());
    }
}