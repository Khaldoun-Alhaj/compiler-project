// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/PythonParser.g4 by ANTLR 4.13.2
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
public class PythonParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_stmt = 1, RULE_exprStmt = 2, RULE_importStmt = 3, 
		RULE_mainBlock = 4, RULE_routeDefinition = 5, RULE_parameterList = 6, 
		RULE_ifStmt = 7, RULE_forLoop = 8, RULE_statementBlock = 9, RULE_assignment = 10, 
		RULE_returnStmt = 11, RULE_expression = 12, RULE_trailers = 13, RULE_trailer = 14, 
		RULE_atom = 15, RULE_argList = 16, RULE_argument = 17, RULE_listLiteral = 18, 
		RULE_dictLiteral = 19, RULE_pair = 20, RULE_element = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "stmt", "exprStmt", "importStmt", "mainBlock", "routeDefinition", 
			"parameterList", "ifStmt", "forLoop", "statementBlock", "assignment", 
			"returnStmt", "expression", "trailers", "trailer", "atom", "argList", 
			"argument", "listLiteral", "dictLiteral", "pair", "element"
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

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParse(this);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3859565499240L) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
				case FROM:
				case RETURN:
				case IF:
				case FOR:
				case TRUE:
				case FALSE:
				case NAME_VAR:
				case MAIN_STR:
				case DECORATOR:
				case LPAREN:
				case LBRACK:
				case LBRACE:
				case ID:
				case STRING:
				case NUMBER:
					{
					setState(44);
					stmt();
					}
					break;
				case NL:
					{
					setState(45);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
	public static class StmtContext extends ParserRuleContext {
		public RouteDefinitionContext routeDefinition() {
			return getRuleContext(RouteDefinitionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				routeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				importStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				returnStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				mainBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				exprStmt();
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NL() { return getToken(PythonParser.NL, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			expression(0);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode NL() { return getToken(PythonParser.NL, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStmt);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(IMPORT);
				setState(67);
				match(ID);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(68);
					match(COMMA);
					setState(69);
					match(ID);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(FROM);
				setState(77);
				match(ID);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(78);
					match(DOT);
					setState(79);
					match(ID);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(IMPORT);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(86);
					match(ID);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(87);
						match(COMMA);
						setState(88);
						match(ID);
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(94);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode NAME_VAR() { return getToken(PythonParser.NAME_VAR, 0); }
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode MAIN_STR() { return getToken(PythonParser.MAIN_STR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			match(NAME_VAR);
			setState(102);
			match(EQ);
			setState(103);
			match(MAIN_STR);
			setState(104);
			match(COLON);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(105);
				match(NL);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(INDENT);
			setState(112);
			statementBlock();
			setState(113);
			match(DEDENT);
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
	public static class RouteDefinitionContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(PythonParser.DECORATOR, 0); }
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public RouteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRouteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRouteDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRouteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefinitionContext routeDefinition() throws RecognitionException {
		RouteDefinitionContext _localctx = new RouteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_routeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(DECORATOR);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(116);
				match(NL);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(DEF);
			setState(123);
			match(ID);
			setState(124);
			match(LPAREN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				parameterList();
				}
			}

			setState(128);
			match(RPAREN);
			setState(129);
			match(COLON);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(130);
				match(NL);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(INDENT);
			setState(137);
			statementBlock();
			setState(138);
			match(DEDENT);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				match(ID);
				}
				}
				setState(147);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(PythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(PythonParser.DEDENT, i);
		}
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			expression(0);
			setState(150);
			match(COLON);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(151);
				match(NL);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(INDENT);
			setState(158);
			statementBlock();
			setState(159);
			match(DEDENT);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(160);
				match(ELIF);
				setState(161);
				expression(0);
				setState(162);
				match(COLON);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(163);
					match(NL);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(INDENT);
				setState(170);
				statementBlock();
				setState(171);
				match(DEDENT);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(178);
				match(ELSE);
				setState(179);
				match(COLON);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(180);
					match(NL);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(INDENT);
				setState(187);
				statementBlock();
				setState(188);
				match(DEDENT);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FOR);
			setState(193);
			match(ID);
			setState(194);
			match(IN);
			setState(195);
			expression(0);
			setState(196);
			match(COLON);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(197);
				match(NL);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(INDENT);
			setState(204);
			statementBlock();
			setState(205);
			match(DEDENT);
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
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
				case FROM:
				case RETURN:
				case IF:
				case FOR:
				case TRUE:
				case FALSE:
				case NAME_VAR:
				case MAIN_STR:
				case DECORATOR:
				case LPAREN:
				case LBRACK:
				case LBRACE:
				case ID:
				case STRING:
				case NUMBER:
					{
					setState(207);
					stmt();
					}
					break;
				case NL:
					{
					setState(208);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3859565499240L) != 0) );
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode NL() { return getToken(PythonParser.NL, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression(0);
			setState(214);
			match(ASSIGN);
			setState(215);
			expression(0);
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NL() { return getToken(PythonParser.NL, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(RETURN);
			setState(219);
			expression(0);
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TrailersContext trailers() {
			return getRuleContext(TrailersContext.class,0);
		}
		public PrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(223);
			atom();
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(224);
				trailers();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(228);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(231);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(234);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailersContext extends ParserRuleContext {
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public TrailersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrailers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrailers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrailers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailersContext trailers() throws RecognitionException {
		TrailersContext _localctx = new TrailersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trailers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241);
					trailer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TrailerContext extends ParserRuleContext {
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	 
		public TrailerContext() { }
		public void copyFrom(TrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrTrailerContext extends TrailerContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public AttrTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttrTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttrTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttrTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexTrailerContext extends TrailerContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public IndexTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIndexTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIndexTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIndexTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallTrailerContext extends TrailerContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCallTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCallTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCallTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_trailer);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new IndexTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LBRACK);
				setState(247);
				expression(0);
				setState(248);
				match(RBRACK);
				}
				break;
			case LPAREN:
				_localctx = new CallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(LPAREN);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3859565232128L) != 0)) {
					{
					setState(251);
					argList();
					}
				}

				setState(254);
				match(RPAREN);
				}
				break;
			case DOT:
				_localctx = new AttrTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(DOT);
				setState(256);
				match(ID);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTrueContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public BoolTrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringLiteralContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFalseContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public BoolFalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainStrExprContext extends AtomContext {
		public TerminalNode MAIN_STR() { return getToken(PythonParser.MAIN_STR, 0); }
		public MainStrExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMainStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMainStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMainStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameVarExprContext extends AtomContext {
		public TerminalNode NAME_VAR() { return getToken(PythonParser.NAME_VAR, 0); }
		public NameVarExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdLiteralContext extends AtomContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public IdLiteralContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends AtomContext {
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public DictExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends AtomContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ParenExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberLiteralContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				listLiteral();
				}
				break;
			case LBRACE:
				_localctx = new DictExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				dictLiteral();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(NUMBER);
				}
				break;
			case ID:
				_localctx = new IdLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(ID);
				}
				break;
			case NAME_VAR:
				_localctx = new NameVarExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(NAME_VAR);
				}
				break;
			case MAIN_STR:
				_localctx = new MainStrExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				match(MAIN_STR);
				}
				break;
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				match(FALSE);
				}
				break;
			case LPAREN:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(268);
				match(LPAREN);
				setState(269);
				expression(0);
				setState(270);
				match(RPAREN);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			argument();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				argument();
				}
				}
				setState(281);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(282);
				match(ID);
				setState(283);
				match(ASSIGN);
				}
				break;
			}
			setState(286);
			expression(0);
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
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(PythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(PythonParser.DEDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LBRACK);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3859565232128L) != 0)) {
				{
				setState(295);
				element();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296);
					match(COMMA);
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
						{
						{
						setState(297);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303);
					element();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(311);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(RBRACK);
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
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(PythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(PythonParser.DEDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dictLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LBRACE);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==STRING) {
				{
				setState(326);
				pair();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
						{
						{
						setState(328);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(334);
					pair();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(342);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
	public static class PairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public List<TerminalNode> NL() { return getTokens(PythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PythonParser.NL, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(PythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(PythonParser.DEDENT, i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			match(COLON);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(352);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			element();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Q\b\u0003"+
		"\n\u0003\f\u0003T\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003Z\b\u0003\n\u0003\f\u0003]\t\u0003\u0001\u0003\u0003\u0003"+
		"`\b\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004\n\u0004"+
		"\f\u0004n\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u007f\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0084\b\u0005\n\u0005\f\u0005"+
		"\u0087\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006\f\u0006\u0093"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0099"+
		"\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a5\b\u0007"+
		"\n\u0007\f\u0007\u00a8\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00ae\b\u0007\n\u0007\f\u0007\u00b1\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00b6\b\u0007\n\u0007\f\u0007\u00b9"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c7"+
		"\b\b\n\b\f\b\u00ca\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0004\t\u00d2\b\t\u000b\t\f\t\u00d3\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e2\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ed\b\f\n\f\f\f\u00f0\t\f\u0001\r\u0004\r"+
		"\u00f3\b\r\u000b\r\f\r\u00f4\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fd\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0102\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0111"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0116\b\u0010"+
		"\n\u0010\f\u0010\u0119\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u011d"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0123"+
		"\b\u0012\n\u0012\f\u0012\u0126\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u012b\b\u0012\n\u0012\f\u0012\u012e\t\u0012\u0001\u0012\u0005"+
		"\u0012\u0131\b\u0012\n\u0012\f\u0012\u0134\t\u0012\u0003\u0012\u0136\b"+
		"\u0012\u0001\u0012\u0005\u0012\u0139\b\u0012\n\u0012\f\u0012\u013c\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0142\b\u0013"+
		"\n\u0013\f\u0013\u0145\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u014a\b\u0013\n\u0013\f\u0013\u014d\t\u0013\u0001\u0013\u0005\u0013"+
		"\u0150\b\u0013\n\u0013\f\u0013\u0153\t\u0013\u0003\u0013\u0155\b\u0013"+
		"\u0001\u0013\u0005\u0013\u0158\b\u0013\n\u0013\f\u0013\u015b\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0162"+
		"\b\u0014\n\u0014\f\u0014\u0165\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0000\u0001\u0018\u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0006\u0001\u0001\u0003\u0003\u0001\u0000\u0015\u0016\u0001\u0000\u0013"+
		"\u0014\u0001\u0000\u0017\u001c\u0001\u0000\u0001\u0003\u0001\u0000\'("+
		"\u018d\u00000\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004"+
		"?\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bd\u0001\u0000"+
		"\u0000\u0000\ns\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000"+
		"\u0012\u00d1\u0001\u0000\u0000\u0000\u0014\u00d5\u0001\u0000\u0000\u0000"+
		"\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000\u0000\u0000"+
		"\u001a\u00f2\u0001\u0000\u0000\u0000\u001c\u0101\u0001\u0000\u0000\u0000"+
		"\u001e\u0110\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\""+
		"\u011c\u0001\u0000\u0000\u0000$\u0120\u0001\u0000\u0000\u0000&\u013f\u0001"+
		"\u0000\u0000\u0000(\u015e\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000"+
		"\u0000,/\u0003\u0002\u0001\u0000-/\u0005\u0003\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000"+
		"\u0000\u00005>\u0003\n\u0005\u00006>\u0003\u0014\n\u00007>\u0003\u0006"+
		"\u0003\u00008>\u0003\u000e\u0007\u00009>\u0003\u0010\b\u0000:>\u0003\u0016"+
		"\u000b\u0000;>\u0003\b\u0004\u0000<>\u0003\u0004\u0002\u0000=5\u0001\u0000"+
		"\u0000\u0000=6\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=8\u0001"+
		"\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000"+
		"\u0000\u0000?@\u0003\u0018\f\u0000@A\u0007\u0000\u0000\u0000A\u0005\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0005\u0000\u0000CH\u0005\'\u0000\u0000DE\u0005"+
		"$\u0000\u0000EG\u0005\'\u0000\u0000FD\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000Kc\u0007\u0000\u0000"+
		"\u0000LM\u0005\u0006\u0000\u0000MR\u0005\'\u0000\u0000NO\u0005&\u0000"+
		"\u0000OQ\u0005\'\u0000\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000U_\u0005\u0005\u0000\u0000V[\u0005"+
		"\'\u0000\u0000WX\u0005$\u0000\u0000XZ\u0005\'\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\`\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^`\u0005\u0015\u0000\u0000_V\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0007\u0000\u0000\u0000bB\u0001\u0000"+
		"\u0000\u0000bL\u0001\u0000\u0000\u0000c\u0007\u0001\u0000\u0000\u0000"+
		"de\u0005\t\u0000\u0000ef\u0005\u0010\u0000\u0000fg\u0005\u0017\u0000\u0000"+
		"gh\u0005\u0011\u0000\u0000hl\u0005#\u0000\u0000ik\u0005\u0003\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0005\u0001\u0000\u0000pq\u0003\u0012\t\u0000qr\u0005\u0002"+
		"\u0000\u0000r\t\u0001\u0000\u0000\u0000sw\u0005\u0012\u0000\u0000tv\u0005"+
		"\u0003\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0007\u0000\u0000{|\u0005\'\u0000"+
		"\u0000|~\u0005\u001d\u0000\u0000}\u007f\u0003\f\u0006\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u001e\u0000\u0000\u0081\u0085\u0005#\u0000\u0000"+
		"\u0082\u0084\u0005\u0003\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0001\u0000\u0000"+
		"\u0089\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005\u0002\u0000\u0000\u008b"+
		"\u000b\u0001\u0000\u0000\u0000\u008c\u0091\u0005\'\u0000\u0000\u008d\u008e"+
		"\u0005$\u0000\u0000\u008e\u0090\u0005\'\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\t\u0000"+
		"\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u009a\u0005#\u0000\u0000"+
		"\u0097\u0099\u0005\u0003\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000"+
		"\u009e\u009f\u0003\u0012\t\u0000\u009f\u00af\u0005\u0002\u0000\u0000\u00a0"+
		"\u00a1\u0005\n\u0000\u0000\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u00a6"+
		"\u0005#\u0000\u0000\u00a3\u00a5\u0005\u0003\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0001\u0000\u0000\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u0005\u0002"+
		"\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00be\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u000b"+
		"\u0000\u0000\u00b3\u00b7\u0005#\u0000\u0000\u00b4\u00b6\u0005\u0003\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00bc\u0003\u0012\t\u0000"+
		"\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000"+
		"\u00be\u00b2\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u000f\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1"+
		"\u00c2\u0005\'\u0000\u0000\u00c2\u00c3\u0005\r\u0000\u0000\u00c3\u00c4"+
		"\u0003\u0018\f\u0000\u00c4\u00c8\u0005#\u0000\u0000\u00c5\u00c7\u0005"+
		"\u0003\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u0001\u0000\u0000\u00cc\u00cd\u0003"+
		"\u0012\t\u0000\u00cd\u00ce\u0005\u0002\u0000\u0000\u00ce\u0011\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d2\u0003\u0002\u0001\u0000\u00d0\u00d2\u0005\u0003"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0013\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7\u0005%\u0000"+
		"\u0000\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0007\u0000\u0000\u0000"+
		"\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00db\u0005\b\u0000\u0000\u00db"+
		"\u00dc\u0003\u0018\f\u0000\u00dc\u00dd\u0007\u0000\u0000\u0000\u00dd\u0017"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0006\f\uffff\uffff\u0000\u00df\u00e1"+
		"\u0003\u001e\u000f\u0000\u00e0\u00e2\u0003\u001a\r\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00ee\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\n\u0004\u0000\u0000\u00e4\u00e5\u0007\u0001"+
		"\u0000\u0000\u00e5\u00ed\u0003\u0018\f\u0005\u00e6\u00e7\n\u0003\u0000"+
		"\u0000\u00e7\u00e8\u0007\u0002\u0000\u0000\u00e8\u00ed\u0003\u0018\f\u0004"+
		"\u00e9\u00ea\n\u0002\u0000\u0000\u00ea\u00eb\u0007\u0003\u0000\u0000\u00eb"+
		"\u00ed\u0003\u0018\f\u0003\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003\u001c\u000e\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u001b"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000\u00f7\u00f8"+
		"\u0003\u0018\f\u0000\u00f8\u00f9\u0005 \u0000\u0000\u00f9\u0102\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0005\u001d\u0000\u0000\u00fb\u00fd\u0003"+
		" \u0010\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0102\u0005\u001e"+
		"\u0000\u0000\u00ff\u0100\u0005&\u0000\u0000\u0100\u0102\u0005\'\u0000"+
		"\u0000\u0101\u00f6\u0001\u0000\u0000\u0000\u0101\u00fa\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u001d\u0001\u0000\u0000"+
		"\u0000\u0103\u0111\u0003$\u0012\u0000\u0104\u0111\u0003&\u0013\u0000\u0105"+
		"\u0111\u0005(\u0000\u0000\u0106\u0111\u0005)\u0000\u0000\u0107\u0111\u0005"+
		"\'\u0000\u0000\u0108\u0111\u0005\u0010\u0000\u0000\u0109\u0111\u0005\u0011"+
		"\u0000\u0000\u010a\u0111\u0005\u000e\u0000\u0000\u010b\u0111\u0005\u000f"+
		"\u0000\u0000\u010c\u010d\u0005\u001d\u0000\u0000\u010d\u010e\u0003\u0018"+
		"\f\u0000\u010e\u010f\u0005\u001e\u0000\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u0103\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000"+
		"\u0000\u0110\u0105\u0001\u0000\u0000\u0000\u0110\u0106\u0001\u0000\u0000"+
		"\u0000\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000\u0000"+
		"\u0000\u0110\u0109\u0001\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000"+
		"\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000"+
		"\u0000\u0111\u001f\u0001\u0000\u0000\u0000\u0112\u0117\u0003\"\u0011\u0000"+
		"\u0113\u0114\u0005$\u0000\u0000\u0114\u0116\u0003\"\u0011\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"!\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\'\u0000\u0000\u011b\u011d\u0005%\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0003\u0018\f\u0000\u011f#\u0001\u0000"+
		"\u0000\u0000\u0120\u0124\u0005\u001f\u0000\u0000\u0121\u0123\u0007\u0004"+
		"\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0135\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0127\u0132\u0003*\u0015\u0000\u0128\u012c\u0005$\u0000\u0000"+
		"\u0129\u012b\u0007\u0004\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0131\u0003*\u0015\u0000\u0130"+
		"\u0128\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135"+
		"\u0127\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u013a\u0001\u0000\u0000\u0000\u0137\u0139\u0007\u0004\u0000\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005 \u0000\u0000\u013e%\u0001\u0000\u0000\u0000\u013f\u0143\u0005"+
		"!\u0000\u0000\u0140\u0142\u0007\u0004\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0154\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0151\u0003(\u0014"+
		"\u0000\u0147\u014b\u0005$\u0000\u0000\u0148\u014a\u0007\u0004\u0000\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u0150\u0003(\u0014\u0000\u014f\u0147\u0001\u0000\u0000\u0000\u0150"+
		"\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0146\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0159\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0007\u0004\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\"\u0000\u0000\u015d\'"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0007\u0005\u0000\u0000\u015f\u0163"+
		"\u0005#\u0000\u0000\u0160\u0162\u0007\u0004\u0000\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0003"+
		"*\u0015\u0000\u0167)\u0001\u0000\u0000\u0000\u0168\u0169\u0003\u0018\f"+
		"\u0000\u0169+\u0001\u0000\u0000\u0000).0=HR[_blw~\u0085\u0091\u009a\u00a6"+
		"\u00af\u00b7\u00be\u00c8\u00d1\u00d3\u00e1\u00ec\u00ee\u00f4\u00fc\u0101"+
		"\u0110\u0117\u011c\u0124\u012c\u0132\u0135\u013a\u0143\u014b\u0151\u0154"+
		"\u0159\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}