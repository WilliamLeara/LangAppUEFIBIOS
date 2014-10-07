package com.williamleara.utexas.mastersreport;

//Generated from vfr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
* This interface defines a complete listener for a parse tree produced by
* {@link vfrParser}.
*/
public interface vfrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionTernaryOp}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionTernaryOp(@NotNull vfrParser.VfrExpressionTernaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionTernaryOp}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionTernaryOp(@NotNull vfrParser.VfrExpressionTernaryOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#findExp}.
	 * @param ctx the parse tree
	 */
	void enterFindExp(@NotNull vfrParser.FindExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#findExp}.
	 * @param ctx the parse tree
	 */
	void exitFindExp(@NotNull vfrParser.FindExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#addMinusTerm}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusTerm(@NotNull vfrParser.AddMinusTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#addMinusTerm}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusTerm(@NotNull vfrParser.AddMinusTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrDateFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrDateFlags(@NotNull vfrParser.VfrDateFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrDateFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrDateFlags(@NotNull vfrParser.VfrDateFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementPassword}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementPassword(@NotNull vfrParser.VfrStatementPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementPassword}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementPassword(@NotNull vfrParser.VfrStatementPasswordContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#guidSubDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGuidSubDefinition(@NotNull vfrParser.GuidSubDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#guidSubDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGuidSubDefinition(@NotNull vfrParser.GuidSubDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#spanFlags}.
	 * @param ctx the parse tree
	 */
	void enterSpanFlags(@NotNull vfrParser.SpanFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#spanFlags}.
	 * @param ctx the parse tree
	 */
	void exitSpanFlags(@NotNull vfrParser.SpanFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#dupExp}.
	 * @param ctx the parse tree
	 */
	void enterDupExp(@NotNull vfrParser.DupExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#dupExp}.
	 * @param ctx the parse tree
	 */
	void exitDupExp(@NotNull vfrParser.DupExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrTimeFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrTimeFlags(@NotNull vfrParser.VfrTimeFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrTimeFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrTimeFlags(@NotNull vfrParser.VfrTimeFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#guidDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGuidDefinition(@NotNull vfrParser.GuidDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#guidDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGuidDefinition(@NotNull vfrParser.GuidDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#securityExp}.
	 * @param ctx the parse tree
	 */
	void enterSecurityExp(@NotNull vfrParser.SecurityExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#securityExp}.
	 * @param ctx the parse tree
	 */
	void exitSecurityExp(@NotNull vfrParser.SecurityExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(@NotNull vfrParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(@NotNull vfrParser.ConditionalExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementSubTitle}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementSubTitle(@NotNull vfrParser.VfrStatementSubTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementSubTitle}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementSubTitle(@NotNull vfrParser.VfrStatementSubTitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementTime}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementTime(@NotNull vfrParser.VfrStatementTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementTime}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementTime(@NotNull vfrParser.VfrStatementTimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrOneOfOptionFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrOneOfOptionFlags(@NotNull vfrParser.VfrOneOfOptionFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrOneOfOptionFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrOneOfOptionFlags(@NotNull vfrParser.VfrOneOfOptionFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementDisableIfQuest}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementDisableIfQuest(@NotNull vfrParser.VfrStatementDisableIfQuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementDisableIfQuest}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementDisableIfQuest(@NotNull vfrParser.VfrStatementDisableIfQuestContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementCheckBox}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementCheckBox(@NotNull vfrParser.VfrStatementCheckBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementCheckBox}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementCheckBox(@NotNull vfrParser.VfrStatementCheckBoxContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#actionFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterActionFlagsField(@NotNull vfrParser.ActionFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#actionFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitActionFlagsField(@NotNull vfrParser.ActionFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#multdivmodTerm}.
	 * @param ctx the parse tree
	 */
	void enterMultdivmodTerm(@NotNull vfrParser.MultdivmodTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#multdivmodTerm}.
	 * @param ctx the parse tree
	 */
	void exitMultdivmodTerm(@NotNull vfrParser.MultdivmodTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#rulerefExp}.
	 * @param ctx the parse tree
	 */
	void enterRulerefExp(@NotNull vfrParser.RulerefExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#rulerefExp}.
	 * @param ctx the parse tree
	 */
	void exitRulerefExp(@NotNull vfrParser.RulerefExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementAction}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementAction(@NotNull vfrParser.VfrStatementActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementAction}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementAction(@NotNull vfrParser.VfrStatementActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#compareTerm}.
	 * @param ctx the parse tree
	 */
	void enterCompareTerm(@NotNull vfrParser.CompareTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#compareTerm}.
	 * @param ctx the parse tree
	 */
	void exitCompareTerm(@NotNull vfrParser.CompareTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrConstantValueField}.
	 * @param ctx the parse tree
	 */
	void enterVfrConstantValueField(@NotNull vfrParser.VfrConstantValueFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrConstantValueField}.
	 * @param ctx the parse tree
	 */
	void exitVfrConstantValueField(@NotNull vfrParser.VfrConstantValueFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStatTag}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStatTag(@NotNull vfrParser.VfrStatementStatTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStatTag}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStatTag(@NotNull vfrParser.VfrStatementStatTagContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrGotoFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrGotoFlags(@NotNull vfrParser.VfrGotoFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrGotoFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrGotoFlags(@NotNull vfrParser.VfrGotoFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementNumericType}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementNumericType(@NotNull vfrParser.VfrStatementNumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementNumericType}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementNumericType(@NotNull vfrParser.VfrStatementNumericTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExtensionData}.
	 * @param ctx the parse tree
	 */
	void enterVfrExtensionData(@NotNull vfrParser.VfrExtensionDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExtensionData}.
	 * @param ctx the parse tree
	 */
	void exitVfrExtensionData(@NotNull vfrParser.VfrExtensionDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStorageVarId}.
	 * @param ctx the parse tree
	 */
	void enterVfrStorageVarId(@NotNull vfrParser.VfrStorageVarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStorageVarId}.
	 * @param ctx the parse tree
	 */
	void exitVfrStorageVarId(@NotNull vfrParser.VfrStorageVarIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrPasswordFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterVfrPasswordFlagsField(@NotNull vfrParser.VfrPasswordFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrPasswordFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitVfrPasswordFlagsField(@NotNull vfrParser.VfrPasswordFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#midExp}.
	 * @param ctx the parse tree
	 */
	void enterMidExp(@NotNull vfrParser.MidExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#midExp}.
	 * @param ctx the parse tree
	 */
	void exitMidExp(@NotNull vfrParser.MidExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementDate}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementDate(@NotNull vfrParser.VfrStatementDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementDate}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementDate(@NotNull vfrParser.VfrStatementDateContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#toboolExp}.
	 * @param ctx the parse tree
	 */
	void enterToboolExp(@NotNull vfrParser.ToboolExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#toboolExp}.
	 * @param ctx the parse tree
	 */
	void exitToboolExp(@NotNull vfrParser.ToboolExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementOneOf}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementOneOf(@NotNull vfrParser.VfrStatementOneOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementOneOf}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementOneOf(@NotNull vfrParser.VfrStatementOneOfContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrImageTag}.
	 * @param ctx the parse tree
	 */
	void enterVfrImageTag(@NotNull vfrParser.VfrImageTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrImageTag}.
	 * @param ctx the parse tree
	 */
	void exitVfrImageTag(@NotNull vfrParser.VfrImageTagContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrQuestionDataFieldName}.
	 * @param ctx the parse tree
	 */
	void enterVfrQuestionDataFieldName(@NotNull vfrParser.VfrQuestionDataFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrQuestionDataFieldName}.
	 * @param ctx the parse tree
	 */
	void exitVfrQuestionDataFieldName(@NotNull vfrParser.VfrQuestionDataFieldNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#subtitleFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterSubtitleFlagsField(@NotNull vfrParser.SubtitleFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#subtitleFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitSubtitleFlagsField(@NotNull vfrParser.SubtitleFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#passwordFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFlagsField(@NotNull vfrParser.PasswordFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#passwordFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFlagsField(@NotNull vfrParser.PasswordFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#pushthisExp}.
	 * @param ctx the parse tree
	 */
	void enterPushthisExp(@NotNull vfrParser.PushthisExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#pushthisExp}.
	 * @param ctx the parse tree
	 */
	void exitPushthisExp(@NotNull vfrParser.PushthisExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#bitwisenotExp}.
	 * @param ctx the parse tree
	 */
	void enterBitwisenotExp(@NotNull vfrParser.BitwisenotExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#bitwisenotExp}.
	 * @param ctx the parse tree
	 */
	void exitBitwisenotExp(@NotNull vfrParser.BitwisenotExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStringFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterVfrStringFlagsField(@NotNull vfrParser.VfrStringFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStringFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitVfrStringFlagsField(@NotNull vfrParser.VfrStringFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementOrderedList}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementOrderedList(@NotNull vfrParser.VfrStatementOrderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementOrderedList}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementOrderedList(@NotNull vfrParser.VfrStatementOrderedListContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementCrossReference}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementCrossReference(@NotNull vfrParser.VfrStatementCrossReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementCrossReference}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementCrossReference(@NotNull vfrParser.VfrStatementCrossReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementQuestionTagList}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementQuestionTagList(@NotNull vfrParser.VfrStatementQuestionTagListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementQuestionTagList}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementQuestionTagList(@NotNull vfrParser.VfrStatementQuestionTagListContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionBuildInFunction}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionBuildInFunction(@NotNull vfrParser.VfrExpressionBuildInFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionBuildInFunction}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionBuildInFunction(@NotNull vfrParser.VfrExpressionBuildInFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionMap}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionMap(@NotNull vfrParser.VfrExpressionMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionMap}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionMap(@NotNull vfrParser.VfrExpressionMapContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#dateFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterDateFlagsField(@NotNull vfrParser.DateFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#dateFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitDateFlagsField(@NotNull vfrParser.DateFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementBooleanType}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementBooleanType(@NotNull vfrParser.VfrStatementBooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementBooleanType}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementBooleanType(@NotNull vfrParser.VfrStatementBooleanTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStat}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStat(@NotNull vfrParser.VfrStatementStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStat}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStat(@NotNull vfrParser.VfrStatementStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementSuppressIfQuest}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementSuppressIfQuest(@NotNull vfrParser.VfrStatementSuppressIfQuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementSuppressIfQuest}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementSuppressIfQuest(@NotNull vfrParser.VfrStatementSuppressIfQuestContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementExpression}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementExpression(@NotNull vfrParser.VfrStatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementExpression}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementExpression(@NotNull vfrParser.VfrStatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementImage}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementImage(@NotNull vfrParser.VfrStatementImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementImage}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementImage(@NotNull vfrParser.VfrStatementImageContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementConditional}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementConditional(@NotNull vfrParser.VfrStatementConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementConditional}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementConditional(@NotNull vfrParser.VfrStatementConditionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#bitwiseandTerm}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseandTerm(@NotNull vfrParser.BitwiseandTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#bitwiseandTerm}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseandTerm(@NotNull vfrParser.BitwiseandTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementRefreshEvent}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementRefreshEvent(@NotNull vfrParser.VfrStatementRefreshEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementRefreshEvent}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementRefreshEvent(@NotNull vfrParser.VfrStatementRefreshEventContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementResetButton}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementResetButton(@NotNull vfrParser.VfrStatementResetButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementResetButton}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementResetButton(@NotNull vfrParser.VfrStatementResetButtonContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#questionref1Exp}.
	 * @param ctx the parse tree
	 */
	void enterQuestionref1Exp(@NotNull vfrParser.Questionref1ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#questionref1Exp}.
	 * @param ctx the parse tree
	 */
	void exitQuestionref1Exp(@NotNull vfrParser.Questionref1ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementNumeric}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementNumeric(@NotNull vfrParser.VfrStatementNumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementNumeric}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementNumeric(@NotNull vfrParser.VfrStatementNumericContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#andTerm}.
	 * @param ctx the parse tree
	 */
	void enterAndTerm(@NotNull vfrParser.AndTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#andTerm}.
	 * @param ctx the parse tree
	 */
	void exitAndTerm(@NotNull vfrParser.AndTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#lengthExp}.
	 * @param ctx the parse tree
	 */
	void enterLengthExp(@NotNull vfrParser.LengthExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#lengthExp}.
	 * @param ctx the parse tree
	 */
	void exitLengthExp(@NotNull vfrParser.LengthExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrSetMinMaxStep}.
	 * @param ctx the parse tree
	 */
	void enterVfrSetMinMaxStep(@NotNull vfrParser.VfrSetMinMaxStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrSetMinMaxStep}.
	 * @param ctx the parse tree
	 */
	void exitVfrSetMinMaxStep(@NotNull vfrParser.VfrSetMinMaxStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionCatenate}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionCatenate(@NotNull vfrParser.VfrExpressionCatenateContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionCatenate}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionCatenate(@NotNull vfrParser.VfrExpressionCatenateContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementModal}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementModal(@NotNull vfrParser.VfrStatementModalContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementModal}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementModal(@NotNull vfrParser.VfrStatementModalContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementRefresh}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementRefresh(@NotNull vfrParser.VfrStatementRefreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementRefresh}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementRefresh(@NotNull vfrParser.VfrStatementRefreshContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#checkboxFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterCheckboxFlagsField(@NotNull vfrParser.CheckboxFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#checkboxFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitCheckboxFlagsField(@NotNull vfrParser.CheckboxFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#shiftTerm}.
	 * @param ctx the parse tree
	 */
	void enterShiftTerm(@NotNull vfrParser.ShiftTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#shiftTerm}.
	 * @param ctx the parse tree
	 */
	void exitShiftTerm(@NotNull vfrParser.ShiftTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#spanExp}.
	 * @param ctx the parse tree
	 */
	void enterSpanExp(@NotNull vfrParser.SpanExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#spanExp}.
	 * @param ctx the parse tree
	 */
	void exitSpanExp(@NotNull vfrParser.SpanExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#unintExp}.
	 * @param ctx the parse tree
	 */
	void enterUnintExp(@NotNull vfrParser.UnintExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#unintExp}.
	 * @param ctx the parse tree
	 */
	void exitUnintExp(@NotNull vfrParser.UnintExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementOneOfOption}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementOneOfOption(@NotNull vfrParser.VfrStatementOneOfOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementOneOfOption}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementOneOfOption(@NotNull vfrParser.VfrStatementOneOfOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStaticText}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStaticText(@NotNull vfrParser.VfrStatementStaticTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStaticText}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStaticText(@NotNull vfrParser.VfrStatementStaticTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#getExp}.
	 * @param ctx the parse tree
	 */
	void enterGetExp(@NotNull vfrParser.GetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#getExp}.
	 * @param ctx the parse tree
	 */
	void exitGetExp(@NotNull vfrParser.GetExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#staticTextFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterStaticTextFlagsField(@NotNull vfrParser.StaticTextFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#staticTextFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitStaticTextFlagsField(@NotNull vfrParser.StaticTextFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#question23refExp}.
	 * @param ctx the parse tree
	 */
	void enterQuestion23refExp(@NotNull vfrParser.Question23refExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#question23refExp}.
	 * @param ctx the parse tree
	 */
	void exitQuestion23refExp(@NotNull vfrParser.Question23refExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#orderedlistFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterOrderedlistFlagsField(@NotNull vfrParser.OrderedlistFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#orderedlistFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitOrderedlistFlagsField(@NotNull vfrParser.OrderedlistFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#castTerm}.
	 * @param ctx the parse tree
	 */
	void enterCastTerm(@NotNull vfrParser.CastTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#castTerm}.
	 * @param ctx the parse tree
	 */
	void exitCastTerm(@NotNull vfrParser.CastTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementQuestionOptionTag}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementQuestionOptionTag(@NotNull vfrParser.VfrStatementQuestionOptionTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementQuestionOptionTag}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementQuestionOptionTag(@NotNull vfrParser.VfrStatementQuestionOptionTagContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#atomTerm}.
	 * @param ctx the parse tree
	 */
	void enterAtomTerm(@NotNull vfrParser.AtomTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#atomTerm}.
	 * @param ctx the parse tree
	 */
	void exitAtomTerm(@NotNull vfrParser.AtomTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrOrderedListFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrOrderedListFlags(@NotNull vfrParser.VfrOrderedListFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrOrderedListFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrOrderedListFlags(@NotNull vfrParser.VfrOrderedListFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrQuestionHeader}.
	 * @param ctx the parse tree
	 */
	void enterVfrQuestionHeader(@NotNull vfrParser.VfrQuestionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrQuestionHeader}.
	 * @param ctx the parse tree
	 */
	void exitVfrQuestionHeader(@NotNull vfrParser.VfrQuestionHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#toupperExp}.
	 * @param ctx the parse tree
	 */
	void enterToupperExp(@NotNull vfrParser.ToupperExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#toupperExp}.
	 * @param ctx the parse tree
	 */
	void exitToupperExp(@NotNull vfrParser.ToupperExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementBanner}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementBanner(@NotNull vfrParser.VfrStatementBannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementBanner}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementBanner(@NotNull vfrParser.VfrStatementBannerContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#minMaxDateStepDefault}.
	 * @param ctx the parse tree
	 */
	void enterMinMaxDateStepDefault(@NotNull vfrParser.MinMaxDateStepDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#minMaxDateStepDefault}.
	 * @param ctx the parse tree
	 */
	void exitMinMaxDateStepDefault(@NotNull vfrParser.MinMaxDateStepDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#tostringExp}.
	 * @param ctx the parse tree
	 */
	void enterTostringExp(@NotNull vfrParser.TostringExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#tostringExp}.
	 * @param ctx the parse tree
	 */
	void exitTostringExp(@NotNull vfrParser.TostringExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#ideqvalExp}.
	 * @param ctx the parse tree
	 */
	void enterIdeqvalExp(@NotNull vfrParser.IdeqvalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#ideqvalExp}.
	 * @param ctx the parse tree
	 */
	void exitIdeqvalExp(@NotNull vfrParser.IdeqvalExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementExtension}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementExtension(@NotNull vfrParser.VfrStatementExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementExtension}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementExtension(@NotNull vfrParser.VfrStatementExtensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#questionheaderFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterQuestionheaderFlagsField(@NotNull vfrParser.QuestionheaderFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#questionheaderFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitQuestionheaderFlagsField(@NotNull vfrParser.QuestionheaderFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementGrayOutIfStat}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementGrayOutIfStat(@NotNull vfrParser.VfrStatementGrayOutIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementGrayOutIfStat}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementGrayOutIfStat(@NotNull vfrParser.VfrStatementGrayOutIfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#stringref2Exp}.
	 * @param ctx the parse tree
	 */
	void enterStringref2Exp(@NotNull vfrParser.Stringref2ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#stringref2Exp}.
	 * @param ctx the parse tree
	 */
	void exitStringref2Exp(@NotNull vfrParser.Stringref2ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementSuppressIfStat}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementSuppressIfStat(@NotNull vfrParser.VfrStatementSuppressIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementSuppressIfStat}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementSuppressIfStat(@NotNull vfrParser.VfrStatementSuppressIfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementOptions}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementOptions(@NotNull vfrParser.VfrStatementOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementOptions}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementOptions(@NotNull vfrParser.VfrStatementOptionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionConstant(@NotNull vfrParser.VfrExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionConstant(@NotNull vfrParser.VfrExpressionConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#setExp}.
	 * @param ctx the parse tree
	 */
	void enterSetExp(@NotNull vfrParser.SetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#setExp}.
	 * @param ctx the parse tree
	 */
	void exitSetExp(@NotNull vfrParser.SetExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionMatch}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionMatch(@NotNull vfrParser.VfrExpressionMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionMatch}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionMatch(@NotNull vfrParser.VfrExpressionMatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#gotoFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterGotoFlagsField(@NotNull vfrParser.GotoFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#gotoFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitGotoFlagsField(@NotNull vfrParser.GotoFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionUnaryOp}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionUnaryOp(@NotNull vfrParser.VfrExpressionUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionUnaryOp}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionUnaryOp(@NotNull vfrParser.VfrExpressionUnaryOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementVarstoreDevice}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementVarstoreDevice(@NotNull vfrParser.VfrStatementVarstoreDeviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementVarstoreDevice}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementVarstoreDevice(@NotNull vfrParser.VfrStatementVarstoreDeviceContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrNumericFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrNumericFlags(@NotNull vfrParser.VfrNumericFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrNumericFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrNumericFlags(@NotNull vfrParser.VfrNumericFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStatTagList}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStatTagList(@NotNull vfrParser.VfrStatementStatTagListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStatTagList}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStatTagList(@NotNull vfrParser.VfrStatementStatTagListContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementInconsistentIf}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementInconsistentIf(@NotNull vfrParser.VfrStatementInconsistentIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementInconsistentIf}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementInconsistentIf(@NotNull vfrParser.VfrStatementInconsistentIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStatList}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStatList(@NotNull vfrParser.VfrStatementStatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStatList}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStatList(@NotNull vfrParser.VfrStatementStatListContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#stringFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterStringFlagsField(@NotNull vfrParser.StringFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#stringFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitStringFlagsField(@NotNull vfrParser.StringFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#getStringId}.
	 * @param ctx the parse tree
	 */
	void enterGetStringId(@NotNull vfrParser.GetStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#getStringId}.
	 * @param ctx the parse tree
	 */
	void exitGetStringId(@NotNull vfrParser.GetStringIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementLocked}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementLocked(@NotNull vfrParser.VfrStatementLockedContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementLocked}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementLocked(@NotNull vfrParser.VfrStatementLockedContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementQuestionOptionList}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementQuestionOptionList(@NotNull vfrParser.VfrStatementQuestionOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementQuestionOptionList}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementQuestionOptionList(@NotNull vfrParser.VfrStatementQuestionOptionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#ideqidExp}.
	 * @param ctx the parse tree
	 */
	void enterIdeqidExp(@NotNull vfrParser.IdeqidExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#ideqidExp}.
	 * @param ctx the parse tree
	 */
	void exitIdeqidExp(@NotNull vfrParser.IdeqidExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementLabel}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementLabel(@NotNull vfrParser.VfrStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementLabel}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementLabel(@NotNull vfrParser.VfrStatementLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementDisableIfStat}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementDisableIfStat(@NotNull vfrParser.VfrStatementDisableIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementDisableIfStat}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementDisableIfStat(@NotNull vfrParser.VfrStatementDisableIfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#numericFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterNumericFlagsField(@NotNull vfrParser.NumericFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#numericFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitNumericFlagsField(@NotNull vfrParser.NumericFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementHeader}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementHeader(@NotNull vfrParser.VfrStatementHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementHeader}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementHeader(@NotNull vfrParser.VfrStatementHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementGoto}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementGoto(@NotNull vfrParser.VfrStatementGotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementGoto}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementGoto(@NotNull vfrParser.VfrStatementGotoContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementRules}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementRules(@NotNull vfrParser.VfrStatementRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementRules}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementRules(@NotNull vfrParser.VfrStatementRulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#timeFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterTimeFlagsField(@NotNull vfrParser.TimeFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#timeFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitTimeFlagsField(@NotNull vfrParser.TimeFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#tokenExp}.
	 * @param ctx the parse tree
	 */
	void enterTokenExp(@NotNull vfrParser.TokenExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#tokenExp}.
	 * @param ctx the parse tree
	 */
	void exitTokenExp(@NotNull vfrParser.TokenExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#findFormat}.
	 * @param ctx the parse tree
	 */
	void enterFindFormat(@NotNull vfrParser.FindFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#findFormat}.
	 * @param ctx the parse tree
	 */
	void exitFindFormat(@NotNull vfrParser.FindFormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#bitwiseorTerm}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseorTerm(@NotNull vfrParser.BitwiseorTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#bitwiseorTerm}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseorTerm(@NotNull vfrParser.BitwiseorTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementString}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementString(@NotNull vfrParser.VfrStatementStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementString}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementString(@NotNull vfrParser.VfrStatementStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrSubtitleFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrSubtitleFlags(@NotNull vfrParser.VfrSubtitleFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrSubtitleFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrSubtitleFlags(@NotNull vfrParser.VfrSubtitleFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrLockedTag}.
	 * @param ctx the parse tree
	 */
	void enterVfrLockedTag(@NotNull vfrParser.VfrLockedTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrLockedTag}.
	 * @param ctx the parse tree
	 */
	void exitVfrLockedTag(@NotNull vfrParser.VfrLockedTagContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementQuestions}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementQuestions(@NotNull vfrParser.VfrStatementQuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementQuestions}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementQuestions(@NotNull vfrParser.VfrStatementQuestionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#minMaxTimeStepDefault}.
	 * @param ctx the parse tree
	 */
	void enterMinMaxTimeStepDefault(@NotNull vfrParser.MinMaxTimeStepDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#minMaxTimeStepDefault}.
	 * @param ctx the parse tree
	 */
	void exitMinMaxTimeStepDefault(@NotNull vfrParser.MinMaxTimeStepDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementValue(@NotNull vfrParser.VfrStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementValue(@NotNull vfrParser.VfrStatementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementWrite}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementWrite(@NotNull vfrParser.VfrStatementWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementWrite}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementWrite(@NotNull vfrParser.VfrStatementWriteContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#stringref1Exp}.
	 * @param ctx the parse tree
	 */
	void enterStringref1Exp(@NotNull vfrParser.Stringref1ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#stringref1Exp}.
	 * @param ctx the parse tree
	 */
	void exitStringref1Exp(@NotNull vfrParser.Stringref1ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#oneofoptionFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterOneofoptionFlagsField(@NotNull vfrParser.OneofoptionFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#oneofoptionFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitOneofoptionFlagsField(@NotNull vfrParser.OneofoptionFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementStringType}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementStringType(@NotNull vfrParser.VfrStatementStringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementStringType}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementStringType(@NotNull vfrParser.VfrStatementStringTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrActionFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrActionFlags(@NotNull vfrParser.VfrActionFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrActionFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrActionFlags(@NotNull vfrParser.VfrActionFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrExpressionParen}.
	 * @param ctx the parse tree
	 */
	void enterVfrExpressionParen(@NotNull vfrParser.VfrExpressionParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrExpressionParen}.
	 * @param ctx the parse tree
	 */
	void exitVfrExpressionParen(@NotNull vfrParser.VfrExpressionParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#equalTerm}.
	 * @param ctx the parse tree
	 */
	void enterEqualTerm(@NotNull vfrParser.EqualTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#equalTerm}.
	 * @param ctx the parse tree
	 */
	void exitEqualTerm(@NotNull vfrParser.EqualTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementDefault}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementDefault(@NotNull vfrParser.VfrStatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementDefault}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementDefault(@NotNull vfrParser.VfrStatementDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#tolwerExp}.
	 * @param ctx the parse tree
	 */
	void enterTolwerExp(@NotNull vfrParser.TolwerExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#tolwerExp}.
	 * @param ctx the parse tree
	 */
	void exitTolwerExp(@NotNull vfrParser.TolwerExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrOneofFlagsField}.
	 * @param ctx the parse tree
	 */
	void enterVfrOneofFlagsField(@NotNull vfrParser.VfrOneofFlagsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrOneofFlagsField}.
	 * @param ctx the parse tree
	 */
	void exitVfrOneofFlagsField(@NotNull vfrParser.VfrOneofFlagsFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementQuestionTag}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementQuestionTag(@NotNull vfrParser.VfrStatementQuestionTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementQuestionTag}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementQuestionTag(@NotNull vfrParser.VfrStatementQuestionTagContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementRead}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementRead(@NotNull vfrParser.VfrStatementReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementRead}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementRead(@NotNull vfrParser.VfrStatementReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrStatementNoSubmitIf}.
	 * @param ctx the parse tree
	 */
	void enterVfrStatementNoSubmitIf(@NotNull vfrParser.VfrStatementNoSubmitIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrStatementNoSubmitIf}.
	 * @param ctx the parse tree
	 */
	void exitVfrStatementNoSubmitIf(@NotNull vfrParser.VfrStatementNoSubmitIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrFormDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVfrFormDefinition(@NotNull vfrParser.VfrFormDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrFormDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVfrFormDefinition(@NotNull vfrParser.VfrFormDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#vfrCheckBoxFlags}.
	 * @param ctx the parse tree
	 */
	void enterVfrCheckBoxFlags(@NotNull vfrParser.VfrCheckBoxFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#vfrCheckBoxFlags}.
	 * @param ctx the parse tree
	 */
	void exitVfrCheckBoxFlags(@NotNull vfrParser.VfrCheckBoxFlagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link vfrParser#ideqvallistExp}.
	 * @param ctx the parse tree
	 */
	void enterIdeqvallistExp(@NotNull vfrParser.IdeqvallistExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vfrParser#ideqvallistExp}.
	 * @param ctx the parse tree
	 */
	void exitIdeqvallistExp(@NotNull vfrParser.IdeqvallistExpContext ctx);
}