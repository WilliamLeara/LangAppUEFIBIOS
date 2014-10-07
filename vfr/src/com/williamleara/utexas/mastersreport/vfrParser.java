package com.williamleara.utexas.mastersreport;

//Generated from vfr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vfrParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Form=1, EndForm=2, FormId=3, Title=4, Rule=5, EndRule=6, Catenate=7, Match=8, 
		Dup=9, Ideqval=10, Ideqid=11, Ideqvallist=12, Questionref=13, Ruleref=14, 
		Stringref=15, Pushthis=16, Security=17, Get=18, Flags=19, Length=20, Questionrefval=21, 
		StringToken=22, Stringrefval=23, Boolval=24, Stringval=25, Unintval=26, 
		Toupper=27, Tolower=28, Set=29, Cond=30, Find=31, Sensitive=32, Insensitive=33, 
		Mid=34, Token=35, Span=36, Map=37, FirstNonMatch=38, LastNonMatch=39, 
		Image=40, ImageToken=41, Locked=42, Format=43, Uuid=44, DevicePath=45, 
		S=46, Default=47, DefaultStore=48, Value=49, Year=50, Help=51, Month=52, 
		Prompt=53, Varid=54, EndDate=55, Minimum=56, Maximum=57, Step=58, Date=59, 
		Name=60, QuestionId=61, EndIf=62, InconsistentIf=63, SuppressIf=64, Read=65, 
		Write=66, Option=67, Text=68, NoSubmitIf=69, DisableIf=70, Refresh=71, 
		Interval=72, VarStoreDevice=73, RefreshGuid=74, Checkbox=75, EndCheckbox=76, 
		Key=77, Action=78, EndAction=79, Config=80, Subtitle=81, Horizontal=82, 
		ResetButton=83, EndResetButton=84, Goto=85, FormsetGuid=86, Question=87, 
		Numeric=88, Endnumeric=89, Oneof=90, EndOneof=91, Day=92, Hour=93, Minute=94, 
		Second=95, Time=96, Endtime=97, MultiLine=98, String=99, EndString=100, 
		MinSize=101, MaxSize=102, Password=103, Endpassword=104, Orderedlist=105, 
		Endlist=106, Maxcontainers=107, Unique=108, Noempty=109, GrayoutIf=110, 
		Label=111, Banner=112, Line=113, Align=114, Left=115, Right=116, Center=117, 
		Timeout=118, Guidop=119, EndGuidop=120, Guid=121, Data=122, Datatype=123, 
		Modal=124, Or=125, And=126, Not=127, Equals=128, EqualsEquals=129, NotEquals=130, 
		Comma=131, SemiColon=132, OrBitwise=133, AndBitwise=134, NotBitwise=135, 
		LessThan=136, LessThanEquals=137, GreaterThan=138, GreaterThanEquals=139, 
		ShiftLeft=140, ShiftRight=141, Plus=142, Minus=143, Multiply=144, Divide=145, 
		Modulus=146, LParen=147, RParen=148, LBrace=149, RBrace=150, QuestionMark=151, 
		Colon=152, Period=153, LBracket=154, RBracket=155, BackSlash=156, BOOLEAN=157, 
		UINT64=158, UINT32=159, UINT16=160, UINT8=161, TRUE=162, FALSE=163, ONE=164, 
		ONES=165, ZERO=166, UNDEFINED=167, VERSION=168, Number=169, StringIdentifier=170, 
		Hex8=171, Hex4=172, Hex2=173, NumSize1=174, NumSize2=175, NumSize4=176, 
		NumSize8=177, DispIntDec=178, DispUintDec=179, DispUintHex=180, ReadOnly=181, 
		Interactive=182, ResetRequired=183, OptionsOnly=184, YearSuppress=185, 
		MonthSuppress=186, DaySuppress=187, StorageNormal=188, StorageTime=189, 
		StorageWakeup=190, OptionDefault=191, OptionDefaultMfg=192, CheckboxDefault=193, 
		CheckboxDefaultMfg=194, HourSuppress=195, MinuteSuppress=196, SecondSuppress=197, 
		EfiStringId=198, EfiHiiDate=199, EfiHiiTime=200, EfiHiiRef=201, Whitespace=202, 
		Newline=203, BlockComment=204, LineComment=205;
	public static final String[] tokenNames = {
		"<INVALID>", "'form'", "'endform'", "'formid'", "'title'", "'rule'", "'endrule'", 
		"'catenate'", "'match'", "'dup'", "'ideqval'", "'ideqid'", "'ideqvallist'", 
		"'questionref'", "'ruleref'", "'stringref'", "'pushthis'", "'security'", 
		"'get'", "'flags'", "'length'", "'questionrefval'", "'STRING_TOKEN'", 
		"'stringrefval'", "'boolval'", "'stringval'", "'unintval'", "'toupper'", 
		"'tolower'", "'set'", "'cond'", "'find'", "'SENSITIVE'", "'INSENSITIVE'", 
		"'mid'", "'token'", "'span'", "'map'", "'FIRST_NON_MATCH'", "'LAST_NON_MATCH'", 
		"'image'", "'IMAGE_TOKEN'", "'locked'", "'format'", "'Uuid'", "'DevicePath'", 
		"'S:'", "'default'", "DefaultStore", "'value'", "'year'", "'help'", "'month'", 
		"'prompt'", "'varid'", "'enddate'", "'minimum'", "'maximum'", "'step'", 
		"'date'", "'name'", "'questionid'", "'endif'", "'inconsistentif'", "'suppressif'", 
		"'read'", "'write'", "'option'", "'text'", "'nosubmitif'", "'disableif'", 
		"'refresh'", "'interval'", "'varstoredevice'", "'refreshguid'", "'checkbox'", 
		"'endcheckbox'", "'key'", "'action'", "'endaction'", "'config'", "'subtitle'", 
		"'HORIZONTAL'", "'resetbutton'", "'endresetbutton'", "'goto'", "'formsetguid'", 
		"'question'", "'numeric'", "'endnumeric'", "'oneof'", "'endoneof'", "'day'", 
		"'hour'", "'minute'", "'second'", "'time'", "'endtime'", "'MULTI_LINE'", 
		"'string'", "'endstring'", "'minsize'", "'maxsize'", "'password'", "'endpassword'", 
		"'orderedlist'", "'endlist'", "'maxcontainers'", "'UNIQUE'", "'NOEMPTY'", 
		"'grayoutif'", "'label'", "'banner'", "'line'", "'align'", "'left'", "'right'", 
		"'center'", "'timeout'", "'guidop'", "'endguidop'", "'guid'", "'data'", 
		"'datatype'", "'modal'", "'OR'", "'AND'", "'NOT'", "'='", "'=='", "'!='", 
		"','", "';'", "'|'", "'&'", "'~'", "'<'", "'<='", "'>'", "'>='", "'<<'", 
		"'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'{'", "'}'", 
		"'?'", "':'", "'.'", "'['", "']'", "'\\'", "'BOOLEAN'", "'UINT64'", "'UINT32'", 
		"'UINT16'", "'UINT8'", "'TRUE'", "'FALSE'", "'ONE'", "'ONES'", "'ZERO'", 
		"'UNDEFINED'", "'VERSION'", "Number", "StringIdentifier", "Hex8", "Hex4", 
		"Hex2", "'NUMERIC_SIZE_1'", "'NUMERIC_SIZE_2'", "'NUMERIC_SIZE_4'", "'NUMERIC_SIZE_8'", 
		"'DISPLAY_INT_DEC'", "'DISPLAY_UINT_DEC'", "'DISPLAY_UINT_HEX'", "'READ_ONLY'", 
		"'INTERACTIVE'", "'RESET_REQUIRED'", "'OPTIONS_ONLY'", "'YEAR_SUPPRESS'", 
		"'MONTH_SUPPRESS'", "'DAY_SUPPRESS'", "'STORAGE_NORMAL'", "'STORAGE_TIME'", 
		"'STORAGE_WAKEUP'", "'OPTION_DEFAULT'", "'OPTION_DEFAULT_MFG'", "'CHECKBOX_DEFAULT'", 
		"'CHECKBOX_DEFAULT_MFG'", "'HOUR_SUPPRESS'", "'MINUTE_SUPPRESS'", "'SECOND_SUPPRESS'", 
		"'EFI_STRING_ID'", "'EFI_HII_DATE'", "'EFI_HII_TIME'", "'EFI_HII_REF'", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final int
		RULE_vfrFormDefinition = 0, RULE_vfrStatementStat = 1, RULE_vfrStatementCrossReference = 2, 
		RULE_vfrStatementGoto = 3, RULE_vfrGotoFlags = 4, RULE_gotoFlagsField = 5, 
		RULE_vfrStatementResetButton = 6, RULE_vfrStatementStatTagList = 7, RULE_vfrStatementStaticText = 8, 
		RULE_staticTextFlagsField = 9, RULE_vfrStatementSubTitle = 10, RULE_vfrSubtitleFlags = 11, 
		RULE_subtitleFlagsField = 12, RULE_getStringId = 13, RULE_vfrStatementImage = 14, 
		RULE_vfrImageTag = 15, RULE_vfrStatementLocked = 16, RULE_vfrLockedTag = 17, 
		RULE_vfrStatementRules = 18, RULE_vfrStatementModal = 19, RULE_vfrStatementExtension = 20, 
		RULE_vfrExtensionData = 21, RULE_vfrStatementBanner = 22, RULE_vfrStatementConditional = 23, 
		RULE_vfrStatementDisableIfStat = 24, RULE_vfrStatementSuppressIfStat = 25, 
		RULE_vfrStatementGrayOutIfStat = 26, RULE_vfrStatementStatList = 27, RULE_vfrStatementLabel = 28, 
		RULE_vfrStatementStatTag = 29, RULE_vfrStatementQuestions = 30, RULE_vfrStatementTime = 31, 
		RULE_minMaxTimeStepDefault = 32, RULE_vfrTimeFlags = 33, RULE_timeFlagsField = 34, 
		RULE_vfrStatementOrderedList = 35, RULE_vfrOrderedListFlags = 36, RULE_orderedlistFlagsField = 37, 
		RULE_vfrStatementStringType = 38, RULE_vfrStatementPassword = 39, RULE_vfrPasswordFlagsField = 40, 
		RULE_passwordFlagsField = 41, RULE_vfrStatementString = 42, RULE_vfrStringFlagsField = 43, 
		RULE_stringFlagsField = 44, RULE_vfrStatementNumericType = 45, RULE_vfrStatementOneOf = 46, 
		RULE_vfrOneofFlagsField = 47, RULE_vfrStatementNumeric = 48, RULE_vfrSetMinMaxStep = 49, 
		RULE_vfrNumericFlags = 50, RULE_numericFlagsField = 51, RULE_vfrStatementDate = 52, 
		RULE_vfrStatementInconsistentIf = 53, RULE_vfrStatementQuestionOptionList = 54, 
		RULE_vfrStatementQuestionOptionTag = 55, RULE_vfrStatementOptions = 56, 
		RULE_vfrStatementOneOfOption = 57, RULE_vfrOneOfOptionFlags = 58, RULE_oneofoptionFlagsField = 59, 
		RULE_vfrStatementRead = 60, RULE_vfrStatementWrite = 61, RULE_vfrStatementSuppressIfQuest = 62, 
		RULE_vfrStatementQuestionTag = 63, RULE_vfrStatementVarstoreDevice = 64, 
		RULE_vfrStatementRefreshEvent = 65, RULE_vfrStatementRefresh = 66, RULE_vfrStatementDisableIfQuest = 67, 
		RULE_vfrStatementNoSubmitIf = 68, RULE_vfrDateFlags = 69, RULE_dateFlagsField = 70, 
		RULE_vfrQuestionHeader = 71, RULE_vfrStatementHeader = 72, RULE_minMaxDateStepDefault = 73, 
		RULE_vfrStatementBooleanType = 74, RULE_vfrStatementCheckBox = 75, RULE_vfrCheckBoxFlags = 76, 
		RULE_checkboxFlagsField = 77, RULE_vfrStatementAction = 78, RULE_vfrStatementQuestionTagList = 79, 
		RULE_vfrActionFlags = 80, RULE_actionFlagsField = 81, RULE_vfrStatementDefault = 82, 
		RULE_vfrConstantValueField = 83, RULE_vfrStatementValue = 84, RULE_vfrStatementExpression = 85, 
		RULE_andTerm = 86, RULE_bitwiseorTerm = 87, RULE_bitwiseandTerm = 88, 
		RULE_equalTerm = 89, RULE_compareTerm = 90, RULE_shiftTerm = 91, RULE_addMinusTerm = 92, 
		RULE_multdivmodTerm = 93, RULE_castTerm = 94, RULE_atomTerm = 95, RULE_vfrExpressionCatenate = 96, 
		RULE_vfrExpressionMatch = 97, RULE_vfrExpressionParen = 98, RULE_vfrExpressionBuildInFunction = 99, 
		RULE_dupExp = 100, RULE_vfrQuestionDataFieldName = 101, RULE_ideqvalExp = 102, 
		RULE_ideqidExp = 103, RULE_ideqvallistExp = 104, RULE_questionref1Exp = 105, 
		RULE_rulerefExp = 106, RULE_stringref1Exp = 107, RULE_pushthisExp = 108, 
		RULE_securityExp = 109, RULE_getExp = 110, RULE_questionheaderFlagsField = 111, 
		RULE_vfrExpressionConstant = 112, RULE_vfrExpressionUnaryOp = 113, RULE_lengthExp = 114, 
		RULE_bitwisenotExp = 115, RULE_question23refExp = 116, RULE_stringref2Exp = 117, 
		RULE_toboolExp = 118, RULE_tostringExp = 119, RULE_unintExp = 120, RULE_toupperExp = 121, 
		RULE_tolwerExp = 122, RULE_setExp = 123, RULE_vfrStorageVarId = 124, RULE_vfrExpressionTernaryOp = 125, 
		RULE_conditionalExp = 126, RULE_findExp = 127, RULE_findFormat = 128, 
		RULE_midExp = 129, RULE_tokenExp = 130, RULE_spanExp = 131, RULE_spanFlags = 132, 
		RULE_vfrExpressionMap = 133, RULE_guidSubDefinition = 134, RULE_guidDefinition = 135;
	public static final String[] ruleNames = {
		"vfrFormDefinition", "vfrStatementStat", "vfrStatementCrossReference", 
		"vfrStatementGoto", "vfrGotoFlags", "gotoFlagsField", "vfrStatementResetButton", 
		"vfrStatementStatTagList", "vfrStatementStaticText", "staticTextFlagsField", 
		"vfrStatementSubTitle", "vfrSubtitleFlags", "subtitleFlagsField", "getStringId", 
		"vfrStatementImage", "vfrImageTag", "vfrStatementLocked", "vfrLockedTag", 
		"vfrStatementRules", "vfrStatementModal", "vfrStatementExtension", "vfrExtensionData", 
		"vfrStatementBanner", "vfrStatementConditional", "vfrStatementDisableIfStat", 
		"vfrStatementSuppressIfStat", "vfrStatementGrayOutIfStat", "vfrStatementStatList", 
		"vfrStatementLabel", "vfrStatementStatTag", "vfrStatementQuestions", "vfrStatementTime", 
		"minMaxTimeStepDefault", "vfrTimeFlags", "timeFlagsField", "vfrStatementOrderedList", 
		"vfrOrderedListFlags", "orderedlistFlagsField", "vfrStatementStringType", 
		"vfrStatementPassword", "vfrPasswordFlagsField", "passwordFlagsField", 
		"vfrStatementString", "vfrStringFlagsField", "stringFlagsField", "vfrStatementNumericType", 
		"vfrStatementOneOf", "vfrOneofFlagsField", "vfrStatementNumeric", "vfrSetMinMaxStep", 
		"vfrNumericFlags", "numericFlagsField", "vfrStatementDate", "vfrStatementInconsistentIf", 
		"vfrStatementQuestionOptionList", "vfrStatementQuestionOptionTag", "vfrStatementOptions", 
		"vfrStatementOneOfOption", "vfrOneOfOptionFlags", "oneofoptionFlagsField", 
		"vfrStatementRead", "vfrStatementWrite", "vfrStatementSuppressIfQuest", 
		"vfrStatementQuestionTag", "vfrStatementVarstoreDevice", "vfrStatementRefreshEvent", 
		"vfrStatementRefresh", "vfrStatementDisableIfQuest", "vfrStatementNoSubmitIf", 
		"vfrDateFlags", "dateFlagsField", "vfrQuestionHeader", "vfrStatementHeader", 
		"minMaxDateStepDefault", "vfrStatementBooleanType", "vfrStatementCheckBox", 
		"vfrCheckBoxFlags", "checkboxFlagsField", "vfrStatementAction", "vfrStatementQuestionTagList", 
		"vfrActionFlags", "actionFlagsField", "vfrStatementDefault", "vfrConstantValueField", 
		"vfrStatementValue", "vfrStatementExpression", "andTerm", "bitwiseorTerm", 
		"bitwiseandTerm", "equalTerm", "compareTerm", "shiftTerm", "addMinusTerm", 
		"multdivmodTerm", "castTerm", "atomTerm", "vfrExpressionCatenate", "vfrExpressionMatch", 
		"vfrExpressionParen", "vfrExpressionBuildInFunction", "dupExp", "vfrQuestionDataFieldName", 
		"ideqvalExp", "ideqidExp", "ideqvallistExp", "questionref1Exp", "rulerefExp", 
		"stringref1Exp", "pushthisExp", "securityExp", "getExp", "questionheaderFlagsField", 
		"vfrExpressionConstant", "vfrExpressionUnaryOp", "lengthExp", "bitwisenotExp", 
		"question23refExp", "stringref2Exp", "toboolExp", "tostringExp", "unintExp", 
		"toupperExp", "tolwerExp", "setExp", "vfrStorageVarId", "vfrExpressionTernaryOp", 
		"conditionalExp", "findExp", "findFormat", "midExp", "tokenExp", "spanExp", 
		"spanFlags", "vfrExpressionMap", "guidSubDefinition", "guidDefinition"
	};

	@Override
	public String getGrammarFileName() { return "vfr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vfrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VfrFormDefinitionContext extends ParserRuleContext {
		public VfrStatementExtensionContext vfrStatementExtension(int i) {
			return getRuleContext(VfrStatementExtensionContext.class,i);
		}
		public TerminalNode Form() { return getToken(vfrParser.Form, 0); }
		public TerminalNode EndForm() { return getToken(vfrParser.EndForm, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(vfrParser.SemiColon); }
		public List<VfrStatementBannerContext> vfrStatementBanner() {
			return getRuleContexts(VfrStatementBannerContext.class);
		}
		public VfrStatementStatContext vfrStatementStat(int i) {
			return getRuleContext(VfrStatementStatContext.class,i);
		}
		public VfrStatementQuestionsContext vfrStatementQuestions(int i) {
			return getRuleContext(VfrStatementQuestionsContext.class,i);
		}
		public TerminalNode SemiColon(int i) {
			return getToken(vfrParser.SemiColon, i);
		}
		public TerminalNode Title() { return getToken(vfrParser.Title, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode FormId() { return getToken(vfrParser.FormId, 0); }
		public List<VfrStatementRulesContext> vfrStatementRules() {
			return getRuleContexts(VfrStatementRulesContext.class);
		}
		public List<VfrStatementLockedContext> vfrStatementLocked() {
			return getRuleContexts(VfrStatementLockedContext.class);
		}
		public List<VfrStatementConditionalContext> vfrStatementConditional() {
			return getRuleContexts(VfrStatementConditionalContext.class);
		}
		public List<VfrStatementModalContext> vfrStatementModal() {
			return getRuleContexts(VfrStatementModalContext.class);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public List<VfrStatementImageContext> vfrStatementImage() {
			return getRuleContexts(VfrStatementImageContext.class);
		}
		public VfrStatementImageContext vfrStatementImage(int i) {
			return getRuleContext(VfrStatementImageContext.class,i);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public VfrStatementConditionalContext vfrStatementConditional(int i) {
			return getRuleContext(VfrStatementConditionalContext.class,i);
		}
		public VfrStatementModalContext vfrStatementModal(int i) {
			return getRuleContext(VfrStatementModalContext.class,i);
		}
		public List<VfrStatementQuestionsContext> vfrStatementQuestions() {
			return getRuleContexts(VfrStatementQuestionsContext.class);
		}
		public VfrStatementLabelContext vfrStatementLabel(int i) {
			return getRuleContext(VfrStatementLabelContext.class,i);
		}
		public VfrStatementDefaultContext vfrStatementDefault(int i) {
			return getRuleContext(VfrStatementDefaultContext.class,i);
		}
		public VfrStatementBannerContext vfrStatementBanner(int i) {
			return getRuleContext(VfrStatementBannerContext.class,i);
		}
		public List<VfrStatementLabelContext> vfrStatementLabel() {
			return getRuleContexts(VfrStatementLabelContext.class);
		}
		public VfrStatementLockedContext vfrStatementLocked(int i) {
			return getRuleContext(VfrStatementLockedContext.class,i);
		}
		public List<VfrStatementDefaultContext> vfrStatementDefault() {
			return getRuleContexts(VfrStatementDefaultContext.class);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public VfrStatementRulesContext vfrStatementRules(int i) {
			return getRuleContext(VfrStatementRulesContext.class,i);
		}
		public List<VfrStatementStatContext> vfrStatementStat() {
			return getRuleContexts(VfrStatementStatContext.class);
		}
		public List<VfrStatementExtensionContext> vfrStatementExtension() {
			return getRuleContexts(VfrStatementExtensionContext.class);
		}
		public VfrFormDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrFormDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrFormDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrFormDefinition(this);
		}
	}

	public final VfrFormDefinitionContext vfrFormDefinition() throws RecognitionException {
		VfrFormDefinitionContext _localctx = new VfrFormDefinitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vfrFormDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(Form);
			setState(273); match(FormId);
			setState(274); match(Equals);
			setState(275); match(Number);
			setState(276); match(Comma);
			setState(277); match(Title);
			setState(278); match(Equals);
			setState(279); getStringId();
			setState(280); match(SemiColon);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Rule) | (1L << Image) | (1L << Locked) | (1L << Default) | (1L << Date))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SuppressIf - 64)) | (1L << (Text - 64)) | (1L << (DisableIf - 64)) | (1L << (Checkbox - 64)) | (1L << (Action - 64)) | (1L << (Subtitle - 64)) | (1L << (ResetButton - 64)) | (1L << (Goto - 64)) | (1L << (Numeric - 64)) | (1L << (Oneof - 64)) | (1L << (Time - 64)) | (1L << (String - 64)) | (1L << (Password - 64)) | (1L << (Orderedlist - 64)) | (1L << (GrayoutIf - 64)) | (1L << (Label - 64)) | (1L << (Banner - 64)) | (1L << (Guidop - 64)) | (1L << (Modal - 64)))) != 0)) {
				{
				setState(292);
				switch (_input.LA(1)) {
				case Image:
					{
					setState(281); vfrStatementImage();
					}
					break;
				case Locked:
					{
					setState(282); vfrStatementLocked();
					}
					break;
				case Rule:
					{
					setState(283); vfrStatementRules();
					}
					break;
				case Default:
					{
					setState(284); vfrStatementDefault();
					}
					break;
				case Text:
				case Subtitle:
				case ResetButton:
				case Goto:
					{
					setState(285); vfrStatementStat();
					}
					break;
				case Date:
				case Checkbox:
				case Action:
				case Numeric:
				case Oneof:
				case Time:
				case String:
				case Password:
				case Orderedlist:
					{
					setState(286); vfrStatementQuestions();
					}
					break;
				case SuppressIf:
				case DisableIf:
				case GrayoutIf:
					{
					setState(287); vfrStatementConditional();
					}
					break;
				case Label:
					{
					setState(288); vfrStatementLabel();
					}
					break;
				case Banner:
					{
					setState(289); vfrStatementBanner();
					}
					break;
				case Guidop:
					{
					setState(290); vfrStatementExtension();
					}
					break;
				case Modal:
					{
					setState(291); vfrStatementModal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297); match(EndForm);
			setState(298); match(SemiColon);
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

	public static class VfrStatementStatContext extends ParserRuleContext {
		public VfrStatementStaticTextContext vfrStatementStaticText() {
			return getRuleContext(VfrStatementStaticTextContext.class,0);
		}
		public VfrStatementCrossReferenceContext vfrStatementCrossReference() {
			return getRuleContext(VfrStatementCrossReferenceContext.class,0);
		}
		public VfrStatementSubTitleContext vfrStatementSubTitle() {
			return getRuleContext(VfrStatementSubTitleContext.class,0);
		}
		public VfrStatementStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStat(this);
		}
	}

	public final VfrStatementStatContext vfrStatementStat() throws RecognitionException {
		VfrStatementStatContext _localctx = new VfrStatementStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vfrStatementStat);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case Subtitle:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); vfrStatementSubTitle();
				}
				break;
			case Text:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); vfrStatementStaticText();
				}
				break;
			case ResetButton:
			case Goto:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); vfrStatementCrossReference();
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

	public static class VfrStatementCrossReferenceContext extends ParserRuleContext {
		public VfrStatementGotoContext vfrStatementGoto() {
			return getRuleContext(VfrStatementGotoContext.class,0);
		}
		public VfrStatementResetButtonContext vfrStatementResetButton() {
			return getRuleContext(VfrStatementResetButtonContext.class,0);
		}
		public VfrStatementCrossReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementCrossReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementCrossReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementCrossReference(this);
		}
	}

	public final VfrStatementCrossReferenceContext vfrStatementCrossReference() throws RecognitionException {
		VfrStatementCrossReferenceContext _localctx = new VfrStatementCrossReferenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vfrStatementCrossReference);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); vfrStatementGoto();
				}
				break;
			case ResetButton:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); vfrStatementResetButton();
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

	public static class VfrStatementGotoContext extends ParserRuleContext {
		public TerminalNode FormsetGuid() { return getToken(vfrParser.FormsetGuid, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public GuidDefinitionContext guidDefinition() {
			return getRuleContext(GuidDefinitionContext.class,0);
		}
		public VfrGotoFlagsContext vfrGotoFlags() {
			return getRuleContext(VfrGotoFlagsContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Question() { return getToken(vfrParser.Question, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode DevicePath() { return getToken(vfrParser.DevicePath, 0); }
		public TerminalNode Goto() { return getToken(vfrParser.Goto, 0); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode FormId() { return getToken(vfrParser.FormId, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementGotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementGoto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementGoto(this);
		}
	}

	public final VfrStatementGotoContext vfrStatementGoto() throws RecognitionException {
		VfrStatementGotoContext _localctx = new VfrStatementGotoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vfrStatementGoto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(Goto);
			setState(354);
			switch (_input.LA(1)) {
			case DevicePath:
				{
				{
				setState(310); match(DevicePath);
				setState(311); match(Equals);
				setState(312); getStringId();
				setState(313); match(Comma);
				setState(314); match(FormsetGuid);
				setState(315); match(Equals);
				setState(316); guidDefinition();
				setState(317); match(Comma);
				setState(318); match(FormId);
				setState(319); match(Equals);
				setState(320); match(Number);
				setState(321); match(Comma);
				setState(322); match(Question);
				setState(323); match(Equals);
				setState(324); match(Number);
				setState(325); match(Comma);
				}
				}
				break;
			case FormsetGuid:
				{
				{
				setState(327); match(FormsetGuid);
				setState(328); match(Equals);
				setState(329); guidDefinition();
				setState(330); match(Comma);
				setState(331); match(FormId);
				setState(332); match(Equals);
				setState(333); match(Number);
				setState(334); match(Comma);
				setState(335); match(Question);
				setState(336); match(Equals);
				setState(337); match(Number);
				setState(338); match(Comma);
				}
				}
				break;
			case FormId:
				{
				{
				setState(340); match(FormId);
				setState(341); match(Equals);
				setState(342); match(Number);
				setState(343); match(Comma);
				setState(344); match(Question);
				setState(345); match(Equals);
				setState(350);
				switch (_input.LA(1)) {
				case StringIdentifier:
					{
					setState(346); match(StringIdentifier);
					setState(347); match(Comma);
					}
					break;
				case Number:
					{
					setState(348); match(Number);
					setState(349); match(Comma);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case Number:
				{
				{
				setState(352); match(Number);
				setState(353); match(Comma);
				}
				}
				break;
			case Prompt:
			case Varid:
			case Name:
			case QuestionId:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356); vfrQuestionHeader();
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(357); match(Comma);
				setState(358); match(Flags);
				setState(359); match(Equals);
				setState(360); vfrGotoFlags();
				}
				break;
			}
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(363); match(Comma);
				setState(364); match(Key);
				setState(365); match(Equals);
				setState(366); match(Number);
				}
				break;
			}
			setState(371);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(369); match(Comma);
				setState(370); vfrStatementQuestionOptionList();
				}
			}

			setState(373); match(SemiColon);
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

	public static class VfrGotoFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public List<GotoFlagsFieldContext> gotoFlagsField() {
			return getRuleContexts(GotoFlagsFieldContext.class);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public GotoFlagsFieldContext gotoFlagsField(int i) {
			return getRuleContext(GotoFlagsFieldContext.class,i);
		}
		public VfrGotoFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrGotoFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrGotoFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrGotoFlags(this);
		}
	}

	public final VfrGotoFlagsContext vfrGotoFlags() throws RecognitionException {
		VfrGotoFlagsContext _localctx = new VfrGotoFlagsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vfrGotoFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); gotoFlagsField();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(376); match(OrBitwise);
				setState(377); gotoFlagsField();
				}
				}
				setState(382);
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

	public static class GotoFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public GotoFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterGotoFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitGotoFlagsField(this);
		}
	}

	public final GotoFlagsFieldContext gotoFlagsField() throws RecognitionException {
		GotoFlagsFieldContext _localctx = new GotoFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gotoFlagsField);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); match(Number);
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); questionheaderFlagsField();
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

	public static class VfrStatementResetButtonContext extends ParserRuleContext {
		public TerminalNode ResetButton() { return getToken(vfrParser.ResetButton, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode DefaultStore() { return getToken(vfrParser.DefaultStore, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementStatTagListContext vfrStatementStatTagList() {
			return getRuleContext(VfrStatementStatTagListContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode EndResetButton() { return getToken(vfrParser.EndResetButton, 0); }
		public VfrStatementHeaderContext vfrStatementHeader() {
			return getRuleContext(VfrStatementHeaderContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementResetButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementResetButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementResetButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementResetButton(this);
		}
	}

	public final VfrStatementResetButtonContext vfrStatementResetButton() throws RecognitionException {
		VfrStatementResetButtonContext _localctx = new VfrStatementResetButtonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vfrStatementResetButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(ResetButton);
			setState(388); match(DefaultStore);
			setState(389); match(Equals);
			setState(390); match(StringIdentifier);
			setState(391); match(Comma);
			setState(392); vfrStatementHeader();
			setState(393); match(Comma);
			setState(397);
			_la = _input.LA(1);
			if (_la==Image || _la==Locked) {
				{
				setState(394); vfrStatementStatTagList();
				setState(395); match(Comma);
				}
			}

			setState(399); match(EndResetButton);
			setState(400); match(SemiColon);
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

	public static class VfrStatementStatTagListContext extends ParserRuleContext {
		public List<VfrStatementStatTagContext> vfrStatementStatTag() {
			return getRuleContexts(VfrStatementStatTagContext.class);
		}
		public VfrStatementStatTagContext vfrStatementStatTag(int i) {
			return getRuleContext(VfrStatementStatTagContext.class,i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementStatTagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStatTagList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStatTagList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStatTagList(this);
		}
	}

	public final VfrStatementStatTagListContext vfrStatementStatTagList() throws RecognitionException {
		VfrStatementStatTagListContext _localctx = new VfrStatementStatTagListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vfrStatementStatTagList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402); vfrStatementStatTag();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(403); match(Comma);
					setState(404); vfrStatementStatTag();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class VfrStatementStaticTextContext extends ParserRuleContext {
		public StaticTextFlagsFieldContext staticTextFlagsField(int i) {
			return getRuleContext(StaticTextFlagsFieldContext.class,i);
		}
		public List<TerminalNode> Text() { return getTokens(vfrParser.Text); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementStatTagListContext vfrStatementStatTagList() {
			return getRuleContext(VfrStatementStatTagListContext.class,0);
		}
		public TerminalNode Text(int i) {
			return getToken(vfrParser.Text, i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public GetStringIdContext getStringId(int i) {
			return getRuleContext(GetStringIdContext.class,i);
		}
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode Help() { return getToken(vfrParser.Help, 0); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public List<StaticTextFlagsFieldContext> staticTextFlagsField() {
			return getRuleContexts(StaticTextFlagsFieldContext.class);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public List<GetStringIdContext> getStringId() {
			return getRuleContexts(GetStringIdContext.class);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementStaticTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStaticText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStaticText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStaticText(this);
		}
	}

	public final VfrStatementStaticTextContext vfrStatementStaticText() throws RecognitionException {
		VfrStatementStaticTextContext _localctx = new VfrStatementStaticTextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vfrStatementStaticText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(Text);
			setState(411); match(Help);
			setState(412); match(Equals);
			setState(413); getStringId();
			setState(414); match(Comma);
			setState(415); match(Text);
			setState(416); match(Equals);
			setState(417); getStringId();
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(418); match(Comma);
				setState(419); match(Text);
				setState(420); match(Equals);
				setState(421); getStringId();
				}
				break;
			}
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(424); match(Comma);
				setState(425); match(Flags);
				setState(426); match(Equals);
				setState(427); staticTextFlagsField();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OrBitwise) {
					{
					{
					setState(428); match(OrBitwise);
					setState(429); staticTextFlagsField();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435); match(Comma);
				setState(436); match(Key);
				setState(437); match(Equals);
				setState(438); match(Number);
				}
				break;
			}
			setState(444);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(442); match(Comma);
				setState(443); vfrStatementStatTagList();
				}
			}

			setState(446); match(SemiColon);
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

	public static class StaticTextFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public StaticTextFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticTextFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterStaticTextFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitStaticTextFlagsField(this);
		}
	}

	public final StaticTextFlagsFieldContext staticTextFlagsField() throws RecognitionException {
		StaticTextFlagsFieldContext _localctx = new StaticTextFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_staticTextFlagsField);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(448); match(Number);
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(449); questionheaderFlagsField();
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

	public static class VfrStatementSubTitleContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public VfrSubtitleFlagsContext vfrSubtitleFlags() {
			return getRuleContext(VfrSubtitleFlagsContext.class,0);
		}
		public TerminalNode Text() { return getToken(vfrParser.Text, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public VfrStatementStatTagListContext vfrStatementStatTagList() {
			return getRuleContext(VfrStatementStatTagListContext.class,0);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public TerminalNode Subtitle() { return getToken(vfrParser.Subtitle, 0); }
		public VfrStatementSubTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementSubTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementSubTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementSubTitle(this);
		}
	}

	public final VfrStatementSubTitleContext vfrStatementSubTitle() throws RecognitionException {
		VfrStatementSubTitleContext _localctx = new VfrStatementSubTitleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vfrStatementSubTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(Subtitle);
			setState(453); match(Text);
			setState(454); match(Equals);
			setState(455); getStringId();
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(456); match(Comma);
				setState(457); match(Flags);
				setState(458); match(Equals);
				setState(459); vfrSubtitleFlags();
				}
				break;
			}
			setState(464);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(462); match(Comma);
				setState(463); vfrStatementStatTagList();
				}
			}

			setState(466); match(SemiColon);
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

	public static class VfrSubtitleFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public SubtitleFlagsFieldContext subtitleFlagsField(int i) {
			return getRuleContext(SubtitleFlagsFieldContext.class,i);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<SubtitleFlagsFieldContext> subtitleFlagsField() {
			return getRuleContexts(SubtitleFlagsFieldContext.class);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrSubtitleFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrSubtitleFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrSubtitleFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrSubtitleFlags(this);
		}
	}

	public final VfrSubtitleFlagsContext vfrSubtitleFlags() throws RecognitionException {
		VfrSubtitleFlagsContext _localctx = new VfrSubtitleFlagsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vfrSubtitleFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); subtitleFlagsField();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(469); match(OrBitwise);
				setState(470); subtitleFlagsField();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476); match(SemiColon);
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

	public static class SubtitleFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode Horizontal() { return getToken(vfrParser.Horizontal, 0); }
		public SubtitleFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtitleFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterSubtitleFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitSubtitleFlagsField(this);
		}
	}

	public final SubtitleFlagsFieldContext subtitleFlagsField() throws RecognitionException {
		SubtitleFlagsFieldContext _localctx = new SubtitleFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subtitleFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==Horizontal || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class GetStringIdContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode StringToken() { return getToken(vfrParser.StringToken, 0); }
		public GetStringIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStringId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterGetStringId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitGetStringId(this);
		}
	}

	public final GetStringIdContext getStringId() throws RecognitionException {
		GetStringIdContext _localctx = new GetStringIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_getStringId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(StringToken);
			setState(481); match(LParen);
			setState(482); match(Number);
			setState(483); match(RParen);
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

	public static class VfrStatementImageContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrImageTagContext vfrImageTag() {
			return getRuleContext(VfrImageTagContext.class,0);
		}
		public VfrStatementImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementImage(this);
		}
	}

	public final VfrStatementImageContext vfrStatementImage() throws RecognitionException {
		VfrStatementImageContext _localctx = new VfrStatementImageContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vfrStatementImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); vfrImageTag();
			setState(486); match(SemiColon);
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

	public static class VfrImageTagContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Image() { return getToken(vfrParser.Image, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode ImageToken() { return getToken(vfrParser.ImageToken, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public VfrImageTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrImageTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrImageTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrImageTag(this);
		}
	}

	public final VfrImageTagContext vfrImageTag() throws RecognitionException {
		VfrImageTagContext _localctx = new VfrImageTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vfrImageTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(Image);
			setState(489); match(Equals);
			setState(490); match(ImageToken);
			setState(491); match(LParen);
			setState(492); match(Number);
			setState(493); match(RParen);
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

	public static class VfrStatementLockedContext extends ParserRuleContext {
		public VfrLockedTagContext vfrLockedTag() {
			return getRuleContext(VfrLockedTagContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementLockedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementLocked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementLocked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementLocked(this);
		}
	}

	public final VfrStatementLockedContext vfrStatementLocked() throws RecognitionException {
		VfrStatementLockedContext _localctx = new VfrStatementLockedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vfrStatementLocked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); vfrLockedTag();
			setState(496); match(SemiColon);
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

	public static class VfrLockedTagContext extends ParserRuleContext {
		public TerminalNode Locked() { return getToken(vfrParser.Locked, 0); }
		public VfrLockedTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrLockedTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrLockedTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrLockedTag(this);
		}
	}

	public final VfrLockedTagContext vfrLockedTag() throws RecognitionException {
		VfrLockedTagContext _localctx = new VfrLockedTagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vfrLockedTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498); match(Locked);
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

	public static class VfrStatementRulesContext extends ParserRuleContext {
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode EndRule() { return getToken(vfrParser.EndRule, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode Rule() { return getToken(vfrParser.Rule, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementRules(this);
		}
	}

	public final VfrStatementRulesContext vfrStatementRules() throws RecognitionException {
		VfrStatementRulesContext _localctx = new VfrStatementRulesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vfrStatementRules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); match(Rule);
			setState(501); match(StringIdentifier);
			setState(502); match(Comma);
			setState(503); vfrStatementExpression();
			setState(504); match(EndRule);
			setState(505); match(SemiColon);
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

	public static class VfrStatementModalContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Modal() { return getToken(vfrParser.Modal, 0); }
		public VfrStatementModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementModal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementModal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementModal(this);
		}
	}

	public final VfrStatementModalContext vfrStatementModal() throws RecognitionException {
		VfrStatementModalContext _localctx = new VfrStatementModalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vfrStatementModal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(Modal);
			setState(508); match(SemiColon);
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

	public static class VfrStatementExtensionContext extends ParserRuleContext {
		public TerminalNode UINT16() { return getToken(vfrParser.UINT16, 0); }
		public VfrStatementExtensionContext vfrStatementExtension(int i) {
			return getRuleContext(VfrStatementExtensionContext.class,i);
		}
		public TerminalNode RBracket() { return getToken(vfrParser.RBracket, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public VfrExtensionDataContext vfrExtensionData() {
			return getRuleContext(VfrExtensionDataContext.class,0);
		}
		public TerminalNode EfiHiiRef() { return getToken(vfrParser.EfiHiiRef, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode BOOLEAN() { return getToken(vfrParser.BOOLEAN, 0); }
		public TerminalNode EfiHiiDate() { return getToken(vfrParser.EfiHiiDate, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public TerminalNode EndGuidop() { return getToken(vfrParser.EndGuidop, 0); }
		public TerminalNode EfiHiiTime() { return getToken(vfrParser.EfiHiiTime, 0); }
		public TerminalNode UINT8() { return getToken(vfrParser.UINT8, 0); }
		public GuidDefinitionContext guidDefinition() {
			return getRuleContext(GuidDefinitionContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode EfiStringId() { return getToken(vfrParser.EfiStringId, 0); }
		public TerminalNode LBracket() { return getToken(vfrParser.LBracket, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Guid() { return getToken(vfrParser.Guid, 0); }
		public TerminalNode UINT64() { return getToken(vfrParser.UINT64, 0); }
		public TerminalNode Guidop() { return getToken(vfrParser.Guidop, 0); }
		public TerminalNode UINT32() { return getToken(vfrParser.UINT32, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Datatype() { return getToken(vfrParser.Datatype, 0); }
		public List<VfrStatementExtensionContext> vfrStatementExtension() {
			return getRuleContexts(VfrStatementExtensionContext.class);
		}
		public VfrStatementExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementExtension(this);
		}
	}

	public final VfrStatementExtensionContext vfrStatementExtension() throws RecognitionException {
		VfrStatementExtensionContext _localctx = new VfrStatementExtensionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vfrStatementExtension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); match(Guidop);
			setState(511); match(Guid);
			setState(512); match(Equals);
			setState(513); guidDefinition();
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(514); match(Comma);
				setState(515); match(Datatype);
				setState(516); match(Equals);
				setState(577);
				switch (_input.LA(1)) {
				case UINT64:
					{
					setState(517); match(UINT64);
					setState(521);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(518); match(LBracket);
						setState(519); match(Number);
						setState(520); match(RBracket);
						}
					}

					}
					break;
				case UINT32:
					{
					setState(523); match(UINT32);
					setState(527);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(524); match(LBracket);
						setState(525); match(Number);
						setState(526); match(RBracket);
						}
					}

					}
					break;
				case UINT16:
					{
					setState(529); match(UINT16);
					setState(533);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(530); match(LBracket);
						setState(531); match(Number);
						setState(532); match(RBracket);
						}
					}

					}
					break;
				case UINT8:
					{
					setState(535); match(UINT8);
					setState(539);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(536); match(LBracket);
						setState(537); match(Number);
						setState(538); match(RBracket);
						}
					}

					}
					break;
				case BOOLEAN:
					{
					setState(541); match(BOOLEAN);
					setState(545);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(542); match(LBracket);
						setState(543); match(Number);
						setState(544); match(RBracket);
						}
					}

					}
					break;
				case EfiStringId:
					{
					setState(547); match(EfiStringId);
					setState(551);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(548); match(LBracket);
						setState(549); match(Number);
						setState(550); match(RBracket);
						}
					}

					}
					break;
				case EfiHiiDate:
					{
					setState(553); match(EfiHiiDate);
					setState(557);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(554); match(LBracket);
						setState(555); match(Number);
						setState(556); match(RBracket);
						}
					}

					}
					break;
				case EfiHiiTime:
					{
					setState(559); match(EfiHiiTime);
					setState(563);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(560); match(LBracket);
						setState(561); match(Number);
						setState(562); match(RBracket);
						}
					}

					}
					break;
				case EfiHiiRef:
					{
					setState(565); match(EfiHiiRef);
					setState(569);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(566); match(LBracket);
						setState(567); match(Number);
						setState(568); match(RBracket);
						}
					}

					}
					break;
				case StringIdentifier:
					{
					setState(571); match(StringIdentifier);
					setState(575);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(572); match(LBracket);
						setState(573); match(Number);
						setState(574); match(RBracket);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(579); vfrExtensionData();
				}
				break;
			}
			setState(590);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(582); match(Comma);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Guidop) {
					{
					{
					setState(583); vfrStatementExtension();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589); match(EndGuidop);
				}
			}

			setState(592); match(SemiColon);
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

	public static class VfrExtensionDataContext extends ParserRuleContext {
		public List<TerminalNode> Period() { return getTokens(vfrParser.Period); }
		public List<TerminalNode> RBracket() { return getTokens(vfrParser.RBracket); }
		public TerminalNode LBracket(int i) {
			return getToken(vfrParser.LBracket, i);
		}
		public List<TerminalNode> StringIdentifier() { return getTokens(vfrParser.StringIdentifier); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public List<TerminalNode> LBracket() { return getTokens(vfrParser.LBracket); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Data(int i) {
			return getToken(vfrParser.Data, i);
		}
		public TerminalNode RBracket(int i) {
			return getToken(vfrParser.RBracket, i);
		}
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public TerminalNode StringIdentifier(int i) {
			return getToken(vfrParser.StringIdentifier, i);
		}
		public List<TerminalNode> Data() { return getTokens(vfrParser.Data); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Period(int i) {
			return getToken(vfrParser.Period, i);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrExtensionDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExtensionData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExtensionData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExtensionData(this);
		}
	}

	public final VfrExtensionDataContext vfrExtensionData() throws RecognitionException {
		VfrExtensionDataContext _localctx = new VfrExtensionDataContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vfrExtensionData);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(594); match(Comma);
					setState(595); match(Data);
					setState(599);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(596); match(LBracket);
						setState(597); match(Number);
						setState(598); match(RBracket);
						}
					}

					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Period) {
						{
						{
						setState(601); match(Period);
						setState(602); match(StringIdentifier);
						setState(606);
						_la = _input.LA(1);
						if (_la==LBracket) {
							{
							setState(603); match(LBracket);
							setState(604); match(Number);
							setState(605); match(RBracket);
							}
						}

						}
						}
						setState(612);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(613); match(Equals);
					setState(614); match(Number);
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class VfrStatementBannerContext extends ParserRuleContext {
		public TerminalNode Left() { return getToken(vfrParser.Left, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Banner() { return getToken(vfrParser.Banner, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Timeout() { return getToken(vfrParser.Timeout, 0); }
		public TerminalNode Center() { return getToken(vfrParser.Center, 0); }
		public TerminalNode Title() { return getToken(vfrParser.Title, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode Align() { return getToken(vfrParser.Align, 0); }
		public TerminalNode Right() { return getToken(vfrParser.Right, 0); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode Line() { return getToken(vfrParser.Line, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementBannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementBanner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementBanner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementBanner(this);
		}
	}

	public final VfrStatementBannerContext vfrStatementBanner() throws RecognitionException {
		VfrStatementBannerContext _localctx = new VfrStatementBannerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vfrStatementBanner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(Banner);
			setState(622);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(621); match(Comma);
				}
			}

			setState(624); match(Title);
			setState(625); match(Equals);
			setState(626); getStringId();
			setState(627); match(Comma);
			setState(638);
			switch (_input.LA(1)) {
			case Line:
				{
				{
				setState(628); match(Line);
				setState(629); match(Number);
				setState(630); match(Comma);
				setState(631); match(Align);
				setState(632);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (Left - 115)) | (1L << (Right - 115)) | (1L << (Center - 115)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(633); match(SemiColon);
				}
				}
				break;
			case Timeout:
				{
				{
				setState(634); match(Timeout);
				setState(635); match(Equals);
				setState(636); match(Number);
				setState(637); match(SemiColon);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VfrStatementConditionalContext extends ParserRuleContext {
		public VfrStatementSuppressIfStatContext vfrStatementSuppressIfStat() {
			return getRuleContext(VfrStatementSuppressIfStatContext.class,0);
		}
		public VfrStatementGrayOutIfStatContext vfrStatementGrayOutIfStat() {
			return getRuleContext(VfrStatementGrayOutIfStatContext.class,0);
		}
		public VfrStatementDisableIfStatContext vfrStatementDisableIfStat() {
			return getRuleContext(VfrStatementDisableIfStatContext.class,0);
		}
		public VfrStatementConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementConditional(this);
		}
	}

	public final VfrStatementConditionalContext vfrStatementConditional() throws RecognitionException {
		VfrStatementConditionalContext _localctx = new VfrStatementConditionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vfrStatementConditional);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case DisableIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(640); vfrStatementDisableIfStat();
				}
				break;
			case SuppressIf:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); vfrStatementSuppressIfStat();
				}
				break;
			case GrayoutIf:
				enterOuterAlt(_localctx, 3);
				{
				setState(642); vfrStatementGrayOutIfStat();
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

	public static class VfrStatementDisableIfStatContext extends ParserRuleContext {
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public VfrStatementStatListContext vfrStatementStatList(int i) {
			return getRuleContext(VfrStatementStatListContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode DisableIf() { return getToken(vfrParser.DisableIf, 0); }
		public List<VfrStatementStatListContext> vfrStatementStatList() {
			return getRuleContexts(VfrStatementStatListContext.class);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementDisableIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementDisableIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementDisableIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementDisableIfStat(this);
		}
	}

	public final VfrStatementDisableIfStatContext vfrStatementDisableIfStat() throws RecognitionException {
		VfrStatementDisableIfStatContext _localctx = new VfrStatementDisableIfStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vfrStatementDisableIfStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); match(DisableIf);
			setState(646); vfrStatementExpression();
			setState(647); match(Comma);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (Date - 59)) | (1L << (SuppressIf - 59)) | (1L << (Text - 59)) | (1L << (DisableIf - 59)) | (1L << (Checkbox - 59)) | (1L << (Action - 59)) | (1L << (Subtitle - 59)) | (1L << (ResetButton - 59)) | (1L << (Goto - 59)) | (1L << (Numeric - 59)) | (1L << (Oneof - 59)) | (1L << (Time - 59)) | (1L << (String - 59)) | (1L << (Password - 59)) | (1L << (Orderedlist - 59)) | (1L << (GrayoutIf - 59)) | (1L << (Label - 59)) | (1L << (Guidop - 59)))) != 0)) {
				{
				{
				setState(648); vfrStatementStatList();
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654); match(EndIf);
			setState(655); match(SemiColon);
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

	public static class VfrStatementSuppressIfStatContext extends ParserRuleContext {
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public TerminalNode SuppressIf() { return getToken(vfrParser.SuppressIf, 0); }
		public VfrStatementStatListContext vfrStatementStatList(int i) {
			return getRuleContext(VfrStatementStatListContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public List<VfrStatementStatListContext> vfrStatementStatList() {
			return getRuleContexts(VfrStatementStatListContext.class);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementSuppressIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementSuppressIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementSuppressIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementSuppressIfStat(this);
		}
	}

	public final VfrStatementSuppressIfStatContext vfrStatementSuppressIfStat() throws RecognitionException {
		VfrStatementSuppressIfStatContext _localctx = new VfrStatementSuppressIfStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_vfrStatementSuppressIfStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); match(SuppressIf);
			setState(658); vfrStatementExpression();
			setState(659); match(Comma);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (Date - 59)) | (1L << (SuppressIf - 59)) | (1L << (Text - 59)) | (1L << (DisableIf - 59)) | (1L << (Checkbox - 59)) | (1L << (Action - 59)) | (1L << (Subtitle - 59)) | (1L << (ResetButton - 59)) | (1L << (Goto - 59)) | (1L << (Numeric - 59)) | (1L << (Oneof - 59)) | (1L << (Time - 59)) | (1L << (String - 59)) | (1L << (Password - 59)) | (1L << (Orderedlist - 59)) | (1L << (GrayoutIf - 59)) | (1L << (Label - 59)) | (1L << (Guidop - 59)))) != 0)) {
				{
				{
				setState(660); vfrStatementStatList();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666); match(EndIf);
			setState(667); match(SemiColon);
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

	public static class VfrStatementGrayOutIfStatContext extends ParserRuleContext {
		public TerminalNode GrayoutIf() { return getToken(vfrParser.GrayoutIf, 0); }
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public VfrStatementStatListContext vfrStatementStatList(int i) {
			return getRuleContext(VfrStatementStatListContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public List<VfrStatementStatListContext> vfrStatementStatList() {
			return getRuleContexts(VfrStatementStatListContext.class);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementGrayOutIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementGrayOutIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementGrayOutIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementGrayOutIfStat(this);
		}
	}

	public final VfrStatementGrayOutIfStatContext vfrStatementGrayOutIfStat() throws RecognitionException {
		VfrStatementGrayOutIfStatContext _localctx = new VfrStatementGrayOutIfStatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_vfrStatementGrayOutIfStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); match(GrayoutIf);
			setState(670); vfrStatementExpression();
			setState(671); match(Comma);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (Date - 59)) | (1L << (SuppressIf - 59)) | (1L << (Text - 59)) | (1L << (DisableIf - 59)) | (1L << (Checkbox - 59)) | (1L << (Action - 59)) | (1L << (Subtitle - 59)) | (1L << (ResetButton - 59)) | (1L << (Goto - 59)) | (1L << (Numeric - 59)) | (1L << (Oneof - 59)) | (1L << (Time - 59)) | (1L << (String - 59)) | (1L << (Password - 59)) | (1L << (Orderedlist - 59)) | (1L << (GrayoutIf - 59)) | (1L << (Label - 59)) | (1L << (Guidop - 59)))) != 0)) {
				{
				{
				setState(672); vfrStatementStatList();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678); match(EndIf);
			setState(679); match(SemiColon);
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

	public static class VfrStatementStatListContext extends ParserRuleContext {
		public VfrStatementLabelContext vfrStatementLabel() {
			return getRuleContext(VfrStatementLabelContext.class,0);
		}
		public VfrStatementQuestionsContext vfrStatementQuestions() {
			return getRuleContext(VfrStatementQuestionsContext.class,0);
		}
		public VfrStatementConditionalContext vfrStatementConditional() {
			return getRuleContext(VfrStatementConditionalContext.class,0);
		}
		public VfrStatementStatContext vfrStatementStat() {
			return getRuleContext(VfrStatementStatContext.class,0);
		}
		public VfrStatementExtensionContext vfrStatementExtension() {
			return getRuleContext(VfrStatementExtensionContext.class,0);
		}
		public VfrStatementStatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStatList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStatList(this);
		}
	}

	public final VfrStatementStatListContext vfrStatementStatList() throws RecognitionException {
		VfrStatementStatListContext _localctx = new VfrStatementStatListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_vfrStatementStatList);
		try {
			setState(686);
			switch (_input.LA(1)) {
			case Text:
			case Subtitle:
			case ResetButton:
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); vfrStatementStat();
				}
				break;
			case Date:
			case Checkbox:
			case Action:
			case Numeric:
			case Oneof:
			case Time:
			case String:
			case Password:
			case Orderedlist:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); vfrStatementQuestions();
				}
				break;
			case SuppressIf:
			case DisableIf:
			case GrayoutIf:
				enterOuterAlt(_localctx, 3);
				{
				setState(683); vfrStatementConditional();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(684); vfrStatementLabel();
				}
				break;
			case Guidop:
				enterOuterAlt(_localctx, 5);
				{
				setState(685); vfrStatementExtension();
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

	public static class VfrStatementLabelContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Label() { return getToken(vfrParser.Label, 0); }
		public VfrStatementLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementLabel(this);
		}
	}

	public final VfrStatementLabelContext vfrStatementLabel() throws RecognitionException {
		VfrStatementLabelContext _localctx = new VfrStatementLabelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vfrStatementLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); match(Label);
			setState(689); match(Number);
			setState(690); match(SemiColon);
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

	public static class VfrStatementStatTagContext extends ParserRuleContext {
		public VfrLockedTagContext vfrLockedTag() {
			return getRuleContext(VfrLockedTagContext.class,0);
		}
		public VfrImageTagContext vfrImageTag() {
			return getRuleContext(VfrImageTagContext.class,0);
		}
		public VfrStatementStatTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStatTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStatTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStatTag(this);
		}
	}

	public final VfrStatementStatTagContext vfrStatementStatTag() throws RecognitionException {
		VfrStatementStatTagContext _localctx = new VfrStatementStatTagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_vfrStatementStatTag);
		try {
			setState(694);
			switch (_input.LA(1)) {
			case Image:
				enterOuterAlt(_localctx, 1);
				{
				setState(692); vfrImageTag();
				}
				break;
			case Locked:
				enterOuterAlt(_localctx, 2);
				{
				setState(693); vfrLockedTag();
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

	public static class VfrStatementQuestionsContext extends ParserRuleContext {
		public VfrStatementOrderedListContext vfrStatementOrderedList() {
			return getRuleContext(VfrStatementOrderedListContext.class,0);
		}
		public VfrStatementNumericTypeContext vfrStatementNumericType() {
			return getRuleContext(VfrStatementNumericTypeContext.class,0);
		}
		public VfrStatementTimeContext vfrStatementTime() {
			return getRuleContext(VfrStatementTimeContext.class,0);
		}
		public VfrStatementStringTypeContext vfrStatementStringType() {
			return getRuleContext(VfrStatementStringTypeContext.class,0);
		}
		public VfrStatementBooleanTypeContext vfrStatementBooleanType() {
			return getRuleContext(VfrStatementBooleanTypeContext.class,0);
		}
		public VfrStatementDateContext vfrStatementDate() {
			return getRuleContext(VfrStatementDateContext.class,0);
		}
		public VfrStatementQuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementQuestions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementQuestions(this);
		}
	}

	public final VfrStatementQuestionsContext vfrStatementQuestions() throws RecognitionException {
		VfrStatementQuestionsContext _localctx = new VfrStatementQuestionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vfrStatementQuestions);
		try {
			setState(702);
			switch (_input.LA(1)) {
			case Checkbox:
			case Action:
				enterOuterAlt(_localctx, 1);
				{
				setState(696); vfrStatementBooleanType();
				}
				break;
			case Date:
				enterOuterAlt(_localctx, 2);
				{
				setState(697); vfrStatementDate();
				}
				break;
			case Numeric:
			case Oneof:
				enterOuterAlt(_localctx, 3);
				{
				setState(698); vfrStatementNumericType();
				}
				break;
			case String:
			case Password:
				enterOuterAlt(_localctx, 4);
				{
				setState(699); vfrStatementStringType();
				}
				break;
			case Orderedlist:
				enterOuterAlt(_localctx, 5);
				{
				setState(700); vfrStatementOrderedList();
				}
				break;
			case Time:
				enterOuterAlt(_localctx, 6);
				{
				setState(701); vfrStatementTime();
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

	public static class VfrStatementTimeContext extends ParserRuleContext {
		public List<MinMaxTimeStepDefaultContext> minMaxTimeStepDefault() {
			return getRuleContexts(MinMaxTimeStepDefaultContext.class);
		}
		public List<TerminalNode> Period() { return getTokens(vfrParser.Period); }
		public List<TerminalNode> StringIdentifier() { return getTokens(vfrParser.StringIdentifier); }
		public TerminalNode Prompt(int i) {
			return getToken(vfrParser.Prompt, i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Endtime() { return getToken(vfrParser.Endtime, 0); }
		public List<TerminalNode> Help() { return getTokens(vfrParser.Help); }
		public TerminalNode Time() { return getToken(vfrParser.Time, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public List<GetStringIdContext> getStringId() {
			return getRuleContexts(GetStringIdContext.class);
		}
		public List<VfrStatementInconsistentIfContext> vfrStatementInconsistentIf() {
			return getRuleContexts(VfrStatementInconsistentIfContext.class);
		}
		public TerminalNode Period(int i) {
			return getToken(vfrParser.Period, i);
		}
		public TerminalNode Hour() { return getToken(vfrParser.Hour, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public List<TerminalNode> Varid() { return getTokens(vfrParser.Varid); }
		public TerminalNode Help(int i) {
			return getToken(vfrParser.Help, i);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Minute() { return getToken(vfrParser.Minute, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public GetStringIdContext getStringId(int i) {
			return getRuleContext(GetStringIdContext.class,i);
		}
		public TerminalNode Second() { return getToken(vfrParser.Second, 0); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Varid(int i) {
			return getToken(vfrParser.Varid, i);
		}
		public VfrTimeFlagsContext vfrTimeFlags() {
			return getRuleContext(VfrTimeFlagsContext.class,0);
		}
		public MinMaxTimeStepDefaultContext minMaxTimeStepDefault(int i) {
			return getRuleContext(MinMaxTimeStepDefaultContext.class,i);
		}
		public TerminalNode StringIdentifier(int i) {
			return getToken(vfrParser.StringIdentifier, i);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public VfrStatementInconsistentIfContext vfrStatementInconsistentIf(int i) {
			return getRuleContext(VfrStatementInconsistentIfContext.class,i);
		}
		public List<TerminalNode> Prompt() { return getTokens(vfrParser.Prompt); }
		public VfrStatementTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementTime(this);
		}
	}

	public final VfrStatementTimeContext vfrStatementTime() throws RecognitionException {
		VfrStatementTimeContext _localctx = new VfrStatementTimeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_vfrStatementTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); match(Time);
			setState(770);
			switch (_input.LA(1)) {
			case Prompt:
			case Varid:
			case Name:
			case QuestionId:
				{
				{
				setState(705); vfrQuestionHeader();
				setState(706); match(Comma);
				setState(712);
				_la = _input.LA(1);
				if (_la==Flags) {
					{
					setState(707); match(Flags);
					setState(708); match(Equals);
					setState(709); vfrTimeFlags();
					setState(710); match(Comma);
					}
				}

				setState(714); vfrStatementQuestionOptionList();
				}
				}
				break;
			case Hour:
				{
				{
				setState(716); match(Hour);
				setState(717); match(Varid);
				setState(718); match(Equals);
				setState(719); match(StringIdentifier);
				setState(720); match(Period);
				setState(721); match(StringIdentifier);
				setState(722); match(Comma);
				setState(723); match(Prompt);
				setState(724); match(Equals);
				setState(725); getStringId();
				setState(726); match(Comma);
				setState(727); match(Help);
				setState(728); match(Equals);
				setState(729); getStringId();
				setState(730); match(Comma);
				setState(731); minMaxTimeStepDefault();
				setState(732); match(Minute);
				setState(733); match(Varid);
				setState(734); match(Equals);
				setState(735); match(StringIdentifier);
				setState(736); match(Period);
				setState(737); match(StringIdentifier);
				setState(738); match(Comma);
				setState(739); match(Prompt);
				setState(740); match(Equals);
				setState(741); getStringId();
				setState(742); match(Comma);
				setState(743); match(Help);
				setState(744); match(Equals);
				setState(745); getStringId();
				setState(746); match(Comma);
				setState(747); minMaxTimeStepDefault();
				setState(748); match(Second);
				setState(749); match(Varid);
				setState(750); match(Equals);
				setState(751); match(StringIdentifier);
				setState(752); match(Period);
				setState(753); match(StringIdentifier);
				setState(754); match(Comma);
				setState(755); match(Prompt);
				setState(756); match(Equals);
				setState(757); getStringId();
				setState(758); match(Comma);
				setState(759); match(Help);
				setState(760); match(Equals);
				setState(761); getStringId();
				setState(762); match(Comma);
				setState(763); minMaxTimeStepDefault();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InconsistentIf) {
					{
					{
					setState(764); vfrStatementInconsistentIf();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(772); match(Endtime);
			setState(773); match(SemiColon);
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

	public static class MinMaxTimeStepDefaultContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(vfrParser.Default, 0); }
		public TerminalNode Maximum() { return getToken(vfrParser.Maximum, 0); }
		public TerminalNode Step() { return getToken(vfrParser.Step, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Minimum() { return getToken(vfrParser.Minimum, 0); }
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public MinMaxTimeStepDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minMaxTimeStepDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterMinMaxTimeStepDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitMinMaxTimeStepDefault(this);
		}
	}

	public final MinMaxTimeStepDefaultContext minMaxTimeStepDefault() throws RecognitionException {
		MinMaxTimeStepDefaultContext _localctx = new MinMaxTimeStepDefaultContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_minMaxTimeStepDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775); match(Minimum);
			setState(776); match(Equals);
			setState(777); match(Number);
			setState(778); match(Comma);
			setState(779); match(Maximum);
			setState(780); match(Equals);
			setState(781); match(Number);
			setState(782); match(Comma);
			setState(787);
			_la = _input.LA(1);
			if (_la==Step) {
				{
				setState(783); match(Step);
				setState(784); match(Equals);
				setState(785); match(Number);
				setState(786); match(Comma);
				}
			}

			setState(793);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(789); match(Default);
				setState(790); match(Equals);
				setState(791); match(Number);
				setState(792); match(Comma);
				}
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

	public static class VfrTimeFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TimeFlagsFieldContext timeFlagsField(int i) {
			return getRuleContext(TimeFlagsFieldContext.class,i);
		}
		public List<TimeFlagsFieldContext> timeFlagsField() {
			return getRuleContexts(TimeFlagsFieldContext.class);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public VfrTimeFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrTimeFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrTimeFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrTimeFlags(this);
		}
	}

	public final VfrTimeFlagsContext vfrTimeFlags() throws RecognitionException {
		VfrTimeFlagsContext _localctx = new VfrTimeFlagsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_vfrTimeFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); timeFlagsField();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(796); match(OrBitwise);
				setState(797); timeFlagsField();
				}
				}
				setState(802);
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

	public static class TimeFlagsFieldContext extends ParserRuleContext {
		public TerminalNode SecondSuppress() { return getToken(vfrParser.SecondSuppress, 0); }
		public TerminalNode StorageWakeup() { return getToken(vfrParser.StorageWakeup, 0); }
		public TerminalNode HourSuppress() { return getToken(vfrParser.HourSuppress, 0); }
		public TerminalNode StorageTime() { return getToken(vfrParser.StorageTime, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode StorageNormal() { return getToken(vfrParser.StorageNormal, 0); }
		public TerminalNode MinuteSuppress() { return getToken(vfrParser.MinuteSuppress, 0); }
		public TimeFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterTimeFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitTimeFlagsField(this);
		}
	}

	public final TimeFlagsFieldContext timeFlagsField() throws RecognitionException {
		TimeFlagsFieldContext _localctx = new TimeFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_timeFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_la = _input.LA(1);
			if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (StorageNormal - 169)) | (1L << (StorageTime - 169)) | (1L << (StorageWakeup - 169)) | (1L << (HourSuppress - 169)) | (1L << (MinuteSuppress - 169)) | (1L << (SecondSuppress - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrStatementOrderedListContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Endlist() { return getToken(vfrParser.Endlist, 0); }
		public VfrOrderedListFlagsContext vfrOrderedListFlags() {
			return getRuleContext(VfrOrderedListFlagsContext.class,0);
		}
		public TerminalNode Maxcontainers() { return getToken(vfrParser.Maxcontainers, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode Orderedlist() { return getToken(vfrParser.Orderedlist, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementOrderedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementOrderedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementOrderedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementOrderedList(this);
		}
	}

	public final VfrStatementOrderedListContext vfrStatementOrderedList() throws RecognitionException {
		VfrStatementOrderedListContext _localctx = new VfrStatementOrderedListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_vfrStatementOrderedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); match(Orderedlist);
			setState(806); vfrQuestionHeader();
			setState(807); match(Comma);
			setState(812);
			_la = _input.LA(1);
			if (_la==Maxcontainers) {
				{
				setState(808); match(Maxcontainers);
				setState(809); match(Equals);
				setState(810); match(Number);
				setState(811); match(Comma);
				}
			}

			setState(817);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(814); match(Flags);
				setState(815); match(Equals);
				setState(816); vfrOrderedListFlags();
				}
			}

			setState(819); vfrStatementQuestionOptionList();
			setState(820); match(Endlist);
			setState(821); match(SemiColon);
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

	public static class VfrOrderedListFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<OrderedlistFlagsFieldContext> orderedlistFlagsField() {
			return getRuleContexts(OrderedlistFlagsFieldContext.class);
		}
		public OrderedlistFlagsFieldContext orderedlistFlagsField(int i) {
			return getRuleContext(OrderedlistFlagsFieldContext.class,i);
		}
		public VfrOrderedListFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrOrderedListFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrOrderedListFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrOrderedListFlags(this);
		}
	}

	public final VfrOrderedListFlagsContext vfrOrderedListFlags() throws RecognitionException {
		VfrOrderedListFlagsContext _localctx = new VfrOrderedListFlagsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vfrOrderedListFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823); orderedlistFlagsField();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(824); match(OrBitwise);
				setState(825); orderedlistFlagsField();
				}
				}
				setState(830);
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

	public static class OrderedlistFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Noempty() { return getToken(vfrParser.Noempty, 0); }
		public TerminalNode Unique() { return getToken(vfrParser.Unique, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public OrderedlistFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedlistFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterOrderedlistFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitOrderedlistFlagsField(this);
		}
	}

	public final OrderedlistFlagsFieldContext orderedlistFlagsField() throws RecognitionException {
		OrderedlistFlagsFieldContext _localctx = new OrderedlistFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_orderedlistFlagsField);
		int _la;
		try {
			setState(833);
			switch (_input.LA(1)) {
			case Unique:
			case Noempty:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Unique - 108)) | (1L << (Noempty - 108)) | (1L << (Number - 108)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(832); questionheaderFlagsField();
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

	public static class VfrStatementStringTypeContext extends ParserRuleContext {
		public VfrStatementPasswordContext vfrStatementPassword() {
			return getRuleContext(VfrStatementPasswordContext.class,0);
		}
		public VfrStatementStringContext vfrStatementString() {
			return getRuleContext(VfrStatementStringContext.class,0);
		}
		public VfrStatementStringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementStringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementStringType(this);
		}
	}

	public final VfrStatementStringTypeContext vfrStatementStringType() throws RecognitionException {
		VfrStatementStringTypeContext _localctx = new VfrStatementStringTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_vfrStatementStringType);
		try {
			setState(837);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(835); vfrStatementString();
				}
				break;
			case Password:
				enterOuterAlt(_localctx, 2);
				{
				setState(836); vfrStatementPassword();
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

	public static class VfrStatementPasswordContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode MaxSize() { return getToken(vfrParser.MaxSize, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public TerminalNode Endpassword() { return getToken(vfrParser.Endpassword, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public TerminalNode MinSize() { return getToken(vfrParser.MinSize, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Password() { return getToken(vfrParser.Password, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public VfrPasswordFlagsFieldContext vfrPasswordFlagsField() {
			return getRuleContext(VfrPasswordFlagsFieldContext.class,0);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementPassword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementPassword(this);
		}
	}

	public final VfrStatementPasswordContext vfrStatementPassword() throws RecognitionException {
		VfrStatementPasswordContext _localctx = new VfrStatementPasswordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vfrStatementPassword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); match(Password);
			setState(840); vfrQuestionHeader();
			setState(846);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(841); match(Flags);
				setState(842); match(Equals);
				setState(843); vfrPasswordFlagsField();
				setState(844); match(Comma);
				}
			}

			setState(852);
			_la = _input.LA(1);
			if (_la==Key) {
				{
				setState(848); match(Key);
				setState(849); match(Equals);
				setState(850); match(Number);
				setState(851); match(Comma);
				}
			}

			setState(854); match(MinSize);
			setState(855); match(Equals);
			setState(856); match(Number);
			setState(857); match(Comma);
			setState(858); match(MaxSize);
			setState(859); match(Equals);
			setState(860); match(Number);
			setState(861); match(Comma);
			setState(862); vfrStatementQuestionOptionList();
			setState(863); match(Endpassword);
			setState(864); match(SemiColon);
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

	public static class VfrPasswordFlagsFieldContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<PasswordFlagsFieldContext> passwordFlagsField() {
			return getRuleContexts(PasswordFlagsFieldContext.class);
		}
		public PasswordFlagsFieldContext passwordFlagsField(int i) {
			return getRuleContext(PasswordFlagsFieldContext.class,i);
		}
		public VfrPasswordFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrPasswordFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrPasswordFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrPasswordFlagsField(this);
		}
	}

	public final VfrPasswordFlagsFieldContext vfrPasswordFlagsField() throws RecognitionException {
		VfrPasswordFlagsFieldContext _localctx = new VfrPasswordFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_vfrPasswordFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); passwordFlagsField();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(867); match(OrBitwise);
				setState(868); passwordFlagsField();
				}
				}
				setState(873);
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

	public static class PasswordFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public PasswordFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterPasswordFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitPasswordFlagsField(this);
		}
	}

	public final PasswordFlagsFieldContext passwordFlagsField() throws RecognitionException {
		PasswordFlagsFieldContext _localctx = new PasswordFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_passwordFlagsField);
		try {
			setState(876);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(874); match(Number);
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(875); questionheaderFlagsField();
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

	public static class VfrStatementStringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(vfrParser.String, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode MinSize() { return getToken(vfrParser.MinSize, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode MaxSize() { return getToken(vfrParser.MaxSize, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public VfrStringFlagsFieldContext vfrStringFlagsField() {
			return getRuleContext(VfrStringFlagsFieldContext.class,0);
		}
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode EndString() { return getToken(vfrParser.EndString, 0); }
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementString(this);
		}
	}

	public final VfrStatementStringContext vfrStatementString() throws RecognitionException {
		VfrStatementStringContext _localctx = new VfrStatementStringContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_vfrStatementString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); match(String);
			setState(879); vfrQuestionHeader();
			setState(880); match(Comma);
			setState(886);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(881); match(Flags);
				setState(882); match(Equals);
				setState(883); vfrStringFlagsField();
				setState(884); match(Comma);
				}
			}

			setState(892);
			_la = _input.LA(1);
			if (_la==Key) {
				{
				setState(888); match(Key);
				setState(889); match(Equals);
				setState(890); match(Number);
				setState(891); match(Comma);
				}
			}

			setState(894); match(MinSize);
			setState(895); match(Equals);
			setState(896); match(Number);
			setState(897); match(Comma);
			setState(898); match(MaxSize);
			setState(899); match(Equals);
			setState(900); match(Number);
			setState(901); match(Comma);
			setState(902); vfrStatementQuestionOptionList();
			setState(903); match(EndString);
			setState(904); match(SemiColon);
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

	public static class VfrStringFlagsFieldContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public StringFlagsFieldContext stringFlagsField(int i) {
			return getRuleContext(StringFlagsFieldContext.class,i);
		}
		public List<StringFlagsFieldContext> stringFlagsField() {
			return getRuleContexts(StringFlagsFieldContext.class);
		}
		public VfrStringFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStringFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStringFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStringFlagsField(this);
		}
	}

	public final VfrStringFlagsFieldContext vfrStringFlagsField() throws RecognitionException {
		VfrStringFlagsFieldContext _localctx = new VfrStringFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_vfrStringFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906); stringFlagsField();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(907); match(OrBitwise);
				setState(908); stringFlagsField();
				}
				}
				setState(913);
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

	public static class StringFlagsFieldContext extends ParserRuleContext {
		public TerminalNode MultiLine() { return getToken(vfrParser.MultiLine, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public StringFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterStringFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitStringFlagsField(this);
		}
	}

	public final StringFlagsFieldContext stringFlagsField() throws RecognitionException {
		StringFlagsFieldContext _localctx = new StringFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_stringFlagsField);
		int _la;
		try {
			setState(916);
			switch (_input.LA(1)) {
			case MultiLine:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				_la = _input.LA(1);
				if ( !(_la==MultiLine || _la==Number) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(915); questionheaderFlagsField();
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

	public static class VfrStatementNumericTypeContext extends ParserRuleContext {
		public VfrStatementOneOfContext vfrStatementOneOf() {
			return getRuleContext(VfrStatementOneOfContext.class,0);
		}
		public VfrStatementNumericContext vfrStatementNumeric() {
			return getRuleContext(VfrStatementNumericContext.class,0);
		}
		public VfrStatementNumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementNumericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementNumericType(this);
		}
	}

	public final VfrStatementNumericTypeContext vfrStatementNumericType() throws RecognitionException {
		VfrStatementNumericTypeContext _localctx = new VfrStatementNumericTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_vfrStatementNumericType);
		try {
			setState(920);
			switch (_input.LA(1)) {
			case Numeric:
				enterOuterAlt(_localctx, 1);
				{
				setState(918); vfrStatementNumeric();
				}
				break;
			case Oneof:
				enterOuterAlt(_localctx, 2);
				{
				setState(919); vfrStatementOneOf();
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

	public static class VfrStatementOneOfContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Oneof() { return getToken(vfrParser.Oneof, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode EndOneof() { return getToken(vfrParser.EndOneof, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public VfrOneofFlagsFieldContext vfrOneofFlagsField() {
			return getRuleContext(VfrOneofFlagsFieldContext.class,0);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrSetMinMaxStepContext vfrSetMinMaxStep() {
			return getRuleContext(VfrSetMinMaxStepContext.class,0);
		}
		public VfrStatementOneOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementOneOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementOneOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementOneOf(this);
		}
	}

	public final VfrStatementOneOfContext vfrStatementOneOf() throws RecognitionException {
		VfrStatementOneOfContext _localctx = new VfrStatementOneOfContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vfrStatementOneOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); match(Oneof);
			setState(923); vfrQuestionHeader();
			setState(929);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(924); match(Flags);
				setState(925); match(Equals);
				setState(926); vfrOneofFlagsField();
				setState(927); match(Comma);
				}
			}

			{
			setState(931); vfrSetMinMaxStep();
			}
			setState(932); vfrStatementQuestionOptionList();
			setState(933); match(EndOneof);
			setState(934); match(SemiColon);
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

	public static class VfrOneofFlagsFieldContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<NumericFlagsFieldContext> numericFlagsField() {
			return getRuleContexts(NumericFlagsFieldContext.class);
		}
		public NumericFlagsFieldContext numericFlagsField(int i) {
			return getRuleContext(NumericFlagsFieldContext.class,i);
		}
		public VfrOneofFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrOneofFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrOneofFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrOneofFlagsField(this);
		}
	}

	public final VfrOneofFlagsFieldContext vfrOneofFlagsField() throws RecognitionException {
		VfrOneofFlagsFieldContext _localctx = new VfrOneofFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_vfrOneofFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936); numericFlagsField();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(937); match(OrBitwise);
				setState(938); numericFlagsField();
				}
				}
				setState(943);
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

	public static class VfrStatementNumericContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public TerminalNode Numeric() { return getToken(vfrParser.Numeric, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Endnumeric() { return getToken(vfrParser.Endnumeric, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrNumericFlagsContext vfrNumericFlags() {
			return getRuleContext(VfrNumericFlagsContext.class,0);
		}
		public VfrSetMinMaxStepContext vfrSetMinMaxStep() {
			return getRuleContext(VfrSetMinMaxStepContext.class,0);
		}
		public VfrStatementNumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementNumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementNumeric(this);
		}
	}

	public final VfrStatementNumericContext vfrStatementNumeric() throws RecognitionException {
		VfrStatementNumericContext _localctx = new VfrStatementNumericContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_vfrStatementNumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944); match(Numeric);
			setState(945); vfrQuestionHeader();
			setState(951);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(946); match(Flags);
				setState(947); match(Equals);
				setState(948); vfrNumericFlags();
				setState(949); match(Comma);
				}
			}

			setState(957);
			_la = _input.LA(1);
			if (_la==Key) {
				{
				setState(953); match(Key);
				setState(954); match(Equals);
				setState(955); match(Number);
				setState(956); match(Comma);
				}
			}

			setState(959); vfrSetMinMaxStep();
			setState(960); vfrStatementQuestionOptionList();
			setState(961); match(Endnumeric);
			setState(962); match(SemiColon);
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

	public static class VfrSetMinMaxStepContext extends ParserRuleContext {
		public TerminalNode Maximum() { return getToken(vfrParser.Maximum, 0); }
		public TerminalNode Step() { return getToken(vfrParser.Step, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Minimum() { return getToken(vfrParser.Minimum, 0); }
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrSetMinMaxStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrSetMinMaxStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrSetMinMaxStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrSetMinMaxStep(this);
		}
	}

	public final VfrSetMinMaxStepContext vfrSetMinMaxStep() throws RecognitionException {
		VfrSetMinMaxStepContext _localctx = new VfrSetMinMaxStepContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_vfrSetMinMaxStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(Minimum);
			setState(965); match(Equals);
			setState(966); match(Number);
			setState(967); match(Comma);
			setState(968); match(Maximum);
			setState(969); match(Equals);
			setState(970); match(Number);
			setState(971); match(Comma);
			setState(976);
			_la = _input.LA(1);
			if (_la==Step) {
				{
				setState(972); match(Step);
				setState(973); match(Equals);
				setState(974); match(Number);
				setState(975); match(Comma);
				}
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

	public static class VfrNumericFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<NumericFlagsFieldContext> numericFlagsField() {
			return getRuleContexts(NumericFlagsFieldContext.class);
		}
		public NumericFlagsFieldContext numericFlagsField(int i) {
			return getRuleContext(NumericFlagsFieldContext.class,i);
		}
		public VfrNumericFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrNumericFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrNumericFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrNumericFlags(this);
		}
	}

	public final VfrNumericFlagsContext vfrNumericFlags() throws RecognitionException {
		VfrNumericFlagsContext _localctx = new VfrNumericFlagsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_vfrNumericFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978); numericFlagsField();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(979); match(OrBitwise);
				setState(980); numericFlagsField();
				}
				}
				setState(985);
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

	public static class NumericFlagsFieldContext extends ParserRuleContext {
		public TerminalNode DispUintDec() { return getToken(vfrParser.DispUintDec, 0); }
		public TerminalNode NumSize1() { return getToken(vfrParser.NumSize1, 0); }
		public TerminalNode NumSize2() { return getToken(vfrParser.NumSize2, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public TerminalNode DispUintHex() { return getToken(vfrParser.DispUintHex, 0); }
		public TerminalNode DispIntDec() { return getToken(vfrParser.DispIntDec, 0); }
		public TerminalNode NumSize8() { return getToken(vfrParser.NumSize8, 0); }
		public TerminalNode NumSize4() { return getToken(vfrParser.NumSize4, 0); }
		public NumericFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterNumericFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitNumericFlagsField(this);
		}
	}

	public final NumericFlagsFieldContext numericFlagsField() throws RecognitionException {
		NumericFlagsFieldContext _localctx = new NumericFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_numericFlagsField);
		int _la;
		try {
			setState(988);
			switch (_input.LA(1)) {
			case Number:
			case NumSize1:
			case NumSize2:
			case NumSize4:
			case NumSize8:
			case DispIntDec:
			case DispUintDec:
			case DispUintHex:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				_la = _input.LA(1);
				if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (NumSize1 - 169)) | (1L << (NumSize2 - 169)) | (1L << (NumSize4 - 169)) | (1L << (NumSize8 - 169)) | (1L << (DispIntDec - 169)) | (1L << (DispUintDec - 169)) | (1L << (DispUintHex - 169)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(987); questionheaderFlagsField();
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

	public static class VfrStatementDateContext extends ParserRuleContext {
		public List<TerminalNode> Period() { return getTokens(vfrParser.Period); }
		public List<TerminalNode> StringIdentifier() { return getTokens(vfrParser.StringIdentifier); }
		public TerminalNode Prompt(int i) {
			return getToken(vfrParser.Prompt, i);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public List<TerminalNode> Help() { return getTokens(vfrParser.Help); }
		public EqualTermContext equalTerm() {
			return getRuleContext(EqualTermContext.class,0);
		}
		public TerminalNode Month() { return getToken(vfrParser.Month, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public List<GetStringIdContext> getStringId() {
			return getRuleContexts(GetStringIdContext.class);
		}
		public TerminalNode Year() { return getToken(vfrParser.Year, 0); }
		public MinMaxDateStepDefaultContext minMaxDateStepDefault(int i) {
			return getRuleContext(MinMaxDateStepDefaultContext.class,i);
		}
		public List<VfrStatementInconsistentIfContext> vfrStatementInconsistentIf() {
			return getRuleContexts(VfrStatementInconsistentIfContext.class);
		}
		public TerminalNode Period(int i) {
			return getToken(vfrParser.Period, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public List<TerminalNode> Varid() { return getTokens(vfrParser.Varid); }
		public TerminalNode Help(int i) {
			return getToken(vfrParser.Help, i);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public VfrDateFlagsContext vfrDateFlags() {
			return getRuleContext(VfrDateFlagsContext.class,0);
		}
		public GetStringIdContext getStringId(int i) {
			return getRuleContext(GetStringIdContext.class,i);
		}
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Varid(int i) {
			return getToken(vfrParser.Varid, i);
		}
		public TerminalNode Date() { return getToken(vfrParser.Date, 0); }
		public List<MinMaxDateStepDefaultContext> minMaxDateStepDefault() {
			return getRuleContexts(MinMaxDateStepDefaultContext.class);
		}
		public TerminalNode StringIdentifier(int i) {
			return getToken(vfrParser.StringIdentifier, i);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode EndDate() { return getToken(vfrParser.EndDate, 0); }
		public TerminalNode Day() { return getToken(vfrParser.Day, 0); }
		public VfrStatementInconsistentIfContext vfrStatementInconsistentIf(int i) {
			return getRuleContext(VfrStatementInconsistentIfContext.class,i);
		}
		public List<TerminalNode> Prompt() { return getTokens(vfrParser.Prompt); }
		public VfrStatementDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementDate(this);
		}
	}

	public final VfrStatementDateContext vfrStatementDate() throws RecognitionException {
		VfrStatementDateContext _localctx = new VfrStatementDateContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_vfrStatementDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); match(Date);
			setState(1055);
			switch (_input.LA(1)) {
			case Prompt:
			case Varid:
			case Name:
			case QuestionId:
				{
				{
				setState(991); vfrQuestionHeader();
				setState(997);
				_la = _input.LA(1);
				if (_la==Flags) {
					{
					setState(992); match(Flags);
					setState(993); match(Equals);
					setState(994); vfrDateFlags();
					setState(995); match(Comma);
					}
				}

				setState(999); vfrStatementQuestionOptionList();
				}
				}
				break;
			case Year:
				{
				{
				setState(1001); match(Year);
				setState(1002); match(Varid);
				setState(1003); match(Equals);
				setState(1004); match(StringIdentifier);
				setState(1005); match(Period);
				setState(1006); match(StringIdentifier);
				setState(1007); match(Comma);
				setState(1008); match(Prompt);
				setState(1009); match(Equals);
				setState(1010); getStringId();
				setState(1011); match(Comma);
				setState(1012); match(Help);
				setState(1013); match(Equals);
				setState(1014); getStringId();
				setState(1015); match(Comma);
				setState(1016); minMaxDateStepDefault();
				setState(1017); match(Month);
				setState(1018); match(Varid);
				setState(1019); match(Equals);
				setState(1020); match(StringIdentifier);
				setState(1021); match(Period);
				setState(1022); match(StringIdentifier);
				setState(1023); match(Comma);
				setState(1024); match(Prompt);
				setState(1025); match(Equals);
				setState(1026); getStringId();
				setState(1027); match(Comma);
				setState(1028); match(Help);
				setState(1029); match(Equals);
				setState(1030); getStringId();
				setState(1031); match(Comma);
				setState(1032); minMaxDateStepDefault();
				setState(1033); match(Day);
				setState(1034); match(Varid);
				setState(1035); equalTerm();
				setState(1036); match(StringIdentifier);
				setState(1037); match(Period);
				setState(1038); match(StringIdentifier);
				setState(1039); match(Comma);
				setState(1040); match(Prompt);
				setState(1041); match(Equals);
				setState(1042); getStringId();
				setState(1043); match(Comma);
				setState(1044); match(Help);
				setState(1045); match(Equals);
				setState(1046); getStringId();
				setState(1047); match(Comma);
				setState(1048); minMaxDateStepDefault();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InconsistentIf) {
					{
					{
					setState(1049); vfrStatementInconsistentIf();
					}
					}
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1057); match(EndDate);
			setState(1058); match(SemiColon);
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

	public static class VfrStatementInconsistentIfContext extends ParserRuleContext {
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode InconsistentIf() { return getToken(vfrParser.InconsistentIf, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public TerminalNode Prompt() { return getToken(vfrParser.Prompt, 0); }
		public VfrStatementInconsistentIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementInconsistentIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementInconsistentIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementInconsistentIf(this);
		}
	}

	public final VfrStatementInconsistentIfContext vfrStatementInconsistentIf() throws RecognitionException {
		VfrStatementInconsistentIfContext _localctx = new VfrStatementInconsistentIfContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_vfrStatementInconsistentIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); match(InconsistentIf);
			setState(1061); match(Prompt);
			setState(1062); match(Equals);
			setState(1063); getStringId();
			setState(1064); match(Comma);
			setState(1065); vfrStatementExpression();
			setState(1066); match(EndIf);
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

	public static class VfrStatementQuestionOptionListContext extends ParserRuleContext {
		public VfrStatementQuestionOptionTagContext vfrStatementQuestionOptionTag(int i) {
			return getRuleContext(VfrStatementQuestionOptionTagContext.class,i);
		}
		public List<VfrStatementQuestionOptionTagContext> vfrStatementQuestionOptionTag() {
			return getRuleContexts(VfrStatementQuestionOptionTagContext.class);
		}
		public List<VfrStatementQuestionTagContext> vfrStatementQuestionTag() {
			return getRuleContexts(VfrStatementQuestionTagContext.class);
		}
		public VfrStatementQuestionTagContext vfrStatementQuestionTag(int i) {
			return getRuleContext(VfrStatementQuestionTagContext.class,i);
		}
		public VfrStatementQuestionOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementQuestionOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementQuestionOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementQuestionOptionList(this);
		}
	}

	public final VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() throws RecognitionException {
		VfrStatementQuestionOptionListContext _localctx = new VfrStatementQuestionOptionListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_vfrStatementQuestionOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Image) | (1L << Locked) | (1L << Default) | (1L << Value) | (1L << InconsistentIf))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SuppressIf - 64)) | (1L << (Read - 64)) | (1L << (Write - 64)) | (1L << (Option - 64)) | (1L << (NoSubmitIf - 64)) | (1L << (DisableIf - 64)) | (1L << (Refresh - 64)) | (1L << (VarStoreDevice - 64)) | (1L << (RefreshGuid - 64)) | (1L << (Guidop - 64)))) != 0)) {
				{
				setState(1070);
				switch (_input.LA(1)) {
				case Image:
				case Locked:
				case InconsistentIf:
				case NoSubmitIf:
				case DisableIf:
				case Refresh:
				case VarStoreDevice:
				case RefreshGuid:
				case Guidop:
					{
					setState(1068); vfrStatementQuestionTag();
					}
					break;
				case Default:
				case Value:
				case SuppressIf:
				case Read:
				case Write:
				case Option:
					{
					setState(1069); vfrStatementQuestionOptionTag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1074);
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

	public static class VfrStatementQuestionOptionTagContext extends ParserRuleContext {
		public VfrStatementReadContext vfrStatementRead() {
			return getRuleContext(VfrStatementReadContext.class,0);
		}
		public VfrStatementSuppressIfQuestContext vfrStatementSuppressIfQuest() {
			return getRuleContext(VfrStatementSuppressIfQuestContext.class,0);
		}
		public VfrStatementDefaultContext vfrStatementDefault() {
			return getRuleContext(VfrStatementDefaultContext.class,0);
		}
		public VfrStatementWriteContext vfrStatementWrite() {
			return getRuleContext(VfrStatementWriteContext.class,0);
		}
		public VfrStatementOptionsContext vfrStatementOptions() {
			return getRuleContext(VfrStatementOptionsContext.class,0);
		}
		public VfrStatementValueContext vfrStatementValue() {
			return getRuleContext(VfrStatementValueContext.class,0);
		}
		public VfrStatementQuestionOptionTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementQuestionOptionTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementQuestionOptionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementQuestionOptionTag(this);
		}
	}

	public final VfrStatementQuestionOptionTagContext vfrStatementQuestionOptionTag() throws RecognitionException {
		VfrStatementQuestionOptionTagContext _localctx = new VfrStatementQuestionOptionTagContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_vfrStatementQuestionOptionTag);
		try {
			setState(1081);
			switch (_input.LA(1)) {
			case SuppressIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075); vfrStatementSuppressIfQuest();
				}
				break;
			case Value:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076); vfrStatementValue();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077); vfrStatementDefault();
				}
				break;
			case Option:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078); vfrStatementOptions();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079); vfrStatementRead();
				}
				break;
			case Write:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080); vfrStatementWrite();
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

	public static class VfrStatementOptionsContext extends ParserRuleContext {
		public VfrStatementOneOfOptionContext vfrStatementOneOfOption() {
			return getRuleContext(VfrStatementOneOfOptionContext.class,0);
		}
		public VfrStatementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementOptions(this);
		}
	}

	public final VfrStatementOptionsContext vfrStatementOptions() throws RecognitionException {
		VfrStatementOptionsContext _localctx = new VfrStatementOptionsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_vfrStatementOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); vfrStatementOneOfOption();
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

	public static class VfrStatementOneOfOptionContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(vfrParser.Text, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Option() { return getToken(vfrParser.Option, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrOneOfOptionFlagsContext vfrOneOfOptionFlags() {
			return getRuleContext(VfrOneOfOptionFlagsContext.class,0);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public VfrConstantValueFieldContext vfrConstantValueField() {
			return getRuleContext(VfrConstantValueFieldContext.class,0);
		}
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public VfrImageTagContext vfrImageTag(int i) {
			return getRuleContext(VfrImageTagContext.class,i);
		}
		public TerminalNode Value() { return getToken(vfrParser.Value, 0); }
		public List<VfrImageTagContext> vfrImageTag() {
			return getRuleContexts(VfrImageTagContext.class);
		}
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementOneOfOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementOneOfOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementOneOfOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementOneOfOption(this);
		}
	}

	public final VfrStatementOneOfOptionContext vfrStatementOneOfOption() throws RecognitionException {
		VfrStatementOneOfOptionContext _localctx = new VfrStatementOneOfOptionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_vfrStatementOneOfOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); match(Option);
			setState(1086); match(Text);
			setState(1087); match(Equals);
			setState(1088); getStringId();
			setState(1089); match(Comma);
			setState(1090); match(Value);
			setState(1091); match(Equals);
			setState(1092); vfrConstantValueField();
			setState(1093); match(Comma);
			setState(1094); match(Flags);
			setState(1095); match(Equals);
			setState(1096); vfrOneOfOptionFlags();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1097); match(Comma);
				setState(1098); vfrImageTag();
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1104); match(SemiColon);
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

	public static class VfrOneOfOptionFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public OneofoptionFlagsFieldContext oneofoptionFlagsField(int i) {
			return getRuleContext(OneofoptionFlagsFieldContext.class,i);
		}
		public List<OneofoptionFlagsFieldContext> oneofoptionFlagsField() {
			return getRuleContexts(OneofoptionFlagsFieldContext.class);
		}
		public VfrOneOfOptionFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrOneOfOptionFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrOneOfOptionFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrOneOfOptionFlags(this);
		}
	}

	public final VfrOneOfOptionFlagsContext vfrOneOfOptionFlags() throws RecognitionException {
		VfrOneOfOptionFlagsContext _localctx = new VfrOneOfOptionFlagsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_vfrOneOfOptionFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); oneofoptionFlagsField();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1107); match(OrBitwise);
				setState(1108); oneofoptionFlagsField();
				}
				}
				setState(1113);
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

	public static class OneofoptionFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(vfrParser.Default, 0); }
		public TerminalNode ResetRequired() { return getToken(vfrParser.ResetRequired, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode OptionDefaultMfg() { return getToken(vfrParser.OptionDefaultMfg, 0); }
		public TerminalNode OptionDefault() { return getToken(vfrParser.OptionDefault, 0); }
		public TerminalNode Interactive() { return getToken(vfrParser.Interactive, 0); }
		public OneofoptionFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofoptionFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterOneofoptionFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitOneofoptionFlagsField(this);
		}
	}

	public final OneofoptionFlagsFieldContext oneofoptionFlagsField() throws RecognitionException {
		OneofoptionFlagsFieldContext _localctx = new OneofoptionFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_oneofoptionFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_la = _input.LA(1);
			if ( !(_la==Default || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (Interactive - 169)) | (1L << (ResetRequired - 169)) | (1L << (OptionDefault - 169)) | (1L << (OptionDefaultMfg - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrStatementReadContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(vfrParser.Read, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public VfrStatementReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementRead(this);
		}
	}

	public final VfrStatementReadContext vfrStatementRead() throws RecognitionException {
		VfrStatementReadContext _localctx = new VfrStatementReadContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_vfrStatementRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116); match(Read);
			setState(1117); vfrStatementExpression();
			setState(1118); match(SemiColon);
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

	public static class VfrStatementWriteContext extends ParserRuleContext {
		public TerminalNode Write() { return getToken(vfrParser.Write, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public VfrStatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementWrite(this);
		}
	}

	public final VfrStatementWriteContext vfrStatementWrite() throws RecognitionException {
		VfrStatementWriteContext _localctx = new VfrStatementWriteContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_vfrStatementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120); match(Write);
			setState(1121); vfrStatementExpression();
			setState(1122); match(SemiColon);
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

	public static class VfrStatementSuppressIfQuestContext extends ParserRuleContext {
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public TerminalNode SuppressIf() { return getToken(vfrParser.SuppressIf, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public VfrStatementSuppressIfQuestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementSuppressIfQuest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementSuppressIfQuest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementSuppressIfQuest(this);
		}
	}

	public final VfrStatementSuppressIfQuestContext vfrStatementSuppressIfQuest() throws RecognitionException {
		VfrStatementSuppressIfQuestContext _localctx = new VfrStatementSuppressIfQuestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_vfrStatementSuppressIfQuest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124); match(SuppressIf);
			setState(1125); vfrStatementExpression();
			setState(1126); match(SemiColon);
			setState(1127); vfrStatementQuestionOptionList();
			setState(1128); match(EndIf);
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

	public static class VfrStatementQuestionTagContext extends ParserRuleContext {
		public VfrStatementStatTagContext vfrStatementStatTag() {
			return getRuleContext(VfrStatementStatTagContext.class,0);
		}
		public VfrStatementDisableIfQuestContext vfrStatementDisableIfQuest() {
			return getRuleContext(VfrStatementDisableIfQuestContext.class,0);
		}
		public VfrStatementNoSubmitIfContext vfrStatementNoSubmitIf() {
			return getRuleContext(VfrStatementNoSubmitIfContext.class,0);
		}
		public VfrStatementInconsistentIfContext vfrStatementInconsistentIf() {
			return getRuleContext(VfrStatementInconsistentIfContext.class,0);
		}
		public VfrStatementRefreshContext vfrStatementRefresh() {
			return getRuleContext(VfrStatementRefreshContext.class,0);
		}
		public VfrStatementVarstoreDeviceContext vfrStatementVarstoreDevice() {
			return getRuleContext(VfrStatementVarstoreDeviceContext.class,0);
		}
		public VfrStatementRefreshEventContext vfrStatementRefreshEvent() {
			return getRuleContext(VfrStatementRefreshEventContext.class,0);
		}
		public VfrStatementExtensionContext vfrStatementExtension() {
			return getRuleContext(VfrStatementExtensionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementQuestionTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementQuestionTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementQuestionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementQuestionTag(this);
		}
	}

	public final VfrStatementQuestionTagContext vfrStatementQuestionTag() throws RecognitionException {
		VfrStatementQuestionTagContext _localctx = new VfrStatementQuestionTagContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_vfrStatementQuestionTag);
		try {
			setState(1140);
			switch (_input.LA(1)) {
			case Image:
			case Locked:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130); vfrStatementStatTag();
				setState(1131); match(Comma);
				}
				break;
			case InconsistentIf:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133); vfrStatementInconsistentIf();
				}
				break;
			case NoSubmitIf:
				enterOuterAlt(_localctx, 3);
				{
				setState(1134); vfrStatementNoSubmitIf();
				}
				break;
			case DisableIf:
				enterOuterAlt(_localctx, 4);
				{
				setState(1135); vfrStatementDisableIfQuest();
				}
				break;
			case Refresh:
				enterOuterAlt(_localctx, 5);
				{
				setState(1136); vfrStatementRefresh();
				}
				break;
			case VarStoreDevice:
				enterOuterAlt(_localctx, 6);
				{
				setState(1137); vfrStatementVarstoreDevice();
				}
				break;
			case Guidop:
				enterOuterAlt(_localctx, 7);
				{
				setState(1138); vfrStatementExtension();
				}
				break;
			case RefreshGuid:
				enterOuterAlt(_localctx, 8);
				{
				setState(1139); vfrStatementRefreshEvent();
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

	public static class VfrStatementVarstoreDeviceContext extends ParserRuleContext {
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode VarStoreDevice() { return getToken(vfrParser.VarStoreDevice, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementVarstoreDeviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementVarstoreDevice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementVarstoreDevice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementVarstoreDevice(this);
		}
	}

	public final VfrStatementVarstoreDeviceContext vfrStatementVarstoreDevice() throws RecognitionException {
		VfrStatementVarstoreDeviceContext _localctx = new VfrStatementVarstoreDeviceContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_vfrStatementVarstoreDevice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); match(VarStoreDevice);
			setState(1143); match(Equals);
			setState(1144); getStringId();
			setState(1145); match(Comma);
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

	public static class VfrStatementRefreshEventContext extends ParserRuleContext {
		public GuidDefinitionContext guidDefinition() {
			return getRuleContext(GuidDefinitionContext.class,0);
		}
		public TerminalNode RefreshGuid() { return getToken(vfrParser.RefreshGuid, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrStatementRefreshEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementRefreshEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementRefreshEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementRefreshEvent(this);
		}
	}

	public final VfrStatementRefreshEventContext vfrStatementRefreshEvent() throws RecognitionException {
		VfrStatementRefreshEventContext _localctx = new VfrStatementRefreshEventContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_vfrStatementRefreshEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(RefreshGuid);
			setState(1148); match(Equals);
			setState(1149); guidDefinition();
			setState(1150); match(Comma);
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

	public static class VfrStatementRefreshContext extends ParserRuleContext {
		public TerminalNode Interval() { return getToken(vfrParser.Interval, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Refresh() { return getToken(vfrParser.Refresh, 0); }
		public VfrStatementRefreshContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementRefresh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementRefresh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementRefresh(this);
		}
	}

	public final VfrStatementRefreshContext vfrStatementRefresh() throws RecognitionException {
		VfrStatementRefreshContext _localctx = new VfrStatementRefreshContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_vfrStatementRefresh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152); match(Refresh);
			setState(1153); match(Interval);
			setState(1154); match(Equals);
			setState(1155); match(Number);
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

	public static class VfrStatementDisableIfQuestContext extends ParserRuleContext {
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode DisableIf() { return getToken(vfrParser.DisableIf, 0); }
		public VfrStatementDisableIfQuestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementDisableIfQuest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementDisableIfQuest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementDisableIfQuest(this);
		}
	}

	public final VfrStatementDisableIfQuestContext vfrStatementDisableIfQuest() throws RecognitionException {
		VfrStatementDisableIfQuestContext _localctx = new VfrStatementDisableIfQuestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_vfrStatementDisableIfQuest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157); match(DisableIf);
			setState(1158); vfrStatementExpression();
			setState(1159); match(SemiColon);
			setState(1160); vfrStatementQuestionOptionList();
			setState(1161); match(EndIf);
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

	public static class VfrStatementNoSubmitIfContext extends ParserRuleContext {
		public TerminalNode NoSubmitIf() { return getToken(vfrParser.NoSubmitIf, 0); }
		public TerminalNode EndIf() { return getToken(vfrParser.EndIf, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public TerminalNode Prompt() { return getToken(vfrParser.Prompt, 0); }
		public VfrStatementNoSubmitIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementNoSubmitIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementNoSubmitIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementNoSubmitIf(this);
		}
	}

	public final VfrStatementNoSubmitIfContext vfrStatementNoSubmitIf() throws RecognitionException {
		VfrStatementNoSubmitIfContext _localctx = new VfrStatementNoSubmitIfContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_vfrStatementNoSubmitIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163); match(NoSubmitIf);
			setState(1164); match(Prompt);
			setState(1165); match(Equals);
			setState(1166); getStringId();
			setState(1167); match(Comma);
			setState(1168); vfrStatementExpression();
			setState(1169); match(EndIf);
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

	public static class VfrDateFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public List<DateFlagsFieldContext> dateFlagsField() {
			return getRuleContexts(DateFlagsFieldContext.class);
		}
		public DateFlagsFieldContext dateFlagsField(int i) {
			return getRuleContext(DateFlagsFieldContext.class,i);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public VfrDateFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrDateFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrDateFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrDateFlags(this);
		}
	}

	public final VfrDateFlagsContext vfrDateFlags() throws RecognitionException {
		VfrDateFlagsContext _localctx = new VfrDateFlagsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_vfrDateFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); dateFlagsField();
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1172); match(OrBitwise);
				setState(1173); dateFlagsField();
				}
				}
				setState(1178);
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

	public static class DateFlagsFieldContext extends ParserRuleContext {
		public TerminalNode YearSuppress() { return getToken(vfrParser.YearSuppress, 0); }
		public TerminalNode StorageWakeup() { return getToken(vfrParser.StorageWakeup, 0); }
		public TerminalNode StorageTime() { return getToken(vfrParser.StorageTime, 0); }
		public TerminalNode DaySuppress() { return getToken(vfrParser.DaySuppress, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode MonthSuppress() { return getToken(vfrParser.MonthSuppress, 0); }
		public TerminalNode StorageNormal() { return getToken(vfrParser.StorageNormal, 0); }
		public DateFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterDateFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitDateFlagsField(this);
		}
	}

	public final DateFlagsFieldContext dateFlagsField() throws RecognitionException {
		DateFlagsFieldContext _localctx = new DateFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dateFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_la = _input.LA(1);
			if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (YearSuppress - 169)) | (1L << (MonthSuppress - 169)) | (1L << (DaySuppress - 169)) | (1L << (StorageNormal - 169)) | (1L << (StorageTime - 169)) | (1L << (StorageWakeup - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrQuestionHeaderContext extends ParserRuleContext {
		public TerminalNode Varid() { return getToken(vfrParser.Varid, 0); }
		public VfrStorageVarIdContext vfrStorageVarId() {
			return getRuleContext(VfrStorageVarIdContext.class,0);
		}
		public TerminalNode QuestionId() { return getToken(vfrParser.QuestionId, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode Name() { return getToken(vfrParser.Name, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementHeaderContext vfrStatementHeader() {
			return getRuleContext(VfrStatementHeaderContext.class,0);
		}
		public VfrQuestionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrQuestionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrQuestionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrQuestionHeader(this);
		}
	}

	public final VfrQuestionHeaderContext vfrQuestionHeader() throws RecognitionException {
		VfrQuestionHeaderContext _localctx = new VfrQuestionHeaderContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_vfrQuestionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(1181); match(Name);
				setState(1182); match(Equals);
				setState(1183); match(StringIdentifier);
				setState(1184); match(Comma);
				}
			}

			setState(1192);
			_la = _input.LA(1);
			if (_la==Varid) {
				{
				setState(1187); match(Varid);
				setState(1188); match(Equals);
				setState(1189); vfrStorageVarId();
				setState(1190); match(Comma);
				}
			}

			setState(1198);
			_la = _input.LA(1);
			if (_la==QuestionId) {
				{
				setState(1194); match(QuestionId);
				setState(1195); match(Equals);
				setState(1196); match(Number);
				setState(1197); match(Comma);
				}
			}

			setState(1200); vfrStatementHeader();
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

	public static class VfrStatementHeaderContext extends ParserRuleContext {
		public TerminalNode Help() { return getToken(vfrParser.Help, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public List<GetStringIdContext> getStringId() {
			return getRuleContexts(GetStringIdContext.class);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public GetStringIdContext getStringId(int i) {
			return getRuleContext(GetStringIdContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public TerminalNode Prompt() { return getToken(vfrParser.Prompt, 0); }
		public VfrStatementHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementHeader(this);
		}
	}

	public final VfrStatementHeaderContext vfrStatementHeader() throws RecognitionException {
		VfrStatementHeaderContext _localctx = new VfrStatementHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_vfrStatementHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); match(Prompt);
			setState(1203); match(Equals);
			setState(1204); getStringId();
			setState(1205); match(Comma);
			setState(1206); match(Help);
			setState(1207); match(Equals);
			setState(1208); getStringId();
			setState(1209); match(Comma);
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

	public static class MinMaxDateStepDefaultContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(vfrParser.Default, 0); }
		public TerminalNode Maximum() { return getToken(vfrParser.Maximum, 0); }
		public TerminalNode Step() { return getToken(vfrParser.Step, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode Minimum() { return getToken(vfrParser.Minimum, 0); }
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public MinMaxDateStepDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minMaxDateStepDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterMinMaxDateStepDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitMinMaxDateStepDefault(this);
		}
	}

	public final MinMaxDateStepDefaultContext minMaxDateStepDefault() throws RecognitionException {
		MinMaxDateStepDefaultContext _localctx = new MinMaxDateStepDefaultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_minMaxDateStepDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211); match(Minimum);
			setState(1212); match(Equals);
			setState(1213); match(Number);
			setState(1214); match(Comma);
			setState(1215); match(Maximum);
			setState(1216); match(Equals);
			setState(1217); match(Number);
			setState(1218); match(Comma);
			setState(1223);
			_la = _input.LA(1);
			if (_la==Step) {
				{
				setState(1219); match(Step);
				setState(1220); match(Equals);
				setState(1221); match(Number);
				setState(1222); match(Comma);
				}
			}

			setState(1229);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(1225); match(Default);
				setState(1226); match(Equals);
				setState(1227); match(Number);
				setState(1228); match(Comma);
				}
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

	public static class VfrStatementBooleanTypeContext extends ParserRuleContext {
		public VfrStatementCheckBoxContext vfrStatementCheckBox() {
			return getRuleContext(VfrStatementCheckBoxContext.class,0);
		}
		public VfrStatementActionContext vfrStatementAction() {
			return getRuleContext(VfrStatementActionContext.class,0);
		}
		public VfrStatementBooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementBooleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementBooleanType(this);
		}
	}

	public final VfrStatementBooleanTypeContext vfrStatementBooleanType() throws RecognitionException {
		VfrStatementBooleanTypeContext _localctx = new VfrStatementBooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_vfrStatementBooleanType);
		try {
			setState(1233);
			switch (_input.LA(1)) {
			case Checkbox:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231); vfrStatementCheckBox();
				}
				break;
			case Action:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232); vfrStatementAction();
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

	public static class VfrStatementCheckBoxContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Key() { return getToken(vfrParser.Key, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public VfrStatementQuestionOptionListContext vfrStatementQuestionOptionList() {
			return getRuleContext(VfrStatementQuestionOptionListContext.class,0);
		}
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public VfrCheckBoxFlagsContext vfrCheckBoxFlags() {
			return getRuleContext(VfrCheckBoxFlagsContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode EndCheckbox() { return getToken(vfrParser.EndCheckbox, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public TerminalNode Checkbox() { return getToken(vfrParser.Checkbox, 0); }
		public VfrStatementCheckBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementCheckBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementCheckBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementCheckBox(this);
		}
	}

	public final VfrStatementCheckBoxContext vfrStatementCheckBox() throws RecognitionException {
		VfrStatementCheckBoxContext _localctx = new VfrStatementCheckBoxContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_vfrStatementCheckBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235); match(Checkbox);
			setState(1236); vfrQuestionHeader();
			setState(1242);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(1237); match(Flags);
				setState(1238); match(Equals);
				setState(1239); vfrCheckBoxFlags();
				setState(1240); match(Comma);
				}
			}

			setState(1248);
			_la = _input.LA(1);
			if (_la==Key) {
				{
				setState(1244); match(Key);
				setState(1245); match(Equals);
				setState(1246); match(Number);
				setState(1247); match(Comma);
				}
			}

			setState(1250); vfrStatementQuestionOptionList();
			setState(1251); match(EndCheckbox);
			setState(1252); match(SemiColon);
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

	public static class VfrCheckBoxFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public CheckboxFlagsFieldContext checkboxFlagsField(int i) {
			return getRuleContext(CheckboxFlagsFieldContext.class,i);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<CheckboxFlagsFieldContext> checkboxFlagsField() {
			return getRuleContexts(CheckboxFlagsFieldContext.class);
		}
		public VfrCheckBoxFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrCheckBoxFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrCheckBoxFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrCheckBoxFlags(this);
		}
	}

	public final VfrCheckBoxFlagsContext vfrCheckBoxFlags() throws RecognitionException {
		VfrCheckBoxFlagsContext _localctx = new VfrCheckBoxFlagsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_vfrCheckBoxFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254); checkboxFlagsField();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1255); match(OrBitwise);
				setState(1256); checkboxFlagsField();
				}
				}
				setState(1261);
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

	public static class CheckboxFlagsFieldContext extends ParserRuleContext {
		public TerminalNode CheckboxDefaultMfg() { return getToken(vfrParser.CheckboxDefaultMfg, 0); }
		public TerminalNode CheckboxDefault() { return getToken(vfrParser.CheckboxDefault, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public CheckboxFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkboxFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterCheckboxFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitCheckboxFlagsField(this);
		}
	}

	public final CheckboxFlagsFieldContext checkboxFlagsField() throws RecognitionException {
		CheckboxFlagsFieldContext _localctx = new CheckboxFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_checkboxFlagsField);
		int _la;
		try {
			setState(1264);
			switch (_input.LA(1)) {
			case Number:
			case CheckboxDefault:
			case CheckboxDefaultMfg:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				_la = _input.LA(1);
				if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (CheckboxDefault - 169)) | (1L << (CheckboxDefaultMfg - 169)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263); questionheaderFlagsField();
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

	public static class VfrStatementActionContext extends ParserRuleContext {
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public VfrActionFlagsContext vfrActionFlags() {
			return getRuleContext(VfrActionFlagsContext.class,0);
		}
		public TerminalNode Config() { return getToken(vfrParser.Config, 0); }
		public VfrQuestionHeaderContext vfrQuestionHeader() {
			return getRuleContext(VfrQuestionHeaderContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public VfrStatementQuestionTagListContext vfrStatementQuestionTagList() {
			return getRuleContext(VfrStatementQuestionTagListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(vfrParser.SemiColon, 0); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode Action() { return getToken(vfrParser.Action, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode EndAction() { return getToken(vfrParser.EndAction, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementAction(this);
		}
	}

	public final VfrStatementActionContext vfrStatementAction() throws RecognitionException {
		VfrStatementActionContext _localctx = new VfrStatementActionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_vfrStatementAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266); match(Action);
			setState(1267); vfrQuestionHeader();
			setState(1268); match(Comma);
			setState(1274);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(1269); match(Flags);
				setState(1270); match(Equals);
				setState(1271); vfrActionFlags();
				setState(1272); match(Comma);
				}
			}

			setState(1276); match(Config);
			setState(1277); match(Equals);
			setState(1278); getStringId();
			setState(1279); match(Comma);
			setState(1280); vfrStatementQuestionTagList();
			setState(1281); match(EndAction);
			setState(1282); match(SemiColon);
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

	public static class VfrStatementQuestionTagListContext extends ParserRuleContext {
		public List<VfrStatementQuestionTagContext> vfrStatementQuestionTag() {
			return getRuleContexts(VfrStatementQuestionTagContext.class);
		}
		public VfrStatementQuestionTagContext vfrStatementQuestionTag(int i) {
			return getRuleContext(VfrStatementQuestionTagContext.class,i);
		}
		public VfrStatementQuestionTagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementQuestionTagList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementQuestionTagList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementQuestionTagList(this);
		}
	}

	public final VfrStatementQuestionTagListContext vfrStatementQuestionTagList() throws RecognitionException {
		VfrStatementQuestionTagListContext _localctx = new VfrStatementQuestionTagListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_vfrStatementQuestionTagList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Image) | (1L << Locked) | (1L << InconsistentIf))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (NoSubmitIf - 69)) | (1L << (DisableIf - 69)) | (1L << (Refresh - 69)) | (1L << (VarStoreDevice - 69)) | (1L << (RefreshGuid - 69)) | (1L << (Guidop - 69)))) != 0)) {
				{
				{
				setState(1284); vfrStatementQuestionTag();
				}
				}
				setState(1289);
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

	public static class VfrActionFlagsContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public List<ActionFlagsFieldContext> actionFlagsField() {
			return getRuleContexts(ActionFlagsFieldContext.class);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public ActionFlagsFieldContext actionFlagsField(int i) {
			return getRuleContext(ActionFlagsFieldContext.class,i);
		}
		public VfrActionFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrActionFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrActionFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrActionFlags(this);
		}
	}

	public final VfrActionFlagsContext vfrActionFlags() throws RecognitionException {
		VfrActionFlagsContext _localctx = new VfrActionFlagsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_vfrActionFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); actionFlagsField();
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1291); match(OrBitwise);
				setState(1292); actionFlagsField();
				}
				}
				setState(1297);
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

	public static class ActionFlagsFieldContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public QuestionheaderFlagsFieldContext questionheaderFlagsField() {
			return getRuleContext(QuestionheaderFlagsFieldContext.class,0);
		}
		public ActionFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterActionFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitActionFlagsField(this);
		}
	}

	public final ActionFlagsFieldContext actionFlagsField() throws RecognitionException {
		ActionFlagsFieldContext _localctx = new ActionFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_actionFlagsField);
		try {
			setState(1300);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298); match(Number);
				}
				break;
			case ReadOnly:
			case Interactive:
			case ResetRequired:
			case OptionsOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299); questionheaderFlagsField();
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

	public static class VfrStatementDefaultContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(vfrParser.Default, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public TerminalNode DefaultStore() { return getToken(vfrParser.DefaultStore, 0); }
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public VfrStatementValueContext vfrStatementValue() {
			return getRuleContext(VfrStatementValueContext.class,0);
		}
		public VfrConstantValueFieldContext vfrConstantValueField() {
			return getRuleContext(VfrConstantValueFieldContext.class,0);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrStatementDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementDefault(this);
		}
	}

	public final VfrStatementDefaultContext vfrStatementDefault() throws RecognitionException {
		VfrStatementDefaultContext _localctx = new VfrStatementDefaultContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_vfrStatementDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302); match(Default);
			{
			setState(1310);
			switch (_input.LA(1)) {
			case Value:
				{
				setState(1303); vfrStatementValue();
				setState(1304); match(Comma);
				}
				break;
			case Equals:
				{
				setState(1306); match(Equals);
				setState(1307); vfrConstantValueField();
				setState(1308); match(Comma);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1316);
			_la = _input.LA(1);
			if (_la==DefaultStore) {
				{
				setState(1312); match(DefaultStore);
				setState(1313); match(Equals);
				setState(1314); match(StringIdentifier);
				setState(1315); match(Comma);
				}
			}

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

	public static class VfrConstantValueFieldContext extends ParserRuleContext {
		public List<TerminalNode> Colon() { return getTokens(vfrParser.Colon); }
		public TerminalNode ZERO() { return getToken(vfrParser.ZERO, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Colon(int i) {
			return getToken(vfrParser.Colon, i);
		}
		public TerminalNode TRUE() { return getToken(vfrParser.TRUE, 0); }
		public TerminalNode Divide(int i) {
			return getToken(vfrParser.Divide, i);
		}
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public List<TerminalNode> Divide() { return getTokens(vfrParser.Divide); }
		public TerminalNode ONES() { return getToken(vfrParser.ONES, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode ONE() { return getToken(vfrParser.ONE, 0); }
		public TerminalNode StringToken() { return getToken(vfrParser.StringToken, 0); }
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public TerminalNode FALSE() { return getToken(vfrParser.FALSE, 0); }
		public VfrConstantValueFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrConstantValueField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrConstantValueField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrConstantValueField(this);
		}
	}

	public final VfrConstantValueFieldContext vfrConstantValueField() throws RecognitionException {
		VfrConstantValueFieldContext _localctx = new VfrConstantValueFieldContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_vfrConstantValueField);
		int _la;
		try {
			setState(1333);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				_la = _input.LA(1);
				if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (TRUE - 162)) | (1L << (FALSE - 162)) | (1L << (ONE - 162)) | (1L << (ONES - 162)) | (1L << (ZERO - 162)) | (1L << (Number - 162)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319); match(Number);
				setState(1320); match(Colon);
				setState(1321); match(Number);
				setState(1322); match(Colon);
				setState(1323); match(Number);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1324); match(Number);
				setState(1325); match(Divide);
				setState(1326); match(Number);
				setState(1327); match(Divide);
				setState(1328); match(Number);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329); match(StringToken);
				setState(1330); match(LParen);
				setState(1331); match(Number);
				setState(1332); match(RParen);
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

	public static class VfrStatementValueContext extends ParserRuleContext {
		public TerminalNode Value() { return getToken(vfrParser.Value, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public VfrStatementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementValue(this);
		}
	}

	public final VfrStatementValueContext vfrStatementValue() throws RecognitionException {
		VfrStatementValueContext _localctx = new VfrStatementValueContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_vfrStatementValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335); match(Value);
			setState(1336); match(Equals);
			setState(1337); vfrStatementExpression();
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

	public static class VfrStatementExpressionContext extends ParserRuleContext {
		public TerminalNode Or(int i) {
			return getToken(vfrParser.Or, i);
		}
		public List<AndTermContext> andTerm() {
			return getRuleContexts(AndTermContext.class);
		}
		public AndTermContext andTerm(int i) {
			return getRuleContext(AndTermContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(vfrParser.Or); }
		public VfrStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStatementExpression(this);
		}
	}

	public final VfrStatementExpressionContext vfrStatementExpression() throws RecognitionException {
		VfrStatementExpressionContext _localctx = new VfrStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_vfrStatementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339); andTerm();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(1340); match(Or);
				setState(1341); andTerm();
				}
				}
				setState(1346);
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

	public static class AndTermContext extends ParserRuleContext {
		public List<TerminalNode> And() { return getTokens(vfrParser.And); }
		public List<BitwiseorTermContext> bitwiseorTerm() {
			return getRuleContexts(BitwiseorTermContext.class);
		}
		public TerminalNode And(int i) {
			return getToken(vfrParser.And, i);
		}
		public BitwiseorTermContext bitwiseorTerm(int i) {
			return getRuleContext(BitwiseorTermContext.class,i);
		}
		public AndTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterAndTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitAndTerm(this);
		}
	}

	public final AndTermContext andTerm() throws RecognitionException {
		AndTermContext _localctx = new AndTermContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_andTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); bitwiseorTerm();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(1348); match(And);
				setState(1349); bitwiseorTerm();
				}
				}
				setState(1354);
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

	public static class BitwiseorTermContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public List<BitwiseandTermContext> bitwiseandTerm() {
			return getRuleContexts(BitwiseandTermContext.class);
		}
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public BitwiseandTermContext bitwiseandTerm(int i) {
			return getRuleContext(BitwiseandTermContext.class,i);
		}
		public BitwiseorTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseorTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterBitwiseorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitBitwiseorTerm(this);
		}
	}

	public final BitwiseorTermContext bitwiseorTerm() throws RecognitionException {
		BitwiseorTermContext _localctx = new BitwiseorTermContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_bitwiseorTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355); bitwiseandTerm();
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1356); match(OrBitwise);
				setState(1357); bitwiseandTerm();
				}
				}
				setState(1362);
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

	public static class BitwiseandTermContext extends ParserRuleContext {
		public List<EqualTermContext> equalTerm() {
			return getRuleContexts(EqualTermContext.class);
		}
		public List<TerminalNode> AndBitwise() { return getTokens(vfrParser.AndBitwise); }
		public TerminalNode AndBitwise(int i) {
			return getToken(vfrParser.AndBitwise, i);
		}
		public EqualTermContext equalTerm(int i) {
			return getRuleContext(EqualTermContext.class,i);
		}
		public BitwiseandTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseandTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterBitwiseandTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitBitwiseandTerm(this);
		}
	}

	public final BitwiseandTermContext bitwiseandTerm() throws RecognitionException {
		BitwiseandTermContext _localctx = new BitwiseandTermContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_bitwiseandTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363); equalTerm();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndBitwise) {
				{
				{
				setState(1364); match(AndBitwise);
				setState(1365); equalTerm();
				}
				}
				setState(1370);
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

	public static class EqualTermContext extends ParserRuleContext {
		public List<TerminalNode> NotEquals() { return getTokens(vfrParser.NotEquals); }
		public TerminalNode NotEquals(int i) {
			return getToken(vfrParser.NotEquals, i);
		}
		public CompareTermContext compareTerm(int i) {
			return getRuleContext(CompareTermContext.class,i);
		}
		public List<CompareTermContext> compareTerm() {
			return getRuleContexts(CompareTermContext.class);
		}
		public List<TerminalNode> EqualsEquals() { return getTokens(vfrParser.EqualsEquals); }
		public TerminalNode EqualsEquals(int i) {
			return getToken(vfrParser.EqualsEquals, i);
		}
		public EqualTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterEqualTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitEqualTerm(this);
		}
	}

	public final EqualTermContext equalTerm() throws RecognitionException {
		EqualTermContext _localctx = new EqualTermContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_equalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371); compareTerm();
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EqualsEquals || _la==NotEquals) {
				{
				setState(1376);
				switch (_input.LA(1)) {
				case EqualsEquals:
					{
					setState(1372); match(EqualsEquals);
					setState(1373); compareTerm();
					}
					break;
				case NotEquals:
					{
					setState(1374); match(NotEquals);
					setState(1375); compareTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1380);
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

	public static class CompareTermContext extends ParserRuleContext {
		public TerminalNode LessThan(int i) {
			return getToken(vfrParser.LessThan, i);
		}
		public List<TerminalNode> LessThan() { return getTokens(vfrParser.LessThan); }
		public ShiftTermContext shiftTerm(int i) {
			return getRuleContext(ShiftTermContext.class,i);
		}
		public List<ShiftTermContext> shiftTerm() {
			return getRuleContexts(ShiftTermContext.class);
		}
		public TerminalNode GreaterThanEquals(int i) {
			return getToken(vfrParser.GreaterThanEquals, i);
		}
		public List<TerminalNode> GreaterThanEquals() { return getTokens(vfrParser.GreaterThanEquals); }
		public List<TerminalNode> GreaterThan() { return getTokens(vfrParser.GreaterThan); }
		public List<TerminalNode> LessThanEquals() { return getTokens(vfrParser.LessThanEquals); }
		public TerminalNode GreaterThan(int i) {
			return getToken(vfrParser.GreaterThan, i);
		}
		public TerminalNode LessThanEquals(int i) {
			return getToken(vfrParser.LessThanEquals, i);
		}
		public CompareTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterCompareTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitCompareTerm(this);
		}
	}

	public final CompareTermContext compareTerm() throws RecognitionException {
		CompareTermContext _localctx = new CompareTermContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_compareTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381); shiftTerm();
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (LessThan - 136)) | (1L << (LessThanEquals - 136)) | (1L << (GreaterThan - 136)) | (1L << (GreaterThanEquals - 136)))) != 0)) {
				{
				setState(1390);
				switch (_input.LA(1)) {
				case LessThan:
					{
					setState(1382); match(LessThan);
					setState(1383); shiftTerm();
					}
					break;
				case LessThanEquals:
					{
					setState(1384); match(LessThanEquals);
					setState(1385); shiftTerm();
					}
					break;
				case GreaterThan:
					{
					setState(1386); match(GreaterThan);
					setState(1387); shiftTerm();
					}
					break;
				case GreaterThanEquals:
					{
					setState(1388); match(GreaterThanEquals);
					setState(1389); shiftTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1394);
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

	public static class ShiftTermContext extends ParserRuleContext {
		public List<TerminalNode> ShiftLeft() { return getTokens(vfrParser.ShiftLeft); }
		public List<TerminalNode> ShiftRight() { return getTokens(vfrParser.ShiftRight); }
		public List<AddMinusTermContext> addMinusTerm() {
			return getRuleContexts(AddMinusTermContext.class);
		}
		public AddMinusTermContext addMinusTerm(int i) {
			return getRuleContext(AddMinusTermContext.class,i);
		}
		public TerminalNode ShiftRight(int i) {
			return getToken(vfrParser.ShiftRight, i);
		}
		public TerminalNode ShiftLeft(int i) {
			return getToken(vfrParser.ShiftLeft, i);
		}
		public ShiftTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterShiftTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitShiftTerm(this);
		}
	}

	public final ShiftTermContext shiftTerm() throws RecognitionException {
		ShiftTermContext _localctx = new ShiftTermContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_shiftTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395); addMinusTerm();
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ShiftLeft || _la==ShiftRight) {
				{
				setState(1400);
				switch (_input.LA(1)) {
				case ShiftLeft:
					{
					setState(1396); match(ShiftLeft);
					setState(1397); addMinusTerm();
					}
					break;
				case ShiftRight:
					{
					setState(1398); match(ShiftRight);
					setState(1399); addMinusTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1404);
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

	public static class AddMinusTermContext extends ParserRuleContext {
		public List<MultdivmodTermContext> multdivmodTerm() {
			return getRuleContexts(MultdivmodTermContext.class);
		}
		public TerminalNode Minus(int i) {
			return getToken(vfrParser.Minus, i);
		}
		public TerminalNode Plus(int i) {
			return getToken(vfrParser.Plus, i);
		}
		public List<TerminalNode> Plus() { return getTokens(vfrParser.Plus); }
		public MultdivmodTermContext multdivmodTerm(int i) {
			return getRuleContext(MultdivmodTermContext.class,i);
		}
		public List<TerminalNode> Minus() { return getTokens(vfrParser.Minus); }
		public AddMinusTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMinusTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterAddMinusTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitAddMinusTerm(this);
		}
	}

	public final AddMinusTermContext addMinusTerm() throws RecognitionException {
		AddMinusTermContext _localctx = new AddMinusTermContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_addMinusTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405); multdivmodTerm();
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				setState(1410);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(1406); match(Plus);
					setState(1407); multdivmodTerm();
					}
					break;
				case Minus:
					{
					setState(1408); match(Minus);
					setState(1409); multdivmodTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1414);
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

	public static class MultdivmodTermContext extends ParserRuleContext {
		public TerminalNode Multiply(int i) {
			return getToken(vfrParser.Multiply, i);
		}
		public CastTermContext castTerm(int i) {
			return getRuleContext(CastTermContext.class,i);
		}
		public TerminalNode Divide(int i) {
			return getToken(vfrParser.Divide, i);
		}
		public List<CastTermContext> castTerm() {
			return getRuleContexts(CastTermContext.class);
		}
		public List<TerminalNode> Divide() { return getTokens(vfrParser.Divide); }
		public TerminalNode Modulus(int i) {
			return getToken(vfrParser.Modulus, i);
		}
		public List<TerminalNode> Modulus() { return getTokens(vfrParser.Modulus); }
		public List<TerminalNode> Multiply() { return getTokens(vfrParser.Multiply); }
		public MultdivmodTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdivmodTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterMultdivmodTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitMultdivmodTerm(this);
		}
	}

	public final MultdivmodTermContext multdivmodTerm() throws RecognitionException {
		MultdivmodTermContext _localctx = new MultdivmodTermContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_multdivmodTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415); castTerm();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (Multiply - 144)) | (1L << (Divide - 144)) | (1L << (Modulus - 144)))) != 0)) {
				{
				setState(1422);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(1416); match(Multiply);
					setState(1417); castTerm();
					}
					break;
				case Divide:
					{
					setState(1418); match(Divide);
					setState(1419); castTerm();
					}
					break;
				case Modulus:
					{
					setState(1420); match(Modulus);
					setState(1421); castTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1426);
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

	public static class CastTermContext extends ParserRuleContext {
		public List<TerminalNode> UINT16() { return getTokens(vfrParser.UINT16); }
		public List<TerminalNode> LParen() { return getTokens(vfrParser.LParen); }
		public List<TerminalNode> UINT8() { return getTokens(vfrParser.UINT8); }
		public List<TerminalNode> RParen() { return getTokens(vfrParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(vfrParser.RParen, i);
		}
		public TerminalNode UINT8(int i) {
			return getToken(vfrParser.UINT8, i);
		}
		public List<TerminalNode> UINT64() { return getTokens(vfrParser.UINT64); }
		public TerminalNode UINT16(int i) {
			return getToken(vfrParser.UINT16, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(vfrParser.BOOLEAN); }
		public AtomTermContext atomTerm() {
			return getRuleContext(AtomTermContext.class,0);
		}
		public List<TerminalNode> UINT32() { return getTokens(vfrParser.UINT32); }
		public TerminalNode UINT64(int i) {
			return getToken(vfrParser.UINT64, i);
		}
		public TerminalNode UINT32(int i) {
			return getToken(vfrParser.UINT32, i);
		}
		public TerminalNode LParen(int i) {
			return getToken(vfrParser.LParen, i);
		}
		public TerminalNode BOOLEAN(int i) {
			return getToken(vfrParser.BOOLEAN, i);
		}
		public CastTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterCastTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitCastTerm(this);
		}
	}

	public final CastTermContext castTerm() throws RecognitionException {
		CastTermContext _localctx = new CastTermContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_castTerm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1427); match(LParen);
					setState(1428);
					_la = _input.LA(1);
					if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (BOOLEAN - 157)) | (1L << (UINT64 - 157)) | (1L << (UINT32 - 157)) | (1L << (UINT16 - 157)) | (1L << (UINT8 - 157)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1429); match(RParen);
					}
					} 
				}
				setState(1434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(1435); atomTerm();
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

	public static class AtomTermContext extends ParserRuleContext {
		public VfrExpressionBuildInFunctionContext vfrExpressionBuildInFunction() {
			return getRuleContext(VfrExpressionBuildInFunctionContext.class,0);
		}
		public VfrExpressionParenContext vfrExpressionParen() {
			return getRuleContext(VfrExpressionParenContext.class,0);
		}
		public VfrExpressionMatchContext vfrExpressionMatch() {
			return getRuleContext(VfrExpressionMatchContext.class,0);
		}
		public VfrExpressionConstantContext vfrExpressionConstant() {
			return getRuleContext(VfrExpressionConstantContext.class,0);
		}
		public AtomTermContext atomTerm() {
			return getRuleContext(AtomTermContext.class,0);
		}
		public TerminalNode Not() { return getToken(vfrParser.Not, 0); }
		public VfrExpressionUnaryOpContext vfrExpressionUnaryOp() {
			return getRuleContext(VfrExpressionUnaryOpContext.class,0);
		}
		public VfrExpressionMapContext vfrExpressionMap() {
			return getRuleContext(VfrExpressionMapContext.class,0);
		}
		public VfrExpressionCatenateContext vfrExpressionCatenate() {
			return getRuleContext(VfrExpressionCatenateContext.class,0);
		}
		public VfrExpressionTernaryOpContext vfrExpressionTernaryOp() {
			return getRuleContext(VfrExpressionTernaryOpContext.class,0);
		}
		public AtomTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterAtomTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitAtomTerm(this);
		}
	}

	public final AtomTermContext atomTerm() throws RecognitionException {
		AtomTermContext _localctx = new AtomTermContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_atomTerm);
		try {
			setState(1447);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437); vfrExpressionCatenate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438); vfrExpressionMatch();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439); vfrExpressionParen();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440); vfrExpressionBuildInFunction();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1441); vfrExpressionConstant();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1442); vfrExpressionUnaryOp();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1443); vfrExpressionTernaryOp();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1444); vfrExpressionMap();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1445); match(Not);
				setState(1446); atomTerm();
				}
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

	public static class VfrExpressionCatenateContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Catenate() { return getToken(vfrParser.Catenate, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrExpressionCatenateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionCatenate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionCatenate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionCatenate(this);
		}
	}

	public final VfrExpressionCatenateContext vfrExpressionCatenate() throws RecognitionException {
		VfrExpressionCatenateContext _localctx = new VfrExpressionCatenateContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_vfrExpressionCatenate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449); match(Catenate);
			setState(1450); match(LParen);
			setState(1451); vfrStatementExpression();
			setState(1452); match(Comma);
			setState(1453); vfrStatementExpression();
			setState(1454); match(RParen);
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

	public static class VfrExpressionMatchContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Match() { return getToken(vfrParser.Match, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public VfrExpressionMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionMatch(this);
		}
	}

	public final VfrExpressionMatchContext vfrExpressionMatch() throws RecognitionException {
		VfrExpressionMatchContext _localctx = new VfrExpressionMatchContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_vfrExpressionMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); match(Match);
			setState(1457); match(LParen);
			setState(1458); vfrStatementExpression();
			setState(1459); match(Comma);
			setState(1460); vfrStatementExpression();
			setState(1461); match(RParen);
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

	public static class VfrExpressionParenContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrExpressionParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionParen(this);
		}
	}

	public final VfrExpressionParenContext vfrExpressionParen() throws RecognitionException {
		VfrExpressionParenContext _localctx = new VfrExpressionParenContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_vfrExpressionParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463); match(LParen);
			setState(1464); vfrStatementExpression();
			setState(1465); match(RParen);
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

	public static class VfrExpressionBuildInFunctionContext extends ParserRuleContext {
		public GetExpContext getExp() {
			return getRuleContext(GetExpContext.class,0);
		}
		public IdeqvalExpContext ideqvalExp() {
			return getRuleContext(IdeqvalExpContext.class,0);
		}
		public DupExpContext dupExp() {
			return getRuleContext(DupExpContext.class,0);
		}
		public RulerefExpContext rulerefExp() {
			return getRuleContext(RulerefExpContext.class,0);
		}
		public SecurityExpContext securityExp() {
			return getRuleContext(SecurityExpContext.class,0);
		}
		public Stringref1ExpContext stringref1Exp() {
			return getRuleContext(Stringref1ExpContext.class,0);
		}
		public IdeqvallistExpContext ideqvallistExp() {
			return getRuleContext(IdeqvallistExpContext.class,0);
		}
		public PushthisExpContext pushthisExp() {
			return getRuleContext(PushthisExpContext.class,0);
		}
		public Questionref1ExpContext questionref1Exp() {
			return getRuleContext(Questionref1ExpContext.class,0);
		}
		public IdeqidExpContext ideqidExp() {
			return getRuleContext(IdeqidExpContext.class,0);
		}
		public VfrExpressionBuildInFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionBuildInFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionBuildInFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionBuildInFunction(this);
		}
	}

	public final VfrExpressionBuildInFunctionContext vfrExpressionBuildInFunction() throws RecognitionException {
		VfrExpressionBuildInFunctionContext _localctx = new VfrExpressionBuildInFunctionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_vfrExpressionBuildInFunction);
		try {
			setState(1477);
			switch (_input.LA(1)) {
			case Dup:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467); dupExp();
				}
				break;
			case Ideqval:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468); ideqvalExp();
				}
				break;
			case Ideqid:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469); ideqidExp();
				}
				break;
			case Ideqvallist:
				enterOuterAlt(_localctx, 4);
				{
				setState(1470); ideqvallistExp();
				}
				break;
			case Questionref:
			case Number:
				enterOuterAlt(_localctx, 5);
				{
				setState(1471); questionref1Exp();
				}
				break;
			case Ruleref:
				enterOuterAlt(_localctx, 6);
				{
				setState(1472); rulerefExp();
				}
				break;
			case Stringref:
				enterOuterAlt(_localctx, 7);
				{
				setState(1473); stringref1Exp();
				}
				break;
			case Pushthis:
				enterOuterAlt(_localctx, 8);
				{
				setState(1474); pushthisExp();
				}
				break;
			case Security:
				enterOuterAlt(_localctx, 9);
				{
				setState(1475); securityExp();
				}
				break;
			case Get:
				enterOuterAlt(_localctx, 10);
				{
				setState(1476); getExp();
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

	public static class DupExpContext extends ParserRuleContext {
		public TerminalNode Dup() { return getToken(vfrParser.Dup, 0); }
		public DupExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dupExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterDupExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitDupExp(this);
		}
	}

	public final DupExpContext dupExp() throws RecognitionException {
		DupExpContext _localctx = new DupExpContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_dupExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479); match(Dup);
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

	public static class VfrQuestionDataFieldNameContext extends ParserRuleContext {
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public VfrQuestionDataFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrQuestionDataFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrQuestionDataFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrQuestionDataFieldName(this);
		}
	}

	public final VfrQuestionDataFieldNameContext vfrQuestionDataFieldName() throws RecognitionException {
		VfrQuestionDataFieldNameContext _localctx = new VfrQuestionDataFieldNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_vfrQuestionDataFieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481); match(StringIdentifier);
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

	public static class IdeqvalExpContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode Ideqval() { return getToken(vfrParser.Ideqval, 0); }
		public VfrQuestionDataFieldNameContext vfrQuestionDataFieldName() {
			return getRuleContext(VfrQuestionDataFieldNameContext.class,0);
		}
		public TerminalNode EqualsEquals() { return getToken(vfrParser.EqualsEquals, 0); }
		public IdeqvalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ideqvalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterIdeqvalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitIdeqvalExp(this);
		}
	}

	public final IdeqvalExpContext ideqvalExp() throws RecognitionException {
		IdeqvalExpContext _localctx = new IdeqvalExpContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_ideqvalExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483); match(Ideqval);
			setState(1484); vfrQuestionDataFieldName();
			setState(1485); match(EqualsEquals);
			setState(1486); match(Number);
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

	public static class IdeqidExpContext extends ParserRuleContext {
		public TerminalNode Ideqid() { return getToken(vfrParser.Ideqid, 0); }
		public List<VfrQuestionDataFieldNameContext> vfrQuestionDataFieldName() {
			return getRuleContexts(VfrQuestionDataFieldNameContext.class);
		}
		public TerminalNode EqualsEquals() { return getToken(vfrParser.EqualsEquals, 0); }
		public VfrQuestionDataFieldNameContext vfrQuestionDataFieldName(int i) {
			return getRuleContext(VfrQuestionDataFieldNameContext.class,i);
		}
		public IdeqidExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ideqidExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterIdeqidExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitIdeqidExp(this);
		}
	}

	public final IdeqidExpContext ideqidExp() throws RecognitionException {
		IdeqidExpContext _localctx = new IdeqidExpContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ideqidExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488); match(Ideqid);
			setState(1489); vfrQuestionDataFieldName();
			setState(1490); match(EqualsEquals);
			setState(1491); vfrQuestionDataFieldName();
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

	public static class IdeqvallistExpContext extends ParserRuleContext {
		public TerminalNode Ideqvallist() { return getToken(vfrParser.Ideqvallist, 0); }
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public VfrQuestionDataFieldNameContext vfrQuestionDataFieldName() {
			return getRuleContext(VfrQuestionDataFieldNameContext.class,0);
		}
		public TerminalNode EqualsEquals() { return getToken(vfrParser.EqualsEquals, 0); }
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public IdeqvallistExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ideqvallistExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterIdeqvallistExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitIdeqvallistExp(this);
		}
	}

	public final IdeqvallistExpContext ideqvallistExp() throws RecognitionException {
		IdeqvallistExpContext _localctx = new IdeqvallistExpContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ideqvallistExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); match(Ideqvallist);
			setState(1494); vfrQuestionDataFieldName();
			setState(1495); match(EqualsEquals);
			setState(1497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1496); match(Number);
				}
				}
				setState(1499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Number );
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

	public static class Questionref1ExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Questionref() { return getToken(vfrParser.Questionref, 0); }
		public Questionref1ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionref1Exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterQuestionref1Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitQuestionref1Exp(this);
		}
	}

	public final Questionref1ExpContext questionref1Exp() throws RecognitionException {
		Questionref1ExpContext _localctx = new Questionref1ExpContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_questionref1Exp);
		try {
			setState(1506);
			switch (_input.LA(1)) {
			case Questionref:
				enterOuterAlt(_localctx, 1);
				{
				setState(1501); match(Questionref);
				setState(1502); match(LParen);
				setState(1503); match(StringIdentifier);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504); match(Number);
				setState(1505); match(RParen);
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

	public static class RulerefExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Ruleref() { return getToken(vfrParser.Ruleref, 0); }
		public TerminalNode StringIdentifier() { return getToken(vfrParser.StringIdentifier, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public RulerefExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulerefExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterRulerefExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitRulerefExp(this);
		}
	}

	public final RulerefExpContext rulerefExp() throws RecognitionException {
		RulerefExpContext _localctx = new RulerefExpContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_rulerefExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508); match(Ruleref);
			setState(1509); match(LParen);
			setState(1510); match(StringIdentifier);
			setState(1511); match(RParen);
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

	public static class Stringref1ExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Stringref() { return getToken(vfrParser.Stringref, 0); }
		public GetStringIdContext getStringId() {
			return getRuleContext(GetStringIdContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public Stringref1ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringref1Exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterStringref1Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitStringref1Exp(this);
		}
	}

	public final Stringref1ExpContext stringref1Exp() throws RecognitionException {
		Stringref1ExpContext _localctx = new Stringref1ExpContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_stringref1Exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513); match(Stringref);
			setState(1514); match(LParen);
			setState(1515); getStringId();
			setState(1516); match(RParen);
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

	public static class PushthisExpContext extends ParserRuleContext {
		public TerminalNode Pushthis() { return getToken(vfrParser.Pushthis, 0); }
		public PushthisExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushthisExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterPushthisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitPushthisExp(this);
		}
	}

	public final PushthisExpContext pushthisExp() throws RecognitionException {
		PushthisExpContext _localctx = new PushthisExpContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_pushthisExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518); match(Pushthis);
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

	public static class SecurityExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public GuidDefinitionContext guidDefinition() {
			return getRuleContext(GuidDefinitionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Security() { return getToken(vfrParser.Security, 0); }
		public SecurityExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_securityExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterSecurityExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitSecurityExp(this);
		}
	}

	public final SecurityExpContext securityExp() throws RecognitionException {
		SecurityExpContext _localctx = new SecurityExpContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_securityExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520); match(Security);
			setState(1521); match(LParen);
			setState(1522); guidDefinition();
			setState(1523); match(RParen);
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

	public static class GetExpContext extends ParserRuleContext {
		public TerminalNode OrBitwise() { return getToken(vfrParser.OrBitwise, 0); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public VfrStorageVarIdContext vfrStorageVarId() {
			return getRuleContext(VfrStorageVarIdContext.class,0);
		}
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public VfrNumericFlagsContext vfrNumericFlags() {
			return getRuleContext(VfrNumericFlagsContext.class,0);
		}
		public TerminalNode Get() { return getToken(vfrParser.Get, 0); }
		public GetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterGetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitGetExp(this);
		}
	}

	public final GetExpContext getExp() throws RecognitionException {
		GetExpContext _localctx = new GetExpContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_getExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525); match(Get);
			setState(1526); match(LParen);
			setState(1527); vfrStorageVarId();
			setState(1529);
			_la = _input.LA(1);
			if (_la==OrBitwise) {
				{
				setState(1528); match(OrBitwise);
				}
			}

			setState(1532);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(1531); match(Flags);
				}
			}

			setState(1535);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(1534); match(Equals);
				}
			}

			setState(1538);
			_la = _input.LA(1);
			if (((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (NumSize1 - 169)) | (1L << (NumSize2 - 169)) | (1L << (NumSize4 - 169)) | (1L << (NumSize8 - 169)) | (1L << (DispIntDec - 169)) | (1L << (DispUintDec - 169)) | (1L << (DispUintHex - 169)) | (1L << (ReadOnly - 169)) | (1L << (Interactive - 169)) | (1L << (ResetRequired - 169)) | (1L << (OptionsOnly - 169)))) != 0)) {
				{
				setState(1537); vfrNumericFlags();
				}
			}

			setState(1540); match(RParen);
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

	public static class QuestionheaderFlagsFieldContext extends ParserRuleContext {
		public TerminalNode ReadOnly() { return getToken(vfrParser.ReadOnly, 0); }
		public TerminalNode OptionsOnly() { return getToken(vfrParser.OptionsOnly, 0); }
		public TerminalNode ResetRequired() { return getToken(vfrParser.ResetRequired, 0); }
		public TerminalNode Interactive() { return getToken(vfrParser.Interactive, 0); }
		public QuestionheaderFlagsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionheaderFlagsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterQuestionheaderFlagsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitQuestionheaderFlagsField(this);
		}
	}

	public final QuestionheaderFlagsFieldContext questionheaderFlagsField() throws RecognitionException {
		QuestionheaderFlagsFieldContext _localctx = new QuestionheaderFlagsFieldContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_questionheaderFlagsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_la = _input.LA(1);
			if ( !(((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (ReadOnly - 181)) | (1L << (Interactive - 181)) | (1L << (ResetRequired - 181)) | (1L << (OptionsOnly - 181)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrExpressionConstantContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(vfrParser.ZERO, 0); }
		public TerminalNode UNDEFINED() { return getToken(vfrParser.UNDEFINED, 0); }
		public TerminalNode TRUE() { return getToken(vfrParser.TRUE, 0); }
		public TerminalNode VERSION() { return getToken(vfrParser.VERSION, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode ONES() { return getToken(vfrParser.ONES, 0); }
		public TerminalNode ONE() { return getToken(vfrParser.ONE, 0); }
		public TerminalNode FALSE() { return getToken(vfrParser.FALSE, 0); }
		public VfrExpressionConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionConstant(this);
		}
	}

	public final VfrExpressionConstantContext vfrExpressionConstant() throws RecognitionException {
		VfrExpressionConstantContext _localctx = new VfrExpressionConstantContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_vfrExpressionConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (TRUE - 162)) | (1L << (FALSE - 162)) | (1L << (ONE - 162)) | (1L << (ONES - 162)) | (1L << (ZERO - 162)) | (1L << (UNDEFINED - 162)) | (1L << (VERSION - 162)) | (1L << (Number - 162)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrExpressionUnaryOpContext extends ParserRuleContext {
		public Stringref2ExpContext stringref2Exp() {
			return getRuleContext(Stringref2ExpContext.class,0);
		}
		public TolwerExpContext tolwerExp() {
			return getRuleContext(TolwerExpContext.class,0);
		}
		public TostringExpContext tostringExp() {
			return getRuleContext(TostringExpContext.class,0);
		}
		public ToboolExpContext toboolExp() {
			return getRuleContext(ToboolExpContext.class,0);
		}
		public BitwisenotExpContext bitwisenotExp() {
			return getRuleContext(BitwisenotExpContext.class,0);
		}
		public ToupperExpContext toupperExp() {
			return getRuleContext(ToupperExpContext.class,0);
		}
		public UnintExpContext unintExp() {
			return getRuleContext(UnintExpContext.class,0);
		}
		public Question23refExpContext question23refExp() {
			return getRuleContext(Question23refExpContext.class,0);
		}
		public SetExpContext setExp() {
			return getRuleContext(SetExpContext.class,0);
		}
		public LengthExpContext lengthExp() {
			return getRuleContext(LengthExpContext.class,0);
		}
		public VfrExpressionUnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionUnaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionUnaryOp(this);
		}
	}

	public final VfrExpressionUnaryOpContext vfrExpressionUnaryOp() throws RecognitionException {
		VfrExpressionUnaryOpContext _localctx = new VfrExpressionUnaryOpContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_vfrExpressionUnaryOp);
		try {
			setState(1556);
			switch (_input.LA(1)) {
			case Length:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546); lengthExp();
				}
				break;
			case NotBitwise:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547); bitwisenotExp();
				}
				break;
			case Questionrefval:
				enterOuterAlt(_localctx, 3);
				{
				setState(1548); question23refExp();
				}
				break;
			case Stringrefval:
				enterOuterAlt(_localctx, 4);
				{
				setState(1549); stringref2Exp();
				}
				break;
			case Boolval:
				enterOuterAlt(_localctx, 5);
				{
				setState(1550); toboolExp();
				}
				break;
			case Stringval:
				enterOuterAlt(_localctx, 6);
				{
				setState(1551); tostringExp();
				}
				break;
			case Unintval:
				enterOuterAlt(_localctx, 7);
				{
				setState(1552); unintExp();
				}
				break;
			case Toupper:
				enterOuterAlt(_localctx, 8);
				{
				setState(1553); toupperExp();
				}
				break;
			case Tolower:
				enterOuterAlt(_localctx, 9);
				{
				setState(1554); tolwerExp();
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 10);
				{
				setState(1555); setExp();
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

	public static class LengthExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Length() { return getToken(vfrParser.Length, 0); }
		public LengthExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterLengthExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitLengthExp(this);
		}
	}

	public final LengthExpContext lengthExp() throws RecognitionException {
		LengthExpContext _localctx = new LengthExpContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lengthExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); match(Length);
			setState(1559); match(LParen);
			setState(1560); vfrStatementExpression();
			setState(1561); match(RParen);
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

	public static class BitwisenotExpContext extends ParserRuleContext {
		public TerminalNode NotBitwise() { return getToken(vfrParser.NotBitwise, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public BitwisenotExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwisenotExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterBitwisenotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitBitwisenotExp(this);
		}
	}

	public final BitwisenotExpContext bitwisenotExp() throws RecognitionException {
		BitwisenotExpContext _localctx = new BitwisenotExpContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_bitwisenotExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563); match(NotBitwise);
			setState(1564); match(LParen);
			setState(1565); vfrStatementExpression();
			setState(1566); match(RParen);
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

	public static class Question23refExpContext extends ParserRuleContext {
		public List<TerminalNode> LParen() { return getTokens(vfrParser.LParen); }
		public GuidDefinitionContext guidDefinition() {
			return getRuleContext(GuidDefinitionContext.class,0);
		}
		public TerminalNode Equals(int i) {
			return getToken(vfrParser.Equals, i);
		}
		public List<TerminalNode> RParen() { return getTokens(vfrParser.RParen); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode StringToken() { return getToken(vfrParser.StringToken, 0); }
		public TerminalNode DevicePath() { return getToken(vfrParser.DevicePath, 0); }
		public List<TerminalNode> BackSlash() { return getTokens(vfrParser.BackSlash); }
		public TerminalNode RParen(int i) {
			return getToken(vfrParser.RParen, i);
		}
		public TerminalNode S() { return getToken(vfrParser.S, 0); }
		public TerminalNode Uuid() { return getToken(vfrParser.Uuid, 0); }
		public TerminalNode Questionrefval() { return getToken(vfrParser.Questionrefval, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode BackSlash(int i) {
			return getToken(vfrParser.BackSlash, i);
		}
		public List<TerminalNode> Equals() { return getTokens(vfrParser.Equals); }
		public TerminalNode LParen(int i) {
			return getToken(vfrParser.LParen, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public Question23refExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question23refExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterQuestion23refExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitQuestion23refExp(this);
		}
	}

	public final Question23refExpContext question23refExp() throws RecognitionException {
		Question23refExpContext _localctx = new Question23refExpContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_question23refExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568); match(Questionrefval);
			setState(1569); match(LParen);
			setState(1580);
			_la = _input.LA(1);
			if (_la==DevicePath) {
				{
				setState(1570); match(DevicePath);
				setState(1571); match(Equals);
				setState(1572); match(StringToken);
				setState(1573); match(BackSlash);
				setState(1574); match(LParen);
				setState(1575); match(S);
				setState(1576); match(Number);
				setState(1577); match(BackSlash);
				setState(1578); match(RParen);
				setState(1579); match(Comma);
				}
			}

			setState(1587);
			_la = _input.LA(1);
			if (_la==Uuid) {
				{
				setState(1582); match(Uuid);
				setState(1583); match(Equals);
				setState(1584); guidDefinition();
				setState(1585); match(Comma);
				}
			}

			setState(1589); vfrStatementExpression();
			setState(1590); match(RParen);
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

	public static class Stringref2ExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Stringrefval() { return getToken(vfrParser.Stringrefval, 0); }
		public Stringref2ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringref2Exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterStringref2Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitStringref2Exp(this);
		}
	}

	public final Stringref2ExpContext stringref2Exp() throws RecognitionException {
		Stringref2ExpContext _localctx = new Stringref2ExpContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_stringref2Exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592); match(Stringrefval);
			setState(1593); match(LParen);
			setState(1594); vfrStatementExpression();
			setState(1595); match(RParen);
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

	public static class ToboolExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Boolval() { return getToken(vfrParser.Boolval, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public ToboolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toboolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterToboolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitToboolExp(this);
		}
	}

	public final ToboolExpContext toboolExp() throws RecognitionException {
		ToboolExpContext _localctx = new ToboolExpContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_toboolExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597); match(Boolval);
			setState(1598); match(LParen);
			setState(1599); vfrStatementExpression();
			setState(1600); match(RParen);
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

	public static class TostringExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Stringval() { return getToken(vfrParser.Stringval, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Format() { return getToken(vfrParser.Format, 0); }
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public TostringExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tostringExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterTostringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitTostringExp(this);
		}
	}

	public final TostringExpContext tostringExp() throws RecognitionException {
		TostringExpContext _localctx = new TostringExpContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_tostringExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602); match(Stringval);
			setState(1604);
			_la = _input.LA(1);
			if (_la==Format) {
				{
				setState(1603); match(Format);
				}
			}

			setState(1607);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(1606); match(Equals);
				}
			}

			setState(1610);
			_la = _input.LA(1);
			if (_la==Number) {
				{
				setState(1609); match(Number);
				}
			}

			setState(1613);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1612); match(Comma);
				}
			}

			setState(1615); match(LParen);
			setState(1616); vfrStatementExpression();
			setState(1617); match(RParen);
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

	public static class UnintExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Unintval() { return getToken(vfrParser.Unintval, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public UnintExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unintExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterUnintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitUnintExp(this);
		}
	}

	public final UnintExpContext unintExp() throws RecognitionException {
		UnintExpContext _localctx = new UnintExpContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unintExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619); match(Unintval);
			setState(1620); match(LParen);
			setState(1621); vfrStatementExpression();
			setState(1622); match(RParen);
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

	public static class ToupperExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Toupper() { return getToken(vfrParser.Toupper, 0); }
		public ToupperExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toupperExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterToupperExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitToupperExp(this);
		}
	}

	public final ToupperExpContext toupperExp() throws RecognitionException {
		ToupperExpContext _localctx = new ToupperExpContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_toupperExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624); match(Toupper);
			setState(1625); match(LParen);
			setState(1626); vfrStatementExpression();
			setState(1627); match(RParen);
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

	public static class TolwerExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Tolower() { return getToken(vfrParser.Tolower, 0); }
		public TolwerExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tolwerExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterTolwerExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitTolwerExp(this);
		}
	}

	public final TolwerExpContext tolwerExp() throws RecognitionException {
		TolwerExpContext _localctx = new TolwerExpContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_tolwerExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629); match(Tolower);
			setState(1630); match(LParen);
			setState(1631); vfrStatementExpression();
			setState(1632); match(RParen);
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

	public static class SetExpContext extends ParserRuleContext {
		public TerminalNode OrBitwise() { return getToken(vfrParser.OrBitwise, 0); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode Set() { return getToken(vfrParser.Set, 0); }
		public VfrStorageVarIdContext vfrStorageVarId() {
			return getRuleContext(VfrStorageVarIdContext.class,0);
		}
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression() {
			return getRuleContext(VfrStatementExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public VfrNumericFlagsContext vfrNumericFlags() {
			return getRuleContext(VfrNumericFlagsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(vfrParser.Comma, 0); }
		public SetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterSetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitSetExp(this);
		}
	}

	public final SetExpContext setExp() throws RecognitionException {
		SetExpContext _localctx = new SetExpContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_setExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634); match(Set);
			setState(1635); match(LParen);
			setState(1636); vfrStorageVarId();
			setState(1638);
			_la = _input.LA(1);
			if (_la==OrBitwise) {
				{
				setState(1637); match(OrBitwise);
				}
			}

			setState(1641);
			_la = _input.LA(1);
			if (_la==Flags) {
				{
				setState(1640); match(Flags);
				}
			}

			setState(1644);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(1643); match(Equals);
				}
			}

			setState(1647);
			_la = _input.LA(1);
			if (((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (Number - 169)) | (1L << (NumSize1 - 169)) | (1L << (NumSize2 - 169)) | (1L << (NumSize4 - 169)) | (1L << (NumSize8 - 169)) | (1L << (DispIntDec - 169)) | (1L << (DispUintDec - 169)) | (1L << (DispUintHex - 169)) | (1L << (ReadOnly - 169)) | (1L << (Interactive - 169)) | (1L << (ResetRequired - 169)) | (1L << (OptionsOnly - 169)))) != 0)) {
				{
				setState(1646); vfrNumericFlags();
				}
			}

			setState(1649); match(Comma);
			setState(1650); vfrStatementExpression();
			setState(1651); match(RParen);
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

	public static class VfrStorageVarIdContext extends ParserRuleContext {
		public List<TerminalNode> Period() { return getTokens(vfrParser.Period); }
		public TerminalNode RBracket(int i) {
			return getToken(vfrParser.RBracket, i);
		}
		public List<TerminalNode> RBracket() { return getTokens(vfrParser.RBracket); }
		public TerminalNode LBracket(int i) {
			return getToken(vfrParser.LBracket, i);
		}
		public List<TerminalNode> StringIdentifier() { return getTokens(vfrParser.StringIdentifier); }
		public List<TerminalNode> Number() { return getTokens(vfrParser.Number); }
		public TerminalNode StringIdentifier(int i) {
			return getToken(vfrParser.StringIdentifier, i);
		}
		public List<TerminalNode> LBracket() { return getTokens(vfrParser.LBracket); }
		public TerminalNode Period(int i) {
			return getToken(vfrParser.Period, i);
		}
		public TerminalNode Number(int i) {
			return getToken(vfrParser.Number, i);
		}
		public VfrStorageVarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrStorageVarId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrStorageVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrStorageVarId(this);
		}
	}

	public final VfrStorageVarIdContext vfrStorageVarId() throws RecognitionException {
		VfrStorageVarIdContext _localctx = new VfrStorageVarIdContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_vfrStorageVarId);
		int _la;
		try {
			setState(1670);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1653); match(StringIdentifier);
				setState(1654); match(LBracket);
				setState(1655); match(Number);
				setState(1656); match(RBracket);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1657); match(StringIdentifier);
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Period) {
					{
					{
					setState(1658); match(Period);
					setState(1659); match(StringIdentifier);
					setState(1663);
					_la = _input.LA(1);
					if (_la==LBracket) {
						{
						setState(1660); match(LBracket);
						setState(1661); match(Number);
						setState(1662); match(RBracket);
						}
					}

					}
					}
					setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class VfrExpressionTernaryOpContext extends ParserRuleContext {
		public FindExpContext findExp() {
			return getRuleContext(FindExpContext.class,0);
		}
		public SpanExpContext spanExp() {
			return getRuleContext(SpanExpContext.class,0);
		}
		public TokenExpContext tokenExp() {
			return getRuleContext(TokenExpContext.class,0);
		}
		public MidExpContext midExp() {
			return getRuleContext(MidExpContext.class,0);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public VfrExpressionTernaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionTernaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionTernaryOp(this);
		}
	}

	public final VfrExpressionTernaryOpContext vfrExpressionTernaryOp() throws RecognitionException {
		VfrExpressionTernaryOpContext _localctx = new VfrExpressionTernaryOpContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_vfrExpressionTernaryOp);
		try {
			setState(1677);
			switch (_input.LA(1)) {
			case Cond:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672); conditionalExp();
				}
				break;
			case Find:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673); findExp();
				}
				break;
			case Mid:
				enterOuterAlt(_localctx, 3);
				{
				setState(1674); midExp();
				}
				break;
			case Token:
				enterOuterAlt(_localctx, 4);
				{
				setState(1675); tokenExp();
				}
				break;
			case Span:
				enterOuterAlt(_localctx, 5);
				{
				setState(1676); spanExp();
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

	public static class ConditionalExpContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(vfrParser.Colon, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Cond() { return getToken(vfrParser.Cond, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(vfrParser.QuestionMark, 0); }
		public ConditionalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitConditionalExp(this);
		}
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_conditionalExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679); match(Cond);
			setState(1680); match(LParen);
			setState(1681); vfrStatementExpression();
			setState(1682); match(QuestionMark);
			setState(1683); vfrStatementExpression();
			setState(1684); match(Colon);
			setState(1685); vfrStatementExpression();
			setState(1686); match(RParen);
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

	public static class FindExpContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode Find() { return getToken(vfrParser.Find, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public List<FindFormatContext> findFormat() {
			return getRuleContexts(FindFormatContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public FindFormatContext findFormat(int i) {
			return getRuleContext(FindFormatContext.class,i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public FindExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterFindExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitFindExp(this);
		}
	}

	public final FindExpContext findExp() throws RecognitionException {
		FindExpContext _localctx = new FindExpContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_findExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688); match(Find);
			setState(1689); match(LParen);
			setState(1690); findFormat();
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1691); match(OrBitwise);
				setState(1692); findFormat();
				}
				}
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1698); match(Comma);
			setState(1699); vfrStatementExpression();
			setState(1700); match(Comma);
			setState(1701); vfrStatementExpression();
			setState(1702); match(Comma);
			setState(1703); vfrStatementExpression();
			setState(1704); match(RParen);
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

	public static class FindFormatContext extends ParserRuleContext {
		public TerminalNode Sensitive() { return getToken(vfrParser.Sensitive, 0); }
		public TerminalNode Insensitive() { return getToken(vfrParser.Insensitive, 0); }
		public FindFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterFindFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitFindFormat(this);
		}
	}

	public final FindFormatContext findFormat() throws RecognitionException {
		FindFormatContext _localctx = new FindFormatContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_findFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_la = _input.LA(1);
			if ( !(_la==Sensitive || _la==Insensitive) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MidExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Mid() { return getToken(vfrParser.Mid, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public MidExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterMidExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitMidExp(this);
		}
	}

	public final MidExpContext midExp() throws RecognitionException {
		MidExpContext _localctx = new MidExpContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_midExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708); match(Mid);
			setState(1709); match(LParen);
			setState(1710); vfrStatementExpression();
			setState(1711); match(Comma);
			setState(1712); vfrStatementExpression();
			setState(1713); match(Comma);
			setState(1714); vfrStatementExpression();
			setState(1715); match(RParen);
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

	public static class TokenExpContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Token() { return getToken(vfrParser.Token, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public TokenExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterTokenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitTokenExp(this);
		}
	}

	public final TokenExpContext tokenExp() throws RecognitionException {
		TokenExpContext _localctx = new TokenExpContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_tokenExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717); match(Token);
			setState(1718); match(LParen);
			setState(1719); vfrStatementExpression();
			setState(1720); match(Comma);
			setState(1721); vfrStatementExpression();
			setState(1722); match(Comma);
			setState(1723); vfrStatementExpression();
			setState(1724); match(RParen);
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

	public static class SpanExpContext extends ParserRuleContext {
		public List<TerminalNode> OrBitwise() { return getTokens(vfrParser.OrBitwise); }
		public TerminalNode Flags() { return getToken(vfrParser.Flags, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode OrBitwise(int i) {
			return getToken(vfrParser.OrBitwise, i);
		}
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public SpanFlagsContext spanFlags(int i) {
			return getRuleContext(SpanFlagsContext.class,i);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(vfrParser.Equals, 0); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public TerminalNode Span() { return getToken(vfrParser.Span, 0); }
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public List<SpanFlagsContext> spanFlags() {
			return getRuleContexts(SpanFlagsContext.class);
		}
		public SpanExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterSpanExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitSpanExp(this);
		}
	}

	public final SpanExpContext spanExp() throws RecognitionException {
		SpanExpContext _localctx = new SpanExpContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_spanExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726); match(Span);
			setState(1727); match(LParen);
			setState(1728); match(Flags);
			setState(1729); match(Equals);
			setState(1730); spanFlags();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrBitwise) {
				{
				{
				setState(1731); match(OrBitwise);
				setState(1732); spanFlags();
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1738); match(Comma);
			setState(1739); vfrStatementExpression();
			setState(1740); match(Comma);
			setState(1741); vfrStatementExpression();
			setState(1742); match(Comma);
			setState(1743); vfrStatementExpression();
			setState(1744); match(RParen);
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

	public static class SpanFlagsContext extends ParserRuleContext {
		public TerminalNode FirstNonMatch() { return getToken(vfrParser.FirstNonMatch, 0); }
		public TerminalNode Number() { return getToken(vfrParser.Number, 0); }
		public TerminalNode LastNonMatch() { return getToken(vfrParser.LastNonMatch, 0); }
		public SpanFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterSpanFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitSpanFlags(this);
		}
	}

	public final SpanFlagsContext spanFlags() throws RecognitionException {
		SpanFlagsContext _localctx = new SpanFlagsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_spanFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			_la = _input.LA(1);
			if ( !(_la==FirstNonMatch || _la==LastNonMatch || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VfrExpressionMapContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(vfrParser.Colon, 0); }
		public TerminalNode LParen() { return getToken(vfrParser.LParen, 0); }
		public TerminalNode Map() { return getToken(vfrParser.Map, 0); }
		public List<VfrStatementExpressionContext> vfrStatementExpression() {
			return getRuleContexts(VfrStatementExpressionContext.class);
		}
		public TerminalNode RParen() { return getToken(vfrParser.RParen, 0); }
		public VfrStatementExpressionContext vfrStatementExpression(int i) {
			return getRuleContext(VfrStatementExpressionContext.class,i);
		}
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public VfrExpressionMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfrExpressionMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterVfrExpressionMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitVfrExpressionMap(this);
		}
	}

	public final VfrExpressionMapContext vfrExpressionMap() throws RecognitionException {
		VfrExpressionMapContext _localctx = new VfrExpressionMapContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_vfrExpressionMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); match(Map);
			setState(1749); match(LParen);
			setState(1750); vfrStatementExpression();
			setState(1751); match(Colon);
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Catenate) | (1L << Match) | (1L << Dup) | (1L << Ideqval) | (1L << Ideqid) | (1L << Ideqvallist) | (1L << Questionref) | (1L << Ruleref) | (1L << Stringref) | (1L << Pushthis) | (1L << Security) | (1L << Get) | (1L << Length) | (1L << Questionrefval) | (1L << Stringrefval) | (1L << Boolval) | (1L << Stringval) | (1L << Unintval) | (1L << Toupper) | (1L << Tolower) | (1L << Set) | (1L << Cond) | (1L << Find) | (1L << Mid) | (1L << Token) | (1L << Span) | (1L << Map))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (Not - 127)) | (1L << (NotBitwise - 127)) | (1L << (LParen - 127)) | (1L << (TRUE - 127)) | (1L << (FALSE - 127)) | (1L << (ONE - 127)) | (1L << (ONES - 127)) | (1L << (ZERO - 127)) | (1L << (UNDEFINED - 127)) | (1L << (VERSION - 127)) | (1L << (Number - 127)))) != 0)) {
				{
				{
				setState(1752); vfrStatementExpression();
				setState(1753); match(Comma);
				setState(1754); vfrStatementExpression();
				setState(1755); match(Comma);
				}
				}
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1762); match(RParen);
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

	public static class GuidSubDefinitionContext extends ParserRuleContext {
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Hex2() { return getTokens(vfrParser.Hex2); }
		public TerminalNode Hex2(int i) {
			return getToken(vfrParser.Hex2, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public GuidSubDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guidSubDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterGuidSubDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitGuidSubDefinition(this);
		}
	}

	public final GuidSubDefinitionContext guidSubDefinition() throws RecognitionException {
		GuidSubDefinitionContext _localctx = new GuidSubDefinitionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_guidSubDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764); match(Hex2);
			setState(1765); match(Comma);
			setState(1766); match(Hex2);
			setState(1767); match(Comma);
			setState(1768); match(Hex2);
			setState(1769); match(Comma);
			setState(1770); match(Hex2);
			setState(1771); match(Comma);
			setState(1772); match(Hex2);
			setState(1773); match(Comma);
			setState(1774); match(Hex2);
			setState(1775); match(Comma);
			setState(1776); match(Hex2);
			setState(1777); match(Comma);
			setState(1778); match(Hex2);
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

	public static class GuidDefinitionContext extends ParserRuleContext {
		public TerminalNode Hex4(int i) {
			return getToken(vfrParser.Hex4, i);
		}
		public TerminalNode Hex8() { return getToken(vfrParser.Hex8, 0); }
		public TerminalNode RBrace(int i) {
			return getToken(vfrParser.RBrace, i);
		}
		public TerminalNode LBrace(int i) {
			return getToken(vfrParser.LBrace, i);
		}
		public List<TerminalNode> LBrace() { return getTokens(vfrParser.LBrace); }
		public List<TerminalNode> Hex4() { return getTokens(vfrParser.Hex4); }
		public GuidSubDefinitionContext guidSubDefinition() {
			return getRuleContext(GuidSubDefinitionContext.class,0);
		}
		public List<TerminalNode> RBrace() { return getTokens(vfrParser.RBrace); }
		public TerminalNode Comma(int i) {
			return getToken(vfrParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(vfrParser.Comma); }
		public GuidDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guidDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).enterGuidDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vfrListener ) ((vfrListener)listener).exitGuidDefinition(this);
		}
	}

	public final GuidDefinitionContext guidDefinition() throws RecognitionException {
		GuidDefinitionContext _localctx = new GuidDefinitionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_guidDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780); match(LBrace);
			setState(1781); match(Hex8);
			setState(1782); match(Comma);
			setState(1783); match(Hex4);
			setState(1784); match(Comma);
			setState(1785); match(Hex4);
			setState(1786); match(Comma);
			setState(1792);
			switch (_input.LA(1)) {
			case LBrace:
				{
				setState(1787); match(LBrace);
				setState(1788); guidSubDefinition();
				setState(1789); match(RBrace);
				}
				break;
			case Hex2:
				{
				setState(1791); guidSubDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1794); match(RBrace);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00cf\u0707\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\u0127\n\2\f\2\16\2\u012a\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\u0132\n\3\3\4\3\4\5\4\u0136\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0161\n"+
		"\5\3\5\3\5\5\5\u0165\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u016c\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0172\n\5\3\5\3\5\5\5\u0176\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u017d"+
		"\n\6\f\6\16\6\u0180\13\6\3\7\3\7\5\7\u0184\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0190\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0198\n\t\f"+
		"\t\16\t\u019b\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u01a9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01b1\n\n\f\n\16\n\u01b4\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u01bb\n\n\3\n\3\n\5\n\u01bf\n\n\3\n\3\n\3\13\3"+
		"\13\5\13\u01c5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01cf\n\f\3\f"+
		"\3\f\5\f\u01d3\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u01da\n\r\f\r\16\r\u01dd\13"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u020c\n\26\3\26\3\26\3\26\3\26\5\26\u0212\n\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0218\n\26\3\26\3\26\3\26\3\26\5\26\u021e\n\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0224\n\26\3\26\3\26\3\26\3\26\5\26\u022a\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0230\n\26\3\26\3\26\3\26\3\26\5\26\u0236"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u023c\n\26\3\26\3\26\3\26\3\26\5\26\u0242"+
		"\n\26\5\26\u0244\n\26\3\26\5\26\u0247\n\26\3\26\3\26\7\26\u024b\n\26\f"+
		"\26\16\26\u024e\13\26\3\26\5\26\u0251\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u025a\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0261\n\27\7\27"+
		"\u0263\n\27\f\27\16\27\u0266\13\27\3\27\3\27\7\27\u026a\n\27\f\27\16\27"+
		"\u026d\13\27\3\30\3\30\5\30\u0271\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0281\n\30\3\31\3\31\3\31"+
		"\5\31\u0286\n\31\3\32\3\32\3\32\3\32\7\32\u028c\n\32\f\32\16\32\u028f"+
		"\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0298\n\33\f\33\16\33\u029b"+
		"\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u02a4\n\34\f\34\16\34\u02a7"+
		"\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u02b1\n\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\5\37\u02b9\n\37\3 \3 \3 \3 \3 \3 \5 \u02c1\n "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02cb\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0300\n!\f!\16"+
		"!\u0303\13!\5!\u0305\n!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0316\n\"\3\"\3\"\3\"\3\"\5\"\u031c\n\"\3#\3#\3#\7#\u0321"+
		"\n#\f#\16#\u0324\13#\3$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u032f\n%\3%\3%\3%\5"+
		"%\u0334\n%\3%\3%\3%\3%\3&\3&\3&\7&\u033d\n&\f&\16&\u0340\13&\3\'\3\'\5"+
		"\'\u0344\n\'\3(\3(\5(\u0348\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0351\n)\3)\3)"+
		"\3)\3)\5)\u0357\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\7*\u0368"+
		"\n*\f*\16*\u036b\13*\3+\3+\5+\u036f\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0379"+
		"\n,\3,\3,\3,\3,\5,\u037f\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\7-\u0390\n-\f-\16-\u0393\13-\3.\3.\5.\u0397\n.\3/\3/\5/\u039b\n/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03a4\n\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\7\61\u03ae\n\61\f\61\16\61\u03b1\13\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u03ba\n\62\3\62\3\62\3\62\3\62\5\62\u03c0"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u03d3\n\63\3\64\3\64\3\64\7\64\u03d8\n\64\f"+
		"\64\16\64\u03db\13\64\3\65\3\65\5\65\u03df\n\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u03e8\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u041d\n\66\f\66\16\66\u0420\13\66\5\66\u0422\n\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\78\u0431\n8\f8\16"+
		"8\u0434\138\39\39\39\39\39\39\59\u043c\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\7;\u044e\n;\f;\16;\u0451\13;\3;\3;\3<\3<\3<\7<\u0458"+
		"\n<\f<\16<\u045b\13<\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0477\nA\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\7"+
		"G\u0499\nG\fG\16G\u049c\13G\3H\3H\3I\3I\3I\3I\5I\u04a4\nI\3I\3I\3I\3I"+
		"\3I\5I\u04ab\nI\3I\3I\3I\3I\5I\u04b1\nI\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u04ca\nK\3K\3K\3K\3K\5K\u04d0"+
		"\nK\3L\3L\5L\u04d4\nL\3M\3M\3M\3M\3M\3M\3M\5M\u04dd\nM\3M\3M\3M\3M\5M"+
		"\u04e3\nM\3M\3M\3M\3M\3N\3N\3N\7N\u04ec\nN\fN\16N\u04ef\13N\3O\3O\5O\u04f3"+
		"\nO\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04fd\nP\3P\3P\3P\3P\3P\3P\3P\3P\3Q\7Q"+
		"\u0508\nQ\fQ\16Q\u050b\13Q\3R\3R\3R\7R\u0510\nR\fR\16R\u0513\13R\3S\3"+
		"S\5S\u0517\nS\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0521\nT\3T\3T\3T\3T\5T\u0527"+
		"\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0538\nU\3V\3V\3V"+
		"\3V\3W\3W\3W\7W\u0541\nW\fW\16W\u0544\13W\3X\3X\3X\7X\u0549\nX\fX\16X"+
		"\u054c\13X\3Y\3Y\3Y\7Y\u0551\nY\fY\16Y\u0554\13Y\3Z\3Z\3Z\7Z\u0559\nZ"+
		"\fZ\16Z\u055c\13Z\3[\3[\3[\3[\3[\7[\u0563\n[\f[\16[\u0566\13[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0571\n\\\f\\\16\\\u0574\13\\\3]\3]\3"+
		"]\3]\3]\7]\u057b\n]\f]\16]\u057e\13]\3^\3^\3^\3^\3^\7^\u0585\n^\f^\16"+
		"^\u0588\13^\3_\3_\3_\3_\3_\3_\3_\7_\u0591\n_\f_\16_\u0594\13_\3`\3`\3"+
		"`\7`\u0599\n`\f`\16`\u059c\13`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a"+
		"\u05aa\na\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\5e\u05c8\ne\3f\3f\3g\3g\3h\3h\3h\3h\3h\3i\3i"+
		"\3i\3i\3i\3j\3j\3j\3j\6j\u05dc\nj\rj\16j\u05dd\3k\3k\3k\3k\3k\5k\u05e5"+
		"\nk\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\3n\3o\3o\3o\3o\3o\3p\3p\3p\3p\5p"+
		"\u05fc\np\3p\5p\u05ff\np\3p\5p\u0602\np\3p\5p\u0605\np\3p\3p\3q\3q\3r"+
		"\3r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0617\ns\3t\3t\3t\3t\3t\3u\3u\3u"+
		"\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u062f\nv\3v\3v\3v\3v\3v"+
		"\5v\u0636\nv\3v\3v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y\5y\u0647\ny"+
		"\3y\5y\u064a\ny\3y\5y\u064d\ny\3y\5y\u0650\ny\3y\3y\3y\3y\3z\3z\3z\3z"+
		"\3z\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3}\3}\3}\3}\5}\u0669\n}\3}\5}\u066c"+
		"\n}\3}\5}\u066f\n}\3}\5}\u0672\n}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\5~\u0682\n~\7~\u0684\n~\f~\16~\u0687\13~\5~\u0689\n~\3\177\3\177"+
		"\3\177\3\177\3\177\5\177\u0690\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u06a0\n\u0081\f\u0081\16\u0081\u06a3\13\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u06c8"+
		"\n\u0085\f\u0085\16\u0085\u06cb\13\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u06e0\n\u0087"+
		"\f\u0087\16\u0087\u06e3\13\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0703"+
		"\n\u0089\3\u0089\3\u0089\3\u0089\2\2\u008a\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\2\21\4\2TT\u00ab\u00ab\3\2uw\5\2\u00ab\u00ab\u00be\u00c0\u00c5"+
		"\u00c7\4\2no\u00ab\u00ab\4\2dd\u00ab\u00ab\4\2\u00ab\u00ab\u00b0\u00b6"+
		"\6\2\61\61\u00ab\u00ab\u00b8\u00b9\u00c1\u00c2\4\2\u00ab\u00ab\u00bb\u00c0"+
		"\4\2\u00ab\u00ab\u00c3\u00c4\4\2\u00a4\u00a8\u00ab\u00ab\3\2\u009f\u00a3"+
		"\3\2\u00b7\u00ba\3\2\u00a4\u00ab\3\2\"#\4\2()\u00ab\u00ab\u0754\2\u0112"+
		"\3\2\2\2\4\u0131\3\2\2\2\6\u0135\3\2\2\2\b\u0137\3\2\2\2\n\u0179\3\2\2"+
		"\2\f\u0183\3\2\2\2\16\u0185\3\2\2\2\20\u0194\3\2\2\2\22\u019c\3\2\2\2"+
		"\24\u01c4\3\2\2\2\26\u01c6\3\2\2\2\30\u01d6\3\2\2\2\32\u01e0\3\2\2\2\34"+
		"\u01e2\3\2\2\2\36\u01e7\3\2\2\2 \u01ea\3\2\2\2\"\u01f1\3\2\2\2$\u01f4"+
		"\3\2\2\2&\u01f6\3\2\2\2(\u01fd\3\2\2\2*\u0200\3\2\2\2,\u026b\3\2\2\2."+
		"\u026e\3\2\2\2\60\u0285\3\2\2\2\62\u0287\3\2\2\2\64\u0293\3\2\2\2\66\u029f"+
		"\3\2\2\28\u02b0\3\2\2\2:\u02b2\3\2\2\2<\u02b8\3\2\2\2>\u02c0\3\2\2\2@"+
		"\u02c2\3\2\2\2B\u0309\3\2\2\2D\u031d\3\2\2\2F\u0325\3\2\2\2H\u0327\3\2"+
		"\2\2J\u0339\3\2\2\2L\u0343\3\2\2\2N\u0347\3\2\2\2P\u0349\3\2\2\2R\u0364"+
		"\3\2\2\2T\u036e\3\2\2\2V\u0370\3\2\2\2X\u038c\3\2\2\2Z\u0396\3\2\2\2\\"+
		"\u039a\3\2\2\2^\u039c\3\2\2\2`\u03aa\3\2\2\2b\u03b2\3\2\2\2d\u03c6\3\2"+
		"\2\2f\u03d4\3\2\2\2h\u03de\3\2\2\2j\u03e0\3\2\2\2l\u0426\3\2\2\2n\u0432"+
		"\3\2\2\2p\u043b\3\2\2\2r\u043d\3\2\2\2t\u043f\3\2\2\2v\u0454\3\2\2\2x"+
		"\u045c\3\2\2\2z\u045e\3\2\2\2|\u0462\3\2\2\2~\u0466\3\2\2\2\u0080\u0476"+
		"\3\2\2\2\u0082\u0478\3\2\2\2\u0084\u047d\3\2\2\2\u0086\u0482\3\2\2\2\u0088"+
		"\u0487\3\2\2\2\u008a\u048d\3\2\2\2\u008c\u0495\3\2\2\2\u008e\u049d\3\2"+
		"\2\2\u0090\u04a3\3\2\2\2\u0092\u04b4\3\2\2\2\u0094\u04bd\3\2\2\2\u0096"+
		"\u04d3\3\2\2\2\u0098\u04d5\3\2\2\2\u009a\u04e8\3\2\2\2\u009c\u04f2\3\2"+
		"\2\2\u009e\u04f4\3\2\2\2\u00a0\u0509\3\2\2\2\u00a2\u050c\3\2\2\2\u00a4"+
		"\u0516\3\2\2\2\u00a6\u0518\3\2\2\2\u00a8\u0537\3\2\2\2\u00aa\u0539\3\2"+
		"\2\2\u00ac\u053d\3\2\2\2\u00ae\u0545\3\2\2\2\u00b0\u054d\3\2\2\2\u00b2"+
		"\u0555\3\2\2\2\u00b4\u055d\3\2\2\2\u00b6\u0567\3\2\2\2\u00b8\u0575\3\2"+
		"\2\2\u00ba\u057f\3\2\2\2\u00bc\u0589\3\2\2\2\u00be\u059a\3\2\2\2\u00c0"+
		"\u05a9\3\2\2\2\u00c2\u05ab\3\2\2\2\u00c4\u05b2\3\2\2\2\u00c6\u05b9\3\2"+
		"\2\2\u00c8\u05c7\3\2\2\2\u00ca\u05c9\3\2\2\2\u00cc\u05cb\3\2\2\2\u00ce"+
		"\u05cd\3\2\2\2\u00d0\u05d2\3\2\2\2\u00d2\u05d7\3\2\2\2\u00d4\u05e4\3\2"+
		"\2\2\u00d6\u05e6\3\2\2\2\u00d8\u05eb\3\2\2\2\u00da\u05f0\3\2\2\2\u00dc"+
		"\u05f2\3\2\2\2\u00de\u05f7\3\2\2\2\u00e0\u0608\3\2\2\2\u00e2\u060a\3\2"+
		"\2\2\u00e4\u0616\3\2\2\2\u00e6\u0618\3\2\2\2\u00e8\u061d\3\2\2\2\u00ea"+
		"\u0622\3\2\2\2\u00ec\u063a\3\2\2\2\u00ee\u063f\3\2\2\2\u00f0\u0644\3\2"+
		"\2\2\u00f2\u0655\3\2\2\2\u00f4\u065a\3\2\2\2\u00f6\u065f\3\2\2\2\u00f8"+
		"\u0664\3\2\2\2\u00fa\u0688\3\2\2\2\u00fc\u068f\3\2\2\2\u00fe\u0691\3\2"+
		"\2\2\u0100\u069a\3\2\2\2\u0102\u06ac\3\2\2\2\u0104\u06ae\3\2\2\2\u0106"+
		"\u06b7\3\2\2\2\u0108\u06c0\3\2\2\2\u010a\u06d4\3\2\2\2\u010c\u06d6\3\2"+
		"\2\2\u010e\u06e6\3\2\2\2\u0110\u06f6\3\2\2\2\u0112\u0113\7\3\2\2\u0113"+
		"\u0114\7\5\2\2\u0114\u0115\7\u0082\2\2\u0115\u0116\7\u00ab\2\2\u0116\u0117"+
		"\7\u0085\2\2\u0117\u0118\7\6\2\2\u0118\u0119\7\u0082\2\2\u0119\u011a\5"+
		"\34\17\2\u011a\u0128\7\u0086\2\2\u011b\u0127\5\36\20\2\u011c\u0127\5\""+
		"\22\2\u011d\u0127\5&\24\2\u011e\u0127\5\u00a6T\2\u011f\u0127\5\4\3\2\u0120"+
		"\u0127\5> \2\u0121\u0127\5\60\31\2\u0122\u0127\5:\36\2\u0123\u0127\5."+
		"\30\2\u0124\u0127\5*\26\2\u0125\u0127\5(\25\2\u0126\u011b\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2"+
		"\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7\4\2\2\u012c\u012d\7\u0086\2\2\u012d\3\3\2"+
		"\2\2\u012e\u0132\5\26\f\2\u012f\u0132\5\22\n\2\u0130\u0132\5\6\4\2\u0131"+
		"\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\5\3\2\2\2"+
		"\u0133\u0136\5\b\5\2\u0134\u0136\5\16\b\2\u0135\u0133\3\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\7\3\2\2\2\u0137\u0164\7W\2\2\u0138\u0139\7/\2\2\u0139\u013a"+
		"\7\u0082\2\2\u013a\u013b\5\34\17\2\u013b\u013c\7\u0085\2\2\u013c\u013d"+
		"\7X\2\2\u013d\u013e\7\u0082\2\2\u013e\u013f\5\u0110\u0089\2\u013f\u0140"+
		"\7\u0085\2\2\u0140\u0141\7\5\2\2\u0141\u0142\7\u0082\2\2\u0142\u0143\7"+
		"\u00ab\2\2\u0143\u0144\7\u0085\2\2\u0144\u0145\7Y\2\2\u0145\u0146\7\u0082"+
		"\2\2\u0146\u0147\7\u00ab\2\2\u0147\u0148\7\u0085\2\2\u0148\u0165\3\2\2"+
		"\2\u0149\u014a\7X\2\2\u014a\u014b\7\u0082\2\2\u014b\u014c\5\u0110\u0089"+
		"\2\u014c\u014d\7\u0085\2\2\u014d\u014e\7\5\2\2\u014e\u014f\7\u0082\2\2"+
		"\u014f\u0150\7\u00ab\2\2\u0150\u0151\7\u0085\2\2\u0151\u0152\7Y\2\2\u0152"+
		"\u0153\7\u0082\2\2\u0153\u0154\7\u00ab\2\2\u0154\u0155\7\u0085\2\2\u0155"+
		"\u0165\3\2\2\2\u0156\u0157\7\5\2\2\u0157\u0158\7\u0082\2\2\u0158\u0159"+
		"\7\u00ab\2\2\u0159\u015a\7\u0085\2\2\u015a\u015b\7Y\2\2\u015b\u0160\7"+
		"\u0082\2\2\u015c\u015d\7\u00ac\2\2\u015d\u0161\7\u0085\2\2\u015e\u015f"+
		"\7\u00ab\2\2\u015f\u0161\7\u0085\2\2\u0160\u015c\3\2\2\2\u0160\u015e\3"+
		"\2\2\2\u0161\u0165\3\2\2\2\u0162\u0163\7\u00ab\2\2\u0163\u0165\7\u0085"+
		"\2\2\u0164\u0138\3\2\2\2\u0164\u0149\3\2\2\2\u0164\u0156\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016b\5\u0090"+
		"I\2\u0167\u0168\7\u0085\2\2\u0168\u0169\7\25\2\2\u0169\u016a\7\u0082\2"+
		"\2\u016a\u016c\5\n\6\2\u016b\u0167\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0171"+
		"\3\2\2\2\u016d\u016e\7\u0085\2\2\u016e\u016f\7O\2\2\u016f\u0170\7\u0082"+
		"\2\2\u0170\u0172\7\u00ab\2\2\u0171\u016d\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0174\7\u0085\2\2\u0174\u0176\5n8\2\u0175\u0173\3"+
		"\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\u0086\2\2"+
		"\u0178\t\3\2\2\2\u0179\u017e\5\f\7\2\u017a\u017b\7\u0087\2\2\u017b\u017d"+
		"\5\f\7\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\13\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0184\7\u00ab"+
		"\2\2\u0182\u0184\5\u00e0q\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\r\3\2\2\2\u0185\u0186\7U\2\2\u0186\u0187\7\62\2\2\u0187\u0188\7\u0082"+
		"\2\2\u0188\u0189\7\u00ac\2\2\u0189\u018a\7\u0085\2\2\u018a\u018b\5\u0092"+
		"J\2\u018b\u018f\7\u0085\2\2\u018c\u018d\5\20\t\2\u018d\u018e\7\u0085\2"+
		"\2\u018e\u0190\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\7V\2\2\u0192\u0193\7\u0086\2\2\u0193\17\3\2\2\2\u0194"+
		"\u0199\5<\37\2\u0195\u0196\7\u0085\2\2\u0196\u0198\5<\37\2\u0197\u0195"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\21\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7F\2\2\u019d\u019e\7\65\2"+
		"\2\u019e\u019f\7\u0082\2\2\u019f\u01a0\5\34\17\2\u01a0\u01a1\7\u0085\2"+
		"\2\u01a1\u01a2\7F\2\2\u01a2\u01a3\7\u0082\2\2\u01a3\u01a8\5\34\17\2\u01a4"+
		"\u01a5\7\u0085\2\2\u01a5\u01a6\7F\2\2\u01a6\u01a7\7\u0082\2\2\u01a7\u01a9"+
		"\5\34\17\2\u01a8\u01a4\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ba\3\2\2\2"+
		"\u01aa\u01ab\7\u0085\2\2\u01ab\u01ac\7\25\2\2\u01ac\u01ad\7\u0082\2\2"+
		"\u01ad\u01b2\5\24\13\2\u01ae\u01af\7\u0087\2\2\u01af\u01b1\5\24\13\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\u0085\2\2\u01b6"+
		"\u01b7\7O\2\2\u01b7\u01b8\7\u0082\2\2\u01b8\u01b9\7\u00ab\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01aa\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01bd\7\u0085\2\2\u01bd\u01bf\5\20\t\2\u01be\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\u0086\2\2\u01c1\23\3\2\2\2"+
		"\u01c2\u01c5\7\u00ab\2\2\u01c3\u01c5\5\u00e0q\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\25\3\2\2\2\u01c6\u01c7\7S\2\2\u01c7\u01c8\7F\2\2"+
		"\u01c8\u01c9\7\u0082\2\2\u01c9\u01ce\5\34\17\2\u01ca\u01cb\7\u0085\2\2"+
		"\u01cb\u01cc\7\25\2\2\u01cc\u01cd\7\u0082\2\2\u01cd\u01cf\5\30\r\2\u01ce"+
		"\u01ca\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7\u0085"+
		"\2\2\u01d1\u01d3\5\20\t\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\7\u0086\2\2\u01d5\27\3\2\2\2\u01d6\u01db\5"+
		"\32\16\2\u01d7\u01d8\7\u0087\2\2\u01d8\u01da\5\32\16\2\u01d9\u01d7\3\2"+
		"\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\u0086\2\2\u01df\31\3"+
		"\2\2\2\u01e0\u01e1\t\2\2\2\u01e1\33\3\2\2\2\u01e2\u01e3\7\30\2\2\u01e3"+
		"\u01e4\7\u0095\2\2\u01e4\u01e5\7\u00ab\2\2\u01e5\u01e6\7\u0096\2\2\u01e6"+
		"\35\3\2\2\2\u01e7\u01e8\5 \21\2\u01e8\u01e9\7\u0086\2\2\u01e9\37\3\2\2"+
		"\2\u01ea\u01eb\7*\2\2\u01eb\u01ec\7\u0082\2\2\u01ec\u01ed\7+\2\2\u01ed"+
		"\u01ee\7\u0095\2\2\u01ee\u01ef\7\u00ab\2\2\u01ef\u01f0\7\u0096\2\2\u01f0"+
		"!\3\2\2\2\u01f1\u01f2\5$\23\2\u01f2\u01f3\7\u0086\2\2\u01f3#\3\2\2\2\u01f4"+
		"\u01f5\7,\2\2\u01f5%\3\2\2\2\u01f6\u01f7\7\7\2\2\u01f7\u01f8\7\u00ac\2"+
		"\2\u01f8\u01f9\7\u0085\2\2\u01f9\u01fa\5\u00acW\2\u01fa\u01fb\7\b\2\2"+
		"\u01fb\u01fc\7\u0086\2\2\u01fc\'\3\2\2\2\u01fd\u01fe\7~\2\2\u01fe\u01ff"+
		"\7\u0086\2\2\u01ff)\3\2\2\2\u0200\u0201\7y\2\2\u0201\u0202\7{\2\2\u0202"+
		"\u0203\7\u0082\2\2\u0203\u0246\5\u0110\u0089\2\u0204\u0205\7\u0085\2\2"+
		"\u0205\u0206\7}\2\2\u0206\u0243\7\u0082\2\2\u0207\u020b\7\u00a0\2\2\u0208"+
		"\u0209\7\u009c\2\2\u0209\u020a\7\u00ab\2\2\u020a\u020c\7\u009d\2\2\u020b"+
		"\u0208\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0244\3\2\2\2\u020d\u0211\7\u00a1"+
		"\2\2\u020e\u020f\7\u009c\2\2\u020f\u0210\7\u00ab\2\2\u0210\u0212\7\u009d"+
		"\2\2\u0211\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0244\3\2\2\2\u0213"+
		"\u0217\7\u00a2\2\2\u0214\u0215\7\u009c\2\2\u0215\u0216\7\u00ab\2\2\u0216"+
		"\u0218\7\u009d\2\2\u0217\u0214\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0244"+
		"\3\2\2\2\u0219\u021d\7\u00a3\2\2\u021a\u021b\7\u009c\2\2\u021b\u021c\7"+
		"\u00ab\2\2\u021c\u021e\7\u009d\2\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u0244\3\2\2\2\u021f\u0223\7\u009f\2\2\u0220\u0221\7\u009c\2"+
		"\2\u0221\u0222\7\u00ab\2\2\u0222\u0224\7\u009d\2\2\u0223\u0220\3\2\2\2"+
		"\u0223\u0224\3\2\2\2\u0224\u0244\3\2\2\2\u0225\u0229\7\u00c8\2\2\u0226"+
		"\u0227\7\u009c\2\2\u0227\u0228\7\u00ab\2\2\u0228\u022a\7\u009d\2\2\u0229"+
		"\u0226\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0244\3\2\2\2\u022b\u022f\7\u00c9"+
		"\2\2\u022c\u022d\7\u009c\2\2\u022d\u022e\7\u00ab\2\2\u022e\u0230\7\u009d"+
		"\2\2\u022f\u022c\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0244\3\2\2\2\u0231"+
		"\u0235\7\u00ca\2\2\u0232\u0233\7\u009c\2\2\u0233\u0234\7\u00ab\2\2\u0234"+
		"\u0236\7\u009d\2\2\u0235\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0244"+
		"\3\2\2\2\u0237\u023b\7\u00cb\2\2\u0238\u0239\7\u009c\2\2\u0239\u023a\7"+
		"\u00ab\2\2\u023a\u023c\7\u009d\2\2\u023b\u0238\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u0244\3\2\2\2\u023d\u0241\7\u00ac\2\2\u023e\u023f\7\u009c\2"+
		"\2\u023f\u0240\7\u00ab\2\2\u0240\u0242\7\u009d\2\2\u0241\u023e\3\2\2\2"+
		"\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0207\3\2\2\2\u0243\u020d"+
		"\3\2\2\2\u0243\u0213\3\2\2\2\u0243\u0219\3\2\2\2\u0243\u021f\3\2\2\2\u0243"+
		"\u0225\3\2\2\2\u0243\u022b\3\2\2\2\u0243\u0231\3\2\2\2\u0243\u0237\3\2"+
		"\2\2\u0243\u023d\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\5,\27\2\u0246"+
		"\u0204\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0250\3\2\2\2\u0248\u024c\7\u0085"+
		"\2\2\u0249\u024b\5*\26\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024f\u0251\7z\2\2\u0250\u0248\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\7\u0086\2\2\u0253+\3\2\2\2\u0254\u0255\7\u0085"+
		"\2\2\u0255\u0259\7|\2\2\u0256\u0257\7\u009c\2\2\u0257\u0258\7\u00ab\2"+
		"\2\u0258\u025a\7\u009d\2\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u0264\3\2\2\2\u025b\u025c\7\u009b\2\2\u025c\u0260\7\u00ac\2\2\u025d\u025e"+
		"\7\u009c\2\2\u025e\u025f\7\u00ab\2\2\u025f\u0261\7\u009d\2\2\u0260\u025d"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u025b\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0268\7\u0082\2\2\u0268\u026a\7\u00ab\2"+
		"\2\u0269\u0254\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c-\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0270\7r\2\2\u026f\u0271"+
		"\7\u0085\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2"+
		"\2\u0272\u0273\7\6\2\2\u0273\u0274\7\u0082\2\2\u0274\u0275\5\34\17\2\u0275"+
		"\u0280\7\u0085\2\2\u0276\u0277\7s\2\2\u0277\u0278\7\u00ab\2\2\u0278\u0279"+
		"\7\u0085\2\2\u0279\u027a\7t\2\2\u027a\u027b\t\3\2\2\u027b\u0281\7\u0086"+
		"\2\2\u027c\u027d\7x\2\2\u027d\u027e\7\u0082\2\2\u027e\u027f\7\u00ab\2"+
		"\2\u027f\u0281\7\u0086\2\2\u0280\u0276\3\2\2\2\u0280\u027c\3\2\2\2\u0281"+
		"/\3\2\2\2\u0282\u0286\5\62\32\2\u0283\u0286\5\64\33\2\u0284\u0286\5\66"+
		"\34\2\u0285\u0282\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\61\3\2\2\2\u0287\u0288\7H\2\2\u0288\u0289\5\u00acW\2\u0289\u028d\7\u0085"+
		"\2\2\u028a\u028c\58\35\2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u0290\u0291\7@\2\2\u0291\u0292\7\u0086\2\2\u0292\63\3\2\2\2\u0293"+
		"\u0294\7B\2\2\u0294\u0295\5\u00acW\2\u0295\u0299\7\u0085\2\2\u0296\u0298"+
		"\58\35\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7@"+
		"\2\2\u029d\u029e\7\u0086\2\2\u029e\65\3\2\2\2\u029f\u02a0\7p\2\2\u02a0"+
		"\u02a1\5\u00acW\2\u02a1\u02a5\7\u0085\2\2\u02a2\u02a4\58\35\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7@\2\2\u02a9\u02aa\7\u0086"+
		"\2\2\u02aa\67\3\2\2\2\u02ab\u02b1\5\4\3\2\u02ac\u02b1\5> \2\u02ad\u02b1"+
		"\5\60\31\2\u02ae\u02b1\5:\36\2\u02af\u02b1\5*\26\2\u02b0\u02ab\3\2\2\2"+
		"\u02b0\u02ac\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02af"+
		"\3\2\2\2\u02b19\3\2\2\2\u02b2\u02b3\7q\2\2\u02b3\u02b4\7\u00ab\2\2\u02b4"+
		"\u02b5\7\u0086\2\2\u02b5;\3\2\2\2\u02b6\u02b9\5 \21\2\u02b7\u02b9\5$\23"+
		"\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9=\3\2\2\2\u02ba\u02c1"+
		"\5\u0096L\2\u02bb\u02c1\5j\66\2\u02bc\u02c1\5\\/\2\u02bd\u02c1\5N(\2\u02be"+
		"\u02c1\5H%\2\u02bf\u02c1\5@!\2\u02c0\u02ba\3\2\2\2\u02c0\u02bb\3\2\2\2"+
		"\u02c0\u02bc\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02bf"+
		"\3\2\2\2\u02c1?\3\2\2\2\u02c2\u0304\7b\2\2\u02c3\u02c4\5\u0090I\2\u02c4"+
		"\u02ca\7\u0085\2\2\u02c5\u02c6\7\25\2\2\u02c6\u02c7\7\u0082\2\2\u02c7"+
		"\u02c8\5D#\2\u02c8\u02c9\7\u0085\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c5\3"+
		"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\5n8\2\u02cd"+
		"\u0305\3\2\2\2\u02ce\u02cf\7_\2\2\u02cf\u02d0\78\2\2\u02d0\u02d1\7\u0082"+
		"\2\2\u02d1\u02d2\7\u00ac\2\2\u02d2\u02d3\7\u009b\2\2\u02d3\u02d4\7\u00ac"+
		"\2\2\u02d4\u02d5\7\u0085\2\2\u02d5\u02d6\7\67\2\2\u02d6\u02d7\7\u0082"+
		"\2\2\u02d7\u02d8\5\34\17\2\u02d8\u02d9\7\u0085\2\2\u02d9\u02da\7\65\2"+
		"\2\u02da\u02db\7\u0082\2\2\u02db\u02dc\5\34\17\2\u02dc\u02dd\7\u0085\2"+
		"\2\u02dd\u02de\5B\"\2\u02de\u02df\7`\2\2\u02df\u02e0\78\2\2\u02e0\u02e1"+
		"\7\u0082\2\2\u02e1\u02e2\7\u00ac\2\2\u02e2\u02e3\7\u009b\2\2\u02e3\u02e4"+
		"\7\u00ac\2\2\u02e4\u02e5\7\u0085\2\2\u02e5\u02e6\7\67\2\2\u02e6\u02e7"+
		"\7\u0082\2\2\u02e7\u02e8\5\34\17\2\u02e8\u02e9\7\u0085\2\2\u02e9\u02ea"+
		"\7\65\2\2\u02ea\u02eb\7\u0082\2\2\u02eb\u02ec\5\34\17\2\u02ec\u02ed\7"+
		"\u0085\2\2\u02ed\u02ee\5B\"\2\u02ee\u02ef\7a\2\2\u02ef\u02f0\78\2\2\u02f0"+
		"\u02f1\7\u0082\2\2\u02f1\u02f2\7\u00ac\2\2\u02f2\u02f3\7\u009b\2\2\u02f3"+
		"\u02f4\7\u00ac\2\2\u02f4\u02f5\7\u0085\2\2\u02f5\u02f6\7\67\2\2\u02f6"+
		"\u02f7\7\u0082\2\2\u02f7\u02f8\5\34\17\2\u02f8\u02f9\7\u0085\2\2\u02f9"+
		"\u02fa\7\65\2\2\u02fa\u02fb\7\u0082\2\2\u02fb\u02fc\5\34\17\2\u02fc\u02fd"+
		"\7\u0085\2\2\u02fd\u0301\5B\"\2\u02fe\u0300\5l\67\2\u02ff\u02fe\3\2\2"+
		"\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305"+
		"\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u02c3\3\2\2\2\u0304\u02ce\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0307\7c\2\2\u0307\u0308\7\u0086\2\2\u0308A\3\2\2"+
		"\2\u0309\u030a\7:\2\2\u030a\u030b\7\u0082\2\2\u030b\u030c\7\u00ab\2\2"+
		"\u030c\u030d\7\u0085\2\2\u030d\u030e\7;\2\2\u030e\u030f\7\u0082\2\2\u030f"+
		"\u0310\7\u00ab\2\2\u0310\u0315\7\u0085\2\2\u0311\u0312\7<\2\2\u0312\u0313"+
		"\7\u0082\2\2\u0313\u0314\7\u00ab\2\2\u0314\u0316\7\u0085\2\2\u0315\u0311"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u031b\3\2\2\2\u0317\u0318\7\61\2\2"+
		"\u0318\u0319\7\u0082\2\2\u0319\u031a\7\u00ab\2\2\u031a\u031c\7\u0085\2"+
		"\2\u031b\u0317\3\2\2\2\u031b\u031c\3\2\2\2\u031cC\3\2\2\2\u031d\u0322"+
		"\5F$\2\u031e\u031f\7\u0087\2\2\u031f\u0321\5F$\2\u0320\u031e\3\2\2\2\u0321"+
		"\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323E\3\2\2\2"+
		"\u0324\u0322\3\2\2\2\u0325\u0326\t\4\2\2\u0326G\3\2\2\2\u0327\u0328\7"+
		"k\2\2\u0328\u0329\5\u0090I\2\u0329\u032e\7\u0085\2\2\u032a\u032b\7m\2"+
		"\2\u032b\u032c\7\u0082\2\2\u032c\u032d\7\u00ab\2\2\u032d\u032f\7\u0085"+
		"\2\2\u032e\u032a\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0333\3\2\2\2\u0330"+
		"\u0331\7\25\2\2\u0331\u0332\7\u0082\2\2\u0332\u0334\5J&\2\u0333\u0330"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\5n8\2\u0336"+
		"\u0337\7l\2\2\u0337\u0338\7\u0086\2\2\u0338I\3\2\2\2\u0339\u033e\5L\'"+
		"\2\u033a\u033b\7\u0087\2\2\u033b\u033d\5L\'\2\u033c\u033a\3\2\2\2\u033d"+
		"\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033fK\3\2\2\2"+
		"\u0340\u033e\3\2\2\2\u0341\u0344\t\5\2\2\u0342\u0344\5\u00e0q\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344M\3\2\2\2\u0345\u0348\5V,\2\u0346"+
		"\u0348\5P)\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348O\3\2\2\2\u0349"+
		"\u034a\7i\2\2\u034a\u0350\5\u0090I\2\u034b\u034c\7\25\2\2\u034c\u034d"+
		"\7\u0082\2\2\u034d\u034e\5R*\2\u034e\u034f\7\u0085\2\2\u034f\u0351\3\2"+
		"\2\2\u0350\u034b\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0356\3\2\2\2\u0352"+
		"\u0353\7O\2\2\u0353\u0354\7\u0082\2\2\u0354\u0355\7\u00ab\2\2\u0355\u0357"+
		"\7\u0085\2\2\u0356\u0352\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2"+
		"\2\u0358\u0359\7g\2\2\u0359\u035a\7\u0082\2\2\u035a\u035b\7\u00ab\2\2"+
		"\u035b\u035c\7\u0085\2\2\u035c\u035d\7h\2\2\u035d\u035e\7\u0082\2\2\u035e"+
		"\u035f\7\u00ab\2\2\u035f\u0360\7\u0085\2\2\u0360\u0361\5n8\2\u0361\u0362"+
		"\7j\2\2\u0362\u0363\7\u0086\2\2\u0363Q\3\2\2\2\u0364\u0369\5T+\2\u0365"+
		"\u0366\7\u0087\2\2\u0366\u0368\5T+\2\u0367\u0365\3\2\2\2\u0368\u036b\3"+
		"\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036aS\3\2\2\2\u036b\u0369"+
		"\3\2\2\2\u036c\u036f\7\u00ab\2\2\u036d\u036f\5\u00e0q\2\u036e\u036c\3"+
		"\2\2\2\u036e\u036d\3\2\2\2\u036fU\3\2\2\2\u0370\u0371\7e\2\2\u0371\u0372"+
		"\5\u0090I\2\u0372\u0378\7\u0085\2\2\u0373\u0374\7\25\2\2\u0374\u0375\7"+
		"\u0082\2\2\u0375\u0376\5X-\2\u0376\u0377\7\u0085\2\2\u0377\u0379\3\2\2"+
		"\2\u0378\u0373\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037e\3\2\2\2\u037a\u037b"+
		"\7O\2\2\u037b\u037c\7\u0082\2\2\u037c\u037d\7\u00ab\2\2\u037d\u037f\7"+
		"\u0085\2\2\u037e\u037a\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2"+
		"\u0380\u0381\7g\2\2\u0381\u0382\7\u0082\2\2\u0382\u0383\7\u00ab\2\2\u0383"+
		"\u0384\7\u0085\2\2\u0384\u0385\7h\2\2\u0385\u0386\7\u0082\2\2\u0386\u0387"+
		"\7\u00ab\2\2\u0387\u0388\7\u0085\2\2\u0388\u0389\5n8\2\u0389\u038a\7f"+
		"\2\2\u038a\u038b\7\u0086\2\2\u038bW\3\2\2\2\u038c\u0391\5Z.\2\u038d\u038e"+
		"\7\u0087\2\2\u038e\u0390\5Z.\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2"+
		"\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392Y\3\2\2\2\u0393\u0391\3"+
		"\2\2\2\u0394\u0397\t\6\2\2\u0395\u0397\5\u00e0q\2\u0396\u0394\3\2\2\2"+
		"\u0396\u0395\3\2\2\2\u0397[\3\2\2\2\u0398\u039b\5b\62\2\u0399\u039b\5"+
		"^\60\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b]\3\2\2\2\u039c\u039d"+
		"\7\\\2\2\u039d\u03a3\5\u0090I\2\u039e\u039f\7\25\2\2\u039f\u03a0\7\u0082"+
		"\2\2\u03a0\u03a1\5`\61\2\u03a1\u03a2\7\u0085\2\2\u03a2\u03a4\3\2\2\2\u03a3"+
		"\u039e\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5d"+
		"\63\2\u03a6\u03a7\5n8\2\u03a7\u03a8\7]\2\2\u03a8\u03a9\7\u0086\2\2\u03a9"+
		"_\3\2\2\2\u03aa\u03af\5h\65\2\u03ab\u03ac\7\u0087\2\2\u03ac\u03ae\5h\65"+
		"\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0a\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3\7Z\2\2\u03b3\u03b9"+
		"\5\u0090I\2\u03b4\u03b5\7\25\2\2\u03b5\u03b6\7\u0082\2\2\u03b6\u03b7\5"+
		"f\64\2\u03b7\u03b8\7\u0085\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b4\3\2\2\2"+
		"\u03b9\u03ba\3\2\2\2\u03ba\u03bf\3\2\2\2\u03bb\u03bc\7O\2\2\u03bc\u03bd"+
		"\7\u0082\2\2\u03bd\u03be\7\u00ab\2\2\u03be\u03c0\7\u0085\2\2\u03bf\u03bb"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\5d\63\2\u03c2"+
		"\u03c3\5n8\2\u03c3\u03c4\7[\2\2\u03c4\u03c5\7\u0086\2\2\u03c5c\3\2\2\2"+
		"\u03c6\u03c7\7:\2\2\u03c7\u03c8\7\u0082\2\2\u03c8\u03c9\7\u00ab\2\2\u03c9"+
		"\u03ca\7\u0085\2\2\u03ca\u03cb\7;\2\2\u03cb\u03cc\7\u0082\2\2\u03cc\u03cd"+
		"\7\u00ab\2\2\u03cd\u03d2\7\u0085\2\2\u03ce\u03cf\7<\2\2\u03cf\u03d0\7"+
		"\u0082\2\2\u03d0\u03d1\7\u00ab\2\2\u03d1\u03d3\7\u0085\2\2\u03d2\u03ce"+
		"\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3e\3\2\2\2\u03d4\u03d9\5h\65\2\u03d5"+
		"\u03d6\7\u0087\2\2\u03d6\u03d8\5h\65\2\u03d7\u03d5\3\2\2\2\u03d8\u03db"+
		"\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03dag\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03dc\u03df\t\7\2\2\u03dd\u03df\5\u00e0q\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03dd\3\2\2\2\u03dfi\3\2\2\2\u03e0\u0421\7=\2\2\u03e1\u03e7"+
		"\5\u0090I\2\u03e2\u03e3\7\25\2\2\u03e3\u03e4\7\u0082\2\2\u03e4\u03e5\5"+
		"\u008cG\2\u03e5\u03e6\7\u0085\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e2\3\2"+
		"\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\5n8\2\u03ea\u0422"+
		"\3\2\2\2\u03eb\u03ec\7\64\2\2\u03ec\u03ed\78\2\2\u03ed\u03ee\7\u0082\2"+
		"\2\u03ee\u03ef\7\u00ac\2\2\u03ef\u03f0\7\u009b\2\2\u03f0\u03f1\7\u00ac"+
		"\2\2\u03f1\u03f2\7\u0085\2\2\u03f2\u03f3\7\67\2\2\u03f3\u03f4\7\u0082"+
		"\2\2\u03f4\u03f5\5\34\17\2\u03f5\u03f6\7\u0085\2\2\u03f6\u03f7\7\65\2"+
		"\2\u03f7\u03f8\7\u0082\2\2\u03f8\u03f9\5\34\17\2\u03f9\u03fa\7\u0085\2"+
		"\2\u03fa\u03fb\5\u0094K\2\u03fb\u03fc\7\66\2\2\u03fc\u03fd\78\2\2\u03fd"+
		"\u03fe\7\u0082\2\2\u03fe\u03ff\7\u00ac\2\2\u03ff\u0400\7\u009b\2\2\u0400"+
		"\u0401\7\u00ac\2\2\u0401\u0402\7\u0085\2\2\u0402\u0403\7\67\2\2\u0403"+
		"\u0404\7\u0082\2\2\u0404\u0405\5\34\17\2\u0405\u0406\7\u0085\2\2\u0406"+
		"\u0407\7\65\2\2\u0407\u0408\7\u0082\2\2\u0408\u0409\5\34\17\2\u0409\u040a"+
		"\7\u0085\2\2\u040a\u040b\5\u0094K\2\u040b\u040c\7^\2\2\u040c\u040d\78"+
		"\2\2\u040d\u040e\5\u00b4[\2\u040e\u040f\7\u00ac\2\2\u040f\u0410\7\u009b"+
		"\2\2\u0410\u0411\7\u00ac\2\2\u0411\u0412\7\u0085\2\2\u0412\u0413\7\67"+
		"\2\2\u0413\u0414\7\u0082\2\2\u0414\u0415\5\34\17\2\u0415\u0416\7\u0085"+
		"\2\2\u0416\u0417\7\65\2\2\u0417\u0418\7\u0082\2\2\u0418\u0419\5\34\17"+
		"\2\u0419\u041a\7\u0085\2\2\u041a\u041e\5\u0094K\2\u041b\u041d\5l\67\2"+
		"\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u03e1\3\2\2\2\u0421"+
		"\u03eb\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\79\2\2\u0424\u0425\7\u0086"+
		"\2\2\u0425k\3\2\2\2\u0426\u0427\7A\2\2\u0427\u0428\7\67\2\2\u0428\u0429"+
		"\7\u0082\2\2\u0429\u042a\5\34\17\2\u042a\u042b\7\u0085\2\2\u042b\u042c"+
		"\5\u00acW\2\u042c\u042d\7@\2\2\u042dm\3\2\2\2\u042e\u0431\5\u0080A\2\u042f"+
		"\u0431\5p9\2\u0430\u042e\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u0434\3\2\2"+
		"\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433o\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0435\u043c\5~@\2\u0436\u043c\5\u00aaV\2\u0437\u043c\5\u00a6"+
		"T\2\u0438\u043c\5r:\2\u0439\u043c\5z>\2\u043a\u043c\5|?\2\u043b\u0435"+
		"\3\2\2\2\u043b\u0436\3\2\2\2\u043b\u0437\3\2\2\2\u043b\u0438\3\2\2\2\u043b"+
		"\u0439\3\2\2\2\u043b\u043a\3\2\2\2\u043cq\3\2\2\2\u043d\u043e\5t;\2\u043e"+
		"s\3\2\2\2\u043f\u0440\7E\2\2\u0440\u0441\7F\2\2\u0441\u0442\7\u0082\2"+
		"\2\u0442\u0443\5\34\17\2\u0443\u0444\7\u0085\2\2\u0444\u0445\7\63\2\2"+
		"\u0445\u0446\7\u0082\2\2\u0446\u0447\5\u00a8U\2\u0447\u0448\7\u0085\2"+
		"\2\u0448\u0449\7\25\2\2\u0449\u044a\7\u0082\2\2\u044a\u044f\5v<\2\u044b"+
		"\u044c\7\u0085\2\2\u044c\u044e\5 \21\2\u044d\u044b\3\2\2\2\u044e\u0451"+
		"\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0452\u0453\7\u0086\2\2\u0453u\3\2\2\2\u0454\u0459\5x="+
		"\2\u0455\u0456\7\u0087\2\2\u0456\u0458\5x=\2\u0457\u0455\3\2\2\2\u0458"+
		"\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045aw\3\2\2\2"+
		"\u045b\u0459\3\2\2\2\u045c\u045d\t\b\2\2\u045dy\3\2\2\2\u045e\u045f\7"+
		"C\2\2\u045f\u0460\5\u00acW\2\u0460\u0461\7\u0086\2\2\u0461{\3\2\2\2\u0462"+
		"\u0463\7D\2\2\u0463\u0464\5\u00acW\2\u0464\u0465\7\u0086\2\2\u0465}\3"+
		"\2\2\2\u0466\u0467\7B\2\2\u0467\u0468\5\u00acW\2\u0468\u0469\7\u0086\2"+
		"\2\u0469\u046a\5n8\2\u046a\u046b\7@\2\2\u046b\177\3\2\2\2\u046c\u046d"+
		"\5<\37\2\u046d\u046e\7\u0085\2\2\u046e\u0477\3\2\2\2\u046f\u0477\5l\67"+
		"\2\u0470\u0477\5\u008aF\2\u0471\u0477\5\u0088E\2\u0472\u0477\5\u0086D"+
		"\2\u0473\u0477\5\u0082B\2\u0474\u0477\5*\26\2\u0475\u0477\5\u0084C\2\u0476"+
		"\u046c\3\2\2\2\u0476\u046f\3\2\2\2\u0476\u0470\3\2\2\2\u0476\u0471\3\2"+
		"\2\2\u0476\u0472\3\2\2\2\u0476\u0473\3\2\2\2\u0476\u0474\3\2\2\2\u0476"+
		"\u0475\3\2\2\2\u0477\u0081\3\2\2\2\u0478\u0479\7K\2\2\u0479\u047a\7\u0082"+
		"\2\2\u047a\u047b\5\34\17\2\u047b\u047c\7\u0085\2\2\u047c\u0083\3\2\2\2"+
		"\u047d\u047e\7L\2\2\u047e\u047f\7\u0082\2\2\u047f\u0480\5\u0110\u0089"+
		"\2\u0480\u0481\7\u0085\2\2\u0481\u0085\3\2\2\2\u0482\u0483\7I\2\2\u0483"+
		"\u0484\7J\2\2\u0484\u0485\7\u0082\2\2\u0485\u0486\7\u00ab\2\2\u0486\u0087"+
		"\3\2\2\2\u0487\u0488\7H\2\2\u0488\u0489\5\u00acW\2\u0489\u048a\7\u0086"+
		"\2\2\u048a\u048b\5n8\2\u048b\u048c\7@\2\2\u048c\u0089\3\2\2\2\u048d\u048e"+
		"\7G\2\2\u048e\u048f\7\67\2\2\u048f\u0490\7\u0082\2\2\u0490\u0491\5\34"+
		"\17\2\u0491\u0492\7\u0085\2\2\u0492\u0493\5\u00acW\2\u0493\u0494\7@\2"+
		"\2\u0494\u008b\3\2\2\2\u0495\u049a\5\u008eH\2\u0496\u0497\7\u0087\2\2"+
		"\u0497\u0499\5\u008eH\2\u0498\u0496\3\2\2\2\u0499\u049c\3\2\2\2\u049a"+
		"\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u008d\3\2\2\2\u049c\u049a\3\2"+
		"\2\2\u049d\u049e\t\t\2\2\u049e\u008f\3\2\2\2\u049f\u04a0\7>\2\2\u04a0"+
		"\u04a1\7\u0082\2\2\u04a1\u04a2\7\u00ac\2\2\u04a2\u04a4\7\u0085\2\2\u04a3"+
		"\u049f\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04aa\3\2\2\2\u04a5\u04a6\78"+
		"\2\2\u04a6\u04a7\7\u0082\2\2\u04a7\u04a8\5\u00fa~\2\u04a8\u04a9\7\u0085"+
		"\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04a5\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04b0\3\2\2\2\u04ac\u04ad\7?\2\2\u04ad\u04ae\7\u0082\2\2\u04ae\u04af"+
		"\7\u00ab\2\2\u04af\u04b1\7\u0085\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04b1\3"+
		"\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\5\u0092J\2\u04b3\u0091\3\2\2\2"+
		"\u04b4\u04b5\7\67\2\2\u04b5\u04b6\7\u0082\2\2\u04b6\u04b7\5\34\17\2\u04b7"+
		"\u04b8\7\u0085\2\2\u04b8\u04b9\7\65\2\2\u04b9\u04ba\7\u0082\2\2\u04ba"+
		"\u04bb\5\34\17\2\u04bb\u04bc\7\u0085\2\2\u04bc\u0093\3\2\2\2\u04bd\u04be"+
		"\7:\2\2\u04be\u04bf\7\u0082\2\2\u04bf\u04c0\7\u00ab\2\2\u04c0\u04c1\7"+
		"\u0085\2\2\u04c1\u04c2\7;\2\2\u04c2\u04c3\7\u0082\2\2\u04c3\u04c4\7\u00ab"+
		"\2\2\u04c4\u04c9\7\u0085\2\2\u04c5\u04c6\7<\2\2\u04c6\u04c7\7\u0082\2"+
		"\2\u04c7\u04c8\7\u00ab\2\2\u04c8\u04ca\7\u0085\2\2\u04c9\u04c5\3\2\2\2"+
		"\u04c9\u04ca\3\2\2\2\u04ca\u04cf\3\2\2\2\u04cb\u04cc\7\61\2\2\u04cc\u04cd"+
		"\7\u0082\2\2\u04cd\u04ce\7\u00ab\2\2\u04ce\u04d0\7\u0085\2\2\u04cf\u04cb"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u0095\3\2\2\2\u04d1\u04d4\5\u0098M"+
		"\2\u04d2\u04d4\5\u009eP\2\u04d3\u04d1\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4"+
		"\u0097\3\2\2\2\u04d5\u04d6\7M\2\2\u04d6\u04dc\5\u0090I\2\u04d7\u04d8\7"+
		"\25\2\2\u04d8\u04d9\7\u0082\2\2\u04d9\u04da\5\u009aN\2\u04da\u04db\7\u0085"+
		"\2\2\u04db\u04dd\3\2\2\2\u04dc\u04d7\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04e2\3\2\2\2\u04de\u04df\7O\2\2\u04df\u04e0\7\u0082\2\2\u04e0\u04e1"+
		"\7\u00ab\2\2\u04e1\u04e3\7\u0085\2\2\u04e2\u04de\3\2\2\2\u04e2\u04e3\3"+
		"\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\5n8\2\u04e5\u04e6\7N\2\2\u04e6"+
		"\u04e7\7\u0086\2\2\u04e7\u0099\3\2\2\2\u04e8\u04ed\5\u009cO\2\u04e9\u04ea"+
		"\7\u0087\2\2\u04ea\u04ec\5\u009cO\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef\3"+
		"\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u009b\3\2\2\2\u04ef"+
		"\u04ed\3\2\2\2\u04f0\u04f3\t\n\2\2\u04f1\u04f3\5\u00e0q\2\u04f2\u04f0"+
		"\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u009d\3\2\2\2\u04f4\u04f5\7P\2\2\u04f5"+
		"\u04f6\5\u0090I\2\u04f6\u04fc\7\u0085\2\2\u04f7\u04f8\7\25\2\2\u04f8\u04f9"+
		"\7\u0082\2\2\u04f9\u04fa\5\u00a2R\2\u04fa\u04fb\7\u0085\2\2\u04fb\u04fd"+
		"\3\2\2\2\u04fc\u04f7\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u04ff\7R\2\2\u04ff\u0500\7\u0082\2\2\u0500\u0501\5\34\17\2\u0501\u0502"+
		"\7\u0085\2\2\u0502\u0503\5\u00a0Q\2\u0503\u0504\7Q\2\2\u0504\u0505\7\u0086"+
		"\2\2\u0505\u009f\3\2\2\2\u0506\u0508\5\u0080A\2\u0507\u0506\3\2\2\2\u0508"+
		"\u050b\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u00a1\3\2"+
		"\2\2\u050b\u0509\3\2\2\2\u050c\u0511\5\u00a4S\2\u050d\u050e\7\u0087\2"+
		"\2\u050e\u0510\5\u00a4S\2\u050f\u050d\3\2\2\2\u0510\u0513\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u00a3\3\2\2\2\u0513\u0511\3\2"+
		"\2\2\u0514\u0517\7\u00ab\2\2\u0515\u0517\5\u00e0q\2\u0516\u0514\3\2\2"+
		"\2\u0516\u0515\3\2\2\2\u0517\u00a5\3\2\2\2\u0518\u0520\7\61\2\2\u0519"+
		"\u051a\5\u00aaV\2\u051a\u051b\7\u0085\2\2\u051b\u0521\3\2\2\2\u051c\u051d"+
		"\7\u0082\2\2\u051d\u051e\5\u00a8U\2\u051e\u051f\7\u0085\2\2\u051f\u0521"+
		"\3\2\2\2\u0520\u0519\3\2\2\2\u0520\u051c\3\2\2\2\u0521\u0526\3\2\2\2\u0522"+
		"\u0523\7\62\2\2\u0523\u0524\7\u0082\2\2\u0524\u0525\7\u00ac\2\2\u0525"+
		"\u0527\7\u0085\2\2\u0526\u0522\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u00a7"+
		"\3\2\2\2\u0528\u0538\t\13\2\2\u0529\u052a\7\u00ab\2\2\u052a\u052b\7\u009a"+
		"\2\2\u052b\u052c\7\u00ab\2\2\u052c\u052d\7\u009a\2\2\u052d\u0538\7\u00ab"+
		"\2\2\u052e\u052f\7\u00ab\2\2\u052f\u0530\7\u0093\2\2\u0530\u0531\7\u00ab"+
		"\2\2\u0531\u0532\7\u0093\2\2\u0532\u0538\7\u00ab\2\2\u0533\u0534\7\30"+
		"\2\2\u0534\u0535\7\u0095\2\2\u0535\u0536\7\u00ab\2\2\u0536\u0538\7\u0096"+
		"\2\2\u0537\u0528\3\2\2\2\u0537\u0529\3\2\2\2\u0537\u052e\3\2\2\2\u0537"+
		"\u0533\3\2\2\2\u0538\u00a9\3\2\2\2\u0539\u053a\7\63\2\2\u053a\u053b\7"+
		"\u0082\2\2\u053b\u053c\5\u00acW\2\u053c\u00ab\3\2\2\2\u053d\u0542\5\u00ae"+
		"X\2\u053e\u053f\7\177\2\2\u053f\u0541\5\u00aeX\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u00ad\3\2"+
		"\2\2\u0544\u0542\3\2\2\2\u0545\u054a\5\u00b0Y\2\u0546\u0547\7\u0080\2"+
		"\2\u0547\u0549\5\u00b0Y\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00af\3\2\2\2\u054c\u054a\3\2"+
		"\2\2\u054d\u0552\5\u00b2Z\2\u054e\u054f\7\u0087\2\2\u054f\u0551\5\u00b2"+
		"Z\2\u0550\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u00b1\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u055a\5\u00b4"+
		"[\2\u0556\u0557\7\u0088\2\2\u0557\u0559\5\u00b4[\2\u0558\u0556\3\2\2\2"+
		"\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u00b3"+
		"\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u0564\5\u00b6\\\2\u055e\u055f\7\u0083"+
		"\2\2\u055f\u0563\5\u00b6\\\2\u0560\u0561\7\u0084\2\2\u0561\u0563\5\u00b6"+
		"\\\2\u0562\u055e\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0566\3\2\2\2\u0564"+
		"\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u00b5\3\2\2\2\u0566\u0564\3\2"+
		"\2\2\u0567\u0572\5\u00b8]\2\u0568\u0569\7\u008a\2\2\u0569\u0571\5\u00b8"+
		"]\2\u056a\u056b\7\u008b\2\2\u056b\u0571\5\u00b8]\2\u056c\u056d\7\u008c"+
		"\2\2\u056d\u0571\5\u00b8]\2\u056e\u056f\7\u008d\2\2\u056f\u0571\5\u00b8"+
		"]\2\u0570\u0568\3\2\2\2\u0570\u056a\3\2\2\2\u0570\u056c\3\2\2\2\u0570"+
		"\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2"+
		"\2\2\u0573\u00b7\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u057c\5\u00ba^\2\u0576"+
		"\u0577\7\u008e\2\2\u0577\u057b\5\u00ba^\2\u0578\u0579\7\u008f\2\2\u0579"+
		"\u057b\5\u00ba^\2\u057a\u0576\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057e"+
		"\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u00b9\3\2\2\2\u057e"+
		"\u057c\3\2\2\2\u057f\u0586\5\u00bc_\2\u0580\u0581\7\u0090\2\2\u0581\u0585"+
		"\5\u00bc_\2\u0582\u0583\7\u0091\2\2\u0583\u0585\5\u00bc_\2\u0584\u0580"+
		"\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u00bb\3\2\2\2\u0588\u0586\3\2\2\2\u0589\u0592\5\u00be"+
		"`\2\u058a\u058b\7\u0092\2\2\u058b\u0591\5\u00be`\2\u058c\u058d\7\u0093"+
		"\2\2\u058d\u0591\5\u00be`\2\u058e\u058f\7\u0094\2\2\u058f\u0591\5\u00be"+
		"`\2\u0590\u058a\3\2\2\2\u0590\u058c\3\2\2\2\u0590\u058e\3\2\2\2\u0591"+
		"\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u00bd\3\2"+
		"\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7\u0095\2\2\u0596\u0597\t\f\2\2\u0597"+
		"\u0599\7\u0096\2\2\u0598\u0595\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598"+
		"\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2\2\2\u059d"+
		"\u059e\5\u00c0a\2\u059e\u00bf\3\2\2\2\u059f\u05aa\5\u00c2b\2\u05a0\u05aa"+
		"\5\u00c4c\2\u05a1\u05aa\5\u00c6d\2\u05a2\u05aa\5\u00c8e\2\u05a3\u05aa"+
		"\5\u00e2r\2\u05a4\u05aa\5\u00e4s\2\u05a5\u05aa\5\u00fc\177\2\u05a6\u05aa"+
		"\5\u010c\u0087\2\u05a7\u05a8\7\u0081\2\2\u05a8\u05aa\5\u00c0a\2\u05a9"+
		"\u059f\3\2\2\2\u05a9\u05a0\3\2\2\2\u05a9\u05a1\3\2\2\2\u05a9\u05a2\3\2"+
		"\2\2\u05a9\u05a3\3\2\2\2\u05a9\u05a4\3\2\2\2\u05a9\u05a5\3\2\2\2\u05a9"+
		"\u05a6\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u00c1\3\2\2\2\u05ab\u05ac\7\t"+
		"\2\2\u05ac\u05ad\7\u0095\2\2\u05ad\u05ae\5\u00acW\2\u05ae\u05af\7\u0085"+
		"\2\2\u05af\u05b0\5\u00acW\2\u05b0\u05b1\7\u0096\2\2\u05b1\u00c3\3\2\2"+
		"\2\u05b2\u05b3\7\n\2\2\u05b3\u05b4\7\u0095\2\2\u05b4\u05b5\5\u00acW\2"+
		"\u05b5\u05b6\7\u0085\2\2\u05b6\u05b7\5\u00acW\2\u05b7\u05b8\7\u0096\2"+
		"\2\u05b8\u00c5\3\2\2\2\u05b9\u05ba\7\u0095\2\2\u05ba\u05bb\5\u00acW\2"+
		"\u05bb\u05bc\7\u0096\2\2\u05bc\u00c7\3\2\2\2\u05bd\u05c8\5\u00caf\2\u05be"+
		"\u05c8\5\u00ceh\2\u05bf\u05c8\5\u00d0i\2\u05c0\u05c8\5\u00d2j\2\u05c1"+
		"\u05c8\5\u00d4k\2\u05c2\u05c8\5\u00d6l\2\u05c3\u05c8\5\u00d8m\2\u05c4"+
		"\u05c8\5\u00dan\2\u05c5\u05c8\5\u00dco\2\u05c6\u05c8\5\u00dep\2\u05c7"+
		"\u05bd\3\2\2\2\u05c7\u05be\3\2\2\2\u05c7\u05bf\3\2\2\2\u05c7\u05c0\3\2"+
		"\2\2\u05c7\u05c1\3\2\2\2\u05c7\u05c2\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c7"+
		"\u05c4\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c6\3\2\2\2\u05c8\u00c9\3\2"+
		"\2\2\u05c9\u05ca\7\13\2\2\u05ca\u00cb\3\2\2\2\u05cb\u05cc\7\u00ac\2\2"+
		"\u05cc\u00cd\3\2\2\2\u05cd\u05ce\7\f\2\2\u05ce\u05cf\5\u00ccg\2\u05cf"+
		"\u05d0\7\u0083\2\2\u05d0\u05d1\7\u00ab\2\2\u05d1\u00cf\3\2\2\2\u05d2\u05d3"+
		"\7\r\2\2\u05d3\u05d4\5\u00ccg\2\u05d4\u05d5\7\u0083\2\2\u05d5\u05d6\5"+
		"\u00ccg\2\u05d6\u00d1\3\2\2\2\u05d7\u05d8\7\16\2\2\u05d8\u05d9\5\u00cc"+
		"g\2\u05d9\u05db\7\u0083\2\2\u05da\u05dc\7\u00ab\2\2\u05db\u05da\3\2\2"+
		"\2\u05dc\u05dd\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u00d3"+
		"\3\2\2\2\u05df\u05e0\7\17\2\2\u05e0\u05e1\7\u0095\2\2\u05e1\u05e5\7\u00ac"+
		"\2\2\u05e2\u05e3\7\u00ab\2\2\u05e3\u05e5\7\u0096\2\2\u05e4\u05df\3\2\2"+
		"\2\u05e4\u05e2\3\2\2\2\u05e5\u00d5\3\2\2\2\u05e6\u05e7\7\20\2\2\u05e7"+
		"\u05e8\7\u0095\2\2\u05e8\u05e9\7\u00ac\2\2\u05e9\u05ea\7\u0096\2\2\u05ea"+
		"\u00d7\3\2\2\2\u05eb\u05ec\7\21\2\2\u05ec\u05ed\7\u0095\2\2\u05ed\u05ee"+
		"\5\34\17\2\u05ee\u05ef\7\u0096\2\2\u05ef\u00d9\3\2\2\2\u05f0\u05f1\7\22"+
		"\2\2\u05f1\u00db\3\2\2\2\u05f2\u05f3\7\23\2\2\u05f3\u05f4\7\u0095\2\2"+
		"\u05f4\u05f5\5\u0110\u0089\2\u05f5\u05f6\7\u0096\2\2\u05f6\u00dd\3\2\2"+
		"\2\u05f7\u05f8\7\24\2\2\u05f8\u05f9\7\u0095\2\2\u05f9\u05fb\5\u00fa~\2"+
		"\u05fa\u05fc\7\u0087\2\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u05fe\3\2\2\2\u05fd\u05ff\7\25\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3"+
		"\2\2\2\u05ff\u0601\3\2\2\2\u0600\u0602\7\u0082\2\2\u0601\u0600\3\2\2\2"+
		"\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603\u0605\5f\64\2\u0604\u0603"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\7\u0096\2"+
		"\2\u0607\u00df\3\2\2\2\u0608\u0609\t\r\2\2\u0609\u00e1\3\2\2\2\u060a\u060b"+
		"\t\16\2\2\u060b\u00e3\3\2\2\2\u060c\u0617\5\u00e6t\2\u060d\u0617\5\u00e8"+
		"u\2\u060e\u0617\5\u00eav\2\u060f\u0617\5\u00ecw\2\u0610\u0617\5\u00ee"+
		"x\2\u0611\u0617\5\u00f0y\2\u0612\u0617\5\u00f2z\2\u0613\u0617\5\u00f4"+
		"{\2\u0614\u0617\5\u00f6|\2\u0615\u0617\5\u00f8}\2\u0616\u060c\3\2\2\2"+
		"\u0616\u060d\3\2\2\2\u0616\u060e\3\2\2\2\u0616\u060f\3\2\2\2\u0616\u0610"+
		"\3\2\2\2\u0616\u0611\3\2\2\2\u0616\u0612\3\2\2\2\u0616\u0613\3\2\2\2\u0616"+
		"\u0614\3\2\2\2\u0616\u0615\3\2\2\2\u0617\u00e5\3\2\2\2\u0618\u0619\7\26"+
		"\2\2\u0619\u061a\7\u0095\2\2\u061a\u061b\5\u00acW\2\u061b\u061c\7\u0096"+
		"\2\2\u061c\u00e7\3\2\2\2\u061d\u061e\7\u0089\2\2\u061e\u061f\7\u0095\2"+
		"\2\u061f\u0620\5\u00acW\2\u0620\u0621\7\u0096\2\2\u0621\u00e9\3\2\2\2"+
		"\u0622\u0623\7\27\2\2\u0623\u062e\7\u0095\2\2\u0624\u0625\7/\2\2\u0625"+
		"\u0626\7\u0082\2\2\u0626\u0627\7\30\2\2\u0627\u0628\7\u009e\2\2\u0628"+
		"\u0629\7\u0095\2\2\u0629\u062a\7\60\2\2\u062a\u062b\7\u00ab\2\2\u062b"+
		"\u062c\7\u009e\2\2\u062c\u062d\7\u0096\2\2\u062d\u062f\7\u0085\2\2\u062e"+
		"\u0624\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0635\3\2\2\2\u0630\u0631\7."+
		"\2\2\u0631\u0632\7\u0082\2\2\u0632\u0633\5\u0110\u0089\2\u0633\u0634\7"+
		"\u0085\2\2\u0634\u0636\3\2\2\2\u0635\u0630\3\2\2\2\u0635\u0636\3\2\2\2"+
		"\u0636\u0637\3\2\2\2\u0637\u0638\5\u00acW\2\u0638\u0639\7\u0096\2\2\u0639"+
		"\u00eb\3\2\2\2\u063a\u063b\7\31\2\2\u063b\u063c\7\u0095\2\2\u063c\u063d"+
		"\5\u00acW\2\u063d\u063e\7\u0096\2\2\u063e\u00ed\3\2\2\2\u063f\u0640\7"+
		"\32\2\2\u0640\u0641\7\u0095\2\2\u0641\u0642\5\u00acW\2\u0642\u0643\7\u0096"+
		"\2\2\u0643\u00ef\3\2\2\2\u0644\u0646\7\33\2\2\u0645\u0647\7-\2\2\u0646"+
		"\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648\u064a\7\u0082"+
		"\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\3\2\2\2\u064b"+
		"\u064d\7\u00ab\2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064f"+
		"\3\2\2\2\u064e\u0650\7\u0085\2\2\u064f\u064e\3\2\2\2\u064f\u0650\3\2\2"+
		"\2\u0650\u0651\3\2\2\2\u0651\u0652\7\u0095\2\2\u0652\u0653\5\u00acW\2"+
		"\u0653\u0654\7\u0096\2\2\u0654\u00f1\3\2\2\2\u0655\u0656\7\34\2\2\u0656"+
		"\u0657\7\u0095\2\2\u0657\u0658\5\u00acW\2\u0658\u0659\7\u0096\2\2\u0659"+
		"\u00f3\3\2\2\2\u065a\u065b\7\35\2\2\u065b\u065c\7\u0095\2\2\u065c\u065d"+
		"\5\u00acW\2\u065d\u065e\7\u0096\2\2\u065e\u00f5\3\2\2\2\u065f\u0660\7"+
		"\36\2\2\u0660\u0661\7\u0095\2\2\u0661\u0662\5\u00acW\2\u0662\u0663\7\u0096"+
		"\2\2\u0663\u00f7\3\2\2\2\u0664\u0665\7\37\2\2\u0665\u0666\7\u0095\2\2"+
		"\u0666\u0668\5\u00fa~\2\u0667\u0669\7\u0087\2\2\u0668\u0667\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u066b\3\2\2\2\u066a\u066c\7\25\2\2\u066b\u066a\3"+
		"\2\2\2\u066b\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u066f\7\u0082\2\2"+
		"\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670\u0672"+
		"\5f\64\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0674\7\u0085\2\2\u0674\u0675\5\u00acW\2\u0675\u0676\7\u0096\2\2\u0676"+
		"\u00f9\3\2\2\2\u0677\u0678\7\u00ac\2\2\u0678\u0679\7\u009c\2\2\u0679\u067a"+
		"\7\u00ab\2\2\u067a\u0689\7\u009d\2\2\u067b\u0685\7\u00ac\2\2\u067c\u067d"+
		"\7\u009b\2\2\u067d\u0681\7\u00ac\2\2\u067e\u067f\7\u009c\2\2\u067f\u0680"+
		"\7\u00ab\2\2\u0680\u0682\7\u009d\2\2\u0681\u067e\3\2\2\2\u0681\u0682\3"+
		"\2\2\2\u0682\u0684\3\2\2\2\u0683\u067c\3\2\2\2\u0684\u0687\3\2\2\2\u0685"+
		"\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2"+
		"\2\2\u0688\u0677\3\2\2\2\u0688\u067b\3\2\2\2\u0689\u00fb\3\2\2\2\u068a"+
		"\u0690\5\u00fe\u0080\2\u068b\u0690\5\u0100\u0081\2\u068c\u0690\5\u0104"+
		"\u0083\2\u068d\u0690\5\u0106\u0084\2\u068e\u0690\5\u0108\u0085\2\u068f"+
		"\u068a\3\2\2\2\u068f\u068b\3\2\2\2\u068f\u068c\3\2\2\2\u068f\u068d\3\2"+
		"\2\2\u068f\u068e\3\2\2\2\u0690\u00fd\3\2\2\2\u0691\u0692\7 \2\2\u0692"+
		"\u0693\7\u0095\2\2\u0693\u0694\5\u00acW\2\u0694\u0695\7\u0099\2\2\u0695"+
		"\u0696\5\u00acW\2\u0696\u0697\7\u009a\2\2\u0697\u0698\5\u00acW\2\u0698"+
		"\u0699\7\u0096\2\2\u0699\u00ff\3\2\2\2\u069a\u069b\7!\2\2\u069b\u069c"+
		"\7\u0095\2\2\u069c\u06a1\5\u0102\u0082\2\u069d\u069e\7\u0087\2\2\u069e"+
		"\u06a0\5\u0102\u0082\2\u069f\u069d\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a4\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4"+
		"\u06a5\7\u0085\2\2\u06a5\u06a6\5\u00acW\2\u06a6\u06a7\7\u0085\2\2\u06a7"+
		"\u06a8\5\u00acW\2\u06a8\u06a9\7\u0085\2\2\u06a9\u06aa\5\u00acW\2\u06aa"+
		"\u06ab\7\u0096\2\2\u06ab\u0101\3\2\2\2\u06ac\u06ad\t\17\2\2\u06ad\u0103"+
		"\3\2\2\2\u06ae\u06af\7$\2\2\u06af\u06b0\7\u0095\2\2\u06b0\u06b1\5\u00ac"+
		"W\2\u06b1\u06b2\7\u0085\2\2\u06b2\u06b3\5\u00acW\2\u06b3\u06b4\7\u0085"+
		"\2\2\u06b4\u06b5\5\u00acW\2\u06b5\u06b6\7\u0096\2\2\u06b6\u0105\3\2\2"+
		"\2\u06b7\u06b8\7%\2\2\u06b8\u06b9\7\u0095\2\2\u06b9\u06ba\5\u00acW\2\u06ba"+
		"\u06bb\7\u0085\2\2\u06bb\u06bc\5\u00acW\2\u06bc\u06bd\7\u0085\2\2\u06bd"+
		"\u06be\5\u00acW\2\u06be\u06bf\7\u0096\2\2\u06bf\u0107\3\2\2\2\u06c0\u06c1"+
		"\7&\2\2\u06c1\u06c2\7\u0095\2\2\u06c2\u06c3\7\25\2\2\u06c3\u06c4\7\u0082"+
		"\2\2\u06c4\u06c9\5\u010a\u0086\2\u06c5\u06c6\7\u0087\2\2\u06c6\u06c8\5"+
		"\u010a\u0086\2\u06c7\u06c5\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2"+
		"\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc"+
		"\u06cd\7\u0085\2\2\u06cd\u06ce\5\u00acW\2\u06ce\u06cf\7\u0085\2\2\u06cf"+
		"\u06d0\5\u00acW\2\u06d0\u06d1\7\u0085\2\2\u06d1\u06d2\5\u00acW\2\u06d2"+
		"\u06d3\7\u0096\2\2\u06d3\u0109\3\2\2\2\u06d4\u06d5\t\20\2\2\u06d5\u010b"+
		"\3\2\2\2\u06d6\u06d7\7\'\2\2\u06d7\u06d8\7\u0095\2\2\u06d8\u06d9\5\u00ac"+
		"W\2\u06d9\u06e1\7\u009a\2\2\u06da\u06db\5\u00acW\2\u06db\u06dc\7\u0085"+
		"\2\2\u06dc\u06dd\5\u00acW\2\u06dd\u06de\7\u0085\2\2\u06de\u06e0\3\2\2"+
		"\2\u06df\u06da\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2"+
		"\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4\u06e5\7\u0096\2"+
		"\2\u06e5\u010d\3\2\2\2\u06e6\u06e7\7\u00af\2\2\u06e7\u06e8\7\u0085\2\2"+
		"\u06e8\u06e9\7\u00af\2\2\u06e9\u06ea\7\u0085\2\2\u06ea\u06eb\7\u00af\2"+
		"\2\u06eb\u06ec\7\u0085\2\2\u06ec\u06ed\7\u00af\2\2\u06ed\u06ee\7\u0085"+
		"\2\2\u06ee\u06ef\7\u00af\2\2\u06ef\u06f0\7\u0085\2\2\u06f0\u06f1\7\u00af"+
		"\2\2\u06f1\u06f2\7\u0085\2\2\u06f2\u06f3\7\u00af\2\2\u06f3\u06f4\7\u0085"+
		"\2\2\u06f4\u06f5\7\u00af\2\2\u06f5\u010f\3\2\2\2\u06f6\u06f7\7\u0097\2"+
		"\2\u06f7\u06f8\7\u00ad\2\2\u06f8\u06f9\7\u0085\2\2\u06f9\u06fa\7\u00ae"+
		"\2\2\u06fa\u06fb\7\u0085\2\2\u06fb\u06fc\7\u00ae\2\2\u06fc\u0702\7\u0085"+
		"\2\2\u06fd\u06fe\7\u0097\2\2\u06fe\u06ff\5\u010e\u0088\2\u06ff\u0700\7"+
		"\u0098\2\2\u0700\u0703\3\2\2\2\u0701\u0703\5\u010e\u0088\2\u0702\u06fd"+
		"\3\2\2\2\u0702\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\7\u0098\2"+
		"\2\u0705\u0111\3\2\2\2\u0092\u0126\u0128\u0131\u0135\u0160\u0164\u016b"+
		"\u0171\u0175\u017e\u0183\u018f\u0199\u01a8\u01b2\u01ba\u01be\u01c4\u01ce"+
		"\u01d2\u01db\u020b\u0211\u0217\u021d\u0223\u0229\u022f\u0235\u023b\u0241"+
		"\u0243\u0246\u024c\u0250\u0259\u0260\u0264\u026b\u0270\u0280\u0285\u028d"+
		"\u0299\u02a5\u02b0\u02b8\u02c0\u02ca\u0301\u0304\u0315\u031b\u0322\u032e"+
		"\u0333\u033e\u0343\u0347\u0350\u0356\u0369\u036e\u0378\u037e\u0391\u0396"+
		"\u039a\u03a3\u03af\u03b9\u03bf\u03d2\u03d9\u03de\u03e7\u041e\u0421\u0430"+
		"\u0432\u043b\u044f\u0459\u0476\u049a\u04a3\u04aa\u04b0\u04c9\u04cf\u04d3"+
		"\u04dc\u04e2\u04ed\u04f2\u04fc\u0509\u0511\u0516\u0520\u0526\u0537\u0542"+
		"\u054a\u0552\u055a\u0562\u0564\u0570\u0572\u057a\u057c\u0584\u0586\u0590"+
		"\u0592\u059a\u05a9\u05c7\u05dd\u05e4\u05fb\u05fe\u0601\u0604\u0616\u062e"+
		"\u0635\u0646\u0649\u064c\u064f\u0668\u066b\u066e\u0671\u0681\u0685\u0688"+
		"\u068f\u06a1\u06c9\u06e1\u0702";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}