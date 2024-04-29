grammar PythonStaticTyping;

// Lexer Rules
// Tokes
NUMBER: '-'? ( '0' | [1-9] [0-9]* ) ( '.' [0-9]+ )? ( ('e' | 'E') [+-]? [0-9]+ )?;
STRING: '"' ( '\\' . | ~["\\] )* '"' | '\'' ( '\\' . | ~['\\] )* '\'';
TYPE_ANNOTATION: '->';
IN: 'in';
COLON: ':';
COMMA: ',';
SEMI: ';';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
VBAR: '|';
AMPERSAND: '&'; // Fixed token name
LESS: '<';
GREATER: '>';
EQUAL: '=';
DOT: '.';
PERCENT: '%';
EQEQUAL: '==';
NOTEQUAL: '!=';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';
TILDE: '~';
PLUSEQUAL: '+=';
MINEQUAL: '-=';
STAREQUAL: '*=';
SLASHEQUAL: '/=';
PERCENTEQUAL: '%=';
EXCLAMATION: '!';
NULL: 'null';
DECIMALINTLITERAL: '0' | [1-9] [0-9]*;

// Keywords
BREAK: 'break';
ELSE: 'else';
RETURN: 'return';
CONTINUE: 'continue';
DEF: 'def';
IF: 'if';
WHILE: 'while';
FOR: 'for';
CLASS: 'class';

// Comments
COMMENT: '#' ~[\r\n]* -> skip;

// Delimiters
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';

// Type annotations
INT: 'int';
STR: 'string';
FLOAT: 'float';
COMPLEX: 'complex';
BOOLEAN: ('True' | 'False'); // Fixed token names
LIST: 'list';
TUPLE: 'tuple';
DICT: 'dict';
SET: 'set';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;


INDENT: 'INDENT';
DEDENT: 'DEDENT';
//NEWLINE: '\n';

// Parser rules
program: statements EOF;

statements: statement (NEWLINE+ statement)* NEWLINE?;

statement: expression_statement
         | assignment_statement
         | if_statement
         | while_statement
         | for_statement
         | function_definition
         | class_definition
         | COMMENT;

function_statement: expression_statement
         | assignment_statement
         | if_statement
         | while_statement
         | for_statement
         | function_definition
         | class_definition
         | COMMENT
         | return_statement;

expression_statement : expression NEWLINE?;

assignment_statement : IDENTIFIER COLON type EQUAL expression SEMI?;

if_statement : IF expression COLON INDENT statements DEDENT;

while_statement : WHILE expression COLON INDENT statements DEDENT;

for_statement : FOR IDENTIFIER IN expression COLON NEWLINE statements NEWLINE statement?;

function_definition : DEF IDENTIFIER OPEN_PAREN typed_parameters? CLOSE_PAREN TYPE_ANNOTATION type COLON NEWLINE function_statement (NEWLINE function_statement)* NEWLINE statement?;

expression_list : expression (COMMA expression)*;

typed_parameters : typed_parameter (COMMA typed_parameter)*;

typed_parameter : IDENTIFIER COLON TYPE_ANNOTATION;

class_definition : CLASS IDENTIFIER COLON INDENT statements DEDENT;

return_statement : RETURN expression? SEMI?;

expression : primary ((PLUS | MINUS | STAR | SLASH | AMPERSAND | LESS | GREATER | PERCENT | EQEQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL) primary)*;

primary : IDENTIFIER
        | NUMBER
        | STRING
        | OPEN_PAREN expression CLOSE_PAREN
        | OPEN_BRACKET expression_list CLOSE_BRACKET
        | OPEN_BRACE expression CLOSE_BRACE
        | function_call;

function_call : IDENTIFIER OPEN_PAREN expression_list? CLOSE_PAREN;

type : INT
     | STR
     | FLOAT
     | COMPLEX
     | BOOLEAN
     | LIST
     | TUPLE
     | DICT
     | SET;

// Tokens
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

//program: statements EOF;
//
//statements: statement (NEWLINE statement)* NEWLINE?;
//
//statement: assignment_statement | if_statement;
//
//assignment_statement: type IDENTIFIER EQUAL expression;
//
//if_statement: 'if' expression ':' INDENT statements DEDENT;
//
//type: 'int' | 'str' | 'float' | 'bool';
//
//expression: simple_expression operator simple_expression | simple_expression;
//
//simple_expression: IDENTIFIER | NUMBER | STRING | OPEN_PAREN expression CLOSE_PAREN;
//
//operator: PLUS | MINUS;
//
//WS: [ ]+ -> skip;
//

