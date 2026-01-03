// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/PythonParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PythonParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(PythonParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#routeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDefinition(PythonParser.RouteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PythonParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(PythonParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PythonParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(PythonParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PythonParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#trailers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailers(PythonParser.TrailersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(PythonParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(PythonParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(PythonParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLiteral}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLiteral(PythonParser.IdLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameVarExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameVarExpr(PythonParser.NameVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainStrExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStrExpr(PythonParser.MainStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(PythonParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(PythonParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(PythonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PythonParser.ElementContext ctx);
}