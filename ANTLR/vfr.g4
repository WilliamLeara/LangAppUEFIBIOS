grammar vfr;

vfrFormDefinition
    :   Form FormId Equals Number Comma Title Equals getStringId SemiColon
    (
    vfrStatementImage
        | vfrStatementLocked
        | vfrStatementRules
        | vfrStatementDefault
        | vfrStatementStat
        | vfrStatementQuestions
        | vfrStatementConditional
        | vfrStatementLabel
        | vfrStatementBanner
        | vfrStatementExtension
        | vfrStatementModal
    )*
    EndForm SemiColon
    ;

vfrStatementStat
    : vfrStatementSubTitle
    | vfrStatementStaticText
    | vfrStatementCrossReference
    ;

vfrStatementCrossReference
    : vfrStatementGoto
    | vfrStatementResetButton
    ;

vfrStatementGoto
    : Goto
    (
        (
            DevicePath Equals getStringId Comma
            FormsetGuid Equals guidDefinition Comma
            FormId Equals Number Comma
            Question Equals Number Comma
        )
        |
        (
            FormsetGuid Equals guidDefinition Comma
            FormId Equals Number Comma
            Question Equals Number Comma
        )
        |
        (
            FormId Equals Number Comma
            Question Equals
            (
                StringIdentifier Comma
                | Number Comma
            )
        )
        |
        (
            Number Comma
        )
    )?
    vfrQuestionHeader
    ( Comma Flags Equals vfrGotoFlags )?
    ( Comma Key Equals Number )?
    ( Comma vfrStatementQuestionOptionList )?
    SemiColon
;

vfrGotoFlags
    : gotoFlagsField ( OrBitwise gotoFlagsField )*
    ;

gotoFlagsField
    : Number
    | questionheaderFlagsField
    ;

vfrStatementResetButton
    : ResetButton
    DefaultStore Equals StringIdentifier Comma
    vfrStatementHeader Comma
    ( vfrStatementStatTagList Comma )?
    EndResetButton SemiColon
    ;

vfrStatementStatTagList
    : vfrStatementStatTag ( Comma vfrStatementStatTag )*
    ;

vfrStatementStaticText
    : Text
    Help Equals getStringId Comma
    Text Equals getStringId
    ( Comma Text Equals getStringId )?
    (
    Comma Flags Equals staticTextFlagsField ( OrBitwise staticTextFlagsField )*
    Comma Key Equals Number
    )?
    ( Comma vfrStatementStatTagList )? SemiColon
    ;

staticTextFlagsField
    : Number
    | questionheaderFlagsField
    ;

vfrStatementSubTitle
    : Subtitle
    Text Equals getStringId
    ( Comma Flags Equals vfrSubtitleFlags )?
    ( Comma vfrStatementStatTagList )? SemiColon
    ;

vfrSubtitleFlags
    : subtitleFlagsField ( OrBitwise subtitleFlagsField )* SemiColon
    ;

subtitleFlagsField : Number | Horizontal ;

getStringId : StringToken LParen Number RParen ;

vfrStatementImage
    : vfrImageTag SemiColon
    ;

vfrImageTag
    : Image Equals ImageToken LParen Number RParen
    ;

vfrStatementLocked
    : vfrLockedTag SemiColon
    ;

vfrLockedTag : Locked ;

vfrStatementRules
    : Rule StringIdentifier Comma vfrStatementExpression EndRule SemiColon
    ;


vfrStatementModal : Modal SemiColon ;

vfrStatementExtension
    : Guidop
    Guid Equals guidDefinition
    (
    Comma Datatype Equals
    (
    UINT64 ( LBracket Number RBracket )?
    | UINT32 ( LBracket Number RBracket )?
    | UINT16 ( LBracket Number RBracket )?
    | UINT8 ( LBracket Number RBracket )?
    | BOOLEAN ( LBracket Number RBracket )?
    | EfiStringId ( LBracket Number RBracket )?
    | EfiHiiDate ( LBracket Number RBracket )?
    | EfiHiiTime ( LBracket Number RBracket )?
    | EfiHiiRef ( LBracket Number RBracket )?
    | StringIdentifier ( LBracket Number RBracket )?
    )
    vfrExtensionData
    )?
    (
    Comma ( vfrStatementExtension )*
    EndGuidop
    )?
    SemiColon
    ;

