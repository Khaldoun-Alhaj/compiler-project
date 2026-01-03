lexer grammar CSSLexer;
@header { package antlr; }

CSSCOMMENT : '/*' .*? '*/' -> skip ;

LBRACE : '{';
RBRACE : '}';
COLON : ':';
SEMI : ';';
HASH : '#';
DOT : '.';
COMMA : ',';
LPAREN : '(';
RPAREN : ')';

// تحسين: دعم أرقام عشرية وصحيحة مع وحدات متعددة
NUMBER_VAL
    : [0-9]+ '.' [0-9]+ UNIT?  // مثل: 1.5px
    | [0-9]+ UNIT?              // مثل: 10px أو 0
    ;

fragment UNIT
    : 'px' | 'em' | 'rem' | '%' | 's' | 'ms'
    | 'vh' | 'vw' | 'vmin' | 'vmax'
    ;

STRING : '\'' .*? '\'' | '"' .*? '"' ;
HEX_COLOR : '#' [0-9a-fA-F]+ ;
IDENT : [a-zA-Z-][a-zA-Z0-9-]* ;
WS : [ \t\r\n]+ -> skip ;