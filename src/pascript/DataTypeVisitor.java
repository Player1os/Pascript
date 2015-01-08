package pascript;

import java.util.Objects;
import org.stringtemplate.v4.ST;
import pascript.grammar.PascriptBaseVisitor;
import pascript.grammar.PascriptParser;
import pascript.DataTypeVisitor.*;

/**
 *
 * @author Osama Hassanein
 */
public class DataTypeVisitor extends PascriptBaseVisitor<DataType>
{
    public static abstract class DataType
    {
        public abstract String getOutputType();
        
        @Override
        public boolean equals(Object obj)
        {
            return (obj instanceof DataType) && (super.equals(obj) || this.getClass().isInstance(obj));
        }

        @Override
        public int hashCode()
        {
            int hash = 5;
            return hash;
        }
    }
    
    public static class VoidDataType extends DataType
    {
        @Override
        public String getOutputType()
        {
            return "void";
        }
    }
    
    public static abstract class ValueDataType extends DataType
    {
        public abstract String getDefaultOutputValue();
    }
    
    public static interface PrimitiveDataType
    {
        public String getOutputPrintFunction();
        public String getOutputReadFunction();
    }
    
    public static class BooleanDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "i8";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "0";
        }

        @Override
        public String getOutputPrintFunction()
        {
            return "@__pascript__booleanPrint";
        }

        @Override
        public String getOutputReadFunction()
        {
            return "@__pascript__booleanRead";
        }
    }
    
    public static class IntegerDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "i32";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "0";
        }

        @Override
        public String getOutputPrintFunction()
        {
            return "@__pascript__integerPrint";
        }

        @Override
        public String getOutputReadFunction()
        {
            return "@__pascript__integerRead";
        }
    }
    
    public static class FloatDataType extends ValueDataType implements PrimitiveDataType
    {
        @Override
        public String getOutputType()
        {
            return "double";
        }

        @Override
        public String getDefaultOutputValue()
        {
            return "0.";
        }

        @Override
        public String getOutputPrintFunction()
        {
            return "@__pascript__floatPrint";
        }

        @Override
        public String getOutputReadFunction()
        {
            return "@__pascript__floatRead";
        }
    }
    
    public static abstract class DynamicDataType extends ValueDataType
    {
        public abstract String getAllocationFunctionName();
        public abstract String getDeallocationFunctionCall(String valueRegister);
        public abstract String getCopyFunctionCall(String valueRegister);
    }
    
    public static class StringDataType extends DynamicDataType implements PrimitiveDataType 
    {
        @Override
        public String getOutputType()
        {
            return "i8*";
        }

        @Override
        public String getDefaultOutputValue()
        {
            return "null";
        }

        @Override
        public String getOutputPrintFunction()
        {
            return "@__pascript__stringPrint";
        }

        @Override
        public String getOutputReadFunction()
        {
            return "@__pascript__stringRead";
        }
        
        @Override
        public String getAllocationFunctionName()
        {
            return "@__pascript__stringAllocate";
        }
        
        @Override
        public String getDeallocationFunctionCall(String valueRegister)
        {
            ST template = new ST("call void @__pascript__stringDeallocate(<data_type> <value_register>)\n");
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            return template.toString();
        }

        @Override
        public String getCopyFunctionCall(String valueRegister)
        {
            ST template = new ST("call <data_type> @__pascript__stringCopy(<data_type> <value_register>)\n");
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            return template.toString();
        }
    }
    
    public static class ArrayDataType extends DynamicDataType
    {
        protected PrimitiveDataType _primitiveDataType;
        protected int _dimensionCount;
        
        public ArrayDataType()
        {
            this(null, -1);
        }
        
        public ArrayDataType(PrimitiveDataType primitiveDataType, int dimensionCount)
        {
            this._primitiveDataType = primitiveDataType;
            this._dimensionCount = dimensionCount;
        }
        
        public int getDimensionCount()
        {
            return this._dimensionCount;
        }
        
        public PrimitiveDataType getPrimitiveDataType()
        {
            return this._primitiveDataType;
        }
        
        @Override
        public String getOutputType()
        {
            return "i32*";
        }
        
        @Override
        public String getDefaultOutputValue()
        {
            return "null";
        }
        
        public String getPrimitiveDataTypeName()
        {
            if (this._primitiveDataType instanceof BooleanDataType)
            {
                return "boolean";
            }
            else if (this._primitiveDataType instanceof IntegerDataType)
            {
                return "integer";
            }
            else if (this._primitiveDataType instanceof FloatDataType)
            {
                return "float";
            }
            else if (this._primitiveDataType instanceof StringDataType)
            {
                return "string";
            }
            return null;
        }
        
        @Override
        public String getAllocationFunctionName()
        {
            if (this._primitiveDataType instanceof BooleanDataType)
            {
                return "@__pascript__booleanArrayAllocate";
            }
            else if (this._primitiveDataType instanceof IntegerDataType)
            {
                return "@__pascript__integerArrayAllocate";
            }
            else if (this._primitiveDataType instanceof FloatDataType)
            {
                return "@__pascript__floatArrayAllocate";
            }
            else if (this._primitiveDataType instanceof StringDataType)
            {
                return "@__pascript__stringArrayAllocate";
            }
            return null;
        }
        
        @Override
        public String getDeallocationFunctionCall(String valueRegister)
        {
            String templateString = "call void <function_name>(<data_type> <value_register>, <dimension_data_type> <dimension_count>)\n";
            
            ST template = new ST(templateString);
            
            if (this._primitiveDataType instanceof BooleanDataType)
            {
                template.add("function_name", "@__pascript__booleanArrayDeallocate");
            }
            else if (this._primitiveDataType instanceof IntegerDataType)
            {
                template.add("function_name", "@__pascript__integerArrayDeallocate");
            }
            else if (this._primitiveDataType instanceof FloatDataType)
            {
                template.add("function_name", "@__pascript__floatArrayDeallocate");
            }
            else if (this._primitiveDataType instanceof StringDataType)
            {
                template.add("function_name", "@__pascript__stringArrayDeallocate");
            }
            else
            {
                return null;
            }
            
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            template.add("dimension_data_type", (new IntegerDataType()).getOutputType());
            template.add("dimension_count", Integer.toString(this.getDimensionCount()));

            return template.toString();
        }
        
        @Override
        public String getCopyFunctionCall(String valueRegister)
        {
            ST template = new ST("call <data_type> <function_name>(<data_type> <value_register>, <integer_data_type> <dimension_count>)\n");
            
            if (this._primitiveDataType instanceof BooleanDataType)
            {
                template.add("function_name", "@__pascript__booleanArrayCopy");
            }
            else if (this._primitiveDataType instanceof IntegerDataType)
            {
                template.add("function_name", "@__pascript__integerArrayCopy");
            }
            else if (this._primitiveDataType instanceof FloatDataType)
            {
                template.add("function_name", "@__pascript__floatArrayCopy");
            }
            else if (this._primitiveDataType instanceof StringDataType)
            {
                template.add("function_name", "@__pascript__stringArrayCopy");
            }
            else
            {
                return null;
            }
            
            template.add("data_type", this.getOutputType());
            template.add("value_register", valueRegister);
            template.add("integer_data_type", (new IntegerDataType()).getOutputType());
            template.add("dimension_count", Integer.toString(this.getDimensionCount()));
            return template.toString();
        }
        
        @Override
        public boolean equals(Object obj)
        {
            if (obj instanceof ArrayDataType)
            {
                return false;
            }
            ArrayDataType arrayDataType = (ArrayDataType)obj;
            
            return super.equals(obj) || (this.getClass().isInstance(obj)
                && (this.getDimensionCount() == arrayDataType.getDimensionCount())
                && ((this.getPrimitiveDataType() == null) || (arrayDataType.getPrimitiveDataType() == null) 
                || this.getPrimitiveDataType().equals(arrayDataType.getPrimitiveDataType())));
        }

        @Override
        public int hashCode()
        {
            int hash = 5;
            hash = 37 * hash + Objects.hashCode(this._primitiveDataType);
            hash = 37 * hash + this._dimensionCount;
            return hash;
        }
    }
/* @test1
    @Override
    public DataType visitReturnVoidDataType(PascriptParser.ReturnVoidDataTypeContext ctx)
    {
        return new VoidDataType();
    }
    
    @Override
    public DataType visitBooleanDataType(PascriptParser.BooleanDataTypeContext ctx)
    {
        return new BooleanDataType();
    }

    @Override
    public DataType visitIntegerDataType(PascriptParser.IntegerDataTypeContext ctx)
    {
        return new IntegerDataType();
    }

    @Override
    public DataType visitFloatDataType(PascriptParser.FloatDataTypeContext ctx)
    {
        return new FloatDataType();
    }

    @Override
    public DataType visitStringDataType(PascriptParser.StringDataTypeContext ctx)
    {
        return new StringDataType();
    }

    @Override
    public DataType visitArrayDataType(PascriptParser.ArrayDataTypeContext ctx)
    {
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)this.visit(ctx.primitiveDataType());
        return new ArrayDataType(primitiveDataType, ctx.SQUARE_OPEN().size());
    }*/
}
