// Generated from src/pascript/grammar/Pascript.g4 by ANTLR 4.4

package pascript.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascriptParser}.
 */
public interface PascriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code IntegerDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnValueDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void enterReturnValueDataType(@NotNull PascriptParser.ReturnValueDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnValueDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void exitReturnValueDataType(@NotNull PascriptParser.ReturnValueDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(@NotNull PascriptParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(@NotNull PascriptParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PascriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PascriptParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PascriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PascriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReAssignment(@NotNull PascriptParser.ReAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReAssignment(@NotNull PascriptParser.ReAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnValueStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnValueStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull PascriptParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull PascriptParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code ReturnVoidStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoidStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code ConstantValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantValue(@NotNull PascriptParser.ConstantValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantValue(@NotNull PascriptParser.ConstantValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascriptParser#arrayDataType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDataType(@NotNull PascriptParser.ArrayDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#arrayDataType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDataType(@NotNull PascriptParser.ArrayDataTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadedValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLoadedValue(@NotNull PascriptParser.LoadedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadedValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLoadedValue(@NotNull PascriptParser.LoadedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull PascriptParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull PascriptParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascriptParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(@NotNull PascriptParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(@NotNull PascriptParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull PascriptParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull PascriptParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompositeStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompositeStatement(@NotNull PascriptParser.CompositeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompositeStatement}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompositeStatement(@NotNull PascriptParser.CompositeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascriptParser#externalFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalFunctionDeclaration(@NotNull PascriptParser.ExternalFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#externalFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalFunctionDeclaration(@NotNull PascriptParser.ExternalFunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link PascriptParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(@NotNull PascriptParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(@NotNull PascriptParser.VariableValueContext ctx);
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
	 * Enter a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code ReturnVoidDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoidDataType(@NotNull PascriptParser.ReturnVoidDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoidDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoidDataType(@NotNull PascriptParser.ReturnVoidDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascriptParser#namedParameterList}.
	 * @param ctx the parse tree
	 */
	void enterNamedParameterList(@NotNull PascriptParser.NamedParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascriptParser#namedParameterList}.
	 * @param ctx the parse tree
	 */
	void exitNamedParameterList(@NotNull PascriptParser.NamedParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PascriptParser#basicStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull PascriptParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull PascriptParser.WhileLoopContext ctx);
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
}