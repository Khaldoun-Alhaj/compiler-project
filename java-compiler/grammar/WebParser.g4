parser grammar WebParser;
options { tokenVocab=WebLexer; }
@header { package antlr; }

template : (element | jinjaElement | cssBlock | textNode)* EOF ;
textNode : HTML_TEXT ;

element : TAG_OPEN HTML_ID attribute* (
              TAG_CLOSE content TAG_OPEN SLASH HTML_ID TAG_CLOSE
              | TAG_CLOSE        // دعم التاقات مثل <link> أو <img> بدون إغلاق
              | TAG_SLASH_CLOSE  // دعم />
          ) ;

attribute : HTML_ID (EQUALS ATTR_VALUE)? ; // القيمة اختيارية لدعم 'required'

content : (element | jinjaElement | textNode)* ;
jinjaElement : JINJA_STMT_OPEN (forLoop | ifStmt) JINJA_STMT_CLOSE | JINJA_EXPR_OPEN variable JINJA_EXPR_CLOSE ;
forLoop : FOR ID IN ID JINJA_STMT_CLOSE content JINJA_STMT_OPEN ENDFOR ;
ifStmt : IF condition JINJA_STMT_CLOSE content (JINJA_STMT_OPEN ELIF condition JINJA_STMT_CLOSE content)* (JINJA_STMT_OPEN ELSE JINJA_STMT_CLOSE content)? JINJA_STMT_OPEN ENDIF ;
condition : expression ((EQ | NEQ | GT | GTE | LT | LTE) expression)? ;
expression : ID | NUMBER | STRING ;
variable : ID (DOT ID)* ;
cssBlock : STYLE_OPEN styleAttr* STYLE_TAG_CLOSE CSS_CONTENT STYLE_END_TAG ;
styleAttr : STYLE_ID STYLE_EQUALS STYLE_ATTR_VAL ;