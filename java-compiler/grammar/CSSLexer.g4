lexer grammar CSSLexer;

@header {
    package antlr;
}
CSSCOMMENT : '/*' (. | [\r\n])*? '*/' -> skip ;
LBRACE      : '{';
RBRACE      : '}';
COLON       : ':';
SEMI        : ';';
HASH        : '#';
DOT         : '.';


// الأرقام، النسب المئوية، والبكسل
NUMBER_VAL  : [0-9]+ ('px'|'em'|'%')? ;

// الألوان بنظام الـ Hex مثل #fff
HEX_COLOR   : '#' [0-9a-fA-F]+ ;

// المعرفات: تشمل أسماء التاقات (div)، الكلاسات، الخصائص (color)، والقيم النصية (red, bold)
// لاحظ وجود الشارطة - لدعم product-container
IDENT       : [a-zA-Z-][a-zA-Z0-9-]* ;

WS          : [ \t\r\n]+ -> skip ;