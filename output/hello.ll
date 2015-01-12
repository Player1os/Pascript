declare i8* @__pascript__booleanToString(i8)
declare void @__pascript__booleanArrayCopy(i32*, i32)
declare void @__pascript__floatArrayDeallocate(i32*, i32)
declare i32 @__pascript__stringCompare(i8*, i8*)
declare i32* @__pascript__integerArrayAllocate(i32)
declare i32* @__pascript__booleanArrayAllocate(i32)
declare i8* @__pascript__stringArrayGetValue(i32*, i32)
declare void @__pascript__arrayInsertArray(i32*, i32, i32*)
declare void @__pascript__stringPrint(i8*)
declare i8* @__pascript__stringAllocate()
declare void @__pascript__stringArrayRemove(i32*, i32, i32)
declare void @__pascript__integerArrayInsertValue(i32*, i32, i32)
declare void @__pascript__integerArraySetArray(i32*, i32, i32, i32*)
declare void @__pascript__booleanArraySetValue(i32*, i32, i8)
declare i8* @__pascript__stringRead()
declare void @__pascript__integerArrayRemove(i32*, i32, i32)
declare i8 @__pascript__stringToBoolean(i8*)
declare void @__pascript__stringArrayDeallocate(i32*, i32)
declare double @__pascript__floatRead()
declare i8* @__pascript__floatToString(double)
declare void @__pascript__floatArrayResize(i32*, i32, i32)
declare void @__pascript__integerArraySetValue(i32*, i32, i32)
declare i32* @__pascript__stringArrayGetArray(i32*, i32, i32)
declare i32* @__pascript__floatArrayGetArray(i32*, i32, i32)
declare i8 @__pascript__floatArrayEquals(i32*, i32*, i32)
declare void @__pascript__stringDeallocate(i8*)
declare void @__pascript__booleanPrint(i8)
declare double @__pascript__stringToFloat(i8*)
declare void @__pascript__integerPrint(i32)
declare void @__pascript__floatPrint(double)
declare i8 @__pascript__booleanRead()
declare void @__pascript__arraySize(i32*)
declare i8 @__pascript__integerArrayEquals(i32*, i32*, i32)
declare void @__pascript__booleanArrayInsertValue(i32*, i32, i8)
declare i32 @__pascript__integerArrayGetValue(i32*, i32)
declare void @__pascript__stringArraySetValue(i32*, i32, i8*)
declare void @__pascript__floatArraySetValue(i32*, i32, double)
declare double @__pascript__floatArrayGetValue(i32*, i32)
declare i32* @__pascript__integerArrayMerge(i32*, i32*, i32)
declare i8 @__pascript__integerToBoolean(i32)
declare i32* @__pascript__booleanArrayGetArray(i32*, i32, i32)
declare i8* @__pascript__stringSubstring(i8*, i32, i32)
declare void @__pascript__stringArrayResize(i32*, i32, i32)
declare void @__pascript__stringArrayInsertValue(i32*, i32, i8*)
declare void @__pascript__floatArrayRemove(i32*, i32, i32)
declare i8 @__pascript__booleanArrayGetValue(i32*, i32)
declare void @__pascript__floatArrayCopy(i32*, i32)
declare i8* @__pascript__integerToString(i32)
declare i32* @__pascript__floatArrayAllocate(i32)
declare i8* @__pascript__stringConcatenate(i8*, i8*)
declare i32* @__pascript__integerArrayGetArray(i32*, i32, i32)
declare double @__pascript__integerToFloat(i32)
declare i32 @__pascript__booleanToInteger(i8)
declare i32 @__pascript__floatToInteger(double)
declare void @__pascript__integerArrayResize(i32*, i32, i32)
declare void @__pascript__booleanArraySetArray(i32*, i32, i32, i32*)
declare i32 @__pascript__stringFind(i8*, i8*)
declare i32* @__pascript__floatArrayMerge(i32*, i32*, i32)
declare void @__pascript__stringArraySetArray(i32*, i32, i32, i32*)
declare i8* @__pascript__stringCopy(i8*)
declare i32 @__pascript__stringToInteger(i8*)
declare i32 @__pascript__stringLength(i8*)
declare void @__pascript__booleanArrayRemove(i32*, i32, i32)
declare void @__pascript__floatArraySize(i32*)
declare void @__pascript__stringArraySize(i32*)
declare void @__pascript__floatArraySetArray(i32*, i32, i32, i32*)
declare i8 @__pascript__floatToBoolean(double)
declare i8 @__pascript__booleanArrayEquals(i32*, i32*, i32)
declare double @__pascript__booleanToFloat(i8)
declare void @__pascript__integerArrayDeallocate(i32*, i32)
declare i32 @__pascript__integerRead()
declare void @__pascript__booleanArrayResize(i32*, i32, i32)
declare void @__pascript__floatArrayInsertValue(i32*, i32, double)
declare i32* @__pascript__stringArrayMerge(i32*, i32*, i32)
declare void @__pascript__booleanArraySize(i32*)
declare i32* @__pascript__booleanArrayMerge(i32*, i32*, i32)
declare i32* @__pascript__stringArrayAllocate(i32)
declare void @__pascript__integerArraySize(i32*)
declare i8* @__pascript__stringAt(i8*, i32)
declare void @__pascript__stringArrayCopy(i32*, i32)
declare i8 @__pascript__stringArrayEquals(i32*, i32*, i32)
declare void @__pascript__integerArrayCopy(i32*, i32)

