parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

@header { package antlr; }

// Entry point
parse : (routeDefinition | assignment)* EOF ;

routeDefinition
    : DECORATOR DEF ID LPAREN RPAREN COLON statementBlock
    ;

statementBlock
    : (assignment | returnStmt)+
    ;

assignment
    : ID ASSIGN value
    ;

returnStmt
    : RETURN ID LPAREN .*? RPAREN
    ;

value
    : listLiteral
    | dictLiteral
    | STRING
    | NUMBER
    ;

listLiteral : LBRACK (element (COMMA element)*)? RBRACK ;
dictLiteral : LBRACE (pair (COMMA pair)*)? RBRACE ;
pair        : STRING COLON element ;
element     : STRING | NUMBER | dictLiteral | ID ;