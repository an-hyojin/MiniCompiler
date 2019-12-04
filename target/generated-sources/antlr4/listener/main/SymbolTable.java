package listener.main;

import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;

import generated.MiniJavaParser;
import generated.MiniJavaParser.Fun_declContext;
import generated.MiniJavaParser.Local_declContext;
import generated.MiniJavaParser.Var_declContext;
import static listener.main.BytecodeGenListenerHelper.*;

public class SymbolTable {
	enum Type {
		INT, INTARRAY, VOID, ERROR
	}

	static public class VarInfo {
		Type type;
		int id;
		int initVal;

		public VarInfo(Type type, int id, int initVal) {
			this.type = type;
			this.id = id;
			this.initVal = initVal;
		}

		public VarInfo(Type type, int id) {
			this.type = type;
			this.id = id;
			this.initVal = 0;
		}
	}

	static public class FInfo {
		public String sigStr;
	}

	private Map<String, VarInfo> _lsymtable = new HashMap<>(); // local v.
	private Map<String, VarInfo> _gsymtable = new HashMap<>(); // global v.
	private Map<String, FInfo> _fsymtable = new HashMap<>(); // function

	private int _globalVarID = 0;
	private int _localVarID = 0;
	private int _labelID = 0;
	private int _tempVarID = 0;

	SymbolTable() {
		initFunDecl();
		initFunTable();
	}

	void initFunDecl() { // at each func decl
		_lsymtable.clear();// lsymtable 비우기
		_localVarID = 0;
		_labelID = 0;
		_tempVarID = 32;
	}

	void putLocalVar(String varname, Type type) {// local var이므로
		this._lsymtable.put(varname, new VarInfo(type, _localVarID));// varname과 현재 varid를 lsymtable에 넣어줌
		this._localVarID++;// local var 증가
		// <Fill here>
	}

	void putGlobalVar(String varname, Type type) { // global var이므로
		this._gsymtable.put(varname, new VarInfo(type, _globalVarID));// varname과 현재 globalvarid를 gsymtable에 넣어줌
		this._globalVarID++;// global var증가
		// <Fill here>
	}

	void putLocalVarWithInitVal(String varname, Type type, int initVar) {// init val이 있을 때
		// <Fill here>
		this._lsymtable.put(varname, new VarInfo(type, _localVarID, initVar));// lsymtable에 varname과 id, initVar를 넣어줌
		this._localVarID++;// localvar증가
	}

	void putGlobalVarWithInitVal(String varname, Type type, int initVar) {// init val이 있을 때
		// <Fill here>
		this._gsymtable.put(varname, new VarInfo(type, _globalVarID, initVar));// gsymtable에 varname과 id, initVar를 넣어줌
		this._globalVarID++;// global var증가
	}

	void putParams(MiniJavaParser.ParamsContext params) {// param넣기
		for (int i = 0; i < params.param().size(); i++) {// param size만큼 반복
			// param : type_spec IDENT | type_spec IDENT '[' ']' ;
			if (params.param(i).getChildCount() == 2) {// param의 childCount가 2면 int일때
					this.putLocalVar(getParamName(params.param(i)), Type.INT);// local var넣기
				 
			} else {
					this.putLocalVar(getParamName(params.param(i)), Type.INTARRAY);// int array일때	
			}
			// <Fill here>
		}
	}

	private void initFunTable() {
		FInfo printlninfoInt = new FInfo();
		printlninfoInt.sigStr = "java/io/PrintStream/println(I)V";
		FInfo maininfo = new FInfo();
		maininfo.sigStr = "main([Ljava/lang/String;)V";
		_fsymtable.put("_print", printlninfoInt);
		_fsymtable.put("main", maininfo);
	}

	public String getFunSpecStr(String fname) {
		return _fsymtable.get(fname).sigStr;
	}

	public String getFunSpecStr(Fun_declContext ctx) {
		// <Fill here>
		// type_spec IDENT '(' params ')' compound_stmt ;
		return getFunSpecStr(getFunName(ctx));// ctx의 name으로부터 funSpecStr를 얻어옴
	}

	public String putFunSpecStr(Fun_declContext ctx) {// 호출할때
		String fname = getFunName(ctx);// fname얻기
		String argtype = "";// arg를 담을 공간
		String rtype = "";// return type을 담을 공간
		String res = "";// 결과를 담은 공간
		argtype += BytecodeGenListenerHelper.getParamTypesText(ctx.params());// param type을 얻어옴
		rtype += BytecodeGenListenerHelper.getTypeText(ctx.type_spec());// return type을 얻어옴
		// <Fill here>

		res = fname + "(" + argtype + ")" + rtype;// res 저장

		FInfo finfo = new FInfo();// 함수 info생성
		finfo.sigStr = res;// sigStr에 결과 저장
		_fsymtable.put(fname, finfo);// function symbolTable에 저장
		return res;// funspecStr return
	}

	Type getVarType(String name) {
		VarInfo lvar = (VarInfo) _lsymtable.get(name);
		if (lvar != null) {
			return lvar.type;
		}

		VarInfo gvar = (VarInfo) _gsymtable.get(name);
		if (gvar != null) {
			return gvar.type;
		}

		return Type.ERROR;
	}

	String newLabel() {
		return "label" + _labelID++;
	}

	String newTempVar() {
		String id = "";
		return id + _tempVarID--;
	}

	// global
	public String getVarId(Var_declContext ctx) {
		String sname = "";
		sname += getVarId(ctx.IDENT().getText());
		return sname;
	}

	// local
	public String getVarId(Local_declContext ctx) {
		String sname = "";
		sname += getVarId(ctx.IDENT().getText());
		return sname;
	}

	String getVarId(String name) {
		// <Fill here>
		if (_lsymtable.get(name) != null) {// name으로 부터 얻어온 id가 있으면
			return String.valueOf(_lsymtable.get(name).id);// 얻어와서 리턴
		} else {// gsymtable에 있음
			return String.valueOf(_gsymtable.get(name).id);// 얻어와서 리턴
		}
	}
}
