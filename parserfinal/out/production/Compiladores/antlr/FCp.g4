grammar FCp;

RESERVED_WORDS: 'START' | 'IF' | 'ELSE' | 'WHILE' | 'INPUT' | 'OUTPUT'
              | 'INT' | 'FLOAT' | 'DOUBLE' | 'CHAR' | 'BOOL' | 'STRING' | 'VOID'   // tipos de dados
              | 'TRUE' | 'FALSE'                                 // valores booleanos
              | 'RETURN' | 'BREAK' | 'CONTINUE'                   // controle de fluxo
              | 'CASE' | 'DEFAULT' | 'SWITCH'                     // switch case
              | 'FOR' | 'DO'                                      // loops
              | 'CONST' | 'STATIC' | 'EXTERN' | 'VOLATILE'       // modificadores de variáveis
              | 'AUTO' | 'REGISTER' | 'TYPEDEF'                   // tipos de variáveis
              | 'STRUCT' | 'CLASS' | 'PUBLIC' | 'PRIVATE' | 'PROTECTED'  // estruturas e visibilidade
              | 'NAMESPACE' | 'USING'                             // namespace
              | 'TRY' | 'CATCH' | 'THROW'                         // exceções
              ;

INT_TYPE: 'INT';
FLOAT_TYPE: 'FLOAT' | 'DOUBLE';
CHAR_TYPE: 'CHAR';
BOOL_TYPE: 'BOOL';
STRING_TYPE: 'STRING';
VOID_TYPE: 'VOID';

END: 'END';
SEMICOLON: ';';
OP_PAR: '(';
CL_PAR: ')';
OP_BRA: '{';
CL_BRA: '}';

ASSIGNMENT_OP: '='  ;
ADD_OP: '+' | '-' ;
MULT_OP: '*' | '**' | '/' | '%' ;
REL_OP: '>' | '>=' | '<' | '<=' ;
EQU_OP: '==' | '!=';
LOGICAL_OP: '&&' | '||';
SINAL : '+' | '-';

INT_VALUES: ('+' | '-')? ('0' .. '9')+;
FLOAT_VALUES: ('+' | '-')? ('0' .. '9')+ '.' ('0' .. '9')+;

STRING_VALUES: '"' ( ~["\\] | '\\' . )* '"';

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

WS: (' ' | '\t' | '\r' | '\n') -> skip;

LINE_COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

start: 'START' SEMICOLON cmdList* END SEMICOLON EOF ;
cmdList: declaration | assignment | exeCmd  ;
declaration: (INT_TYPE IDENTIFIER SEMICOLON ) |
             (FLOAT_TYPE IDENTIFIER SEMICOLON ) |
             (CHAR_TYPE IDENTIFIER SEMICOLON ) |
             (BOOL_TYPE IDENTIFIER SEMICOLON ) |
             (STRING_TYPE IDENTIFIER SEMICOLON ) |
             (VOID_TYPE IDENTIFIER SEMICOLON ) |
             (INT_TYPE IDENTIFIER '=' mathExp SEMICOLON ) |
             (FLOAT_TYPE IDENTIFIER '=' mathExp SEMICOLON ) |
             (CHAR_TYPE IDENTIFIER '=' CHAR_VALUES SEMICOLON ) |
             (BOOL_TYPE IDENTIFIER '=' relExp SEMICOLON ) |
             (STRING_TYPE IDENTIFIER '=' STRING_VALUES SEMICOLON ) |
             (VOID_TYPE IDENTIFIER '=' relExp SEMICOLON );

mathExp: mathTerm ((ADD_OP | MULT_OP) mathTerm)*;
mathTerm: INT_VALUES | FLOAT_VALUES | IDENTIFIER | '(' mathExp ')';

relExp: relTerm ((LOGICAL_OP| EQU_OP | REL_OP) relTerm)*;
relTerm: mathExp | BOOLEAN_VALUES | '(' relExp ')';

assignment: IDENTIFIER ASSIGNMENT_OP (mathExp |  relExp | STRING_VALUES | CHAR_VALUES) SEMICOLON;

exeCmd: inputCmd | outputCmd | whileCmd | ifCmd | switchCmd | forCmd | doCmd | tryCmd;

inputCmd: 'INPUT' IDENTIFIER SEMICOLON;

outputCmd: 'OUTPUT' (IDENTIFIER | STRING_VALUES | CHAR_VALUES) SEMICOLON;

whileCmd: 'WHILE' OP_PAR relExp CL_PAR OP_BRA cmdList* CL_BRA;

ifCmd: 'IF' '(' relExp ')' '{' cmdList* '}' elseCmd?;
elseCmd: 'ELSE' '{' cmdList* '}';

switchCmd: 'SWITCH' OP_PAR IDENTIFIER CL_PAR OP_BRA (caseCmd | defaultCmd)* CL_BRA;
caseCmd: 'CASE' INT_VALUES ':' cmdList*;
defaultCmd: 'DEFAULT' ':' cmdList*;

forCmd: 'FOR' OP_PAR (declaration | assignment | SEMICOLON)? relExp SEMICOLON mathExp? CL_PAR OP_BRA cmdList* CL_BRA;

doCmd: 'DO' OP_BRA cmdList* CL_BRA 'WHILE' OP_PAR relExp CL_PAR SEMICOLON;

tryCmd: 'TRY' OP_BRA cmdList* CL_BRA (catchCmd+)?;

catchCmd: 'CATCH' OP_PAR IDENTIFIER CL_PAR OP_BRA cmdList* CL_BRA;

CHAR_VALUES: '\'' ~[\r\n']* '\'';
