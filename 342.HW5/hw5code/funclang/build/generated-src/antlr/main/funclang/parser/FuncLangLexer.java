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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Define=7, Let=8, Letrec=9, 
		Lambda=10, If=11, Car=12, Cdr=13, Cons=14, List=15, Null=16, Number=17, 
		Boolean=18, String=19, Procedure=20, Pair=21, Less=22, Equal=23, Greater=24, 
		TrueLiteral=25, FalseLiteral=26, Ref=27, Deref=28, Assign=29, Free=30, 
		Fork=31, Lock=32, UnLock=33, Process=34, Send=35, Stop=36, Self=37, Dot=38, 
		Identifier=39, Letter=40, LetterOrDigit=41, StrLiteral=42, AT=43, ELLIPSIS=44, 
		WS=45, Comment=46, Line_Comment=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Define", "Let", "Letrec", 
		"Lambda", "If", "Car", "Cdr", "Cons", "List", "Null", "Number", "Boolean", 
		"String", "Procedure", "Pair", "Less", "Equal", "Greater", "TrueLiteral", 
		"FalseLiteral", "Ref", "Deref", "Assign", "Free", "Fork", "Lock", "UnLock", 
		"Process", "Send", "Stop", "Self", "Dot", "Identifier", "Letter", "LetterOrDigit", 
		"DIGIT", "ESCQUOTE", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'define'", "'let'", "'letrec'", 
		"'lambda'", "'if'", "'car'", "'cdr'", "'cons'", "'list'", "'null?'", "'number?'", 
		"'boolean?'", "'string?'", "'procedure?'", "'pair?'", "'<'", "'='", "'>'", 
		"'#t'", "'#f'", "'ref'", "'deref'", "'set!'", "'free'", "'fork'", "'lock'", 
		"'unlock'", "'process'", "'send'", "'stop'", "'self'", "'.'", null, null, 
		null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Define", "Let", "Letrec", "Lambda", 
		"If", "Car", "Cdr", "Cons", "List", "Null", "Number", "Boolean", "String", 
		"Procedure", "Pair", "Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", 
		"Ref", "Deref", "Assign", "Free", "Fork", "Lock", "UnLock", "Process", 
		"Send", "Stop", "Self", "Dot", "Identifier", "Letter", "LetterOrDigit", 
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
		case 39:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 40:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3(\3(\7(\u011c\n(\f(\16(\u011f\13(\3)\3)\3)\3)\3)\3)\5)\u0127\n)"+
		"\3*\3*\3*\3*\3*\3*\5*\u012f\n*\3+\3+\3,\3,\3,\3-\3-\3-\7-\u0139\n-\f-"+
		"\16-\u013c\13-\3-\3-\3.\3.\3/\3/\3/\3/\3\60\6\60\u0147\n\60\r\60\16\60"+
		"\u0148\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0151\n\61\f\61\16\61\u0154"+
		"\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u015f\n\62\f"+
		"\62\16\62\u0162\13\62\3\62\3\62\4\u013a\u0152\2\63\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U\2W\2Y,[-]._/a\60c\61\3\2\t\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13"+
		"\f\16\17\"\"\u016c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\r"+
		"o\3\2\2\2\17q\3\2\2\2\21x\3\2\2\2\23|\3\2\2\2\25\u0083\3\2\2\2\27\u008a"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u0091\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3"+
		"\2\2\2!\u009f\3\2\2\2#\u00a5\3\2\2\2%\u00ad\3\2\2\2\'\u00b6\3\2\2\2)\u00be"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2"+
		"\63\u00d5\3\2\2\2\65\u00d8\3\2\2\2\67\u00db\3\2\2\29\u00df\3\2\2\2;\u00e5"+
		"\3\2\2\2=\u00ea\3\2\2\2?\u00ef\3\2\2\2A\u00f4\3\2\2\2C\u00f9\3\2\2\2E"+
		"\u0100\3\2\2\2G\u0108\3\2\2\2I\u010d\3\2\2\2K\u0112\3\2\2\2M\u0117\3\2"+
		"\2\2O\u0119\3\2\2\2Q\u0126\3\2\2\2S\u012e\3\2\2\2U\u0130\3\2\2\2W\u0132"+
		"\3\2\2\2Y\u0135\3\2\2\2[\u013f\3\2\2\2]\u0141\3\2\2\2_\u0146\3\2\2\2a"+
		"\u014c\3\2\2\2c\u015a\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6\3\2\2\2"+
		"ij\7/\2\2j\b\3\2\2\2kl\7-\2\2l\n\3\2\2\2mn\7,\2\2n\f\3\2\2\2op\7\61\2"+
		"\2p\16\3\2\2\2qr\7f\2\2rs\7g\2\2st\7h\2\2tu\7k\2\2uv\7p\2\2vw\7g\2\2w"+
		"\20\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7v\2\2{\22\3\2\2\2|}\7n\2\2}~\7g\2\2~"+
		"\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7e\2\2\u0082"+
		"\24\3\2\2\2\u0083\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085\u0086\7o\2\2\u0086"+
		"\u0087\7d\2\2\u0087\u0088\7f\2\2\u0088\u0089\7c\2\2\u0089\26\3\2\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\30\3\2\2\2\u008d\u008e\7e\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090\32\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7f\2\2\u0093\u0094\7t\2\2\u0094\34\3\2\2\2\u0095\u0096\7e\2\2\u0096"+
		"\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\u0099\7u\2\2\u0099\36\3\2\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7k\2\2\u009c\u009d\7u\2\2\u009d\u009e\7v\2\2"+
		"\u009e \3\2\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7n\2"+
		"\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7A\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7"+
		"p\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7A\2\2\u00ac$\3\2\2\2\u00ad\u00ae"+
		"\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7A\2\2"+
		"\u00b5&\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2"+
		"\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd"+
		"\7A\2\2\u00bd(\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		"\u00c5\7w\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7A\2\2"+
		"\u00c8*\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7k\2"+
		"\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7A\2\2\u00ce,\3\2\2\2\u00cf\u00d0\7"+
		">\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7"+
		"@\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7v\2\2\u00d7\64"+
		"\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9\u00da\7h\2\2\u00da\66\3\2\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7h\2\2\u00de8\3\2\2\2\u00df"+
		"\u00e0\7f\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\u00e4\7h\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7#\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7"+
		"h\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7g\2\2\u00ee>"+
		"\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7m\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u00f7\7e\2\2\u00f7\u00f8\7m\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7e\2\2"+
		"\u00fe\u00ff\7m\2\2\u00ffD\3\2\2\2\u0100\u0101\7r\2\2\u0101\u0102\7t\2"+
		"\2\u0102\u0103\7q\2\2\u0103\u0104\7e\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7u\2\2\u0106\u0107\7u\2\2\u0107F\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7f\2\2\u010cH\3\2\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110\7q\2\2\u0110\u0111\7r\2\2\u0111"+
		"J\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114\u0115\7n\2\2\u0115"+
		"\u0116\7h\2\2\u0116L\3\2\2\2\u0117\u0118\7\60\2\2\u0118N\3\2\2\2\u0119"+
		"\u011d\5Q)\2\u011a\u011c\5S*\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u0120\u0127\t\2\2\2\u0121\u0122\n\3\2\2\u0122\u0127\6)\2\2\u0123"+
		"\u0124\t\4\2\2\u0124\u0125\t\5\2\2\u0125\u0127\6)\3\2\u0126\u0120\3\2"+
		"\2\2\u0126\u0121\3\2\2\2\u0126\u0123\3\2\2\2\u0127R\3\2\2\2\u0128\u012f"+
		"\t\6\2\2\u0129\u012a\n\3\2\2\u012a\u012f\6*\4\2\u012b\u012c\t\4\2\2\u012c"+
		"\u012d\t\5\2\2\u012d\u012f\6*\5\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2"+
		"\2\2\u012e\u012b\3\2\2\2\u012fT\3\2\2\2\u0130\u0131\4\62;\2\u0131V\3\2"+
		"\2\2\u0132\u0133\7^\2\2\u0133\u0134\7$\2\2\u0134X\3\2\2\2\u0135\u013a"+
		"\7$\2\2\u0136\u0139\5W,\2\u0137\u0139\n\7\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013e"+
		"Z\3\2\2\2\u013f\u0140\7B\2\2\u0140\\\3\2\2\2\u0141\u0142\7\60\2\2\u0142"+
		"\u0143\7\60\2\2\u0143\u0144\7\60\2\2\u0144^\3\2\2\2\u0145\u0147\t\b\2"+
		"\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\60\2\2\u014b`\3\2\2\2\u014c"+
		"\u014d\7\61\2\2\u014d\u014e\7,\2\2\u014e\u0152\3\2\2\2\u014f\u0151\13"+
		"\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7,"+
		"\2\2\u0156\u0157\7\61\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\61\2\2\u0159"+
		"b\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2"+
		"\2\u015d\u015f\n\7\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\b\62\2\2\u0164d\3\2\2\2\13\2\u011d\u0126\u012e\u0138\u013a\u0148"+
		"\u0152\u0160\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}