@V0 = global i8* null
@V1 = global i32 0

@S5 = constant [30 x i8] c"omg this scllsctztlcs is kewl\00"
@S0 = constant [2 x i8] c" \00"
@S1 = constant [4 x i8] c"Wor\00"
@S3 = constant [6 x i8] c"Hello\00"
@S2 = constant [2 x i8] c"d\00"
@S4 = constant [2 x i8] c"l\00"

define i8* @F0(i8* %R3)
{
L0:
%R4 = alloca i8*
%R5 = call i8* @__pascript__stringCopy(i8* %R3)
store i8* %R5, i8** %R4
%R6 = load i32* @V1
call void @__pascript__integerPrint(i32 %R6)
%R7 = getelementptr [4 x i8]* @S1, i8 0, i8 0
%R8 = call i8* @__pascript__stringCopy(i8* %R7)
%R9 = load i8** %R4
%R10 = call i8* @__pascript__stringCopy(i8* %R9)
%R11 = call i8* @__pascript__stringConcatenate(i8* %R8, i8* %R10)
call void @__pascript__stringDeallocate(i8* %R8)
call void @__pascript__stringDeallocate(i8* %R10)
%R12 = load i8** @V0
%R13 = call i8* @__pascript__stringCopy(i8* %R12)
%R14 = call i8* @__pascript__stringConcatenate(i8* %R11, i8* %R13)
call void @__pascript__stringDeallocate(i8* %R11)
call void @__pascript__stringDeallocate(i8* %R13)
%R15 = getelementptr [2 x i8]* @S2, i8 0, i8 0
%R16 = call i8* @__pascript__stringCopy(i8* %R15)
%R17 = call i8* @__pascript__stringConcatenate(i8* %R14, i8* %R16)
call void @__pascript__stringDeallocate(i8* %R14)
call void @__pascript__stringDeallocate(i8* %R16)
%R18 = load i8** %R4
call void @__pascript__stringDeallocate(i8* %R18)
ret i8* %R17
%R20 = call i8* @__pascript__stringAllocate()
%R19 = load i8** %R4
call void @__pascript__stringDeallocate(i8* %R19)
ret i8* %R20
}

define i32 @main()
{
start:
%R2 = add i32 0, 77
store i32 %R2, i32* @V1
%R0 = getelementptr [2 x i8]* @S0, i8 0, i8 0
%R1 = call i8* @__pascript__stringCopy(i8* %R0)
store i8* %R1, i8** @V0
%R21 = getelementptr [6 x i8]* @S3, i8 0, i8 0
%R22 = call i8* @__pascript__stringCopy(i8* %R21)
%R23 = load i8** @V0
%R24 = call i8* @__pascript__stringCopy(i8* %R23)
%R25 = call i8* @__pascript__stringConcatenate(i8* %R22, i8* %R24)
call void @__pascript__stringDeallocate(i8* %R22)
call void @__pascript__stringDeallocate(i8* %R24)
%R26 = getelementptr [2 x i8]* @S4, i8 0, i8 0
%R27 = call i8* @__pascript__stringCopy(i8* %R26)
%R28 = call i8* @F0(i8* %R27)
call void @__pascript__stringDeallocate(i8* %R27)
%R29 = call i8* @__pascript__stringConcatenate(i8* %R25, i8* %R28)
call void @__pascript__stringDeallocate(i8* %R25)
call void @__pascript__stringDeallocate(i8* %R28)
%R30 = alloca i8*
store i8* %R29, i8** %R30
%R31 = add i32 0, 7
store i32 %R31, i32* @V1
%R32 = add i32 0, 0
%R33 = add i32 0, 2
%R34 = add i32 %R32, %R33
%R35 = load i32* @V1
%R36 = add i32 %R34, %R35
call void @__pascript__integerPrint(i32 %R36)
%R37 = load i8** %R30
%R38 = call i8* @__pascript__stringCopy(i8* %R37)
%R39 = call i8* @F0(i8* %R38)
call void @__pascript__stringDeallocate(i8* %R38)
%R40 = getelementptr [30 x i8]* @S5, i8 0, i8 0
%R41 = call i8* @__pascript__stringCopy(i8* %R40)
%R42 = call i8* @__pascript__stringConcatenate(i8* %R39, i8* %R41)
call void @__pascript__stringDeallocate(i8* %R39)
call void @__pascript__stringDeallocate(i8* %R41)
call void @__pascript__stringPrint(i8* %R42)
call void @__pascript__stringDeallocate(i8* %R42)
%R43 = load i8** %R30
call void @__pascript__stringDeallocate(i8* %R43)
%R44 = load i8** @V0
call void @__pascript__stringDeallocate(i8* %R44)
ret i32 0
}
