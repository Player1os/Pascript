package pascript;

import java.util.Arrays;
import java.util.ArrayList;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptParser;
import pascript.grammar.PascriptBaseVisitor;
import pascript.SymbolTable.*;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.ExpressionCodeFragment;

/**
 *
 * @author Osama Hassanein
 */
public class ExpressionCodeVisitor extends PascriptBaseVisitor<ExpressionCodeVisitor.ExpressionCodeFragment>
{
    public static class ExpressionCodeFragment extends CodeVisitor.CodeFragment
    {
        protected String _valueRegister;
        protected DataType _dataType;
        
        public ExpressionCodeFragment()
        {
            super();
        }

        public ExpressionCodeFragment(String codeString)
        {
            super();
            this._code.append(codeString);
        }

        public String getValueRegister()
        {
            return this._valueRegister;
        }

        public ExpressionCodeFragment setRegister(String valueRegister)
        {
            this._valueRegister = valueRegister;
            return this;
        }

        public DataType getDataType()
        {
            return this._dataType;
        }

        public ExpressionCodeFragment setDataType(DataType dataType)
        {
            this._dataType = dataType;
            return this;
        }
    }
    
    private final SymbolTable _symbolTable;
    
    public ExpressionCodeVisitor(SymbolTable symbolTable)
    {
        this._symbolTable = symbolTable;
    }
    
