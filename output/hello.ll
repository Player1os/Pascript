@S0 = constant [12 x i8] c"Hello World\00"

define i32 @main()
{
start:
%R1 = getelementptr [12 x i8]* @S0, i8 0, i8 0
%R0 = load i8** %R1
call void @@__pascript__stringPrint(i8* %R0)
anonymous()ret i32 0
}
