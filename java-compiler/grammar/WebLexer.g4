lexer grammar WebLexer;
@header { package antlr; }

HTML_COMMENT: '<!--' .*? '-->' -> skip ;
JINJA_COMMENT: '{#' .*? '#}' -> skip;
WS: [ \t\r\n]+ -> skip ;

JINJA_STMT_OPEN: '{%' -> pushMode(JINJA_MODE) ;
JINJA_EXPR_OPEN: '{{' -> pushMode(JINJA_MODE) ;
STYLE_OPEN: '<style' -> pushMode(STYLE_TAG_MODE) ;
TAG_OPEN: '<' -> pushMode(TAG_MODE) ;

// Prevent text from consuming code delimiters
HTML_TEXT: (~[<{]|'{'~[%{#{])+ ;

mode STYLE_TAG_MODE;
STYLE_TAG_CLOSE: '>' -> mode(CSS_MODE) ;
STYLE_ID: [a-zA-Z-]+ ;
STYLE_EQUALS: '=' ;
STYLE_ATTR_VAL: '"' .*? '"' | '\'' .*? '\'' ;
STYLE_WS: [ \t\r\n]+ -> skip ;

mode TAG_MODE;
TAG_CLOSE: '>' -> popMode ;
TAG_SLASH_CLOSE: '/>' -> popMode ;
SLASH: '/' ;
EQUALS: '=' ;
HTML_ID: [a-zA-Z][a-zA-Z0-9-]* ;

// ✅ CRITICAL FIX: استخدام الرموز الحرفية بدلاً من الإشارة لتوكنز غير موجودة
ATTR_VALUE: '"' ( '{{' .*? '}}' | ~["\r\n] )* '"'
          | '\'' ( '{{' .*? '}}' | ~['\r\n] )* '\'' ;

TAG_WS: [ \t\r\n]+ -> skip ;

mode JINJA_MODE;
JINJA_STMT_CLOSE: '%}' -> popMode ;
JINJA_EXPR_CLOSE: '}}' -> popMode ;
FOR: 'for';
IN: 'in';
ENDFOR: 'endfor';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
ENDIF: 'endif';
EQ: '==';
NEQ: '!=';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
NUMBER: [0-9]+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' .*? '"' | '\'' .*? '\'' ;
DOT: '.';
J_WS: [ \t\r\n]+ -> skip ;

mode CSS_MODE;
STYLE_END_TAG: '</style>' -> popMode ;
CSS_CONTENT: (~'<')+ ;