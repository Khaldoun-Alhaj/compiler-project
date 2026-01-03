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
	 * Enter a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(PythonParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(PythonParser.MainBlockContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PythonParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PythonParser.ForLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PythonParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PythonParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#trailers}.
	 * @param ctx the parse tree
	 */
	void enterTrailers(PythonParser.TrailersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#trailers}.
	 * @param ctx the parse tree
	 */
	void exitTrailers(PythonParser.TrailersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(PythonParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(PythonParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(PythonParser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(PythonParser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdLiteral(PythonParser.IdLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdLiteral(PythonParser.IdLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameVarExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameVarExpr(PythonParser.NameVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameVarExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameVarExpr(PythonParser.NameVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainStrExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterMainStrExpr(PythonParser.MainStrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainStrExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitMainStrExpr(PythonParser.MainStrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(PythonParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(PythonParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(PythonParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(PythonParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
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