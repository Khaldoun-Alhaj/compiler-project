// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/JinjaParser.g4 by ANTLR 4.13.2

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
public class JinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STMT_OPEN=1, STMT_CLOSE=2, EXPR_OPEN=3, EXPR_CLOSE=4, FOR=5, IN=6, ENDFOR=7, 
		IF=8, ELSE=9, ENDIF=10, DOT=11, EQUALS=12, ASSIGN=13, COMMA=14, ID=15, 
		STRING=16, NUMBER=17, WS=18;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_forLoop = 2, RULE_ifStatement = 3, 
		RULE_expression = 4, RULE_variable = 5, RULE_condition = 6, RULE_content = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "forLoop", "ifStatement", "expression", "variable", 
			"condition", "content"
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

	@Override
	public String getGrammarFileName() { return "JinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STMT_OPEN || _la==EXPR_OPEN) {
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STMT_OPEN:
					{
					setState(16);
					statement();
					}
					break;
				case EXPR_OPEN:
					{
					setState(17);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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
	public static class StatementContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				forLoop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				ifStatement();
				}
				break;
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
		public List<TerminalNode> STMT_OPEN() { return getTokens(JinjaParser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(JinjaParser.STMT_OPEN, i);
		}
		public TerminalNode FOR() { return getToken(JinjaParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(JinjaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JinjaParser.ID, i);
		}
		public TerminalNode IN() { return getToken(JinjaParser.IN, 0); }
		public List<TerminalNode> STMT_CLOSE() { return getTokens(JinjaParser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(JinjaParser.STMT_CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(JinjaParser.ENDFOR, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(STMT_OPEN);
			setState(30);
			match(FOR);
			setState(31);
			match(ID);
			setState(32);
			match(IN);
			setState(33);
			match(ID);
			setState(34);
			match(STMT_CLOSE);
			setState(35);
			content();
			setState(36);
			match(STMT_OPEN);
			setState(37);
			match(ENDFOR);
			setState(38);
			match(STMT_CLOSE);
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> STMT_OPEN() { return getTokens(JinjaParser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(JinjaParser.STMT_OPEN, i);
		}
		public TerminalNode IF() { return getToken(JinjaParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> STMT_CLOSE() { return getTokens(JinjaParser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(JinjaParser.STMT_CLOSE, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(JinjaParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(JinjaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(STMT_OPEN);
			setState(41);
			match(IF);
			setState(42);
			condition();
			setState(43);
			match(STMT_CLOSE);
			setState(44);
			content();
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(45);
				match(STMT_OPEN);
				setState(46);
				match(ELSE);
				setState(47);
				match(STMT_CLOSE);
				setState(48);
				content();
				}
				break;
			}
			setState(51);
			match(STMT_OPEN);
			setState(52);
			match(ENDIF);
			setState(53);
			match(STMT_CLOSE);
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
		public TerminalNode EXPR_OPEN() { return getToken(JinjaParser.EXPR_OPEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EXPR_CLOSE() { return getToken(JinjaParser.EXPR_CLOSE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(EXPR_OPEN);
			setState(56);
			variable();
			setState(57);
			match(EXPR_CLOSE);
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
		public List<TerminalNode> ID() { return getTokens(JinjaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JinjaParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JinjaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JinjaParser.DOT, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(60);
				match(DOT);
				setState(61);
				match(ID);
				}
				}
				setState(66);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(JinjaParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(JinjaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JinjaParser.NUMBER, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			variable();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(68);
				match(EQUALS);
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(69);
					variable();
					}
					break;
				case STRING:
					{
					setState(70);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(71);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(76);
					matchWildcard();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		"\u0004\u0001\u0012S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005?\b\u0005\n\u0005\f\u0005"+
		"B\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006I\b\u0006\u0003\u0006K\b\u0006\u0001\u0007\u0005\u0007N\b"+
		"\u0007\n\u0007\f\u0007Q\t\u0007\u0001\u0007\u0001O\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0000S\u0000\u0014\u0001\u0000\u0000\u0000"+
		"\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000"+
		"\u0006(\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n;\u0001\u0000"+
		"\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000"+
		"\u0010\u0013\u0003\u0002\u0001\u0000\u0011\u0013\u0003\b\u0004\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018"+
		"\u0001\u0001\u0000\u0000\u0000\u0019\u001c\u0003\u0004\u0002\u0000\u001a"+
		"\u001c\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f"+
		" \u0005\u000f\u0000\u0000 !\u0005\u0006\u0000\u0000!\"\u0005\u000f\u0000"+
		"\u0000\"#\u0005\u0002\u0000\u0000#$\u0003\u000e\u0007\u0000$%\u0005\u0001"+
		"\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005\u0002\u0000\u0000\'\u0005"+
		"\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0005\b\u0000\u0000"+
		"*+\u0003\f\u0006\u0000+,\u0005\u0002\u0000\u0000,1\u0003\u000e\u0007\u0000"+
		"-.\u0005\u0001\u0000\u0000./\u0005\t\u0000\u0000/0\u0005\u0002\u0000\u0000"+
		"02\u0003\u000e\u0007\u00001-\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0005\n\u0000"+
		"\u000056\u0005\u0002\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0005"+
		"\u0003\u0000\u000089\u0003\n\u0005\u00009:\u0005\u0004\u0000\u0000:\t"+
		"\u0001\u0000\u0000\u0000;@\u0005\u000f\u0000\u0000<=\u0005\u000b\u0000"+
		"\u0000=?\u0005\u000f\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u000b"+
		"\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CJ\u0003\n\u0005\u0000"+
		"DH\u0005\f\u0000\u0000EI\u0003\n\u0005\u0000FI\u0005\u0010\u0000\u0000"+
		"GI\u0005\u0011\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JD\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LN\t"+
		"\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000P\u000f\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000\b\u0012\u0014\u001b1@HJO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}