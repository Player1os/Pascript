package pascript;

import java.util.Objects;
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
        public abstract String getDefaultOutputLiteral();
        
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

        @Override
        public String getDefaultOutputLiteral()
        {
            return "void";
        }
    }
    
    public static abstract class ValueDataType extends DataType
    {
        
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
        public String getDefaultOutputLiteral()
        {
            return "i8 false";
        }

        @Override
        public String getOutputPrintFunction()
        {
            return "booleanPrint";
        }

        @Override
        public String getOutputReadFunction()
        {
            return "booleanRead";
        }
        
    }
    
    public static class IntegerDataType extends ValueDataType implements PrimitiveDataType
    {

        @Override
        public String getOutputType()
        {
            return "i32";
        }
        
    }
    
    public static class FloatDataType extends ValueDataType implements PrimitiveDataType
    {

        @Override
        public String getOutputType()
        {
            return "double";
        }
        
    }
    
    public static abstract class DynamicDataType extends ValueDataType
    {

    }
    
    public static class StringDataType extends DynamicDataType implements PrimitiveDataType 
    {

        @Override
        public String getOutputType()
        {
            return "i8*";
        }
        
    }
    
    public static class ArrayDataType extends DynamicDataType
    {
        protected PrimitiveDataType _primitiveDataType;
        protected int _dimensionCount;
        
        private ArrayDataType(PrimitiveDataType primitiveDataType, int dimensionCount)
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
        public boolean equals(Object obj)
        {
            if (obj instanceof ArrayDataType)
            {
                return false;
            }
            ArrayDataType arrayDataType = (ArrayDataType)obj;
            
            return super.equals(obj) || (this.getClass().isInstance(obj)
                && (this.getDimensionCount() == arrayDataType.getDimensionCount())
                && this.getPrimitiveDataType().equals(arrayDataType.getPrimitiveDataType()));
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
    }
}
