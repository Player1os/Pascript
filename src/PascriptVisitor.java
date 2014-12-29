// Generated from src/Pascript.g4 by ANTLR 4.2
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
	 * Visit a parse tree produced by {@link PascriptParser#ExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull PascriptParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#SimpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(@NotNull PascriptParser.SimpleDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#StringDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(@NotNull PascriptParser.StringDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(@NotNull PascriptParser.DoWhileLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#FloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(@NotNull PascriptParser.FloatLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ReAssignemnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignemnt(@NotNull PascriptParser.ReAssignemntContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull PascriptParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#BinaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(@NotNull PascriptParser.BinaryOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#Constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull PascriptParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#variableSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSection(@NotNull PascriptParser.VariableSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ReturnValueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValueStatement(@NotNull PascriptParser.ReturnValueStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#PowerBinaryOperation}.
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
	 * Visit a parse tree produced by {@link PascriptParser#Assignemnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignemnt(@NotNull PascriptParser.AssignemntContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ReturnVoidStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoidStatement(@NotNull PascriptParser.ReturnVoidStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(@NotNull PascriptParser.ReadStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(@NotNull PascriptParser.ForLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#StringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull PascriptParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#AssignDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDeclaration(@NotNull PascriptParser.AssignDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull PascriptParser.ModuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull PascriptParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ValueReturnDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueReturnDataType(@NotNull PascriptParser.ValueReturnDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#externalSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalSection(@NotNull PascriptParser.ExternalSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#BooleanDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDataType(@NotNull PascriptParser.BooleanDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#PrintStatement}.
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
	 * Visit a parse tree produced by {@link PascriptParser#DeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(@NotNull PascriptParser.DeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#VoidReturnDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturnDataType(@NotNull PascriptParser.VoidReturnDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#mainSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSection(@NotNull PascriptParser.MainSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull PascriptParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#FunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull PascriptParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull PascriptParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull PascriptParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull PascriptParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull PascriptParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#UnaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(@NotNull PascriptParser.UnaryOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull PascriptParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#FloatDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDataType(@NotNull PascriptParser.FloatDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#IntegerDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDataType(@NotNull PascriptParser.IntegerDataTypeContext ctx);

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
	 * Visit a parse tree produced by {@link PascriptParser#BooleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull PascriptParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#Parenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(@NotNull PascriptParser.ParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link PascriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull PascriptParser.LiteralContext ctx);
}