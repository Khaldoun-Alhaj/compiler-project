// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/PythonParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PythonParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PythonParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#routeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRouteDefinition(PythonParser.RouteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#routeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRouteDefinition(PythonParser.RouteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PythonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PythonParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PythonParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PythonParser.ElementContext ctx);
}