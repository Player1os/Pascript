package pascript;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import pascript.DataTypeVisitor.*;
import pascript.ExpressionCodeVisitor.ExpressionCodeFragment;

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
    private boolean _currentFunctionIsMain;
    
    private final HashMap<String, VariableRecord> _globalVariableTable = new HashMap<>();
    private final HashMap<String, ExpressionCodeFragment> _globalVariableInitializer = new HashMap<>();
    private final LinkedList<HashMap<String, VariableRecord>> _variableTables = new LinkedList<>();
    private final HashMap<String, FunctionRecord> _externalFunctionTable = new HashMap<>();
    private final HashMap<String, FunctionRecord> _functionTable = new HashMap<>();
    private final HashMap<String, String> _stringConstants = new HashMap<>();
    
    public SymbolTable()
    {
        ////// Boolean functions //////
        
        // Boolean IO
        this.addExternalFunction("__pascript__booleanRead", new BooleanDataType(),
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__booleanPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));

        // Boolean Conversion
        this.addExternalFunction("__pascript__booleanToInteger", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        this.addExternalFunction("__pascript__booleanToFloat", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        this.addExternalFunction("__pascript__booleanToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new BooleanDataType())));
        
        ////// Integer functions //////
            
        // Integer IO
        this.addExternalFunction("__pascript__integerRead", new IntegerDataType(),
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__integerPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));

        // Integer Conversions
        this.addExternalFunction("__pascript__integerToBoolean", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__integerToFloat", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__integerToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        
        ////// Float functions //////
        
        // Float IO
        this.addExternalFunction("__pascript__floatRead", new FloatDataType(),
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__floatPrint", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));

        // Float Conversion
        this.addExternalFunction("__pascript__floatToBoolean", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        this.addExternalFunction("__pascript__floatToInteger", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        this.addExternalFunction("__pascript__floatToString", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new FloatDataType())));
        
        ////// String functions //////
        
        // String Memory Management
        this.addExternalFunction("__pascript__stringAllocate", new StringDataType(),
            new ArrayList<DataType>());
        this.addExternalFunction("__pascript__stringDeallocate", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        this.addExternalFunction("__pascript__stringCopy", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        
        // String IO
        this.addExternalFunction("__pascript__stringRead", new StringDataType(),
            new ArrayList<DataType>());
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
        this.addExternalFunction("__pascript__stringAt", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringLength", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType())));
        this.addExternalFunction("__pascript__stringConcatenate", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__stringCompare", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__stringFind", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__stringSubstring", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new StringDataType(), new IntegerDataType(), new IntegerDataType())));
        
        ////// Array functions //////
        
        // Array Allocate Operation
        this.addExternalFunction("__pascript__booleanArrayAllocate", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayAllocate", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayAllocate", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayAllocate", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new IntegerDataType())));
        
        // Array Deallocate Operation
        this.addExternalFunction("__pascript__booleanArrayAllocate", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayDeallocate", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayDeallocate", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayDeallocate", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        
        // Array Copy Operation
        this.addExternalFunction("__pascript__booleanArrayCopy", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayCopy", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayCopy", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayCopy", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        
        // Array Get Operation
        this.addExternalFunction("__pascript__booleanArrayGetValue", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayGetValue", new IntegerDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayGetValue", new FloatDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayGetValue", new StringDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__booleanArrayGetArray", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayGetArray", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayGetArray", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayGetArray", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        
        // Array Set Operation
        this.addExternalFunction("__pascript__booleanArraySetValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new BooleanDataType())));
        this.addExternalFunction("__pascript__integerArraySetValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArraySetValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new FloatDataType())));
        this.addExternalFunction("__pascript__stringArraySetValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__booleanArraySetArray", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType(), new ArrayDataType())));
        this.addExternalFunction("__pascript__integerArraySetArray", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType(), new ArrayDataType())));
        this.addExternalFunction("__pascript__floatArraySetArray", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType(), new ArrayDataType())));
        this.addExternalFunction("__pascript__stringArraySetArray", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType(), new ArrayDataType())));
        
        // Array Insert Operation
        this.addExternalFunction("__pascript__booleanArrayInsertValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new BooleanDataType())));
        this.addExternalFunction("__pascript__integerArrayInsertValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayInsertValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new FloatDataType())));
        this.addExternalFunction("__pascript__stringArrayInsertValue", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new StringDataType())));
        this.addExternalFunction("__pascript__arrayInsertArray", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new ArrayDataType())));
        
        // Array Remove Operation
        this.addExternalFunction("__pascript__booleanArrayRemove", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayRemove", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayRemove", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayRemove", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        
        // Array Size Operation
        this.addExternalFunction("__pascript__booleanArraySize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType())));
        this.addExternalFunction("__pascript__integerArraySize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType())));
        this.addExternalFunction("__pascript__floatArraySize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType())));
        this.addExternalFunction("__pascript__stringArraySize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType())));
        this.addExternalFunction("__pascript__arraySize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType())));
        
        // Array Resize Operation
        this.addExternalFunction("__pascript__booleanArrayResize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayResize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayResize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayResize", new VoidDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new IntegerDataType(), new IntegerDataType())));
        
        // Array Merge Operation
        this.addExternalFunction("__pascript__booleanArrayMerge", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayMerge", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayMerge", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayMerge", new ArrayDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        
        // Array Equals Operation
        this.addExternalFunction("__pascript__booleanArrayEquals", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__integerArrayEquals", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__floatArrayEquals", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
        this.addExternalFunction("__pascript__stringArrayEquals", new BooleanDataType(),
            new ArrayList<DataType>(Arrays.asList(new ArrayDataType(), new ArrayDataType(), new IntegerDataType())));
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
    
    public Collection<FunctionRecord> getExternalFunctions()
    {
        return this._externalFunctionTable.values();
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
    
    public String addStringConstant(String value)
    {
        String name;
        do
        {
            name = String.format("@S%d", this._stringConstantCounter++);
        }
        while (this._externalFunctionTable.containsKey(name));
        this._stringConstants.put(name, value);
        return name;
    }
    
    public HashMap<String, String> getStringConstants()
    {
        return new HashMap<>(this._stringConstants);
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
    
    public HashMap<String, ExpressionCodeFragment> getGlobalVarableInitializers()
    {
        return new HashMap<>(this._globalVariableInitializer);
    }
    
    public void addGlobalVariableInitializer(String globalRegister, ExpressionCodeFragment expressionCodeFragment)
    {
        this._globalVariableInitializer.put(globalRegister, expressionCodeFragment);
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
    
    public VariableRecord removeVariableRecord(String name)
    {
        Iterator<HashMap<String, VariableRecord>> varTableIterator = this._variableTables.descendingIterator();

        while (varTableIterator.hasNext())
        {
            HashMap<String, VariableRecord> currentVarTable = varTableIterator.next();
            if (!varTableIterator.hasNext())
            {
                break;
            }

            VariableRecord variableRecord = currentVarTable.remove(name);
            if (variableRecord != null)
            {
                return variableRecord;
            }
        }

        return null;
    }
    
    public void enterFunction(DataType returnDataType, boolean isMain)
    {
        this._currentFunctionIsMain = isMain;
        this._variableTables.clear();
        this._variableTables.addLast(this._globalVariableTable);
        this._variableTables.addLast(new HashMap<String, VariableRecord>());
        this._currentFunctionReturnDataType = returnDataType;
    }
    
    public boolean isCurrentFunctionMain()
    {
        return this._currentFunctionIsMain;
    }
    
    public DataType getCurrentFunctionReturnDataType()
    {
        return this._currentFunctionReturnDataType;
    }
    
    public ArrayList<VariableRecord> getBlockDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        for (VariableRecord variableRecord : this._variableTables.peekLast().values())
        {
            if (variableRecord.getDataType() instanceof DynamicDataType)
            {
                dynamicVariableRecords.add(variableRecord);
            }
        }
        
        return dynamicVariableRecords;
    }
    
    public ArrayList<VariableRecord> getFunctionDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        Iterator<HashMap<String, VariableRecord>> varTableIterator = this._variableTables.iterator();
        varTableIterator.next();
        
        while (varTableIterator.hasNext())
        {
            for (VariableRecord variableRecord : varTableIterator.next().values())
            {
                if (variableRecord.getDataType() instanceof DynamicDataType)
                {
                    dynamicVariableRecords.add(variableRecord);
                }
            }
        }
        
        return dynamicVariableRecords;
    }
    
    public ArrayList<VariableRecord> getGlobalDynamicVariableRecords()
    {
        ArrayList<VariableRecord> dynamicVariableRecords = new ArrayList<>();
        
        for (VariableRecord variableRecord : this._globalVariableTable.values())
        {
            if (variableRecord.getDataType() instanceof DynamicDataType)
            {
                dynamicVariableRecords.add(variableRecord);
            }
        }
        
        return dynamicVariableRecords;
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