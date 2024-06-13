grammar Language;

start: classDefinition EOF; // EOF (END OF A FILE) convenção usada pelo ANTLR para geração de analisadores léxicos e sintáticos

classDefinition: 'class' Identifier '{' classBody '}';

classBody: classMember*;

classMember:
	typeSpecifier Identifier '=' expression ';'
	| functionDefinition
	| ';'; // Permite membros de classe vazios

functionDefinition: typeSpecifier declarator compoundStatement;

compoundStatement: '{' (declaration | statement)* '}';

statement:
	labeledStatement
	| compoundStatement
	| expressionStatement
	| selectionStatement
	| iterationStatement
	| jumpStatement
	| ';'; // Permite statements vazios

labeledStatement:
	Identifier ':' statement
	| 'case' constantExpression ':' statement
	| 'default' ':' statement;

expressionStatement: expression? ';';

// TODOS OS STATEMENTS
selectionStatement:
	'if' '(' expression ')' statement ('else' statement)?
	| 'switch' '(' expression ')' statement;

iterationStatement:
	'while' '(' expression ')' statement
	| 'do' statement 'while' '(' expression ')' ';'
	| 'for' '(' expressionStatement expressionStatement? expression? ')' statement;

jumpStatement:
	'goto' Identifier ';'
	| 'continue' ';'
	| 'break' ';'
	| 'return' expression? ';';

//Declaração de uma variável com um tipo e um identificador dela
declaration: typeSpecifier declaratorList?;

declaratorList: declarator (',' declarator)*;

declarator: pointer? directDeclarator;

//Um ponteiro é um asteriscos opcionais seguidos por um modificador de tipo
pointer: '*' ('*' | typeQualifier)*;

typeQualifier: 'const' | 'volatile';

directDeclarator:
	Identifier
	| '(' declarator ')'
	| directDeclarator '[' constantExpression? ']'
	| directDeclarator '(' parameterList? ')'
	| directDeclarator '(' identifierList? ')'
	| directDeclarator '(' identifierList? ')' '{' initializerList? '}'
	| directDeclarator '(' ')';

parameterList: parameterDeclaration (',' parameterDeclaration)*;

identifierList: Identifier (',' Identifier)*;

initializerList: initializer (',' initializer)*;

initializer:
	assignmentExpression
	| '{' initializerList '}'
	| '{' initializerList ',' '}';

// Especifica o tipo que pode ser um tipo básico, uma struct, uma union, um enum ou um typedef ...
typeSpecifier:
	'void'
	| 'char'
	| 'short'
	| 'int'
	| 'long'
	| 'float'
	| 'double'
	| 'signed'
	| 'unsigned'
	| structOrUnionSpecifier
	| enumSpecifier
	| typedefName;

structOrUnionSpecifier:
	structOrUnion Identifier? '{' structDeclarationList '}'
	| structOrUnion Identifier;

structOrUnion: 'struct' | 'union';

structDeclarationList: structDeclaration+;

//Declaração em uma struct
structDeclaration:
	specifierQualifierList structDeclaratorList? ';';

//uma lista de especificadores de um tipo
specifierQualifierList: (typeSpecifier | typeQualifier)+;

// uma lista de declaradores de struct
structDeclaratorList: structDeclarator (',' structDeclarator)*;

constantExpression: conditionalExpression;

structDeclarator:
	declarator
	| declarator? ':' constantExpression;

//Especificação para um ENUM
enumSpecifier:
	'enum' Identifier? '{' enumeratorList? '}'
	| 'enum' Identifier;

enumeratorList: enumerator (',' enumerator)*;

enumerator:
	EnumerationConstant
	| EnumerationConstant '=' constantExpression;

expression: assignmentExpression (',' assignmentExpression)*;

assignmentExpression:
	conditionalExpression
	| unaryExpression assignmentOperator assignmentExpression;

// Operadores :
assignmentOperator:
	'='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|=';

// TODAS EXPRESSOES CONDICIONAIS
conditionalExpression:
	logicalOrExpression (
		'?' expression ':' conditionalExpression
	)?;

logicalOrExpression:
	logicalAndExpression ('||' logicalAndExpression)*;

logicalAndExpression:
	inclusiveOrExpression ('&&' inclusiveOrExpression)*;

inclusiveOrExpression:
	exclusiveOrExpression ('|' exclusiveOrExpression)*;

exclusiveOrExpression: andExpression ('^' andExpression)*;

andExpression: equalityExpression ('&' equalityExpression)*;

equalityExpression:
	relationalExpression (('==' | '!=') relationalExpression)*;

relationalExpression:
	shiftExpression (('<' | '>' | '<=' | '>=') shiftExpression)*;

shiftExpression:
	additiveExpression (('<<' | '>>') additiveExpression)*;

additiveExpression:
	multiplicativeExpression (
		('+' | '-') multiplicativeExpression
	)*;

multiplicativeExpression:
	castExpression (('*' | '/' | '%') castExpression)*;

castExpression:
	'(' typeName ')' castExpression
	| '(' typeName ')' Identifier
	| unaryExpression;

unaryOperator: '&' | '*' | '+' | '-' | '~' | '!';

unaryExpression:
	postfixExpression
	| ('++' | '--') unaryExpression
	| unaryOperator castExpression
	| 'sizeof' unaryExpression
	| 'sizeof' '(' typeName ')';

postfixExpression:
	primaryExpression
	| postfixExpression '[' expression ']'
	| postfixExpression '(' argumentExpressionList? ')'
	| postfixExpression '.' Identifier
	| postfixExpression '->' Identifier
	| postfixExpression '++'
	| postfixExpression '--';

// expressões primárias
primaryExpression:
	Identifier
	| Constant
	| StringLiteral
	| '(' expression ')';

argumentExpressionList:
	assignmentExpression (',' assignmentExpression)*;

typeName: specifierQualifierList (abstractDeclarator | /* empty */)?;

abstractDeclarator: pointer? directAbstractDeclarator?;

directAbstractDeclarator:'(' abstractDeclarator ')'
	| directAbstractDeclarator? '[' constantExpression? ']'
	| directAbstractDeclarator? '(' ')'
	| directAbstractDeclarator? '(' parameterTypeList ')';

parameterTypeList: parameterList | parameterList ',' '...';

parameterDeclaration: typeSpecifier parameterDeclarator;

parameterDeclarator:
	Identifier
	| '*' parameterDeclarator
	| parameterDeclarator '[' ']'
	| parameterDeclarator '(' ')';

typedefName: Identifier;

Identifier: [a-zA-Z_][a-zA-Z0-9_]*;

Constant:
	IntegerConstant
	| FloatingConstant
	| EnumerationConstant
	| CharacterConstant;

StringLiteral: '"' .*? '"';

fragment Digit: [0-9];

fragment Sign: ('+' | '-');

IntegerConstant: Digit+;

FloatingConstant:
	Digit+ '.' Digit* ('E' Sign? Digit+)?
	| '.' Digit+ ('E' Sign? Digit+)?
	| Digit+ 'E' Sign? Digit+;

CharacterConstant: '\'' . '\'';

EnumerationConstant: Identifier;

Whitespace: [ \t\r\n] -> skip;