vfrExtensionData
    :
    (
        Comma Data ( LBracket Number RBracket )?
        (
            Period StringIdentifier ( LBracket Number RBracket )?
        )*
        Equals Number
    )*
    ;

vfrStatementBanner
    : Banner ( Comma )?
    Title Equals getStringId Comma
    (
        (
            Line Number Comma
            Align ( Left | Center | Right ) SemiColon
        )
        |
        ( Timeout Equals Number SemiColon )
    )
    ;

vfrStatementConditional
    : vfrStatementDisableIfStat
    | vfrStatementSuppressIfStat
    | vfrStatementGrayOutIfStat
    ;

vfrStatementDisableIfStat
    : DisableIf vfrStatementExpression Comma
    ( vfrStatementStatList )*
    EndIf SemiColon
    ;

vfrStatementSuppressIfStat
    : SuppressIf vfrStatementExpression Comma
    ( vfrStatementStatList )*
    EndIf SemiColon
    ;

vfrStatementGrayOutIfStat
    : GrayoutIf vfrStatementExpression Comma
    ( vfrStatementStatList )*
    EndIf SemiColon
    ;

vfrStatementStatList
    : vfrStatementStat
    | vfrStatementQuestions
    | vfrStatementConditional
    | vfrStatementLabel
    | vfrStatementExtension
    ;

vfrStatementLabel : Label Number SemiColon ;


vfrStatementStatTag : vfrImageTag | vfrLockedTag ;

vfrStatementQuestions
    : vfrStatementBooleanType
    | vfrStatementDate
    | vfrStatementNumericType
    | vfrStatementStringType
    | vfrStatementOrderedList
    | vfrStatementTime
    ;

vfrStatementTime :
    Time
    (
        (
        vfrQuestionHeader Comma
        ( Flags Equals vfrTimeFlags Comma )?
        vfrStatementQuestionOptionList
        )
    |
    (
        Hour Varid Equals StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxTimeStepDefault
        Minute Varid Equals StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxTimeStepDefault
        Second Varid Equals StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxTimeStepDefault
        ( vfrStatementInconsistentIf )*
    )
    )
    Endtime SemiColon
    ;

minMaxTimeStepDefault
    : Minimum Equals Number Comma
    Maximum Equals Number Comma
    ( Step Equals Number Comma )?
    ( Default Equals Number Comma )?
    ;

vfrTimeFlags
    : timeFlagsField ( OrBitwise timeFlagsField )*
    ;

timeFlagsField
    : Number
    | HourSuppress
    | MinuteSuppress
    | SecondSuppress
    | StorageNormal
    | StorageTime
    | StorageWakeup
    ;

vfrStatementOrderedList
    : Orderedlist
    vfrQuestionHeader Comma
    ( Maxcontainers Equals Number Comma)?
    ( Flags Equals vfrOrderedListFlags )?
    vfrStatementQuestionOptionList
    Endlist SemiColon
    ;

vfrOrderedListFlags
    : orderedlistFlagsField ( OrBitwise orderedlistFlagsField )*
    ;

orderedlistFlagsField
    :
    ( Number
    | Unique
    | Noempty
    )
    | questionheaderFlagsField
    ;

vfrStatementStringType
    : vfrStatementString
    | vfrStatementPassword
    ;

vfrStatementPassword
    : Password
    vfrQuestionHeader
    ( Flags Equals vfrPasswordFlagsField Comma )?
    ( Key Equals Number Comma )?
    MinSize Equals Number Comma
    MaxSize Equals Number Comma
    vfrStatementQuestionOptionList
    Endpassword SemiColon
    ;

vfrPasswordFlagsField : passwordFlagsField ( OrBitwise passwordFlagsField )* ;

passwordFlagsField
    : Number
    | questionheaderFlagsField
    ;

vfrStatementString
    : String
    vfrQuestionHeader Comma
    ( Flags Equals vfrStringFlagsField Comma )?
    ( Key Equals Number Comma )?
    MinSize Equals Number Comma
    MaxSize Equals Number Comma
    vfrStatementQuestionOptionList
    EndString SemiColon
    ;

vfrStringFlagsField : stringFlagsField ( OrBitwise stringFlagsField )* ;

stringFlagsField
    :
    ( Number
    | MultiLine
    )
    | questionheaderFlagsField
    ;

