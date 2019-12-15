package listener.main;

//import java.util.Hashtable;

import generated.MiniJavaParser;
import generated.MiniJavaParser.ExprContext;
import generated.MiniJavaParser.Fun_declContext;
import generated.MiniJavaParser.If_stmtContext;
import generated.MiniJavaParser.Local_declContext;
import generated.MiniJavaParser.ParamContext;
import generated.MiniJavaParser.ParamsContext;
//import generated.MiniCParser.ProgramContext;
//import generated.MiniCParser.Return_stmtContext;
import generated.MiniJavaParser.Type_specContext;
import generated.MiniJavaParser.Var_declContext;
//import listener.main.SymbolTable;
//import listener.main.SymbolTable.VarInfo;

public class BytecodeGenListenerHelper {
	static String classDef ="";
	
	// <boolean functions>
	
	static boolean isFunDecl(MiniJavaParser.ProgramContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.Fun_declContext;
	}
	static boolean isVarDecl(MiniJavaParser.ProgramContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.Var_declContext;
	}
	// type_spec'[' ']' IDENT 
	static boolean isArrayParamDecl(ParamContext param) {
		return param.getChildCount() == 4;
	}
	
	// global vars
	static int initVal(Var_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	// var_decl	: type_spec IDENT '=' LITERAL ';
	static boolean isDeclWithInit(Var_declContext ctx) {
		return (ctx.getChildCount() == 6 &&ctx.LITERAL()!=null);
	}
	// var_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static boolean isArrayDecl(Var_declContext ctx) {
		return ctx.getChildCount() == 12;
	}

	// <local vars>
	// local_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static int initVal(Local_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	static boolean isArrayDecl(Local_declContext ctx) {
		return ctx.getChildCount() == 11;
	}
	
	static boolean isDeclWithInit(Local_declContext ctx) {
		return ctx.getChildCount() == 5 ;
	}
	
	static boolean isVoidF(Fun_declContext ctx) {
			// <Fill in>
		return ctx.type_spec().getText().equals("void");//void Function 인지 확인
	}
	
	static boolean isIntReturn(MiniJavaParser.Return_stmtContext ctx) {
		return ctx.getChildCount() ==3;
	}


	static boolean isVoidReturn(MiniJavaParser.Return_stmtContext ctx) {
		return ctx.getChildCount() == 2;
	}
	
	// <information extraction>
	static String getStackSize(Fun_declContext ctx) {
		return "32";
	}
	static String getLocalVarSize(Fun_declContext ctx) {
		return "32";
	}
	static String getTypeText(Type_specContext typespec) {
			// <Fill in>
		if(typespec.VOID()!=null) {//typespec에 void, int 밖에 없음 -> void 가 있으면
			return "V";//V return
		}else if(typespec.STRING()!=null) {
			return "S";
		}else {//int면
			return "I";//I return
		}
	}

	// params
	static String getParamName(ParamContext param) {
		// <Fill in>
		return param.IDENT().getText();//param의 IDENT리턴
	}
	
	static String getParamTypesText(ParamsContext params) {
		String typeText = "";
		
		for(int i = 0; i < params.param().size(); i++) {
			MiniJavaParser.Type_specContext typespec = (MiniJavaParser.Type_specContext)  params.param(i).getChild(0);
			typeText += getTypeText(typespec); // + ";";
		}
		return typeText;
	}
	
	static String getLocalVarName(Local_declContext local_decl) {
		// <Fill in>
		return local_decl.IDENT().getText();//local decl의 IDENT return
	}
	
	static String getFunName(Fun_declContext ctx) {
		// <Fill in>
		return ctx.IDENT().getText();//fun decl의 IDENT return
	}
	
	static String getFunName(ExprContext ctx) {
		// <Fill in>
		return ctx.IDENT().getText();//함수 호출시의 funName-> IDENT
	}
	
	static boolean noElse(If_stmtContext ctx) {
		return ctx.getChildCount() <= 5;
	}
	
	static String getFunPrologF(String className) {//첫번쨰로 부를 prolog
		// return ".class public Test .....
		// ...
		// invokenonvirtual java/lang/Object/<init>()
		// return
		// .end method"
		String s = ".class public "+className+"\n";
		s+=".super java/lang/Object\n";
		
		//fun prolog작성 하여 리턴
		return s;
	}
	static String getFunPrologS() {//F와 S사이에 field를 저장해야 하기때문에 분리했음
		String s="";
		s+="; standard initializer\n";
		s+=".method public <init>()V\n";
		s+="aload_0\n";
		s+="invokenonvirtual java/lang/Object/<init>()V\n";
		s+="return\n";
		s+=".end method\n";
		//나머지 prolog작성하여 리턴
		return s;
	}
	static String getCurrentClassName(MiniJavaParser.ProgramContext ctx) {//현재 클래스 name 얻어오기
		return ctx.classdef().IDENT().getText();//classDef얻어옴
	}
	
	
}
