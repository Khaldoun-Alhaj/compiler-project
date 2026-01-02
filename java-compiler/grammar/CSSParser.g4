parser grammar CSSParser;
options { tokenVocab=CSSLexer; }
@header { package antlr; }
stylesheet : css_rule* EOF ;
css_rule : selector (COMMA selector)* LBRACE declaration* RBRACE ;
selector : selector_part+ ;
selector_part : IDENT | DOT IDENT | HASH IDENT ;
declaration : property COLON value_list SEMI ;
property : IDENT ;
value_list : value+ ;
value : IDENT | NUMBER_VAL | HEX_COLOR | STRING | LPAREN | RPAREN | COMMA ;