package pascript;

import pascript.grammar.PascriptBaseVisitor;
import pascript.DataTypeVisitor.*;

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

        public String getRegister()
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
    
    /*

    private String processIntBinaryOperator(CodeFragment left, CodeFragment right, Integer operator)
    {
        String instruction_line = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
        String instruction = "or";
        switch (operator) {
            case PascriptParser.ADD:
                instruction = "add";
                break;
            case PascriptParser.SUB:
                instruction = "sub";
                break;
            case PascriptParser.MUL:
                instruction = "mul";
                break;
            case PascriptParser.DIV:
                instruction = "sdiv";
                break;
            case PascriptParser.EXP:
                instruction = "@intExp";
                instruction_line = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                break;
            case PascriptParser.AND:
                instruction = "and";
            case PascriptParser.OR:
                ST temp = new ST(
                    "<r1> = icmp ne i32 0, <left_val>\n" +
                    "<r2> = icmp ne i32 0, <right_val>\n" +
                    "<r3> = <instruction> i1 <r1>, <r2>\n" +
                    "<ret> = zext i1 <r3> to i32\n"
                );
                temp.add("r1", this.generateNewRegister());
                temp.add("r2", this.generateNewRegister());
                temp.add("r3", this.generateNewRegister());
                temp.add("instruction", "<instruction>");
                temp.add("left_val", "<left_val>");
                temp.add("right_val", "<right_val>");
                temp.add("ret", "<ret>");
                instruction_line = temp.render();
                break;
        }
        
        ST codeStub = new ST(instruction_line);
        codeStub.add("instruction", instruction);
        codeStub.add("left_val", "<left_val>");
        codeStub.add("right_val", "<right_val>");
        codeStub.add("ret", "<ret>");
        return codeStub.render();
    }
    
    private String processFloatBinaryOperator(CodeFragment left, CodeFragment right, Integer operator)
    {
        String instruction_line = "<ret> = <instruction> double <left_val>, <right_val>\n";
        String instruction = "or";
        switch (operator) {
            case PascriptParser.ADD:
                instruction = "fadd";
                break;
            case PascriptParser.SUB:
                instruction = "fsub";
                break;
            case PascriptParser.MUL:
                instruction = "fmul";
                break;
            case PascriptParser.DIV:
                instruction = "fdiv";
                break;
            case PascriptParser.EXP:
                instruction = "@floatExp";
                instruction_line = "<ret> = call double <instruction>(double <left_val>, double <right_val>)\n";
                break;
            case PascriptParser.AND:
                instruction = "and";
            case PascriptParser.OR:
                ST temp = new ST(
                    "<r1> = fcmp one double 0., <left_val>\n" +
                    "<r2> = fcmp one double 0., <right_val>\n" +
                    "<r3> = <instruction> i1 <r1>, <r2>\n" +
                    "<ret_int> = zext i1 <r3> to i32\n" +
                    "<ret> = call double @intToFloat(i32 <ret_int>)\n"
                );
                temp.add("r1", this.generateNewRegister());
                temp.add("r2", this.generateNewRegister());
                temp.add("r3", this.generateNewRegister());
                temp.add("instruction", "<instruction>");
                temp.add("ret_int", this.generateNewRegister());
                temp.add("left_val", "<left_val>");
                temp.add("right_val", "<right_val>");
                temp.add("ret", "<ret>");
                instruction_line = temp.render();
                break;
        }
        
        ST codeStub = new ST(instruction_line);
        codeStub.add("instruction", instruction);
        codeStub.add("left_val", "<left_val>");
        codeStub.add("right_val", "<right_val>");
        codeStub.add("ret", "<ret>");
        return codeStub.render();
    }
    
    private CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator)
    {
        if (left.getDataType() != right.getDataType())
        {
            System.err.println("Error: expression data types do not match in a binary operation");
            System.exit(1);
        }
        
        DataType dataType = left.getDataType();
        String codeStub = (dataType == DataType.INT) ? 
            processIntBinaryOperator(left, right, operator) :
            processFloatBinaryOperator(left, right, operator);
        
        ST template = new ST(
            "<left_code>" + 
            "<right_code>" + 
            codeStub
        );
        template.add("left_code", left.toString());
        template.add("right_code", right.toString());
        template.add("left_val", left.getRegister());
        template.add("right_val", right.getRegister());
        String retRegister = this.generateNewRegister();
        template.add("ret", retRegister);
        
        CodeFragment ret = new CodeFragment();
        ret.setRegister(retRegister, dataType);
        ret.addCode(template.render());
        return ret;
    }
    
    
    @Override 
    public CodeFragment visitExp(PascriptParser.ExpContext ctx)
    {
        return this.generateBinaryOperatorCodeFragment(
            this.visit(ctx.expression(0)),
            this.visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override 
    public CodeFragment visitMul(PascriptParser.MulContext ctx)
    {
        return this.generateBinaryOperatorCodeFragment(
            this.visit(ctx.expression(0)),
            this.visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitAdd(PascriptParser.AddContext ctx)
    {
        return this.generateBinaryOperatorCodeFragment(
            this.visit(ctx.expression(0)),
            this.visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitAnd(PascriptParser.AndContext ctx)
    {
        return this.generateBinaryOperatorCodeFragment(
            this.visit(ctx.expression(0)),
            this.visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitOr(PascriptParser.OrContext ctx)
    {
        return this.generateBinaryOperatorCodeFragment(
            this.visit(ctx.expression(0)),
            this.visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }
    
    private String processIntUnaryOperator(CodeFragment code, Integer operator)
    {
        switch(operator) {
            case PascriptParser.SUB:
                return "<ret> = sub i32 0, <input>\n";
            case PascriptParser.NOT:
                ST temp = new ST(
                    "<r> = icmp eq i32 0, <input>\n" + 
                    "<ret> = zext i1 <r> to i32\n"
                );
                temp.add("r", this.generateNewRegister());
                temp.add("input", "<input>");
                temp.add("ret", "<ret>");
                return temp.render();
        }
        return "";
    }
    
    private String processFloatUnaryOperator(CodeFragment code, Integer operator)
    {
        switch(operator) {
            case PascriptParser.SUB:
                return "<ret> = fsub double 0., <input>\n";
            case PascriptParser.NOT:
                ST temp = new ST(
                    "<r> = fcmp oeq double 0., <input>\n" + 
                    "<ret_int> = zext i1 <r> to i32\n" +
                    "<ret> = call double @intToFloat(i32 <ret_int>)\n"
                );
                temp.add("r", this.generateNewRegister());
                temp.add("ret_int", this.generateNewRegister());
                temp.add("input", "<input>");
                temp.add("ret", "<ret>");
                return temp.render();
        }
        return "";
    }
    
    private CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator)
    {
        if (operator == PascriptParser.ADD)
        {
            return code;
        }
        
        DataType dataType = code.getDataType();
        String codeStub = (dataType == DataType.INT) ? 
            processIntUnaryOperator(code, operator) :
            processFloatUnaryOperator(code, operator);
        
        ST template = new ST("<code>" + codeStub);
        template.add("code", code.toString());
        template.add("input", code.getRegister());
        String retRegister = this.generateNewRegister();
        template.add("ret", retRegister);

        CodeFragment ret = new CodeFragment();    
        ret.setRegister(retRegister, dataType);
        ret.addCode(template.render());
        return ret;
    }

    @Override
    public CodeFragment visitUna(PascriptParser.UnaContext ctx)
    {
        return this.generateUnaryOperatorCodeFragment(
            this.visit(ctx.expression()),
            ctx.op.getType()
        );
    }
        
    @Override 
    public CodeFragment visitNot(PascriptParser.NotContext ctx)
    {
        return this.generateUnaryOperatorCodeFragment(
            this.visit(ctx.expression()),
            ctx.op.getType()
        );
    }

    @Override
    public CodeFragment visitFunctionCall(PascriptParser.FunctionCallContext ctx)
    {
        String functionName = ctx.lvalue().getText();
        
        FunctionRecord functionRecord = this.functionTable.get(functionName);
        if (functionRecord == null)
        {
            System.err.println(String.format("Error: no function exists with the" +
                " name '%s'", functionName));
            System.exit(1);
        }
        
        int argumentCount = functionRecord.argumentTypes.size();
        if (ctx.expression().size() != argumentCount)
        {
            System.err.println(String.format("Error: the function '%s' is being " +
                "called with an incorrect number of arguments", functionName));
            System.exit(1);
        }
        
        StringBuilder sbArgsCode = new StringBuilder();
        StringBuilder sbArgs = new StringBuilder();
        for (int i = 0; i < argumentCount; i++)
        {
            if (i > 0)
            {
                sbArgs.append(", ");
            }
            
            CodeFragment code = this.visit(ctx.expression(i));
            if (code.getDataType() != functionRecord.argumentTypes.get(i))
            {
                System.err.println(String.format("Error: the function '%s' was called" +
                    " with an incorrect data type in argument %d", functionName, i));
                System.exit(1);
            }
            
            sbArgsCode.append(code.toString());
            sbArgs.append((code.getDataType() == DataType.INT) ? "i32 " : "double ")
                .append(code.getRegister());
        }

        ST template = new ST(
            "<args_code>" +
            "<ret> = call <ret_type> @<func_name>(<args>)\n"
        );
        template.add("args_code", sbArgsCode.toString());
        template.add("ret_type", (functionRecord.returnType == DataType.INT) ? "i32" : "double");
        template.add("func_name", functionName);
        template.add("args", sbArgs.toString());
        String retRegister = this.generateNewRegister();
        template.add("ret", retRegister);
        
        CodeFragment ret = new CodeFragment();
        ret.setRegister(retRegister, functionRecord.returnType);
        ret.addCode(template.render());
        return ret;
    }

    @Override
    public CodeFragment visitFloatToInt(PascriptParser.FloatToIntContext ctx)
    {
        CodeFragment code = this.visit(ctx.expression());

        if (code.getDataType() != DataType.FLOAT)
        {
            System.err.println("Error: FloatToInt must be called on a float expression");
            System.exit(1);
        }

        ST template = new ST(
            "<value_code>" + 
            "<ret> = call i32 @floatToInt(double <value>)\n"
        );
        template.add("value_code", code.toString());
        template.add("value", code.getRegister());
        String retRegister = this.generateNewRegister();
        template.add("ret", retRegister);
        
        CodeFragment ret = new CodeFragment();    
        ret.setRegister(retRegister, DataType.INT);
        ret.addCode(template.render());
        return ret;
    }

    @Override
    public CodeFragment visitIntToFloat(PascriptParser.IntToFloatContext ctx)
    {
        CodeFragment code = this.visit(ctx.expression());

        if (code.getDataType() != DataType.INT)
        {
            System.err.println("Error: IntToFloat must be called on an int expression");
            System.exit(1);
        }

        ST template = new ST(
            "<value_code>" + 
            "<ret> = call double @intToFloat(i32 <value>)\n"
        );
        template.add("value_code", code.toString());
        template.add("value", code.getRegister());
        String retRegister = this.generateNewRegister();
        template.add("ret", retRegister);
        
        CodeFragment ret = new CodeFragment();    
        ret.setRegister(retRegister, DataType.FLOAT);
        ret.addCode(template.render());
        return ret;
    }

    @Override
    public CodeFragment visitPar(PascriptParser.ParContext ctx)
    {
        return this.visit(ctx.expression());
    }

    @Override
    public CodeFragment visitVar(PascriptParser.VarContext ctx)
    {
        String varName = ctx.lvalue().getText();
        VariableRecord varRecord = this.variableTable.getVar(varName);
        
        if (varRecord == null)
        {
            System.err.println(String.format("Error: no variable with the name '%s'" +
                " exists in the current scope", varName));
            System.exit(1);
        }
        
        String dataTypeStr = (varRecord.dataType == DataType.INT) ? "i32" : "double";
        String register = this.generateNewRegister();

        CodeFragment code = new CodeFragment();
        code.addCode(String.format("%s = load %s* %s\n", register, dataTypeStr, varRecord.register));
        code.setRegister(register, varRecord.dataType);
        return code;
    }

    @Override
    public CodeFragment visitInt(PascriptParser.IntContext ctx)
    {
        String value = ctx.INT().getText();
        CodeFragment code = new CodeFragment();
        String register = this.generateNewRegister();
        code.setRegister(register, DataType.INT);
        code.addCode(String.format("%s = add i32 0, %s\n", register, value));
        return code;
    }

    @Override
    public CodeFragment visitFloat(PascriptParser.FloatContext ctx)
    {
        String value = ctx.FLOAT().getText();
        value = "0x" + Long.toHexString(Double.doubleToRawLongBits(Double.parseDouble(value)));
        CodeFragment code = new CodeFragment();
        String register = this.generateNewRegister();
        code.setRegister(register, DataType.FLOAT);
        code.addCode(String.format("%s = fadd double 0., %s\n", register, value));
        return code;
    }
    
    @Override
    public CodeFragment visitVarDec(PascriptParser.VarDecContext ctx)
    {
        CodeFragment code = new CodeFragment();
        code.setRegister(null, (ctx.dec.getType() == PascriptParser.DEC_INT) ? 
            DataType.INT : DataType.FLOAT);
        return code;
    }*/
}