vfrStatementNumericType
    : vfrStatementNumeric
    | vfrStatementOneOf
    ;

vfrStatementOneOf
    : Oneof
    vfrQuestionHeader
    ( Flags Equals vfrOneofFlagsField Comma )?
    ( vfrSetMinMaxStep )
    vfrStatementQuestionOptionList
    EndOneof SemiColon
    ;

vfrOneofFlagsField
    : numericFlagsField ( OrBitwise numericFlagsField )*
    ;

vfrStatementNumeric
    : Numeric
    vfrQuestionHeader 
    ( Flags Equals vfrNumericFlags Comma )?
    ( Key Equals Number Comma )?
    vfrSetMinMaxStep
    vfrStatementQuestionOptionList
    Endnumeric SemiColon
    ;

vfrSetMinMaxStep
: Minimum Equals Number Comma
Maximum Equals Number Comma
( Step Equals Number Comma )?
;

vfrNumericFlags
    : numericFlagsField ( OrBitwise numericFlagsField )*
    ;

numericFlagsField
    :
    ( Number
    | NumSize1
    | NumSize2
    | NumSize4
    | NumSize8
    | DispIntDec
    | DispUintDec
    | DispUintHex
    )
    | questionheaderFlagsField
    ;

vfrStatementDate
    : Date
    (
        (
        vfrQuestionHeader
        ( Flags Equals vfrDateFlags Comma )?
        vfrStatementQuestionOptionList
        )
    |
        (
        Year Varid Equals StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxDateStepDefault
        Month Varid Equals StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxDateStepDefault
        Day Varid equalTerm StringIdentifier Period StringIdentifier Comma
        Prompt Equals getStringId Comma
        Help Equals getStringId Comma
        minMaxDateStepDefault
        ( vfrStatementInconsistentIf )*
        )
    )
    EndDate SemiColon
    ;

vfrStatementInconsistentIf
    : InconsistentIf
    Prompt Equals getStringId Comma
    vfrStatementExpression
    EndIf
    ;

vfrStatementQuestionOptionList
    : (
    vfrStatementQuestionTag
    | vfrStatementQuestionOptionTag
    )*
    ;

vfrStatementQuestionOptionTag
    : vfrStatementSuppressIfQuest
    | vfrStatementValue
    | vfrStatementDefault
    | vfrStatementOptions
    | vfrStatementRead
    | vfrStatementWrite
    ;

vfrStatementOptions : vfrStatementOneOfOption ;

vfrStatementOneOfOption
    : Option
    Text Equals getStringId Comma
    Value Equals vfrConstantValueField Comma
    Flags Equals vfrOneOfOptionFlags
    ( Comma vfrImageTag )*
    SemiColon
    ;

vfrOneOfOptionFlags : oneofoptionFlagsField ( OrBitwise oneofoptionFlagsField )* ;

oneofoptionFlagsField
    : Number
    | OptionDefault
    | OptionDefaultMfg
    | Interactive
    | ResetRequired
    | Default
    ;

vfrStatementRead : Read vfrStatementExpression SemiColon ;
vfrStatementWrite : Write vfrStatementExpression SemiColon ;

vfrStatementSuppressIfQuest
    : SuppressIf vfrStatementExpression SemiColon
    vfrStatementQuestionOptionList
    EndIf
    ;

vfrStatementQuestionTag
    : vfrStatementStatTag Comma
    | vfrStatementInconsistentIf
    | vfrStatementNoSubmitIf
    | vfrStatementDisableIfQuest | vfrStatementRefresh
    | vfrStatementVarstoreDevice
    | vfrStatementExtension
    | vfrStatementRefreshEvent
    ;

vfrStatementVarstoreDevice : VarStoreDevice Equals getStringId Comma ;

vfrStatementRefreshEvent : RefreshGuid Equals guidDefinition Comma ;

vfrStatementRefresh
    : Refresh Interval Equals Number
    ;

vfrStatementDisableIfQuest
    : DisableIf  vfrStatementExpression SemiColon
    vfrStatementQuestionOptionList
    EndIf
    ;

vfrStatementNoSubmitIf
    : NoSubmitIf
    Prompt Equals getStringId Comma
    vfrStatementExpression
    EndIf
    ;

vfrDateFlags : dateFlagsField ( OrBitwise dateFlagsField )* ;

