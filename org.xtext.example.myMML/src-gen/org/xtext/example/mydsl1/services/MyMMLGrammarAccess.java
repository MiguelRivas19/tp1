/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyMMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MMLGeneratorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.MMLGenerator");
		private final Assignment cInstructionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInstructionsInstructionParserRuleCall_0 = (RuleCall)cInstructionsAssignment.eContents().get(0);
		
		//MMLGenerator:
		//	instructions+=Instruction+;
		@Override public ParserRule getRule() { return rule; }
		
		//instructions+=Instruction+
		public Assignment getInstructionsAssignment() { return cInstructionsAssignment; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_0() { return cInstructionsInstructionParserRuleCall_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.Instruction");
		private final RuleCall cPutInParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Instruction:
		//	PutIn;
		@Override public ParserRule getRule() { return rule; }
		
		//PutIn
		public RuleCall getPutInParserRuleCall() { return cPutInParserRuleCall; }
	}
	public class PutInElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.PutIn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPutInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPutIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPutIdIDTerminalRuleCall_1_0 = (RuleCall)cPutIdAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueElementParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//PutIn:
		//	'putIn' putId=ID value=Element;
		@Override public ParserRule getRule() { return rule; }
		
		//'putIn' putId=ID value=Element
		public Group getGroup() { return cGroup; }
		
		//'putIn'
		public Keyword getPutInKeyword_0() { return cPutInKeyword_0; }
		
		//putId=ID
		public Assignment getPutIdAssignment_1() { return cPutIdAssignment_1; }
		
		//ID
		public RuleCall getPutIdIDTerminalRuleCall_1_0() { return cPutIdIDTerminalRuleCall_1_0; }
		
		//value=Element
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Element
		public RuleCall getValueElementParserRuleCall_2_0() { return cValueElementParserRuleCall_2_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFileSetParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPredictiveColumnsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCibleColumnParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTestValueSizeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTrainValueSizeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cAlgorithmSetParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Element:
		//	FileSet | PredictiveColumns | CibleColumn | TestValueSize | TrainValueSize | AlgorithmSet;
		@Override public ParserRule getRule() { return rule; }
		
		//FileSet | PredictiveColumns | CibleColumn | TestValueSize | TrainValueSize | AlgorithmSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FileSet
		public RuleCall getFileSetParserRuleCall_0() { return cFileSetParserRuleCall_0; }
		
		//PredictiveColumns
		public RuleCall getPredictiveColumnsParserRuleCall_1() { return cPredictiveColumnsParserRuleCall_1; }
		
		//CibleColumn
		public RuleCall getCibleColumnParserRuleCall_2() { return cCibleColumnParserRuleCall_2; }
		
		//TestValueSize
		public RuleCall getTestValueSizeParserRuleCall_3() { return cTestValueSizeParserRuleCall_3; }
		
		//TrainValueSize
		public RuleCall getTrainValueSizeParserRuleCall_4() { return cTrainValueSizeParserRuleCall_4; }
		
		//AlgorithmSet
		public RuleCall getAlgorithmSetParserRuleCall_5() { return cAlgorithmSetParserRuleCall_5; }
	}
	public class FileSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.FileSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFileSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FileSet:
		//	'fileSet' '<' text=STRING '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'fileSet' '<' text=STRING '>'
		public Group getGroup() { return cGroup; }
		
		//'fileSet'
		public Keyword getFileSetKeyword_0() { return cFileSetKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class PredictiveColumnsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.PredictiveColumns");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPredictiveColumnsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cColumnAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cColumnSTRINGTerminalRuleCall_2_0 = (RuleCall)cColumnAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//PredictiveColumns:
		//	'predictiveColumns' '<' column=STRING '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'predictiveColumns' '<' column=STRING '>'
		public Group getGroup() { return cGroup; }
		
		//'predictiveColumns'
		public Keyword getPredictiveColumnsKeyword_0() { return cPredictiveColumnsKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//column=STRING
		public Assignment getColumnAssignment_2() { return cColumnAssignment_2; }
		
		//STRING
		public RuleCall getColumnSTRINGTerminalRuleCall_2_0() { return cColumnSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class CibleColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.CibleColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCibleColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cColumnAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cColumnSTRINGTerminalRuleCall_2_0 = (RuleCall)cColumnAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CibleColumn:
		//	'CibleColumn' '<' column=STRING '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'CibleColumn' '<' column=STRING '>'
		public Group getGroup() { return cGroup; }
		
		//'CibleColumn'
		public Keyword getCibleColumnKeyword_0() { return cCibleColumnKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//column=STRING
		public Assignment getColumnAssignment_2() { return cColumnAssignment_2; }
		
		//STRING
		public RuleCall getColumnSTRINGTerminalRuleCall_2_0() { return cColumnSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class TestValueSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.TestValueSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestValueSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSizeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSizeINTTerminalRuleCall_2_0 = (RuleCall)cSizeAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TestValueSize:
		//	'testValueSize' '<' size=INT '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'testValueSize' '<' size=INT '>'
		public Group getGroup() { return cGroup; }
		
		//'testValueSize'
		public Keyword getTestValueSizeKeyword_0() { return cTestValueSizeKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//size=INT
		public Assignment getSizeAssignment_2() { return cSizeAssignment_2; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_2_0() { return cSizeINTTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class TrainValueSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.TrainValueSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTrainValueSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSizeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSizeINTTerminalRuleCall_2_0 = (RuleCall)cSizeAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TrainValueSize:
		//	'trainValueSize' '<' size=INT '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'trainValueSize' '<' size=INT '>'
		public Group getGroup() { return cGroup; }
		
		//'trainValueSize'
		public Keyword getTrainValueSizeKeyword_0() { return cTrainValueSizeKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//size=INT
		public Assignment getSizeAssignment_2() { return cSizeAssignment_2; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_2_0() { return cSizeINTTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class AlgorithmSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.AlgorithmSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlgorithmSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAlgoNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAlgoNameAlgoEnumRuleCall_2_0 = (RuleCall)cAlgoNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AlgorithmSet:
		//	'algorithmSet' '<' algoName=Algo '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'algorithmSet' '<' algoName=Algo '>'
		public Group getGroup() { return cGroup; }
		
		//'algorithmSet'
		public Keyword getAlgorithmSetKeyword_0() { return cAlgorithmSetKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//algoName=Algo
		public Assignment getAlgoNameAssignment_2() { return cAlgoNameAssignment_2; }
		
		//Algo
		public RuleCall getAlgoNameAlgoEnumRuleCall_2_0() { return cAlgoNameAlgoEnumRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	
	public class AlgoElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyMML.Algo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDecisionTreeClassifierEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDecisionTreeClassifierDecisionTreeClassifierKeyword_0_0 = (Keyword)cDecisionTreeClassifierEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSVMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSVMSVMKeyword_1_0 = (Keyword)cSVMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cJ48EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cJ48J48Keyword_2_0 = (Keyword)cJ48EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cNaiveBayesEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cNaiveBayesNaiveBayesKeyword_3_0 = (Keyword)cNaiveBayesEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Algo:
		//	DecisionTreeClassifier | SVM | J48 | NaiveBayes;
		public EnumRule getRule() { return rule; }
		
		//DecisionTreeClassifier | SVM | J48 | NaiveBayes
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DecisionTreeClassifier
		public EnumLiteralDeclaration getDecisionTreeClassifierEnumLiteralDeclaration_0() { return cDecisionTreeClassifierEnumLiteralDeclaration_0; }
		
		//'DecisionTreeClassifier'
		public Keyword getDecisionTreeClassifierDecisionTreeClassifierKeyword_0_0() { return cDecisionTreeClassifierDecisionTreeClassifierKeyword_0_0; }
		
		//SVM
		public EnumLiteralDeclaration getSVMEnumLiteralDeclaration_1() { return cSVMEnumLiteralDeclaration_1; }
		
		//'SVM'
		public Keyword getSVMSVMKeyword_1_0() { return cSVMSVMKeyword_1_0; }
		
		//J48
		public EnumLiteralDeclaration getJ48EnumLiteralDeclaration_2() { return cJ48EnumLiteralDeclaration_2; }
		
		//'J48'
		public Keyword getJ48J48Keyword_2_0() { return cJ48J48Keyword_2_0; }
		
		//NaiveBayes
		public EnumLiteralDeclaration getNaiveBayesEnumLiteralDeclaration_3() { return cNaiveBayesEnumLiteralDeclaration_3; }
		
		//'NaiveBayes'
		public Keyword getNaiveBayesNaiveBayesKeyword_3_0() { return cNaiveBayesNaiveBayesKeyword_3_0; }
	}
	
	private final MMLGeneratorElements pMMLGenerator;
	private final InstructionElements pInstruction;
	private final PutInElements pPutIn;
	private final ElementElements pElement;
	private final FileSetElements pFileSet;
	private final PredictiveColumnsElements pPredictiveColumns;
	private final CibleColumnElements pCibleColumn;
	private final TestValueSizeElements pTestValueSize;
	private final TrainValueSizeElements pTrainValueSize;
	private final AlgorithmSetElements pAlgorithmSet;
	private final AlgoElements eAlgo;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyMMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMLGenerator = new MMLGeneratorElements();
		this.pInstruction = new InstructionElements();
		this.pPutIn = new PutInElements();
		this.pElement = new ElementElements();
		this.pFileSet = new FileSetElements();
		this.pPredictiveColumns = new PredictiveColumnsElements();
		this.pCibleColumn = new CibleColumnElements();
		this.pTestValueSize = new TestValueSizeElements();
		this.pTrainValueSize = new TrainValueSizeElements();
		this.pAlgorithmSet = new AlgorithmSetElements();
		this.eAlgo = new AlgoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl1.MyMML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MMLGenerator:
	//	instructions+=Instruction+;
	public MMLGeneratorElements getMMLGeneratorAccess() {
		return pMMLGenerator;
	}
	
	public ParserRule getMMLGeneratorRule() {
		return getMMLGeneratorAccess().getRule();
	}
	
	//Instruction:
	//	PutIn;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//PutIn:
	//	'putIn' putId=ID value=Element;
	public PutInElements getPutInAccess() {
		return pPutIn;
	}
	
	public ParserRule getPutInRule() {
		return getPutInAccess().getRule();
	}
	
	//Element:
	//	FileSet | PredictiveColumns | CibleColumn | TestValueSize | TrainValueSize | AlgorithmSet;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//FileSet:
	//	'fileSet' '<' text=STRING '>';
	public FileSetElements getFileSetAccess() {
		return pFileSet;
	}
	
	public ParserRule getFileSetRule() {
		return getFileSetAccess().getRule();
	}
	
	//PredictiveColumns:
	//	'predictiveColumns' '<' column=STRING '>';
	public PredictiveColumnsElements getPredictiveColumnsAccess() {
		return pPredictiveColumns;
	}
	
	public ParserRule getPredictiveColumnsRule() {
		return getPredictiveColumnsAccess().getRule();
	}
	
	//CibleColumn:
	//	'CibleColumn' '<' column=STRING '>';
	public CibleColumnElements getCibleColumnAccess() {
		return pCibleColumn;
	}
	
	public ParserRule getCibleColumnRule() {
		return getCibleColumnAccess().getRule();
	}
	
	//TestValueSize:
	//	'testValueSize' '<' size=INT '>';
	public TestValueSizeElements getTestValueSizeAccess() {
		return pTestValueSize;
	}
	
	public ParserRule getTestValueSizeRule() {
		return getTestValueSizeAccess().getRule();
	}
	
	//TrainValueSize:
	//	'trainValueSize' '<' size=INT '>';
	public TrainValueSizeElements getTrainValueSizeAccess() {
		return pTrainValueSize;
	}
	
	public ParserRule getTrainValueSizeRule() {
		return getTrainValueSizeAccess().getRule();
	}
	
	//AlgorithmSet:
	//	'algorithmSet' '<' algoName=Algo '>';
	public AlgorithmSetElements getAlgorithmSetAccess() {
		return pAlgorithmSet;
	}
	
	public ParserRule getAlgorithmSetRule() {
		return getAlgorithmSetAccess().getRule();
	}
	
	//enum Algo:
	//	DecisionTreeClassifier | SVM | J48 | NaiveBayes;
	public AlgoElements getAlgoAccess() {
		return eAlgo;
	}
	
	public EnumRule getAlgoRule() {
		return getAlgoAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
