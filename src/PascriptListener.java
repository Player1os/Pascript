// Generated from src/Pascript.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascriptParser}.
 */
public interface PascriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascriptParser#ExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#SimpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#SimpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#StringDataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#StringDataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#FloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#FloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ReAssignemnt}.
	 * @param ctx the parse tree
	 */
	void enterReAssignemnt(@NotNull PascriptParser.ReAssignemntContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ReAssignemnt}.
	 * @param ctx the parse tree
	 */
	void exitReAssignemnt(@NotNull PascriptParser.ReAssignemntContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull PascriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull PascriptParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#BinaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#BinaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#Constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull PascriptParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#Constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull PascriptParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#variableSection}.
	 * @param ctx the parse tree
	 */
	void enterVariableSection(@NotNull PascriptParser.VariableSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#variableSection}.
	 * @param ctx the parse tree
	 */
	void exitVariableSection(@NotNull PascriptParser.VariableSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ReturnValueStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ReturnValueStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#PowerBinaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPowerBinaryOperation(@NotNull PascriptParser.PowerBinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#PowerBinaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPowerBinaryOperation(@NotNull PascriptParser.PowerBinaryOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull PascriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull PascriptParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#Assignemnt}.
	 * @param ctx the parse tree
	 */
	void enterAssignemnt(@NotNull PascriptParser.AssignemntContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#Assignemnt}.
	 * @param ctx the parse tree
	 */
	void exitAssignemnt(@NotNull PascriptParser.AssignemntContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ReturnVoidStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ReturnVoidStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull PascriptParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull PascriptParser.ForLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#StringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#StringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#AssignDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#AssignDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull PascriptParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull PascriptParser.ModuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#Variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull PascriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#Variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull PascriptParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ValueReturnDataType}.
	 * @param ctx the parse tree
	 */
	void enterValueReturnDataType(@NotNull PascriptParser.ValueReturnDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ValueReturnDataType}.
	 * @param ctx the parse tree
	 */
	void exitValueReturnDataType(@NotNull PascriptParser.ValueReturnDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#externalSection}.
	 * @param ctx the parse tree
	 */
	void enterExternalSection(@NotNull PascriptParser.ExternalSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#externalSection}.
	 * @param ctx the parse tree
	 */
	void exitExternalSection(@NotNull PascriptParser.ExternalSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#BooleanDataType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#BooleanDataType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#PrintStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull PascriptParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#PrintStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull PascriptParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#functionSection}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSection(@NotNull PascriptParser.FunctionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#functionSection}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSection(@NotNull PascriptParser.FunctionSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#DeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#DeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#VoidReturnDataType}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturnDataType(@NotNull PascriptParser.VoidReturnDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#VoidReturnDataType}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturnDataType(@NotNull PascriptParser.VoidReturnDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void enterMainSection(@NotNull PascriptParser.MainSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void exitMainSection(@NotNull PascriptParser.MainSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull PascriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull PascriptParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PascriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PascriptParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PascriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PascriptParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull PascriptParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull PascriptParser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull PascriptParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull PascriptParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#UnaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#UnaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#FloatDataType}.
	 * @param ctx the parse tree
	 */
	void enterFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#FloatDataType}.
	 * @param ctx the parse tree
	 */
	void exitFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#IntegerDataType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#IntegerDataType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull PascriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull PascriptParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull PascriptParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull PascriptParser.WhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#BooleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#BooleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#Parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#Parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull PascriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull PascriptParser.LiteralContext ctx);
}