    public ExpressionCodeFragment getDefaultExpression(ValueDataType valueDataType)
    {
        if (valueDataType instanceof BooleanDataType)
        {
            ST template = new ST(
                "<value_register> = zext i1 false to i8\n"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            template.add("value_register", valueRegister);
            
            ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
            return expressionCodeFragment.setDataType(new BooleanDataType()).setRegister(valueRegister);
        }
        else if (valueDataType instanceof IntegerDataType)
        {
            ST template = new ST(
                "<value_register> = add i32 0, 0\n"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            template.add("value_register", valueRegister);
            
            ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
            return expressionCodeFragment.setDataType(new IntegerDataType()).setRegister(valueRegister);
        }
        else if (valueDataType instanceof FloatDataType)
        {
            ST template = new ST(
                "<value_register> = fadd double 0., 0.\n"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            template.add("value_register", valueRegister);
            
            ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
            return expressionCodeFragment.setDataType(new FloatDataType()).setRegister(valueRegister);
        }
        else if (valueDataType instanceof StringDataType)
        {
            ST template = new ST(
                "<value_register> = call i8* @__pascript__stringAllocate()\n"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            template.add("value_register", valueRegister);
            
            ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
            return expressionCodeFragment.setDataType(new StringDataType()).setRegister(valueRegister);
        }
        else if (valueDataType instanceof ArrayDataType)
        {
            ArrayDataType arrayDataType = (ArrayDataType)valueDataType;
            
            ST template = new ST(
                "<value_register> = call i32* <function_name>(i32 <dimension_count>)\n"
            );
            String valueRegister = this._symbolTable.generateNewRegisterName();
            template.add("value_register", valueRegister);
            template.add("function_name", arrayDataType.getAllocationFunctionName());
            template.add("dimension_count", Integer.toString(arrayDataType.getDimensionCount()));
            
            ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
            return expressionCodeFragment.setDataType(new StringDataType()).setRegister(valueRegister);
        }
        return null;
    }
    
    private ST processBooleanUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = (new BooleanDataType()).getOutputType();
        switch (operatorId)
        {
            case PascriptParser.NOT:
            {
                resultCodeFragment.setDataType(new BooleanDataType());
                ST template = new ST(
                    "<register_1> = icmp eq <data_type> 0, <operand_register>\n" +
                    "<value_register> = zext i1 <register_1> to <data_type>\n"
                );
                template.add("register_1", this._symbolTable.generateNewRegisterName());
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    private ST processIntegerUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = (new IntegerDataType()).getOutputType();
        switch (operatorId)
        {
            case PascriptParser.SUBTRACT:
            {
                resultCodeFragment.setDataType(new IntegerDataType());
                ST template = new ST(
                    "<value_register> = sub <data_type> 0, <operand_register>\n"
                );
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    private ST processFloatUnaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        String ouputDataType = (new FloatDataType()).getOutputType();
        switch (operatorId)
        {
            case PascriptParser.SUBTRACT:
            {
                resultCodeFragment.setDataType(new FloatDataType());
                ST template = new ST(
                    "<value_register> = fsub <data_type> 0., <operand_register>\n"
                );
                return template.add("data_type", ouputDataType);
            }
        }
        return null;
    }
    
    @Override
    public ExpressionCodeFragment visitUnaryOperation(PascriptParser.UnaryOperationContext ctx)
    {
        ExpressionCodeFragment operatorCodeFragment = this.visit(ctx.expression());
        DataType dataType = operatorCodeFragment.getDataType();
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment(operatorCodeFragment.toString());
        
        ST template = null;
        int operatorId = ctx.operator.getType();
        if (dataType instanceof BooleanDataType)
        {
            template = this.processBooleanUnaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof IntegerDataType)
        {
            template = this.processIntegerUnaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof FloatDataType)
        {
            template = this.processFloatUnaryOperator(resultCodeFragment, operatorId);
        }
        
        if (template == null)
        {
            Compiler.printCompilationError("Cannot apply this unary operation to an operand"
                + " of the given data type", ctx.expression().getStart());
            System.exit(-1);
        }
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        String operatorRegister = operatorCodeFragment.getValueRegister();
        template.add("operator_register", operatorRegister);
        template.add("value_register", valueRegister);
        resultCodeFragment.addCode(template.toString());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            resultCodeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(operatorRegister));
        }
        
        return resultCodeFragment.setRegister(valueRegister);
    }
    
    private ST processBooleanBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        BooleanDataType booleanDataType = new BooleanDataType();
        String ouputDataType = booleanDataType.getOutputType();
        resultCodeFragment.setDataType(booleanDataType);
        
        if (Arrays.asList(PascriptParser.AND, PascriptParser.OR, PascriptParser.XOR).indexOf(operatorId) != -1)
        {
            ST template = new ST(
                "<register_1> = trunc <data_type> <operand_a_register> to i1\n" +
                "<register_2> = trunc <data_type> <operand_b_register> to i1\n" +
                "<register_3> = <instruction> i1 <register_1>, <register_2>\n" +
                "<value_register> = zext i1 <register_3> to <data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.AND:
                    template.add("instruction", "and");
                    break;
                case PascriptParser.OR:
                    template.add("instruction", "or");
                    break;
                case PascriptParser.XOR:
                    template.add("instruction", "xor");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("register_3", this._symbolTable.generateNewRegisterName());
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            ST template = new ST(
                "<register_1> = icmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "neq");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processIntegerBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        IntegerDataType integerDataType = new IntegerDataType();
        String ouputDataType = integerDataType.getOutputType();
        
        if (Arrays.asList(PascriptParser.MULTIPLY, PascriptParser.DIVIDE, PascriptParser.MODULO,
            PascriptParser.ADD, PascriptParser.SUBTRACT).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(integerDataType);
            ST template = new ST(
                "<value_register> = <instruction> <data_type> <operand_a_register>, <operand_b_register>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.MULTIPLY:
                    template.add("instruction", "mul");
                    break;
                case PascriptParser.DIVIDE:
                    template.add("instruction", "sdiv");
                    break;
                case PascriptParser.MODULO:
                    template.add("instruction", "srem");
                    break;
                case PascriptParser.ADD:
                    template.add("instruction", "add");
                    break;
                case PascriptParser.SUBTRACT:
                    template.add("instruction", "sub");
                    break;
            }
            
            return template.add("data_type", integerDataType.getOutputType());
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            BooleanDataType booleanDataType = new BooleanDataType();
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = icmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "slt");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "sgt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "sle");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "sge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "neq");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processFloatBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        FloatDataType floatDataType = new FloatDataType();
        String ouputDataType = floatDataType.getOutputType();
        
        if (Arrays.asList(PascriptParser.MULTIPLY, PascriptParser.DIVIDE, PascriptParser.MODULO,
            PascriptParser.ADD, PascriptParser.SUBTRACT).indexOf(operatorId) != -1)
        {
            resultCodeFragment.setDataType(floatDataType);
            ST template = new ST(
                "<value_register> = <instruction> <data_type> <operand_a_register>, <operand_b_register>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.MULTIPLY:
                    template.add("instruction", "fmul");
                    break;
                case PascriptParser.DIVIDE:
                    template.add("instruction", "fdiv");
                    break;
                case PascriptParser.MODULO:
                    template.add("instruction", "frem");
                    break;
                case PascriptParser.ADD:
                    template.add("instruction", "fadd");
                    break;
                case PascriptParser.SUBTRACT:
                    template.add("instruction", "fsub");
                    break;
            }
            
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            BooleanDataType booleanDataType = new BooleanDataType();
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = fcmp <comparison_type> <data_type> <operand_a_register>, <operand_b_register>\n" +
                "<value_register> = zext i1 <register_1> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "ult");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "ugt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "ule");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "uge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "ueq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "une");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
        
    private ST processStringBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId)
    {
        StringDataType stringDataType = new StringDataType();
        String ouputDataType = stringDataType.getOutputType();
        
        if (operatorId == PascriptParser.ADD)
        {
            resultCodeFragment.setDataType(stringDataType);
            ST template = new ST(
                "<value_register> = call <data_type> @__pascript__stringConcatenate" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n"
            );
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.LESS, PascriptParser.GREATER, PascriptParser.LESS_OR_EQUAL,
            PascriptParser.GREATER_OR_EQUAL, PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            BooleanDataType booleanDataType = new BooleanDataType();
            resultCodeFragment.setDataType(booleanDataType);
            ST template = new ST(
                "<register_1> = call <integer_data_type> @__pascript__stringCompare" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n" +
                "<register_2> = icmp <comparison_type> <integer_data_type> <register_1>, 0\n" +
                "<value_register> = zext i1 <register_2> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.LESS:
                    template.add("comparison_type", "slt");
                    break;
                case PascriptParser.GREATER:
                    template.add("comparison_type", "sgt");
                    break;
                case PascriptParser.LESS_OR_EQUAL:
                    template.add("comparison_type", "sle");
                    break;
                case PascriptParser.GREATER_OR_EQUAL:
                    template.add("comparison_type", "sge");
                    break;
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "eq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "neq");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            template.add("integer_data_type", (new IntegerDataType()).getOutputType());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    private ST processArrayBinaryOperator(ExpressionCodeFragment resultCodeFragment, int operatorId, ArrayDataType operatorDataType)
    {
        String ouputDataType = operatorDataType.getOutputType();
        
        if (operatorId == PascriptParser.ADD)
        {
            resultCodeFragment.setDataType(operatorDataType);
            ST template = new ST(
                "<value_register> = call <data_type> @__pascript__<primitive_data_type_name>ArrayMerge" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n"
            );
            template.add("primitive_data_type_name", operatorDataType.getPrimitiveDataTypeName());
            return template.add("data_type", ouputDataType);
        }
        else if (Arrays.asList(PascriptParser.EQUAL, PascriptParser.NOT_EQUAL).indexOf(operatorId) != -1)
        {
            BooleanDataType booleanDataType = new BooleanDataType();
            resultCodeFragment.setDataType(booleanDataType);
            
            ST template = new ST(
                "<register_1> = call <boolean_data_type> @__pascript__<primitive_data_type_name>ArrayEquals" +
                    "(<data_type> <operand_a_register>, <data_type> <operand_b_register>)\n" +
                "<register_2> = icmp <comparison_type> <boolean_data_type> <register_1>, 0\n" +
                "<value_register> = zext i1 <register_2> to <boolean_data_type>\n"
            );
            
            switch (operatorId)
            {
                case PascriptParser.EQUAL:
                    template.add("comparison_type", "neq");
                    break;
                case PascriptParser.NOT_EQUAL:
                    template.add("comparison_type", "eq");
                    break;
            }
            
            template.add("register_1", this._symbolTable.generateNewRegisterName());
            template.add("register_2", this._symbolTable.generateNewRegisterName());
            template.add("boolean_data_type", booleanDataType.getOutputType());
            template.add("primitive_data_type_name", operatorDataType.getPrimitiveDataTypeName());
            return template.add("data_type", ouputDataType);
        }
        return null;
    }
    
    @Override
    public ExpressionCodeFragment visitBinaryOperation(PascriptParser.BinaryOperationContext ctx)
    {
        ExpressionCodeFragment operatorACodeFragment = this.visit(ctx.expression(0));
        DataType dataType = operatorACodeFragment.getDataType();
        ExpressionCodeFragment operatorBCodeFragment = this.visit(ctx.expression(1));
        if (!dataType.equals(operatorBCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Cannot apply a binary operation to operands"
                + " of different data types", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();
        resultCodeFragment.addCode(operatorACodeFragment.toString());
        resultCodeFragment.addCode(operatorBCodeFragment.toString());
        
        ST template = null;
        int operatorId = ctx.operator.getType();
        if (dataType instanceof BooleanDataType)
        {
            template = this.processBooleanBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof IntegerDataType)
        {
            template = this.processIntegerBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof FloatDataType)
        {
            template = this.processFloatBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof StringDataType)
        {
            template = this.processStringBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof ArrayDataType)
        {
            template = this.processArrayBinaryOperator(resultCodeFragment, operatorId, (ArrayDataType)dataType);
        }
        
        if (template == null)
        {
            Compiler.printCompilationError("Cannot apply this binary operation to operands"
                + " of the given data type", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        String operatorARegister = operatorACodeFragment.getValueRegister();
        String operatorBRegister = operatorBCodeFragment.getValueRegister();
        template.add("operator_a_register", operatorARegister);
        template.add("operator_b_register", operatorBRegister);
        template.add("value_register", valueRegister);
        resultCodeFragment.addCode(template.toString());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            resultCodeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(operatorARegister));
            resultCodeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(operatorBRegister));
        }
        
        return resultCodeFragment.setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitFunctionCall(PascriptParser.FunctionCallContext ctx)
    {
        String functionName = ctx.functionName.getText();
        
        FunctionRecord functionRecord = this._symbolTable.getFunctionRecord(functionName);
        if (functionRecord == null)
        {
            Compiler.printCompilationError("No function with this name exists", ctx.functionName);
            System.exit(-1);
        }
        
        ArrayList<DataType> parameterDataTypes = functionRecord.getParameterDataTypes();
        int argumentCount = parameterDataTypes.size();
        
        PascriptParser.ArgumentListContext argumentListCtx = ctx.argumentList();
        if ((argumentListCtx == null) || (argumentCount > 0))
        {
            Compiler.printCompilationError("The function should be called with no arguments", ctx.PAREN_OPEN().getSymbol());
            System.exit(-1);
        }
        else if (argumentListCtx.expression().size() != argumentCount)
        {
            Compiler.printCompilationError("The function is being called with an incorrect number of arguments", argumentListCtx.getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment();
        StringBuilder argumentList = new StringBuilder();
        StringBuilder dynamicArgumentDeallocationCode = new StringBuilder();
        for (int i = 0; i < argumentCount; i++)
        {
            if (i > 0)
            {
                argumentList.append(", ");
            }
            
            ExpressionCodeFragment argumentCodeFragment = this.visit(argumentListCtx.expression(i));
            expressionCodeFragment.addCode(argumentCodeFragment.toString());
            
            String argumentValueRegister = argumentCodeFragment.getValueRegister();
            DataType argumentDataType = argumentCodeFragment.getDataType();
            
            if (!parameterDataTypes.get(i).equals(argumentDataType))
            {
                Compiler.printCompilationError("Error: the function '%s' was called" +
                    " with an incorrect data type in argument %d", argumentListCtx.expression(i).getStart());
                System.exit(-1);
            }
            
            if (argumentDataType instanceof DynamicDataType)
            {
                DynamicDataType dynamicArgumentDataType = (DynamicDataType)argumentDataType;
                dynamicArgumentDeallocationCode.append(dynamicArgumentDataType.getDeallocationFunctionCall(argumentValueRegister));
            }
            
            argumentList.append(argumentDataType.getOutputType()).append(" ").append(argumentValueRegister);
        }

        ST template = new ST(
            "<value_register> = call <return_data_type> @<function_name>(<argument_list>)\n" +
            "<dynamic_argument_deallocation_code>"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        DataType returnDataType = functionRecord.getReturnDataType();
        template.add("return_data_type", returnDataType.getOutputType());
        template.add("value_register", valueRegister);
        template.add("function_name", functionRecord.getOutputFunctionName());
        template.add("argument_list", argumentList.toString());
        template.add("dynamic_argument_deallocation_code", dynamicArgumentDeallocationCode.toString());
        
        expressionCodeFragment.addCode(template.render());
        return expressionCodeFragment.setRegister(valueRegister).setDataType(returnDataType);
    }
    /*
    @Override
    public ExpressionCodeFragment visitMethodCall(PascriptParser.MethodCallContext ctx)
    {
        ExpressionCodeFragment operatorACodeFragment = this.visit(ctx.expression(0));
        DataType dataType = operatorACodeFragment.getDataType();
        ExpressionCodeFragment operatorBCodeFragment = this.visit(ctx.expression(1));
        if (!dataType.equals(operatorBCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("Cannot apply a binary operation to operands"
                + " of different data types", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment();
        resultCodeFragment.addCode(operatorACodeFragment.toString());
        resultCodeFragment.addCode(operatorBCodeFragment.toString());
        
        ST template = null;
        int operatorId = ctx.operator.getType();
        if (dataType instanceof BooleanDataType)
        {
            template = this.processBooleanBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof IntegerDataType)
        {
            template = this.processIntegerBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof FloatDataType)
        {
            template = this.processFloatBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof StringDataType)
        {
            template = this.processStringBinaryOperator(resultCodeFragment, operatorId);
        }
        else if (dataType instanceof ArrayDataType)
        {
            template = this.processArrayBinaryOperator(resultCodeFragment, operatorId, (ArrayDataType)dataType);
        }
        
        if (template == null)
        {
            Compiler.printCompilationError("Cannot apply this binary operation to operands"
                + " of the given data type", ctx.expression(0).getStart());
            System.exit(-1);
        }
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        String operatorARegister = operatorACodeFragment.getValueRegister();
        String operatorBRegister = operatorBCodeFragment.getValueRegister();
        template.add("operator_a_register", operatorARegister);
        template.add("operator_b_register", operatorBRegister);
        template.add("value_register", valueRegister);
        resultCodeFragment.addCode(template.toString());
        
        if (dataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicDataType = (DynamicDataType)dataType;
            resultCodeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(operatorARegister));
            resultCodeFragment.addCode(dynamicDataType.getDeallocationFunctionCall(operatorBRegister));
        }
        
        return resultCodeFragment.setRegister(valueRegister);
    }
    */
    @Override
    public ExpressionCodeFragment visitAssignment(PascriptParser.AssignmentContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(variableName);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("No variable with the given name exists in the current scope", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ExpressionCodeFragment expressionCodeFragment = this.visit(ctx.expression());
        DataType variableDataType = variableRecord.getDataType();
        if (variableDataType.equals(expressionCodeFragment.getDataType()))
        {
            Compiler.printCompilationError("The assigned expression does not match the variable's datatype", ctx.expression().getStart());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_code>" + 
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        String valueRegister = expressionCodeFragment.getValueRegister();
        template.add("value_code", expressionCodeFragment.toString());
        template.add("data_type", variableDataType.getOutputType());
        template.add("value_register", valueRegister);
        template.add("memory_register", variableRecord.getMemoryRegister());
        
        ExpressionCodeFragment resultCodeFragment = new ExpressionCodeFragment(template.render());
        if (variableDataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicVariableDataType = (DynamicDataType)variableDataType;
            ST dynamicVariableCopyTemplate = new ST("<value_register> = <copy_function_call>");
            String copyValueRegister = this._symbolTable.generateNewRegisterName();
            dynamicVariableCopyTemplate.add("value_register", copyValueRegister);
            dynamicVariableCopyTemplate.add("copy_function_call", dynamicVariableDataType.getCopyFunctionCall(valueRegister));
            
            resultCodeFragment.addCode(dynamicVariableCopyTemplate.toString());
            resultCodeFragment.setRegister(copyValueRegister);
        }
        else
        {
            resultCodeFragment.setRegister(valueRegister);
        }
        return resultCodeFragment.setDataType(variableDataType);
    }  

    @Override
    public ExpressionCodeFragment visitReAssignment(PascriptParser.ReAssignmentContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(variableName);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("No variable with the given name exists in the current scope", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        DataType variableDataType = variableRecord.getDataType();        
        if (!(variableDataType instanceof IntegerDataType))
        {
            Compiler.printCompilationError("Variable incrementaion and decrementation is available only for variables"
                + " with integer data type", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<register_1> = load <data_type>* <memory_register>\n" +
            "<value_register> = <instruction> <data_type> <register_1>, 1\n" +
            "store <data_type> <value_register>, <data_type>* <memory_register>\n"
        );
        
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", this._symbolTable.generateNewRegisterName());
        template.add("data_type", variableDataType.getOutputType());
        template.add("memory_register", variableRecord.getMemoryRegister());
        template.add("value_register", valueRegister);
        
        switch (ctx.operator.getType())
        {
            case PascriptParser.INCREMENT:
                template.add("instruction", "add");
                break;
            case PascriptParser.DECREMENT:
                template.add("instruction", "sub");
                break;
        }
        
        ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
        return expressionCodeFragment.setDataType(variableDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitVariableValue(PascriptParser.VariableValueContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText();
        VariableRecord variableRecord = this._symbolTable.getVariableRecord(variableName);
        if (variableRecord == null)
        {
            Compiler.printCompilationError("No variable with the given name exists in the current scope", ctx.IDENTIFIER().getSymbol());
            System.exit(-1);
        }
        
        ST template = new ST(
            "<value_register> = load <data_type>* <memory_register>\n"
        );
        DataType variableDataType = variableRecord.getDataType();
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", variableDataType.getOutputType());
        template.add("memory_register", variableRecord.getMemoryRegister());

        ExpressionCodeFragment expressionCodeFragment = new ExpressionCodeFragment(template.render());
        if (variableDataType instanceof DynamicDataType)
        {
            DynamicDataType dynamicVariableDataType = (DynamicDataType)variableDataType;
            ST dynamicVariableCopyTemplate = new ST("<value_register> = <copy_function_call>");
            String copyValueRegister = this._symbolTable.generateNewRegisterName();
            dynamicVariableCopyTemplate.add("value_register", copyValueRegister);
            dynamicVariableCopyTemplate.add("copy_function_call", dynamicVariableDataType.getCopyFunctionCall(valueRegister));
            
            expressionCodeFragment.addCode(dynamicVariableCopyTemplate.toString());
            expressionCodeFragment.setRegister(copyValueRegister);
        }
        else
        {
            expressionCodeFragment.setRegister(valueRegister);
        }
        return expressionCodeFragment.setDataType(variableDataType);
    }

    @Override
    public ExpressionCodeFragment visitBooleanLiteral(PascriptParser.BooleanLiteralContext ctx)
    {
        BooleanDataType booleanDataType = new BooleanDataType();
        
        ST template = new ST(
            "<register_1> = icmp eq i1 true, <literal_value>\n" +
            "<value_register> = zext i1 <register_1> to <data_type>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", this._symbolTable.generateNewRegisterName());
        template.add("value_register", valueRegister);
        template.add("data_type", booleanDataType.getOutputType());
        template.add("literal_value", ctx.value.getText());
        
        return (new ExpressionCodeFragment(template.render())).setDataType(booleanDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitIntegerLiteral(PascriptParser.IntegerLiteralContext ctx)
    {
        IntegerDataType integerDataType = new IntegerDataType();
        
        ST template = new ST(
            "<value_register> = add <data_type> 0, <literal_value>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", integerDataType.getOutputType());
        template.add("literal_value", ctx.value.getText());
        
        return (new ExpressionCodeFragment(template.render())).setDataType(integerDataType).setRegister(valueRegister);
    }

    @Override
    public ExpressionCodeFragment visitFloatLiteral(PascriptParser.FloatLiteralContext ctx)
    {
        FloatDataType floatDataType = new FloatDataType();
        
        ST template = new ST(
            "<value_register> = fadd <data_type> 0., <literal_value>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("value_register", valueRegister);
        template.add("data_type", floatDataType.getOutputType());
        template.add("literal_value", "0x" + Long.toHexString(Double.doubleToRawLongBits(Double.parseDouble(ctx.value.getText()))));
        
        return (new ExpressionCodeFragment(template.render())).setDataType(floatDataType).setRegister(valueRegister);
    }
    
    @Override
    public ExpressionCodeFragment visitStringLiteral(PascriptParser.StringLiteralContext ctx)
    {
        StringDataType stringDataType = new StringDataType();
        String literalValue = ctx.value.getText();
        literalValue = literalValue.substring(1, literalValue.length() - 1);
        
        ST template = new ST(
            "<register_1> = getelementptr [<length> x i8]* <constant_register>, i8 0, i8 0\n" + 
            "<value_register> = load <data_type>* <register_1>\n"
        );
        String valueRegister = this._symbolTable.generateNewRegisterName();
        template.add("register_1", this._symbolTable.generateNewRegisterName());
        template.add("length", Integer.toString(literalValue.length() + 1));
        template.add("constant_register", this._symbolTable.addStringConstant(literalValue));
        template.add("value_register", valueRegister);
        template.add("data_type", stringDataType.getOutputType());
        
        return (new ExpressionCodeFragment(template.render())).setDataType(stringDataType).setRegister(valueRegister);
    }
}