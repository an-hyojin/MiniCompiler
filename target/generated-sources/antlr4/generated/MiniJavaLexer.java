// Generated from MiniJava.g4 by ANTLR 4.7.2
 
package generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "VOID", "STATIC", "INT", "STRING", "PUBLIC", 
			"WHILE", "IF", "ELSE", "NEW", "RETURN", "OR", "AND", "LE", "GE", "EQ", 
			"NE", "SYSTEM", "OUT", "PRINT", "DOT", "CLASS", "IDENT", "LITERAL", "DecimalConstant", 
			"OctalConstant", "HexadecimalConstant", "WS"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0123\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\7+\u00fb\n+\f+\16+\u00fe"+
		"\13+\3,\3,\3,\5,\u0103\n,\3-\3-\3-\7-\u0108\n-\f-\16-\u010b\13-\5-\u010d"+
		"\n-\3.\3.\7.\u0111\n.\f.\16.\u0114\13.\3/\3/\3/\6/\u0119\n/\r/\16/\u011a"+
		"\3\60\6\60\u011e\n\60\r\60\16\60\u011f\3\60\3\60\2\2\61\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\63"+
		";\3\2\62;\3\2\629\4\2ZZzz\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u012a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2"+
		"\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21"+
		"o\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2"+
		"\35}\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2"+
		"\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u0091\3\2\2\2/\u0098"+
		"\3\2\2\2\61\u009c\3\2\2\2\63\u00a3\3\2\2\2\65\u00aa\3\2\2\2\67\u00b0\3"+
		"\2\2\29\u00b3\3\2\2\2;\u00b8\3\2\2\2=\u00bc\3\2\2\2?\u00c3\3\2\2\2A\u00c6"+
		"\3\2\2\2C\u00ca\3\2\2\2E\u00cd\3\2\2\2G\u00d0\3\2\2\2I\u00d3\3\2\2\2K"+
		"\u00d6\3\2\2\2M\u00dd\3\2\2\2O\u00e1\3\2\2\2Q\u00e9\3\2\2\2S\u00eb\3\2"+
		"\2\2U\u00f8\3\2\2\2W\u0102\3\2\2\2Y\u010c\3\2\2\2[\u010e\3\2\2\2]\u0115"+
		"\3\2\2\2_\u011d\3\2\2\2ab\7}\2\2b\4\3\2\2\2cd\7\177\2\2d\6\3\2\2\2ef\7"+
		"=\2\2f\b\3\2\2\2gh\7?\2\2h\n\3\2\2\2ij\7]\2\2j\f\3\2\2\2kl\7_\2\2l\16"+
		"\3\2\2\2mn\7*\2\2n\20\3\2\2\2op\7+\2\2p\22\3\2\2\2qr\7.\2\2r\24\3\2\2"+
		"\2st\7+\2\2tu\7=\2\2u\26\3\2\2\2vw\7/\2\2w\30\3\2\2\2xy\7-\2\2y\32\3\2"+
		"\2\2z{\7/\2\2{|\7/\2\2|\34\3\2\2\2}~\7-\2\2~\177\7-\2\2\177\36\3\2\2\2"+
		"\u0080\u0081\7,\2\2\u0081 \3\2\2\2\u0082\u0083\7\61\2\2\u0083\"\3\2\2"+
		"\2\u0084\u0085\7\'\2\2\u0085$\3\2\2\2\u0086\u0087\7>\2\2\u0087&\3\2\2"+
		"\2\u0088\u0089\7@\2\2\u0089(\3\2\2\2\u008a\u008b\7#\2\2\u008b*\3\2\2\2"+
		"\u008c\u008d\7x\2\2\u008d\u008e\7q\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7f\2\2\u0090,\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0097\7e\2\2\u0097"+
		".\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\60\3\2\2\2\u009c\u009d\7U\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\62\3\2\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7k\2\2\u00a8\u00a9\7e\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7"+
		"y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b28"+
		"\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7y\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2>\3\2\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5@\3\2\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9B\3\2\2\2\u00ca"+
		"\u00cb\7>\2\2\u00cb\u00cc\7?\2\2\u00ccD\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce"+
		"\u00cf\7?\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\7?\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\7?\2\2\u00d5J\3\2\2\2\u00d6\u00d7"+
		"\7U\2\2\u00d7\u00d8\7{\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7o\2\2\u00dcL\3\2\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00df\7w\2\2\u00df\u00e0\7v\2\2\u00e0N\3\2\2\2\u00e1\u00e2\7r\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7n\2\2\u00e7\u00e8\7p\2\2\u00e8P\3\2\2\2\u00e9\u00ea\7\60"+
		"\2\2\u00eaR\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee"+
		"\7d\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7\"\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7c\2"+
		"\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7u\2\2\u00f7T\3\2\2\2\u00f8\u00fc\t"+
		"\2\2\2\u00f9\u00fb\t\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdV\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0103\5Y-\2\u0100\u0103\5[.\2\u0101\u0103\5]/\2\u0102\u00ff\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103X\3\2\2\2\u0104\u010d"+
		"\7\62\2\2\u0105\u0109\t\4\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010d"+
		"Z\3\2\2\2\u010e\u0112\7\62\2\2\u010f\u0111\t\6\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\\\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\62\2\2\u0116\u0118\t\7\2\2\u0117"+
		"\u0119\t\b\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b^\3\2\2\2\u011c\u011e\t\t\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\b\60\2\2\u0122`\3\2\2\2\13\2\u00fa\u00fc\u0102"+
		"\u0109\u010c\u0112\u011a\u011f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}