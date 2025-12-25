lexer grammar HTMLLexer;

@header {
    package antlr;
}

HTML_COMMENT : '<!--' .*? '-->' -> skip ;

// 1. Move Jinja elements to the TOP (Higher Priority)
JINJA_STMT : '{%' .*? '%}' ;
JINJA_EXPR : '{{' .*? '}}' ;

// 2. Open Tag rule
TAG_OPEN     : '<' -> pushMode(TAG) ;

// 3. Smart HTML_TEXT: match anything except '<', '{' (the start of Jinja)
// This ensures Jinja tags are handled by their own rules.
HTML_TEXT    : (~[<{]|'{'~[%{])+ ;

// وضع ال tag
mode TAG;
TAG_CLOSE    : '>' -> popMode ;
TAG_SLASH    : '/' ;
EQUALS       : '=' ;
TAG_NAME     : [a-zA-Z][a-zA-Z0-9-]* ;
ATT_VALUE    : '"' ~'"'* '"' | '\'' ~'\''* '\'' ; // Added single quote support
WS           : [ \t\r\n]+ -> skip ;