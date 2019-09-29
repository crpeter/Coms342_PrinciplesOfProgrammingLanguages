// Generated from funclang/parser/FuncLang.g by ANTLR 4.5
package funclang.parser; import static funclang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuncLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Define=17, 
		Let=18, Letrec=19, Lambda=20, If=21, Car=22, Cdr=23, Cons=24, List=25, 
		Null=26, Less=27, Equal=28, Greater=29, TrueLiteral=30, FalseLiteral=31, 
		Ref=32, Deref=33, Assign=34, Free=35, Fork=36, Lock=37, UnLock=38, Process=39, 
		Send=40, Stop=41, Self=42, Dot=43, Number=44, Identifier=45, Letter=46, 
		LetterOrDigit=47, StrLiteral=48, AT=49, ELLIPSIS=50, WS=51, Comment=52, 
		Line_Comment=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "Define", 
		"Let", "Letrec", "Lambda", "If", "Car", "Cdr", "Cons", "List", "Null", 
		"Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", "Ref", "Deref", 
		"Assign", "Free", "Fork", "Lock", "UnLock", "Process", "Send", "Stop", 
		"Self", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", 
		"ESCQUOTE", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'switch'", "'case'", "'default'", "'number?'", "'boolean?'", 
		"'string?'", "'procedure?'", "'list?'", "'pair?'", "'unit?'", "'-'", "'+'", 
		"'*'", "'/'", "'define'", "'let'", "'letrec'", "'lambda'", "'if'", "'car'", 
		"'cdr'", "'cons'", "'list'", "'null?'", "'<'", "'='", "'>'", "'#t'", "'#f'", 
		"'ref'", "'deref'", "'set!'", "'free'", "'fork'", "'lock'", "'unlock'", 
		"'process'", "'send'", "'stop'", "'self'", "'.'", null, null, null, null, 
		null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Define", "Let", "Letrec", "Lambda", "If", 
		"Car", "Cdr", "Cons", "List", "Null", "Less", "Equal", "Greater", "TrueLiteral", 
		"FalseLiteral", "Ref", "Deref", "Assign", "Free", "Fork", "Lock", "UnLock", 
		"Process", "Send", "Stop", "Self", "Dot", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};
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


	public FuncLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FuncLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 46:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0196\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		",\3,\3-\6-\u0147\n-\r-\16-\u0148\3.\3.\7.\u014d\n.\f.\16.\u0150\13.\3"+
		"/\3/\3/\3/\3/\3/\5/\u0158\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0160"+
		"\n\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u016a\n\63\f\63\16"+
		"\63\u016d\13\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\6\66\u0178"+
		"\n\66\r\66\16\66\u0179\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0182\n\67\f"+
		"\67\16\67\u0185\13\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u0190\n"+
		"8\f8\168\u0193\138\38\38\4\u016b\u0183\29\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\2c\2e\62g\63i\64k\65m\66o\67\3\2\t\6\2&&C\\aac|\4\2"+
		"\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|"+
		"\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u019e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\t|\3"+
		"\2\2\2\13\u0081\3\2\2\2\r\u0089\3\2\2\2\17\u0091\3\2\2\2\21\u009a\3\2"+
		"\2\2\23\u00a2\3\2\2\2\25\u00ad\3\2\2\2\27\u00b3\3\2\2\2\31\u00b9\3\2\2"+
		"\2\33\u00bf\3\2\2\2\35\u00c1\3\2\2\2\37\u00c3\3\2\2\2!\u00c5\3\2\2\2#"+
		"\u00c7\3\2\2\2%\u00ce\3\2\2\2\'\u00d2\3\2\2\2)\u00d9\3\2\2\2+\u00e0\3"+
		"\2\2\2-\u00e3\3\2\2\2/\u00e7\3\2\2\2\61\u00eb\3\2\2\2\63\u00f0\3\2\2\2"+
		"\65\u00f5\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0101"+
		"\3\2\2\2?\u0104\3\2\2\2A\u0107\3\2\2\2C\u010b\3\2\2\2E\u0111\3\2\2\2G"+
		"\u0116\3\2\2\2I\u011b\3\2\2\2K\u0120\3\2\2\2M\u0125\3\2\2\2O\u012c\3\2"+
		"\2\2Q\u0134\3\2\2\2S\u0139\3\2\2\2U\u013e\3\2\2\2W\u0143\3\2\2\2Y\u0146"+
		"\3\2\2\2[\u014a\3\2\2\2]\u0157\3\2\2\2_\u015f\3\2\2\2a\u0161\3\2\2\2c"+
		"\u0163\3\2\2\2e\u0166\3\2\2\2g\u0170\3\2\2\2i\u0172\3\2\2\2k\u0177\3\2"+
		"\2\2m\u017d\3\2\2\2o\u018b\3\2\2\2qr\7*\2\2r\4\3\2\2\2st\7+\2\2t\6\3\2"+
		"\2\2uv\7u\2\2vw\7y\2\2wx\7k\2\2xy\7v\2\2yz\7e\2\2z{\7j\2\2{\b\3\2\2\2"+
		"|}\7e\2\2}~\7c\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\7f\2\2\u0082\u0083\7g\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2\2"+
		"\u0085\u0086\7w\2\2\u0086\u0087\7n\2\2\u0087\u0088\7v\2\2\u0088\f\3\2"+
		"\2\2\u0089\u008a\7p\2\2\u008a\u008b\7w\2\2\u008b\u008c\7o\2\2\u008c\u008d"+
		"\7d\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7A\2\2\u0090"+
		"\16\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7A\2\2\u0099\20\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7"+
		"v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7i\2\2\u00a0\u00a1\7A\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7A\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7"+
		"k\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7A\2\2\u00b2\26"+
		"\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7A\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7w\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7A\2\2"+
		"\u00be\32\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7-\2"+
		"\2\u00c2\36\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7\61"+
		"\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"$\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"&\3\2\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7e\2\2\u00d8(\3\2\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7d\2\2"+
		"\u00dd\u00de\7f\2\2\u00de\u00df\7c\2\2\u00df*\3\2\2\2\u00e0\u00e1\7k\2"+
		"\2\u00e1\u00e2\7h\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7"+
		"c\2\2\u00e5\u00e6\7t\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7f\2\2\u00e9\u00ea\7t\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed"+
		"\7q\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7u\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7n\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\64\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7A\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc"+
		"8\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe:\3\2\2\2\u00ff\u0100\7@\2\2\u0100<"+
		"\3\2\2\2\u0101\u0102\7%\2\2\u0102\u0103\7v\2\2\u0103>\3\2\2\2\u0104\u0105"+
		"\7%\2\2\u0105\u0106\7h\2\2\u0106@\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7h\2\2\u010aB\3\2\2\2\u010b\u010c\7f\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7h\2\2\u0110"+
		"D\3\2\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113\u0114\7v\2\2\u0114"+
		"\u0115\7#\2\2\u0115F\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7g\2\2\u011aH\3\2\2\2\u011b\u011c\7h\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e\u011f\7m\2\2\u011fJ\3\2\2\2\u0120"+
		"\u0121\7n\2\2\u0121\u0122\7q\2\2\u0122\u0123\7e\2\2\u0123\u0124\7m\2\2"+
		"\u0124L\3\2\2\2\u0125\u0126\7w\2\2\u0126\u0127\7p\2\2\u0127\u0128\7n\2"+
		"\2\u0128\u0129\7q\2\2\u0129\u012a\7e\2\2\u012a\u012b\7m\2\2\u012bN\3\2"+
		"\2\2\u012c\u012d\7r\2\2\u012d\u012e\7t\2\2\u012e\u012f\7q\2\2\u012f\u0130"+
		"\7e\2\2\u0130\u0131\7g\2\2\u0131\u0132\7u\2\2\u0132\u0133\7u\2\2\u0133"+
		"P\3\2\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7f\2\2\u0138R\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b"+
		"\u013c\7q\2\2\u013c\u013d\7r\2\2\u013dT\3\2\2\2\u013e\u013f\7u\2\2\u013f"+
		"\u0140\7g\2\2\u0140\u0141\7n\2\2\u0141\u0142\7h\2\2\u0142V\3\2\2\2\u0143"+
		"\u0144\7\60\2\2\u0144X\3\2\2\2\u0145\u0147\5a\61\2\u0146\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149Z\3"+
		"\2\2\2\u014a\u014e\5]/\2\u014b\u014d\5_\60\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\\\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0151\u0158\t\2\2\2\u0152\u0153\n\3\2\2\u0153\u0158"+
		"\6/\2\2\u0154\u0155\t\4\2\2\u0155\u0156\t\5\2\2\u0156\u0158\6/\3\2\u0157"+
		"\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0154\3\2\2\2\u0158^\3\2\2\2"+
		"\u0159\u0160\t\6\2\2\u015a\u015b\n\3\2\2\u015b\u0160\6\60\4\2\u015c\u015d"+
		"\t\4\2\2\u015d\u015e\t\5\2\2\u015e\u0160\6\60\5\2\u015f\u0159\3\2\2\2"+
		"\u015f\u015a\3\2\2\2\u015f\u015c\3\2\2\2\u0160`\3\2\2\2\u0161\u0162\4"+
		"\62;\2\u0162b\3\2\2\2\u0163\u0164\7^\2\2\u0164\u0165\7$\2\2\u0165d\3\2"+
		"\2\2\u0166\u016b\7$\2\2\u0167\u016a\5c\62\2\u0168\u016a\n\7\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\7$\2\2\u016ff\3\2\2\2\u0170\u0171\7B\2\2\u0171h\3\2\2\2\u0172\u0173"+
		"\7\60\2\2\u0173\u0174\7\60\2\2\u0174\u0175\7\60\2\2\u0175j\3\2\2\2\u0176"+
		"\u0178\t\b\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b\66\2\2\u017c"+
		"l\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f\7,\2\2\u017f\u0183\3\2\2\2"+
		"\u0180\u0182\13\2\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0187\7,\2\2\u0187\u0188\7\61\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\67"+
		"\2\2\u018an\3\2\2\2\u018b\u018c\7\61\2\2\u018c\u018d\7\61\2\2\u018d\u0191"+
		"\3\2\2\2\u018e\u0190\n\7\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0195\b8\2\2\u0195p\3\2\2\2\f\2\u0148\u014e\u0157\u015f\u0169"+
		"\u016b\u0179\u0183\u0191\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}