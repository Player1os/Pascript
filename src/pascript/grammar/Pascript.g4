grammar Pascript;

@header
{
package pascript.grammar;
}

// Any program consists of up to four sections
// Any of these sections could be omitted 
//   with the exception of the Main section
module
    : MODULE_BEGIN
      externalSection?
      variableSection?    
      functionSection?
      mainSection
      MODULE_END
    ;

// The external section contains declarations of external functions

externalSection
    : EXTERNAL_SECTION_BEGIN (externalFunctionDeclaration END_STATEMENT)* EXTERNAL_SECTION_END
    ;

// The variable section contains declarations of global variables

variableSection
    : VARIABLE_SECTION_BEGIN (globalVariableDeclaration END_STATEMENT)* VARIABLE_SECTION_END
    ;

// The function section contains definitions of local functions

functionSection
    : FUNCTION_SECTION_BEGIN (functionDeclaration functionDefinition)* FUNCTION_SECTION_END
    ;

// The main section contains the code that is executed upon running the program
mainSection
    : MAIN_SECTION_BEGIN statement* MAIN_SECTION_END
    ;

externalFunctionDeclaration
    : returnDataType functionName=IDENTIFIER PAREN_OPEN parameterList? PAREN_CLOSE
    ;

functionDeclaration
    : returnDataType functionName=IDENTIFIER PAREN_OPEN namedParameterList? PAREN_CLOSE
    ;

returnDataType
    : dataType                                                       # ReturnValueDataType
    | VOID_DATATYPE                                                  # ReturnVoidDataType
    ;

functionDefinition
    : blockStatement
    ;

parameterList
    : dataType ( COMMA dataType )*
    ;

namedParameterList
    : dataType IDENTIFIER ( COMMA dataType IDENTIFIER )*
    ;

statement
    : blockStatement                                                 # CompositeStatement
    | IF PAREN_OPEN condition=expression PAREN_CLOSE
      trueStatement=statement (ELSE falseStatement=statement)?       # IfStatement
    | WHILE PAREN_OPEN condition=expression PAREN_CLOSE statement    # WhileLoop
    | DO statement WHILE
      PAREN_OPEN condition=expression PAREN_CLOSE END_STATEMENT      # DoWhileLoop
    | FOR PAREN_OPEN
      initializer=variableDeclaration END_STATEMENT
      condition=expression END_STATEMENT
      step=expression
      PAREN_CLOSE statement                                          # ForLoop
    | basicStatement END_STATEMENT                                   # SimpleStatement
    ;

blockStatement
    : CURLY_OPEN statement* CURLY_CLOSE
    ;

basicStatement
    : variableDeclaration                                            # DeclarationStatement
    
    | PRINT expression                                               # PrintStatement
    | READ IDENTIFIER                                                # ReadStatement
    | DELETE IDENTIFIER                                              # DeleteStatement
    
    | RETURN                                                         # ReturnVoidStatement
    | RETURN expression                                              # ReturnValueStatement
      
    | expression                                                     # ExpressionStatement

    ;

globalVariableDeclaration
    : dataType IDENTIFIER                                            # SimpleGlobalDeclaration
    | dataType IDENTIFIER ASSIGN literal                             # AssignGlobalDeclaration
    ;

variableDeclaration
    : dataType IDENTIFIER                                            # SimpleDeclaration
    | dataType IDENTIFIER ASSIGN expression                          # AssignDeclaration
    ;

expression
    : operator=(SUBTRACT | NOT) expression                           # UnaryOperation
    | expression
      operator=
      ( MULTIPLY | DIVIDE | MODULO
      | ADD | SUBTRACT
      | AND | OR | XOR
      | LESS | GREATER
      | LESS_OR_EQUAL | GREATER_OR_EQUAL
      | EQUAL | NOT_EQUAL
      )
      expression                                                     # BinaryOperation
    | PAREN_OPEN expression PAREN_CLOSE                              # Parenthesis

    | functionName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE                           # FunctionCall
    | variableName=IDENTIFIER DOT methodName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE                           # MethodCall
    
    | IDENTIFIER ASSIGN expression                                   # Assignment
    | IDENTIFIER operator=(INCREMENT | DECREMENT)                    # ReAssignment
    | IDENTIFIER                                                     # VariableValue

    | literal                                                        # ConstantValue
    ;

argumentList
    : expression ( COMMA expression )*
    ;

dataType
    : primitiveDataType
    | arrayDataType
    ;
                     
primitiveDataType
    : BOOLEAN_DATATYPE                                               # BooleanDataType
    | INTEGER_DATATYPE                                               # IntegerDataType
    | FLOAT_DATATYPE                                                 # FloatDataType
    | STRING_DATATYPE                                                # StringDataType
    ;

arrayDataType
    : primitiveDataType (SQUARE_OPEN SQUARE_CLOSE)+
    ;

literal
    : value=(TRUE | FALSE)                                           # BooleanLiteral
    | value=INTEGER                                                  # IntegerLiteral
    | value=FLOAT                                                    # FloatLiteral
    | value=STRING                                                   # StringLiteral
    ;    

LINE_COMMENT: '//' .*? NEWLINE+ -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

NEWLINE: [\n\r] -> skip;
WHITESPACE: [\t ] -> skip;

MODULE_BEGIN: '<module>';
MODULE_END: '</module>';

EXTERNAL_SECTION_BEGIN: '<external>';
EXTERNAL_SECTION_END: '</external>';
VARIABLE_SECTION_BEGIN: '<variable>';
VARIABLE_SECTION_END: '</variable>';
FUNCTION_SECTION_BEGIN: '<function>';
FUNCTION_SECTION_END: '</function>';
MAIN_SECTION_BEGIN: '<main>';
MAIN_SECTION_END: '</main>';

COMMA: ',';
DOT: '.';
END_STATEMENT: ';';

PAREN_OPEN: '(';
PAREN_CLOSE: ')';

SQUARE_OPEN: '[';
SQUARE_CLOSE: ']';

CURLY_OPEN: '{';
CURLY_CLOSE: '}';

PRINT: '<-';
READ: '->';
DELETE: 'delete';
RETURN: 'return';

IF: 'if';
ELSE: 'else';

WHILE: 'while';
DO: 'do';
FOR: 'for';

MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

INCREMENT: '++';
DECREMENT: '--';

ADD: '+';
SUBTRACT: '-';

AND: '&';
OR: '|';
XOR: '^';
NOT: '!';

LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';

LESS: '<';
GREATER: '>';

EQUAL: '==';
NOT_EQUAL: '!=';

ASSIGN: '=';

VOID_DATATYPE: 'void';
BOOLEAN_DATATYPE: 'bool';
INTEGER_DATATYPE: 'int';
FLOAT_DATATYPE: 'float';
STRING_DATATYPE: 'string';

STRING: '"' (~[\n\r])*? '"';
FLOAT: ('0' | [1-9][0-9]*)'.'[0-9]*;
INTEGER: '0' | [1-9][0-9]*;
TRUE: 'true';
FALSE: 'false';

IDENTIFIER: [a-z_][a-z_0-9]*;