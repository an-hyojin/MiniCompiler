package listener.main;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import generated.MiniJavaBaseListener;
import generated.MiniJavaParser;
import generated.MiniJavaParser.ParamsContext;

import static listener.main.BytecodeGenListenerHelper.*;
import static listener.main.SymbolTable.*;

public class BytecodeGenListener extends MiniJavaBaseListener implements ParseTreeListener {
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();// 노드 별로 string을 저장할 공간
	SymbolTable symbolTable = new SymbolTable();// symtable생성

	int tab = 0;
	int label = 0;
	String className;

	// program : decl+
	@Override
	public void enterProgram(MiniJavaParser.ProgramContext ctx) {
		className = getCurrentClassName(ctx);
	}

	@Override
	public void enterFun_decl(MiniJavaParser.Fun_declContext ctx) {
		symbolTable.initFunDecl();// fun초기화

		String fname = getFunName(ctx);// ctx로 부터 함수 이름 얻기
		ParamsContext params;// param 저장공간

		if (fname.equals("main")) {// 메인이면
			symbolTable.putLocalVar("args", Type.INTARRAY);// args에 intArray들어옴 -> put
		} else {// 메인이 아니라면
			symbolTable.putFunSpecStr(ctx);// ctx의 fun spec str를 넣어준 뒤
			params = ctx.params();// param 넣어줌
			symbolTable.putParams(params);// param 내용들을 넣어줌
		}
	}

	// fun_decl : type_spec IDENT '(' params ')' compound_stmt ;
	@Override
	public void exitFun_decl(MiniJavaParser.Fun_declContext ctx) {
		String header = funcHeader(ctx, ctx.IDENT().getText());// function의 header만들어 저장

		String stmt = newTexts.get(ctx.compound_stmt());// compound_stmt얻어와서 저장
		if (ctx.compound_stmt().stmt(ctx.compound_stmt().stmt().size()-1)
				.getChild(0) instanceof MiniJavaParser.Return_stmtContext) {
			// 리턴문 존재
			newTexts.put(ctx, header + stmt + ".end method\n");// newTexts에 header+stmt+.end method 저장

		} else {
			newTexts.put(ctx, header + stmt + "return\n" + ".end method\n");// newTexts에 header+stmt+.end method 저장
		}
		// <(2) Fill here!>
	}

	// var_decl : type_spec IDENT ';' | type_spec IDENT '=' LITERAL ';'|type_spec
	// IDENT '[' LITERAL ']' ';'
//	| type_spec'[' ']' IDENT '=' NEW type_spec'['LITERAL']'';' ;
	@Override
	public void enterVar_decl(MiniJavaParser.Var_declContext ctx) {// var 선언 부
		String varName = ctx.IDENT().getText();// var name저장
		if (isArrayDecl(ctx)) {// array 선언이면
			symbolTable.putGlobalVar(varName, Type.INTARRAY);// int array넣어줌
		} else if (isDeclWithInit(ctx)) {// init이 있으면
			symbolTable.putGlobalVarWithInitVal(varName, Type.INT, initVal(ctx));// init이 있는 int type넣어줌
		} else { // simple decl
			symbolTable.putGlobalVar(varName, Type.INT);// table에 넣어줌
		}
	}

	@Override
	public void exitVar_decl(MiniJavaParser.Var_declContext ctx) {// var나갈 때
		String varName = ctx.IDENT().getText();// varname저장
		String varDecl = "";// var decl저장공간 생성

		if (isDeclWithInit(ctx)) {// init이 있으면
			// load해야함
			varDecl += newTexts.get(ctx.LITERAL());
			varDecl += "putfield " + varName + "\n";// putfield하기
			// v. initialization => Later! skip now..:
		}
		newTexts.put(ctx, varDecl);// string 저장
	}

