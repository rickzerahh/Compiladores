// Generated from C:/Users/JRafael/IdeaProjects/CompiladoresTeste/src/antlr\FCp.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FCpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESERVED_WORDS=7, INT_TYPE=8, 
		FLOAT_TYPE=9, BOOLEAN_TYPE=10, STRING_TYPE=11, END=12, SEMICOLON=13, OP_PAR=14, 
		CL_PAR=15, OP_BRA=16, CL_BRA=17, BOOLEAN_VALUES=18, IDENTIFIER=19, ASSIGNMENT_OP=20, 
		ADD_OP=21, MULT_OP=22, REL_OP=23, EQU_OP=24, LOGICAL_OP=25, SINAL=26, 
		INT_VALUES=27, FLOAT_VALUES=28, STRING_VALUES=29, WS=30, LINE_COMMENT=31, 
		BLOCK_COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "RESERVED_WORDS", "INT_TYPE", 
			"FLOAT_TYPE", "BOOLEAN_TYPE", "STRING_TYPE", "END", "SEMICOLON", "OP_PAR", 
			"CL_PAR", "OP_BRA", "CL_BRA", "BOOLEAN_VALUES", "IDENTIFIER", "ASSIGNMENT_OP", 
			"ADD_OP", "MULT_OP", "REL_OP", "EQU_OP", "LOGICAL_OP", "SINAL", "INT_VALUES", 
			"FLOAT_VALUES", "STRING_VALUES", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'INPUT'", "'OUTPUT'", "'WHILE'", "'IF'", "'ELSE'", 
			null, "'INT'", "'FLOAT'", "'BOOL'", "'STRING'", "'END'", "';'", "'('", 
			"')'", "'{'", "'}'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "RESERVED_WORDS", "INT_TYPE", 
			"FLOAT_TYPE", "BOOLEAN_TYPE", "STRING_TYPE", "END", "SEMICOLON", "OP_PAR", 
			"CL_PAR", "OP_BRA", "CL_BRA", "BOOLEAN_VALUES", "IDENTIFIER", "ASSIGNMENT_OP", 
			"ADD_OP", "MULT_OP", "REL_OP", "EQU_OP", "LOGICAL_OP", "SINAL", "INT_VALUES", 
			"FLOAT_VALUES", "STRING_VALUES", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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


	public FCpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FCp.g4"; }

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
		"\u0004\u0000 \u0111\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00ad\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00b1\b\u0012\n\u0012\f\u0012\u00b4\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00be\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00c6\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00cc\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00d2\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0003\u001a\u00d7\b\u001a\u0001\u001a\u0004\u001a\u00da\b\u001a"+
		"\u000b\u001a\f\u001a\u00db\u0001\u001b\u0003\u001b\u00df\b\u001b\u0001"+
		"\u001b\u0004\u001b\u00e2\b\u001b\u000b\u001b\f\u001b\u00e3\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u00e8\b\u001b\u000b\u001b\f\u001b\u00e9\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00f0\b\u001c\n"+
		"\u001c\f\u001c\u00f3\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u00fd"+
		"\b\u001e\n\u001e\f\u001e\u0100\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0108\b\u001f\n\u001f"+
		"\f\u001f\u010b\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u0109\u0000 \u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? \u0001\u0000\u0007\u0002\u0000AZaz\u0003\u000009AZaz\u0002"+
		"\u0000++--\u0002\u0000%%//\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u0127\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0001"+
		"A\u0001\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000\u0005M\u0001"+
		"\u0000\u0000\u0000\u0007T\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000"+
		"\u0000\u000b]\u0001\u0000\u0000\u0000\r}\u0001\u0000\u0000\u0000\u000f"+
		"\u007f\u0001\u0000\u0000\u0000\u0011\u0083\u0001\u0000\u0000\u0000\u0013"+
		"\u0089\u0001\u0000\u0000\u0000\u0015\u008e\u0001\u0000\u0000\u0000\u0017"+
		"\u0095\u0001\u0000\u0000\u0000\u0019\u0099\u0001\u0000\u0000\u0000\u001b"+
		"\u009b\u0001\u0000\u0000\u0000\u001d\u009d\u0001\u0000\u0000\u0000\u001f"+
		"\u009f\u0001\u0000\u0000\u0000!\u00a1\u0001\u0000\u0000\u0000#\u00ac\u0001"+
		"\u0000\u0000\u0000%\u00ae\u0001\u0000\u0000\u0000\'\u00b5\u0001\u0000"+
		"\u0000\u0000)\u00b7\u0001\u0000\u0000\u0000+\u00bd\u0001\u0000\u0000\u0000"+
		"-\u00c5\u0001\u0000\u0000\u0000/\u00cb\u0001\u0000\u0000\u00001\u00d1"+
		"\u0001\u0000\u0000\u00003\u00d3\u0001\u0000\u0000\u00005\u00d6\u0001\u0000"+
		"\u0000\u00007\u00de\u0001\u0000\u0000\u00009\u00eb\u0001\u0000\u0000\u0000"+
		";\u00f6\u0001\u0000\u0000\u0000=\u00fa\u0001\u0000\u0000\u0000?\u0103"+
		"\u0001\u0000\u0000\u0000AB\u0005S\u0000\u0000BC\u0005T\u0000\u0000CD\u0005"+
		"A\u0000\u0000DE\u0005R\u0000\u0000EF\u0005T\u0000\u0000F\u0002\u0001\u0000"+
		"\u0000\u0000GH\u0005I\u0000\u0000HI\u0005N\u0000\u0000IJ\u0005P\u0000"+
		"\u0000JK\u0005U\u0000\u0000KL\u0005T\u0000\u0000L\u0004\u0001\u0000\u0000"+
		"\u0000MN\u0005O\u0000\u0000NO\u0005U\u0000\u0000OP\u0005T\u0000\u0000"+
		"PQ\u0005P\u0000\u0000QR\u0005U\u0000\u0000RS\u0005T\u0000\u0000S\u0006"+
		"\u0001\u0000\u0000\u0000TU\u0005W\u0000\u0000UV\u0005H\u0000\u0000VW\u0005"+
		"I\u0000\u0000WX\u0005L\u0000\u0000XY\u0005E\u0000\u0000Y\b\u0001\u0000"+
		"\u0000\u0000Z[\u0005I\u0000\u0000[\\\u0005F\u0000\u0000\\\n\u0001\u0000"+
		"\u0000\u0000]^\u0005E\u0000\u0000^_\u0005L\u0000\u0000_`\u0005S\u0000"+
		"\u0000`a\u0005E\u0000\u0000a\f\u0001\u0000\u0000\u0000bc\u0005S\u0000"+
		"\u0000cd\u0005T\u0000\u0000de\u0005A\u0000\u0000ef\u0005R\u0000\u0000"+
		"f~\u0005T\u0000\u0000gh\u0005I\u0000\u0000h~\u0005F\u0000\u0000ij\u0005"+
		"E\u0000\u0000jk\u0005L\u0000\u0000kl\u0005S\u0000\u0000l~\u0005E\u0000"+
		"\u0000mn\u0005W\u0000\u0000no\u0005H\u0000\u0000op\u0005I\u0000\u0000"+
		"pq\u0005L\u0000\u0000q~\u0005E\u0000\u0000rs\u0005I\u0000\u0000st\u0005"+
		"N\u0000\u0000tu\u0005P\u0000\u0000uv\u0005U\u0000\u0000v~\u0005T\u0000"+
		"\u0000wx\u0005O\u0000\u0000xy\u0005U\u0000\u0000yz\u0005T\u0000\u0000"+
		"z{\u0005P\u0000\u0000{|\u0005U\u0000\u0000|~\u0005T\u0000\u0000}b\u0001"+
		"\u0000\u0000\u0000}g\u0001\u0000\u0000\u0000}i\u0001\u0000\u0000\u0000"+
		"}m\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000"+
		"\u0000~\u000e\u0001\u0000\u0000\u0000\u007f\u0080\u0005I\u0000\u0000\u0080"+
		"\u0081\u0005N\u0000\u0000\u0081\u0082\u0005T\u0000\u0000\u0082\u0010\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005F\u0000\u0000\u0084\u0085\u0005L\u0000"+
		"\u0000\u0085\u0086\u0005O\u0000\u0000\u0086\u0087\u0005A\u0000\u0000\u0087"+
		"\u0088\u0005T\u0000\u0000\u0088\u0012\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005B\u0000\u0000\u008a\u008b\u0005O\u0000\u0000\u008b\u008c\u0005O"+
		"\u0000\u0000\u008c\u008d\u0005L\u0000\u0000\u008d\u0014\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005S\u0000\u0000\u008f\u0090\u0005T\u0000\u0000\u0090"+
		"\u0091\u0005R\u0000\u0000\u0091\u0092\u0005I\u0000\u0000\u0092\u0093\u0005"+
		"N\u0000\u0000\u0093\u0094\u0005G\u0000\u0000\u0094\u0016\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005E\u0000\u0000\u0096\u0097\u0005N\u0000\u0000\u0097"+
		"\u0098\u0005D\u0000\u0000\u0098\u0018\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005;\u0000\u0000\u009a\u001a\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"(\u0000\u0000\u009c\u001c\u0001\u0000\u0000\u0000\u009d\u009e\u0005)\u0000"+
		"\u0000\u009e\u001e\u0001\u0000\u0000\u0000\u009f\u00a0\u0005{\u0000\u0000"+
		"\u00a0 \u0001\u0000\u0000\u0000\u00a1\u00a2\u0005}\u0000\u0000\u00a2\""+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005T\u0000\u0000\u00a4\u00a5\u0005"+
		"R\u0000\u0000\u00a5\u00a6\u0005U\u0000\u0000\u00a6\u00ad\u0005E\u0000"+
		"\u0000\u00a7\u00a8\u0005F\u0000\u0000\u00a8\u00a9\u0005A\u0000\u0000\u00a9"+
		"\u00aa\u0005L\u0000\u0000\u00aa\u00ab\u0005S\u0000\u0000\u00ab\u00ad\u0005"+
		"E\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ad$\u0001\u0000\u0000\u0000\u00ae\u00b2\u0007\u0000\u0000"+
		"\u0000\u00af\u00b1\u0007\u0001\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3&\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005=\u0000\u0000\u00b6"+
		"(\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000\u00b8*\u0001"+
		"\u0000\u0000\u0000\u00b9\u00be\u0005*\u0000\u0000\u00ba\u00bb\u0005*\u0000"+
		"\u0000\u00bb\u00be\u0005*\u0000\u0000\u00bc\u00be\u0007\u0003\u0000\u0000"+
		"\u00bd\u00b9\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be,\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c6\u0005>\u0000\u0000\u00c0\u00c1\u0005>\u0000\u0000\u00c1\u00c6\u0005"+
		"=\u0000\u0000\u00c2\u00c6\u0005<\u0000\u0000\u00c3\u00c4\u0005<\u0000"+
		"\u0000\u00c4\u00c6\u0005=\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6.\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005=\u0000\u0000\u00c8\u00cc\u0005=\u0000\u0000\u00c9\u00ca\u0005"+
		"!\u0000\u0000\u00ca\u00cc\u0005=\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc0\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005&\u0000\u0000\u00ce\u00d2\u0005&\u0000\u0000\u00cf\u00d0"+
		"\u0005|\u0000\u0000\u00d0\u00d2\u0005|\u0000\u0000\u00d1\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d22\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0007\u0002\u0000\u0000\u00d44\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0007\u0002\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u000209\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc6\u0001\u0000\u0000\u0000\u00dd\u00df\u0007"+
		"\u0002\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00e2\u0002"+
		"09\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005.\u0000\u0000"+
		"\u00e6\u00e8\u000209\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea8\u0001\u0000\u0000\u0000\u00eb\u00f1\u0005"+
		"\"\u0000\u0000\u00ec\u00f0\b\u0004\u0000\u0000\u00ed\u00ee\u0005\\\u0000"+
		"\u0000\u00ee\u00f0\t\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\"\u0000\u0000\u00f5:\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0007\u0005\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0006\u001d\u0000\u0000\u00f9<\u0001\u0000\u0000\u0000\u00fa\u00fe"+
		"\u0005#\u0000\u0000\u00fb\u00fd\b\u0006\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0006"+
		"\u001e\u0000\u0000\u0102>\u0001\u0000\u0000\u0000\u0103\u0104\u0005/\u0000"+
		"\u0000\u0104\u0105\u0005*\u0000\u0000\u0105\u0109\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\t\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0005*\u0000\u0000\u010d\u010e"+
		"\u0005/\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0006"+
		"\u001f\u0000\u0000\u0110@\u0001\u0000\u0000\u0000\u0011\u0000}\u00ac\u00b2"+
		"\u00bd\u00c5\u00cb\u00d1\u00d6\u00db\u00de\u00e3\u00e9\u00ef\u00f1\u00fe"+
		"\u0109\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}