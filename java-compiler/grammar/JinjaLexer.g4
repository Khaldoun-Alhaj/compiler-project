lexer grammar JinjaLexer;

@header {
    package antlr;
}

// Blocks and Expressions
STMT_OPEN  : '{%' ;
STMT_CLOSE : '%}' ;
EXPR_OPEN  : '{{' ;
EXPR_CLOSE : '}}' ;

// Keywords
FOR    : 'for' ;
IN     : 'in' ;
ENDFOR : 'endfor' ;
IF     : 'if' ;
ELSE   : 'else' ;
ENDIF  : 'endif' ;

// Operators and Symbols
DOT    : '.' ;
EQUALS : '==' ;
ASSIGN : '=' ;
COMMA  : ',' ;

// Identifiers (Variable names, function names)
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;

// Literals
STRING : '"' .*? '"' | '\'' .*? '\'' ;
NUMBER : [0-9]+ ;

// Skip whitespace inside Jinja tags
WS : [ \t\r\n]+ -> skip ;