	@Override
	public void enterLocal_decl(MiniJavaParser.Local_declContext ctx) {// var 나갈 때
		if (isArrayDecl(ctx)) {// array선언이면
			symbolTable.putLocalVar(getLocalVarName(ctx), Type.INTARRAY);// array type으로 넣어줌
		} else if (isDeclWithInit(ctx)) {// init val이 있으면
			symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.INT, initVal(ctx));// init이 있는 int type넣어줌
		} else { // simple decl
			symbolTable.putLocalVar(getLocalVarName(ctx), Type.INT);// table에 넣어줌
		}
	}

	@Override
	public void exitLocal_decl(MiniJavaParser.Local_declContext ctx) {// local decl exit할때
		String varDecl = "";// 저장공간
		if (isArrayDecl(ctx)) {
			varDecl = "iconst_" + ctx.LITERAL() + "\n";
			varDecl += "newarray\t int\n";
			varDecl += "astore_" + symbolTable.getVarId(ctx) + "\n";
		} else if (isDeclWithInit(ctx)) {// init이 있으면
			String vId = symbolTable.getVarId(ctx);// symtable로 부터 id얻어옴
			varDecl += "ldc " + ctx.LITERAL().getText() + "\n" + "istore_" + vId + "\n";// val load한뒤 store문 작성
		}
		newTexts.put(ctx, varDecl);// put
	}

	@Override
	public void exitProgram(MiniJavaParser.ProgramContext ctx) {// program종료
		String classProlog = getFunProlog(className);// prolog얻어오기

		String fun_decl = "", var_decl = "";// 저장공간

		for (MiniJavaParser.DeclContext decls : ctx.decl()) {
			if (decls.fun_decl() != null) { // fundecl이면
				fun_decl += newTexts.get(decls.fun_decl());// 추가
			} else if (decls.var_decl() != null) {// var decl이면
				var_decl += newTexts.get(decls.var_decl());// 추가
			}
		}
		newTexts.put(ctx, classProlog + var_decl + fun_decl);// 합쳐서 저장
		System.out.println(newTexts.get(ctx));// 출력
	}

	// decl : var_decl | fun_decl
	@Override
	public void exitDecl(MiniJavaParser.DeclContext ctx) {// decl나갈 때
		String decl = "";// 저장공간 생성
		if (ctx.getChildCount() == 1) {// 있어도 되고 없어도 됨
			if (ctx.var_decl() != null) // var_decl
				decl += newTexts.get(ctx.var_decl());// var decl 얻어와서 넣기
			else { // fun_decl
				decl += newTexts.get(ctx.fun_decl());// fun decl 얻어와서 넣기
			}
		}
		newTexts.put(ctx, decl);// put
	}

	// stmt : expr_stmt | compound_stmt | if_stmt | while_stmt | return_stmt
	@Override
	public void exitStmt(MiniJavaParser.StmtContext ctx) {// stmt나갈때
		String stmt = "";// 저장공간
		if (ctx.getChildCount() > 0) {// 있어도 되고 없어도 됨
			if (ctx.expr_stmt() != null) // expr_stmt
				stmt += newTexts.get(ctx.expr_stmt());// 얻어옴
			else if (ctx.compound_stmt() != null) // compound_stmt
				stmt += newTexts.get(ctx.compound_stmt());// 얻어옴
			else if (ctx.if_stmt() != null) {// if문이면
				stmt += newTexts.get(ctx.if_stmt());// 얻어옴
			} else if (ctx.while_stmt() != null) {// while문이면
				stmt += newTexts.get(ctx.while_stmt());// 얻어옴
			} else if (ctx.print_stmt() != null) {
				stmt += newTexts.get(ctx.print_stmt());
			} else {// 아니면 return stmt
				stmt += newTexts.get(ctx.return_stmt());// 얻어옴
			}
		}
		newTexts.put(ctx, stmt);// put
	}

	// expr_stmt : expr ';'
	@Override
	public void exitExpr_stmt(MiniJavaParser.Expr_stmtContext ctx) {
		String stmt = "";// stmt저장공간
		if (ctx.getChildCount() == 2) {// childCount==2일때 -> expr ;
			stmt += newTexts.get(ctx.expr()); // expr넣기
		}
		newTexts.put(ctx, stmt);// ctx에 저장
	}

	// while_stmt : WHILE '(' expr ')' stmt
	@Override
	public void exitWhile_stmt(MiniJavaParser.While_stmtContext ctx) {// while문 나갈 때
		String res = "";// 저장 공간
		String expr = newTexts.get(ctx.expr());// expr얻어옴 ->0(false)이거나 1(true)
		String stmt = newTexts.get(ctx.stmt());// stmt얻어옴 실행할 문장
		String lend1 = symbolTable.newLabel();// while문
		String lend2 = symbolTable.newLabel();// 탈출할 곳
		res += lend1 + ":\n" + expr + "ifeq " + lend2 + "\n" + stmt + "goto " + lend1 + "\n" + lend2 + ":\n";
		// 조합해서 넣어줌 lend1 : while문 / expr : 조건문 / 조건문이 0이면 false-> lend2로 / 1이면 stmt실행 /
		// goto lend1
		newTexts.put(ctx, res);// ctx에 저장
		// <(1) Fill here!>
	}

	private String funcHeader(MiniJavaParser.Fun_declContext ctx, String fname) {// function header
		return ".method public static " + symbolTable.getFunSpecStr(fname) + "\n" + "\t" + ".limit stack "
				+ getStackSize(ctx) + "\n" + "\t" + ".limit locals " + getLocalVarSize(ctx) + "\n";// header string
																									// return
	}

	// compound_stmt : '{' local_decl* stmt* '}'
	@Override
	public void exitCompound_stmt(MiniJavaParser.Compound_stmtContext ctx) {// compound stmt일 때
		String stmt = "";// 저장공간
		for (int i = 0; i < ctx.getChildCount(); i++) {// ctx count만큼 반복
			if (ctx.getChild(i) instanceof MiniJavaParser.Local_declContext
					|| ctx.getChild(i) instanceof MiniJavaParser.StmtContext) {// ctx가 local decl이거나 stmt일때
				stmt += newTexts.get(ctx.getChild(i));// 얻어와서 저장
			}
		}
		newTexts.put(ctx, stmt);// put
		// <(3) Fill here>
	}

	@Override
	public void exitPrint_stmt(MiniJavaParser.Print_stmtContext ctx) {
		String expr = "getstatic java/lang/System/out Ljava/io/PrintStream; " + "\n" + newTexts.get(ctx.expr())
				+ "invokevirtual " + symbolTable.getFunSpecStr("_print") + "\n";// print함수 호출
		newTexts.put(ctx, expr);
	}

	// if_stmt : IF '(' expr ')' stmt | IF '(' expr ')' stmt ELSE stmt;
	@Override
	public void exitIf_stmt(MiniJavaParser.If_stmtContext ctx) {// if stmt
		String stmt = "";// 저장 공간
		String condExpr = newTexts.get(ctx.expr());// 조건문
		String thenStmt = newTexts.get(ctx.stmt(0));// 실행할 문장

		String lend = symbolTable.newLabel();// if문 끝날 곳

		if (noElse(ctx)) {// else가 없으면
			stmt += condExpr + "ifeq " + lend + "\n" + thenStmt + lend + ":" + "\n";// 조건문 후 0이면 lend로, 아니라면 thenStmt실행
		} else {// else가 있으면
			String lelse = symbolTable.newLabel();// else문 할 곳
			String elseStmt = newTexts.get(ctx.stmt(1));// else stmt얻어옴
			stmt += condExpr + "ifeq " + lelse + "\n" + thenStmt + "goto " + lend + "\n" + lelse + ": \n" + elseStmt
					+ lend + ":" + "\n";// 조건문 후 0이면 lelse로 가서 else문 실행 아니면 then실행 후 goto lend
		}
		newTexts.put(ctx, stmt);// string저장
	}

	// return_stmt : RETURN ';' | RETURN expr ';'
	@Override
	public void exitReturn_stmt(MiniJavaParser.Return_stmtContext ctx) {// return 문
		String stmt = "";// stmt저장
		if (ctx.expr() != null) {// expr이 있으면 리턴할 것이 있을때-> int
			stmt += newTexts.get(ctx.expr());// expr얻어와서 저장
			stmt += "ireturn\n";// i return
		} else {// 아니면 그냥 리턴
			stmt += "return\n";// 리턴
		}
		newTexts.put(ctx, stmt);// 저장
		// <(4) Fill here>

	}

