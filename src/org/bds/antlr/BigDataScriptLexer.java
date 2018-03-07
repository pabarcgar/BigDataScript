// Generated from BigDataScript.g4 by ANTLR 4.7.1
package org.bds.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigDataScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		T__73=74, T__74=75, NULL_LITERAL=76, BOOL_LITERAL=77, INT_LITERAL=78, 
		REAL_LITERAL=79, STRING_LITERAL=80, STRING_LITERAL_SINGLE=81, HELP_LITERAL=82, 
		SYS_LITERAL=83, TASK_LITERAL=84, COMMENT=85, COMMENT_LINE=86, COMMENT_LINE_HASH=87, 
		ID=88, WS=89;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
		"T__73", "T__74", "IntegerNumber", "EscapeSequence", "EscapedNewLine", 
		"Exponent", "HexPrefix", "HexDigit", "NonIntegerNumber", "SysMultiLine", 
		"NULL_LITERAL", "BOOL_LITERAL", "INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", 
		"STRING_LITERAL_SINGLE", "HELP_LITERAL", "SYS_LITERAL", "TASK_LITERAL", 
		"COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'\n'", "','", "'bool'", "'int'", "'real'", "'string'", "'void'", 
		"'['", "']'", "'{'", "'}'", "'class'", "'extends'", "'='", "':='", "'include'", 
		"'break'", "'breakpoint'", "'checkpoint'", "'continue'", "'debug'", "'exit'", 
		"'print'", "'println'", "'warning'", "'error'", "'for'", "'('", "')'", 
		"':'", "'if'", "'else'", "'kill'", "'return'", "'wait'", "'switch'", "'case'", 
		"'default'", "'while'", "'.'", "'++'", "'--'", "'~'", "'!'", "'%'", "'/'", 
		"'*'", "'-'", "'+'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&'", 
		"'^'", "'|'", "'&&'", "'||'", "'?'", "'<-'", "'=>'", "'task'", "'dep'", 
		"'goal'", "'par'", "'parallel'", "'|='", "'&='", "'/='", "'*='", "'-='", 
		"'+='", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NULL_LITERAL", "BOOL_LITERAL", "INT_LITERAL", 
		"REAL_LITERAL", "STRING_LITERAL", "STRING_LITERAL_SINGLE", "HELP_LITERAL", 
		"SYS_LITERAL", "TASK_LITERAL", "COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", 
		"ID", "WS"
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


	public BigDataScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigDataScript.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 92:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 93:
			COMMENT_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 94:
			COMMENT_LINE_HASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void COMMENT_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}
	private void COMMENT_LINE_HASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 skip(); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u02db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3"+
		"M\7M\u01fc\nM\fM\16M\u01ff\13M\3M\3M\6M\u0203\nM\rM\16M\u0204\3M\3M\6"+
		"M\u0209\nM\rM\16M\u020a\5M\u020d\nM\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0217\n"+
		"N\3O\3O\3O\3O\5O\u021d\nO\3P\3P\5P\u0221\nP\3P\6P\u0224\nP\rP\16P\u0225"+
		"\3Q\3Q\3Q\3Q\5Q\u022c\nQ\3R\3R\3S\6S\u0231\nS\rS\16S\u0232\3S\3S\7S\u0237"+
		"\nS\fS\16S\u023a\13S\3S\5S\u023d\nS\3S\3S\6S\u0241\nS\rS\16S\u0242\3S"+
		"\5S\u0246\nS\3S\6S\u0249\nS\rS\16S\u024a\3S\3S\6S\u024f\nS\rS\16S\u0250"+
		"\5S\u0253\nS\3T\3T\7T\u0257\nT\fT\16T\u025a\13T\3U\3U\3U\3U\3U\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\5V\u026a\nV\3W\3W\3X\3X\3Y\3Y\3Y\3Y\7Y\u0274\nY\f"+
		"Y\16Y\u0277\13Y\3Y\3Y\3Z\3Z\7Z\u027d\nZ\fZ\16Z\u0280\13Z\3Z\3Z\3[\3[\3"+
		"[\3[\3[\3[\6[\u028a\n[\r[\16[\u028b\3[\3[\3\\\3\\\3\\\3\\\3\\\6\\\u0295"+
		"\n\\\r\\\16\\\u0296\3\\\3\\\3]\3]\3]\3]\3]\3]\6]\u02a1\n]\r]\16]\u02a2"+
		"\3]\3]\3]\3^\3^\3^\3^\7^\u02ac\n^\f^\16^\u02af\13^\3^\3^\3^\3^\3^\3_\3"+
		"_\3_\3_\7_\u02ba\n_\f_\16_\u02bd\13_\3_\3_\3`\3`\7`\u02c3\n`\f`\16`\u02c6"+
		"\13`\3`\3`\3a\3a\7a\u02cc\na\fa\16a\u02cf\13a\3b\3b\3b\3b\3b\3b\3b\5b"+
		"\u02d8\nb\3b\3b\3\u02ad\2c\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9N\u00abO\u00ad"+
		"P\u00afQ\u00b1R\u00b3S\u00b5T\u00b7U\u00b9V\u00bbW\u00bdX\u00bfY\u00c1"+
		"Z\u00c3[\3\2\16\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\4\2GGgg\4\2--//\5\2"+
		"\62;CHch\4\2$$^^\3\2))\4\2\13\13\"\"\6\2\f\f\17\17**}}\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\13\17\17\"\"\2\u02f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\3\u00c5"+
		"\3\2\2\2\5\u00c7\3\2\2\2\7\u00c9\3\2\2\2\t\u00cb\3\2\2\2\13\u00d0\3\2"+
		"\2\2\r\u00d4\3\2\2\2\17\u00d9\3\2\2\2\21\u00e0\3\2\2\2\23\u00e5\3\2\2"+
		"\2\25\u00e7\3\2\2\2\27\u00e9\3\2\2\2\31\u00eb\3\2\2\2\33\u00ed\3\2\2\2"+
		"\35\u00f3\3\2\2\2\37\u00fb\3\2\2\2!\u00fd\3\2\2\2#\u0100\3\2\2\2%\u0108"+
		"\3\2\2\2\'\u010e\3\2\2\2)\u0119\3\2\2\2+\u0124\3\2\2\2-\u012d\3\2\2\2"+
		"/\u0133\3\2\2\2\61\u0138\3\2\2\2\63\u013e\3\2\2\2\65\u0146\3\2\2\2\67"+
		"\u014e\3\2\2\29\u0154\3\2\2\2;\u0158\3\2\2\2=\u015a\3\2\2\2?\u015c\3\2"+
		"\2\2A\u015e\3\2\2\2C\u0161\3\2\2\2E\u0166\3\2\2\2G\u016b\3\2\2\2I\u0172"+
		"\3\2\2\2K\u0177\3\2\2\2M\u017e\3\2\2\2O\u0183\3\2\2\2Q\u018b\3\2\2\2S"+
		"\u0191\3\2\2\2U\u0193\3\2\2\2W\u0196\3\2\2\2Y\u0199\3\2\2\2[\u019b\3\2"+
		"\2\2]\u019d\3\2\2\2_\u019f\3\2\2\2a\u01a1\3\2\2\2c\u01a3\3\2\2\2e\u01a5"+
		"\3\2\2\2g\u01a7\3\2\2\2i\u01a9\3\2\2\2k\u01ab\3\2\2\2m\u01ae\3\2\2\2o"+
		"\u01b1\3\2\2\2q\u01b4\3\2\2\2s\u01b7\3\2\2\2u\u01b9\3\2\2\2w\u01bb\3\2"+
		"\2\2y\u01bd\3\2\2\2{\u01c0\3\2\2\2}\u01c3\3\2\2\2\177\u01c5\3\2\2\2\u0081"+
		"\u01c8\3\2\2\2\u0083\u01cb\3\2\2\2\u0085\u01d0\3\2\2\2\u0087\u01d4\3\2"+
		"\2\2\u0089\u01d9\3\2\2\2\u008b\u01dd\3\2\2\2\u008d\u01e6\3\2\2\2\u008f"+
		"\u01e9\3\2\2\2\u0091\u01ec\3\2\2\2\u0093\u01ef\3\2\2\2\u0095\u01f2\3\2"+
		"\2\2\u0097\u01f5\3\2\2\2\u0099\u020c\3\2\2\2\u009b\u020e\3\2\2\2\u009d"+
		"\u0218\3\2\2\2\u009f\u021e\3\2\2\2\u00a1\u022b\3\2\2\2\u00a3\u022d\3\2"+
		"\2\2\u00a5\u0252\3\2\2\2\u00a7\u0258\3\2\2\2\u00a9\u025b\3\2\2\2\u00ab"+
		"\u0269\3\2\2\2\u00ad\u026b\3\2\2\2\u00af\u026d\3\2\2\2\u00b1\u026f\3\2"+
		"\2\2\u00b3\u027a\3\2\2\2\u00b5\u0283\3\2\2\2\u00b7\u028f\3\2\2\2\u00b9"+
		"\u029a\3\2\2\2\u00bb\u02a7\3\2\2\2\u00bd\u02b5\3\2\2\2\u00bf\u02c0\3\2"+
		"\2\2\u00c1\u02c9\3\2\2\2\u00c3\u02d7\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6"+
		"\4\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\6\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca"+
		"\b\3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\n\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3\f\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\16\3\2\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\u00df\7i\2\2\u00df\20\3\2\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7"+
		"q\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7f\2\2\u00e4\22\3\2\2\2\u00e5\u00e6"+
		"\7]\2\2\u00e6\24\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8\26\3\2\2\2\u00e9\u00ea"+
		"\7}\2\2\u00ea\30\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec\32\3\2\2\2\u00ed"+
		"\u00ee\7e\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\u00f2\7u\2\2\u00f2\34\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7"+
		"z\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9"+
		"\7f\2\2\u00f9\u00fa\7u\2\2\u00fa\36\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc "+
		"\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\u00ff\7?\2\2\u00ff\"\3\2\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7e\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0105\7w\2\2\u0105\u0106\7f\2\2\u0106\u0107\7g\2\2\u0107$\3\2\2\2\u0108"+
		"\u0109\7d\2\2\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7c\2\2"+
		"\u010c\u010d\7m\2\2\u010d&\3\2\2\2\u010e\u010f\7d\2\2\u010f\u0110\7t\2"+
		"\2\u0110\u0111\7g\2\2\u0111\u0112\7c\2\2\u0112\u0113\7m\2\2\u0113\u0114"+
		"\7r\2\2\u0114\u0115\7q\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117"+
		"\u0118\7v\2\2\u0118(\3\2\2\2\u0119\u011a\7e\2\2\u011a\u011b\7j\2\2\u011b"+
		"\u011c\7g\2\2\u011c\u011d\7e\2\2\u011d\u011e\7m\2\2\u011e\u011f\7r\2\2"+
		"\u011f\u0120\7q\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123"+
		"\7v\2\2\u0123*\3\2\2\2\u0124\u0125\7e\2\2\u0125\u0126\7q\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7v\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7w\2\2\u012b\u012c\7g\2\2\u012c,\3\2\2\2\u012d\u012e\7f\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7d\2\2\u0130\u0131\7w\2\2\u0131\u0132\7i\2\2"+
		"\u0132.\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135\7z\2\2\u0135\u0136\7k\2"+
		"\2\u0136\u0137\7v\2\2\u0137\60\3\2\2\2\u0138\u0139\7r\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7v\2\2\u013d"+
		"\62\3\2\2\2\u013e\u013f\7r\2\2\u013f\u0140\7t\2\2\u0140\u0141\7k\2\2\u0141"+
		"\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143\u0144\7n\2\2\u0144\u0145\7p\2\2"+
		"\u0145\64\3\2\2\2\u0146\u0147\7y\2\2\u0147\u0148\7c\2\2\u0148\u0149\7"+
		"t\2\2\u0149\u014a\7p\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2\u014c\u014d"+
		"\7i\2\2\u014d\66\3\2\2\2\u014e\u014f\7g\2\2\u014f\u0150\7t\2\2\u0150\u0151"+
		"\7t\2\2\u0151\u0152\7q\2\2\u0152\u0153\7t\2\2\u01538\3\2\2\2\u0154\u0155"+
		"\7h\2\2\u0155\u0156\7q\2\2\u0156\u0157\7t\2\2\u0157:\3\2\2\2\u0158\u0159"+
		"\7*\2\2\u0159<\3\2\2\2\u015a\u015b\7+\2\2\u015b>\3\2\2\2\u015c\u015d\7"+
		"<\2\2\u015d@\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160\7h\2\2\u0160B\3\2"+
		"\2\2\u0161\u0162\7g\2\2\u0162\u0163\7n\2\2\u0163\u0164\7u\2\2\u0164\u0165"+
		"\7g\2\2\u0165D\3\2\2\2\u0166\u0167\7m\2\2\u0167\u0168\7k\2\2\u0168\u0169"+
		"\7n\2\2\u0169\u016a\7n\2\2\u016aF\3\2\2\2\u016b\u016c\7t\2\2\u016c\u016d"+
		"\7g\2\2\u016d\u016e\7v\2\2\u016e\u016f\7w\2\2\u016f\u0170\7t\2\2\u0170"+
		"\u0171\7p\2\2\u0171H\3\2\2\2\u0172\u0173\7y\2\2\u0173\u0174\7c\2\2\u0174"+
		"\u0175\7k\2\2\u0175\u0176\7v\2\2\u0176J\3\2\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7y\2\2\u0179\u017a\7k\2\2\u017a\u017b\7v\2\2\u017b\u017c\7e\2\2"+
		"\u017c\u017d\7j\2\2\u017dL\3\2\2\2\u017e\u017f\7e\2\2\u017f\u0180\7c\2"+
		"\2\u0180\u0181\7u\2\2\u0181\u0182\7g\2\2\u0182N\3\2\2\2\u0183\u0184\7"+
		"f\2\2\u0184\u0185\7g\2\2\u0185\u0186\7h\2\2\u0186\u0187\7c\2\2\u0187\u0188"+
		"\7w\2\2\u0188\u0189\7n\2\2\u0189\u018a\7v\2\2\u018aP\3\2\2\2\u018b\u018c"+
		"\7y\2\2\u018c\u018d\7j\2\2\u018d\u018e\7k\2\2\u018e\u018f\7n\2\2\u018f"+
		"\u0190\7g\2\2\u0190R\3\2\2\2\u0191\u0192\7\60\2\2\u0192T\3\2\2\2\u0193"+
		"\u0194\7-\2\2\u0194\u0195\7-\2\2\u0195V\3\2\2\2\u0196\u0197\7/\2\2\u0197"+
		"\u0198\7/\2\2\u0198X\3\2\2\2\u0199\u019a\7\u0080\2\2\u019aZ\3\2\2\2\u019b"+
		"\u019c\7#\2\2\u019c\\\3\2\2\2\u019d\u019e\7\'\2\2\u019e^\3\2\2\2\u019f"+
		"\u01a0\7\61\2\2\u01a0`\3\2\2\2\u01a1\u01a2\7,\2\2\u01a2b\3\2\2\2\u01a3"+
		"\u01a4\7/\2\2\u01a4d\3\2\2\2\u01a5\u01a6\7-\2\2\u01a6f\3\2\2\2\u01a7\u01a8"+
		"\7>\2\2\u01a8h\3\2\2\2\u01a9\u01aa\7@\2\2\u01aaj\3\2\2\2\u01ab\u01ac\7"+
		">\2\2\u01ac\u01ad\7?\2\2\u01adl\3\2\2\2\u01ae\u01af\7@\2\2\u01af\u01b0"+
		"\7?\2\2\u01b0n\3\2\2\2\u01b1\u01b2\7#\2\2\u01b2\u01b3\7?\2\2\u01b3p\3"+
		"\2\2\2\u01b4\u01b5\7?\2\2\u01b5\u01b6\7?\2\2\u01b6r\3\2\2\2\u01b7\u01b8"+
		"\7(\2\2\u01b8t\3\2\2\2\u01b9\u01ba\7`\2\2\u01bav\3\2\2\2\u01bb\u01bc\7"+
		"~\2\2\u01bcx\3\2\2\2\u01bd\u01be\7(\2\2\u01be\u01bf\7(\2\2\u01bfz\3\2"+
		"\2\2\u01c0\u01c1\7~\2\2\u01c1\u01c2\7~\2\2\u01c2|\3\2\2\2\u01c3\u01c4"+
		"\7A\2\2\u01c4~\3\2\2\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\7/\2\2\u01c7\u0080"+
		"\3\2\2\2\u01c8\u01c9\7?\2\2\u01c9\u01ca\7@\2\2\u01ca\u0082\3\2\2\2\u01cb"+
		"\u01cc\7v\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7m\2\2"+
		"\u01cf\u0084\3\2\2\2\u01d0\u01d1\7f\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3"+
		"\7r\2\2\u01d3\u0086\3\2\2\2\u01d4\u01d5\7i\2\2\u01d5\u01d6\7q\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7n\2\2\u01d8\u0088\3\2\2\2\u01d9\u01da\7r\2"+
		"\2\u01da\u01db\7c\2\2\u01db\u01dc\7t\2\2\u01dc\u008a\3\2\2\2\u01dd\u01de"+
		"\7r\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1\7c\2\2\u01e1"+
		"\u01e2\7n\2\2\u01e2\u01e3\7n\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7n\2\2"+
		"\u01e5\u008c\3\2\2\2\u01e6\u01e7\7~\2\2\u01e7\u01e8\7?\2\2\u01e8\u008e"+
		"\3\2\2\2\u01e9\u01ea\7(\2\2\u01ea\u01eb\7?\2\2\u01eb\u0090\3\2\2\2\u01ec"+
		"\u01ed\7\61\2\2\u01ed\u01ee\7?\2\2\u01ee\u0092\3\2\2\2\u01ef\u01f0\7,"+
		"\2\2\u01f0\u01f1\7?\2\2\u01f1\u0094\3\2\2\2\u01f2\u01f3\7/\2\2\u01f3\u01f4"+
		"\7?\2\2\u01f4\u0096\3\2\2\2\u01f5\u01f6\7-\2\2\u01f6\u01f7\7?\2\2\u01f7"+
		"\u0098\3\2\2\2\u01f8\u020d\7\62\2\2\u01f9\u01fd\4\63;\2\u01fa\u01fc\4"+
		"\62;\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u020d\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7\62"+
		"\2\2\u0201\u0203\4\629\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020d\3\2\2\2\u0206\u0208\5\u00a1"+
		"Q\2\u0207\u0209\5\u00a3R\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u01f8\3\2"+
		"\2\2\u020c\u01f9\3\2\2\2\u020c\u0200\3\2\2\2\u020c\u0206\3\2\2\2\u020d"+
		"\u009a\3\2\2\2\u020e\u0216\7^\2\2\u020f\u0217\t\2\2\2\u0210\u0211\4\62"+
		"\65\2\u0211\u0212\4\629\2\u0212\u0217\4\629\2\u0213\u0214\4\629\2\u0214"+
		"\u0217\4\629\2\u0215\u0217\4\629\2\u0216\u020f\3\2\2\2\u0216\u0210\3\2"+
		"\2\2\u0216\u0213\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u009c\3\2\2\2\u0218"+
		"\u021c\7^\2\2\u0219\u021d\t\3\2\2\u021a\u021b\7\17\2\2\u021b\u021d\7\f"+
		"\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u009e\3\2\2\2\u021e"+
		"\u0220\t\4\2\2\u021f\u0221\t\5\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u0224\4\62;\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u00a0\3\2"+
		"\2\2\u0227\u0228\7\62\2\2\u0228\u022c\7z\2\2\u0229\u022a\7\62\2\2\u022a"+
		"\u022c\7Z\2\2\u022b\u0227\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u00a2\3\2"+
		"\2\2\u022d\u022e\t\6\2\2\u022e\u00a4\3\2\2\2\u022f\u0231\4\62;\2\u0230"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0238\7\60\2\2\u0235\u0237\4\62;\2\u0236"+
		"\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\5\u009fP\2\u023c"+
		"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0253\3\2\2\2\u023e\u0240\7\60"+
		"\2\2\u023f\u0241\4\62;\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0246\5\u009f"+
		"P\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0253\3\2\2\2\u0247"+
		"\u0249\4\62;\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0253\5\u009fP\2\u024d"+
		"\u024f\4\62;\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0230\3\2\2\2\u0252"+
		"\u023e\3\2\2\2\u0252\u0248\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u00a6\3\2"+
		"\2\2\u0254\u0257\5\u009dO\2\u0255\u0257\n\3\2\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u00a8\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7p\2\2\u025c"+
		"\u025d\7w\2\2\u025d\u025e\7n\2\2\u025e\u025f\7n\2\2\u025f\u00aa\3\2\2"+
		"\2\u0260\u0261\7v\2\2\u0261\u0262\7t\2\2\u0262\u0263\7w\2\2\u0263\u026a"+
		"\7g\2\2\u0264\u0265\7h\2\2\u0265\u0266\7c\2\2\u0266\u0267\7n\2\2\u0267"+
		"\u0268\7u\2\2\u0268\u026a\7g\2\2\u0269\u0260\3\2\2\2\u0269\u0264\3\2\2"+
		"\2\u026a\u00ac\3\2\2\2\u026b\u026c\5\u0099M\2\u026c\u00ae\3\2\2\2\u026d"+
		"\u026e\5\u00a5S\2\u026e\u00b0\3\2\2\2\u026f\u0275\7$\2\2\u0270\u0274\n"+
		"\7\2\2\u0271\u0272\7^\2\2\u0272\u0274\13\2\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\7$\2\2\u0279"+
		"\u00b2\3\2\2\2\u027a\u027e\7)\2\2\u027b\u027d\n\b\2\2\u027c\u027b\3\2"+
		"\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\7)\2\2\u0282\u00b4\3\2"+
		"\2\2\u0283\u0284\7j\2\2\u0284\u0285\7g\2\2\u0285\u0286\7n\2\2\u0286\u0287"+
		"\7r\2\2\u0287\u0289\3\2\2\2\u0288\u028a\t\t\2\2\u0289\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028e\5\u00a7T\2\u028e\u00b6\3\2\2\2\u028f\u0290\7u\2\2\u0290"+
		"\u0291\7{\2\2\u0291\u0292\7u\2\2\u0292\u0294\3\2\2\2\u0293\u0295\t\t\2"+
		"\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\u00a7T\2\u0299\u00b8\3\2\2"+
		"\2\u029a\u029b\7v\2\2\u029b\u029c\7c\2\2\u029c\u029d\7u\2\2\u029d\u029e"+
		"\7m\2\2\u029e\u02a0\3\2\2\2\u029f\u02a1\t\t\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\n\n\2\2\u02a5\u02a6\5\u00a7T\2\u02a6\u00ba\3\2\2\2\u02a7"+
		"\u02a8\7\61\2\2\u02a8\u02a9\7,\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02ac\13"+
		"\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7,"+
		"\2\2\u02b1\u02b2\7\61\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\b^\2\2\u02b4"+
		"\u00bc\3\2\2\2\u02b5\u02b6\7\61\2\2\u02b6\u02b7\7\61\2\2\u02b7\u02bb\3"+
		"\2\2\2\u02b8\u02ba\n\3\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02bf\b_\3\2\u02bf\u00be\3\2\2\2\u02c0\u02c4\7%\2\2\u02c1\u02c3"+
		"\n\3\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\b`"+
		"\4\2\u02c8\u00c0\3\2\2\2\u02c9\u02cd\t\13\2\2\u02ca\u02cc\t\f\2\2\u02cb"+
		"\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02ce\u00c2\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d8\t\r\2\2\u02d1"+
		"\u02d2\7^\2\2\u02d2\u02d8\7\f\2\2\u02d3\u02d4\7^\2\2\u02d4\u02d5\7\17"+
		"\2\2\u02d5\u02d8\7\f\2\2\u02d6\u02d8\7\16\2\2\u02d7\u02d0\3\2\2\2\u02d7"+
		"\u02d1\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02da\bb\5\2\u02da\u00c4\3\2\2\2\"\2\u01fd\u0204\u020a\u020c"+
		"\u0216\u021c\u0220\u0225\u022b\u0232\u0238\u023c\u0242\u0245\u024a\u0250"+
		"\u0252\u0256\u0258\u0269\u0273\u0275\u027e\u028b\u0296\u02a2\u02ad\u02bb"+
		"\u02c4\u02cd\u02d7\6\3^\2\3_\3\3`\4\3b\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}