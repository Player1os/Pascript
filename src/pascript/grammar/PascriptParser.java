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
		LINE_COMMENT=1, BLOCK_COMMENT=2, NEWLINE=3, WHITESPACE=4, EXTERNAL_SECTION=5, 
		VARIABLE_SECTION=6, FUNCTION_SECTION=7, MAIN_SECTION=8, COMMA=9, DOT=10, 
		END_STATEMENT=11, PAREN_OPEN=12, PAREN_CLOSE=13, SQUARE_OPEN=14, SQUARE_CLOSE=15, 
		CURLY_OPEN=16, CURLY_CLOSE=17, PRINT=18, READ=19, RETURN=20, IF=21, ELSE=22, 
		WHILE=23, DO=24, FOR=25, MULTIPLY=26, DIVIDE=27, MODULO=28, INCREMENT=29, 
		DECREMENT=30, ADD=31, SUBTRACT=32, NOT=33, AND=34, OR=35, XOR=36, LESS_OR_EQUAL=37, 
		GREATER_OR_EQUAL=38, LESS=39, GREATER=40, EQUAL=41, NOT_EQUAL=42, ASSIGN=43, 
		VOID_DATATYPE=44, BOOLEAN_DATATYPE=45, INTEGER_DATATYPE=46, FLOAT_DATATYPE=47, 
		STRING_DATATYPE=48, STRING=49, FLOAT=50, INTEGER=51, TRUE=52, FALSE=53, 
		IDENTIFIER=54;
	public static final String[] tokenNames = {
		"<INVALID>", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WHITESPACE", 
		"'external:'", "'variable:'", "'function:'", "'main:'", "','", "'.'", 
		"';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<-'", "'->'", "'return'", 
		"'if'", "'else'", "'while'", "'do'", "'for'", "'*'", "'/'", "'%'", "'++'", 
		"'--'", "'+'", "'-'", "'!'", "'&'", "'|'", "'^'", "'<='", "'>='", "'<'", 
		"'>'", "'=='", "'!='", "'='", "'void'", "'bool'", "'int'", "'float'", 
		"'string'", "STRING", "FLOAT", "INTEGER", "'true'", "'false'", "IDENTIFIER"
	};
	public static final int
		RULE_module = 0, RULE_externalSection = 1, RULE_externalFunctionDeclaration = 2, 
		RULE_parameterList = 3, RULE_variableSection = 4, RULE_globalVariableDeclaration = 5, 
		RULE_functionSection = 6, RULE_functionDefinition = 7, RULE_functionDeclaration = 8, 
		RULE_namedParameterList = 9, RULE_returnDataType = 10, RULE_mainSection = 11, 
		RULE_statement = 12, RULE_blockStatement = 13, RULE_basicStatement = 14, 
		RULE_variableDeclaration = 15, RULE_expression = 16, RULE_variableValue = 17, 
		RULE_argumentList = 18, RULE_dataType = 19, RULE_primitiveDataType = 20, 
		RULE_arrayDataType = 21, RULE_literal = 22;
	public static final String[] ruleNames = {
		"module", "externalSection", "externalFunctionDeclaration", "parameterList", 
		"variableSection", "globalVariableDeclaration", "functionSection", "functionDefinition", 
		"functionDeclaration", "namedParameterList", "returnDataType", "mainSection", 
		"statement", "blockStatement", "basicStatement", "variableDeclaration", 
		"expression", "variableValue", "argumentList", "dataType", "primitiveDataType", 
		"arrayDataType", "literal"
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
		public VariableSectionContext variableSection() {
			return getRuleContext(VariableSectionContext.class,0);
		}
		public ExternalSectionContext externalSection() {
			return getRuleContext(ExternalSectionContext.class,0);
		}
		public FunctionSectionContext functionSection() {
			return getRuleContext(FunctionSectionContext.class,0);
		}
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
			setState(47);
			_la = _input.LA(1);
			if (_la==EXTERNAL_SECTION) {
				{
				setState(46); externalSection();
				}
			}

			setState(50);
			_la = _input.LA(1);
			if (_la==VARIABLE_SECTION) {
				{
				setState(49); variableSection();
				}
			}

			setState(53);
			_la = _input.LA(1);
			if (_la==FUNCTION_SECTION) {
				{
				setState(52); functionSection();
				}
			}

			setState(55); mainSection();
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
		public TerminalNode EXTERNAL_SECTION() { return getToken(PascriptParser.EXTERNAL_SECTION, 0); }
		public List<ExternalFunctionDeclarationContext> externalFunctionDeclaration() {
			return getRuleContexts(ExternalFunctionDeclarationContext.class);
		}
		public ExternalFunctionDeclarationContext externalFunctionDeclaration(int i) {
			return getRuleContext(ExternalFunctionDeclarationContext.class,i);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
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
			setState(57); match(EXTERNAL_SECTION);
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
		enterRule(_localctx, 4, RULE_externalFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); returnDataType();
			setState(67); ((ExternalFunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(68); match(PAREN_OPEN);
			setState(70);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(69); parameterList();
				}
			}

			setState(72); match(PAREN_CLOSE);
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
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); dataType();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75); match(COMMA);
				setState(76); dataType();
				}
				}
				setState(81);
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

	public static class VariableSectionContext extends ParserRuleContext {
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
		public TerminalNode VARIABLE_SECTION() { return getToken(PascriptParser.VARIABLE_SECTION, 0); }
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
		enterRule(_localctx, 8, RULE_variableSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(VARIABLE_SECTION);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(83); globalVariableDeclaration();
				setState(84); match(END_STATEMENT);
				}
				}
				setState(90);
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

	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitGlobalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitGlobalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globalVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); dataType();
			setState(92); match(IDENTIFIER);
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
		public TerminalNode FUNCTION_SECTION() { return getToken(PascriptParser.FUNCTION_SECTION, 0); }
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
		enterRule(_localctx, 12, RULE_functionSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(FUNCTION_SECTION);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_DATATYPE) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(95); functionDeclaration();
				setState(96); functionDefinition();
				}
				}
				setState(102);
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
		enterRule(_localctx, 14, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); blockStatement();
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
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); returnDataType();
			setState(106); ((FunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(107); match(PAREN_OPEN);
			setState(109);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(108); namedParameterList();
				}
			}

			setState(111); match(PAREN_CLOSE);
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
		enterRule(_localctx, 18, RULE_namedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); dataType();
			setState(114); match(IDENTIFIER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115); match(COMMA);
				setState(116); dataType();
				setState(117); match(IDENTIFIER);
				}
				}
				setState(123);
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
		enterRule(_localctx, 20, RULE_returnDataType);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
			case INTEGER_DATATYPE:
			case FLOAT_DATATYPE:
			case STRING_DATATYPE:
				_localctx = new ReturnValueDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124); dataType();
				}
				break;
			case VOID_DATATYPE:
				_localctx = new ReturnVoidDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(VOID_DATATYPE);
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

	public static class MainSectionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode MAIN_SECTION() { return getToken(PascriptParser.MAIN_SECTION, 0); }
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
		enterRule(_localctx, 22, RULE_mainSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(MAIN_SECTION);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case CURLY_OPEN:
				_localctx = new CompositeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135); blockStatement();
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(IF);
				setState(137); match(PAREN_OPEN);
				setState(138); ((IfStatementContext)_localctx).condition = expression(0);
				setState(139); match(PAREN_CLOSE);
				setState(140); ((IfStatementContext)_localctx).trueStatement = statement();
				setState(143);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(141); match(ELSE);
					setState(142); ((IfStatementContext)_localctx).falseStatement = statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(WHILE);
				setState(146); match(PAREN_OPEN);
				setState(147); ((WhileLoopContext)_localctx).condition = expression(0);
				setState(148); match(PAREN_CLOSE);
				setState(149); statement();
				}
				break;
			case DO:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151); match(DO);
				setState(152); statement();
				setState(153); match(WHILE);
				setState(154); match(PAREN_OPEN);
				setState(155); ((DoWhileLoopContext)_localctx).condition = expression(0);
				setState(156); match(PAREN_CLOSE);
				setState(157); match(END_STATEMENT);
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159); match(FOR);
				setState(160); match(PAREN_OPEN);
				setState(161); ((ForLoopContext)_localctx).initializer = variableDeclaration();
				setState(162); match(END_STATEMENT);
				setState(163); ((ForLoopContext)_localctx).condition = expression(0);
				setState(164); match(END_STATEMENT);
				setState(165); ((ForLoopContext)_localctx).step = expression(0);
				setState(166); match(PAREN_CLOSE);
				setState(167); statement();
				}
				break;
			case PAREN_OPEN:
			case PRINT:
			case READ:
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
				setState(169); basicStatement();
				setState(170); match(END_STATEMENT);
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
			setState(174); match(CURLY_OPEN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(175); statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181); match(CURLY_CLOSE);
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
		enterRule(_localctx, 28, RULE_basicStatement);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183); variableDeclaration();
				}
				break;
			case 2:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); match(PRINT);
				setState(185); expression(0);
				}
				break;
			case 3:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186); match(READ);
				setState(187); match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ReturnVoidStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188); match(RETURN);
				}
				break;
			case 5:
				_localctx = new ReturnValueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(189); match(RETURN);
				setState(190); expression(0);
				}
				break;
			case 6:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(191); expression(0);
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
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194); dataType();
				setState(195); match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197); dataType();
				setState(198); match(IDENTIFIER);
				setState(199); match(ASSIGN);
				setState(200); expression(0);
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
		public Token methodName;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PascriptParser.PAREN_CLOSE, 0); }
		public TerminalNode DOT() { return getToken(PascriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PascriptParser.PAREN_OPEN, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
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
	public static class LoadedValueContext extends ExpressionContext {
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public LoadedValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterLoadedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitLoadedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitLoadedValue(this);
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
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				((UnaryOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUBTRACT || _la==NOT) ) {
					((UnaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(206); expression(9);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); match(IDENTIFIER);
				setState(208); match(ASSIGN);
				setState(209); expression(4);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210); match(PAREN_OPEN);
				setState(211); expression(0);
				setState(212); match(PAREN_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); ((FunctionCallContext)_localctx).functionName = match(IDENTIFIER);
				setState(215); match(PAREN_OPEN);
				setState(217);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << SUBTRACT) | (1L << NOT) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(216); argumentList();
					}
				}

				setState(219); match(PAREN_CLOSE);
				}
				break;
			case 5:
				{
				_localctx = new MethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220); variableValue();
				setState(221); match(DOT);
				setState(222); ((MethodCallContext)_localctx).methodName = match(IDENTIFIER);
				setState(223); match(PAREN_OPEN);
				setState(225);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << SUBTRACT) | (1L << NOT) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(224); argumentList();
					}
				}

				setState(227); match(PAREN_CLOSE);
				}
				break;
			case 6:
				{
				_localctx = new ReAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); match(IDENTIFIER);
				setState(230);
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
				_localctx = new LoadedValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); variableValue();
				}
				break;
			case 8:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(235);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(236);
					((BinaryOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << ADD) | (1L << SUBTRACT) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(237); expression(9);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class VariableValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
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

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(IDENTIFIER);
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
		enterRule(_localctx, 36, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); expression(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246); match(COMMA);
				setState(247); expression(0);
				}
				}
				setState(252);
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
		enterRule(_localctx, 38, RULE_dataType);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); primitiveDataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); arrayDataType();
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
		enterRule(_localctx, 40, RULE_primitiveDataType);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257); match(BOOLEAN_DATATYPE);
				}
				break;
			case INTEGER_DATATYPE:
				_localctx = new IntegerDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(INTEGER_DATATYPE);
				}
				break;
			case FLOAT_DATATYPE:
				_localctx = new FloatDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259); match(FLOAT_DATATYPE);
				}
				break;
			case STRING_DATATYPE:
				_localctx = new StringDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260); match(STRING_DATATYPE);
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
		enterRule(_localctx, 42, RULE_arrayDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); primitiveDataType();
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264); match(SQUARE_OPEN);
				setState(265); match(SQUARE_CLOSE);
				}
				}
				setState(268); 
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
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			setState(274);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
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
				setState(271); ((IntegerLiteralContext)_localctx).value = match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272); ((FloatLiteralContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273); ((StringLiteralContext)_localctx).value = match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\5\7\5P\n\5\f\5"+
		"\16\5S\13\5\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\t\3\t\3\n\3\n\3\n\3\n\5\np\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\f"+
		"\3\f\5\f\u0081\n\f\3\r\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\7\17"+
		"\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00cd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00dc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ec\n\22\3\22\3\22\3\22\7\22"+
		"\u00f1\n\22\f\22\16\22\u00f4\13\22\3\23\3\23\3\24\3\24\3\24\7\24\u00fb"+
		"\n\24\f\24\16\24\u00fe\13\24\3\25\3\25\5\25\u0102\n\25\3\26\3\26\3\26"+
		"\3\26\5\26\u0108\n\26\3\27\3\27\3\27\6\27\u010d\n\27\r\27\16\27\u010e"+
		"\3\30\3\30\3\30\3\30\5\30\u0115\n\30\3\30\2\3\"\31\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\"#\3\2\37 \5\2\34\36!\"$,\3\2\66\67"+
		"\u012b\2\61\3\2\2\2\4;\3\2\2\2\6D\3\2\2\2\bL\3\2\2\2\nT\3\2\2\2\f]\3\2"+
		"\2\2\16`\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26\u0080\3\2\2\2"+
		"\30\u0082\3\2\2\2\32\u00ae\3\2\2\2\34\u00b0\3\2\2\2\36\u00c2\3\2\2\2 "+
		"\u00cc\3\2\2\2\"\u00eb\3\2\2\2$\u00f5\3\2\2\2&\u00f7\3\2\2\2(\u0101\3"+
		"\2\2\2*\u0107\3\2\2\2,\u0109\3\2\2\2.\u0114\3\2\2\2\60\62\5\4\3\2\61\60"+
		"\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\5\n\6\2\64\63\3\2\2\2\64\65"+
		"\3\2\2\2\65\67\3\2\2\2\668\5\16\b\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\5\30\r\2:\3\3\2\2\2;A\7\7\2\2<=\5\6\4\2=>\7\r\2\2>@\3\2\2\2?<\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DE\5\26\f\2EF\7"+
		"8\2\2FH\7\16\2\2GI\5\b\5\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\17\2\2K\7"+
		"\3\2\2\2LQ\5(\25\2MN\7\13\2\2NP\5(\25\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TZ\7\b\2\2UV\5\f\7\2VW\7\r\2\2WY\3\2\2"+
		"\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\5"+
		"(\25\2^_\78\2\2_\r\3\2\2\2`f\7\t\2\2ab\5\22\n\2bc\5\20\t\2ce\3\2\2\2d"+
		"a\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hf\3\2\2\2ij\5\34\17"+
		"\2j\21\3\2\2\2kl\5\26\f\2lm\78\2\2mo\7\16\2\2np\5\24\13\2on\3\2\2\2op"+
		"\3\2\2\2pq\3\2\2\2qr\7\17\2\2r\23\3\2\2\2st\5(\25\2t{\78\2\2uv\7\13\2"+
		"\2vw\5(\25\2wx\78\2\2xz\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\25\3\2\2\2}{\3\2\2\2~\u0081\5(\25\2\177\u0081\7.\2\2\u0080~\3\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\27\3\2\2\2\u0082\u0086\7\n\2\2\u0083\u0085"+
		"\5\32\16\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\31\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u00af"+
		"\5\34\17\2\u008a\u008b\7\27\2\2\u008b\u008c\7\16\2\2\u008c\u008d\5\"\22"+
		"\2\u008d\u008e\7\17\2\2\u008e\u0091\5\32\16\2\u008f\u0090\7\30\2\2\u0090"+
		"\u0092\5\32\16\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00af\3"+
		"\2\2\2\u0093\u0094\7\31\2\2\u0094\u0095\7\16\2\2\u0095\u0096\5\"\22\2"+
		"\u0096\u0097\7\17\2\2\u0097\u0098\5\32\16\2\u0098\u00af\3\2\2\2\u0099"+
		"\u009a\7\32\2\2\u009a\u009b\5\32\16\2\u009b\u009c\7\31\2\2\u009c\u009d"+
		"\7\16\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\17\2\2\u009f\u00a0\7\r\2"+
		"\2\u00a0\u00af\3\2\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\7\16\2\2\u00a3"+
		"\u00a4\5 \21\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7"+
		"\r\2\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\32\16\2"+
		"\u00aa\u00af\3\2\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7\r\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u0089\3\2\2\2\u00ae\u008a\3\2\2\2\u00ae\u0093\3\2\2\2\u00ae"+
		"\u0099\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\33\3\2\2"+
		"\2\u00b0\u00b4\7\22\2\2\u00b1\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\35\3\2\2\2\u00b9\u00c3"+
		"\5 \21\2\u00ba\u00bb\7\24\2\2\u00bb\u00c3\5\"\22\2\u00bc\u00bd\7\25\2"+
		"\2\u00bd\u00c3\78\2\2\u00be\u00c3\7\26\2\2\u00bf\u00c0\7\26\2\2\u00c0"+
		"\u00c3\5\"\22\2\u00c1\u00c3\5\"\22\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3"+
		"\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\5(\25\2\u00c5\u00c6\78\2\2"+
		"\u00c6\u00cd\3\2\2\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\78\2\2\u00c9\u00ca"+
		"\7-\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cd\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc"+
		"\u00c7\3\2\2\2\u00cd!\3\2\2\2\u00ce\u00cf\b\22\1\2\u00cf\u00d0\t\2\2\2"+
		"\u00d0\u00ec\5\"\22\13\u00d1\u00d2\78\2\2\u00d2\u00d3\7-\2\2\u00d3\u00ec"+
		"\5\"\22\6\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7\17\2"+
		"\2\u00d7\u00ec\3\2\2\2\u00d8\u00d9\78\2\2\u00d9\u00db\7\16\2\2\u00da\u00dc"+
		"\5&\24\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00ec\7\17\2\2\u00de\u00df\5$\23\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\7"+
		"8\2\2\u00e1\u00e3\7\16\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\17\2\2\u00e6\u00ec\3"+
		"\2\2\2\u00e7\u00e8\78\2\2\u00e8\u00ec\t\3\2\2\u00e9\u00ec\5$\23\2\u00ea"+
		"\u00ec\5.\30\2\u00eb\u00ce\3\2\2\2\u00eb\u00d1\3\2\2\2\u00eb\u00d4\3\2"+
		"\2\2\u00eb\u00d8\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\f\n"+
		"\2\2\u00ee\u00ef\t\4\2\2\u00ef\u00f1\5\"\22\13\u00f0\u00ed\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f6\78\2\2\u00f6%\3\2\2\2\u00f7\u00fc\5\""+
		"\22\2\u00f8\u00f9\7\13\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\'\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0102\5*\26\2\u0100\u0102\5,\27\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102)\3\2\2\2\u0103\u0108\7/\2\2\u0104\u0108"+
		"\7\60\2\2\u0105\u0108\7\61\2\2\u0106\u0108\7\62\2\2\u0107\u0103\3\2\2"+
		"\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108+"+
		"\3\2\2\2\u0109\u010c\5*\26\2\u010a\u010b\7\20\2\2\u010b\u010d\7\21\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f-\3\2\2\2\u0110\u0115\t\5\2\2\u0111\u0115\7\65\2\2\u0112"+
		"\u0115\7\64\2\2\u0113\u0115\7\63\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115/\3\2\2\2\34\61\64"+
		"\67AHQZfo{\u0080\u0086\u0091\u00ae\u00b4\u00c2\u00cc\u00db\u00e3\u00eb"+
		"\u00f2\u00fc\u0101\u0107\u010e\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}