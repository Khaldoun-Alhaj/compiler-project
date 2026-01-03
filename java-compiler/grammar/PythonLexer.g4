lexer grammar PythonLexer;

@header {
    package antlr;
    import java.util.*;
}

/**
 * Senior Level Indentation Logic
 * يستخدم هذا القسم للتحكم في مستويات الإزاحة (Scoping) في لغة بايثون
 */
@members {
    // مكدس لتتبع مستويات المسافات البادئة
    private Stack<Integer> indentStack = new Stack<>();
    // طابور لتخزين التوكنز التي سيتم إطلاقها تتابعياً
    private Queue<Token> tokenQueue = new LinkedList<>();
    // علامة لمعرفة ما إذا كان الملف قد انتهى ومعالجته
    private boolean emittedEof = false;

    @Override
    public Token nextToken() {
        // إذا كان هناك توكنز وهمية (INDENT/DEDENT) في الطابور، أخرجها أولاً
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        Token next = super.nextToken();

        // معالجة نهاية الملف لضمان إغلاق كافة البلوكات المفتوحة
        if (next.getType() == EOF && !emittedEof) {
            emittedEof = true;
            // حقن سطر جديد لإنهاء آخر جملة برمجية
            tokenQueue.offer(createToken(NL, "<forced-NL>"));
            // إطلاق DEDENT لكل مستوى إزاحة لا يزال مفتوحاً
            while (!indentStack.isEmpty() && indentStack.peek() > 0) {
                indentStack.pop();
                tokenQueue.offer(createToken(DEDENT, "<forced-DEDENT>"));
            }
            tokenQueue.offer(next);
            return tokenQueue.poll();
        }
        return next;
    }

    private Token createToken(int type, String text) {
        CommonToken t = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, -1, -1);
        t.setText(text);
        return t;
    }
}

// الرموز الوهمية للهيكلية (Virtual Tokens)
tokens { INDENT, DEDENT, NL }

// --- القواعد المعجمية الأساسية ---

/**
 * منطق السطر الجديد (NEWLINE)
 * يقوم بحساب المسافات البادئة ومقارنتها بالمكدس لتوليد INDENT أو DEDENT
 */
NEWLINE : ( '\r'? '\n' ) [ \t]*
    {
        String text = getText();
        // حساب عدد المسافات بعد آخر سطر جديد
        int spaces = text.length() - text.lastIndexOf('\n') - 1;
        int nextChar = _input.LA(1);

        // تجاهل الأسطر التي تحتوي فقط على تعليقات أو أسطر فارغة تماماً
        if (nextChar == '#' || nextChar == '\n' || nextChar == '\r' || nextChar == -1) {
            setType(NL);
        } else {
            if (indentStack.isEmpty()) indentStack.push(0);
            int currentIndent = indentStack.peek();

            // تعيين نوع التوكن الحالي كسطر جديد ليفصل الجمل البرمجية
            setType(NL);

            if (spaces > currentIndent) {
                // دخول في مستوى إزاحة جديد
                indentStack.push(spaces);
                tokenQueue.offer(createToken(INDENT, ""));
            } else if (spaces < currentIndent) {
                // عودة لمستويات إزاحة سابقة (إطلاق DEDENT واحد أو أكثر)
                while (!indentStack.isEmpty() && indentStack.peek() > spaces) {
                    indentStack.pop();
                    tokenQueue.offer(createToken(DEDENT, ""));
                }
            }
        }
    };

// --- الكلمات المفتاحية (Keywords) ---
IMPORT   : 'import' ;
FROM     : 'from' ;
DEF      : 'def' ;
RETURN   : 'return' ;
IF       : 'if' ;
ELIF     : 'elif' ;
ELSE     : 'else' ;
FOR      : 'for' ;
IN       : 'in' ;
TRUE     : 'True' ;
FALSE    : 'False' ;

// --- رموز خاصة بنظام بايثون ---
NAME_VAR : '__name__' ;
MAIN_STR : '"__main__"' | '\'__main__\'' ;

// --- Flask Decorators ---
DECORATOR : '@' [a-zA-B_][a-zA-Z0-9_.]* '(' .*? ')' ;


// --- العمليات الحسابية والمنطقية (Operators) ---
PLUS     : '+' ;
MINUS    : '-' ;
STAR     : '*' ;
SLASH    : '/' ;
EQ       : '==' ;
NEQ      : '!=' ; // تم تصحيح الخطأ هنا بإزالة الاقتباس الزائد
GT       : '>' ;
GTE      : '>=' ;
LT       : '<' ;
LTE      : '<=' ;

// --- الرموز البرمجية (Symbols) ---
LPAREN   : '(' ;
RPAREN   : ')' ;
LBRACK   : '[' ;
RBRACK   : ']' ;
LBRACE   : '{' ;
RBRACE   : '}' ;
COLON    : ':' ;
COMMA    : ',' ;
ASSIGN   : '=' ;
DOT      : '.' ;

// --- المعرفات والقيم (Identifiers & Literals) ---
ID       : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING   : '"' ( . )*? '"' | '\'' ( . )*? '\'' ;
NUMBER   : [0-9]+ ;

// --- التجاهل (Hidden Channel) ---
// يتم تجاهل التعليقات والمسافات العادية داخل السطر
COMMENT  : '#' ~[\r\n]* -> skip ;
WS       : [ \t]+ -> skip ;