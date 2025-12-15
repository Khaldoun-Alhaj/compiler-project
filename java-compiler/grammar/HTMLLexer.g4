lexer grammar HTMLLexer;

@header {
    package antlr;
}


HTML_COMMENT : '<!--' .*? '-->' -> skip ;  // التعليقات
TAG_OPEN     : '<' -> pushMode(TAG) ;     // وضع ال Tag
HTML_TEXT    : ~[<]+ ;                     // أي نص عادي


// وضع ال tag
mode TAG;

TAG_CLOSE    : '>' -> popMode ;            // خروج من وضع ال tag
TAG_SLASH    : '/' ;
EQUALS       : '=' ;
TAG_NAME     : [a-zA-Z][a-zA-Z0-9-]* ;     // اسماء وخصائص
ATT_VALUE    : '"' ~'"'* '"' ;             // القيم بين علامتي تنصيص
WS           : [ \t\r\n]+ -> skip ;        // تجاهل المسافات