//	|'('expr')'|IDENT'['expr']'|IDENT'('args')'|expr'*'expr|expr'/'expr|expr'%'expr|expr'+'expr|expr'-'expr|
//
//	expr EQ expr|
//	expr NE expr|
//	expr LE expr|expr'<'expr|
//	expr GE expr|expr'>'expr|'!'expr|
//	expr AND expr|
//	expr OR expr|IDENT'='expr|IDENT'['expr']''='expr;
//
	@Override
	public void exitExpr(MiniJavaParser.ExprContext ctx) {// expr나갈 때
		String expr = "";// 저장공간
		if (ctx.getChildCount() <= 0) {// child가 없을 때
			newTexts.put(ctx, "");// 빈 스트링 저장
			return;// 끝
		}
		if (ctx.getChildCount() == 1) { // IDENT | LITERAL일때
			if (ctx.IDENT() != null) {// ident가 있으면
				String idName = ctx.IDENT().getText();// getText
				if (symbolTable.getVarType(idName) == Type.INT) {// type이 int라면
					expr += "iload_" + symbolTable.getVarId(idName) + " \n";// iload해줌
				} else {// type이 배열일때
					// Type int array => Later! skip now..
					 expr += " lda " + symbolTable.getVarId(ctx.IDENT().getText()) + " \n"; // -> 이게 왜있는거? 질문
				}
			} else if (ctx.LITERAL() != null) {// literal일때
				String literalStr = ctx.LITERAL().getText();// get Text한후
				expr += "ldc " + literalStr + " \n";// load상수
			}
		} else if (ctx.getChildCount() == 2) {// UnaryOperation
			expr = handleUnaryExpr(ctx, newTexts.get(ctx.expr(0)));// expr 저장
		} else if (ctx.getChildCount() == 3) {// 3일때는 binaryOp이거나 (expr), assignment
			if (ctx.getChild(0).getText().equals("(")) { // '(' expr ')'
				expr = newTexts.get(ctx.expr(0));// expr얻어옴
			} else if (ctx.getChild(1).getText().equals("=")) { // IDENT '=' expr
				expr = newTexts.get(ctx.expr(0)) + "istore_" + symbolTable.getVarId(ctx.IDENT().getText()) + " \n";// assign
			} else { // binary operation
				expr = handleBinExpr(ctx, expr);// 저장
			}
		} else if (ctx.getChildCount() == 4) {// IDENT '(' args ')' | IDENT '[' expr ']'
			if (ctx.args() != null) { // function calls
				expr = handleFunCall(ctx, expr);// function call수행
			} else { // expr
				// Arrays: TODO
				expr += "aload_" + symbolTable.getVarId(ctx.IDENT().getText()) + "\n";
				expr += newTexts.get(ctx.expr(0));
				expr += "iaload\n";
			}
		} else {
			// INTARRAY
			// IDENT '[' expr ']' '=' expr
			expr += "aload_" + symbolTable.getVarId(ctx.IDENT().getText()) + "\n";
			expr += newTexts.get(ctx.expr(0));
			expr += newTexts.get(ctx.expr(1));
			expr += "iastore\n";

		}
		newTexts.put(ctx, expr);// 얻어온 값 저장
	}

	private String handleUnaryExpr(MiniJavaParser.ExprContext ctx, String expr) {// unaryOp handle하는 함수
		// '-' expr | '+' expr | '--' expr | '++' expr | '!' expr
		switch (ctx.getChild(0).getText()) {// 앞의 부호에 따라
		case "-":// -면 부호 반전
			expr += "ineg \n";// 수행 문장 저장
			break;
		case "--":// --면 하나 감소
			expr += "ldc 1" + "\n" + "isub" + "\n";// 1 ldc하고 sub
			if (ctx.expr(0).IDENT() != null) {// ident가 있으면
				expr += "istore_" + symbolTable.getVarId(ctx.expr(0).IDENT().getText()) + " \n";// assign
			}
			break;
		case "++":// ++면 하나 증가
			expr += "ldc 1" + "\n" + "iadd" + "\n";// 1 ldc하고 add
			if (ctx.expr(0).IDENT() != null) {// ident가 있으면
				expr += "istore_" + symbolTable.getVarId(ctx.expr(0).IDENT().getText()) + " \n";// assign
			}
			break;
		case "!":// !면 true false반전
			String l1 = symbolTable.newLabel();
			String lend = symbolTable.newLabel();
			expr += "ifeq " + l1 + "\n" + "ldc 0\n" + "goto " + lend + "\n" + l1 + ": \n" + "ldc 1" + "\n" + lend
					+ ": \n";
			// expr이 0이면 -> 1로, 1이면 -> 0으로
			// stack top이 0이면 l1으로가서 ldc 1
			// 1이면 ldc0하고 lend로
			break;
		}
		return expr;// 저장값 반환
	}

	private String handleBinExpr(MiniJavaParser.ExprContext ctx, String expr) {// binary expr handle 함수
		String l2;
		String lend;
		expr += newTexts.get(ctx.expr(0));// expr0얻어옴
		expr += newTexts.get(ctx.expr(1));// epxr1얻어옴

		switch (ctx.getChild(1).getText()) {// 중간에 있는 text에 따라
		case "*":// *면
			expr += "imul \n";// 곱하기
			break;
		case "/":// 나누기면
			expr += "idiv \n";// 나누기
			break;
		case "%":// mod면
			expr += "irem \n";// 나머지 계산
			break;
		case "+": // expr(0) expr(1) iadd
			expr += "iadd \n";// add
			break;
		case "-":// 뺴기
			expr += "isub \n";// sub
			break;
		case "==":// 같은가?
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "ifeq " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ": \n"
					+ "ldc 1" + "\n" + lend + ": " + "\n";
			// 빼봤을 때, 0이면 l2로 가서 1로드, 아니면 0 로드한 후 lend로
			break;
		case "!=":// 같지 않은가?
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "ifne " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ": \n"
					+ "ldc 1" + "\n" + lend + ": " + "\n";
			// 빼봤을 때, 0이아니면 l2로 가서 1로드, 아니면 0 로드한 후 lend로
			break;
		case "<=":// 같거나 작은가?
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "ifle " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n"
					+ "ldc 1\n" + lend + ": " + "\n";
			// isub했을때 0보다 작거나 같으면 l2로 가서 1로드, 아니면 0로드한후 lend로
			// <(5) Fill here>
			break;
		case "<":// 작은가?
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "iflt " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n"
					+ "ldc 1\n" + lend + ": " + "\n";
			// isub했을때 0보다 작으면 l2로 가서 1로드, 아니면 0로드한후 lend로
			// <(6) Fill here>
			break;
		case ">=":
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "ifge " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n"
					+ "ldc 1\n" + lend + ": " + "\n";
			// isub했을때 0보다 크거나 같으면 l2로 가서 1로드, 아니면 0로드한후 lend로
			// <(7) Fill here>
			break;
		case ">":
			l2 = symbolTable.newLabel();
			lend = symbolTable.newLabel();
			expr += "isub " + "\n" + "ifgt " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n"
					+ "ldc 1\n" + lend + ": " + "\n";
			// isub했을때 0보다 크면 l2로 가서 1로드, 아니면 0로드한후 lend로
			// <(8) Fill here>
			break;
		case "and":
			lend = symbolTable.newLabel();
			expr += "ifne " + lend + "\n" + "pop" + "\n" + "ldc 0" + "\n" + lend + ": " + "\n";
			// 만약 0이면(비교로 인해 0없어짐)
			// 하나 pop하고 0넣기
			// 0이 아니면 1 -> lend로 가기, 나머지 하나에 따라 달라짐
			break;
		case "or":
			lend = symbolTable.newLabel();
			expr += "ifeq " + lend + "\n" + "pop" + "\n" + "ldc 1" + "\n" + lend + ": " + "\n";
			// 만약 1이면 하나 pop하고 ldc1한 후 lend
			// 만약 0이면 다음것 확인해봐야함 -> 다음 것이 결정
			break;
		// <(9) Fill here>

		}
		return expr;// return
	}

	private String handleFunCall(MiniJavaParser.ExprContext ctx, String expr) {// fun call handle함수
		String fname = getFunName(ctx);// fname get

		expr = newTexts.get(ctx.args()) + "invokestatic " + className + "/" + symbolTable.getFunSpecStr(fname) + "\n";// 아니면
																														// function호출

		return expr;// return
	}

	// args : expr (',' expr)* | ;
	@Override
	public void exitArgs(MiniJavaParser.ArgsContext ctx) {// args 나갈 때
		String argsStr = "";// 저장공간
		for (int i = 0; i < ctx.expr().size(); i++) {// expr사이즈만큼 반복
			argsStr += newTexts.get(ctx.expr(i));// 얻어와서 저장
		}
		newTexts.put(ctx, argsStr);// str저장
	}

}
