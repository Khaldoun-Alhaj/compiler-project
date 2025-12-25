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
		CSSCOMMENT=1, LBRACE=2, RBRACE=3, COLON=4, SEMI=5, HASH=6, DOT=7, NUMBER_VAL=8, 
		HEX_COLOR=9, IDENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CSSCOMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", "HASH", "DOT", "NUMBER_VAL", 
			"HEX_COLOR", "IDENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "':'", "';'", "'#'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSSCOMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", "HASH", "DOT", 
			"NUMBER_VAL", "HEX_COLOR", "IDENT", "WS"
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
		"\u0004\u0000\u000bR\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000"+
		"\n\u0000\f\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u00074\b\u0007\u000b\u0007\f\u00075\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007=\b"+
		"\u0007\u0001\b\u0001\b\u0004\bA\b\b\u000b\b\f\bB\u0001\t\u0001\t\u0005"+
		"\tG\b\t\n\t\f\tJ\t\t\u0001\n\u0004\nM\b\n\u000b\n\f\nN\u0001\n\u0001\n"+
		"\u0001\u001e\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001"+
		"\u0000\u0006\u0002\u0000\n\n\r\r\u0001\u000009\u0003\u000009AFaf\u0003"+
		"\u0000--AZaz\u0004\u0000--09AZaz\u0003\u0000\t\n\r\r  Z\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001"+
		"\u0000\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000"+
		"\u0000\u000f3\u0001\u0000\u0000\u0000\u0011>\u0001\u0000\u0000\u0000\u0013"+
		"D\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"/\u0000\u0000\u0018\u0019\u0005*\u0000\u0000\u0019\u001e\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\t\u0000\u0000\u0000\u001b\u001d\u0007\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!\"\u0005*\u0000\u0000\"#\u0005/\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0006\u0000\u0000\u0000%\u0002\u0001\u0000\u0000"+
		"\u0000&\'\u0005{\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005}"+
		"\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005:\u0000\u0000+\b\u0001"+
		"\u0000\u0000\u0000,-\u0005;\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005"+
		"#\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005.\u0000\u00001\u000e\u0001"+
		"\u0000\u0000\u000024\u0007\u0001\u0000\u000032\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006<\u0001\u0000\u0000\u000078\u0005p\u0000\u00008=\u0005x\u0000\u0000"+
		"9:\u0005e\u0000\u0000:=\u0005m\u0000\u0000;=\u0005%\u0000\u0000<7\u0001"+
		"\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\u0010\u0001\u0000\u0000\u0000>@\u0005#\u0000"+
		"\u0000?A\u0007\u0002\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0012"+
		"\u0001\u0000\u0000\u0000DH\u0007\u0003\u0000\u0000EG\u0007\u0004\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0014\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KM\u0007\u0005\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\n\u0000\u0000Q\u0016\u0001"+
		"\u0000\u0000\u0000\b\u0000\u001c\u001e5<BHN\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}