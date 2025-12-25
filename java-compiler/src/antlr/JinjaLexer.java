// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/JinjaLexer.g4 by ANTLR 4.13.2

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
public class JinjaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STMT_OPEN=1, STMT_CLOSE=2, EXPR_OPEN=3, EXPR_CLOSE=4, FOR=5, IN=6, ENDFOR=7, 
		IF=8, ELSE=9, ENDIF=10, DOT=11, EQUALS=12, ASSIGN=13, COMMA=14, ID=15, 
		STRING=16, NUMBER=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STMT_OPEN", "STMT_CLOSE", "EXPR_OPEN", "EXPR_CLOSE", "FOR", "IN", "ENDFOR", 
			"IF", "ELSE", "ENDIF", "DOT", "EQUALS", "ASSIGN", "COMMA", "ID", "STRING", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%'", "'%}'", "'{{'", "'}}'", "'for'", "'in'", "'endfor'", "'if'", 
			"'else'", "'endif'", "'.'", "'=='", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STMT_OPEN", "STMT_CLOSE", "EXPR_OPEN", "EXPR_CLOSE", "FOR", "IN", 
			"ENDFOR", "IF", "ELSE", "ENDIF", "DOT", "EQUALS", "ASSIGN", "COMMA", 
			"ID", "STRING", "NUMBER", "WS"
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


	public JinjaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JinjaLexer.g4"; }

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
		"\u0004\u0000\u0012{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000eY\b\u000e\n\u000e"+
		"\f\u000e\\\t\u000e\u0001\u000f\u0001\u000f\u0005\u000f`\b\u000f\n\u000f"+
		"\f\u000fc\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fh\b\u000f"+
		"\n\u000f\f\u000fk\t\u000f\u0001\u000f\u0003\u000fn\b\u000f\u0001\u0010"+
		"\u0004\u0010q\b\u0010\u000b\u0010\f\u0010r\u0001\u0011\u0004\u0011v\b"+
		"\u0011\u000b\u0011\f\u0011w\u0001\u0011\u0001\u0011\u0002ai\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0003\u0000A"+
		"Z__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0080\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003(\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007"+
		".\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"+
		"\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000"+
		"\u0011B\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015M"+
		"\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019R\u0001\u0000"+
		"\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000"+
		"\u001fm\u0001\u0000\u0000\u0000!p\u0001\u0000\u0000\u0000#u\u0001\u0000"+
		"\u0000\u0000%&\u0005{\u0000\u0000&\'\u0005%\u0000\u0000\'\u0002\u0001"+
		"\u0000\u0000\u0000()\u0005%\u0000\u0000)*\u0005}\u0000\u0000*\u0004\u0001"+
		"\u0000\u0000\u0000+,\u0005{\u0000\u0000,-\u0005{\u0000\u0000-\u0006\u0001"+
		"\u0000\u0000\u0000./\u0005}\u0000\u0000/0\u0005}\u0000\u00000\b\u0001"+
		"\u0000\u0000\u000012\u0005f\u0000\u000023\u0005o\u0000\u000034\u0005r"+
		"\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005i\u0000\u000067\u0005n"+
		"\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005e\u0000\u00009:\u0005n"+
		"\u0000\u0000:;\u0005d\u0000\u0000;<\u0005f\u0000\u0000<=\u0005o\u0000"+
		"\u0000=>\u0005r\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005i\u0000"+
		"\u0000@A\u0005f\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005e\u0000"+
		"\u0000CD\u0005l\u0000\u0000DE\u0005s\u0000\u0000EF\u0005e\u0000\u0000"+
		"F\u0012\u0001\u0000\u0000\u0000GH\u0005e\u0000\u0000HI\u0005n\u0000\u0000"+
		"IJ\u0005d\u0000\u0000JK\u0005i\u0000\u0000KL\u0005f\u0000\u0000L\u0014"+
		"\u0001\u0000\u0000\u0000MN\u0005.\u0000\u0000N\u0016\u0001\u0000\u0000"+
		"\u0000OP\u0005=\u0000\u0000PQ\u0005=\u0000\u0000Q\u0018\u0001\u0000\u0000"+
		"\u0000RS\u0005=\u0000\u0000S\u001a\u0001\u0000\u0000\u0000TU\u0005,\u0000"+
		"\u0000U\u001c\u0001\u0000\u0000\u0000VZ\u0007\u0000\u0000\u0000WY\u0007"+
		"\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001e\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]a\u0005\"\u0000\u0000^`\t\u0000"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000dn\u0005\"\u0000\u0000ei\u0005\'\u0000\u0000"+
		"fh\t\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000ln\u0005\'\u0000\u0000m]\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000n \u0001\u0000\u0000\u0000oq\u0007\u0002"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\"\u0001\u0000\u0000\u0000"+
		"tv\u0007\u0003\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0006\u0011\u0000\u0000z$\u0001\u0000\u0000\u0000\u0007"+
		"\u0000Zaimrw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}