#include <iostream>
#include <cmath>
#include <algorithm>
#include <string>
#include <vector>

#define TRUE_STR "true"
#define FALSE_STR "false"

typedef bool TBoolean;
typedef long TInteger;
typedef double TFloat;

typedef char TChar;
typedef TChar* TString;

typedef void* TArray;

// Helper String Functions

TString stdStringtoTString(std::string &value)
{
    TString newValue = new TChar[value.length() + 1];
    strncpy(newValue, value.c_str(), value.length() + 1);
    return newValue;
}
TString allocateTString()
{
    return stdStringtoTString(std::string());
}
void deallocateTString(TString value)
{
    delete[] value;
}
TString copyTString(TString value)
{
    return stdStringtoTString(value);
}
TInteger compareTString(TString a, TString b)
{
    return (TInteger)std::string(a).compare(std::string(b));
}

// Helper Array Functions

TArray allocateTArray<Type>(TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        return (TArray)(new std::vector<TArray>());
    }
    return (TArray)(new std::vector<Type>());
}

void deallocateTArray<Type>(TArray array, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        for (TInteger i = 0; i < arrayVector->size(); i++)
        {
            deallocateTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }
        delete arrayVector;
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    delete typeVector;
}
void deallocateTArrayTString(TArray array, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        for (TInteger i = 0; i < arrayVector->size(); i++)
        {
            deallocateTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }
        delete arrayVector;
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    for (TInteger i = 0; i < stringVector->size(); i++)
    {
        deallocateTString((*stringVector)[i]);
    }
    delete stringVector;
}

Type getValueTArray<Type>(TArray array, TInteger position)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    return (*typeVector)[position];
}
TString getValueTArrayTString(TArray array, TInteger position)
{
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    return stdStringtoTString(std::string((*stringVector)[position]));
}
TArray getArrayTArray<Type>(TArray array, TInteger dimensionCount, TInteger position)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
    return copyTArray<Type>((*arrayVector)[position], dimensionCount - 1);
}
TArray getArrayTArrayTString(TArray array, TInteger dimensionCount, TInteger position)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
    return copyTArrayTString((*arrayVector)[position], dimensionCount - 1);
}

void setValueTArray<Type>(TArray array, TInteger position, Type value)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    (*typeVector)[position] = value;
}
void setValueTArrayTString(TArray array, TInteger position, TString value)
{
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    deallocateTString((*stringVector)[position]);
    (*stringVector)[position] = value;
}
void setArrayTArray<Type>(TArray array, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
    deallocateTArray<Type>((*arrayVector)[position], dimensionCount - 1);
    (*arrayVector)[position] = value;
}
void setArrayTArrayTString(TArray array, TInteger dimensionCount, TInteger position, TArray value)
{
    std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
    deallocateTArrayTString((*arrayVector)[position], dimensionCount - 1);
    (*arrayVector)[position] = value;
}

void insertTArray<Type>(TArray array, TInteger position, Type value)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    typeVector->insert(typeVector->begin() + position, value);
}

void removeTArray<Type>(TArray array, TInteger dimensionCount, TInteger position)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        deallocateTArray<Type>((*arrayVector)[position], dimensionCount - 1);
        arrayVector->erase(arrayVector.begin() + position);
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    typeVector->erase(typeVector.begin() + position);
}
void removeTArrayTString(TArray array, TInteger dimensionCount, TInteger position)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        deallocateTArrayTString((*arrayVector)[position], dimensionCount - 1);
        arrayVector->erase(arrayVector.begin() + position);
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    deallocateTString((*stringVector)[position]);
    typeVector->erase(typeVector.begin() + position);
}

TInteger sizeTArray<Type>(TArray array)
{
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    return (TInteger)typeVector->size();
}

