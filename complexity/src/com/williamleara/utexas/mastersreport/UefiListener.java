package com.williamleara.utexas.mastersreport;

// Generated from Uefi.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UefiParser}.
 */
public interface UefiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UefiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull UefiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull UefiParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull UefiParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull UefiParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull UefiParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull UefiParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull UefiParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull UefiParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(@NotNull UefiParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(@NotNull UefiParser.DesignationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(@NotNull UefiParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(@NotNull UefiParser.ParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(@NotNull UefiParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(@NotNull UefiParser.NestedParenthesesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(@NotNull UefiParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(@NotNull UefiParser.ParameterTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull UefiParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull UefiParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull UefiParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull UefiParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(@NotNull UefiParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(@NotNull UefiParser.StructOrUnionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(@NotNull UefiParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(@NotNull UefiParser.InitDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(@NotNull UefiParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(@NotNull UefiParser.StorageClassSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(@NotNull UefiParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(@NotNull UefiParser.TypeQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(@NotNull UefiParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(@NotNull UefiParser.StructDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull UefiParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull UefiParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull UefiParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull UefiParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull UefiParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull UefiParser.DeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull UefiParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull UefiParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(@NotNull UefiParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(@NotNull UefiParser.BlockItemListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(@NotNull UefiParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(@NotNull UefiParser.TypedefNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull UefiParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull UefiParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(@NotNull UefiParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(@NotNull UefiParser.DesignatorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull UefiParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull UefiParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(@NotNull UefiParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(@NotNull UefiParser.GenericSelectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(@NotNull UefiParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(@NotNull UefiParser.SelectionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(@NotNull UefiParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(@NotNull UefiParser.ArgumentExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull UefiParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull UefiParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(@NotNull UefiParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(@NotNull UefiParser.DeclarationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull UefiParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull UefiParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(@NotNull UefiParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(@NotNull UefiParser.AlignmentSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull UefiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull UefiParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull UefiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull UefiParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(@NotNull UefiParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(@NotNull UefiParser.UnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(@NotNull UefiParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(@NotNull UefiParser.GenericAssociationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull UefiParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull UefiParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull UefiParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull UefiParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(@NotNull UefiParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(@NotNull UefiParser.StructDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(@NotNull UefiParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(@NotNull UefiParser.InitializerListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull UefiParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull UefiParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(@NotNull UefiParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(@NotNull UefiParser.DeclarationSpecifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(@NotNull UefiParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(@NotNull UefiParser.StructDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(@NotNull UefiParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(@NotNull UefiParser.EnumSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull UefiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull UefiParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull UefiParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull UefiParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(@NotNull UefiParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(@NotNull UefiParser.StaticAssertDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(@NotNull UefiParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(@NotNull UefiParser.DeclarationSpecifiers2Context ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(@NotNull UefiParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(@NotNull UefiParser.AtomicTypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull UefiParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull UefiParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(@NotNull UefiParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(@NotNull UefiParser.DirectDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(@NotNull UefiParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(@NotNull UefiParser.GccAttributeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(@NotNull UefiParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(@NotNull UefiParser.DirectAbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull UefiParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull UefiParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(@NotNull UefiParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(@NotNull UefiParser.TypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull UefiParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull UefiParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(@NotNull UefiParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(@NotNull UefiParser.TranslationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull UefiParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull UefiParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(@NotNull UefiParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(@NotNull UefiParser.StructOrUnionSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull UefiParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull UefiParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull UefiParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull UefiParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(@NotNull UefiParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(@NotNull UefiParser.EnumerationConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(@NotNull UefiParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(@NotNull UefiParser.GccAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(@NotNull UefiParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(@NotNull UefiParser.GccDeclaratorExtensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(@NotNull UefiParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(@NotNull UefiParser.IterationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(@NotNull UefiParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(@NotNull UefiParser.GccAttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(@NotNull UefiParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(@NotNull UefiParser.TypeQualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(@NotNull UefiParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(@NotNull UefiParser.EnumeratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull UefiParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull UefiParser.CompoundStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(@NotNull UefiParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(@NotNull UefiParser.JumpStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(@NotNull UefiParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(@NotNull UefiParser.BlockItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull UefiParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull UefiParser.LogicalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(@NotNull UefiParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(@NotNull UefiParser.AbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull UefiParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull UefiParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull UefiParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull UefiParser.LogicalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull UefiParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull UefiParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(@NotNull UefiParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(@NotNull UefiParser.GenericAssocListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(@NotNull UefiParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(@NotNull UefiParser.FunctionSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull UefiParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull UefiParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(@NotNull UefiParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(@NotNull UefiParser.StructDeclaratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull UefiParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull UefiParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(@NotNull UefiParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(@NotNull UefiParser.SpecifierQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(@NotNull UefiParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(@NotNull UefiParser.ExternalDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull UefiParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull UefiParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link UefiParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(@NotNull UefiParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UefiParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(@NotNull UefiParser.InitDeclaratorListContext ctx);
}