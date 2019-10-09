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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'putIn'", "'fileSet'", "'<'", "'>'", "'predictiveColumns'", "'CibleColumn'", "'testValueSize'", "'trainValueSize'", "'algorithmSet'", "'DecisionTreeClassifier'", "'SVM'", "'J48'", "'NaiveBayes'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalMyMML.g:72:1: ruleMMLGenerator returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )+ ;
    public final EObject ruleMMLGenerator() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:78:2: ( ( (lv_instructions_0_0= ruleInstruction ) )+ )
            // InternalMyMML.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )+
            {
            // InternalMyMML.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyMML.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // InternalMyMML.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    // InternalMyMML.g:81:4: lv_instructions_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getMMLGeneratorAccess().getInstructionsInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMMLGeneratorRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.xtext.example.mydsl1.MyMML.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // InternalMyMML.g:101:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyMML.g:101:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyMML.g:102:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalMyMML.g:108:1: ruleInstruction returns [EObject current=null] : this_PutIn_0= rulePutIn ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_PutIn_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:114:2: (this_PutIn_0= rulePutIn )
            // InternalMyMML.g:115:2: this_PutIn_0= rulePutIn
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


    // $ANTLR start "entryRulePutIn"
    // InternalMyMML.g:126:1: entryRulePutIn returns [EObject current=null] : iv_rulePutIn= rulePutIn EOF ;
    public final EObject entryRulePutIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutIn = null;


        try {
            // InternalMyMML.g:126:46: (iv_rulePutIn= rulePutIn EOF )
            // InternalMyMML.g:127:2: iv_rulePutIn= rulePutIn EOF
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
    // InternalMyMML.g:133:1: rulePutIn returns [EObject current=null] : (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) ) ;
    public final EObject rulePutIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_putId_1_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:139:2: ( (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) ) )
            // InternalMyMML.g:140:2: (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) )
            {
            // InternalMyMML.g:140:2: (otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) ) )
            // InternalMyMML.g:141:3: otherlv_0= 'putIn' ( (lv_putId_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPutInAccess().getPutInKeyword_0());
            		
            // InternalMyMML.g:145:3: ( (lv_putId_1_0= RULE_ID ) )
            // InternalMyMML.g:146:4: (lv_putId_1_0= RULE_ID )
            {
            // InternalMyMML.g:146:4: (lv_putId_1_0= RULE_ID )
            // InternalMyMML.g:147:5: lv_putId_1_0= RULE_ID
            {
            lv_putId_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalMyMML.g:163:3: ( (lv_value_2_0= ruleElement ) )
            // InternalMyMML.g:164:4: (lv_value_2_0= ruleElement )
            {
            // InternalMyMML.g:164:4: (lv_value_2_0= ruleElement )
            // InternalMyMML.g:165:5: lv_value_2_0= ruleElement
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
    // InternalMyMML.g:186:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyMML.g:186:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyMML.g:187:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyMML.g:193:1: ruleElement returns [EObject current=null] : (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet ) ;
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
            // InternalMyMML.g:199:2: ( (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet ) )
            // InternalMyMML.g:200:2: (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet )
            {
            // InternalMyMML.g:200:2: (this_FileSet_0= ruleFileSet | this_PredictiveColumns_1= rulePredictiveColumns | this_CibleColumn_2= ruleCibleColumn | this_TestValueSize_3= ruleTestValueSize | this_TrainValueSize_4= ruleTrainValueSize | this_AlgorithmSet_5= ruleAlgorithmSet )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyMML.g:201:3: this_FileSet_0= ruleFileSet
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
                    // InternalMyMML.g:210:3: this_PredictiveColumns_1= rulePredictiveColumns
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
                    // InternalMyMML.g:219:3: this_CibleColumn_2= ruleCibleColumn
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
                    // InternalMyMML.g:228:3: this_TestValueSize_3= ruleTestValueSize
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
                    // InternalMyMML.g:237:3: this_TrainValueSize_4= ruleTrainValueSize
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
                    // InternalMyMML.g:246:3: this_AlgorithmSet_5= ruleAlgorithmSet
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
    // InternalMyMML.g:258:1: entryRuleFileSet returns [EObject current=null] : iv_ruleFileSet= ruleFileSet EOF ;
    public final EObject entryRuleFileSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSet = null;


        try {
            // InternalMyMML.g:258:48: (iv_ruleFileSet= ruleFileSet EOF )
            // InternalMyMML.g:259:2: iv_ruleFileSet= ruleFileSet EOF
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
    // InternalMyMML.g:265:1: ruleFileSet returns [EObject current=null] : (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleFileSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:271:2: ( (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:272:2: (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:272:2: (otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:273:3: otherlv_0= 'fileSet' otherlv_1= '<' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFileSetAccess().getFileSetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFileSetAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:281:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalMyMML.g:282:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalMyMML.g:282:4: (lv_text_2_0= RULE_STRING )
            // InternalMyMML.g:283:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyMML.g:307:1: entryRulePredictiveColumns returns [EObject current=null] : iv_rulePredictiveColumns= rulePredictiveColumns EOF ;
    public final EObject entryRulePredictiveColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictiveColumns = null;


        try {
            // InternalMyMML.g:307:58: (iv_rulePredictiveColumns= rulePredictiveColumns EOF )
            // InternalMyMML.g:308:2: iv_rulePredictiveColumns= rulePredictiveColumns EOF
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
    // InternalMyMML.g:314:1: rulePredictiveColumns returns [EObject current=null] : (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject rulePredictiveColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:320:2: ( (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:321:2: (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:321:2: (otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:322:3: otherlv_0= 'predictiveColumns' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictiveColumnsAccess().getPredictiveColumnsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPredictiveColumnsAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:330:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyMML.g:331:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyMML.g:331:4: (lv_column_2_0= RULE_STRING )
            // InternalMyMML.g:332:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyMML.g:356:1: entryRuleCibleColumn returns [EObject current=null] : iv_ruleCibleColumn= ruleCibleColumn EOF ;
    public final EObject entryRuleCibleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCibleColumn = null;


        try {
            // InternalMyMML.g:356:52: (iv_ruleCibleColumn= ruleCibleColumn EOF )
            // InternalMyMML.g:357:2: iv_ruleCibleColumn= ruleCibleColumn EOF
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
    // InternalMyMML.g:363:1: ruleCibleColumn returns [EObject current=null] : (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleCibleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:369:2: ( (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:370:2: (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:370:2: (otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // InternalMyMML.g:371:3: otherlv_0= 'CibleColumn' otherlv_1= '<' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCibleColumnAccess().getCibleColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCibleColumnAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:379:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyMML.g:380:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyMML.g:380:4: (lv_column_2_0= RULE_STRING )
            // InternalMyMML.g:381:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyMML.g:405:1: entryRuleTestValueSize returns [EObject current=null] : iv_ruleTestValueSize= ruleTestValueSize EOF ;
    public final EObject entryRuleTestValueSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestValueSize = null;


        try {
            // InternalMyMML.g:405:54: (iv_ruleTestValueSize= ruleTestValueSize EOF )
            // InternalMyMML.g:406:2: iv_ruleTestValueSize= ruleTestValueSize EOF
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
    // InternalMyMML.g:412:1: ruleTestValueSize returns [EObject current=null] : (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) ;
    public final EObject ruleTestValueSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:418:2: ( (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:419:2: (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:419:2: (otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            // InternalMyMML.g:420:3: otherlv_0= 'testValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTestValueSizeAccess().getTestValueSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTestValueSizeAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:428:3: ( (lv_size_2_0= RULE_INT ) )
            // InternalMyMML.g:429:4: (lv_size_2_0= RULE_INT )
            {
            // InternalMyMML.g:429:4: (lv_size_2_0= RULE_INT )
            // InternalMyMML.g:430:5: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyMML.g:454:1: entryRuleTrainValueSize returns [EObject current=null] : iv_ruleTrainValueSize= ruleTrainValueSize EOF ;
    public final EObject entryRuleTrainValueSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainValueSize = null;


        try {
            // InternalMyMML.g:454:55: (iv_ruleTrainValueSize= ruleTrainValueSize EOF )
            // InternalMyMML.g:455:2: iv_ruleTrainValueSize= ruleTrainValueSize EOF
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
    // InternalMyMML.g:461:1: ruleTrainValueSize returns [EObject current=null] : (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) ;
    public final EObject ruleTrainValueSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:467:2: ( (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:468:2: (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:468:2: (otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>' )
            // InternalMyMML.g:469:3: otherlv_0= 'trainValueSize' otherlv_1= '<' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainValueSizeAccess().getTrainValueSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainValueSizeAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:477:3: ( (lv_size_2_0= RULE_INT ) )
            // InternalMyMML.g:478:4: (lv_size_2_0= RULE_INT )
            {
            // InternalMyMML.g:478:4: (lv_size_2_0= RULE_INT )
            // InternalMyMML.g:479:5: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_size_2_0, grammarAccess.getTrainValueSizeAccess().getSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainValueSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainValueSizeAccess().getGreaterThanSignKeyword_3());
            		

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
    // InternalMyMML.g:503:1: entryRuleAlgorithmSet returns [EObject current=null] : iv_ruleAlgorithmSet= ruleAlgorithmSet EOF ;
    public final EObject entryRuleAlgorithmSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmSet = null;


        try {
            // InternalMyMML.g:503:53: (iv_ruleAlgorithmSet= ruleAlgorithmSet EOF )
            // InternalMyMML.g:504:2: iv_ruleAlgorithmSet= ruleAlgorithmSet EOF
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
    // InternalMyMML.g:510:1: ruleAlgorithmSet returns [EObject current=null] : (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' ) ;
    public final EObject ruleAlgorithmSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_algoName_2_0 = null;



        	enterRule();

        try {
            // InternalMyMML.g:516:2: ( (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' ) )
            // InternalMyMML.g:517:2: (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' )
            {
            // InternalMyMML.g:517:2: (otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>' )
            // InternalMyMML.g:518:3: otherlv_0= 'algorithmSet' otherlv_1= '<' ( (lv_algoName_2_0= ruleAlgo ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmSetAccess().getAlgorithmSetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmSetAccess().getLessThanSignKeyword_1());
            		
            // InternalMyMML.g:526:3: ( (lv_algoName_2_0= ruleAlgo ) )
            // InternalMyMML.g:527:4: (lv_algoName_2_0= ruleAlgo )
            {
            // InternalMyMML.g:527:4: (lv_algoName_2_0= ruleAlgo )
            // InternalMyMML.g:528:5: lv_algoName_2_0= ruleAlgo
            {

            					newCompositeNode(grammarAccess.getAlgorithmSetAccess().getAlgoNameAlgoEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyMML.g:553:1: ruleAlgo returns [Enumerator current=null] : ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) ) ;
    public final Enumerator ruleAlgo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyMML.g:559:2: ( ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) ) )
            // InternalMyMML.g:560:2: ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) )
            {
            // InternalMyMML.g:560:2: ( (enumLiteral_0= 'DecisionTreeClassifier' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'J48' ) | (enumLiteral_3= 'NaiveBayes' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyMML.g:561:3: (enumLiteral_0= 'DecisionTreeClassifier' )
                    {
                    // InternalMyMML.g:561:3: (enumLiteral_0= 'DecisionTreeClassifier' )
                    // InternalMyMML.g:562:4: enumLiteral_0= 'DecisionTreeClassifier'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:569:3: (enumLiteral_1= 'SVM' )
                    {
                    // InternalMyMML.g:569:3: (enumLiteral_1= 'SVM' )
                    // InternalMyMML.g:570:4: enumLiteral_1= 'SVM'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyMML.g:577:3: (enumLiteral_2= 'J48' )
                    {
                    // InternalMyMML.g:577:3: (enumLiteral_2= 'J48' )
                    // InternalMyMML.g:578:4: enumLiteral_2= 'J48'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyMML.g:585:3: (enumLiteral_3= 'NaiveBayes' )
                    {
                    // InternalMyMML.g:585:3: (enumLiteral_3= 'NaiveBayes' )
                    // InternalMyMML.g:586:4: enumLiteral_3= 'NaiveBayes'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F9000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F00000L});

}