void resizeTArray<Type>(TArray array, TInteger dimensionCount, TInteger newSize)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        
        for (TInteger i = newSize; i < arrayVector->size(); i++)
        {
            deallocateTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }
        arrayVector->resize(newSize);
        for (TInteger i = arrayVector->size(); i < newSize; i++)
        {
            (*arrayVector)[i] = allocateTArray<Type>(dimensionCount - 1);
        }
        return;
    }
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    typeVector->resize(newSize);
}
void resizeTArrayTString(TArray array, TInteger dimensionCount, TInteger newSize)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        
        for (TInteger i = newSize; i < arrayVector->size(); i++)
        {
            deallocateTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }
        arrayVector->resize(newSize);
        for (TInteger i = arrayVector->size(); i < newSize; i++)
        {
            (*arrayVector)[i] = allocateTArray<TString>(dimensionCount - 1);
        }
        return;
    }
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    
    for (TInteger i = newSize; i < arrayVector->size(); i++)
    {
        deallocateTString((*stringVector)[i]);
    }
    stringVector->resize(newSize);
    for (TInteger i = arrayVector->size(); i < newSize; i++)
    {
        (*stringVector)[i] = allocateTString();
    }
}

TArray copyTArray<Type>(TArray array, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<Type>(dimensionCount);
        newArrayVector->resize(arrayVector->size());
        
        for (int i = 0; i < newArrayVector->size(); i++)
        {
            (*newArrayVector)[i] = copyTArray<Type>((*arrayVector)[i], dimensionCount - 1);
        }
        
        return (TArray)newArrayVector;
    }
    
    std::vector<Type>* typeVector = (std::vector<Type>*)array;
    
    std::vector<Type>* newTypeVector = (std::vector<Type>*)allocateTArray<Type>(dimensionCount);
    newTypeVector->resize(typeVector->size());

    for (int i = 0; i < newTypeVector->size(); i++)
    {
        (*newTypeVector)[i] = (*typeVector)[i];
    }

    return (TArray)newTypeVector;
}
TArray copyTArrayTString(TArray array, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* arrayVector = (std::vector<TArray>*)array;
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<TString>(dimensionCount);
        newArrayVector->resize(arrayVector->size());
        
        for (int i = 0; i < newArrayVector->size(); i++)
        {
            (*newArrayVector)[i] = copyTArrayTString((*arrayVector)[i], dimensionCount - 1);
        }
        
        return (TArray)newArrayVector;
    }
    
    std::vector<TString>* stringVector = (std::vector<TString>*)array;
    
    std::vector<TString>* newStringVector = (std::vector<TString>*)allocateTArray<TString>(dimensionCount);
    newStringVector->resize(stringVector->size());

    for (int i = 0; i < newStringVector->size(); i++)
    {
        (*newStringVector)[i] = copyTString((*stringVector)[i]);
    }

    return (TArray)newStringVector;
}

TArray mergeTArray<Type>(TArray a, TArray b, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* aArrayVector = (std::vector<TArray>*)a;
        TInteger aSize = aArrayVector->size();
        std::vector<TArray>* bArrayVector = (std::vector<TArray>*)b;
        TInteger bSize = bArrayVector->size();
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<Type>(dimensionCount);
        newArrayVector->resize(aSize + bSize);
        
        for (int i = 0; i < aSize; i++)
        {
            (*newArrayVector)[i] = copyTArray<Type>((*aArrayVector)[i], dimensionCount - 1);
        }
        for (int i = 0; i < bSize; i++)
        {
            (*newArrayVector)[i + aSize] = copyTArray<Type>((*bArrayVector)[i], dimensionCount - 1);
        }
        return (TArray)newArrayVector;
    }
    std::vector<Type>* aTypeVector = (std::vector<Type>*)a;
    TInteger aSize = aTypeVector->size();
    std::vector<Type>* bTypeVector = (std::vector<Type>*)b;
    TInteger bSize = bTypeVector->size();

    std::vector<Type>* newTypeVector = (std::vector<Type>*)allocateTArray<Type>(dimensionCount);
    newTypeVector->resize(aSize + bSize);

    for (int i = 0; i < aSize; i++)
    {
        (*newTypeVector)[i] = (*aTypeVector)[i];
    }
    for (int i = 0; i < bSize; i++)
    {
        (*newTypeVector)[i + aSize] = (*bTypeVector)[i];
    }
    return (TArray)newTypeVector;
}
TArray mergeTArrayTString(TArray a, TArray b, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* aArrayVector = (std::vector<TArray>*)a;
        TInteger aSize = aArrayVector->size();
        std::vector<TArray>* bArrayVector = (std::vector<TArray>*)b;
        TInteger bSize = bArrayVector->size();
        
        std::vector<TArray>* newArrayVector = (std::vector<TArray>*)allocateTArray<TString>(dimensionCount);
        newArrayVector->resize(aSize + bSize);
        
        for (int i = 0; i < aSize; i++)
        {
            (*newArrayVector)[i] = copyTArrayTString((*aArrayVector)[i], dimensionCount - 1);
        }
        for (int i = 0; i < bSize; i++)
        {
            (*newArrayVector)[i + aSize] = copyTArrayTString((*bArrayVector)[i], dimensionCount - 1);
        }
        return (TArray)newArrayVector;
    }
    std::vector<TString>* aStringVector = (std::vector<TString>*)a;
    TInteger aSize = aStringVector->size();
    std::vector<TString>* bStringVector = (std::vector<TString>*)b;
    TInteger bSize = bStringVector->size();

    std::vector<TString>* newStringVector = (std::vector<TString>*)allocateTArray<TString>(dimensionCount);
    newStringVector->resize(aSize + bSize);

    for (int i = 0; i < aSize; i++)
    {
        (*newStringVector)[i] = copyTString((*aStringVector)[i]);
    }
    for (int i = 0; i < bSize; i++)
    {
        (*newStringVector)[i + aSize] = copyTString((*bStringVector)[i]);
    }
    return (TArray)newStringVector;
}

