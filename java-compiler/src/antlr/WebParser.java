// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/WebParser.g4 by ANTLR 4.13.2
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
public class WebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, JINJA_COMMENT=2, WS=3, JINJA_STMT_OPEN=4, JINJA_EXPR_OPEN=5, 
		STYLE_OPEN=6, TAG_OPEN=7, HTML_TEXT=8, STYLE_TAG_CLOSE=9, STYLE_ID=10, 
		STYLE_EQUALS=11, STYLE_ATTR_VAL=12, STYLE_WS=13, TAG_CLOSE=14, TAG_SLASH_CLOSE=15, 
		SLASH=16, EQUALS=17, HTML_ID=18, ATTR_VALUE=19, TAG_WS=20, JINJA_STMT_CLOSE=21, 
		JINJA_EXPR_CLOSE=22, FOR=23, IN=24, ENDFOR=25, IF=26, ELIF=27, ELSE=28, 
		ENDIF=29, EQ=30, NEQ=31, GT=32, GTE=33, LT=34, LTE=35, NUMBER=36, ID=37, 
		STRING=38, DOT=39, J_WS=40, STYLE_END_TAG=41, CSS_CONTENT=42;
	public static final int
		RULE_template = 0, RULE_textNode = 1, RULE_element = 2, RULE_attribute = 3, 
		RULE_content = 4, RULE_jinjaElement = 5, RULE_forLoop = 6, RULE_ifStmt = 7, 
		RULE_condition = 8, RULE_expression = 9, RULE_variable = 10, RULE_cssBlock = 11, 
		RULE_styleAttr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "textNode", "element", "attribute", "content", "jinjaElement", 
			"forLoop", "ifStmt", "condition", "expression", "variable", "cssBlock", 
			"styleAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{%'", "'{{'", "'<style'", null, null, null, 
			null, null, null, null, null, "'/>'", "'/'", null, null, null, null, 
			"'%}'", "'}}'", "'for'", "'in'", "'endfor'", "'if'", "'elif'", "'else'", 
			"'endif'", "'=='", "'!='", null, "'>='", null, "'<='", null, null, null, 
			"'.'", null, "'</style>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "JINJA_COMMENT", "WS", "JINJA_STMT_OPEN", "JINJA_EXPR_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "STYLE_TAG_CLOSE", "STYLE_ID", 
			"STYLE_EQUALS", "STYLE_ATTR_VAL", "STYLE_WS", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"SLASH", "EQUALS", "HTML_ID", "ATTR_VALUE", "TAG_WS", "JINJA_STMT_CLOSE", 
			"JINJA_EXPR_CLOSE", "FOR", "IN", "ENDFOR", "IF", "ELIF", "ELSE", "ENDIF", 
			"EQ", "NEQ", "GT", "GTE", "LT", "LTE", "NUMBER", "ID", "STRING", "DOT", 
			"J_WS", "STYLE_END_TAG", "CSS_CONTENT"
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
	public String getGrammarFileName() { return "WebParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WebParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<JinjaElementContext> jinjaElement() {
			return getRuleContexts(JinjaElementContext.class);
		}
		public JinjaElementContext jinjaElement(int i) {
			return getRuleContext(JinjaElementContext.class,i);
		}
		public List<CssBlockContext> cssBlock() {
			return getRuleContexts(CssBlockContext.class);
		}
		public CssBlockContext cssBlock(int i) {
			return getRuleContext(CssBlockContext.class,i);
		}
		public List<TextNodeContext> textNode() {
			return getRuleContexts(TextNodeContext.class);
		}
		public TextNodeContext textNode(int i) {
			return getRuleContext(TextNodeContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPEN:
					{
					setState(26);
					element();
					}
					break;
				case JINJA_STMT_OPEN:
				case JINJA_EXPR_OPEN:
					{
					setState(27);
					jinjaElement();
					}
					break;
				case STYLE_OPEN:
					{
					setState(28);
					cssBlock();
					}
					break;
				case HTML_TEXT:
					{
					setState(29);
					textNode();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
	public static class TextNodeContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(WebParser.HTML_TEXT, 0); }
		public TextNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_textNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(HTML_TEXT);
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
	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(WebParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(WebParser.TAG_OPEN, i);
		}
		public List<TerminalNode> HTML_ID() { return getTokens(WebParser.HTML_ID); }
		public TerminalNode HTML_ID(int i) {
			return getToken(WebParser.HTML_ID, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(WebParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(WebParser.TAG_CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(WebParser.SLASH, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(WebParser.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TAG_OPEN);
			setState(40);
			match(HTML_ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_ID) {
				{
				{
				setState(41);
				attribute();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(47);
				match(TAG_CLOSE);
				setState(48);
				content();
				setState(49);
				match(TAG_OPEN);
				setState(50);
				match(SLASH);
				setState(51);
				match(HTML_ID);
				setState(52);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				{
				setState(54);
				match(TAG_CLOSE);
				}
				break;
			case 3:
				{
				setState(55);
				match(TAG_SLASH_CLOSE);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ID() { return getToken(WebParser.HTML_ID, 0); }
		public TerminalNode EQUALS() { return getToken(WebParser.EQUALS, 0); }
		public TerminalNode ATTR_VALUE() { return getToken(WebParser.ATTR_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(HTML_ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(59);
				match(EQUALS);
				setState(60);
				match(ATTR_VALUE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<JinjaElementContext> jinjaElement() {
			return getRuleContexts(JinjaElementContext.class);
		}
		public JinjaElementContext jinjaElement(int i) {
			return getRuleContext(JinjaElementContext.class,i);
		}
		public List<TextNodeContext> textNode() {
			return getRuleContexts(TextNodeContext.class);
		}
		public TextNodeContext textNode(int i) {
			return getRuleContext(TextNodeContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(66);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(63);
						element();
						}
						break;
					case JINJA_STMT_OPEN:
					case JINJA_EXPR_OPEN:
						{
						setState(64);
						jinjaElement();
						}
						break;
					case HTML_TEXT:
						{
						setState(65);
						textNode();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(WebParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(WebParser.JINJA_STMT_CLOSE, 0); }
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public TerminalNode JINJA_EXPR_OPEN() { return getToken(WebParser.JINJA_EXPR_OPEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode JINJA_EXPR_CLOSE() { return getToken(WebParser.JINJA_EXPR_CLOSE, 0); }
		public JinjaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElementContext jinjaElement() throws RecognitionException {
		JinjaElementContext _localctx = new JinjaElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jinjaElement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_STMT_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(JINJA_STMT_OPEN);
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(72);
					forLoop();
					}
					break;
				case IF:
					{
					setState(73);
					ifStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76);
				match(JINJA_STMT_CLOSE);
				}
				break;
			case JINJA_EXPR_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(JINJA_EXPR_OPEN);
				setState(79);
				variable();
				setState(80);
				match(JINJA_EXPR_CLOSE);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(WebParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(WebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WebParser.ID, i);
		}
		public TerminalNode IN() { return getToken(WebParser.IN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(WebParser.JINJA_STMT_CLOSE, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode JINJA_STMT_OPEN() { return getToken(WebParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode ENDFOR() { return getToken(WebParser.ENDFOR, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FOR);
			setState(85);
			match(ID);
			setState(86);
			match(IN);
			setState(87);
			match(ID);
			setState(88);
			match(JINJA_STMT_CLOSE);
			setState(89);
			content();
			setState(90);
			match(JINJA_STMT_OPEN);
			setState(91);
			match(ENDFOR);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WebParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(WebParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(WebParser.JINJA_STMT_CLOSE, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(WebParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(WebParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode ENDIF() { return getToken(WebParser.ENDIF, 0); }
		public List<TerminalNode> ELIF() { return getTokens(WebParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(WebParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(WebParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			condition();
			setState(95);
			match(JINJA_STMT_CLOSE);
			setState(96);
			content();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(JINJA_STMT_OPEN);
					setState(98);
					match(ELIF);
					setState(99);
					condition();
					setState(100);
					match(JINJA_STMT_CLOSE);
					setState(101);
					content();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(108);
				match(JINJA_STMT_OPEN);
				setState(109);
				match(ELSE);
				setState(110);
				match(JINJA_STMT_CLOSE);
				setState(111);
				content();
				}
				break;
			}
			setState(114);
			match(JINJA_STMT_OPEN);
			setState(115);
			match(ENDIF);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(WebParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(WebParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(WebParser.GT, 0); }
		public TerminalNode GTE() { return getToken(WebParser.GTE, 0); }
		public TerminalNode LT() { return getToken(WebParser.LT, 0); }
		public TerminalNode LTE() { return getToken(WebParser.LTE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				setState(118);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				expression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WebParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(WebParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(WebParser.STRING, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WebParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(WebParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(WebParser.DOT, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(125);
				match(DOT);
				setState(126);
				match(ID);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(WebParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_TAG_CLOSE() { return getToken(WebParser.STYLE_TAG_CLOSE, 0); }
		public TerminalNode CSS_CONTENT() { return getToken(WebParser.CSS_CONTENT, 0); }
		public TerminalNode STYLE_END_TAG() { return getToken(WebParser.STYLE_END_TAG, 0); }
		public List<StyleAttrContext> styleAttr() {
			return getRuleContexts(StyleAttrContext.class);
		}
		public StyleAttrContext styleAttr(int i) {
			return getRuleContext(StyleAttrContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STYLE_OPEN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_ID) {
				{
				{
				setState(133);
				styleAttr();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(STYLE_TAG_CLOSE);
			setState(140);
			match(CSS_CONTENT);
			setState(141);
			match(STYLE_END_TAG);
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
	public static class StyleAttrContext extends ParserRuleContext {
		public TerminalNode STYLE_ID() { return getToken(WebParser.STYLE_ID, 0); }
		public TerminalNode STYLE_EQUALS() { return getToken(WebParser.STYLE_EQUALS, 0); }
		public TerminalNode STYLE_ATTR_VAL() { return getToken(WebParser.STYLE_ATTR_VAL, 0); }
		public StyleAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStyleAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStyleAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStyleAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttrContext styleAttr() throws RecognitionException {
		StyleAttrContext _localctx = new StyleAttrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(STYLE_ID);
			setState(144);
			match(STYLE_EQUALS);
			setState(145);
			match(STYLE_ATTR_VAL);
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
		"\u0004\u0001*\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002+\b"+
		"\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004\f\u0004"+
		"F\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007k\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007q\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\by\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0080\b\n\n\n"+
		"\f\n\u0083\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u0087\b\u000b\n\u000b"+
		"\f\u000b\u008a\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000"+
		"\u001e#\u0001\u0000$&\u0098\u0000 \u0001\u0000\u0000\u0000\u0002%\u0001"+
		"\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006:\u0001\u0000"+
		"\u0000\u0000\bD\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fT"+
		"\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010u\u0001\u0000"+
		"\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000"+
		"\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000"+
		"\u001a\u001f\u0003\u0004\u0002\u0000\u001b\u001f\u0003\n\u0005\u0000\u001c"+
		"\u001f\u0003\u0016\u000b\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e"+
		"\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005"+
		"\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0005\b\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u0007\u0000\u0000(,\u0005\u0012"+
		"\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-8\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u000e\u0000"+
		"\u000001\u0003\b\u0004\u000012\u0005\u0007\u0000\u000023\u0005\u0010\u0000"+
		"\u000034\u0005\u0012\u0000\u000045\u0005\u000e\u0000\u000059\u0001\u0000"+
		"\u0000\u000069\u0005\u000e\u0000\u000079\u0005\u000f\u0000\u00008/\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9\u0005\u0001\u0000\u0000\u0000:=\u0005\u0012\u0000\u0000;<\u0005\u0011"+
		"\u0000\u0000<>\u0005\u0013\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?C\u0003\u0004\u0002"+
		"\u0000@C\u0003\n\u0005\u0000AC\u0003\u0002\u0001\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\t\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GJ\u0005\u0004\u0000\u0000"+
		"HK\u0003\f\u0006\u0000IK\u0003\u000e\u0007\u0000JH\u0001\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0015\u0000"+
		"\u0000MS\u0001\u0000\u0000\u0000NO\u0005\u0005\u0000\u0000OP\u0003\u0014"+
		"\n\u0000PQ\u0005\u0016\u0000\u0000QS\u0001\u0000\u0000\u0000RG\u0001\u0000"+
		"\u0000\u0000RN\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0017\u0000\u0000UV\u0005%\u0000\u0000VW\u0005\u0018\u0000\u0000"+
		"WX\u0005%\u0000\u0000XY\u0005\u0015\u0000\u0000YZ\u0003\b\u0004\u0000"+
		"Z[\u0005\u0004\u0000\u0000[\\\u0005\u0019\u0000\u0000\\\r\u0001\u0000"+
		"\u0000\u0000]^\u0005\u001a\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005\u0015"+
		"\u0000\u0000`i\u0003\b\u0004\u0000ab\u0005\u0004\u0000\u0000bc\u0005\u001b"+
		"\u0000\u0000cd\u0003\u0010\b\u0000de\u0005\u0015\u0000\u0000ef\u0003\b"+
		"\u0004\u0000fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jp\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0004\u0000"+
		"\u0000mn\u0005\u001c\u0000\u0000no\u0005\u0015\u0000\u0000oq\u0003\b\u0004"+
		"\u0000pl\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0005\u0004\u0000\u0000st\u0005\u001d\u0000\u0000t\u000f"+
		"\u0001\u0000\u0000\u0000ux\u0003\u0012\t\u0000vw\u0007\u0000\u0000\u0000"+
		"wy\u0003\u0012\t\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u0011\u0001\u0000\u0000\u0000z{\u0007\u0001\u0000\u0000{\u0013\u0001"+
		"\u0000\u0000\u0000|\u0081\u0005%\u0000\u0000}~\u0005\'\u0000\u0000~\u0080"+
		"\u0005%\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0088\u0005\u0006\u0000\u0000\u0085\u0087\u0003\u0018"+
		"\f\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u008d\u0005*\u0000\u0000"+
		"\u008d\u008e\u0005)\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\n\u0000\u0000\u0090\u0091\u0005\u000b\u0000\u0000\u0091\u0092"+
		"\u0005\f\u0000\u0000\u0092\u0019\u0001\u0000\u0000\u0000\u000e\u001e "+
		",8=BDJRipx\u0081\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}