// Generated from MiniJava.g4 by ANTLR 4.7.2
 
package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, VOID=21, INT=22, STRING=23, PUBLICSTATIC=24, 
		WHILE=25, IF=26, ELSE=27, RETURN=28, OR=29, AND=30, LE=31, GE=32, EQ=33, 
		NE=34, SYSTEM=35, OUT=36, PRINT=37, DOT=38, CLASS=39, IDENT=40, LITERAL=41, 
		DecimalConstant=42, OctalConstant=43, HexadecimalConstant=44, WS=45;
	public static final int
		RULE_program = 0, RULE_classdef = 1, RULE_decl = 2, RULE_var_decl = 3, 
		RULE_type_spec = 4, RULE_fun_decl = 5, RULE_params = 6, RULE_param = 7, 
		RULE_stmt = 8, RULE_print_stmt = 9, RULE_expr_stmt = 10, RULE_while_stmt = 11, 
		RULE_compound_stmt = 12, RULE_local_decl = 13, RULE_if_stmt = 14, RULE_return_stmt = 15, 
		RULE_expr = 16, RULE_args = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdef", "decl", "var_decl", "type_spec", "fun_decl", "params", 
			"param", "stmt", "print_stmt", "expr_stmt", "while_stmt", "compound_stmt", 
			"local_decl", "if_stmt", "return_stmt", "expr", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'['", "']'", "'('", "')'", "','", 
			"');'", "'-'", "'+'", "'--'", "'++'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'!'", "'void'", "'int'", "'String'", "'public static'", "'while'", "'if'", 
			"'else'", "'return'", "'or'", "'and'", "'<='", "'>='", "'=='", "'!='", 
			"'System'", "'out'", "'println'", "'.'", "'public class'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VOID", "INT", 
			"STRING", "PUBLICSTATIC", "WHILE", "IF", "ELSE", "RETURN", "OR", "AND", 
			"LE", "GE", "EQ", "NE", "SYSTEM", "OUT", "PRINT", "DOT", "CLASS", "IDENT", 
			"LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			classdef();
			setState(37);
			match(T__0);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				decl();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << STRING) | (1L << PUBLICSTATIC))) != 0) );
			setState(43);
			match(T__1);
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

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassdef(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CLASS);
			setState(46);
			match(IDENT);
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				var_decl();
				}
				break;
			case PUBLICSTATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				fun_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniJavaParser.LITERAL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				type_spec();
				setState(53);
				match(IDENT);
				setState(54);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				type_spec();
				setState(57);
				match(IDENT);
				setState(58);
				match(T__3);
				setState(59);
				match(LITERAL);
				setState(60);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				type_spec();
				setState(63);
				match(IDENT);
				setState(64);
				match(T__4);
				setState(65);
				match(LITERAL);
				setState(66);
				match(T__5);
				setState(67);
				match(T__2);
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

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MiniJavaParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << STRING))) != 0)) ) {
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

	public static class Fun_declContext extends ParserRuleContext {
		public TerminalNode PUBLICSTATIC() { return getToken(MiniJavaParser.PUBLICSTATIC, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PUBLICSTATIC);
			setState(74);
			type_spec();
			setState(75);
			match(IDENT);
			setState(76);
			match(T__6);
			setState(77);
			params();
			setState(78);
			match(T__7);
			setState(79);
			compound_stmt();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode VOID() { return getToken(MiniJavaParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				param();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(82);
					match(T__8);
					setState(83);
					param();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				type_spec();
				setState(94);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				type_spec();
				setState(97);
				match(T__4);
				setState(98);
				match(T__5);
				setState(99);
				match(IDENT);
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

	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__19:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				expr_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				while_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				return_stmt();
				}
				break;
			case SYSTEM:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				print_stmt();
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(MiniJavaParser.SYSTEM, 0); }
		public List<TerminalNode> DOT() { return getTokens(MiniJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MiniJavaParser.DOT, i);
		}
		public TerminalNode OUT() { return getToken(MiniJavaParser.OUT, 0); }
		public TerminalNode PRINT() { return getToken(MiniJavaParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SYSTEM);
			setState(112);
			match(DOT);
			setState(113);
			match(OUT);
			setState(114);
			match(DOT);
			setState(115);
			match(PRINT);
			setState(116);
			match(T__6);
			setState(117);
			expr(0);
			setState(118);
			match(T__9);
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expr(0);
			setState(121);
			match(T__2);
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHILE);
			setState(124);
			match(T__6);
			setState(125);
			expr(0);
			setState(126);
			match(T__7);
			setState(127);
			stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(130);
				local_decl();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << SYSTEM) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(136);
				stmt();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__1);
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

	public static class Local_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniJavaParser.LITERAL, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_local_decl);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				type_spec();
				setState(145);
				match(IDENT);
				setState(146);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				type_spec();
				setState(149);
				match(IDENT);
				setState(150);
				match(T__3);
				setState(151);
				match(LITERAL);
				setState(152);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				type_spec();
				setState(155);
				match(T__4);
				setState(156);
				match(LITERAL);
				setState(157);
				match(T__5);
				setState(158);
				match(IDENT);
				setState(159);
				match(T__2);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stmt);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(IF);
				setState(164);
				match(T__6);
				setState(165);
				expr(0);
				setState(166);
				match(T__7);
				setState(167);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(IF);
				setState(170);
				match(T__6);
				setState(171);
				expr(0);
				setState(172);
				match(T__7);
				setState(173);
				stmt();
				setState(174);
				match(ELSE);
				setState(175);
				stmt();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_stmt);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(RETURN);
				setState(180);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(RETURN);
				setState(182);
				expr(0);
				setState(183);
				match(T__2);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MiniJavaParser.LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MiniJavaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniJavaParser.NE, 0); }
		public TerminalNode LE() { return getToken(MiniJavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniJavaParser.GE, 0); }
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniJavaParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(188);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(189);
				match(T__6);
				setState(190);
				expr(0);
				setState(191);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(193);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(194);
				match(IDENT);
				setState(195);
				match(T__4);
				setState(196);
				expr(0);
				setState(197);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(199);
				match(IDENT);
				setState(200);
				match(T__6);
				setState(201);
				args();
				setState(202);
				match(T__7);
				}
				break;
			case 6:
				{
				setState(204);
				match(T__10);
				setState(205);
				expr(20);
				}
				break;
			case 7:
				{
				setState(206);
				match(T__11);
				setState(207);
				expr(19);
				}
				break;
			case 8:
				{
				setState(208);
				match(T__12);
				setState(209);
				expr(18);
				}
				break;
			case 9:
				{
				setState(210);
				match(T__13);
				setState(211);
				expr(17);
				}
				break;
			case 10:
				{
				setState(212);
				match(T__19);
				setState(213);
				expr(5);
				}
				break;
			case 11:
				{
				setState(214);
				match(IDENT);
				setState(215);
				match(T__3);
				setState(216);
				expr(2);
				}
				break;
			case 12:
				{
				setState(217);
				match(IDENT);
				setState(218);
				match(T__4);
				setState(219);
				expr(0);
				setState(220);
				match(T__5);
				setState(221);
				match(T__3);
				setState(222);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(227);
						match(T__14);
						setState(228);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(230);
						match(T__15);
						setState(231);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(233);
						match(T__16);
						setState(234);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(236);
						match(T__11);
						setState(237);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(239);
						match(T__10);
						setState(240);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(242);
						match(EQ);
						setState(243);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(245);
						match(NE);
						setState(246);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(248);
						match(LE);
						setState(249);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(251);
						match(T__17);
						setState(252);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						match(GE);
						setState(255);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(257);
						match(T__18);
						setState(258);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(260);
						match(AND);
						setState(261);
						expr(5);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(263);
						match(OR);
						setState(264);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__19:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				expr(0);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(271);
					match(T__8);
					setState(272);
					expr(0);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\16\7\16\u008c\n\16\f\16\16\16"+
		"\u008f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bc\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u010c\n\22\f\22\16\22\u010f\13\22\3\23\3\23"+
		"\3\23\7\23\u0114\n\23\f\23\16\23\u0117\13\23\3\23\5\23\u011a\n\23\3\23"+
		"\2\3\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\27\31\2\u0136"+
		"\2&\3\2\2\2\4/\3\2\2\2\6\64\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16"+
		"]\3\2\2\2\20g\3\2\2\2\22o\3\2\2\2\24q\3\2\2\2\26z\3\2\2\2\30}\3\2\2\2"+
		"\32\u0083\3\2\2\2\34\u00a3\3\2\2\2\36\u00b3\3\2\2\2 \u00bb\3\2\2\2\"\u00e2"+
		"\3\2\2\2$\u0119\3\2\2\2&\'\5\4\3\2\')\7\3\2\2(*\5\6\4\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\4\2\2.\3\3\2\2\2/\60\7)\2\2\60"+
		"\61\7*\2\2\61\5\3\2\2\2\62\65\5\b\5\2\63\65\5\f\7\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7*\2\289\7\5\2\29H\3\2\2\2:;\5"+
		"\n\6\2;<\7*\2\2<=\7\6\2\2=>\7+\2\2>?\7\5\2\2?H\3\2\2\2@A\5\n\6\2AB\7*"+
		"\2\2BC\7\7\2\2CD\7+\2\2DE\7\b\2\2EF\7\5\2\2FH\3\2\2\2G\66\3\2\2\2G:\3"+
		"\2\2\2G@\3\2\2\2H\t\3\2\2\2IJ\t\2\2\2J\13\3\2\2\2KL\7\32\2\2LM\5\n\6\2"+
		"MN\7*\2\2NO\7\t\2\2OP\5\16\b\2PQ\7\n\2\2QR\5\32\16\2R\r\3\2\2\2SX\5\20"+
		"\t\2TU\7\13\2\2UW\5\20\t\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3"+
		"\2\2\2ZX\3\2\2\2[^\7\27\2\2\\^\3\2\2\2]S\3\2\2\2][\3\2\2\2]\\\3\2\2\2"+
		"^\17\3\2\2\2_`\5\n\6\2`a\7*\2\2ah\3\2\2\2bc\5\n\6\2cd\7\7\2\2de\7\b\2"+
		"\2ef\7*\2\2fh\3\2\2\2g_\3\2\2\2gb\3\2\2\2h\21\3\2\2\2ip\5\26\f\2jp\5\32"+
		"\16\2kp\5\36\20\2lp\5\30\r\2mp\5 \21\2np\5\24\13\2oi\3\2\2\2oj\3\2\2\2"+
		"ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\23\3\2\2\2qr\7%\2\2rs\7(\2\2"+
		"st\7&\2\2tu\7(\2\2uv\7\'\2\2vw\7\t\2\2wx\5\"\22\2xy\7\f\2\2y\25\3\2\2"+
		"\2z{\5\"\22\2{|\7\5\2\2|\27\3\2\2\2}~\7\33\2\2~\177\7\t\2\2\177\u0080"+
		"\5\"\22\2\u0080\u0081\7\n\2\2\u0081\u0082\5\22\n\2\u0082\31\3\2\2\2\u0083"+
		"\u0087\7\3\2\2\u0084\u0086\5\34\17\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\5\22\n\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7\4\2\2\u0091\33\3\2\2\2\u0092\u0093\5\n\6"+
		"\2\u0093\u0094\7*\2\2\u0094\u0095\7\5\2\2\u0095\u00a4\3\2\2\2\u0096\u0097"+
		"\5\n\6\2\u0097\u0098\7*\2\2\u0098\u0099\7\6\2\2\u0099\u009a\7+\2\2\u009a"+
		"\u009b\7\5\2\2\u009b\u00a4\3\2\2\2\u009c\u009d\5\n\6\2\u009d\u009e\7\7"+
		"\2\2\u009e\u009f\7+\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a2"+
		"\7\5\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\7\t\2"+
		"\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5\22\n\2\u00aa"+
		"\u00b4\3\2\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5"+
		"\"\22\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\7\35\2\2"+
		"\u00b1\u00b2\5\22\n\2\u00b2\u00b4\3\2\2\2\u00b3\u00a5\3\2\2\2\u00b3\u00ab"+
		"\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7\36\2\2\u00b6\u00bc\7\5\2\2\u00b7"+
		"\u00b8\7\36\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7\5\2\2\u00ba\u00bc\3"+
		"\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc!\3\2\2\2\u00bd\u00be"+
		"\b\22\1\2\u00be\u00e3\7+\2\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\5\"\22\2"+
		"\u00c1\u00c2\7\n\2\2\u00c2\u00e3\3\2\2\2\u00c3\u00e3\7*\2\2\u00c4\u00c5"+
		"\7*\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7\b\2\2\u00c8"+
		"\u00e3\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\5$\23"+
		"\2\u00cc\u00cd\7\n\2\2\u00cd\u00e3\3\2\2\2\u00ce\u00cf\7\r\2\2\u00cf\u00e3"+
		"\5\"\22\26\u00d0\u00d1\7\16\2\2\u00d1\u00e3\5\"\22\25\u00d2\u00d3\7\17"+
		"\2\2\u00d3\u00e3\5\"\22\24\u00d4\u00d5\7\20\2\2\u00d5\u00e3\5\"\22\23"+
		"\u00d6\u00d7\7\26\2\2\u00d7\u00e3\5\"\22\7\u00d8\u00d9\7*\2\2\u00d9\u00da"+
		"\7\6\2\2\u00da\u00e3\5\"\22\4\u00db\u00dc\7*\2\2\u00dc\u00dd\7\7\2\2\u00dd"+
		"\u00de\5\"\22\2\u00de\u00df\7\b\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5"+
		"\"\22\3\u00e1\u00e3\3\2\2\2\u00e2\u00bd\3\2\2\2\u00e2\u00bf\3\2\2\2\u00e2"+
		"\u00c3\3\2\2\2\u00e2\u00c4\3\2\2\2\u00e2\u00c9\3\2\2\2\u00e2\u00ce\3\2"+
		"\2\2\u00e2\u00d0\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2"+
		"\u00d6\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00db\3\2\2\2\u00e3\u010d\3\2"+
		"\2\2\u00e4\u00e5\f\22\2\2\u00e5\u00e6\7\21\2\2\u00e6\u010c\5\"\22\23\u00e7"+
		"\u00e8\f\21\2\2\u00e8\u00e9\7\22\2\2\u00e9\u010c\5\"\22\22\u00ea\u00eb"+
		"\f\20\2\2\u00eb\u00ec\7\23\2\2\u00ec\u010c\5\"\22\21\u00ed\u00ee\f\17"+
		"\2\2\u00ee\u00ef\7\16\2\2\u00ef\u010c\5\"\22\20\u00f0\u00f1\f\16\2\2\u00f1"+
		"\u00f2\7\r\2\2\u00f2\u010c\5\"\22\17\u00f3\u00f4\f\r\2\2\u00f4\u00f5\7"+
		"#\2\2\u00f5\u010c\5\"\22\16\u00f6\u00f7\f\f\2\2\u00f7\u00f8\7$\2\2\u00f8"+
		"\u010c\5\"\22\r\u00f9\u00fa\f\13\2\2\u00fa\u00fb\7!\2\2\u00fb\u010c\5"+
		"\"\22\f\u00fc\u00fd\f\n\2\2\u00fd\u00fe\7\24\2\2\u00fe\u010c\5\"\22\13"+
		"\u00ff\u0100\f\t\2\2\u0100\u0101\7\"\2\2\u0101\u010c\5\"\22\n\u0102\u0103"+
		"\f\b\2\2\u0103\u0104\7\25\2\2\u0104\u010c\5\"\22\t\u0105\u0106\f\6\2\2"+
		"\u0106\u0107\7 \2\2\u0107\u010c\5\"\22\7\u0108\u0109\f\5\2\2\u0109\u010a"+
		"\7\37\2\2\u010a\u010c\5\"\22\6\u010b\u00e4\3\2\2\2\u010b\u00e7\3\2\2\2"+
		"\u010b\u00ea\3\2\2\2\u010b\u00ed\3\2\2\2\u010b\u00f0\3\2\2\2\u010b\u00f3"+
		"\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00f9\3\2\2\2\u010b\u00fc\3\2\2\2\u010b"+
		"\u00ff\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3\2"+
		"\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"#\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5\"\22\2\u0111\u0112\7\13\2"+
		"\2\u0112\u0114\5\"\22\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"%\3\2\2\2\23+\64GX]go\u0087\u008d\u00a3\u00b3\u00bb\u00e2\u010b\u010d"+
		"\u0115\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}