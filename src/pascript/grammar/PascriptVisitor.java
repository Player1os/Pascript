// Generated from src/pascript/grammar/Pascript.g4 by ANTLR 4.4

package pascript.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link PascriptParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoidDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoidDataType(@NotNull PascriptParser.ReturnVoidDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#variableSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSection(@NotNull PascriptParser.VariableSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnValueStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerBinaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerBinaryOperation(@NotNull PascriptParser.PowerBinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull PascriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignemnt}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignemnt(@NotNull PascriptParser.AssignemntContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(@NotNull PascriptParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PascriptParser#containerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(@NotNull PascriptParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleGlobalDeclaration}
	 * labeled alternative in {@link PascriptParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleGlobalDeclaration(@NotNull PascriptParser.SimpleGlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#mainSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSection(@NotNull PascriptParser.MainSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(@NotNull PascriptParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull PascriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull PascriptParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(@NotNull PascriptParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignGlobalDeclaration}
	 * labeled alternative in {@link PascriptParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGlobalDeclaration(@NotNull PascriptParser.AssignGlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(@NotNull PascriptParser.VariableValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDataType}
	 * labeled alternative in {@link PascriptParser#containerDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDataType(@NotNull PascriptParser.ArrayDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link PascriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link PascriptParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull PascriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull PascriptParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoidStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#externalFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalFunctionDeclaration(@NotNull PascriptParser.ExternalFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PascriptParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull PascriptParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#externalSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalSection(@NotNull PascriptParser.ExternalSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PascriptParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull PascriptParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#functionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSection(@NotNull PascriptParser.FunctionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull PascriptParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link PascriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(@NotNull PascriptParser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull PascriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull PascriptParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnValueDataType}
	 * labeled alternative in {@link PascriptParser#returnDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValueDataType(@NotNull PascriptParser.ReturnValueDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PascriptParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull PascriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(@NotNull PascriptParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#namedParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParameterList(@NotNull PascriptParser.NamedParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PascriptParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull PascriptParser.LiteralContext ctx);
}