// Generated from src/Pascript.g4 by ANTLR 4.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, NEWLINE=3, WHITESPACE=4, EXTERNAL_SECTION=5, 
		VARIABLE_SECTION=6, FUNCTION_SECTION=7, MAIN_SECTION=8, COMMA=9, END_STATEMENT=10, 
		PAREN_OPEN=11, PAREN_CLOSE=12, SQUARE_OPEN=13, SQUARE_CLOSE=14, CURLY_OPEN=15, 
		CURLY_CLOSE=16, PRINT=17, READ=18, RETURN=19, IF=20, ELSE=21, WHILE=22, 
		DO=23, FOR=24, POWER=25, MULTIPLY=26, DIVIDE=27, MODULO=28, INCREMENT=29, 
		DECREMENT=30, ADD=31, SUBTRACT=32, SHIFT_LEFT=33, SHIFT_RIGHT=34, AND=35, 
		OR=36, XOR=37, NOT=38, LESS_OR_EQUAL=39, GREATER_OR_EQUAL=40, LESS=41, 
		GREATER=42, EQUAL=43, NOT_EQUAL=44, ASSIGN=45, VOID=46, BOOLEAN_DATATYPE=47, 
		INTEGER_DATATYPE=48, FLOAT_DATATYPE=49, STRING_DATATYPE=50, STRING=51, 
		FLOAT=52, INTEGER=53, TRUE=54, FALSE=55, IDENTIFIER=56;
	public static final String[] tokenNames = {
		"<INVALID>", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WHITESPACE", 
		"'external:'", "'variable:'", "'function:'", "'main:'", "','", "';'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<-'", "'->'", "'return'", 
		"'if'", "'else'", "'while'", "'do'", "'for'", "'**'", "'*'", "'/'", "'%'", 
		"'++'", "'--'", "'+'", "'-'", "'<<'", "'>>'", "'&&'", "'||'", "'^^'", 
		"'!'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'='", "'void'", 
		"'bool'", "'int'", "'float'", "'string'", "STRING", "FLOAT", "INTEGER", 
		"'true'", "'false'", "IDENTIFIER"
	};
	public static final int
		RULE_module = 0, RULE_externalSection = 1, RULE_variableSection = 2, RULE_functionSection = 3, 
		RULE_mainSection = 4, RULE_functionDeclaration = 5, RULE_returnDataType = 6, 
		RULE_functionDefinition = 7, RULE_parameterList = 8, RULE_argumentList = 9, 
		RULE_statement = 10, RULE_blockStatement = 11, RULE_whileLoop = 12, RULE_doWhileLoop = 13, 
		RULE_forLoop = 14, RULE_ifStatement = 15, RULE_simpleStatement = 16, RULE_variableDeclaration = 17, 
		RULE_expression = 18, RULE_dataType = 19, RULE_primitiveDataType = 20, 
		RULE_literal = 21, RULE_primitiveLiteral = 22;
	public static final String[] ruleNames = {
		"module", "externalSection", "variableSection", "functionSection", "mainSection", 
		"functionDeclaration", "returnDataType", "functionDefinition", "parameterList", 
		"argumentList", "statement", "blockStatement", "whileLoop", "doWhileLoop", 
		"forLoop", "ifStatement", "simpleStatement", "variableDeclaration", "expression", 
		"dataType", "primitiveDataType", "literal", "primitiveLiteral"
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
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(58); functionDeclaration();
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

	public static class VariableSectionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode END_STATEMENT(int i) {
			return getToken(PascriptParser.END_STATEMENT, i);
		}
		public TerminalNode VARIABLE_SECTION() { return getToken(PascriptParser.VARIABLE_SECTION, 0); }
		public List<TerminalNode> END_STATEMENT() { return getTokens(PascriptParser.END_STATEMENT); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
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
			setState(66); match(VARIABLE_SECTION);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(67); variableDeclaration();
				setState(68); match(END_STATEMENT);
				}
				}
				setState(74);
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
		enterRule(_localctx, 6, RULE_functionSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(FUNCTION_SECTION);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				{
				setState(76); functionDeclaration();
				setState(77); functionDefinition();
				}
				}
				setState(83);
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
		enterRule(_localctx, 8, RULE_mainSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(MAIN_SECTION);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << ADD) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(85); statement();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); returnDataType();
			setState(92); ((FunctionDeclarationContext)_localctx).functionName = match(IDENTIFIER);
			setState(93); match(PAREN_OPEN);
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE))) != 0)) {
				{
				setState(94); parameterList();
				}
			}

			setState(97); match(PAREN_CLOSE);
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
	public static class ValueReturnDataTypeContext extends ReturnDataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ValueReturnDataTypeContext(ReturnDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterValueReturnDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitValueReturnDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitValueReturnDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidReturnDataTypeContext extends ReturnDataTypeContext {
		public TerminalNode VOID() { return getToken(PascriptParser.VOID, 0); }
		public VoidReturnDataTypeContext(ReturnDataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterVoidReturnDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitVoidReturnDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitVoidReturnDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDataTypeContext returnDataType() throws RecognitionException {
		ReturnDataTypeContext _localctx = new ReturnDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnDataType);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
			case INTEGER_DATATYPE:
			case FLOAT_DATATYPE:
			case STRING_DATATYPE:
				_localctx = new ValueReturnDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99); dataType();
				}
				break;
			case VOID:
				_localctx = new VoidReturnDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(VOID);
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

	public static class ParameterListContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); dataType();
			setState(106); match(IDENTIFIER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107); match(COMMA);
				setState(108); dataType();
				setState(109); match(IDENTIFIER);
				}
				}
				setState(115);
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
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(IDENTIFIER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117); match(COMMA);
				setState(118); match(IDENTIFIER);
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
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case CURLY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); blockStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); whileLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); doWhileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); forLoop();
				}
				break;
			case PAREN_OPEN:
			case PRINT:
			case READ:
			case RETURN:
			case ADD:
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
				enterOuterAlt(_localctx, 6);
				{
				setState(129); simpleStatement();
				setState(130); match(END_STATEMENT);
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
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(CURLY_OPEN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << ADD) | (1L << SUBTRACT) | (1L << NOT) | (1L << BOOLEAN_DATATYPE) | (1L << INTEGER_DATATYPE) | (1L << FLOAT_DATATYPE) | (1L << STRING_DATATYPE) | (1L << STRING) | (1L << FLOAT) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(135); statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); match(CURLY_CLOSE);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(WHILE);
			setState(144); match(PAREN_OPEN);
			setState(145); ((WhileLoopContext)_localctx).condition = expression(0);
			setState(146); match(PAREN_CLOSE);
			setState(147); statement();
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
		enterRule(_localctx, 26, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(DO);
			setState(150); statement();
			setState(151); match(WHILE);
			setState(152); match(PAREN_OPEN);
			setState(153); ((DoWhileLoopContext)_localctx).condition = expression(0);
			setState(154); match(PAREN_CLOSE);
			setState(155); match(END_STATEMENT);
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
		public VariableDeclarationContext initialiser;
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
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(FOR);
			setState(158); match(PAREN_OPEN);
			setState(159); ((ForLoopContext)_localctx).initialiser = variableDeclaration();
			setState(160); match(END_STATEMENT);
			setState(161); ((ForLoopContext)_localctx).condition = expression(0);
			setState(162); match(END_STATEMENT);
			setState(163); ((ForLoopContext)_localctx).step = expression(0);
			setState(164); match(PAREN_CLOSE);
			setState(165); statement();
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
		enterRule(_localctx, 30, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(IF);
			setState(168); match(PAREN_OPEN);
			setState(169); ((IfStatementContext)_localctx).condition = expression(0);
			setState(170); match(PAREN_CLOSE);
			setState(171); ((IfStatementContext)_localctx).trueStatement = statement();
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172); match(ELSE);
				setState(173); ((IfStatementContext)_localctx).falseStatement = statement();
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
	public static class ReadStatementContext extends SimpleStatementContext {
		public TerminalNode READ() { return getToken(PascriptParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_simpleStatement);
		try {
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176); variableDeclaration();
				}
				break;

			case 2:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(PRINT);
				setState(178); expression(0);
				}
				break;

			case 3:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179); match(READ);
				setState(180); expression(0);
				}
				break;

			case 4:
				_localctx = new ReturnVoidStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181); match(RETURN);
				}
				break;

			case 5:
				_localctx = new ReturnValueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182); match(RETURN);
				setState(183); expression(0);
				}
				break;

			case 6:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184); expression(0);
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
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); dataType();
				setState(188); match(IDENTIFIER);
				}
				break;

			case 2:
				_localctx = new AssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190); dataType();
				setState(191); match(IDENTIFIER);
				setState(192); match(ASSIGN);
				setState(193); expression(0);
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
		public TerminalNode ADD() { return getToken(PascriptParser.ADD, 0); }
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
	public static class VariableContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(PascriptParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitVariable(this);
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
	public static class ReAssignemntContext extends ExpressionContext {
		public Token operator;
		public TerminalNode INCREMENT() { return getToken(PascriptParser.INCREMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(PascriptParser.DECREMENT, 0); }
		public ReAssignemntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterReAssignemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitReAssignemnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitReAssignemnt(this);
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
	public static class ConstantContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascriptListener ) ((PascriptListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascriptVisitor ) return ((PascriptVisitor<? extends T>)visitor).visitConstant(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(198);
				((UnaryOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << NOT))) != 0)) ) {
					((UnaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(199); expression(9);
				}
				break;

			case 2:
				{
				_localctx = new AssignemntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); match(IDENTIFIER);
				setState(201); match(ASSIGN);
				setState(202); expression(4);
				}
				break;

			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); match(PAREN_OPEN);
				setState(204); expression(0);
				setState(205); match(PAREN_CLOSE);
				}
				break;

			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); ((FunctionCallContext)_localctx).functionName = match(IDENTIFIER);
				setState(208); match(PAREN_OPEN);
				setState(210);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(209); argumentList();
					}
				}

				setState(212); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); match(IDENTIFIER);
				}
				break;

			case 6:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PowerBinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218); ((PowerBinaryOperationContext)_localctx).operator = match(POWER);
						setState(219); expression(9);
						}
						break;

					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << ADD) | (1L << SUBTRACT) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(222); expression(8);
						}
						break;

					case 3:
						{
						_localctx = new ReAssignemntContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(224);
						((ReAssignemntContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
							((ReAssignemntContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(230); primitiveDataType();
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
			setState(236);
			switch (_input.LA(1)) {
			case BOOLEAN_DATATYPE:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(BOOLEAN_DATATYPE);
				}
				break;
			case INTEGER_DATATYPE:
				_localctx = new IntegerDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(INTEGER_DATATYPE);
				}
				break;
			case FLOAT_DATATYPE:
				_localctx = new FloatDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234); match(FLOAT_DATATYPE);
				}
				break;
			case STRING_DATATYPE:
				_localctx = new StringDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235); match(STRING_DATATYPE);
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

	public static class LiteralContext extends ParserRuleContext {
		public PrimitiveLiteralContext primitiveLiteral() {
			return getRuleContext(PrimitiveLiteralContext.class,0);
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
		enterRule(_localctx, 42, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); primitiveLiteral();
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
		public TerminalNode STRING() { return getToken(PascriptParser.STRING, 0); }
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
		enterRule(_localctx, 44, RULE_primitiveLiteral);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
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
				setState(241); ((IntegerLiteralContext)_localctx).value = match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242); ((FloatLiteralContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243); ((StringLiteralContext)_localctx).value = match(STRING);
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
		case 18: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 7);

		case 2: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\3\5\3\5\3\5\7"+
		"\5R\n\5\f\5\16\5U\13\5\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3"+
		"\7\5\7b\n\7\3\7\3\7\3\b\3\b\5\bh\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\nr\n\n\f\n\16\nu\13\n\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\7\r\u008b\n\r\f\r\16"+
		"\r\u008e\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00bc\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00d5\n\24\3\24\3\24\3\24\5\24\u00da\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7"+
		"\13\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00ef\n\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\5\30\u00f7\n\30\3\30\2\3&\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\6\4\2!\"((\6\2\34\36!\"%\').\3\2\37 \3\289\u0108"+
		"\2\61\3\2\2\2\4;\3\2\2\2\6D\3\2\2\2\bM\3\2\2\2\nV\3\2\2\2\f]\3\2\2\2\16"+
		"g\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24v\3\2\2\2\26\u0086\3\2\2\2\30\u0088"+
		"\3\2\2\2\32\u0091\3\2\2\2\34\u0097\3\2\2\2\36\u009f\3\2\2\2 \u00a9\3\2"+
		"\2\2\"\u00bb\3\2\2\2$\u00c5\3\2\2\2&\u00d9\3\2\2\2(\u00e8\3\2\2\2*\u00ee"+
		"\3\2\2\2,\u00f0\3\2\2\2.\u00f6\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\n\6\2"+
		":\3\3\2\2\2;A\7\7\2\2<=\5\f\7\2=>\7\f\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DJ\7\b\2\2EF\5$\23\2FG\7\f"+
		"\2\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ\3"+
		"\2\2\2MS\7\t\2\2NO\5\f\7\2OP\5\20\t\2PR\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2VZ\7\n\2\2WY\5\26\f\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\5\16\b\2^_\7"+
		":\2\2_a\7\r\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\16\2\2d\r"+
		"\3\2\2\2eh\5(\25\2fh\7\60\2\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ij\5\30\r"+
		"\2j\21\3\2\2\2kl\5(\25\2ls\7:\2\2mn\7\13\2\2no\5(\25\2op\7:\2\2pr\3\2"+
		"\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\23\3\2\2\2us\3\2\2\2v{\7"+
		":\2\2wx\7\13\2\2xz\7:\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\25"+
		"\3\2\2\2}{\3\2\2\2~\u0087\5\30\r\2\177\u0087\5 \21\2\u0080\u0087\5\32"+
		"\16\2\u0081\u0087\5\34\17\2\u0082\u0087\5\36\20\2\u0083\u0084\5\"\22\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0086\177\3\2"+
		"\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0087\27\3\2\2\2\u0088\u008c\7\21\2\2\u0089\u008b\5\26"+
		"\f\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\22"+
		"\2\2\u0090\31\3\2\2\2\u0091\u0092\7\30\2\2\u0092\u0093\7\r\2\2\u0093\u0094"+
		"\5&\24\2\u0094\u0095\7\16\2\2\u0095\u0096\5\26\f\2\u0096\33\3\2\2\2\u0097"+
		"\u0098\7\31\2\2\u0098\u0099\5\26\f\2\u0099\u009a\7\30\2\2\u009a\u009b"+
		"\7\r\2\2\u009b\u009c\5&\24\2\u009c\u009d\7\16\2\2\u009d\u009e\7\f\2\2"+
		"\u009e\35\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2"+
		"\5$\23\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\f\2\2\u00a5"+
		"\u00a6\5&\24\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\26\f\2\u00a8\37\3\2"+
		"\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\5&\24\2\u00ac"+
		"\u00ad\7\16\2\2\u00ad\u00b0\5\26\f\2\u00ae\u00af\7\27\2\2\u00af\u00b1"+
		"\5\26\f\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2\u00b2"+
		"\u00bc\5$\23\2\u00b3\u00b4\7\23\2\2\u00b4\u00bc\5&\24\2\u00b5\u00b6\7"+
		"\24\2\2\u00b6\u00bc\5&\24\2\u00b7\u00bc\7\25\2\2\u00b8\u00b9\7\25\2\2"+
		"\u00b9\u00bc\5&\24\2\u00ba\u00bc\5&\24\2\u00bb\u00b2\3\2\2\2\u00bb\u00b3"+
		"\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc#\3\2\2\2\u00bd\u00be\5(\25\2\u00be\u00bf\7:\2\2\u00bf"+
		"\u00c6\3\2\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\7:\2\2\u00c2\u00c3\7/\2"+
		"\2\u00c3\u00c4\5&\24\2\u00c4\u00c6\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c0"+
		"\3\2\2\2\u00c6%\3\2\2\2\u00c7\u00c8\b\24\1\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\u00da\5&\24\13\u00ca\u00cb\7:\2\2\u00cb\u00cc\7/\2\2\u00cc\u00da\5&\24"+
		"\6\u00cd\u00ce\7\r\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7\16\2\2\u00d0"+
		"\u00da\3\2\2\2\u00d1\u00d2\7:\2\2\u00d2\u00d4\7\r\2\2\u00d3\u00d5\5\24"+
		"\13\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00da\7\16\2\2\u00d7\u00da\7:\2\2\u00d8\u00da\5,\27\2\u00d9\u00c7\3\2"+
		"\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00e5\3\2\2\2\u00db\u00dc\f\n"+
		"\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00e4\5&\24\13\u00de\u00df\f\t\2\2\u00df"+
		"\u00e0\t\3\2\2\u00e0\u00e4\5&\24\n\u00e1\u00e2\f\5\2\2\u00e2\u00e4\t\4"+
		"\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5*\26\2\u00e9)\3\2\2\2\u00ea\u00ef\7"+
		"\61\2\2\u00eb\u00ef\7\62\2\2\u00ec\u00ef\7\63\2\2\u00ed\u00ef\7\64\2\2"+
		"\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef+\3\2\2\2\u00f0\u00f1\5.\30\2\u00f1-\3\2\2\2\u00f2\u00f7"+
		"\t\5\2\2\u00f3\u00f7\7\67\2\2\u00f4\u00f7\7\66\2\2\u00f5\u00f7\7\65\2"+
		"\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7/\3\2\2\2\30\61\64\67AJSZags{\u0086\u008c\u00b0\u00bb\u00c5"+
		"\u00d4\u00d9\u00e3\u00e5\u00ee\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}