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
		MAIN_SECTION_BEGIN=13, MAIN_SECTION_END=14, QUOTES=15, COMMA=16, DOT=17, 
		PAIR_DELIMITER=18, END_STATEMENT=19, PAREN_OPEN=20, PAREN_CLOSE=21, SQUARE_OPEN=22, 
		SQUARE_CLOSE=23, ANGLE_OPEN=24, ANGLE_CLOSE=25, CURLY_OPEN=26, CURLY_CLOSE=27, 
		PRINT=28, READ=29, DELETE=30, RETURN=31, IF=32, ELSE=33, WHILE=34, DO=35, 
		FOR=36, POWER=37, MULTIPLY=38, DIVIDE=39, MODULO=40, INCREMENT=41, DECREMENT=42, 
		ADD=43, SUBTRACT=44, SHIFT_LEFT=45, SHIFT_RIGHT=46, AND=47, OR=48, XOR=49, 
		NOT=50, LESS_OR_EQUAL=51, GREATER_OR_EQUAL=52, LESS=53, GREATER=54, EQUAL=55, 
		NOT_EQUAL=56, ASSIGN=57, VOID_DATATYPE=58, BOOLEAN_DATATYPE=59, INTEGER_DATATYPE=60, 
		FLOAT_DATATYPE=61, STRING_DATATYPE=62, FLOAT=63, INTEGER=64, TRUE=65, 
		FALSE=66, IDENTIFIER=67;
	public static final String[] tokenNames = {
		"<INVALID>", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WHITESPACE", 
		"'<module>'", "'</module>'", "'<external>'", "'</external>'", "'<variable>'", 
		"'</variable>'", "'<function>'", "'</function>'", "'<main>'", "'</main>'", 
		"'\"'", "','", "'.'", "':'", "';'", "'('", "')'", "'['", "']'", "ANGLE_OPEN", 
		"ANGLE_CLOSE", "'{'", "'}'", "'<-'", "'->'", "'delete'", "'return'", "'if'", 
		"'else'", "'while'", "'do'", "'for'", "'**'", "'*'", "'/'", "'%'", "'++'", 
		"'--'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'^'", "'!'", "'<='", 
		"'>='", "LESS", "GREATER", "'=='", "'!='", "'='", "'void'", "'bool'", 
		"'int'", "'float'", "'string'", "FLOAT", "INTEGER", "'true'", "'false'", 
		"IDENTIFIER"
	};
	public static final int
		RULE_module = 0, RULE_externalSection = 1, RULE_variableSection = 2, RULE_functionSection = 3, 
		RULE_mainSection = 4, RULE_externalFunctionDeclaration = 5, RULE_functionDeclaration = 6, 
		RULE_returnDataType = 7, RULE_functionDefinition = 8, RULE_parameterList = 9, 
		RULE_namedParameterList = 10, RULE_argumentList = 11, RULE_statement = 12, 
		RULE_blockStatement = 13, RULE_ifStatement = 14, RULE_whileLoop = 15, 
		RULE_doWhileLoop = 16, RULE_forLoop = 17, RULE_simpleStatement = 18, RULE_globalVariableDeclaration = 19, 
		RULE_variableDeclaration = 20, RULE_expression = 21, RULE_dataType = 22, 
		RULE_primitiveDataType = 23, RULE_containerDataType = 24, RULE_literal = 25, 
		RULE_primitiveLiteral = 26, RULE_containerLiteral = 27;
	public static final String[] ruleNames = {
		"module", "externalSection", "variableSection", "functionSection", "mainSection", 
		"externalFunctionDeclaration", "functionDeclaration", "returnDataType", 
		"functionDefinition", "parameterList", "namedParameterList", "argumentList", 
		"statement", "blockStatement", "ifStatement", "whileLoop", "doWhileLoop", 
		"forLoop", "simpleStatement", "globalVariableDeclaration", "variableDeclaration", 
		"expression", "dataType", "primitiveDataType", "containerDataType", "literal", 
		"primitiveLiteral", "containerLiteral"
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
			setState(56); match(MODULE_BEGIN);
			setState(58);
			_la = _input.LA(1);
			if (_la==EXTERNAL_SECTION_BEGIN) {
				{
				setState(57); externalSection();
				}
			}

			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(60); variableSection();
				}
				break;
			}
			setState(64);
			_la = _input.LA(1);
			if (_la==VARIABLE_SECTION_BEGIN) {
				{
				setState(63); functionSection();
				}
			}

			setState(66); mainSection();
			setState(67); match(MODULE_END);
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
			setState(69); match(EXTERNAL_SECTION_BEGIN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_DATATYPE) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(70); externalFunctionDeclaration();
				setState(71); match(END_STATEMENT);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(EXTERNAL_SECTION_END);
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
			setState(80); match(VARIABLE_SECTION_BEGIN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(81); globalVariableDeclaration();
				setState(82); match(END_STATEMENT);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(VARIABLE_SECTION_END);
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
		public TerminalNode VARIABLE_SECTION_BEGIN() { return getToken(PascriptParser.VARIABLE_SECTION_BEGIN, 0); }
		public TerminalNode VARIABLE_SECTION_END() { return getToken(PascriptParser.VARIABLE_SECTION_END, 0); }
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
			setState(91); match(VARIABLE_SECTION_BEGIN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_DATATYPE) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(92); functionDeclaration();
				setState(93); functionDefinition();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(VARIABLE_SECTION_END);
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
			setState(102); match(MAIN_SECTION_BEGIN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (QUOTES - 15)) | (1L << (PAREN_OPEN - 15)) | (1L << (SQUARE_OPEN - 15)) | (1L << (CURLY_OPEN - 15)) | (1L << (PRINT - 15)) | (1L << (READ - 15)) | (1L << (DELETE - 15)) | (1L << (RETURN - 15)) | (1L << (IF - 15)) | (1L << (WHILE - 15)) | (1L << (DO - 15)) | (1L << (FOR - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NOT - 15)) | (1L << (BOOLEAN_DATATYPE - 15)) | (1L << (INTEGER_DATATYPE - 15)) | (1L << (FLOAT_DATATYPE - 15)) | (1L << (STRING_DATATYPE - 15)) | (1L << (FLOAT - 15)) | (1L << (INTEGER - 15)) | (1L << (TRUE - 15)) | (1L << (FALSE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				{
				setState(103); statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(MAIN_SECTION_END);
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
			setState(111); returnDataType();
			setState(112); ((ExternalFunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(113); match(PAREN_OPEN);
			setState(115);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(114); parameterList();
				}
			}

			setState(117); match(PAREN_CLOSE);
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
			setState(119); returnDataType();
			setState(120); ((FunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(121); match(PAREN_OPEN);
			setState(123);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(122); namedParameterList();
				}
			}

			setState(125); match(PAREN_CLOSE);
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
			setState(129);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
			case INTEGER_DATATYPE:
			case FLOAT_DATATYPE:
			case STRING_DATATYPE:
				_localctx = new ReturnValueDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); dataType();
				}
				break;
			case VOID_DATATYPE:
				_localctx = new ReturnVoidDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(VOID_DATATYPE);
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
			setState(131); blockStatement();
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
			setState(133); dataType();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134); match(COMMA);
				setState(135); dataType();
				}
				}
				setState(140);
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
			setState(141); dataType();
			setState(142); match(IDENTIFIER);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143); match(COMMA);
				setState(144); dataType();
				setState(145); match(IDENTIFIER);
				}
				}
				setState(151);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascriptParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(PascriptParser.COMMA); }
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
		enterRule(_localctx, 22, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153); match(COMMA);
				setState(154); match(IDENTIFIER);
				}
				}
				setState(159);
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode END_STATEMENT() { return getToken(PascriptParser.END_STATEMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case CURLY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); blockStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); whileLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); doWhileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(164); forLoop();
				}
				break;
			case QUOTES:
			case PAREN_OPEN:
			case SQUARE_OPEN:
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
			case FLOAT:
			case INTEGER:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(165); simpleStatement();
				setState(166); match(END_STATEMENT);
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
		enterRule(_localctx, 26, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(CURLY_OPEN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (QUOTES - 15)) | (1L << (PAREN_OPEN - 15)) | (1L << (SQUARE_OPEN - 15)) | (1L << (CURLY_OPEN - 15)) | (1L << (PRINT - 15)) | (1L << (READ - 15)) | (1L << (DELETE - 15)) | (1L << (RETURN - 15)) | (1L << (IF - 15)) | (1L << (WHILE - 15)) | (1L << (DO - 15)) | (1L << (FOR - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NOT - 15)) | (1L << (BOOLEAN_DATATYPE - 15)) | (1L << (INTEGER_DATATYPE - 15)) | (1L << (FLOAT_DATATYPE - 15)) | (1L << (STRING_DATATYPE - 15)) | (1L << (FLOAT - 15)) | (1L << (INTEGER - 15)) | (1L << (TRUE - 15)) | (1L << (FALSE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				{
				setState(171); statement();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(CURLY_CLOSE);
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

	public static class IfStatementContext extends ParserRuleContext {
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
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

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(IF);
			setState(180); match(PAREN_OPEN);
			setState(181); ((IfStatementContext)_localctx).condition = expression(0);
			setState(182); match(PAREN_CLOSE);
			setState(183); ((IfStatementContext)_localctx).trueStatement = statement();
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(184); match(ELSE);
				setState(185); ((IfStatementContext)_localctx).falseStatement = statement();
				}
				break;
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

	public static class WhileLoopContext extends ParserRuleContext {
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
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
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

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(WHILE);
			setState(189); match(PAREN_OPEN);
			setState(190); ((WhileLoopContext)_localctx).condition = expression(0);
			setState(191); match(PAREN_CLOSE);
			setState(192); statement();
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

	public static class DoWhileLoopContext extends ParserRuleContext {
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
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
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

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(DO);
			setState(195); statement();
			setState(196); match(WHILE);
			setState(197); match(PAREN_OPEN);
			setState(198); ((DoWhileLoopContext)_localctx).condition = expression(0);
			setState(199); match(PAREN_CLOSE);
			setState(200); match(END_STATEMENT);
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

	public static class ForLoopContext extends ParserRuleContext {
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
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
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

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(FOR);
			setState(203); match(PAREN_OPEN);
			setState(204); ((ForLoopContext)_localctx).initializer = variableDeclaration();
			setState(205); match(END_STATEMENT);
			setState(206); ((ForLoopContext)_localctx).condition = expression(0);
			setState(207); match(END_STATEMENT);
			setState(208); ((ForLoopContext)_localctx).step = expression(0);
			setState(209); match(PAREN_CLOSE);
			setState(210); statement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	 
		public SimpleStatementContext() { }
		public void copyFrom(SimpleStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionStatementContext extends SimpleStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class DeleteStatementContext extends SimpleStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode DELETE() { return getToken(PascriptParser.DELETE, 0); }
		public DeleteStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class PrintStatementContext extends SimpleStatementContext {
		public TerminalNode PRINT() { return getToken(PascriptParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class ReturnVoidStatementContext extends SimpleStatementContext {
		public TerminalNode RETURN() { return getToken(PascriptParser.RETURN, 0); }
		public ReturnVoidStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class DeclarationStatementContext extends SimpleStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class ReadStatementContext extends SimpleStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode READ() { return getToken(PascriptParser.READ, 0); }
		public ReadStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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
	public static class ReturnValueStatementContext extends SimpleStatementContext {
		public TerminalNode RETURN() { return getToken(PascriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnValueStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
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

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleStatement);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212); variableDeclaration();
				}
				break;
			case 2:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213); match(PRINT);
				setState(214); expression(0);
				}
				break;
			case 3:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215); match(READ);
				setState(216); match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217); match(DELETE);
				setState(218); match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new ReturnVoidStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219); match(RETURN);
				}
				break;
			case 6:
				_localctx = new ReturnValueStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(220); match(RETURN);
				setState(221); expression(0);
				}
				break;
			case 7:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222); expression(0);
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
		enterRule(_localctx, 38, RULE_globalVariableDeclaration);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SimpleGlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225); dataType();
				setState(226); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AssignGlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228); dataType();
				setState(229); match(IDENTIFIER);
				setState(230); match(ASSIGN);
				setState(231); literal();
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
		enterRule(_localctx, 40, RULE_variableDeclaration);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235); dataType();
				setState(236); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238); dataType();
				setState(239); match(IDENTIFIER);
				setState(240); match(ASSIGN);
				setState(241); expression(0);
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
	public static class PowerBinaryOperationContext extends ExpressionContext {
		public Token operator;
		public TerminalNode POWER() { return getToken(PascriptParser.POWER, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PowerBinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterPowerBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitPowerBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitPowerBinaryOperation(this);
			else return visitor.visitChildren(this);
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
	public static class AssignemntContext extends ExpressionContext {
		public TerminalNode ASSIGN() { return getToken(PascriptParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignemntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterAssignemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitAssignemnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitAssignemnt(this);
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
		public TerminalNode SHIFT_LEFT() { return getToken(PascriptParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(PascriptParser.SHIFT_RIGHT, 0); }
		public TerminalNode GREATER() { return getToken(PascriptParser.GREATER, 0); }
		public TerminalNode SUBTRACT() { return getToken(PascriptParser.SUBTRACT, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(246);
				((UnaryOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUBTRACT || _la==NOT) ) {
					((UnaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(247); expression(10);
				}
				break;
			case 2:
				{
				_localctx = new AssignemntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); match(IDENTIFIER);
				setState(249); match(ASSIGN);
				setState(250); expression(4);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(PAREN_OPEN);
				setState(252); expression(0);
				setState(253); match(PAREN_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); ((FunctionCallContext)_localctx).functionName = match(IDENTIFIER);
				setState(256); match(PAREN_OPEN);
				setState(258);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(257); argumentList();
					}
				}

				setState(260); match(PAREN_CLOSE);
				}
				break;
			case 5:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); ((MethodCallContext)_localctx).variableName = match(IDENTIFIER);
				setState(262); match(DOT);
				setState(263); ((MethodCallContext)_localctx).methodName = match(IDENTIFIER);
				setState(264); match(PAREN_OPEN);
				setState(266);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(265); argumentList();
					}
				}

				setState(268); match(PAREN_CLOSE);
				}
				break;
			case 6:
				{
				_localctx = new ReAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); match(IDENTIFIER);
				setState(270);
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
				setState(271); match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowerBinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(276); ((PowerBinaryOperationContext)_localctx).operator = match(POWER);
						setState(277); expression(10);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(279);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << ADD) | (1L << SUBTRACT) | (1L << SHIFT_LEFT) | (1L << SHIFT_RIGHT) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(280); expression(9);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class DataTypeContext extends ParserRuleContext {
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ContainerDataTypeContext containerDataType() {
			return getRuleContext(ContainerDataTypeContext.class,0);
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
		enterRule(_localctx, 44, RULE_dataType);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); primitiveDataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); containerDataType();
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
		enterRule(_localctx, 46, RULE_primitiveDataType);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(BOOLEAN_DATATYPE);
				}
				break;
			case INTEGER_DATATYPE:
				_localctx = new IntegerDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(INTEGER_DATATYPE);
				}
				break;
			case FLOAT_DATATYPE:
				_localctx = new FloatDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292); match(FLOAT_DATATYPE);
				}
				break;
			case STRING_DATATYPE:
				_localctx = new StringDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293); match(STRING_DATATYPE);
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

	public static class ContainerDataTypeContext extends ParserRuleContext {
		public ContainerDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDataType; }
	 
		public ContainerDataTypeContext() { }
		public void copyFrom(ContainerDataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDataTypeContext extends ContainerDataTypeContext {
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
		public ArrayDataTypeContext(ContainerDataTypeContext ctx) { copyFrom(ctx); }
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

	public final ContainerDataTypeContext containerDataType() throws RecognitionException {
		ContainerDataTypeContext _localctx = new ContainerDataTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_containerDataType);
		int _la;
		try {
			_localctx = new ArrayDataTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(296); primitiveDataType();
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297); match(SQUARE_OPEN);
				setState(298); match(SQUARE_CLOSE);
				}
				}
				setState(301); 
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
		public PrimitiveLiteralContext primitiveLiteral() {
			return getRuleContext(PrimitiveLiteralContext.class,0);
		}
		public ContainerLiteralContext containerLiteral() {
			return getRuleContext(ContainerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case QUOTES:
			case FLOAT:
			case INTEGER:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); primitiveLiteral();
				}
				break;
			case SQUARE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); containerLiteral();
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

	public static class PrimitiveLiteralContext extends ParserRuleContext {
		public PrimitiveLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveLiteral; }
	 
		public PrimitiveLiteralContext() { }
		public void copyFrom(PrimitiveLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends PrimitiveLiteralContext {
		public Token value;
		public TerminalNode QUOTES(int i) {
			return getToken(PascriptParser.QUOTES, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(PascriptParser.QUOTES); }
		public StringLiteralContext(PrimitiveLiteralContext ctx) { copyFrom(ctx); }
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
	public static class IntegerLiteralContext extends PrimitiveLiteralContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(PascriptParser.INTEGER, 0); }
		public IntegerLiteralContext(PrimitiveLiteralContext ctx) { copyFrom(ctx); }
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
	public static class FloatLiteralContext extends PrimitiveLiteralContext {
		public Token value;
		public TerminalNode FLOAT() { return getToken(PascriptParser.FLOAT, 0); }
		public FloatLiteralContext(PrimitiveLiteralContext ctx) { copyFrom(ctx); }
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
	public static class BooleanLiteralContext extends PrimitiveLiteralContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(PascriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascriptParser.FALSE, 0); }
		public BooleanLiteralContext(PrimitiveLiteralContext ctx) { copyFrom(ctx); }
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

	public final PrimitiveLiteralContext primitiveLiteral() throws RecognitionException {
		PrimitiveLiteralContext _localctx = new PrimitiveLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveLiteral);
		int _la;
		try {
			int _alt;
			setState(318);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
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
				setState(308); ((IntegerLiteralContext)_localctx).value = match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309); ((FloatLiteralContext)_localctx).value = match(FLOAT);
				}
				break;
			case QUOTES:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310); match(QUOTES);
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(311);
						((StringLiteralContext)_localctx).value = matchWildcard();
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(317); match(QUOTES);
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

	public static class ContainerLiteralContext extends ParserRuleContext {
		public ContainerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerLiteral; }
	 
		public ContainerLiteralContext() { }
		public void copyFrom(ContainerLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListLiteralContext extends ContainerLiteralContext {
		public TerminalNode SQUARE_CLOSE() { return getToken(PascriptParser.SQUARE_CLOSE, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(PascriptParser.SQUARE_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascriptParser.COMMA); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PascriptParser.COMMA, i);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ListLiteralContext(ContainerLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerLiteralContext containerLiteral() throws RecognitionException {
		ContainerLiteralContext _localctx = new ContainerLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_containerLiteral);
		int _la;
		try {
			_localctx = new ListLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(SQUARE_OPEN);
			setState(329);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (QUOTES - 15)) | (1L << (SQUARE_OPEN - 15)) | (1L << (FLOAT - 15)) | (1L << (INTEGER - 15)) | (1L << (TRUE - 15)) | (1L << (FALSE - 15)))) != 0)) {
				{
				setState(321); literal();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322); match(COMMA);
					setState(323); literal();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331); match(SQUARE_CLOSE);
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
		case 21: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);
		case 1: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\5\2@\n\2"+
		"\3\2\5\2C\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7v\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\t"+
		"\3\t\5\t\u0084\n\t\3\n\3\n\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3"+
		"\r\3\r\7\r\u009e\n\r\f\r\16\r\u00a1\13\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00ab\n\16\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e2\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00ec\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00f6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0105\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0114\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27\3\30\3\30\5\30\u0123\n\30"+
		"\3\31\3\31\3\31\3\31\5\31\u0129\n\31\3\32\3\32\3\32\6\32\u012e\n\32\r"+
		"\32\16\32\u012f\3\33\3\33\5\33\u0134\n\33\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u013b\n\34\f\34\16\34\u013e\13\34\3\34\5\34\u0141\n\34\3\35\3\35\3\35"+
		"\3\35\7\35\u0147\n\35\f\35\16\35\u014a\13\35\5\35\u014c\n\35\3\35\3\35"+
		"\3\35\3\u013c\3,\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668\2\6\4\2..\64\64\3\2+,\5\2(*-\63\65:\3\2CD\u0166\2:\3\2\2\2"+
		"\4G\3\2\2\2\6R\3\2\2\2\b]\3\2\2\2\nh\3\2\2\2\fq\3\2\2\2\16y\3\2\2\2\20"+
		"\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008f\3\2\2\2\30\u009a"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00b5\3\2\2\2 \u00be\3\2"+
		"\2\2\"\u00c4\3\2\2\2$\u00cc\3\2\2\2&\u00e1\3\2\2\2(\u00eb\3\2\2\2*\u00f5"+
		"\3\2\2\2,\u0113\3\2\2\2.\u0122\3\2\2\2\60\u0128\3\2\2\2\62\u012a\3\2\2"+
		"\2\64\u0133\3\2\2\2\66\u0140\3\2\2\28\u0142\3\2\2\2:<\7\7\2\2;=\5\4\3"+
		"\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5\6\4\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2"+
		"\2AC\5\b\5\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\n\6\2EF\7\b\2\2F\3\3\2"+
		"\2\2GM\7\t\2\2HI\5\f\7\2IJ\7\25\2\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\n\2\2Q\5\3\2\2\2RX\7\13\2\2S"+
		"T\5(\25\2TU\7\25\2\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\7\f\2\2\\\7\3\2\2\2]c\7\13\2\2^_\5\16\b\2_`\5"+
		"\22\n\2`b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec"+
		"\3\2\2\2fg\7\f\2\2g\t\3\2\2\2hl\7\17\2\2ik\5\32\16\2ji\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\20\2\2p\13\3\2\2\2qr\5"+
		"\20\t\2rs\7E\2\2su\7\26\2\2tv\5\24\13\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2"+
		"wx\7\27\2\2x\r\3\2\2\2yz\5\20\t\2z{\7E\2\2{}\7\26\2\2|~\5\26\f\2}|\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\27\2\2\u0080\17\3\2\2\2\u0081"+
		"\u0084\5.\30\2\u0082\u0084\7<\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\21\3\2\2\2\u0085\u0086\5\34\17\2\u0086\23\3\2\2\2\u0087\u008c"+
		"\5.\30\2\u0088\u0089\7\22\2\2\u0089\u008b\5.\30\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5.\30\2\u0090\u0097\7E\2\2\u0091"+
		"\u0092\7\22\2\2\u0092\u0093\5.\30\2\u0093\u0094\7E\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\7E\2\2"+
		"\u009b\u009c\7\22\2\2\u009c\u009e\7E\2\2\u009d\u009b\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\31\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00ab\5\34\17\2\u00a3\u00ab\5\36\20\2\u00a4\u00ab"+
		"\5 \21\2\u00a5\u00ab\5\"\22\2\u00a6\u00ab\5$\23\2\u00a7\u00a8\5&\24\2"+
		"\u00a8\u00a9\7\25\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3"+
		"\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00b0\7\34\2\2\u00ad\u00af\5\32"+
		"\16\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\35"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8"+
		"\5,\27\2\u00b8\u00b9\7\27\2\2\u00b9\u00bc\5\32\16\2\u00ba\u00bb\7#\2\2"+
		"\u00bb\u00bd\5\32\16\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\37"+
		"\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5,\27\2\u00c1"+
		"\u00c2\7\27\2\2\u00c2\u00c3\5\32\16\2\u00c3!\3\2\2\2\u00c4\u00c5\7%\2"+
		"\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7\26\2\2\u00c8"+
		"\u00c9\5,\27\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\7\25\2\2\u00cb#\3\2\2"+
		"\2\u00cc\u00cd\7&\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0"+
		"\7\25\2\2\u00d0\u00d1\5,\27\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\5,\27\2"+
		"\u00d3\u00d4\7\27\2\2\u00d4\u00d5\5\32\16\2\u00d5%\3\2\2\2\u00d6\u00e2"+
		"\5*\26\2\u00d7\u00d8\7\36\2\2\u00d8\u00e2\5,\27\2\u00d9\u00da\7\37\2\2"+
		"\u00da\u00e2\7E\2\2\u00db\u00dc\7 \2\2\u00dc\u00e2\7E\2\2\u00dd\u00e2"+
		"\7!\2\2\u00de\u00df\7!\2\2\u00df\u00e2\5,\27\2\u00e0\u00e2\5,\27\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2"+
		"\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\'\3\2\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\7E\2\2\u00e5\u00ec\3\2\2\2"+
		"\u00e6\u00e7\5.\30\2\u00e7\u00e8\7E\2\2\u00e8\u00e9\7;\2\2\u00e9\u00ea"+
		"\5\64\33\2\u00ea\u00ec\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e6\3\2\2\2"+
		"\u00ec)\3\2\2\2\u00ed\u00ee\5.\30\2\u00ee\u00ef\7E\2\2\u00ef\u00f6\3\2"+
		"\2\2\u00f0\u00f1\5.\30\2\u00f1\u00f2\7E\2\2\u00f2\u00f3\7;\2\2\u00f3\u00f4"+
		"\5,\27\2\u00f4\u00f6\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6"+
		"+\3\2\2\2\u00f7\u00f8\b\27\1\2\u00f8\u00f9\t\2\2\2\u00f9\u0114\5,\27\f"+
		"\u00fa\u00fb\7E\2\2\u00fb\u00fc\7;\2\2\u00fc\u0114\5,\27\6\u00fd\u00fe"+
		"\7\26\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100\7\27\2\2\u0100\u0114\3\2\2\2"+
		"\u0101\u0102\7E\2\2\u0102\u0104\7\26\2\2\u0103\u0105\5\30\r\2\u0104\u0103"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0114\7\27\2\2"+
		"\u0107\u0108\7E\2\2\u0108\u0109\7\23\2\2\u0109\u010a\7E\2\2\u010a\u010c"+
		"\7\26\2\2\u010b\u010d\5\30\r\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u0114\7\27\2\2\u010f\u0110\7E\2\2\u0110\u0114"+
		"\t\3\2\2\u0111\u0114\7E\2\2\u0112\u0114\5\64\33\2\u0113\u00f7\3\2\2\2"+
		"\u0113\u00fa\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u0101\3\2\2\2\u0113\u0107"+
		"\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u011d\3\2\2\2\u0115\u0116\f\13\2\2\u0116\u0117\7\'\2\2\u0117\u011c\5"+
		",\27\f\u0118\u0119\f\n\2\2\u0119\u011a\t\4\2\2\u011a\u011c\5,\27\13\u011b"+
		"\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e-\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0123"+
		"\5\60\31\2\u0121\u0123\5\62\32\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2"+
		"\2\u0123/\3\2\2\2\u0124\u0129\7=\2\2\u0125\u0129\7>\2\2\u0126\u0129\7"+
		"?\2\2\u0127\u0129\7@\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\61\3\2\2\2\u012a\u012d\5\60\31"+
		"\2\u012b\u012c\7\30\2\2\u012c\u012e\7\31\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\63\3\2\2"+
		"\2\u0131\u0134\5\66\34\2\u0132\u0134\58\35\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\65\3\2\2\2\u0135\u0141\t\5\2\2\u0136\u0141\7B\2\2"+
		"\u0137\u0141\7A\2\2\u0138\u013c\7\21\2\2\u0139\u013b\13\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\21\2\2\u0140\u0135\3"+
		"\2\2\2\u0140\u0136\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u0138\3\2\2\2\u0141"+
		"\67\3\2\2\2\u0142\u014b\7\30\2\2\u0143\u0148\5\64\33\2\u0144\u0145\7\22"+
		"\2\2\u0145\u0147\5\64\33\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u0143\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\7\31\2\2\u014e9\3\2\2\2\"<?BMXclu}\u0083\u008c\u0097\u009f\u00aa"+
		"\u00b0\u00bc\u00e1\u00eb\u00f5\u0104\u010c\u0113\u011b\u011d\u0122\u0128"+
		"\u012f\u0133\u013c\u0140\u0148\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}