dateFlagsField
    : Number
    | YearSuppress
    | MonthSuppress
    | DaySuppress
    | StorageNormal
    | StorageTime
    | StorageWakeup
    ;

vfrQuestionHeader
    : ( Name Equals StringIdentifier Comma )?
    ( Varid Equals vfrStorageVarId Comma )?
    ( QuestionId Equals Number Comma )?
    vfrStatementHeader
    ;

vfrStatementHeader
    : Prompt Equals getStringId Comma
    Help Equals getStringId Comma
    ;

minMaxDateStepDefault
    : Minimum Equals Number Comma
    Maximum Equals Number Comma
    ( Step Equals Number Comma )?
    ( Default Equals Number Comma)?
    ;

vfrStatementBooleanType
    : vfrStatementCheckBox
    | vfrStatementAction
    ;

vfrStatementCheckBox
    : Checkbox
    vfrQuestionHeader
    ( Flags Equals vfrCheckBoxFlags Comma )?
    ( Key Equals Number Comma )?
    vfrStatementQuestionOptionList
    EndCheckbox SemiColon
    ;

vfrCheckBoxFlags
    : checkboxFlagsField ( OrBitwise checkboxFlagsField )*
    ;

checkboxFlagsField
    :
    (
    Number
    | CheckboxDefault
    | CheckboxDefaultMfg
    )
    | questionheaderFlagsField
    ;

vfrStatementAction
    : Action
    vfrQuestionHeader Comma
    ( Flags Equals vfrActionFlags Comma )?
    Config Equals getStringId Comma
    vfrStatementQuestionTagList
    EndAction SemiColon
    ;

vfrStatementQuestionTagList : ( vfrStatementQuestionTag )* ;

vfrActionFlags
: actionFlagsField ( OrBitwise actionFlagsField )*
;
    
actionFlagsField
: Number
| questionheaderFlagsField
;

vfrStatementDefault
    : Default
    (
        (vfrStatementValue Comma | Equals vfrConstantValueField Comma)
        ( DefaultStore Equals StringIdentifier Comma )?
    )
    ;

vfrConstantValueField
    : 
    ( Number
    | TRUE
    | FALSE
    | ONE
    | ONES
    | ZERO
    )
    | Number Colon Number Colon Number
    | Number Divide Number Divide Number
    | StringToken LParen Number RParen
    ;

vfrStatementValue
    : Value Equals vfrStatementExpression
    ;

vfrStatementExpression
    : andTerm (Or andTerm)*
    ;

andTerm
    : bitwiseorTerm (And bitwiseorTerm)*
    ;

bitwiseorTerm
    : bitwiseandTerm ( OrBitwise bitwiseandTerm )*
    ;

bitwiseandTerm
    : equalTerm ( AndBitwise equalTerm )*
    ;

equalTerm
    : compareTerm (EqualsEquals compareTerm | NotEquals compareTerm)*
    ;

compareTerm
    : shiftTerm
    (
    LessThan shiftTerm
    | LessThanEquals shiftTerm
    | GreaterThan shiftTerm
    | GreaterThanEquals shiftTerm
    )*
    ;
    
shiftTerm
    : addMinusTerm
    (
    ShiftLeft addMinusTerm
    | ShiftRight addMinusTerm
    )*
    ;

addMinusTerm
    : multdivmodTerm
    (
    Plus multdivmodTerm
    | Minus multdivmodTerm
    )*
    ;

multdivmodTerm
    : castTerm
    (
    Multiply castTerm
    | Divide castTerm
    | Modulus castTerm
    )*
    ;

castTerm
    : (
    LParen
    (
    BOOLEAN
    | UINT64
    | UINT32
    | UINT16
    | UINT8
    )
    RParen
    )*
    atomTerm
    ;

atomTerm
    : vfrExpressionCatenate
    | vfrExpressionMatch
    | vfrExpressionParen
    | vfrExpressionBuildInFunction
    | vfrExpressionConstant
    | vfrExpressionUnaryOp
    | vfrExpressionTernaryOp
    | vfrExpressionMap
    | ( Not atomTerm )
    ;

vfrExpressionCatenate
    : Catenate LParen vfrStatementExpression Comma vfrStatementExpression RParen
    ;

