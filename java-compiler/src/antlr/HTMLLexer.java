// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/HTMLLexer.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, JINJA_STMT=2, JINJA_EXPR=3, TAG_OPEN=4, HTML_TEXT=5, TAG_CLOSE=6, 
		TAG_SLASH=7, EQUALS=8, TAG_NAME=9, ATT_VALUE=10, WS=11;
	public static final int
		TAG=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "JINJA_STMT", "JINJA_EXPR", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH", "EQUALS", "TAG_NAME", "ATT_VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'<'", null, "'>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "JINJA_STMT", "JINJA_EXPR", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH", "EQUALS", "TAG_NAME", "ATT_VALUE", "WS"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u000bt\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u0001"+
		"1\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004I\b\u0004"+
		"\u000b\u0004\f\u0004J\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\bW\b\b\n\b\f\bZ\t\b\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\ta\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\tf\b\t\n\t\f\ti\t\t\u0001\t\u0003\tl\b\t\u0001"+
		"\n\u0004\no\b\n\u000b\n\f\np\u0001\n\u0001\n\u0003 /;\u0000\u000b\u0002"+
		"\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010"+
		"\b\u0012\t\u0014\n\u0016\u000b\u0002\u0000\u0001\u0007\u0002\u0000<<{"+
		"{\u0002\u0000%%{{\u0002\u0000AZaz\u0004\u0000--09AZaz\u0001\u0000\"\""+
		"\u0001\u0000\'\'\u0003\u0000\t\n\r\r  |\u0000\u0002\u0001\u0000\u0000"+
		"\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0001\f\u0001\u0000\u0000\u0000\u0001\u000e\u0001\u0000\u0000\u0000\u0001"+
		"\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0001"+
		"\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0002"+
		"\u0018\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00065\u0001"+
		"\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000"+
		"\fL\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010R\u0001"+
		"\u0000\u0000\u0000\u0012T\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000"+
		"\u0000\u0016n\u0001\u0000\u0000\u0000\u0018\u0019\u0005<\u0000\u0000\u0019"+
		"\u001a\u0005!\u0000\u0000\u001a\u001b\u0005-\u0000\u0000\u001b\u001c\u0005"+
		"-\u0000\u0000\u001c \u0001\u0000\u0000\u0000\u001d\u001f\t\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!#\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005-\u0000\u0000$%\u0005-"+
		"\u0000\u0000%&\u0005>\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0006"+
		"\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005{\u0000\u0000"+
		"*+\u0005%\u0000\u0000+/\u0001\u0000\u0000\u0000,.\t\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000023\u0005%\u0000\u000034\u0005}\u0000\u00004\u0005\u0001\u0000"+
		"\u0000\u000056\u0005{\u0000\u000067\u0005{\u0000\u00007;\u0001\u0000\u0000"+
		"\u00008:\t\u0000\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005}\u0000\u0000?@\u0005}\u0000"+
		"\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005<\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0006\u0003\u0001\u0000D\t\u0001\u0000\u0000\u0000EI\b"+
		"\u0000\u0000\u0000FG\u0005{\u0000\u0000GI\b\u0001\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000"+
		"\u0000\u0000LM\u0005>\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\u0005"+
		"\u0002\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005/\u0000\u0000Q\u000f\u0001"+
		"\u0000\u0000\u0000RS\u0005=\u0000\u0000S\u0011\u0001\u0000\u0000\u0000"+
		"TX\u0007\u0002\u0000\u0000UW\u0007\u0003\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[_\u0005\"\u0000\u0000\\^\b\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bl\u0005\"\u0000"+
		"\u0000cg\u0005\'\u0000\u0000df\b\u0005\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005"+
		"\'\u0000\u0000k[\u0001\u0000\u0000\u0000kc\u0001\u0000\u0000\u0000l\u0015"+
		"\u0001\u0000\u0000\u0000mo\u0007\u0006\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\n\u0000\u0000s\u0017\u0001"+
		"\u0000\u0000\u0000\f\u0000\u0001 /;HJX_gkp\u0003\u0006\u0000\u0000\u0005"+
		"\u0001\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}