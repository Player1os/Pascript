// Generated from src/pascript/grammar/Pascript.g4 by ANTLR 4.4

package pascript.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, NEWLINE=3, WHITESPACE=4, MODULE_BEGIN=5, 
		MODULE_END=6, EXTERNAL_SECTION_BEGIN=7, EXTERNAL_SECTION_END=8, VARIABLE_SECTION_BEGIN=9, 
		VARIABLE_SECTION_END=10, FUNCTION_SECTION_BEGIN=11, FUNCTION_SECTION_END=12, 
		MAIN_SECTION_BEGIN=13, MAIN_SECTION_END=14, COMMA=15, DOT=16, END_STATEMENT=17, 
		PAREN_OPEN=18, PAREN_CLOSE=19, SQUARE_OPEN=20, SQUARE_CLOSE=21, CURLY_OPEN=22, 
		CURLY_CLOSE=23, PRINT=24, READ=25, DELETE=26, RETURN=27, IF=28, ELSE=29, 
		WHILE=30, DO=31, FOR=32, MULTIPLY=33, DIVIDE=34, MODULO=35, INCREMENT=36, 
		DECREMENT=37, ADD=38, SUBTRACT=39, AND=40, OR=41, XOR=42, NOT=43, LESS_OR_EQUAL=44, 
		GREATER_OR_EQUAL=45, LESS=46, GREATER=47, EQUAL=48, NOT_EQUAL=49, ASSIGN=50, 
		VOID_DATATYPE=51, BOOLEAN_DATATYPE=52, INTEGER_DATATYPE=53, FLOAT_DATATYPE=54, 
		STRING_DATATYPE=55, STRING=56, FLOAT=57, INTEGER=58, TRUE=59, FALSE=60, 
		IDENTIFIER=61;
	public static final String[] tokenNames = {
		"<INVALID>", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WHITESPACE", 
		"'<module>'", "'</module>'", "'<external>'", "'</external>'", "'<variable>'", 
		"'</variable>'", "'<function>'", "'</function>'", "'<main>'", "'</main>'", 
		"','", "'.'", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<-'", 
		"'->'", "'delete'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'+'", "'-'", "'&'", "'|'", "'^'", 
		"'!'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'='", "'void'", 
		"'bool'", "'int'", "'float'", "'string'", "STRING", "FLOAT", "INTEGER", 
		"'true'", "'false'", "IDENTIFIER"
	};
	public static final int
		RULE_module = 0, RULE_externalSection = 1, RULE_variableSection = 2, RULE_functionSection = 3, 
		RULE_mainSection = 4, RULE_externalFunctionDeclaration = 5, RULE_functionDeclaration = 6, 
		RULE_returnDataType = 7, RULE_functionDefinition = 8, RULE_parameterList = 9, 
		RULE_namedParameterList = 10, RULE_statement = 11, RULE_blockStatement = 12, 
		RULE_basicStatement = 13, RULE_globalVariableDeclaration = 14, RULE_variableDeclaration = 15, 
		RULE_expression = 16, RULE_argumentList = 17, RULE_dataType = 18, RULE_primitiveDataType = 19, 
		RULE_arrayDataType = 20, RULE_literal = 21;
	public static final String[] ruleNames = {
		"module", "externalSection", "variableSection", "functionSection", "mainSection", 
		"externalFunctionDeclaration", "functionDeclaration", "returnDataType", 
		"functionDefinition", "parameterList", "namedParameterList", "statement", 
		"blockStatement", "basicStatement", "globalVariableDeclaration", "variableDeclaration", 
		"expression", "argumentList", "dataType", "primitiveDataType", "arrayDataType", 
		"literal"
	};

	@Override
	public String getGrammarFileName() { return "Pascript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModuleContext extends ParserRuleContext {
		public MainSectionContext mainSection() {
			return getRuleContext(MainSectionContext.class,0);
		}
		public TerminalNode MODULE_END() { return getToken(PascriptParser.MODULE_END, 0); }
		public VariableSectionContext variableSection() {
			return getRuleContext(VariableSectionContext.class,0);
		}
		public ExternalSectionContext externalSection() {
			return getRuleContext(ExternalSectionContext.class,0);
		}
		public FunctionSectionContext functionSection() {
			return getRuleContext(FunctionSectionContext.class,0);
		}
		public TerminalNode MODULE_BEGIN() { return getToken(PascriptParser.MODULE_BEGIN, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(MODULE_BEGIN);
			setState(46);
			_la = _input.LA(1);
			if (_la==EXTERNAL_SECTION_BEGIN) {
				{
				setState(45); externalSection();
				}
			}

			setState(49);
			_la = _input.LA(1);
			if (_la==VARIABLE_SECTION_BEGIN) {
				{
				setState(48); variableSection();
				}
			}

			setState(52);
			_la = _input.LA(1);
			if (_la==FUNCTION_SECTION_BEGIN) {
				{
				setState(51); functionSection();
				}
			}

			setState(54); mainSection();
			setState(55); match(MODULE_END);
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

	public static class ExternalSectionContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_SECTION_END() { return getToken(PascriptParser.EXTERNAL_SECTION_END, 0); }
		public List<ExternalFunctionDeclarationContext> externalFunctionDeclaration() {
			return getRuleContexts(ExternalFunctionDeclarationContext.class);
		}
		public ExternalFunctionDeclarationContext externalFunctionDeclaration(int i) {
			return getRuleContext(ExternalFunctionDeclarationContext.class,i);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
		public TerminalNode EXTERNAL_SECTION_BEGIN() { return getToken(PascriptParser.EXTERNAL_SECTION_BEGIN, 0); }
		public List<TerminalNode> END_STATEMENT() { return getTokens(PascriptParser.END_STATEMENT); }
		public ExternalSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterExternalSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitExternalSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitExternalSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalSectionContext externalSection() throws RecognitionException {
		ExternalSectionContext _localctx = new ExternalSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_externalSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(EXTERNAL_SECTION_BEGIN);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_DATATYPE) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(58); externalFunctionDeclaration();
				setState(59); match(END_STATEMENT);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(EXTERNAL_SECTION_END);
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

	public static class VariableSectionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_SECTION_BEGIN() { return getToken(PascriptParser.VARIABLE_SECTION_BEGIN, 0); }
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public TerminalNode VARIABLE_SECTION_END() { return getToken(PascriptParser.VARIABLE_SECTION_END, 0); }
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
		public List<TerminalNode> END_STATEMENT() { return getTokens(PascriptParser.END_STATEMENT); }
		public VariableSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterVariableSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitVariableSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitVariableSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableSectionContext variableSection() throws RecognitionException {
		VariableSectionContext _localctx = new VariableSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(VARIABLE_SECTION_BEGIN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(69); globalVariableDeclaration();
				setState(70); match(END_STATEMENT);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(VARIABLE_SECTION_END);
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

	public static class FunctionSectionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public TerminalNode FUNCTION_SECTION_END() { return getToken(PascriptParser.FUNCTION_SECTION_END, 0); }
		public TerminalNode FUNCTION_SECTION_BEGIN() { return getToken(PascriptParser.FUNCTION_SECTION_BEGIN, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFunctionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFunctionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFunctionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSectionContext functionSection() throws RecognitionException {
		FunctionSectionContext _localctx = new FunctionSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(FUNCTION_SECTION_BEGIN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_DATATYPE) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(80); functionDeclaration();
				setState(81); functionDefinition();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(FUNCTION_SECTION_END);
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

	public static class MainSectionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode MAIN_SECTION_END() { return getToken(PascriptParser.MAIN_SECTION_END, 0); }
		public TerminalNode MAIN_SECTION_BEGIN() { return getToken(PascriptParser.MAIN_SECTION_BEGIN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterMainSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitMainSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitMainSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSectionContext mainSection() throws RecognitionException {
		MainSectionContext _localctx = new MainSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(MAIN_SECTION_BEGIN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << DELETE) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(91); statement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(MAIN_SECTION_END);
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

	public static class ExternalFunctionDeclarationContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ReturnDataTypeContext returnDataType() {
			return getRuleContext(ReturnDataTypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ExternalFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterExternalFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitExternalFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitExternalFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalFunctionDeclarationContext externalFunctionDeclaration() throws RecognitionException {
		ExternalFunctionDeclarationContext _localctx = new ExternalFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_externalFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); returnDataType();
			setState(100); ((ExternalFunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(101); match(PAREN_OPEN);
			setState(103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(102); parameterList();
				}
			}

			setState(105); match(PAREN_CLOSE);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ReturnDataTypeContext returnDataType() {
			return getRuleContext(ReturnDataTypeContext.class,0);
		}
		public NamedParameterListContext namedParameterList() {
			return getRuleContext(NamedParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); returnDataType();
			setState(108); ((FunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(109); match(PAREN_OPEN);
			setState(111);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(110); namedParameterList();
				}
			}

			setState(113); match(PAREN_CLOSE);
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

	public static class ReturnDataTypeContext extends ParserRuleContext {
		public ReturnDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDataType; }
	 
		public ReturnDataTypeContext() { }
		public void copyFrom(ReturnDataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnValueDataTypeContext extends ReturnDataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnValueDataTypeContext(ReturnDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReturnValueDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReturnValueDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReturnValueDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnVoidDataTypeContext extends ReturnDataTypeContext {
		public TerminalNode VOID_DATATYPE() { return getToken(PascriptParser.VOID_DATATYPE, 0); }
		public ReturnVoidDataTypeContext(ReturnDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReturnVoidDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReturnVoidDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReturnVoidDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDataTypeContext returnDataType() throws RecognitionException {
		ReturnDataTypeContext _localctx = new ReturnDataTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnDataType);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
			case INTEGER_DATATYPE:
			case FLOAT_DATATYPE:
			case STRING_DATATYPE:
				_localctx = new ReturnValueDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115); dataType();
				}
				break;
			case VOID_DATATYPE:
				_localctx = new ReturnVoidDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(VOID_DATATYPE);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); blockStatement();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PascriptParser.COMMA); }
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PascriptParser.COMMA, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); dataType();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122); match(COMMA);
				setState(123); dataType();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NamedParameterListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascriptParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(PascriptParser.COMMA); }
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PascriptParser.COMMA, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public NamedParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterNamedParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitNamedParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitNamedParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParameterListContext namedParameterList() throws RecognitionException {
		NamedParameterListContext _localctx = new NamedParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); dataType();
			setState(130); match(IDENTIFIER);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131); match(COMMA);
				setState(132); dataType();
				setState(133); match(IDENTIFIER);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopContext extends StatementContext {
		public ExpressionContext condition;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PascriptParser.WHILE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext condition;
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(PascriptParser.IF, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode ELSE() { return getToken(PascriptParser.ELSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompositeStatementContext extends StatementContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public CompositeStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterCompositeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitCompositeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitCompositeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleStatementContext extends StatementContext {
		public BasicStatementContext basicStatement() {
			return getRuleContext(BasicStatementContext.class,0);
		}
		public TerminalNode END_STATEMENT() { return getToken(PascriptParser.END_STATEMENT, 0); }
		public SimpleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends StatementContext {
		public VariableDeclarationContext initializer;
		public ExpressionContext condition;
		public ExpressionContext step;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode FOR() { return getToken(PascriptParser.FOR, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<TerminalNode> END_STATEMENT() { return getTokens(PascriptParser.END_STATEMENT); }
		public ForLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileLoopContext extends StatementContext {
		public ExpressionContext condition;
		public TerminalNode WHILE() { return getToken(PascriptParser.WHILE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode DO() { return getToken(PascriptParser.DO, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STATEMENT() { return getToken(PascriptParser.END_STATEMENT, 0); }
		public DoWhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case CURLY_OPEN:
				_localctx = new CompositeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140); blockStatement();
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(IF);
				setState(142); match(PAREN_OPEN);
				setState(143); ((IfStatementContext)_localctx).condition = expression(0);
				setState(144); match(PAREN_CLOSE);
				setState(145); ((IfStatementContext)_localctx).trueStatement = statement();
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(146); match(ELSE);
					setState(147); ((IfStatementContext)_localctx).falseStatement = statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(WHILE);
				setState(151); match(PAREN_OPEN);
				setState(152); ((WhileLoopContext)_localctx).condition = expression(0);
				setState(153); match(PAREN_CLOSE);
				setState(154); statement();
				}
				break;
			case DO:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156); match(DO);
				setState(157); statement();
				setState(158); match(WHILE);
				setState(159); match(PAREN_OPEN);
				setState(160); ((DoWhileLoopContext)_localctx).condition = expression(0);
				setState(161); match(PAREN_CLOSE);
				setState(162); match(END_STATEMENT);
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164); match(FOR);
				setState(165); match(PAREN_OPEN);
				setState(166); ((ForLoopContext)_localctx).initializer = variableDeclaration();
				setState(167); match(END_STATEMENT);
				setState(168); ((ForLoopContext)_localctx).condition = expression(0);
				setState(169); match(END_STATEMENT);
				setState(170); ((ForLoopContext)_localctx).step = expression(0);
				setState(171); match(PAREN_CLOSE);
				setState(172); statement();
				}
				break;
			case PAREN_OPEN:
			case PRINT:
			case READ:
			case DELETE:
			case RETURN:
			case SUBTRACT:
			case NOT:
			case BOOLEAN_DATATYPE:
			case INTEGER_DATATYPE:
			case FLOAT_DATATYPE:
			case STRING_DATATYPE:
			case STRING:
			case FLOAT:
			case INTEGER:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				_localctx = new SimpleStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174); basicStatement();
				setState(175); match(END_STATEMENT);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CURLY_OPEN() { return getToken(PascriptParser.CURLY_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(PascriptParser.CURLY_CLOSE, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(CURLY_OPEN);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << DELETE) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(180); statement();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); match(CURLY_CLOSE);
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

	public static class BasicStatementContext extends ParserRuleContext {
		public BasicStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicStatement; }
	 
		public BasicStatementContext() { }
		public void copyFrom(BasicStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionStatementContext extends BasicStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteStatementContext extends BasicStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode DELETE() { return getToken(PascriptParser.DELETE, 0); }
		public DeleteStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends BasicStatementContext {
		public TerminalNode PRINT() { return getToken(PascriptParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnVoidStatementContext extends BasicStatementContext {
		public TerminalNode RETURN() { return getToken(PascriptParser.RETURN, 0); }
		public ReturnVoidStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReturnVoidStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReturnVoidStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReturnVoidStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationStatementContext extends BasicStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStatementContext extends BasicStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode READ() { return getToken(PascriptParser.READ, 0); }
		public ReadStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnValueStatementContext extends BasicStatementContext {
		public TerminalNode RETURN() { return getToken(PascriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnValueStatementContext(BasicStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReturnValueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReturnValueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReturnValueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicStatementContext basicStatement() throws RecognitionException {
		BasicStatementContext _localctx = new BasicStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_basicStatement);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188); variableDeclaration();
				}
				break;
			case 2:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(PRINT);
				setState(190); expression(0);
				}
				break;
			case 3:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(READ);
				setState(192); match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(DELETE);
				setState(194); match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new ReturnVoidStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(195); match(RETURN);
				}
				break;
			case 6:
				_localctx = new ReturnValueStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(196); match(RETURN);
				setState(197); expression(0);
				}
				break;
			case 7:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(198); expression(0);
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

	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
	 
		public GlobalVariableDeclarationContext() { }
		public void copyFrom(GlobalVariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignGlobalDeclarationContext extends GlobalVariableDeclarationContext {
		public TerminalNode ASSIGN() { return getToken(PascriptParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AssignGlobalDeclarationContext(GlobalVariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterAssignGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitAssignGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitAssignGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleGlobalDeclarationContext extends GlobalVariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SimpleGlobalDeclarationContext(GlobalVariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterSimpleGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitSimpleGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitSimpleGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_globalVariableDeclaration);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SimpleGlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201); dataType();
				setState(202); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AssignGlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204); dataType();
				setState(205); match(IDENTIFIER);
				setState(206); match(ASSIGN);
				setState(207); literal();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleDeclarationContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SimpleDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignDeclarationContext extends VariableDeclarationContext {
		public TerminalNode ASSIGN() { return getToken(PascriptParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AssignDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterAssignDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitAssignDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitAssignDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211); dataType();
				setState(212); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); dataType();
				setState(215); match(IDENTIFIER);
				setState(216); match(ASSIGN);
				setState(217); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOperationContext extends ExpressionContext {
		public Token operator;
		public TerminalNode NOT() { return getToken(PascriptParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(PascriptParser.SUBTRACT, 0); }
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode ASSIGN() { return getToken(PascriptParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableValueContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public VariableValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantValueContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterConstantValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitConstantValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitConstantValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public Token variableName;
		public Token methodName;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode DOT() { return getToken(PascriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascriptParser.IDENTIFIER); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public Token operator;
		public TerminalNode LESS_OR_EQUAL() { return getToken(PascriptParser.LESS_OR_EQUAL, 0); }
		public TerminalNode MODULO() { return getToken(PascriptParser.MODULO, 0); }
		public TerminalNode AND() { return getToken(PascriptParser.AND, 0); }
		public TerminalNode XOR() { return getToken(PascriptParser.XOR, 0); }
		public TerminalNode OR() { return getToken(PascriptParser.OR, 0); }
		public TerminalNode MULTIPLY() { return getToken(PascriptParser.MULTIPLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQUAL() { return getToken(PascriptParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PascriptParser.NOT_EQUAL, 0); }
		public TerminalNode DIVIDE() { return getToken(PascriptParser.DIVIDE, 0); }
		public TerminalNode ADD() { return getToken(PascriptParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_OR_EQUAL() { return getToken(PascriptParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(PascriptParser.LESS, 0); }
		public TerminalNode SUBTRACT() { return getToken(PascriptParser.SUBTRACT, 0); }
		public TerminalNode GREATER() { return getToken(PascriptParser.GREATER, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReAssignmentContext extends ExpressionContext {
		public Token operator;
		public TerminalNode INCREMENT() { return getToken(PascriptParser.INCREMENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode DECREMENT() { return getToken(PascriptParser.DECREMENT, 0); }
		public ReAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public Token functionName;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				((UnaryOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUBTRACT || _la==NOT) ) {
					((UnaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(223); expression(9);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224); match(IDENTIFIER);
				setState(225); match(ASSIGN);
				setState(226); expression(4);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); match(PAREN_OPEN);
				setState(228); expression(0);
				setState(229); match(PAREN_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); ((FunctionCallContext)_localctx).functionName = match(IDENTIFIER);
				setState(232); match(PAREN_OPEN);
				setState(234);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << SUBTRACT) | (1L << NOT) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(233); argumentList();
					}
				}

				setState(236); match(PAREN_CLOSE);
				}
				break;
			case 5:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); ((MethodCallContext)_localctx).variableName = match(IDENTIFIER);
				setState(238); match(DOT);
				setState(239); ((MethodCallContext)_localctx).methodName = match(IDENTIFIER);
				setState(240); match(PAREN_OPEN);
				setState(242);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << SUBTRACT) | (1L << NOT) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(241); argumentList();
					}
				}

				setState(244); match(PAREN_CLOSE);
				}
				break;
			case 6:
				{
				_localctx = new ReAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); match(IDENTIFIER);
				setState(246);
				((ReAssignmentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((ReAssignmentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 7:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(251);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(252);
					((BinaryOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << ADD) | (1L << SUBTRACT) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(253); expression(9);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascriptParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PascriptParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); expression(0);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260); match(COMMA);
				setState(261); expression(0);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DataTypeContext extends ParserRuleContext {
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ArrayDataTypeContext arrayDataType() {
			return getRuleContext(ArrayDataTypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataType);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); primitiveDataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); arrayDataType();
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

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
	 
		public PrimitiveDataTypeContext() { }
		public void copyFrom(PrimitiveDataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDataTypeContext extends PrimitiveDataTypeContext {
		public TerminalNode STRING_DATATYPE() { return getToken(PascriptParser.STRING_DATATYPE, 0); }
		public StringDataTypeContext(PrimitiveDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterStringDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitStringDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitStringDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDataTypeContext extends PrimitiveDataTypeContext {
		public TerminalNode BOOLEAN_DATATYPE() { return getToken(PascriptParser.BOOLEAN_DATATYPE, 0); }
		public BooleanDataTypeContext(PrimitiveDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterBooleanDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitBooleanDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitBooleanDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatDataTypeContext extends PrimitiveDataTypeContext {
		public TerminalNode FLOAT_DATATYPE() { return getToken(PascriptParser.FLOAT_DATATYPE, 0); }
		public FloatDataTypeContext(PrimitiveDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFloatDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFloatDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFloatDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerDataTypeContext extends PrimitiveDataTypeContext {
		public TerminalNode INTEGER_DATATYPE() { return getToken(PascriptParser.INTEGER_DATATYPE, 0); }
		public IntegerDataTypeContext(PrimitiveDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterIntegerDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitIntegerDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitIntegerDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveDataType);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(BOOLEAN_DATATYPE);
				}
				break;
			case INTEGER_DATATYPE:
				_localctx = new IntegerDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272); match(INTEGER_DATATYPE);
				}
				break;
			case FLOAT_DATATYPE:
				_localctx = new FloatDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273); match(FLOAT_DATATYPE);
				}
				break;
			case STRING_DATATYPE:
				_localctx = new StringDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274); match(STRING_DATATYPE);
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

	public static class ArrayDataTypeContext extends ParserRuleContext {
		public List<TerminalNode> SQUARE_CLOSE() { return getTokens(PascriptParser.SQUARE_CLOSE); }
		public List<TerminalNode> SQUARE_OPEN() { return getTokens(PascriptParser.SQUARE_OPEN); }
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public TerminalNode SQUARE_OPEN(int i) {
			return getToken(PascriptParser.SQUARE_OPEN, i);
		}
		public TerminalNode SQUARE_CLOSE(int i) {
			return getToken(PascriptParser.SQUARE_CLOSE, i);
		}
		public ArrayDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterArrayDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitArrayDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitArrayDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDataTypeContext arrayDataType() throws RecognitionException {
		ArrayDataTypeContext _localctx = new ArrayDataTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); primitiveDataType();
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278); match(SQUARE_OPEN);
				setState(279); match(SQUARE_CLOSE);
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SQUARE_OPEN );
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode STRING() { return getToken(PascriptParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(PascriptParser.INTEGER, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode FLOAT() { return getToken(PascriptParser.FLOAT, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(PascriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascriptParser.FALSE, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			setState(288);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((BooleanLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case INTEGER:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285); ((IntegerLiteralContext)_localctx).value = match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286); ((FloatLiteralContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(287); ((StringLiteralContext)_localctx).value = match(STRING);
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
		case 16: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\2\5\2\64\n\2\3\2\5\2\67\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\6\3\6\7\6_\n\6\f\6"+
		"\16\6b\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\br\n\b\3\b\3\b\3\t\3\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\13\7\13\177\n\13"+
		"\f\13\16\13\u0082\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f"+
		"\u008d\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3\16\3\16\7\16\u00b8\n\16\f\16"+
		"\16\16\u00bb\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00ca\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00de\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00ed\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f5\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00fc\n\22\3\22\3\22\3\22\7\22\u0101\n\22\f\22\16"+
		"\22\u0104\13\22\3\23\3\23\3\23\7\23\u0109\n\23\f\23\16\23\u010c\13\23"+
		"\3\24\3\24\5\24\u0110\n\24\3\25\3\25\3\25\3\25\5\25\u0116\n\25\3\26\3"+
		"\26\3\26\6\26\u011b\n\26\r\26\16\26\u011c\3\27\3\27\3\27\3\27\5\27\u0123"+
		"\n\27\3\27\2\3\"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6"+
		"\4\2))--\3\2&\'\5\2#%(,.\63\3\2=>\u013c\2.\3\2\2\2\4;\3\2\2\2\6F\3\2\2"+
		"\2\bQ\3\2\2\2\n\\\3\2\2\2\fe\3\2\2\2\16m\3\2\2\2\20w\3\2\2\2\22y\3\2\2"+
		"\2\24{\3\2\2\2\26\u0083\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3\2\2\2\34\u00c9"+
		"\3\2\2\2\36\u00d3\3\2\2\2 \u00dd\3\2\2\2\"\u00fb\3\2\2\2$\u0105\3\2\2"+
		"\2&\u010f\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0122\3\2\2\2.\60\7\7"+
		"\2\2/\61\5\4\3\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\64\5\6\4\2"+
		"\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2"+
		"\66\67\3\2\2\2\678\3\2\2\289\5\n\6\29:\7\b\2\2:\3\3\2\2\2;A\7\t\2\2<="+
		"\5\f\7\2=>\7\23\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"BD\3\2\2\2CA\3\2\2\2DE\7\n\2\2E\5\3\2\2\2FL\7\13\2\2GH\5\36\20\2HI\7\23"+
		"\2\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2"+
		"\2\2OP\7\f\2\2P\7\3\2\2\2QW\7\r\2\2RS\5\16\b\2ST\5\22\n\2TV\3\2\2\2UR"+
		"\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\16\2\2"+
		"[\t\3\2\2\2\\`\7\17\2\2]_\5\30\r\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ac\3\2\2\2b`\3\2\2\2cd\7\20\2\2d\13\3\2\2\2ef\5\20\t\2fg\7?\2\2gi"+
		"\7\24\2\2hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\25\2\2l\r\3\2"+
		"\2\2mn\5\20\t\2no\7?\2\2oq\7\24\2\2pr\5\26\f\2qp\3\2\2\2qr\3\2\2\2rs\3"+
		"\2\2\2st\7\25\2\2t\17\3\2\2\2ux\5&\24\2vx\7\65\2\2wu\3\2\2\2wv\3\2\2\2"+
		"x\21\3\2\2\2yz\5\32\16\2z\23\3\2\2\2{\u0080\5&\24\2|}\7\21\2\2}\177\5"+
		"&\24\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\25\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5&\24\2\u0084\u008b"+
		"\7?\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5&\24\2\u0087\u0088\7?\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u00b4"+
		"\5\32\16\2\u008f\u0090\7\36\2\2\u0090\u0091\7\24\2\2\u0091\u0092\5\"\22"+
		"\2\u0092\u0093\7\25\2\2\u0093\u0096\5\30\r\2\u0094\u0095\7\37\2\2\u0095"+
		"\u0097\5\30\r\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00b4\3"+
		"\2\2\2\u0098\u0099\7 \2\2\u0099\u009a\7\24\2\2\u009a\u009b\5\"\22\2\u009b"+
		"\u009c\7\25\2\2\u009c\u009d\5\30\r\2\u009d\u00b4\3\2\2\2\u009e\u009f\7"+
		"!\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7 \2\2\u00a1\u00a2\7\24\2\2\u00a2"+
		"\u00a3\5\"\22\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00b4"+
		"\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\5 \21\2"+
		"\u00a9\u00aa\7\23\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\u00ad\5\"\22\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\5\30\r\2\u00af\u00b4"+
		"\3\2\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\23\2\2\u00b2\u00b4\3\2\2"+
		"\2\u00b3\u008e\3\2\2\2\u00b3\u008f\3\2\2\2\u00b3\u0098\3\2\2\2\u00b3\u009e"+
		"\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\31\3\2\2\2\u00b5"+
		"\u00b9\7\30\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\31\2\2\u00bd\33\3\2\2\2\u00be\u00ca\5 \21"+
		"\2\u00bf\u00c0\7\32\2\2\u00c0\u00ca\5\"\22\2\u00c1\u00c2\7\33\2\2\u00c2"+
		"\u00ca\7?\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00ca\7?\2\2\u00c5\u00ca\7\35"+
		"\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00ca\5\"\22\2\u00c8\u00ca\5\"\22\2\u00c9"+
		"\u00be\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\35\3\2\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\7?\2\2\u00cd\u00d4\3\2\2\2"+
		"\u00ce\u00cf\5&\24\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7\64\2\2\u00d1\u00d2"+
		"\5,\27\2\u00d2\u00d4\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4"+
		"\37\3\2\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7?\2\2\u00d7\u00de\3\2\2\2"+
		"\u00d8\u00d9\5&\24\2\u00d9\u00da\7?\2\2\u00da\u00db\7\64\2\2\u00db\u00dc"+
		"\5\"\22\2\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d8\3\2\2\2"+
		"\u00de!\3\2\2\2\u00df\u00e0\b\22\1\2\u00e0\u00e1\t\2\2\2\u00e1\u00fc\5"+
		"\"\22\13\u00e2\u00e3\7?\2\2\u00e3\u00e4\7\64\2\2\u00e4\u00fc\5\"\22\6"+
		"\u00e5\u00e6\7\24\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\7\25\2\2\u00e8"+
		"\u00fc\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00ec\7\24\2\2\u00eb\u00ed\5$"+
		"\23\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00fc\7\25\2\2\u00ef\u00f0\7?\2\2\u00f0\u00f1\7\22\2\2\u00f1\u00f2\7"+
		"?\2\2\u00f2\u00f4\7\24\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fc\7\25\2\2\u00f7\u00f8\7"+
		"?\2\2\u00f8\u00fc\t\3\2\2\u00f9\u00fc\7?\2\2\u00fa\u00fc\5,\27\2\u00fb"+
		"\u00df\3\2\2\2\u00fb\u00e2\3\2\2\2\u00fb\u00e5\3\2\2\2\u00fb\u00e9\3\2"+
		"\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\f\n\2\2\u00fe\u00ff\t\4"+
		"\2\2\u00ff\u0101\5\"\22\13\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u010a\5\"\22\2\u0106\u0107\7\21\2\2\u0107\u0109\5\"\22\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b%\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0110\5(\25\2\u010e\u0110"+
		"\5*\26\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\'\3\2\2\2\u0111"+
		"\u0116\7\66\2\2\u0112\u0116\7\67\2\2\u0113\u0116\78\2\2\u0114\u0116\7"+
		"9\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116)\3\2\2\2\u0117\u011a\5(\25\2\u0118\u0119\7\26\2\2"+
		"\u0119\u011b\7\27\2\2\u011a\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u0123\t\5\2\2\u011f"+
		"\u0123\7<\2\2\u0120\u0123\7;\2\2\u0121\u0123\7:\2\2\u0122\u011e\3\2\2"+
		"\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123-"+
		"\3\2\2\2\35\60\63\66ALW`iqw\u0080\u008b\u0096\u00b3\u00b9\u00c9\u00d3"+
		"\u00dd\u00ec\u00f4\u00fb\u0102\u010a\u010f\u0115\u011c\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}