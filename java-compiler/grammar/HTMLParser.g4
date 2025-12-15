parser grammar HTMLParser;


options { tokenVocab=HTMLLexer; }

@header {
    package antlr;
}

// نقطة البداية
htmlDocument
    : element* EOF
    ;

element
    : tagElement      // تاق له بداية ونهاية
    | emptyElement    // تاق فارغ أو يغلق نفسه
    | HTML_TEXT       // نصوص
    ;

tagElement
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE content TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    ;

emptyElement
    : TAG_OPEN TAG_NAME attribute* TAG_SLASH TAG_CLOSE  // مثل <img />
    | TAG_OPEN TAG_NAME attribute* TAG_CLOSE           // بدون slash as <input>
    ;

attribute
    : TAG_NAME EQUALS ATT_VALUE
    ;

content
    : element*
    ;