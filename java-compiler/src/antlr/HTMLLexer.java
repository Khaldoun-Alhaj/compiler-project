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
		HTML_COMMENT=1, TAG_OPEN=2, HTML_TEXT=3, TAG_CLOSE=4, TAG_SLASH=5, EQUALS=6, 
		TAG_NAME=7, ATT_VALUE=8, WS=9;
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
			"HTML_COMMENT", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH", "EQUALS", 
			"TAG_NAME", "ATT_VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", null, "'>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH", 
			"EQUALS", "TAG_NAME", "ATT_VALUE", "WS"
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
		"\u0004\u0000\tM\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000"+
		"\n\u0000\f\u0000\u001e\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006"+
		"<\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007@\b\u0007\n\u0007\f\u0007"+
		"C\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bH\b\b\u000b\b\f\bI\u0001"+
		"\b\u0001\b\u0001\u001c\u0000\t\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004"+
		"\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0002\u0000\u0001\u0005\u0001"+
		"\u0000<<\u0002\u0000AZaz\u0004\u0000--09AZaz\u0001\u0000\"\"\u0003\u0000"+
		"\t\n\r\r  P\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000"+
		"\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0001\b\u0001\u0000\u0000"+
		"\u0000\u0001\n\u0001\u0000\u0000\u0000\u0001\f\u0001\u0000\u0000\u0000"+
		"\u0001\u000e\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000\u0000"+
		"\u0001\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000"+
		"\u0004%\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b.\u0001"+
		"\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f4\u0001\u0000\u0000\u0000"+
		"\u000e6\u0001\u0000\u0000\u0000\u0010=\u0001\u0000\u0000\u0000\u0012G"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0005<\u0000\u0000\u0015\u0016\u0005"+
		"!\u0000\u0000\u0016\u0017\u0005-\u0000\u0000\u0017\u0018\u0005-\u0000"+
		"\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b\t\u0000\u0000\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001f \u0005-\u0000\u0000 !\u0005-\u0000\u0000!\"\u0005>\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0006\u0000\u0000\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%&\u0005<\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0006"+
		"\u0001\u0001\u0000(\u0005\u0001\u0000\u0000\u0000)+\b\u0000\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005"+
		">\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0003\u0002\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005/\u0000\u00003\u000b\u0001\u0000\u0000\u0000"+
		"45\u0005=\u0000\u00005\r\u0001\u0000\u0000\u00006:\u0007\u0001\u0000\u0000"+
		"79\u0007\u0002\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u000f\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0005\"\u0000\u0000>@\b"+
		"\u0003\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0005\"\u0000\u0000E\u0011\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0004\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\b\u0000\u0000L\u0013\u0001\u0000\u0000"+
		"\u0000\u0007\u0000\u0001\u001c,:AI\u0003\u0006\u0000\u0000\u0005\u0001"+
		"\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}