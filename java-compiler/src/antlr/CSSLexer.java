// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/CSSLexer.g4 by ANTLR 4.13.2
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
public class CSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSSCOMMENT=1, LBRACE=2, RBRACE=3, COLON=4, SEMI=5, HASH=6, DOT=7, COMMA=8, 
		LPAREN=9, RPAREN=10, NUMBER_VAL=11, STRING=12, HEX_COLOR=13, IDENT=14, 
		WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CSSCOMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", "HASH", "DOT", "COMMA", 
			"LPAREN", "RPAREN", "NUMBER_VAL", "UNIT", "STRING", "HEX_COLOR", "IDENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "':'", "';'", "'#'", "'.'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSSCOMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", "HASH", "DOT", 
			"COMMA", "LPAREN", "RPAREN", "NUMBER_VAL", "STRING", "HEX_COLOR", "IDENT", 
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


	public CSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSSLexer.g4"; }

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
		"\u0004\u0000\u000f\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0004\nC\b\n\u000b\n\f\nD\u0001\n\u0001\n\u0004"+
		"\nI\b\n\u000b\n\f\nJ\u0001\n\u0003\nN\b\n\u0001\n\u0004\nQ\b\n\u000b\n"+
		"\f\nR\u0001\n\u0003\nV\b\n\u0003\nX\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001\f\u0001\f\u0005\ft\b\f\n"+
		"\f\f\fw\t\f\u0001\f\u0001\f\u0001\f\u0005\f|\b\f\n\f\f\f\u007f\t\f\u0001"+
		"\f\u0003\f\u0082\b\f\u0001\r\u0001\r\u0004\r\u0086\b\r\u000b\r\f\r\u0087"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u008c\b\u000e\n\u000e\f\u000e\u008f"+
		"\t\u000e\u0001\u000f\u0004\u000f\u0092\b\u000f\u000b\u000f\f\u000f\u0093"+
		"\u0001\u000f\u0001\u000f\u0003\'u}\u0000\u0010\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\u0000\u0019\f\u001b\r\u001d\u000e\u001f\u000f\u0001"+
		"\u0000\u0006\u0001\u000009\u0002\u0000%%ss\u0003\u000009AFaf\u0003\u0000"+
		"--AZaz\u0004\u0000--09AZaz\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0001!\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u0005"+
		"1\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000"+
		"\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?"+
		"\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017o\u0001\u0000"+
		"\u0000\u0000\u0019\u0081\u0001\u0000\u0000\u0000\u001b\u0083\u0001\u0000"+
		"\u0000\u0000\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u0091\u0001\u0000"+
		"\u0000\u0000!\"\u0005/\u0000\u0000\"#\u0005*\u0000\u0000#\'\u0001\u0000"+
		"\u0000\u0000$&\t\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005*\u0000\u0000+,\u0005"+
		"/\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0006\u0000\u0000\u0000.\u0002"+
		"\u0001\u0000\u0000\u0000/0\u0005{\u0000\u00000\u0004\u0001\u0000\u0000"+
		"\u000012\u0005}\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005:\u0000"+
		"\u00004\b\u0001\u0000\u0000\u000056\u0005;\u0000\u00006\n\u0001\u0000"+
		"\u0000\u000078\u0005#\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005."+
		"\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005,\u0000\u0000<\u0010"+
		"\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>\u0012\u0001\u0000\u0000"+
		"\u0000?@\u0005)\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AC\u0007\u0000"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0005.\u0000\u0000GI\u0007\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LN\u0003\u0017\u000b\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NX\u0001\u0000\u0000\u0000OQ\u0007"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TV\u0003\u0017\u000b\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WB\u0001\u0000\u0000\u0000WP\u0001"+
		"\u0000\u0000\u0000X\u0016\u0001\u0000\u0000\u0000YZ\u0005p\u0000\u0000"+
		"Zp\u0005x\u0000\u0000[\\\u0005e\u0000\u0000\\p\u0005m\u0000\u0000]^\u0005"+
		"r\u0000\u0000^_\u0005e\u0000\u0000_p\u0005m\u0000\u0000`p\u0007\u0001"+
		"\u0000\u0000ab\u0005m\u0000\u0000bp\u0005s\u0000\u0000cd\u0005v\u0000"+
		"\u0000dp\u0005h\u0000\u0000ef\u0005v\u0000\u0000fp\u0005w\u0000\u0000"+
		"gh\u0005v\u0000\u0000hi\u0005m\u0000\u0000ij\u0005i\u0000\u0000jp\u0005"+
		"n\u0000\u0000kl\u0005v\u0000\u0000lm\u0005m\u0000\u0000mn\u0005a\u0000"+
		"\u0000np\u0005x\u0000\u0000oY\u0001\u0000\u0000\u0000o[\u0001\u0000\u0000"+
		"\u0000o]\u0001\u0000\u0000\u0000o`\u0001\u0000\u0000\u0000oa\u0001\u0000"+
		"\u0000\u0000oc\u0001\u0000\u0000\u0000oe\u0001\u0000\u0000\u0000og\u0001"+
		"\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000p\u0018\u0001\u0000\u0000"+
		"\u0000qu\u0005\'\u0000\u0000rt\t\u0000\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x\u0082"+
		"\u0005\'\u0000\u0000y}\u0005\"\u0000\u0000z|\t\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\"\u0000\u0000\u0081q\u0001"+
		"\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0082\u001a\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0005#\u0000\u0000\u0084\u0086\u0007\u0002\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089\u008d\u0007\u0003\u0000"+
		"\u0000\u008a\u008c\u0007\u0004\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001e\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0005\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u000f\u0000"+
		"\u0000\u0096 \u0001\u0000\u0000\u0000\u000f\u0000\'DJMRUWou}\u0081\u0087"+
		"\u008d\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}