vfrExpressionMatch
    : Match
    LParen vfrStatementExpression Comma vfrStatementExpression RParen
    ;

vfrExpressionParen
    : LParen vfrStatementExpression RParen
    ;

vfrExpressionBuildInFunction
    : dupExp
    | ideqvalExp
    | ideqidExp
    | ideqvallistExp
    | questionref1Exp
    | rulerefExp
    | stringref1Exp
    | pushthisExp
    | securityExp
    | getExp
    ;
      
dupExp : Dup ;

vfrQuestionDataFieldName : StringIdentifier;

ideqvalExp
    : Ideqval
    vfrQuestionDataFieldName EqualsEquals Number
    ;
                                  
ideqidExp
    : Ideqid
    vfrQuestionDataFieldName EqualsEquals vfrQuestionDataFieldName
    ;

ideqvallistExp
    : Ideqvallist
    vfrQuestionDataFieldName EqualsEquals ( Number )+
    ;

questionref1Exp
    : Questionref 
    LParen StringIdentifier | Number RParen
    ;

rulerefExp
    : Ruleref LParen StringIdentifier RParen
    ;

stringref1Exp
    : Stringref LParen getStringId RParen
    ;

pushthisExp : Pushthis ;

securityExp : Security LParen guidDefinition RParen ;

getExp
    : Get LParen vfrStorageVarId OrBitwise? Flags? Equals? vfrNumericFlags? RParen
    ;

questionheaderFlagsField
    : ReadOnly
    | Interactive
    | ResetRequired
    | OptionsOnly
    ;

vfrExpressionConstant
    : TRUE
    | FALSE
    | ONE
    | ONES
    | ZERO
    | UNDEFINED
    | VERSION
    | Number
    ;

vfrExpressionUnaryOp
    : lengthExp
    | bitwisenotExp
    | question23refExp
    | stringref2Exp
    | toboolExp
    | tostringExp
    | unintExp
    | toupperExp
    | tolwerExp
    | setExp
    ;

lengthExp
    : Length LParen vfrStatementExpression RParen
    ;

bitwisenotExp
    : NotBitwise LParen vfrStatementExpression RParen
    ;

question23refExp
    : Questionrefval
    LParen
    (
    DevicePath Equals StringToken BackSlash LParen S Number BackSlash RParen Comma
    )?
    (
    Uuid Equals guidDefinition Comma
    )?
    vfrStatementExpression
    RParen
    ;

stringref2Exp
    : Stringrefval LParen vfrStatementExpression RParen
    ;

toboolExp
    : Boolval LParen vfrStatementExpression RParen
    ;

tostringExp
    : Stringval Format? Equals? Number? Comma?
    LParen vfrStatementExpression RParen
    ;

unintExp
    : Unintval LParen vfrStatementExpression RParen
    ;

toupperExp
    : Toupper LParen vfrStatementExpression RParen
    ;

tolwerExp
    : Tolower LParen vfrStatementExpression RParen
    ;

setExp
    : Set
    LParen
    vfrStorageVarId OrBitwise? Flags? Equals? vfrNumericFlags? Comma
    vfrStatementExpression
    RParen
    ;

vfrStorageVarId
    : ( StringIdentifier LBracket Number RBracket )
    |
    (
    StringIdentifier
        (
        Period StringIdentifier ( LBracket Number RBracket )?
        )*
    )
    ;

vfrExpressionTernaryOp
    : conditionalExp
    | findExp
    | midExp
    | tokenExp
    | spanExp
    ;

conditionalExp
    : Cond
    LParen
    vfrStatementExpression
    QuestionMark
    vfrStatementExpression
    Colon
    vfrStatementExpression
    RParen
    ;

findExp
    : Find
    LParen
    findFormat ( OrBitwise findFormat )*
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    RParen
    ;

findFormat
    : Sensitive
    | Insensitive
    ;

midExp
    : Mid
    LParen
    vfrStatementExpression
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    RParen
    ;

tokenExp
    : Token
    LParen
    vfrStatementExpression
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    RParen
    ;

spanExp
    : Span
    LParen
    Flags Equals spanFlags ( OrBitwise spanFlags )*
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    Comma
    vfrStatementExpression
    RParen
    ;

spanFlags
    : Number
    | LastNonMatch
    | FirstNonMatch
    ;

