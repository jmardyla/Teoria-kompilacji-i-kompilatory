# TKiK Projekt - Interpreter Python ze statycznym typowaniem 
## Autorzy: Jan Mardyła, Agata Marczyk
<details><summary>Dane kontaktowe</summary>
<ul>
    <li>agatamarczyk@student.agh.edu.pl</li> 
    <li>mardyla@student.agh.edu.pl</li>
</ul>
</details>

## Założenia Projektu 
<ul>
    <li>Stworzenie interpretera języka Python ze statycznym typowaniem</li>
    <li>Rodzaj translatora: Interpreter</li>
    <li>Język implementaji: Python</li>
    <li>Wykorzystywany generator parserów: ANTLR</li>
</ul>

## Tokeny
1. IDENTIFIER: [a-zA-z_][a-zA-Z0-9_]*
2. NUMBER: -?(?:0|[1-9]\d*)(?:\.\d+)?(?:[eE][+-]?\d+)?
3. STRING: \"(?:\\.|[^\"\\])*\"|\'(?:\\.|[^\'\\])*\'
4. INDENT: Wykorzystywane w parserach, nie jest reprezentowane jako token w źródle kodu
5. DEDENT: Wykorzystywane w parserach, nie jest reprezentowane jako token w źródle kodu.
6. NEWLINE: \n|\r\n?
7. COLON: ":"
8. COMMA: ","
9. SEMI: ";"
10. PLUS: "+"
11. MINUS: "-"
12. STAR: "*"
13. SLASH: "/"
14. VBAR: "|"
15. AMPERSANT: "&"
16. LESS: "<"
17. GREATER: ">"
18. EQUAL: "="
19. DOT: "."
20. PERCENT: "%"
21. EQEQUAL: "=="
22. NOTEQUAL: "!="
23. LESSEQUAL: "<="
24. GREATEREQUAL: ">="
25. TILDE: "~"
26. PLUSEQUAL: "+="
27. MINEQUAL: "-="
28. STAREQUAL: "*="
29. SLASHEQUAL: "/="
30. PERCENTEQUAL: "%="
31. EXCLAMATION: "!"
32. NULL: null 
33. DECIMALINTLITERAL: 0|[1-9]\d*
34. KEYWORD: 
    - 'break' 
    - 'else'
    - 'return'
    - 'continue'
    - 'def'
    - 'if'
    - 'while'
    - 'for'
    - 'class'
35. COMMENT: "#.*"
36. OPEN_PAREN: OPEN_PAREN: "\ ("
37. CLOSE_PAREN: CLOSE_PAREN: "\ )"
38. OPEN_BRACKET: "[ \ "
39. CLOSE_BRACKET: "\ ]"
40. OPEN_BRACE: "\ {"
41. CLOSE_BRACE: "\ }"
42. TYPE_ANNOTATION: 
    - INT: "int"
    - STR: "string"
    - FLOAT: "float"
    - COMPLEX: "complex"
    - BOOLEAN: "true|false"
    - LIST: "list"
    - TUPLE: "tuple"
    - DICT: "dict"
    - SET: "set"

## Gramatyka
```diff
program : statements EOF

statements : statement (NEWLINE statement)* NEWLINE?

statement : expression_statement
          | assignment_statement
          | if_statement
          | while_statement
          | for_statement
          | function_definition
          | class_definition
          | break_statement
          | continue_statement
          | return_statement
          | COMMENT
expression_statement : expression NEWLINE

assignment_statement : IDENTIFIER EQUAL expression NEWLINE

if_statement : IF expression COLON INDENT statements DEDENT

while_statement : WHILE expression COLON INDENT statements DEDENT

for_statement : FOR IDENTIFIER IN expression COLON INDENT statements DEDENT

function_definition : DEF IDENTIFIER OPEN_PAREN typed_parameters? CLOSE_PAREN '->' TYPE_ANNOTATION COLON INDENT statements DEDENT

typed_parameters : typed_parameter (COMMA typed_parameter)*

typed_parameter : IDENTIFIER COLON TYPE_ANNOTATION

class_definition : CLASS IDENTIFIER COLON INDENT statements DEDENT

break_statement : BREAK NEWLINE

continue_statement : CONTINUE NEWLINE

return_statement : RETURN expression? NEWLINE

expression : simple_expression ((PLUS | MINUS | STAR | SLASH | AMPERSANT | LESS | GREATER | EQUAL | PERCENT | EQEQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL) simple_expression)*

simple_expression : primary ((PLUS | MINUS) primary)*

primary : IDENTIFIER
        | NUMBER
        | STRING
        | OPEN_PAREN expression CLOSE_PAREN
        | OPEN_BRACKET expression CLOSE_BRACKET
        | OPEN_BRACE expression CLOSE_BRACE
```

