package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyMMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyMMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'strategySet'", "'ResultDisplayParamsSet'", "'putIn'", "'fileSet'", "'<'", "'>'", "'predictiveColumns'", "'CibleColumn'", "'testValueSize'", "'trainValueSize'", "'algorithmSet'", "'DecisionTreeClassifier'", "'SVM'", "'J48'", "'NaiveBayes'", "'TrainingTest'", "'CrossValidation'", "'Precision'", "'Recall'", "'f1'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyMMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyMMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyMMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyMML.g"; }



     	private MyMMLGrammarAccess grammarAccess;

        public InternalMyMMLParser(TokenStream input, MyMMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MMLGenerator";
       	}

       	@Override
       	protected MyMMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMMLGenerator"
    // InternalMyMML.g:65:1: entryRuleMMLGenerator returns [EObject current=null] : iv_ruleMMLGenerator= ruleMMLGenerator EOF ;
    public final EObject entryRuleMMLGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMLGenerator = null;


        try {
            // InternalMyMML.g:65:53: (iv_ruleMMLGenerator= ruleMMLGenerator EOF )
            // InternalMyMML.g:66:2: iv_ruleMMLGenerator= ruleMMLGenerator EOF
            {
             newCompositeNode(grammarAccess.getMMLGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMMLGenerator=ruleMMLGenerator();

            state._fsp--;

             current =iv_ruleMMLGenerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMMLGenerator"


    // $ANTLR start "ruleMMLGenerator"
    // InternalMyMML.g:72:1: ruleMMLGenerator returns [EObject current=null] : ( ( (lv_strategySet_0_0= ruleStrategySet ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) ) ) ;
    public final EObject ruleMMLGenerator() throws RecognitionException {
        EObject current = null;

        EObject lv_strategySet_0_0 = null;

        EObject lv_instructions_1_0 = null;

        EObject lv_resultDisplayParamsSet_2_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:78:2: ( ( ( (lv_strategySet_0_0= ruleStrategySet ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) ) ) )
            // InternalMyMML.g:79:2: ( ( (lv_strategySet_0_0= ruleStrategySet ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) ) )
            {
            // InternalMyMML.g:79:2: ( ( (lv_strategySet_0_0= ruleStrategySet ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) ) )
            // InternalMyMML.g:80:3: ( (lv_strategySet_0_0= ruleStrategySet ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) )
            {
            // InternalMyMML.g:80:3: ( (lv_strategySet_0_0= ruleStrategySet ) )
            // InternalMyMML.g:81:4: (lv_strategySet_0_0= ruleStrategySet )
            {
            // InternalMyMML.g:81:4: (lv_strategySet_0_0= ruleStrategySet )
            // InternalMyMML.g:82:5: lv_strategySet_0_0= ruleStrategySet
            {

            					newCompositeNode(grammarAccess.getMMLGeneratorAccess().getStrategySetStrategySetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_strategySet_0_0=ruleStrategySet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLGeneratorRule());
            					}
            					set(
            						current,
            						"strategySet",
            						lv_strategySet_0_0,
            						"org.xtext.example.mydsl1.MyMML.StrategySet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyMML.g:99:3: ( (lv_instructions_1_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyMML.g:100:4: (lv_instructions_1_0= ruleInstruction )
            	    {
            	    // InternalMyMML.g:100:4: (lv_instructions_1_0= ruleInstruction )
            	    // InternalMyMML.g:101:5: lv_instructions_1_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getMMLGeneratorAccess().getInstructionsInstructionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_1_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMMLGeneratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_1_0,
            	    						"org.xtext.example.mydsl1.MyMML.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyMML.g:118:3: ( (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet ) )
            // InternalMyMML.g:119:4: (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet )
            {
            // InternalMyMML.g:119:4: (lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet )
            // InternalMyMML.g:120:5: lv_resultDisplayParamsSet_2_0= ruleResultDisplayParamsSet
            {

            					newCompositeNode(grammarAccess.getMMLGeneratorAccess().getResultDisplayParamsSetResultDisplayParamsSetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_resultDisplayParamsSet_2_0=ruleResultDisplayParamsSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLGeneratorRule());
            					}
            					set(
            						current,
            						"resultDisplayParamsSet",
            						lv_resultDisplayParamsSet_2_0,
            						"org.xtext.example.mydsl1.MyMML.ResultDisplayParamsSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMLGenerator"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyMML.g:141:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyMML.g:141:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyMML.g:142:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyMML.g:148:1: ruleInstruction returns [EObject current=null] : this_PutIn_0= rulePutIn ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_PutIn_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:154:2: (this_PutIn_0= rulePutIn )
            // InternalMyMML.g:155:2: this_PutIn_0= rulePutIn
            {

            		newCompositeNode(grammarAccess.getInstructionAccess().getPutInParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PutIn_0=rulePutIn();

            state._fsp--;


            		current = this_PutIn_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleStrategySet"
    // InternalMyMML.g:166:1: entryRuleStrategySet returns [EObject current=null] : iv_ruleStrategySet= ruleStrategySet EOF ;
    public final EObject entryRuleStrategySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategySet = null;


        try {
            // InternalMyMML.g:166:52: (iv_ruleStrategySet= ruleStrategySet EOF )
            // InternalMyMML.g:167:2: iv_ruleStrategySet= ruleStrategySet EOF
            {
             newCompositeNode(grammarAccess.getStrategySetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategySet=ruleStrategySet();

            state._fsp--;

             current =iv_ruleStrategySet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategySet"


    // $ANTLR start "ruleStrategySet"
    // InternalMyMML.g:173:1: ruleStrategySet returns [EObject current=null] : (otherlv_0= 'strategySet' ( (lv_strategy_1_0= ruleStrategy ) ) ) ;
    public final EObject ruleStrategySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_strategy_1_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:179:2: ( (otherlv_0= 'strategySet' ( (lv_strategy_1_0= ruleStrategy ) ) ) )
            // InternalMyMML.g:180:2: (otherlv_0= 'strategySet' ( (lv_strategy_1_0= ruleStrategy ) ) )
            {
            // InternalMyMML.g:180:2: (otherlv_0= 'strategySet' ( (lv_strategy_1_0= ruleStrategy ) ) )
            // InternalMyMML.g:181:3: otherlv_0= 'strategySet' ( (lv_strategy_1_0= ruleStrategy ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategySetAccess().getStrategySetKeyword_0());
            		
            // InternalMyMML.g:185:3: ( (lv_strategy_1_0= ruleStrategy ) )
            // InternalMyMML.g:186:4: (lv_strategy_1_0= ruleStrategy )
            {
            // InternalMyMML.g:186:4: (lv_strategy_1_0= ruleStrategy )
            // InternalMyMML.g:187:5: lv_strategy_1_0= ruleStrategy
            {

            					newCompositeNode(grammarAccess.getStrategySetAccess().getStrategyStrategyEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_strategy_1_0=ruleStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrategySetRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_1_0,
            						"org.xtext.example.mydsl1.MyMML.Strategy");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategySet"


    // $ANTLR start "entryRuleResultDisplayParamsSet"
    // InternalMyMML.g:208:1: entryRuleResultDisplayParamsSet returns [EObject current=null] : iv_ruleResultDisplayParamsSet= ruleResultDisplayParamsSet EOF ;
    public final EObject entryRuleResultDisplayParamsSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultDisplayParamsSet = null;


        try {
            // InternalMyMML.g:208:63: (iv_ruleResultDisplayParamsSet= ruleResultDisplayParamsSet EOF )
            // InternalMyMML.g:209:2: iv_ruleResultDisplayParamsSet= ruleResultDisplayParamsSet EOF
            {
             newCompositeNode(grammarAccess.getResultDisplayParamsSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultDisplayParamsSet=ruleResultDisplayParamsSet();

            state._fsp--;

             current =iv_ruleResultDisplayParamsSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultDisplayParamsSet"


    // $ANTLR start "ruleResultDisplayParamsSet"
    // InternalMyMML.g:215:1: ruleResultDisplayParamsSet returns [EObject current=null] : (otherlv_0= 'ResultDisplayParamsSet' ( (lv_params_1_0= ruleDisplayParams ) )+ ) ;
    public final EObject ruleResultDisplayParamsSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:221:2: ( (otherlv_0= 'ResultDisplayParamsSet' ( (lv_params_1_0= ruleDisplayParams ) )+ ) )
            // InternalMyMML.g:222:2: (otherlv_0= 'ResultDisplayParamsSet' ( (lv_params_1_0= ruleDisplayParams ) )+ )
            {
            // InternalMyMML.g:222:2: (otherlv_0= 'ResultDisplayParamsSet' ( (lv_params_1_0= ruleDisplayParams ) )+ )
            // InternalMyMML.g:223:3: otherlv_0= 'ResultDisplayParamsSet' ( (lv_params_1_0= ruleDisplayParams ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getResultDisplayParamsSetAccess().getResultDisplayParamsSetKeyword_0());
            		
            // InternalMyMML.g:227:3: ( (lv_params_1_0= ruleDisplayParams ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=28 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyMML.g:228:4: (lv_params_1_0= ruleDisplayParams )
            	    {
            	    // InternalMyMML.g:228:4: (lv_params_1_0= ruleDisplayParams )
            	    // InternalMyMML.g:229:5: lv_params_1_0= ruleDisplayParams
            	    {

            	    					newCompositeNode(grammarAccess.getResultDisplayParamsSetAccess().getParamsDisplayParamsEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_params_1_0=ruleDisplayParams();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResultDisplayParamsSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_1_0,
            	    						"org.xtext.example.mydsl1.MyMML.DisplayParams");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultDisplayParamsSet"


    // $ANTLR start "entryRulePutIn"
    // InternalMyMML.g:250:1: entryRulePutIn returns [EObject current=null] : iv_rulePutIn= rulePutIn EOF ;
    public final EObject entryRulePutIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutIn = null;


        try {
            // InternalMyMML.g:250:46: (iv_rulePutIn= rulePutIn EOF )
            // InternalMyMML.g:251:2: iv_rulePutIn= rulePutIn EOF
            {
             newCompositeNode(grammarAccess.getPutInRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePutIn=rulePutIn();

            state._fsp--;

             current =iv_rulePutIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutIn"


    // $ANTLR start "rulePutIn"
    // InternalMyMML.g:257:1: rulePutIn returns [EObject current=null] : (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) ) ;
    public final EObject rulePutIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_putId_1_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:263:2: ( (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) ) )
            // InternalMyMML.g:264:2: (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) )
            {
            // InternalMyMML.g:264:2: (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) )
            // InternalMyMML.g:265:3: otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPutInAccess().getPutInKeyword_0());
            		
            // InternalMyMML.g:269:3: ( (lv_putId_1_0= RULE_ID ) )
            // InternalMyMML.g:270:4: (lv_putId_1_0= RULE_ID )
            {
            // InternalMyMML.g:270:4: (lv_putId_1_0= RULE_ID )
            // InternalMyMML.g:271:5: lv_putId_1_0= RULE_ID
            {
            lv_putId_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_putId_1_0, grammarAccess.getPutInAccess().getPutIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPutInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"putId",
            						lv_putId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyMML.g:287:3: ( (lv_value_2_0= ruleElement ) )
            // InternalMyMML.g:288:4: (lv_value_2_0= ruleElement )
            {
            // InternalMyMML.g:288:4: (lv_value_2_0= ruleElement )
            // InternalMyMML.g:289:5: lv_value_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getPutInAccess().getValueElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutInRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl1.MyMML.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutIn"


    // $ANTLR start "entryRuleElement"
    // InternalMyMML.g:310:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyMML.g:310:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyMML.g:311:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyMML.g:317:1: ruleElement returns [EObject current=null] : (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_FileSet_0 = null;

        EObject this_PredictiveColumns_1 = null;

        EObject this_CibleColumn_2 = null;

        EObject this_TestValueSize_3 = null;

        EObject this_TrainValueSize_4 = null;

        EObject this_AlgorithmSet_5 = null;



        	enterRule();

        try {
            // InternalMyMML.g:323:2: ( (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet ) )
            // InternalMyMML.g:324:2: (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet )
            {
            // InternalMyMML.g:324:2: (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyMML.g:325:3: this_FileSet_0= ruleFileSet
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFileSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileSet_0=ruleFileSet();

                    state._fsp--;


                    			current = this_FileSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyMML.g:334:3: this_PredictiveColumns_1= rulePredictiveColumns
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPredictiveColumnsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredictiveColumns_1=rulePredictiveColumns();

                    state._fsp--;


                    			current = this_PredictiveColumns_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyMML.g:343:3: this_CibleColumn_2= ruleCibleColumn
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCibleColumnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CibleColumn_2=ruleCibleColumn();

                    state._fsp--;


                    			current = this_CibleColumn_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyMML.g:352:3: this_TestValueSize_3= ruleTestValueSize
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTestValueSizeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestValueSize_3=ruleTestValueSize();

                    state._fsp--;


                    			current = this_TestValueSize_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyMML.g:361:3: this_TrainValueSize_4= ruleTrainValueSize
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTrainValueSizeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrainValueSize_4=ruleTrainValueSize();

                    state._fsp--;


                    			current = this_TrainValueSize_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyMML.g:370:3: this_AlgorithmSet_5= ruleAlgorithmSet
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAlgorithmSetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlgorithmSet_5=ruleAlgorithmSet();

                    state._fsp--;


                    			current = this_AlgorithmSet_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFileSet"
    // InternalMyMML.g:382:1: entryRuleFileSet returns [EObject current=null] : iv_ruleFileSet= ruleFileSet EOF ;
    public final EObject entryRuleFileSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSet = null;


        try {
            // InternalMyMML.g:382:48: (iv_ruleFileSet= ruleFileSet EOF )
            // InternalMyMML.g:383:2: iv_ruleFileSet= ruleFileSet EOF
            {
             newCompositeNode(grammarAccess.getFileSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileSet=ruleFileSet();

            state._fsp--;

             current =iv_ruleFileSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileSet"


    // $ANTLR start "ruleFileSet"
    // InternalMyMML.g:389:1: ruleFileSet returns [EObject current=null] : (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleFileSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:395:2: ( (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:396:2: (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:396:2: (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:397:3: otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFileSetAccess().getFileSetKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFileSetAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:405:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalMyMML.g:406:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalMyMML.g:406:4: (lv_text_2_0= RULE_STRING )
            // InternalMyMML.g:407:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_2_0, grammarAccess.getFileSetAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFileSetAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileSet"


    // $ANTLR start "entryRulePredictiveColumns"
    // InternalMyMML.g:431:1: entryRulePredictiveColumns returns [EObject current=null] : iv_rulePredictiveColumns= rulePredictiveColumns EOF ;
    public final EObject entryRulePredictiveColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictiveColumns = null;


        try {
            // InternalMyMML.g:431:58: (iv_rulePredictiveColumns= rulePredictiveColumns EOF )
            // InternalMyMML.g:432:2: iv_rulePredictiveColumns= rulePredictiveColumns EOF
            {
             newCompositeNode(grammarAccess.getPredictiveColumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictiveColumns=rulePredictiveColumns();

            state._fsp--;

             current =iv_rulePredictiveColumns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredictiveColumns"


    // $ANTLR start "rulePredictiveColumns"
    // InternalMyMML.g:438:1: rulePredictiveColumns returns [EObject current=null] : (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject rulePredictiveColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:444:2: ( (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:445:2: (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:445:2: (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:446:3: otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictiveColumnsAccess().getPredictiveColumnsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPredictiveColumnsAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:454:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyMML.g:455:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyMML.g:455:4: (lv_column_2_0= RULE_STRING )
            // InternalMyMML.g:456:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_column_2_0, grammarAccess.getPredictiveColumnsAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredictiveColumnsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPredictiveColumnsAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredictiveColumns"


    // $ANTLR start "entryRuleCibleColumn"
    // InternalMyMML.g:480:1: entryRuleCibleColumn returns [EObject current=null] : iv_ruleCibleColumn= ruleCibleColumn EOF ;
    public final EObject entryRuleCibleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCibleColumn = null;


        try {
            // InternalMyMML.g:480:52: (iv_ruleCibleColumn= ruleCibleColumn EOF )
            // InternalMyMML.g:481:2: iv_ruleCibleColumn= ruleCibleColumn EOF
            {
             newCompositeNode(grammarAccess.getCibleColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCibleColumn=ruleCibleColumn();

            state._fsp--;

             current =iv_ruleCibleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCibleColumn"


    // $ANTLR start "ruleCibleColumn"
    // InternalMyMML.g:487:1: ruleCibleColumn returns [EObject current=null] : (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleCibleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:493:2: ( (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:494:2: (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:494:2: (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:495:3: otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCibleColumnAccess().getCibleColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCibleColumnAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:503:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyMML.g:504:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyMML.g:504:4: (lv_column_2_0= RULE_STRING )
            // InternalMyMML.g:505:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_column_2_0, grammarAccess.getCibleColumnAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCibleColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCibleColumnAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCibleColumn"


    // $ANTLR start "entryRuleTestValueSize"
    // InternalMyMML.g:529:1: entryRuleTestValueSize returns [EObject current=null] : iv_ruleTestValueSize= ruleTestValueSize EOF ;
    public final EObject entryRuleTestValueSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestValueSize = null;


        try {
            // InternalMyMML.g:529:54: (iv_ruleTestValueSize= ruleTestValueSize EOF )
            // InternalMyMML.g:530:2: iv_ruleTestValueSize= ruleTestValueSize EOF
            {
             newCompositeNode(grammarAccess.getTestValueSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestValueSize=ruleTestValueSize();

            state._fsp--;

             current =iv_ruleTestValueSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestValueSize"


    // $ANTLR start "ruleTestValueSize"
    // InternalMyMML.g:536:1: ruleTestValueSize returns [EObject current=null] : (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) ;
    public final EObject ruleTestValueSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:542:2: ( (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:543:2: (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:543:2: (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            // InternalMyMML.g:544:3: otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTestValueSizeAccess().getTestValueSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTestValueSizeAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:552:3: ( (lv_size_2_0= RULE_INT ) )
            // InternalMyMML.g:553:4: (lv_size_2_0= RULE_INT )
            {
            // InternalMyMML.g:553:4: (lv_size_2_0= RULE_INT )
            // InternalMyMML.g:554:5: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_size_2_0, grammarAccess.getTestValueSizeAccess().getSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestValueSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTestValueSizeAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestValueSize"


    // $ANTLR start "entryRuleTrainValueSize"
    // InternalMyMML.g:578:1: entryRuleTrainValueSize returns [EObject current=null] : iv_ruleTrainValueSize= ruleTrainValueSize EOF ;
    public final EObject entryRuleTrainValueSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainValueSize = null;


        try {
            // InternalMyMML.g:578:55: (iv_ruleTrainValueSize= ruleTrainValueSize EOF )
            // InternalMyMML.g:579:2: iv_ruleTrainValueSize= ruleTrainValueSize EOF
            {
             newCompositeNode(grammarAccess.getTrainValueSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainValueSize=ruleTrainValueSize();

            state._fsp--;

             current =iv_ruleTrainValueSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainValueSize"


    // $ANTLR start "ruleTrainValueSize"
    // InternalMyMML.g:585:1: ruleTrainValueSize returns [EObject current=null] : (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= '>' ) ) ) ;
    public final EObject ruleTrainValueSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;


        	enterRule();

        try {
            // InternalMyMML.g:591:2: ( (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= '>' ) ) ) )
            // InternalMyMML.g:592:2: (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= '>' ) ) )
            {
            // InternalMyMML.g:592:2: (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= '>' ) ) )
            // InternalMyMML.g:593:3: otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= '>' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainValueSizeAccess().getTrainValueSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainValueSizeAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:601:3: ( (lv_size_2_0= '>' ) )
            // InternalMyMML.g:602:4: (lv_size_2_0= '>' )
            {
            // InternalMyMML.g:602:4: (lv_size_2_0= '>' )
            // InternalMyMML.g:603:5: lv_size_2_0= '>'
            {
            lv_size_2_0=(Token)match(input,16,FOLLOW_2); 

            					newLeafNode(lv_size_2_0, grammarAccess.getTrainValueSizeAccess().getSizeGreaterThanSignKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainValueSizeRule());
            					}
            					setWithLastConsumed(current, "size", lv_size_2_0, ">");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainValueSize"


    // $ANTLR start "entryRuleAlgorithmSet"
    // InternalMyMML.g:619:1: entryRuleAlgorithmSet returns [EObject current=null] : iv_ruleAlgorithmSet= ruleAlgorithmSet EOF ;
    public final EObject entryRuleAlgorithmSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmSet = null;


        try {
            // InternalMyMML.g:619:53: (iv_ruleAlgorithmSet= ruleAlgorithmSet EOF )
            // InternalMyMML.g:620:2: iv_ruleAlgorithmSet= ruleAlgorithmSet EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmSet=ruleAlgorithmSet();

            state._fsp--;

             current =iv_ruleAlgorithmSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithmSet"


    // $ANTLR start "ruleAlgorithmSet"
    // InternalMyMML.g:626:1: ruleAlgorithmSet returns [EObject current=null] : (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' ) ;
    public final EObject ruleAlgorithmSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_algoName_2_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:632:2: ( (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:633:2: (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:633:2: (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' )
            // InternalMyMML.g:634:3: otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmSetAccess().getAlgorithmSetKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmSetAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:642:3: ( (lv_algoName_2_0= ruleAlgo ) )
            // InternalMyMML.g:643:4: (lv_algoName_2_0= ruleAlgo )
            {
            // InternalMyMML.g:643:4: (lv_algoName_2_0= ruleAlgo )
            // InternalMyMML.g:644:5: lv_algoName_2_0= ruleAlgo
            {

            					newCompositeNode(grammarAccess.getAlgorithmSetAccess().getAlgoNameAlgoEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_algoName_2_0=ruleAlgo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmSetRule());
            					}
            					set(
            						current,
            						"algoName",
            						lv_algoName_2_0,
            						"org.xtext.example.mydsl1.MyMML.Algo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmSetAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithmSet"


    // $ANTLR start "ruleAlgo"
    // InternalMyMML.g:669:1: ruleAlgo returns [Enumerator current=null] : ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) ) ;
    public final Enumerator ruleAlgo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:675:2: ( ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) ) )
            // InternalMyMML.g:676:2: ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) )
            {
            // InternalMyMML.g:676:2: ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyMML.g:677:3: (enumLiteral_0= 'DecisionTreeClassifier' )
                    {
                    // InternalMyMML.g:677:3: (enumLiteral_0= 'DecisionTreeClassifier' )
                    // InternalMyMML.g:678:4: enumLiteral_0= 'DecisionTreeClassifier'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:685:3: (enumLiteral_1= 'SVM' )
                    {
                    // InternalMyMML.g:685:3: (enumLiteral_1= 'SVM' )
                    // InternalMyMML.g:686:4: enumLiteral_1= 'SVM'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyMML.g:693:3: (enumLiteral_2= 'J48' )
                    {
                    // InternalMyMML.g:693:3: (enumLiteral_2= 'J48' )
                    // InternalMyMML.g:694:4: enumLiteral_2= 'J48'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyMML.g:701:3: (enumLiteral_3= 'NaiveBayes' )
                    {
                    // InternalMyMML.g:701:3: (enumLiteral_3= 'NaiveBayes' )
                    // InternalMyMML.g:702:4: enumLiteral_3= 'NaiveBayes'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getNaiveBayesEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAlgoAccess().getNaiveBayesEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgo"


    // $ANTLR start "ruleStrategy"
    // InternalMyMML.g:712:1: ruleStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'TrainingTest' ) | (enumLiteral_1= 'CrossValidation' ) ) ;
    public final Enumerator ruleStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyMML.g:718:2: ( ( (enumLiteral_0= 'TrainingTest' ) | (enumLiteral_1= 'CrossValidation' ) ) )
            // InternalMyMML.g:719:2: ( (enumLiteral_0= 'TrainingTest' ) | (enumLiteral_1= 'CrossValidation' ) )
            {
            // InternalMyMML.g:719:2: ( (enumLiteral_0= 'TrainingTest' ) | (enumLiteral_1= 'CrossValidation' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyMML.g:720:3: (enumLiteral_0= 'TrainingTest' )
                    {
                    // InternalMyMML.g:720:3: (enumLiteral_0= 'TrainingTest' )
                    // InternalMyMML.g:721:4: enumLiteral_0= 'TrainingTest'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getStrategyAccess().getTrainingTestEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyAccess().getTrainingTestEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:728:3: (enumLiteral_1= 'CrossValidation' )
                    {
                    // InternalMyMML.g:728:3: (enumLiteral_1= 'CrossValidation' )
                    // InternalMyMML.g:729:4: enumLiteral_1= 'CrossValidation'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getStrategyAccess().getCrossValidationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStrategyAccess().getCrossValidationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "ruleDisplayParams"
    // InternalMyMML.g:739:1: ruleDisplayParams returns [Enumerator current=null] : ( (enumLiteral_0= 'Precision' ) | (enumLiteral_1= 'Recall' ) | (enumLiteral_2= 'f1' ) ) ;
    public final Enumerator ruleDisplayParams() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyMML.g:745:2: ( ( (enumLiteral_0= 'Precision' ) | (enumLiteral_1= 'Recall' ) | (enumLiteral_2= 'f1' ) ) )
            // InternalMyMML.g:746:2: ( (enumLiteral_0= 'Precision' ) | (enumLiteral_1= 'Recall' ) | (enumLiteral_2= 'f1' ) )
            {
            // InternalMyMML.g:746:2: ( (enumLiteral_0= 'Precision' ) | (enumLiteral_1= 'Recall' ) | (enumLiteral_2= 'f1' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyMML.g:747:3: (enumLiteral_0= 'Precision' )
                    {
                    // InternalMyMML.g:747:3: (enumLiteral_0= 'Precision' )
                    // InternalMyMML.g:748:4: enumLiteral_0= 'Precision'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDisplayParamsAccess().getPrecisionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDisplayParamsAccess().getPrecisionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:755:3: (enumLiteral_1= 'Recall' )
                    {
                    // InternalMyMML.g:755:3: (enumLiteral_1= 'Recall' )
                    // InternalMyMML.g:756:4: enumLiteral_1= 'Recall'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDisplayParamsAccess().getRecallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDisplayParamsAccess().getRecallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyMML.g:763:3: (enumLiteral_2= 'f1' )
                    {
                    // InternalMyMML.g:763:3: (enumLiteral_2= 'f1' )
                    // InternalMyMML.g:764:4: enumLiteral_2= 'f1'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDisplayParamsAccess().getF1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDisplayParamsAccess().getF1EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisplayParams"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003C00000L});

}