// Generated from MiniJava.g4 by ANTLR 4.7.2
 
package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(MiniJavaParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(MiniJavaParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MiniJavaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MiniJavaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MiniJavaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MiniJavaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(MiniJavaParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(MiniJavaParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(MiniJavaParser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(MiniJavaParser.Fun_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniJavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniJavaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiniJavaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiniJavaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(MiniJavaParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(MiniJavaParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(MiniJavaParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(MiniJavaParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MiniJavaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MiniJavaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(MiniJavaParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(MiniJavaParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_decl(MiniJavaParser.Local_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#local_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_decl(MiniJavaParser.Local_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiniJavaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiniJavaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MiniJavaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MiniJavaParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MiniJavaParser.ArgsContext ctx);
}