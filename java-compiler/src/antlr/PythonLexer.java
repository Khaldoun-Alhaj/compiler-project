// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/PythonLexer.g4 by ANTLR 4.13.2

    package antlr;
    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NL=3, NEWLINE=4, IMPORT=5, FROM=6, DEF=7, RETURN=8, 
		IF=9, ELIF=10, ELSE=11, FOR=12, IN=13, TRUE=14, FALSE=15, NAME_VAR=16, 
		MAIN_STR=17, DECORATOR=18, PLUS=19, MINUS=20, STAR=21, SLASH=22, EQ=23, 
		NEQ=24, GT=25, GTE=26, LT=27, LTE=28, LPAREN=29, RPAREN=30, LBRACK=31, 
		RBRACK=32, LBRACE=33, RBRACE=34, COLON=35, COMMA=36, ASSIGN=37, DOT=38, 
		ID=39, STRING=40, NUMBER=41, COMMENT=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "IMPORT", "FROM", "DEF", "RETURN", "IF", "ELIF", "ELSE", "FOR", 
			"IN", "TRUE", "FALSE", "NAME_VAR", "MAIN_STR", "DECORATOR", "PLUS", "MINUS", 
			"STAR", "SLASH", "EQ", "NEQ", "GT", "GTE", "LT", "LTE", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COLON", "COMMA", "ASSIGN", "DOT", 
			"ID", "STRING", "NUMBER", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'import'", "'from'", "'def'", "'return'", 
			"'if'", "'elif'", "'else'", "'for'", "'in'", "'True'", "'False'", "'__name__'", 
			null, null, "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", 
			"'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NL", "NEWLINE", "IMPORT", "FROM", "DEF", "RETURN", 
			"IF", "ELIF", "ELSE", "FOR", "IN", "TRUE", "FALSE", "NAME_VAR", "MAIN_STR", 
			"DECORATOR", "PLUS", "MINUS", "STAR", "SLASH", "EQ", "NEQ", "GT", "GTE", 
			"LT", "LTE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"COLON", "COMMA", "ASSIGN", "DOT", "ID", "STRING", "NUMBER", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

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
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000+\u011e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0001\u0000\u0003\u0000S\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000X\b\u0000\n\u0000\f\u0000[\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b2\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b7\b\u000e\n\u000e\f\u000e"+
		"\u00ba\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00be\b\u000e\n\u000e"+
		"\f\u000e\u00c1\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0005#\u00f3"+
		"\b#\n#\f#\u00f6\t#\u0001$\u0001$\u0005$\u00fa\b$\n$\f$\u00fd\t$\u0001"+
		"$\u0001$\u0001$\u0005$\u0102\b$\n$\f$\u0105\t$\u0001$\u0003$\u0108\b$"+
		"\u0001%\u0004%\u010b\b%\u000b%\f%\u010c\u0001&\u0001&\u0005&\u0111\b&"+
		"\n&\f&\u0114\t&\u0001&\u0001&\u0001\'\u0004\'\u0119\b\'\u000b\'\f\'\u011a"+
		"\u0001\'\u0001\'\u0003\u00bf\u00fb\u0103\u0000(\u0001\u0004\u0003\u0005"+
		"\u0005\u0006\u0007\u0007\t\b\u000b\t\r\n\u000f\u000b\u0011\f\u0013\r\u0015"+
		"\u000e\u0017\u000f\u0019\u0010\u001b\u0011\u001d\u0012\u001f\u0013!\u0014"+
		"#\u0015%\u0016\'\u0017)\u0018+\u0019-\u001a/\u001b1\u001c3\u001d5\u001e"+
		"7\u001f9 ;!=\"?#A$C%E&G\'I(K)M*O+\u0001\u0000\u0007\u0002\u0000\t\t  "+
		"\u0003\u0000AB__az\u0005\u0000..09AZ__az\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0002\u0000\n\n\r\r\u0129\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0001R\u0001"+
		"\u0000\u0000\u0000\u0003^\u0001\u0000\u0000\u0000\u0005e\u0001\u0000\u0000"+
		"\u0000\u0007j\u0001\u0000\u0000\u0000\tn\u0001\u0000\u0000\u0000\u000b"+
		"u\u0001\u0000\u0000\u0000\rx\u0001\u0000\u0000\u0000\u000f}\u0001\u0000"+
		"\u0000\u0000\u0011\u0082\u0001\u0000\u0000\u0000\u0013\u0086\u0001\u0000"+
		"\u0000\u0000\u0015\u0089\u0001\u0000\u0000\u0000\u0017\u008e\u0001\u0000"+
		"\u0000\u0000\u0019\u0094\u0001\u0000\u0000\u0000\u001b\u00b1\u0001\u0000"+
		"\u0000\u0000\u001d\u00b3\u0001\u0000\u0000\u0000\u001f\u00c4\u0001\u0000"+
		"\u0000\u0000!\u00c6\u0001\u0000\u0000\u0000#\u00c8\u0001\u0000\u0000\u0000"+
		"%\u00ca\u0001\u0000\u0000\u0000\'\u00cc\u0001\u0000\u0000\u0000)\u00cf"+
		"\u0001\u0000\u0000\u0000+\u00d2\u0001\u0000\u0000\u0000-\u00d4\u0001\u0000"+
		"\u0000\u0000/\u00d7\u0001\u0000\u0000\u00001\u00d9\u0001\u0000\u0000\u0000"+
		"3\u00dc\u0001\u0000\u0000\u00005\u00de\u0001\u0000\u0000\u00007\u00e0"+
		"\u0001\u0000\u0000\u00009\u00e2\u0001\u0000\u0000\u0000;\u00e4\u0001\u0000"+
		"\u0000\u0000=\u00e6\u0001\u0000\u0000\u0000?\u00e8\u0001\u0000\u0000\u0000"+
		"A\u00ea\u0001\u0000\u0000\u0000C\u00ec\u0001\u0000\u0000\u0000E\u00ee"+
		"\u0001\u0000\u0000\u0000G\u00f0\u0001\u0000\u0000\u0000I\u0107\u0001\u0000"+
		"\u0000\u0000K\u010a\u0001\u0000\u0000\u0000M\u010e\u0001\u0000\u0000\u0000"+
		"O\u0118\u0001\u0000\u0000\u0000QS\u0005\r\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\n\u0000"+
		"\u0000UY\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0006\u0000\u0000\u0000]\u0002\u0001\u0000\u0000\u0000^_\u0005i\u0000"+
		"\u0000_`\u0005m\u0000\u0000`a\u0005p\u0000\u0000ab\u0005o\u0000\u0000"+
		"bc\u0005r\u0000\u0000cd\u0005t\u0000\u0000d\u0004\u0001\u0000\u0000\u0000"+
		"ef\u0005f\u0000\u0000fg\u0005r\u0000\u0000gh\u0005o\u0000\u0000hi\u0005"+
		"m\u0000\u0000i\u0006\u0001\u0000\u0000\u0000jk\u0005d\u0000\u0000kl\u0005"+
		"e\u0000\u0000lm\u0005f\u0000\u0000m\b\u0001\u0000\u0000\u0000no\u0005"+
		"r\u0000\u0000op\u0005e\u0000\u0000pq\u0005t\u0000\u0000qr\u0005u\u0000"+
		"\u0000rs\u0005r\u0000\u0000st\u0005n\u0000\u0000t\n\u0001\u0000\u0000"+
		"\u0000uv\u0005i\u0000\u0000vw\u0005f\u0000\u0000w\f\u0001\u0000\u0000"+
		"\u0000xy\u0005e\u0000\u0000yz\u0005l\u0000\u0000z{\u0005i\u0000\u0000"+
		"{|\u0005f\u0000\u0000|\u000e\u0001\u0000\u0000\u0000}~\u0005e\u0000\u0000"+
		"~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081"+
		"\u0005e\u0000\u0000\u0081\u0010\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"f\u0000\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005r\u0000"+
		"\u0000\u0085\u0012\u0001\u0000\u0000\u0000\u0086\u0087\u0005i\u0000\u0000"+
		"\u0087\u0088\u0005n\u0000\u0000\u0088\u0014\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005T\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u008c\u0005"+
		"u\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d\u0016\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005F\u0000\u0000\u008f\u0090\u0005a\u0000\u0000\u0090"+
		"\u0091\u0005l\u0000\u0000\u0091\u0092\u0005s\u0000\u0000\u0092\u0093\u0005"+
		"e\u0000\u0000\u0093\u0018\u0001\u0000\u0000\u0000\u0094\u0095\u0005_\u0000"+
		"\u0000\u0095\u0096\u0005_\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097"+
		"\u0098\u0005a\u0000\u0000\u0098\u0099\u0005m\u0000\u0000\u0099\u009a\u0005"+
		"e\u0000\u0000\u009a\u009b\u0005_\u0000\u0000\u009b\u009c\u0005_\u0000"+
		"\u0000\u009c\u001a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\"\u0000\u0000"+
		"\u009e\u009f\u0005_\u0000\u0000\u009f\u00a0\u0005_\u0000\u0000\u00a0\u00a1"+
		"\u0005m\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005i"+
		"\u0000\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u00a5\u0005_\u0000\u0000"+
		"\u00a5\u00a6\u0005_\u0000\u0000\u00a6\u00b2\u0005\"\u0000\u0000\u00a7"+
		"\u00a8\u0005\'\u0000\u0000\u00a8\u00a9\u0005_\u0000\u0000\u00a9\u00aa"+
		"\u0005_\u0000\u0000\u00aa\u00ab\u0005m\u0000\u0000\u00ab\u00ac\u0005a"+
		"\u0000\u0000\u00ac\u00ad\u0005i\u0000\u0000\u00ad\u00ae\u0005n\u0000\u0000"+
		"\u00ae\u00af\u0005_\u0000\u0000\u00af\u00b0\u0005_\u0000\u0000\u00b0\u00b2"+
		"\u0005\'\u0000\u0000\u00b1\u009d\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001"+
		"\u0000\u0000\u0000\u00b2\u001c\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"@\u0000\u0000\u00b4\u00b8\u0007\u0001\u0000\u0000\u00b5\u00b7\u0007\u0002"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bf\u0005(\u0000\u0000\u00bc\u00be\t\u0000\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005)\u0000\u0000\u00c3\u001e\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005+\u0000\u0000\u00c5 \u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005-\u0000\u0000\u00c7\"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"*\u0000\u0000\u00c9$\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005/\u0000"+
		"\u0000\u00cb&\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005=\u0000\u0000\u00cd"+
		"\u00ce\u0005=\u0000\u0000\u00ce(\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"!\u0000\u0000\u00d0\u00d1\u0005=\u0000\u0000\u00d1*\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005>\u0000\u0000\u00d3,\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005>\u0000\u0000\u00d5\u00d6\u0005=\u0000\u0000\u00d6.\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d80\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005<\u0000\u0000\u00da\u00db\u0005=\u0000\u0000\u00db"+
		"2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005(\u0000\u0000\u00dd4\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005)\u0000\u0000\u00df6\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005[\u0000\u0000\u00e18\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005]\u0000\u0000\u00e3:\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"{\u0000\u0000\u00e5<\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005}\u0000"+
		"\u0000\u00e7>\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005:\u0000\u0000\u00e9"+
		"@\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005,\u0000\u0000\u00ebB\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005=\u0000\u0000\u00edD\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005.\u0000\u0000\u00efF\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f4\u0007\u0003\u0000\u0000\u00f1\u00f3\u0007\u0004\u0000\u0000\u00f2"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"H\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb"+
		"\u0005\"\u0000\u0000\u00f8\u00fa\t\u0000\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0108\u0005"+
		"\"\u0000\u0000\u00ff\u0103\u0005\'\u0000\u0000\u0100\u0102\t\u0000\u0000"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0005\'\u0000\u0000\u0107\u00f7\u0001\u0000\u0000\u0000"+
		"\u0107\u00ff\u0001\u0000\u0000\u0000\u0108J\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0007\u0005\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010dL\u0001\u0000\u0000\u0000\u010e\u0112"+
		"\u0005#\u0000\u0000\u010f\u0111\b\u0006\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0006"+
		"&\u0001\u0000\u0116N\u0001\u0000\u0000\u0000\u0117\u0119\u0007\u0000\u0000"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0006\'\u0001\u0000"+
		"\u011dP\u0001\u0000\u0000\u0000\r\u0000RY\u00b1\u00b8\u00bf\u00f4\u00fb"+
		"\u0103\u0107\u010c\u0112\u011a\u0002\u0001\u0000\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}