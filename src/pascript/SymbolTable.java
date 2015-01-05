package pascript;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import pascript.DataTypeVisitor.*;

/**
 *
 * @author Osama Hassanein
 */
public final class SymbolTable
{
    public static class FunctionRecord
    {
        protected final String _outputFunctionName;
        protected final ArrayList<DataType> _parameterDataTypes;
        protected final DataType _returnDataType;

        public FunctionRecord(String outputFunctionName, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
        {
            this._outputFunctionName = outputFunctionName;
            this._returnDataType = returnDataType;
            this._parameterDataTypes = parameterDataTypes;
        }
        
        public String getOutputFunctionName()
        {
            return this._outputFunctionName;
        }

        public DataType getReturnDataType()
        {
            return this._returnDataType;
        }

        public ArrayList<DataType> getParameterDataTypes()
        {
            return this._parameterDataTypes;
        }
    }
    
    public static class VariableRecord
    {        
        protected final String _memoryRegister;
        protected final DataType _dataType;

        public VariableRecord(String memoryRegister, DataType dataType)
        {
            this._memoryRegister = memoryRegister;
            this._dataType = dataType;
        }

        public String getMemoryRegister()
        {
            return this._memoryRegister;
        }

        public DataType getDataType()
        {
            return this._dataType;
        }
    }
    
    private int _lableCounter = 0;
    private int _registerCounter = 0;
    
    private int _localFunctionCounter = 0;
    private int _stringConstantCounter = 0;
    private int _globalVariableCounter = 0;
    
    private DataType _currentFunctionReturnDataType;
    
    private final HashMap<String, VariableRecord> _globalVariableTable = new HashMap<>();
    private final LinkedList<HashMap<String, VariableRecord>> _variableTables = new LinkedList<>();
    private final HashMap<String, FunctionRecord> _externalFunctionTable = new HashMap<>();
    private final HashMap<String, FunctionRecord> _functionTable = new HashMap<>();
    private final HashMap<String, String> _stringConstants = new HashMap<>();
    
