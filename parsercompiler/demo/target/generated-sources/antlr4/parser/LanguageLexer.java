// Generated from parser\Language.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, Identifier=75, Constant=76, StringLiteral=77, IntegerConstant=78, 
		FloatingConstant=79, CharacterConstant=80, EnumerationConstant=81, Whitespace=82;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "Identifier", "Constant", "StringLiteral", "Digit", "Sign", 
			"IntegerConstant", "FloatingConstant", "CharacterConstant", "EnumerationConstant", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "';'", "':'", "'case'", "'default'", 
			"'if'", "'('", "')'", "'else'", "'switch'", "'while'", "'do'", "'for'", 
			"'goto'", "'continue'", "'break'", "'return'", "','", "'*'", "'const'", 
			"'volatile'", "'['", "']'", "'void'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'signed'", "'unsigned'", "'struct'", "'union'", 
			"'enum'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'+'", "'-'", "'/'", "'%'", 
			"'~'", "'!'", "'++'", "'--'", "'sizeof'", "'.'", "'->'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Identifier", "Constant", "StringLiteral", "IntegerConstant", 
			"FloatingConstant", "CharacterConstant", "EnumerationConstant", "Whitespace"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0229\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\38\39\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I"+
		"\3I\3J\3J\3J\3K\3K\3K\3K\3L\3L\7L\u01cb\nL\fL\16L\u01ce\13L\3M\3M\3M\3"+
		"M\5M\u01d4\nM\3N\3N\7N\u01d8\nN\fN\16N\u01db\13N\3N\3N\3O\3O\3P\3P\3Q"+
		"\6Q\u01e4\nQ\rQ\16Q\u01e5\3R\6R\u01e9\nR\rR\16R\u01ea\3R\3R\7R\u01ef\n"+
		"R\fR\16R\u01f2\13R\3R\3R\5R\u01f6\nR\3R\6R\u01f9\nR\rR\16R\u01fa\5R\u01fd"+
		"\nR\3R\3R\6R\u0201\nR\rR\16R\u0202\3R\3R\5R\u0207\nR\3R\6R\u020a\nR\r"+
		"R\16R\u020b\5R\u020e\nR\3R\6R\u0211\nR\rR\16R\u0212\3R\3R\5R\u0217\nR"+
		"\3R\6R\u021a\nR\rR\16R\u021b\5R\u021e\nR\3S\3S\3S\3S\3T\3T\3U\3U\3U\3"+
		"U\3\u01d9\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"\2\u009f\2\u00a1P\u00a3Q\u00a5R\u00a7S\u00a9T\3\2\7\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\4\2--//\5\2\13\f\17\17\"\"\2\u023a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00b1\3\2\2\2\7\u00b3"+
		"\3\2\2\2\t\u00b5\3\2\2\2\13\u00b7\3\2\2\2\r\u00b9\3\2\2\2\17\u00bb\3\2"+
		"\2\2\21\u00c0\3\2\2\2\23\u00c8\3\2\2\2\25\u00cb\3\2\2\2\27\u00cd\3\2\2"+
		"\2\31\u00cf\3\2\2\2\33\u00d4\3\2\2\2\35\u00db\3\2\2\2\37\u00e1\3\2\2\2"+
		"!\u00e4\3\2\2\2#\u00e8\3\2\2\2%\u00ed\3\2\2\2\'\u00f6\3\2\2\2)\u00fc\3"+
		"\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61\u010d\3\2\2\2\63"+
		"\u0116\3\2\2\2\65\u0118\3\2\2\2\67\u011a\3\2\2\29\u011f\3\2\2\2;\u0124"+
		"\3\2\2\2=\u012a\3\2\2\2?\u012e\3\2\2\2A\u0133\3\2\2\2C\u0139\3\2\2\2E"+
		"\u0140\3\2\2\2G\u0147\3\2\2\2I\u0150\3\2\2\2K\u0157\3\2\2\2M\u015d\3\2"+
		"\2\2O\u0162\3\2\2\2Q\u0165\3\2\2\2S\u0168\3\2\2\2U\u016b\3\2\2\2W\u016e"+
		"\3\2\2\2Y\u0171\3\2\2\2[\u0175\3\2\2\2]\u0179\3\2\2\2_\u017c\3\2\2\2a"+
		"\u017f\3\2\2\2c\u0182\3\2\2\2e\u0184\3\2\2\2g\u0187\3\2\2\2i\u018a\3\2"+
		"\2\2k\u018c\3\2\2\2m\u018e\3\2\2\2o\u0190\3\2\2\2q\u0193\3\2\2\2s\u0196"+
		"\3\2\2\2u\u0198\3\2\2\2w\u019a\3\2\2\2y\u019d\3\2\2\2{\u01a0\3\2\2\2}"+
		"\u01a3\3\2\2\2\177\u01a6\3\2\2\2\u0081\u01a8\3\2\2\2\u0083\u01aa\3\2\2"+
		"\2\u0085\u01ac\3\2\2\2\u0087\u01ae\3\2\2\2\u0089\u01b0\3\2\2\2\u008b\u01b2"+
		"\3\2\2\2\u008d\u01b5\3\2\2\2\u008f\u01b8\3\2\2\2\u0091\u01bf\3\2\2\2\u0093"+
		"\u01c1\3\2\2\2\u0095\u01c4\3\2\2\2\u0097\u01c8\3\2\2\2\u0099\u01d3\3\2"+
		"\2\2\u009b\u01d5\3\2\2\2\u009d\u01de\3\2\2\2\u009f\u01e0\3\2\2\2\u00a1"+
		"\u01e3\3\2\2\2\u00a3\u021d\3\2\2\2\u00a5\u021f\3\2\2\2\u00a7\u0223\3\2"+
		"\2\2\u00a9\u0225\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7u\2\2\u00b0\4\3\2\2\2\u00b1\u00b2"+
		"\7}\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4\b\3\2\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\f\3\2\2\2\u00b9\u00ba"+
		"\7<\2\2\u00ba\16\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7g\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7w\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7v\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc\26\3\2\2\2\u00cd"+
		"\u00ce\7+\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		"\u00d6\7y\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\u00da\7j\2\2\u00da\34\3\2\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7"+
		"j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0\36"+
		"\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7q\2\2\u00e3 \3\2\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2\2\u00e7\"\3\2\2\2\u00e8\u00e9"+
		"\7i\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"$\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7w\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7t\2"+
		"\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7m\2\2\u00fb(\3\2"+
		"\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7w\2\2\u0100\u0101\7t\2\2\u0101\u0102\7p\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7.\2\2\u0104,\3\2\2\2\u0105\u0106\7,\2\2\u0106.\3\2\2\2\u0107\u0108\7"+
		"e\2\2\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7v\2\2\u010c\60\3\2\2\2\u010d\u010e\7x\2\2\u010e\u010f\7q\2\2\u010f\u0110"+
		"\7n\2\2\u0110\u0111\7c\2\2\u0111\u0112\7v\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115\62\3\2\2\2\u0116\u0117\7]\2\2\u0117"+
		"\64\3\2\2\2\u0118\u0119\7_\2\2\u0119\66\3\2\2\2\u011a\u011b\7x\2\2\u011b"+
		"\u011c\7q\2\2\u011c\u011d\7k\2\2\u011d\u011e\7f\2\2\u011e8\3\2\2\2\u011f"+
		"\u0120\7e\2\2\u0120\u0121\7j\2\2\u0121\u0122\7c\2\2\u0122\u0123\7t\2\2"+
		"\u0123:\3\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7j\2\2\u0126\u0127\7q\2"+
		"\2\u0127\u0128\7t\2\2\u0128\u0129\7v\2\2\u0129<\3\2\2\2\u012a\u012b\7"+
		"k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7v\2\2\u012d>\3\2\2\2\u012e\u012f"+
		"\7n\2\2\u012f\u0130\7q\2\2\u0130\u0131\7p\2\2\u0131\u0132\7i\2\2\u0132"+
		"@\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135\7n\2\2\u0135\u0136\7q\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7v\2\2\u0138B\3\2\2\2\u0139\u013a\7f\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7w\2\2\u013c\u013d\7d\2\2\u013d\u013e\7n\2\2"+
		"\u013e\u013f\7g\2\2\u013fD\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7k\2"+
		"\2\u0142\u0143\7i\2\2\u0143\u0144\7p\2\2\u0144\u0145\7g\2\2\u0145\u0146"+
		"\7f\2\2\u0146F\3\2\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149\u014a"+
		"\7u\2\2\u014a\u014b\7k\2\2\u014b\u014c\7i\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7f\2\2\u014fH\3\2\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154\u0155\7e\2\2"+
		"\u0155\u0156\7v\2\2\u0156J\3\2\2\2\u0157\u0158\7w\2\2\u0158\u0159\7p\2"+
		"\2\u0159\u015a\7k\2\2\u015a\u015b\7q\2\2\u015b\u015c\7p\2\2\u015cL\3\2"+
		"\2\2\u015d\u015e\7g\2\2\u015e\u015f\7p\2\2\u015f\u0160\7w\2\2\u0160\u0161"+
		"\7o\2\2\u0161N\3\2\2\2\u0162\u0163\7,\2\2\u0163\u0164\7?\2\2\u0164P\3"+
		"\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7?\2\2\u0167R\3\2\2\2\u0168\u0169"+
		"\7\'\2\2\u0169\u016a\7?\2\2\u016aT\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d"+
		"\7?\2\2\u016dV\3\2\2\2\u016e\u016f\7/\2\2\u016f\u0170\7?\2\2\u0170X\3"+
		"\2\2\2\u0171\u0172\7>\2\2\u0172\u0173\7>\2\2\u0173\u0174\7?\2\2\u0174"+
		"Z\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177\7@\2\2\u0177\u0178\7?\2\2\u0178"+
		"\\\3\2\2\2\u0179\u017a\7(\2\2\u017a\u017b\7?\2\2\u017b^\3\2\2\2\u017c"+
		"\u017d\7`\2\2\u017d\u017e\7?\2\2\u017e`\3\2\2\2\u017f\u0180\7~\2\2\u0180"+
		"\u0181\7?\2\2\u0181b\3\2\2\2\u0182\u0183\7A\2\2\u0183d\3\2\2\2\u0184\u0185"+
		"\7~\2\2\u0185\u0186\7~\2\2\u0186f\3\2\2\2\u0187\u0188\7(\2\2\u0188\u0189"+
		"\7(\2\2\u0189h\3\2\2\2\u018a\u018b\7~\2\2\u018bj\3\2\2\2\u018c\u018d\7"+
		"`\2\2\u018dl\3\2\2\2\u018e\u018f\7(\2\2\u018fn\3\2\2\2\u0190\u0191\7?"+
		"\2\2\u0191\u0192\7?\2\2\u0192p\3\2\2\2\u0193\u0194\7#\2\2\u0194\u0195"+
		"\7?\2\2\u0195r\3\2\2\2\u0196\u0197\7>\2\2\u0197t\3\2\2\2\u0198\u0199\7"+
		"@\2\2\u0199v\3\2\2\2\u019a\u019b\7>\2\2\u019b\u019c\7?\2\2\u019cx\3\2"+
		"\2\2\u019d\u019e\7@\2\2\u019e\u019f\7?\2\2\u019fz\3\2\2\2\u01a0\u01a1"+
		"\7>\2\2\u01a1\u01a2\7>\2\2\u01a2|\3\2\2\2\u01a3\u01a4\7@\2\2\u01a4\u01a5"+
		"\7@\2\2\u01a5~\3\2\2\2\u01a6\u01a7\7-\2\2\u01a7\u0080\3\2\2\2\u01a8\u01a9"+
		"\7/\2\2\u01a9\u0082\3\2\2\2\u01aa\u01ab\7\61\2\2\u01ab\u0084\3\2\2\2\u01ac"+
		"\u01ad\7\'\2\2\u01ad\u0086\3\2\2\2\u01ae\u01af\7\u0080\2\2\u01af\u0088"+
		"\3\2\2\2\u01b0\u01b1\7#\2\2\u01b1\u008a\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3"+
		"\u01b4\7-\2\2\u01b4\u008c\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6\u01b7\7/\2"+
		"\2\u01b7\u008e\3\2\2\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb"+
		"\7|\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7h\2\2\u01be"+
		"\u0090\3\2\2\2\u01bf\u01c0\7\60\2\2\u01c0\u0092\3\2\2\2\u01c1\u01c2\7"+
		"/\2\2\u01c2\u01c3\7@\2\2\u01c3\u0094\3\2\2\2\u01c4\u01c5\7\60\2\2\u01c5"+
		"\u01c6\7\60\2\2\u01c6\u01c7\7\60\2\2\u01c7\u0096\3\2\2\2\u01c8\u01cc\t"+
		"\2\2\2\u01c9\u01cb\t\3\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u0098\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d4\5\u00a1Q\2\u01d0\u01d4\5\u00a3R\2\u01d1\u01d4\5\u00a7"+
		"T\2\u01d2\u01d4\5\u00a5S\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u009a\3\2\2\2\u01d5\u01d9\7$"+
		"\2\2\u01d6\u01d8\13\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01dc\u01dd\7$\2\2\u01dd\u009c\3\2\2\2\u01de\u01df\t\4\2\2\u01df"+
		"\u009e\3\2\2\2\u01e0\u01e1\t\5\2\2\u01e1\u00a0\3\2\2\2\u01e2\u01e4\5\u009d"+
		"O\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u00a2\3\2\2\2\u01e7\u01e9\5\u009dO\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01f0\7\60\2\2\u01ed\u01ef\5\u009dO\2\u01ee\u01ed"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01fc\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\7G\2\2\u01f4\u01f6\5\u009f"+
		"P\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f9\5\u009dO\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u021e\3\2\2\2\u01fe\u0200\7\60\2\2\u01ff\u0201\5"+
		"\u009dO\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2"+
		"\u0202\u0203\3\2\2\2\u0203\u020d\3\2\2\2\u0204\u0206\7G\2\2\u0205\u0207"+
		"\5\u009fP\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2"+
		"\2\u0208\u020a\5\u009dO\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u0204\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u021e\3\2\2\2\u020f\u0211\5\u009dO\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0216\7G\2\2\u0215\u0217\5\u009fP\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\5\u009d"+
		"O\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u01e8\3\2\2\2\u021d\u01fe\3\2"+
		"\2\2\u021d\u0210\3\2\2\2\u021e\u00a4\3\2\2\2\u021f\u0220\7)\2\2\u0220"+
		"\u0221\13\2\2\2\u0221\u0222\7)\2\2\u0222\u00a6\3\2\2\2\u0223\u0224\5\u0097"+
		"L\2\u0224\u00a8\3\2\2\2\u0225\u0226\t\6\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\bU\2\2\u0228\u00aa\3\2\2\2\24\2\u01cc\u01d3\u01d9\u01e5\u01ea\u01f0"+
		"\u01f5\u01fa\u01fc\u0202\u0206\u020b\u020d\u0212\u0216\u021b\u021d\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}