vfrExpressionMap
    : Map
    LParen
    vfrStatementExpression
    Colon
    (
    vfrStatementExpression
    Comma
    vfrStatementExpression
    Comma
    )*
    RParen
    ;

guidSubDefinition
    : Hex2 Comma Hex2 Comma Hex2 Comma Hex2 Comma Hex2 Comma
    Hex2 Comma Hex2 Comma Hex2
    ;

guidDefinition
    : LBrace
    Hex8 Comma Hex4 Comma Hex4 Comma
    (
    LBrace guidSubDefinition RBrace
    | guidSubDefinition
    )
    RBrace
    ;

// lexer rules
Form : 'form' ;
EndForm : 'endform' ;
FormId : 'formid' ;
Title : 'title' ;
Rule : 'rule' ;
EndRule : 'endrule' ;
Catenate : 'catenate' ;
Match : 'match' ;
Dup : 'dup' ;
Ideqval : 'ideqval' ;
Ideqid : 'ideqid' ;
Ideqvallist : 'ideqvallist' ;
Questionref : 'questionref' ;
Ruleref : 'ruleref' ;
Stringref : 'stringref' ;
Pushthis : 'pushthis' ;
Security : 'security' ;
Get : 'get' ;
Flags : 'flags' ;
Length : 'length' ;
Questionrefval : 'questionrefval' ;
StringToken : 'STRING_TOKEN' ;
Stringrefval : 'stringrefval' ;
Boolval : 'boolval' ;
Stringval : 'stringval' ;
Unintval : 'unintval' ;
Toupper : 'toupper' ;
Tolower : 'tolower' ;
Set : 'set' ;
Cond : 'cond' ;
Find : 'find' ;
Sensitive : 'SENSITIVE' ;
Insensitive : 'INSENSITIVE' ;
Mid : 'mid' ;
Token : 'token' ;
Span : 'span' ;
Map : 'map' ;
FirstNonMatch : 'FIRST_NON_MATCH' ;
LastNonMatch : 'LAST_NON_MATCH' ;
Image : 'image' ;
ImageToken : 'IMAGE_TOKEN' ;
Locked : 'locked' ;
Format : 'format' ;
Uuid : 'Uuid' ;
DevicePath : 'DevicePath' ;
S : 'S:' ;
Default : 'default' ;
DefaultStore : 'defaultstore' | 'defaultStore' ;
Value : 'value' ;
Year : 'year' ;
Help : 'help' ;
Month : 'month' ;
Prompt : 'prompt' ;
Varid : 'varid' ;
EndDate : 'enddate' ;
Minimum : 'minimum' ;
Maximum : 'maximum' ;
Step : 'step' ;
Date : 'date' ;
Name : 'name' ;
QuestionId : 'questionid' ;
EndIf : 'endif' ;
InconsistentIf : 'inconsistentif' ;
SuppressIf : 'suppressif' ;
Read : 'read' ;
Write : 'write' ;
Option : 'option' ;
Text : 'text' ;
NoSubmitIf : 'nosubmitif' ;
DisableIf : 'disableif' ;
Refresh : 'refresh' ;
Interval : 'interval' ;
VarStoreDevice : 'varstoredevice' ;
RefreshGuid : 'refreshguid' ;
Checkbox : 'checkbox' ;
EndCheckbox : 'endcheckbox' ;
Key : 'key' ;
Action : 'action' ;
EndAction : 'endaction' ;
Config : 'config' ;
Subtitle : 'subtitle' ;
Horizontal : 'HORIZONTAL' ;
ResetButton : 'resetbutton' ;
EndResetButton : 'endresetbutton' ;
Goto : 'goto' ;
FormsetGuid : 'formsetguid' ;
Question : 'question' ;
Numeric : 'numeric' ;
Endnumeric : 'endnumeric' ;
Oneof : 'oneof' ;
EndOneof : 'endoneof' ;
Day : 'day' ;
Hour : 'hour' ;
Minute : 'minute' ;
Second : 'second' ;
Time : 'time' ;
Endtime : 'endtime' ;
MultiLine : 'MULTI_LINE' ;
String : 'string' ;
EndString : 'endstring' ;
MinSize : 'minsize' ;
MaxSize : 'maxsize' ;
Password : 'password' ;
Endpassword : 'endpassword' ;
Orderedlist : 'orderedlist' ;
Endlist : 'endlist' ;
Maxcontainers : 'maxcontainers' ;
Unique : 'UNIQUE' ;
Noempty : 'NOEMPTY' ;
GrayoutIf : 'grayoutif' ;
Label : 'label' ;
Banner : 'banner' ;
Line : 'line' ;
Align : 'align' ;
Left : 'left' ;
Right : 'right' ;
Center : 'center' ;
Timeout : 'timeout' ;
Guidop : 'guidop' ;
EndGuidop : 'endguidop' ;
Guid : 'guid' ;
Data : 'data' ;
Datatype : 'datatype' ;
Modal : 'modal' ;

