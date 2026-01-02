// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/CSSParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSSCOMMENT=1, LBRACE=2, RBRACE=3, COLON=4, SEMI=5, HASH=6, DOT=7, COMMA=8, 
		LPAREN=9, RPAREN=10, NUMBER_VAL=11, STRING=12, HEX_COLOR=13, IDENT=14, 
		WS=15;
	public static final int
		RULE_stylesheet = 0, RULE_css_rule = 1, RULE_selector = 2, RULE_selector_part = 3, 
		RULE_declaration = 4, RULE_property = 5, RULE_value_list = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "css_rule", "selector", "selector_part", "declaration", 
			"property", "value_list", "value"
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

	@Override
	public String getGrammarFileName() { return "CSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSSParser.EOF, 0); }
		public List<Css_ruleContext> css_rule() {
			return getRuleContexts(Css_ruleContext.class);
		}
		public Css_ruleContext css_rule(int i) {
			return getRuleContext(Css_ruleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16576L) != 0)) {
				{
				{
				setState(16);
				css_rule();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_ruleContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Css_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCss_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCss_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCss_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_ruleContext css_rule() throws RecognitionException {
		Css_ruleContext _localctx = new Css_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_css_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			selector();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(25);
				match(COMMA);
				setState(26);
				selector();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(LBRACE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(33);
				declaration();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<Selector_partContext> selector_part() {
			return getRuleContexts(Selector_partContext.class);
		}
		public Selector_partContext selector_part(int i) {
			return getRuleContext(Selector_partContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				selector_part();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16576L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selector_partContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode DOT() { return getToken(CSSParser.DOT, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public Selector_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_partContext selector_part() throws RecognitionException {
		Selector_partContext _localctx = new Selector_partContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector_part);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(IDENT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(DOT);
				setState(48);
				match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(HASH);
				setState(50);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CSSParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			property();
			setState(54);
			match(COLON);
			setState(55);
			value_list();
			setState(56);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_listContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				value();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32512L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(CSSParser.NUMBER_VAL, 0); }
		public TerminalNode HEX_COLOR() { return getToken(CSSParser.HEX_COLOR, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fD\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001#\b"+
		"\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004"+
		"\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0004\u0006>\b\u0006\u000b\u0006\f\u0006?\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001"+
		"\u0000\b\u000eB\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018\u0001"+
		"\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b5\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f=\u0001"+
		"\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002"+
		"\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000"+
		"\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000"+
		"\u0000\u0000\u0018\u001d\u0003\u0004\u0002\u0000\u0019\u001a\u0005\b\u0000"+
		"\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000 $\u0005\u0002\u0000\u0000!#\u0003"+
		"\b\u0004\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\""+
		"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0005\u0001\u0000\u0000\u0000.4\u0005\u000e\u0000\u0000/0\u0005"+
		"\u0007\u0000\u000004\u0005\u000e\u0000\u000012\u0005\u0006\u0000\u0000"+
		"24\u0005\u000e\u0000\u00003.\u0001\u0000\u0000\u00003/\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0003"+
		"\n\u0005\u000067\u0005\u0004\u0000\u000078\u0003\f\u0006\u000089\u0005"+
		"\u0005\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u000e\u0000\u0000"+
		";\u000b\u0001\u0000\u0000\u0000<>\u0003\u000e\u0007\u0000=<\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\r\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000"+
		"B\u000f\u0001\u0000\u0000\u0000\u0006\u0013\u001d$,3?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}