TBoolean equalsTArray<Type>(TArray a, TArray b, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* aArrayVector = (std::vector<TArray>*)a;
        TInteger aSize = aArrayVector->size();
        std::vector<TArray>* bArrayVector = (std::vector<TArray>*)b;
        TInteger bSize = bArrayVector->size();
        
        if (aSize != bSize)
        {
            return (TBoolean)false;
        }
        
        for (TInteger i = 0; i < aSize; i++)
        {
            if (equalsTArray<Type>((*aArrayVector)[i], (*bArrayVector)[i], dimensionCount - 1) == (TBoolean)false)
            {
                return (TBoolean)false;
            }
        }
        return (TBoolean)true;
    }
    
    std::vector<Type>* aTypeVector = (std::vector<Type>*)a;
    TInteger aSize = aTypeVector->size();
    std::vector<Type>* bTypeVector = (std::vector<Type>*)b;
    TInteger bSize = bTypeVector->size();
    
    if (aSize != bSize)
    {
        return (TBoolean)false;
    }
    
    for (TInteger i = 0; i < aSize; i++)
    {
        if ((*aTypeVector)[i] != (*bTypeVector)[i])
        {
            return (TBoolean)false;
        }
    }
    return (TBoolean)true;
}
TBoolean equalsTArrayTString(TArray a, TArray b, TInteger dimensionCount)
{
    if (dimensionCount > 1)
    {
        std::vector<TArray>* aArrayVector = (std::vector<TArray>*)a;
        TInteger aSize = aArrayVector->size();
        std::vector<TArray>* bArrayVector = (std::vector<TArray>*)b;
        TInteger bSize = bArrayVector->size();
        
        if (aSize != bSize)
        {
            return (TBoolean)false;
        }
        
        for (TInteger i = 0; i < aSize; i++)
        {
            if (equalsTArrayTString((*aArrayVector)[i], (*bArrayVector)[i], dimensionCount - 1) == (TBoolean)false)
            {
                return (TBoolean)false;
            }
        }
        return (TBoolean)true;
    }
    
    std::vector<TString>* aStringVector = (std::vector<TString>*)a;
    TInteger aSize = aStringVector->size();
    std::vector<TString>* bStringVector = (std::vector<TString>*)b;
    TInteger bSize = bStringVector->size();
    
    if (aSize != bSize)
    {
        return (TBoolean)false;
    }
    
    for (TInteger i = 0; i < aSize; i++)
    {
        if (compareTString((*aStringVector)[i], (*bStringVector)[i]) != (TInteger)0)
        {
            return (TBoolean)false;
        }
    }
    return (TBoolean)true;
}