// expressions
Or : 'OR' ;
And : 'AND' ;
Not : 'NOT' ;

// punctuation
Equals : '=' ;
EqualsEquals : '==' ;
NotEquals : '!=' ;
Comma : ',' ;
SemiColon : ';' ;
OrBitwise : '|' ;
AndBitwise : '&' ;
NotBitwise : '~' ;
LessThan : '<' ;
LessThanEquals : '<=' ;
GreaterThan : '>' ;
GreaterThanEquals : '>=' ;
ShiftLeft : '<<' ;
ShiftRight : '>>' ;
Plus : '+' ;
Minus : '-' ;
Multiply : '*' ;
Divide : '/' ;
Modulus : '%' ;
LParen : '(' ;
RParen : ')' ;
LBrace : '{' ;
RBrace : '}' ;
QuestionMark : '?' ;
Colon : ':' ;
Period : '.' ;
LBracket : '[' ;
RBracket : ']' ;
BackSlash : '\\' ;

// types
BOOLEAN : 'BOOLEAN' ;
UINT64 : 'UINT64' ;
UINT32 : 'UINT32' ;
UINT16 : 'UINT16' ;
UINT8 : 'UINT8' ;

// constants
TRUE : 'TRUE' ;
FALSE : 'FALSE' ;
ONE : 'ONE' ;
ONES : 'ONES' ;
ZERO : 'ZERO' ;
UNDEFINED : 'UNDEFINED' ;
VERSION : 'VERSION' ;

// number and string
Number
    : ('0x'[0-9A-Fa-f]+) | [0-9]+
    ;
StringIdentifier
    : [A-Za-z_] [A-Za-z_0-9]*
    ;
Hex8 : '0x'[0-9A-fa-f] ;
Hex4 : '0x'[0-9A-fa-f] ;
Hex2 : '0x'[0-9A-fa-f] ;

// flags
NumSize1 : 'NUMERIC_SIZE_1' ;
NumSize2 : 'NUMERIC_SIZE_2' ;
NumSize4 : 'NUMERIC_SIZE_4' ;
NumSize8 : 'NUMERIC_SIZE_8' ;
DispIntDec : 'DISPLAY_INT_DEC' ;
DispUintDec : 'DISPLAY_UINT_DEC' ;
DispUintHex : 'DISPLAY_UINT_HEX' ;
ReadOnly : 'READ_ONLY' ;
Interactive : 'INTERACTIVE' ;
ResetRequired : 'RESET_REQUIRED' ;
OptionsOnly : 'OPTIONS_ONLY' ;
YearSuppress : 'YEAR_SUPPRESS' ;
MonthSuppress : 'MONTH_SUPPRESS' ;
DaySuppress : 'DAY_SUPPRESS' ;
StorageNormal : 'STORAGE_NORMAL' ;
StorageTime : 'STORAGE_TIME' ;
StorageWakeup : 'STORAGE_WAKEUP' ;
OptionDefault : 'OPTION_DEFAULT' ;
OptionDefaultMfg : 'OPTION_DEFAULT_MFG' ;
CheckboxDefault : 'CHECKBOX_DEFAULT' ;
CheckboxDefaultMfg : 'CHECKBOX_DEFAULT_MFG' ;
HourSuppress : 'HOUR_SUPPRESS' ;
MinuteSuppress : 'MINUTE_SUPPRESS' ;
SecondSuppress : 'SECOND_SUPPRESS' ;
EfiStringId : 'EFI_STRING_ID' ;
EfiHiiDate : 'EFI_HII_DATE' ;
EfiHiiTime : 'EFI_HII_TIME' ;
EfiHiiRef : 'EFI_HII_REF' ;

// whitespace
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;