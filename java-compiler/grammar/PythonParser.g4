parser grammar PythonParser;
options { tokenVocab=PythonLexer; }
@header { package antlr; }

parse : (stmt | NL)* EOF ;

stmt : routeDefinition | assignment | importStmt | ifStmt | forLoop | returnStmt | mainBlock | exprStmt ;
exprStmt : expression (NL | EOF) ;

importStmt
    : IMPORT ID (COMMA ID)* (NL | EOF)
    | FROM ID (DOT ID)* IMPORT (ID (COMMA ID)* | STAR) (NL | EOF)
    ;

mainBlock : IF NAME_VAR EQ MAIN_STR COLON NL* INDENT statementBlock DEDENT ;

routeDefinition
    : DECORATOR NL* DEF ID LPAREN parameterList? RPAREN COLON NL* INDENT statementBlock DEDENT
    ;

parameterList
    : ID (COMMA ID)*
    ;

ifStmt
    : IF expression COLON NL* INDENT statementBlock DEDENT
      (ELIF expression COLON NL* INDENT statementBlock DEDENT)*
      (ELSE COLON NL* INDENT statementBlock DEDENT)?
    ;

forLoop : FOR ID IN expression COLON NL* INDENT statementBlock DEDENT ;
statementBlock : (stmt | NL)+ ;
assignment : expression ASSIGN expression (NL | EOF) ;
returnStmt : RETURN expression (NL | EOF) ;

expression
    : expression (STAR | SLASH) expression                   # mulDiv
    | expression (PLUS | MINUS) expression                   # addSub
    | expression (EQ | NEQ | GT | GTE | LT | LTE) expression # comparison
    | atom trailers?                                         # primary
    ;

// دعم الوصول للعناصر واستدعاء الدوال والنقاط
trailers : trailer+ ;
trailer
    : LBRACK expression RBRACK               # indexTrailer
    | LPAREN argList? RPAREN                 # callTrailer
    | DOT ID                                 # attrTrailer
    ;

atom
    : listLiteral                            # listExpr
    | dictLiteral                            # dictExpr
    | STRING                                 # stringLiteral
    | NUMBER                                 # numberLiteral
    | ID                                     # idLiteral
    | NAME_VAR                               # nameVarExpr
    | MAIN_STR                               # mainStrExpr
    | TRUE                                   # boolTrue
    | FALSE                                  # boolFalse
    | LPAREN expression RPAREN               # parenExpr
    ;

argList : argument (COMMA argument)* ;
argument : (ID ASSIGN)? expression ;
listLiteral : LBRACK (NL|INDENT|DEDENT)* (element (COMMA (NL|INDENT|DEDENT)* element)*)? (NL|INDENT|DEDENT)* RBRACK ;
dictLiteral : LBRACE (NL|INDENT|DEDENT)* (pair (COMMA (NL|INDENT|DEDENT)* pair)*)? (NL|INDENT|DEDENT)* RBRACE ;
pair : (STRING | ID) COLON (NL|INDENT|DEDENT)* element ;
element : expression ;