extern "C"
{
    ////// Boolean functions //////

    // Boolean IO
    TBoolean __pascript__booleanRead()
    {
        TBoolean value;
        std::cin >> value;
        return value;
    }
    void __pascript__booleanPrint(TBoolean value)
    {
        std::cout << value << std::endl;
    }
    
    // Boolean Conversions
    TInteger __pascript__booleanToInteger(TBoolean value)
    {
        return (TInteger)value;
    }
    TFloat __pascript__booleanToFloat(TBoolean value)
    {
        return (TFloat)value;
    }
    TString __pascript__booleanToString(TBoolean value)
    {
        return value ? TRUE_STR : FALSE_STR;
    }
    
    ////// Integer functions //////
    
    // Integer IO
    TInteger __pascript__integerRead()
    {
        TInteger value;
        std::cin >> value;
        return value;
    }
    void __pascript__integerPrint(TInteger value)
    {
        std::cout << value << std::endl;
    }
    
    // Integer Conversions
    TBoolean __pascript__integerToBoolean(TInteger value)
    {
        return (TBoolean)value;
    }
    TFloat __pascript__integerToFloat(TInteger value)
    {
        return (TFloat)value;
    }
    TString __pascript__integerToString(TInteger value)
    {
        return stdStringtoTString(std::to_string(value));
    }
    
    // Integer Operations
    TInteger __pascript__integerPower(TInteger a, TInteger b)
    {
        TInteger value = 1;
        for (TInteger i = 0; i < b; i++)
        {
            value *= a;
        }
        return value;
    }
    TInteger __pascript__integerModulo(TInteger a, TInteger b)
    {
        return (TInteger)(a % b);
    }
    
    ////// Float functions //////
        
    // Float IO
    TFloat __pascript__floatRead()
    {
        TFloat value;
        std::cin >> value;
        return value;
    }
    void __pascript__floatPrint(TFloat value)
    {
        std::cout << value << std::endl;
    }
    
    // Float Conversions
    TBoolean __pascript__floatToBoolean(TFloat value)
    {
        return (TBoolean)value;
    }
    TInteger __pascript__floatToInteger(TFloat value)
    {
        return (TFloat)value;
    }
    TString __pascript__floatToString(TFloat value)
    {
        return stdStringtoTString(std::to_string(value));
    }
    
    // Float Operations
    TFloat __pascript__floatPower(TFloat a, TFloat b)
    {
        return std::pow(a, b);
    }
    TFloat __pascript__floatModulo(TFloat a, TFloat b)
    {
        return (TFloat)(a % b);
    }
    
    ////// String functions //////
    
    // String Memory Management
    TString __pascript__stringAllocate()
    {
        return allocateTString();
    }
    void __pascript__stringDeallocate(TString variable)
    {
        deallocateTString(variable);
    }
    
    // String IO
    TString __pascript__stringRead()
    {
        std::string value;
        std::cin >> value;
        return stdStringtoTString(value);
    }
    void __pascript__stringPrint(TString value)
    {
        std::cout << value << std::endl;
    }

    // String Conversions
    TBoolean __pascript__stringToBoolean(TString value)
    {
        std::string stringValue = std::string(value);
        std::string lowercaseValue = std::transform(
            stringValue.begin(), stringValue.end(), stringValue.begin(), ::tolower
        );
        return lowercaseValue.compare(std::string(TRUE_STR)) == 0;
    }
    TInteger __pascript__stringToInteger(TString value)
    {
        return std::stol(std::string(value));
    }
    TFloat __pascript__stringToFloat(TString value)
    {
        return std::stod(std::string(value));
    }

    // String Operations
    TString __pascript__stringCopy(TString value)
    {
        return copyTString(value);
    }
    TString __pascript__stringGetChar(TString value, TInteger position)
    {
        return stdStringtoTString(std::string(1, std::string(value)[position]));
    }
    TInteger __pascript__stringLength(TString value)
    {
        return (TInteger)std::string(value).length();
    }
    TString __pascript__stringConcatenate(TString a, TString b)
    {
        return stdStringtoTString(std::string(a) + std::string(b));
    }
    TInteger __pascript__stringCompare(TString a, TString b)
    {
        return (TInteger)compareTString(a, b);
    }
    TInteger __pascript__stringFind(TString variable, TString subject)
    {
        return (TInteger)std::string(variable).find(std::string(subject));
    }
    TString __pascript__stringSubstring(TString variable, TInteger position, TInteger length)
    {
        return stdStringtoTString(std::string(variable).substr(position, length));
    }

    ////// Array functions //////
    
    // Array Memory Management
    TArray __pascript__booleanArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TBoolean>(dimensionCount);
    }
    TArray __pascript__integerArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TInteger>(dimensionCount);
    }
    TArray __pascript__floatArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TFloat>(dimensionCount);
    }
    TArray __pascript__stringArrayAllocate(TInteger dimensionCount)
    {
        return allocateTArray<TString>(dimensionCount);
    }
    
    void __pascript__booleanArrayDeallocate(TArray array, TInteger dimensionCount)
    {
        deallocateTArray<TBoolean>(array, dimensionCount);
    }
    void __pascript__integerArrayDeallocate(TArray array, TInteger dimensionCount)
    {
        deallocateTArray<TInteger>(array, dimensionCount);
    }
    void __pascript__floatArrayDeallocate(TArray array, TInteger dimensionCount)
    {
        deallocateTArray<TFloat>(array, dimensionCount);
    }
    void __pascript__stringArrayDeallocate(TArray array, TInteger dimensionCount)
    {
        deallocateTArrayTString(array, dimensionCount);
    }
    
    // Array Get Operation
    TBoolean __pascript__booleanArrayGetValue(TArray array, TInteger position)
    {
        return getValueTArray<TBoolean>(array, position);
    }
    TInteger __pascript__integerArrayGetValue(TArray array, TInteger position)
    {
        return getValueTArray<TInteger>(array, position);
    }
    TFloat __pascript__floatArrayGetValue(TArray array, TInteger position)
    {
        return getValueTArray<TFloat>(array, position);
    }
    TString __pascript__stringArrayGetValue(TArray array, TInteger position)
    {
        return getValueTArrayTString(array, position);
    }
    TArray __pascript__booleanArrayGetArray(TArray array, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TBoolean>(array, dimensionCount, position);
    }
    TArray __pascript__integerArrayGetArray(TArray array, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TInteger>(array, dimensionCount, position);
    }
    TArray __pascript__floatArrayGetArray(TArray array, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArray<TFloat>(array, dimensionCount, position);
    }
    TArray __pascript__stringArrayGetArray(TArray array, TInteger dimensionCount, TInteger position)
    {
        return getArrayTArrayTString(array, dimensionCount, position);
    }
    
    // Array Set Operation
    void __pascript__booleanArraySetValue(TArray array, TInteger position, TBoolean value)
    {
        return setValueTArray<TBoolean>(array, position, value);
    }
    void __pascript__integerArraySetValue(TArray array, TInteger position, TInteger value)
    {
        return setValueTArray<TInteger>(array, position, value);
    }
    void __pascript__floatArraySetValue(TArray array, TInteger position, TFloat value)
    {
        return setValueTArray<TFloat>(array, position, value);
    }
    void __pascript__stringArraySetValue(TArray array, TInteger position, TString value)
    {
        return setValueTArrayTString(array, position, value);
    }
    void __pascript__booleanArraySetArray(TArray array, TInteger dimensionCount, TInteger position, TBoolean value)
    {
        return setArrayTArray<TBoolean>(array, dimensionCount, position, value);
    }
    void __pascript__integerArraySetArray(TArray array, TInteger dimensionCount, TInteger position, TInteger value)
    {
        return setArrayTArray<TInteger>(array, dimensionCount, position, value);
    }
    void __pascript__floatArraySetArray(TArray array, TInteger dimensionCount, TInteger position, TFloat value)
    {
        return setArrayTArray<TFloat>(array, dimensionCount, position, value);
    }
    void __pascript__stringArraySetArray(TArray array, TInteger dimensionCount, TInteger position, TString value)
    {
        return setArrayTArrayTString(array, dimensionCount, position, value);
    }
    
    // Array Insert Operation
    void __pascript__booleanArrayInsertValue(TArray array, TInteger position, TBoolean value)
    {
        insertTArray<TBoolean>(array, position, value);
    }
    void __pascript__integerArrayInsertValue(TArray array, TInteger position, TInteger value)
    {
        insertTArray<TInteger>(array, position, value);
    }
    void __pascript__floatArrayInsertValue(TArray array, TInteger position, TFloat value)
    {
        insertTArray<TFloat>(array, position, value);
    }
    void __pascript__stringArrayInsertValue(TArray array, TInteger position, TString value)
    {
        insertTArray<TString>(array, position, value);
    }
    void __pascript__arrayInsertArray(TArray array, TInteger position, TArray value)
    {
        insertTArray<TArray>(array, position, value);
    }
    
    // Array Remove Operation
    void __pascript__booleanArrayInsertValue(TArray array, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TBoolean>(array, dimensionCount, position);
    }
    void __pascript__integerArrayInsertValue(TArray array, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TInteger>(array, dimensionCount, position);
    }
    void __pascript__floatArrayInsertValue(TArray array, TInteger dimensionCount, TInteger position)
    {
        removeTArray<TFloat>(array, dimensionCount, position);
    }
    void __pascript__stringArrayInsertValue(TArray array, TInteger dimensionCount, TInteger position)
    {
        removeTArrayTString(array, dimensionCount, position);
    }
    
    // Array Size Operation
    void __pascript__booleanArraySize(TArray array)
    {
        sizeTArray<TBoolean>(array);
    }
    void __pascript__integerArraySize(TArray array)
    {
        sizeTArray<TInteger>(array);
    }
    void __pascript__floatArraySize(TArray array)
    {
        sizeTArray<TFloat>(array);
    }
    void __pascript__stringArraySize(TArray array)
    {
        sizeTArray<TString>(array);
    }
    void __pascript__arraySize(TArray array)
    {
        sizeTArray<TArray>(array);
    }
    
    // Array Resize Operation
    void __pascript__booleanArrayResize(TArray array, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TBoolean>(array, dimensionCount, newSize);
    }
    void __pascript__integerArrayResize(TArray array, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TInteger>(array, dimensionCount, newSize);
    }
    void __pascript__floatArrayResize(TArray array, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArray<TFloat>(array, dimensionCount, newSize);
    }
    void __pascript__stringArrayResize(TArray array, TInteger dimensionCount, TInteger newSize)
    {
        resizeTArrayTString(array, dimensionCount, newSize);
    }
    
    // Array Copy Operation
    void __pascript__booleanArrayCopy(TArray array, TInteger dimensionCount)
    {
        copyTArray<TBoolean>(array, dimensionCount);
    }
    void __pascript__integerArrayCopy(TArray array, TInteger dimensionCount)
    {
        copyTArray<TInteger>(array, dimensionCount);
    }
    void __pascript__floatArrayCopy(TArray array, TInteger dimensionCount)
    {
        copyTArray<TFloat>(array, dimensionCount);
    }
    void __pascript__stringArrayCopy(TArray array, TInteger dimensionCount)
    {
        copyTArrayTString(array, dimensionCount);
    }
    
    // Array Merge Operation
    TArray __pascript__booleanArrayMerge(TArray a, TArray b, TInteger dimensionCount)
    {
        return mergeTArray<TBoolean>(a, b, dimensionCount);
    }
    TArray __pascript__integerArrayMerge(TArray a, TArray b, TInteger dimensionCount)
    {
        return mergeTArray<TInteger>(a, b, dimensionCount);
    }
    TArray __pascript__floatArrayMerge(TArray a, TArray b, TInteger dimensionCount)
    {
        return mergeTArray<TFloat>(a, b, dimensionCount);
    }
    TArray __pascript__stringArrayMerge(TArray a, TArray b, TInteger dimensionCount)
    {
        return mergeTArrayTString(a, b, dimensionCount);
    }
    
    // Array Equals Operation
    TBoolean __pascript__booleanArrayEquals(TArray a, TArray b, TInteger dimensionCount)
    {
        return equalsTArray<TBoolean>(a, b, dimensionCount);
    }
    TBoolean __pascript__integerArrayEquals(TArray a, TArray b, TInteger dimensionCount)
    {
        return equalsTArray<TInteger>(a, b, dimensionCount);
    }
    TBoolean __pascript__floatArrayEquals(TArray a, TArray b, TInteger dimensionCount)
    {
        return equalsTArray<TFloat>(a, b, dimensionCount);
    }
    TBoolean __pascript__stringArrayEquals(TArray a, TArray b, TInteger dimensionCount)
    {
        return equalsTArrayTString(a, b, dimensionCount);
    }
    
}