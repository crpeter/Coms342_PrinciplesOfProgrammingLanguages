// Generated from typelang/parser/TypeLang.g by ANTLR 4.5
package typelang.parser; import static typelang.AST.*; import typelang.*; import typelang.Type.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Define=15, Let=16, Letrec=17, 
		Lambda=18, If=19, Car=20, Cdr=21, Cons=22, List=23, Null=24, Less=25, 
		Equal=26, Greater=27, TrueLiteral=28, FalseLiteral=29, Ref=30, Deref=31, 
		Assign=32, Free=33, Fork=34, Lock=35, UnLock=36, Process=37, Send=38, 
		Stop=39, Self=40, Dot=41, Number=42, Identifier=43, Letter=44, LetterOrDigit=45, 
		StrLiteral=46, AT=47, ELLIPSIS=48, WS=49, Comment=50, Line_Comment=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "Define", "Let", "Letrec", 
		"Lambda", "If", "Car", "Cdr", "Cons", "List", "Null", "Less", "Equal", 
		"Greater", "TrueLiteral", "FalseLiteral", "Ref", "Deref", "Assign", "Free", 
		"Fork", "Lock", "UnLock", "Process", "Send", "Stop", "Self", "Dot", "Number", 
		"Identifier", "Letter", "LetterOrDigit", "DIGIT", "ESCQUOTE", "StrLiteral", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'('", "'+'", "')'", "'*'", "'/'", "':'", "'bool'", "'unit'", 
		"'num'", "','", "'Ref'", "'Str'", "'->'", "'define'", "'let'", "'letrec'", 
		"'lambda'", "'if'", "'car'", "'cdr'", "'cons'", "'list'", "'null?'", "'<'", 
		"'='", "'>'", "'#t'", "'#f'", "'ref'", "'deref'", "'set!'", "'free'", 
		"'fork'", "'lock'", "'unlock'", "'process'", "'send'", "'stop'", "'self'", 
		"'.'", null, null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Define", "Let", "Letrec", "Lambda", "If", "Car", "Cdr", 
		"Cons", "List", "Null", "Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", 
		"Ref", "Deref", "Assign", "Free", "Fork", "Lock", "UnLock", "Process", 
		"Send", "Stop", "Self", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public TypeLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeLang.g"; }

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
		case 43:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 44:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\6+\u0116\n+\r+\16+\u0117\3,\3,\7,\u011c"+
		"\n,\f,\16,\u011f\13,\3-\3-\3-\3-\3-\3-\5-\u0127\n-\3.\3.\3.\3.\3.\3.\5"+
		".\u012f\n.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u0139\n\61\f\61\16"+
		"\61\u013c\13\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\6\64\u0147"+
		"\n\64\r\64\16\64\u0148\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0151\n\65\f"+
		"\65\16\65\u0154\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66"+
		"\u015f\n\66\f\66\16\66\u0162\13\66\3\66\3\66\4\u013a\u0152\2\67\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\60c\61e\62g\63i\64k\65\3\2\t\6\2"+
		"&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2"+
		"&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u016d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13u\3"+
		"\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23\u0080\3\2\2\2\25\u0085\3"+
		"\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008f\3\2\2\2\35\u0093\3\2"+
		"\2\2\37\u0096\3\2\2\2!\u009d\3\2\2\2#\u00a1\3\2\2\2%\u00a8\3\2\2\2\'\u00af"+
		"\3\2\2\2)\u00b2\3\2\2\2+\u00b6\3\2\2\2-\u00ba\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0"+
		"\3\2\2\2;\u00d3\3\2\2\2=\u00d6\3\2\2\2?\u00da\3\2\2\2A\u00e0\3\2\2\2C"+
		"\u00e5\3\2\2\2E\u00ea\3\2\2\2G\u00ef\3\2\2\2I\u00f4\3\2\2\2K\u00fb\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0108\3\2\2\2Q\u010d\3\2\2\2S\u0112\3\2\2\2U\u0115"+
		"\3\2\2\2W\u0119\3\2\2\2Y\u0126\3\2\2\2[\u012e\3\2\2\2]\u0130\3\2\2\2_"+
		"\u0132\3\2\2\2a\u0135\3\2\2\2c\u013f\3\2\2\2e\u0141\3\2\2\2g\u0146\3\2"+
		"\2\2i\u014c\3\2\2\2k\u015a\3\2\2\2mn\7/\2\2n\4\3\2\2\2op\7*\2\2p\6\3\2"+
		"\2\2qr\7-\2\2r\b\3\2\2\2st\7+\2\2t\n\3\2\2\2uv\7,\2\2v\f\3\2\2\2wx\7\61"+
		"\2\2x\16\3\2\2\2yz\7<\2\2z\20\3\2\2\2{|\7d\2\2|}\7q\2\2}~\7q\2\2~\177"+
		"\7n\2\2\177\22\3\2\2\2\u0080\u0081\7w\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7v\2\2\u0084\24\3\2\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7w\2\2\u0087\u0088\7o\2\2\u0088\26\3\2\2\2\u0089\u008a\7.\2\2\u008a\30"+
		"\3\2\2\2\u008b\u008c\7T\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0090\7U\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7@\2\2\u0095\36\3\2\2\2\u0096"+
		"\u0097\7f\2\2\u0097\u0098\7g\2\2\u0098\u0099\7h\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u009c\7g\2\2\u009c \3\2\2\2\u009d\u009e\7n\2"+
		"\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7"+
		"n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7e\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"\u00ae\7c\2\2\u00ae&\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"(\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"*\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		",\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7u\2\2\u00be.\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7A\2\2"+
		"\u00c9\62\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7?\2"+
		"\2\u00cd\66\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7%\2"+
		"\2\u00d1\u00d2\7v\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7"+
		"h\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9>\3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7h\2\2\u00df@\3\2\2\2\u00e0\u00e1"+
		"\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7#\2\2\u00e4"+
		"B\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7m\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7m\2\2\u00f3H\3\2\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7q\2\2"+
		"\u00f8\u00f9\7e\2\2\u00f9\u00fa\7m\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7r\2"+
		"\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7u\2\2\u0101\u0102\7u\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107"+
		"N\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7r\2\2\u010cP\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0111\7h\2\2\u0111R\3\2\2\2\u0112\u0113\7\60\2\2\u0113"+
		"T\3\2\2\2\u0114\u0116\5]/\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118V\3\2\2\2\u0119\u011d\5Y-\2\u011a"+
		"\u011c\5[.\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011eX\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0127"+
		"\t\2\2\2\u0121\u0122\n\3\2\2\u0122\u0127\6-\2\2\u0123\u0124\t\4\2\2\u0124"+
		"\u0125\t\5\2\2\u0125\u0127\6-\3\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2"+
		"\2\2\u0126\u0123\3\2\2\2\u0127Z\3\2\2\2\u0128\u012f\t\6\2\2\u0129\u012a"+
		"\n\3\2\2\u012a\u012f\6.\4\2\u012b\u012c\t\4\2\2\u012c\u012d\t\5\2\2\u012d"+
		"\u012f\6.\5\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012f\\\3\2\2\2\u0130\u0131\4\62;\2\u0131^\3\2\2\2\u0132\u0133\7"+
		"^\2\2\u0133\u0134\7$\2\2\u0134`\3\2\2\2\u0135\u013a\7$\2\2\u0136\u0139"+
		"\5_\60\2\u0137\u0139\n\7\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013eb\3\2\2\2\u013f\u0140"+
		"\7B\2\2\u0140d\3\2\2\2\u0141\u0142\7\60\2\2\u0142\u0143\7\60\2\2\u0143"+
		"\u0144\7\60\2\2\u0144f\3\2\2\2\u0145\u0147\t\b\2\2\u0146\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\b\64\2\2\u014bh\3\2\2\2\u014c\u014d\7\61\2\2\u014d"+
		"\u014e\7,\2\2\u014e\u0152\3\2\2\2\u014f\u0151\13\2\2\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7,\2\2\u0156\u0157\7\61"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\65\2\2\u0159j\3\2\2\2\u015a\u015b"+
		"\7\61\2\2\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2\2\u015d\u015f\n\7\2\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b\66\2\2"+
		"\u0164l\3\2\2\2\f\2\u0117\u011d\u0126\u012e\u0138\u013a\u0148\u0152\u0160"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}