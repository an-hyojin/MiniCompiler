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
		T__17=18, T__18=19, T__19=20, VOID=21, STATIC=22, INT=23, STRING=24, PUBLIC=25, 
		WHILE=26, IF=27, ELSE=28, NEW=29, RETURN=30, OR=31, AND=32, LE=33, GE=34, 
		EQ=35, NE=36, SYSTEM=37, OUT=38, PRINT=39, DOT=40, CLASS=41, IDENT=42, 
		LITERAL=43, DecimalConstant=44, OctalConstant=45, HexadecimalConstant=46, 
		WS=47;
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
			"'!'", "'void'", "'static'", "'int'", "'String'", "'public'", "'while'", 
			"'if'", "'else'", "'new'", "'return'", "'or'", "'and'", "'<='", "'>='", 
			"'=='", "'!='", "'System'", "'out'", "'println'", "'.'", "'public class'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VOID", "STATIC", 
			"INT", "STRING", "PUBLIC", "WHILE", "IF", "ELSE", "NEW", "RETURN", "OR", 
			"AND", "LE", "GE", "EQ", "NE", "SYSTEM", "OUT", "PRINT", "DOT", "CLASS", 
			"IDENT", "LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
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
			} while ( _la==STATIC || _la==PUBLIC );
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
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				var_decl();
				}
				break;
			case PUBLIC:
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
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniJavaParser.LITERAL, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(STATIC);
				setState(53);
				type_spec();
				setState(54);
				match(IDENT);
				setState(55);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(STATIC);
				setState(58);
				type_spec();
				setState(59);
				match(IDENT);
				setState(60);
				match(T__3);
				setState(61);
				match(LITERAL);
				setState(62);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(STATIC);
				setState(65);
				type_spec();
				setState(66);
				match(T__4);
				setState(67);
				match(T__5);
				setState(68);
				match(IDENT);
				setState(69);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(STATIC);
				setState(72);
				type_spec();
				setState(73);
				match(T__4);
				setState(74);
				match(T__5);
				setState(75);
				match(IDENT);
				setState(76);
				match(T__3);
				setState(77);
				match(NEW);
				setState(78);
				type_spec();
				setState(79);
				match(T__4);
				setState(80);
				match(LITERAL);
				setState(81);
				match(T__5);
				setState(82);
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
			setState(86);
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
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
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
			setState(88);
			match(PUBLIC);
			setState(89);
			match(STATIC);
			setState(90);
			type_spec();
			setState(91);
			match(IDENT);
			setState(92);
			match(T__6);
			setState(93);
			params();
			setState(94);
			match(T__7);
			setState(95);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				param();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(98);
					match(T__8);
					setState(99);
					param();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				type_spec();
				setState(110);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				type_spec();
				setState(113);
				match(T__4);
				setState(114);
				match(T__5);
				setState(115);
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
			setState(125);
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
				setState(119);
				expr_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				while_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				return_stmt();
				}
				break;
			case SYSTEM:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
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
			setState(127);
			match(SYSTEM);
			setState(128);
			match(DOT);
			setState(129);
			match(OUT);
			setState(130);
			match(DOT);
			setState(131);
			match(PRINT);
			setState(132);
			match(T__6);
			setState(133);
			expr(0);
			setState(134);
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
			setState(136);
			expr(0);
			setState(137);
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
			setState(139);
			match(WHILE);
			setState(140);
			match(T__6);
			setState(141);
			expr(0);
			setState(142);
			match(T__7);
			setState(143);
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
			setState(145);
			match(T__0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(146);
				local_decl();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << SYSTEM) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(152);
				stmt();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniJavaParser.LITERAL, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				type_spec();
				setState(161);
				match(IDENT);
				setState(162);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				type_spec();
				setState(165);
				match(IDENT);
				setState(166);
				match(T__3);
				setState(167);
				match(LITERAL);
				setState(168);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				type_spec();
				setState(171);
				match(T__4);
				setState(172);
				match(T__5);
				setState(173);
				match(IDENT);
				setState(174);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				type_spec();
				setState(177);
				match(T__4);
				setState(178);
				match(T__5);
				setState(179);
				match(IDENT);
				setState(180);
				match(T__3);
				setState(181);
				match(NEW);
				setState(182);
				type_spec();
				setState(183);
				match(T__4);
				setState(184);
				match(LITERAL);
				setState(185);
				match(T__5);
				setState(186);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(IF);
				setState(191);
				match(T__6);
				setState(192);
				expr(0);
				setState(193);
				match(T__7);
				setState(194);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(IF);
				setState(197);
				match(T__6);
				setState(198);
				expr(0);
				setState(199);
				match(T__7);
				setState(200);
				stmt();
				setState(201);
				match(ELSE);
				setState(202);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(RETURN);
				setState(207);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(RETURN);
				setState(209);
				expr(0);
				setState(210);
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
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(216);
				match(T__6);
				setState(217);
				expr(0);
				setState(218);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(220);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(221);
				match(IDENT);
				setState(222);
				match(T__4);
				setState(223);
				expr(0);
				setState(224);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(226);
				match(IDENT);
				setState(227);
				match(T__6);
				setState(228);
				args();
				setState(229);
				match(T__7);
				}
				break;
			case 6:
				{
				setState(231);
				match(T__10);
				setState(232);
				expr(21);
				}
				break;
			case 7:
				{
				setState(233);
				match(T__11);
				setState(234);
				expr(20);
				}
				break;
			case 8:
				{
				setState(235);
				match(T__12);
				setState(236);
				expr(19);
				}
				break;
			case 9:
				{
				setState(237);
				match(T__13);
				setState(238);
				expr(18);
				}
				break;
			case 10:
				{
				setState(239);
				match(T__19);
				setState(240);
				expr(6);
				}
				break;
			case 11:
				{
				setState(241);
				match(IDENT);
				setState(242);
				match(T__3);
				setState(243);
				expr(3);
				}
				break;
			case 12:
				{
				setState(244);
				match(IDENT);
				setState(245);
				match(T__4);
				setState(246);
				expr(0);
				setState(247);
				match(T__5);
				setState(248);
				match(T__3);
				setState(249);
				expr(2);
				}
				break;
			case 13:
				{
				setState(251);
				match(IDENT);
				setState(252);
				match(T__3);
				setState(253);
				match(NEW);
				setState(254);
				type_spec();
				setState(255);
				match(T__4);
				setState(256);
				match(LITERAL);
				setState(257);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(262);
						match(T__14);
						setState(263);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(265);
						match(T__15);
						setState(266);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(268);
						match(T__16);
						setState(269);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(271);
						match(T__11);
						setState(272);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(274);
						match(T__10);
						setState(275);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(277);
						match(EQ);
						setState(278);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(280);
						match(NE);
						setState(281);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(283);
						match(LE);
						setState(284);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(286);
						match(T__17);
						setState(287);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(289);
						match(GE);
						setState(290);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(292);
						match(T__18);
						setState(293);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(295);
						match(AND);
						setState(296);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(298);
						match(OR);
						setState(299);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(304);
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
			setState(314);
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
				setState(305);
				expr(0);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(306);
					match(T__8);
					setState(307);
					expr(0);
					}
					}
					setState(312);
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
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u013f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5W\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b"+
		"g\n\b\f\b\16\bj\13\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tx\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\7\16\u0096\n\16\f\16\16\16\u0099\13\16\3\16\7\16\u009c\n\16\f\16\16\16"+
		"\u009f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0106\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u012f\n\22\f\22\16"+
		"\22\u0132\13\22\3\23\3\23\3\23\7\23\u0137\n\23\f\23\16\23\u013a\13\23"+
		"\3\23\5\23\u013d\n\23\3\23\2\3\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\3\4\2\27\27\31\32\2\u015c\2&\3\2\2\2\4/\3\2\2\2\6\64\3\2\2\2"+
		"\bV\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16m\3\2\2\2\20w\3\2\2\2\22\177\3\2\2"+
		"\2\24\u0081\3\2\2\2\26\u008a\3\2\2\2\30\u008d\3\2\2\2\32\u0093\3\2\2\2"+
		"\34\u00be\3\2\2\2\36\u00ce\3\2\2\2 \u00d6\3\2\2\2\"\u0105\3\2\2\2$\u013c"+
		"\3\2\2\2&\'\5\4\3\2\')\7\3\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,-\3\2\2\2-.\7\4\2\2.\3\3\2\2\2/\60\7+\2\2\60\61\7,\2\2\61\5"+
		"\3\2\2\2\62\65\5\b\5\2\63\65\5\f\7\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7"+
		"\3\2\2\2\66\67\7\30\2\2\678\5\n\6\289\7,\2\29:\7\5\2\2:W\3\2\2\2;<\7\30"+
		"\2\2<=\5\n\6\2=>\7,\2\2>?\7\6\2\2?@\7-\2\2@A\7\5\2\2AW\3\2\2\2BC\7\30"+
		"\2\2CD\5\n\6\2DE\7\7\2\2EF\7\b\2\2FG\7,\2\2GH\7\5\2\2HW\3\2\2\2IJ\7\30"+
		"\2\2JK\5\n\6\2KL\7\7\2\2LM\7\b\2\2MN\7,\2\2NO\7\6\2\2OP\7\37\2\2PQ\5\n"+
		"\6\2QR\7\7\2\2RS\7-\2\2ST\7\b\2\2TU\7\5\2\2UW\3\2\2\2V\66\3\2\2\2V;\3"+
		"\2\2\2VB\3\2\2\2VI\3\2\2\2W\t\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Z[\7\33\2\2"+
		"[\\\7\30\2\2\\]\5\n\6\2]^\7,\2\2^_\7\t\2\2_`\5\16\b\2`a\7\n\2\2ab\5\32"+
		"\16\2b\r\3\2\2\2ch\5\20\t\2de\7\13\2\2eg\5\20\t\2fd\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2in\3\2\2\2jh\3\2\2\2kn\7\27\2\2ln\3\2\2\2mc\3\2\2"+
		"\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2op\5\n\6\2pq\7,\2\2qx\3\2\2\2rs\5\n"+
		"\6\2st\7\7\2\2tu\7\b\2\2uv\7,\2\2vx\3\2\2\2wo\3\2\2\2wr\3\2\2\2x\21\3"+
		"\2\2\2y\u0080\5\26\f\2z\u0080\5\32\16\2{\u0080\5\36\20\2|\u0080\5\30\r"+
		"\2}\u0080\5 \21\2~\u0080\5\24\13\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2"+
		"\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\23\3\2\2\2\u0081\u0082"+
		"\7\'\2\2\u0082\u0083\7*\2\2\u0083\u0084\7(\2\2\u0084\u0085\7*\2\2\u0085"+
		"\u0086\7)\2\2\u0086\u0087\7\t\2\2\u0087\u0088\5\"\22\2\u0088\u0089\7\f"+
		"\2\2\u0089\25\3\2\2\2\u008a\u008b\5\"\22\2\u008b\u008c\7\5\2\2\u008c\27"+
		"\3\2\2\2\u008d\u008e\7\34\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\"\22\2"+
		"\u0090\u0091\7\n\2\2\u0091\u0092\5\22\n\2\u0092\31\3\2\2\2\u0093\u0097"+
		"\7\3\2\2\u0094\u0096\5\34\17\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009c\5\22\n\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\5\n\6\2\u00a3"+
		"\u00a4\7,\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00bf\3\2\2\2\u00a6\u00a7\5\n"+
		"\6\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab"+
		"\7\5\2\2\u00ab\u00bf\3\2\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00af\7\b\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00bf\3\2"+
		"\2\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\7\b\2\2\u00b5"+
		"\u00b6\7,\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00b9\5\n"+
		"\6\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\7-\2\2\u00bb\u00bc\7\b\2\2\u00bc"+
		"\u00bd\7\5\2\2\u00bd\u00bf\3\2\2\2\u00be\u00a2\3\2\2\2\u00be\u00a6\3\2"+
		"\2\2\u00be\u00ac\3\2\2\2\u00be\u00b2\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1"+
		"\7\35\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\n\2\2"+
		"\u00c4\u00c5\5\22\n\2\u00c5\u00cf\3\2\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00c8"+
		"\7\t\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7\n\2\2\u00ca\u00cb\5\22\n\2"+
		"\u00cb\u00cc\7\36\2\2\u00cc\u00cd\5\22\n\2\u00cd\u00cf\3\2\2\2\u00ce\u00c0"+
		"\3\2\2\2\u00ce\u00c6\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\7 \2\2\u00d1"+
		"\u00d7\7\5\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\7\5"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7"+
		"!\3\2\2\2\u00d8\u00d9\b\22\1\2\u00d9\u0106\7-\2\2\u00da\u00db\7\t\2\2"+
		"\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\n\2\2\u00dd\u0106\3\2\2\2\u00de\u0106"+
		"\7,\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\5\"\22\2\u00e2"+
		"\u00e3\7\b\2\2\u00e3\u0106\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\7\t"+
		"\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7\n\2\2\u00e8\u0106\3\2\2\2\u00e9"+
		"\u00ea\7\r\2\2\u00ea\u0106\5\"\22\27\u00eb\u00ec\7\16\2\2\u00ec\u0106"+
		"\5\"\22\26\u00ed\u00ee\7\17\2\2\u00ee\u0106\5\"\22\25\u00ef\u00f0\7\20"+
		"\2\2\u00f0\u0106\5\"\22\24\u00f1\u00f2\7\26\2\2\u00f2\u0106\5\"\22\b\u00f3"+
		"\u00f4\7,\2\2\u00f4\u00f5\7\6\2\2\u00f5\u0106\5\"\22\5\u00f6\u00f7\7,"+
		"\2\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fa\7\b\2\2\u00fa"+
		"\u00fb\7\6\2\2\u00fb\u00fc\5\"\22\4\u00fc\u0106\3\2\2\2\u00fd\u00fe\7"+
		",\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\7\37\2\2\u0100\u0101\5\n\6\2\u0101"+
		"\u0102\7\7\2\2\u0102\u0103\7-\2\2\u0103\u0104\7\b\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u00d8\3\2\2\2\u0105\u00da\3\2\2\2\u0105\u00de\3\2\2\2\u0105"+
		"\u00df\3\2\2\2\u0105\u00e4\3\2\2\2\u0105\u00e9\3\2\2\2\u0105\u00eb\3\2"+
		"\2\2\u0105\u00ed\3\2\2\2\u0105\u00ef\3\2\2\2\u0105\u00f1\3\2\2\2\u0105"+
		"\u00f3\3\2\2\2\u0105\u00f6\3\2\2\2\u0105\u00fd\3\2\2\2\u0106\u0130\3\2"+
		"\2\2\u0107\u0108\f\23\2\2\u0108\u0109\7\21\2\2\u0109\u012f\5\"\22\24\u010a"+
		"\u010b\f\22\2\2\u010b\u010c\7\22\2\2\u010c\u012f\5\"\22\23\u010d\u010e"+
		"\f\21\2\2\u010e\u010f\7\23\2\2\u010f\u012f\5\"\22\22\u0110\u0111\f\20"+
		"\2\2\u0111\u0112\7\16\2\2\u0112\u012f\5\"\22\21\u0113\u0114\f\17\2\2\u0114"+
		"\u0115\7\r\2\2\u0115\u012f\5\"\22\20\u0116\u0117\f\16\2\2\u0117\u0118"+
		"\7%\2\2\u0118\u012f\5\"\22\17\u0119\u011a\f\r\2\2\u011a\u011b\7&\2\2\u011b"+
		"\u012f\5\"\22\16\u011c\u011d\f\f\2\2\u011d\u011e\7#\2\2\u011e\u012f\5"+
		"\"\22\r\u011f\u0120\f\13\2\2\u0120\u0121\7\24\2\2\u0121\u012f\5\"\22\f"+
		"\u0122\u0123\f\n\2\2\u0123\u0124\7$\2\2\u0124\u012f\5\"\22\13\u0125\u0126"+
		"\f\t\2\2\u0126\u0127\7\25\2\2\u0127\u012f\5\"\22\n\u0128\u0129\f\7\2\2"+
		"\u0129\u012a\7\"\2\2\u012a\u012f\5\"\22\b\u012b\u012c\f\6\2\2\u012c\u012d"+
		"\7!\2\2\u012d\u012f\5\"\22\7\u012e\u0107\3\2\2\2\u012e\u010a\3\2\2\2\u012e"+
		"\u010d\3\2\2\2\u012e\u0110\3\2\2\2\u012e\u0113\3\2\2\2\u012e\u0116\3\2"+
		"\2\2\u012e\u0119\3\2\2\2\u012e\u011c\3\2\2\2\u012e\u011f\3\2\2\2\u012e"+
		"\u0122\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"#\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0138\5\"\22\2\u0134\u0135\7\13\2"+
		"\2\u0135\u0137\5\"\22\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"%\3\2\2\2\23+\64Vhmw\177\u0097\u009d\u00be\u00ce\u00d6\u0105\u012e\u0130"+
		"\u0138\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}