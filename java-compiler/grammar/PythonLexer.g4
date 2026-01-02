lexer grammar PythonLexer;

@header { package antlr; }

// Keywords
DEF    : 'def' ;
RETURN : 'return' ;

// Flask Decorator (e.g., @app.route('/'))
DECORATOR : '@' [a-zA-Z_][a-zA-Z0-9_.]* '(' .*? ')' ;

// Symbols
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[' ;
RBRACK : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;
COLON  : ':' ;
COMMA  : ',' ;
ASSIGN : '=' ;

// Identifiers & Literals
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING : '"' .*? '"' | '\'' .*? '\'' ;
NUMBER : [0-9]+ ;

// Whitespace
WS     : [ \t\r\n]+ -> skip ;