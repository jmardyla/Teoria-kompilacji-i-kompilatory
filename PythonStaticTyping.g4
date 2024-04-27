grammar PythonStaticTyping;

// Lexer Rules
// Tokens
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
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
PRINT: 'print';

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

// Parser rules
program: statements EOF;

statements: statement (NEWLINE statement)* NEWLINE?;

statement: expression_statement
         | assignment_statement
         | if_statement
         | while_statement
         | for_statement
         | function_definition
         | class_definition
         | break_statement
         | continue_statement
         | return_statement
         | COMMENT;

expression_statement : expression NEWLINE?;

assignment_statement : IDENTIFIER EQUAL expression SEMI?;

if_statement : IF expression COLON INDENT statements DEDENT;

while_statement : WHILE expression COLON INDENT statements DEDENT;

for_statement : FOR IDENTIFIER IN expression COLON INDENT statements DEDENT;

function_definition : DEF IDENTIFIER OPEN_PAREN typed_parameters? CLOSE_PAREN TYPE_ANNOTATION COLON INDENT statements DEDENT;

typed_parameters : typed_parameter (COMMA typed_parameter)*;

typed_parameter : IDENTIFIER COLON TYPE_ANNOTATION;

class_definition : CLASS IDENTIFIER COLON INDENT statements DEDENT;

break_statement : BREAK SEMI?;

continue_statement : CONTINUE SEMI?;

return_statement : RETURN expression? SEMI?;

expression : simple_expression ((PLUS | MINUS | STAR | SLASH | AMPERSAND | LESS | GREATER | EQUAL | PERCENT | EQEQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL) simple_expression)*;

simple_expression : primary ((PLUS | MINUS) primary)*;

primary : IDENTIFIER
        | NUMBER
        | STRING
        | OPEN_PAREN expression CLOSE_PAREN
        | OPEN_BRACKET expression CLOSE_BRACKET
        | OPEN_BRACE expression CLOSE_BRACE;

// Indentation rules
INDENT: 'INDENT';
DEDENT: 'DEDENT';

NEWLINE: '\r'? '\n' -> skip;

WS: [ \t]+ -> skip;
