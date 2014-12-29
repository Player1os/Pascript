grammar Pascript;

// Any program consists of up to four sections
// Any and all of these sections could be omitted
module
    : externalSection?
      variableSection?    
      functionSection?
      mainSection
    ;

// The external section contains declarations of external functions

externalSection
    : EXTERNAL_SECTION (functionDeclaration END_STATEMENT)*
    ;

variableSection
    : VARIABLE_SECTION (variableDeclaration END_STATEMENT)*
    ;

functionSection
    : FUNCTION_SECTION (functionDeclaration functionDefinition)*
    ;

mainSection
    : MAIN_SECTION statement*
    ;

functionDeclaration
    : returnDataType functionName=IDENTIFIER PAREN_OPEN parameterList? PAREN_CLOSE
    ;

returnDataType
    : dataType                                           # ValueReturnDataType
    | VOID                                               # VoidReturnDataType
    ;

functionDefinition
    : blockStatement
    ;

parameterList
    : dataType IDENTIFIER ( COMMA dataType IDENTIFIER )*
    ;

argumentList
    : IDENTIFIER ( COMMA IDENTIFIER )*
    ;

statement
    : blockStatement
    | ifStatement
    | whileLoop
    | doWhileLoop
    | forLoop
    | simpleStatement END_STATEMENT
    ;

blockStatement
    : CURLY_OPEN statement* CURLY_CLOSE
    ;

whileLoop
    : WHILE PAREN_OPEN condition=expression PAREN_CLOSE statement
    ;

doWhileLoop
    : DO statement WHILE PAREN_OPEN condition=expression PAREN_CLOSE END_STATEMENT
    ;

forLoop
    : FOR PAREN_OPEN
      initialiser=variableDeclaration END_STATEMENT
      condition=expression END_STATEMENT
      step=expression
      PAREN_CLOSE statement
    ;

ifStatement
    : IF PAREN_OPEN condition=expression PAREN_CLOSE
      trueStatement=statement (ELSE falseStatement=statement)?
    ;

simpleStatement
    : variableDeclaration                               # DeclarationStatement
    
    | PRINT expression                                  # PrintStatement
    | READ expression                                   # ReadStatement
    
    | RETURN                                            # ReturnVoidStatement
    | RETURN expression                                 # ReturnValueStatement
      
    | expression                                        # ExpressionStatement
    ;

variableDeclaration
    : dataType IDENTIFIER                               # SimpleDeclaration
    | dataType IDENTIFIER ASSIGN expression             # AssignDeclaration
    ;

expression
    : operator=(ADD | SUBTRACT | NOT) expression        # UnaryOperation
    | expression operator=POWER<assoc=right> expression # PowerBinaryOperation
    | expression
      operator=
      ( MULTIPLY | DIVIDE | MODULO
      | ADD | SUBTRACT
      | AND | OR | XOR
      | LESS | GREATER
      | LESS_OR_EQUAL | GREATER_OR_EQUAL
      | EQUAL | NOT_EQUAL
      )
      expression                                      # BinaryOperation
    | PAREN_OPEN expression PAREN_CLOSE               # Parenthesis

    | functionName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE            # FunctionCall
    
    | IDENTIFIER ASSIGN expression                    # Assignemnt
    | expression operator=(INCREMENT | DECREMENT)     # ReAssignemnt

    | IDENTIFIER                                      # Variable

    | literal                                         # Constant
    ;

dataType
    : primitiveDataType
    ;
    
primitiveDataType
    : BOOLEAN_DATATYPE                                # BooleanDataType
    | INTEGER_DATATYPE                                # IntegerDataType
    | FLOAT_DATATYPE                                  # FloatDataType
    | STRING_DATATYPE                                 # StringDataType
    ;

literal
    : primitiveLiteral
    ;

primitiveLiteral 
    : value=(TRUE | FALSE)                            # BooleanLiteral
    | value=INTEGER                                   # IntegerLiteral
    | value=FLOAT                                     # FloatLiteral
    | value=STRING                                    # StringLiteral
    ;

LINE_COMMENT: '//' .*? NEWLINE* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
NEWLINE: [\n\r] -> skip;
WHITESPACE: [\t ] -> skip;

EXTERNAL_SECTION: 'external:';
VARIABLE_SECTION: 'variable:';
FUNCTION_SECTION: 'function:';
MAIN_SECTION: 'main:';

COMMA: ',';
END_STATEMENT: ';';

PAREN_OPEN: '(';
PAREN_CLOSE: ')';

SQUARE_OPEN: '[';
SQUARE_CLOSE: ']';

CURLY_OPEN: '{';
CURLY_CLOSE: '}';

PRINT: '<-';
READ: '->';
RETURN: 'return';

IF: 'if';
ELSE: 'else';

WHILE: 'while';
DO: 'do';
FOR: 'for';

POWER: '**';

MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

INCREMENT: '++';
DECREMENT: '--';

ADD: '+';
SUBTRACT: '-';

SHIFT_LEFT: '<<';
SHIFT_RIGHT: '>>';

AND: '&&';
OR: '||';
XOR: '^^';
NOT: '!';

LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';

LESS: '<';
GREATER: '>';

EQUAL: '==';
NOT_EQUAL: '!=';

ASSIGN: '=';

VOID: 'void';
BOOLEAN_DATATYPE: 'bool';
INTEGER_DATATYPE: 'int';
FLOAT_DATATYPE: 'float';
STRING_DATATYPE: 'string';

STRING: '"'.*?'"';
FLOAT: ('0' | [1-9][0-9]*)'.'[0-9]*;
INTEGER: '0' | [1-9][0-9]*;
TRUE: 'true';
FALSE: 'false';

IDENTIFIER: [a-z_][a-z_0-9]*;

/*
classSection?

classSection:
    CLASS_SECTION
    (classDeclaration classDefinition)*
    ;

classDeclaration:
    className=IDENTIFIER PAREN_OPEN parentClassName=IDENTIFIER PAREN_CLOSE
    ;

classDefinition:
    BLOCK_START 
    classPropertiesSection?
    classMethodsSection?
    BLOCK_END
    ;

classPropertiesSection:
    (variableDeclaration)*
    ;

classPropertiesSection:
    (functionDeclaration functionDefinition)*
    ;
*/

/*
    | objectName=IDENTIFIER DOT propertyName=IDENTIFIER # Property

    | NEW className=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE              # ConstructorCall
    | objectName=IDENTIFIER DOT methodName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE              # MethodCall
*/

/*
compositeDataType:
    '(' primitiveDataType (',' primitiveDataType)* ')'
    ;
                     
containerDataType:
      dataType '[' ']'                                     # ArrayDataType
    | dataType '<' '>'                                     # SetDataType
    | primitiveDataType '{' dataType '}'                   # MapDataType
    ;
*/

/*
compositeLiteral:
    '(' primitiveLiteral (',' primitiveLiteral)* ')'
    ;

containerLiteral:
      '[' (literal (',' literal)* )? ']'              # ListLiteral
    | '{' (pairLiteral (',' pairLiteral)* )? '}'      # DictionaryLiteral
    ;

pairLiteral:
    primitiveLiteral ':' literal
    ;
*/

/*
| compositeLiteral
| containerLiteral
*/

/*  
    | compositeDataType
    | containerDataType
    | classDataType
*/
/*
classDataType:
    IDENTIFIER
    ;
*/

/*
    //| whileLoop
    //| doWhileLoop
    //| forLoop
*/

/*
    | IDENTIFIER '[' expression ']'                     # Element
*/