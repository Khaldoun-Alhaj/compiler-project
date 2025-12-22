parser grammar CSSParser;



options { tokenVocab=CSSLexer; }

@header {
    package antlr;
}


stylesheet  : rule* EOF ;

rule : selector LBRACE declaration* RBRACE ;

selector
    : IDENT       // عناصر اساسية مثلا div
    | DOT IDENT   // classes
    | HASH IDENT  // ides
    ;

declaration
    : property COLON value+ SEMI
    ;

property
    : IDENT
    ;

value
    : IDENT        // لل String value
    | NUMBER_VAL   // لل آNumber
    | HEX_COLOR    // لل الوان #fffffff
    ;