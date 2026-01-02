parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

@header {
    package antlr;
}

// The entry point for logic within a web page
parse : (statement | expression)* EOF ;

statement
    : forLoop
    | ifStatement
    ;

forLoop
    : STMT_OPEN FOR ID IN ID STMT_CLOSE
      content
      STMT_OPEN ENDFOR STMT_CLOSE
    ;

ifStatement
    : STMT_OPEN IF condition STMT_CLOSE
      content
      (STMT_OPEN ELSE STMT_CLOSE content)?
      STMT_OPEN ENDIF STMT_CLOSE
    ;

expression
    : EXPR_OPEN variable EXPR_CLOSE
    ;

variable
    : ID (DOT ID)*
    ;

condition
    : variable (EQUALS (variable | STRING | NUMBER))?
    ;

// This 'content' will be a placeholder that we bridge with the HTML parser
content : .*? ;