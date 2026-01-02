parser grammar PythonParser;
options { tokenVocab=PythonLexer; }
@header { package antlr; }

parse : (stmt | NL)* EOF ;

// Core statements including Control Flow
stmt
    : routeDefinition
    | assignment
    | importStmt
    | ifStmt
    | forLoop
    | returnStmt
    | mainBlock
    | expression (NL | EOF)
    ;

// NEW: Support for IF, ELIF, ELSE
ifStmt
    : IF expression COLON NL* INDENT statementBlock DEDENT
      (ELIF expression COLON NL* INDENT statementBlock DEDENT)*
      (ELSE COLON NL* INDENT statementBlock DEDENT)?
    ;

// NEW: Support for FOR loops
forLoop
    : FOR ID IN expression COLON NL* INDENT statementBlock DEDENT
    ;

routeDefinition
    : DECORATOR NL* DEF ID LPAREN RPAREN COLON NL* INDENT statementBlock DEDENT
    ;

statementBlock : (stmt | NL)+ ;

assignment : ID ASSIGN expression (NL | EOF) ;
returnStmt : RETURN expression (NL | EOF) ;

expression
    : expression (STAR | SLASH) expression   # mulDiv
    | expression (PLUS | MINUS) expression   # addSub
    | expression (EQ | NEQ | GT | GTE | LT | LTE) expression # comparison
    | atom                                   # primary
    ;

atom
    : listLiteral                            # listExpr
    | dictLiteral                            # dictExpr
    | ID (DOT ID)* LPAREN argList? RPAREN    # callExpr
    | STRING                                 # stringLiteral
    | NUMBER                                 # numberLiteral
    | ID (DOT ID)*                           # idLiteral
    | NAME_VAR                               # idLiteral
    | MAIN_STR                               # stringLiteral
    | TRUE | FALSE | LPAREN expression RPAREN # parenExpr
    ;

argList : argument (COMMA argument)* ;
argument : (ID ASSIGN)? expression ;

// Senior Logic: Recursively swallow structure insid