    public SymbolTable()
    {
        ////// Boolean functions //////
        
        // Boolean IO
        this.addExternalFunction("__pascript__booleanRead", new BooleanDataType(), new ArrayList<DataType>());
        this.addExternalFunction("__pascript__booleanPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));

        // Boolean Conversion
        this.addExternalFunction("__pascript__booleanToInteger", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        this.addExternalFunction("__pascript__booleanToFloat", new FloatDataType()
            , new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        this.addExternalFunction("__pascript__booleanToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        
        ////// Integer functions //////
            
        // Integer IO
        this.addExternalFunction("__pascript__integerRead", new IntegerDataType(), new ArrayList<DataType>());
        this.addExternalFunction("__pascript__integerPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));

        // Integer Conversions
        this.addExternalFunction("__pascript__integerToBoolean", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__integerToFloat", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__integerToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        
        // Integer Operations
        this.addExternalFunction("__pascript__integerPower", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        
        ////// Float functions //////
        
        // Float IO
        this.addExternalFunction("__pascript__floatRead", new FloatDataType(), new ArrayList<DataType>());
        this.addExternalFunction("__pascript__floatPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));

        // Float Conversion
        this.addExternalFunction("__pascript__floatToBoolean", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        this.addExternalFunction("__pascript__floatToInteger", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        this.addExternalFunction("__pascript__floatToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        
        // Float Operations
        this.addExternalFunction("__pascript__floatPower", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        
        ////// String functions //////
        
        // String IO
        this.addExternalFunction("__pascript__stringRead", new StringDataType(), new ArrayList<DataType>());
        this.addExternalFunction("__pascript__stringPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        
        // String Conversions
        this.addExternalFunction("__pascript__stringToBoolean", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        this.addExternalFunction("__pascript__stringToInteger", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        this.addExternalFunction("__pascript__stringToFloat", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        
        // String Operations
        this.addExternalFunction("__pascript__stringConcatenate", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__stringSubstring", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringAt", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringFind", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__stringLength", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        
        ////// Array functions //////
        
    }
    
    public String generateNewLabelName()
    {
        return String.format("L%d", this._lableCounter++);
    }

    public String generateNewRegisterName()
    {
        return String.format("%%R%d", this._registerCounter++);
    }
    
    public FunctionRecord addExternalFunction(String name, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
    {
        if (this._functionTable.containsKey(name))
        {
            return null;
        }
        
        String outputName = "@" + name;
        FunctionRecord functionRecord = new FunctionRecord(outputName, returnDataType, parameterDataTypes);
        this._externalFunctionTable.put(outputName, functionRecord);
        this._functionTable.put(name, functionRecord);
        return functionRecord;
    }
    
    public FunctionRecord addLocalFunction(String name, DataType returnDataType, ArrayList<DataType> parameterDataTypes)
    {
        if (this._functionTable.containsKey(name))
        {
            return null;
        }
        
        String outputName;
        do
        {
            outputName = String.format("@F%d", this._localFunctionCounter++);
        }
        while (this._externalFunctionTable.containsKey(outputName));
        
        FunctionRecord functionRecord = new FunctionRecord(outputName, returnDataType, parameterDataTypes);
        this._functionTable.put(name, functionRecord);
        return functionRecord;
    }
    
    public FunctionRecord getFunctionRecord(String name)
    {
        return this._functionTable.get(name);
    }
    
    public void addStringConstant(String value)
    {
        String name;
        do
        {
            name = String.format("@S%d", this._stringConstantCounter++);
        }
        while (this._externalFunctionTable.containsKey(name));
        this._stringConstants.put(name, value);
    }
    
    public HashMap<String, String> getStringConstants()
    {
        return this._stringConstants;
    }
    
    public VariableRecord addGlobalVariable(String name, DataType dataType)
    {
        if (this._globalVariableTable.containsKey(name))
        {
            return null;
        }
        
        String memoryRegister;
        do
        {
            memoryRegister = String.format("@V%d", this._globalVariableCounter++);
        }
        while (this._externalFunctionTable.containsKey(memoryRegister));

        VariableRecord variableRecord = new VariableRecord(memoryRegister, dataType);
        this._globalVariableTable.put(name, variableRecord);
        return variableRecord;
    }
    
    public VariableRecord addLocalVariable(String name, DataType dataType)
    {
        HashMap<String, VariableRecord> currentVarTable = this._variableTables.peekLast();

        if (currentVarTable.containsKey(name))
        {
            return null;
        }

        VariableRecord variableRecord = new VariableRecord(this.generateNewRegisterName(), dataType);
        currentVarTable.put(name, variableRecord);
        return variableRecord;
    }
    
    public VariableRecord getVariableRecord(String name)
    {
        Iterator<HashMap<String, VariableRecord>> varTableIterator = this._variableTables.descendingIterator();

        while (varTableIterator.hasNext())
        {
            HashMap<String, VariableRecord> currentVarTable = varTableIterator.next();

            VariableRecord variableRecord = currentVarTable.get(name);
            if (variableRecord != null)
            {
                return variableRecord;
            }
        }

        return null;
    }
    
    public void enterFunction(DataType returnDataType)
    {
        this._variableTables.clear();
        this._variableTables.addLast(this._globalVariableTable);
        this._variableTables.addLast(new HashMap<String, VariableRecord>());
        this._currentFunctionReturnDataType = returnDataType;
    }
    
    public DataType getCurrentFunctionReturnDataType()
    {
        return this._currentFunctionReturnDataType;
    }
    
    public void enterBlock()
    {
        this._variableTables.addLast(new HashMap<String, VariableRecord>());
    }
    
    public void exitBlock()
    {
        this._variableTables.removeLast();
    }
}