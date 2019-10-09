package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyMMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyMMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DecisionTreeClassifier'", "'SVM'", "'J48'", "'NaiveBayes'", "'putIn'", "'fileSet'", "'<'", "'>'", "'predictiveColumns'", "'CibleColumn'", "'testValueSize'", "'trainValueSize'", "'algorithmSet'"
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

    	public void setGrammarAccess(MyMMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMMLGenerator"
    // InternalMyMML.g:53:1: entryRuleMMLGenerator : ruleMMLGenerator EOF ;
    public final void entryRuleMMLGenerator() throws RecognitionException {
        try {
            // InternalMyMML.g:54:1: ( ruleMMLGenerator EOF )
            // InternalMyMML.g:55:1: ruleMMLGenerator EOF
            {
             before(grammarAccess.getMMLGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleMMLGenerator();

            state._fsp--;

             after(grammarAccess.getMMLGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMMLGenerator"


    // $ANTLR start "ruleMMLGenerator"
    // InternalMyMML.g:62:1: ruleMMLGenerator : ( ( ( rule__MMLGenerator__InstructionsAssignment ) ) ( ( rule__MMLGenerator__InstructionsAssignment )* ) ) ;
    public final void ruleMMLGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:66:2: ( ( ( ( rule__MMLGenerator__InstructionsAssignment ) ) ( ( rule__MMLGenerator__InstructionsAssignment )* ) ) )
            // InternalMyMML.g:67:2: ( ( ( rule__MMLGenerator__InstructionsAssignment ) ) ( ( rule__MMLGenerator__InstructionsAssignment )* ) )
            {
            // InternalMyMML.g:67:2: ( ( ( rule__MMLGenerator__InstructionsAssignment ) ) ( ( rule__MMLGenerator__InstructionsAssignment )* ) )
            // InternalMyMML.g:68:3: ( ( rule__MMLGenerator__InstructionsAssignment ) ) ( ( rule__MMLGenerator__InstructionsAssignment )* )
            {
            // InternalMyMML.g:68:3: ( ( rule__MMLGenerator__InstructionsAssignment ) )
            // InternalMyMML.g:69:4: ( rule__MMLGenerator__InstructionsAssignment )
            {
             before(grammarAccess.getMMLGeneratorAccess().getInstructionsAssignment()); 
            // InternalMyMML.g:70:4: ( rule__MMLGenerator__InstructionsAssignment )
            // InternalMyMML.g:70:5: rule__MMLGenerator__InstructionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__MMLGenerator__InstructionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMMLGeneratorAccess().getInstructionsAssignment()); 

            }

            // InternalMyMML.g:73:3: ( ( rule__MMLGenerator__InstructionsAssignment )* )
            // InternalMyMML.g:74:4: ( rule__MMLGenerator__InstructionsAssignment )*
            {
             before(grammarAccess.getMMLGeneratorAccess().getInstructionsAssignment()); 
            // InternalMyMML.g:75:4: ( rule__MMLGenerator__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyMML.g:75:5: rule__MMLGenerator__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MMLGenerator__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMMLGeneratorAccess().getInstructionsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMLGenerator"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyMML.g:85:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyMML.g:86:1: ( ruleInstruction EOF )
            // InternalMyMML.g:87:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyMML.g:94:1: ruleInstruction : ( rulePutIn ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:98:2: ( ( rulePutIn ) )
            // InternalMyMML.g:99:2: ( rulePutIn )
            {
            // InternalMyMML.g:99:2: ( rulePutIn )
            // InternalMyMML.g:100:3: rulePutIn
            {
             before(grammarAccess.getInstructionAccess().getPutInParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePutIn();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getPutInParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRulePutIn"
    // InternalMyMML.g:110:1: entryRulePutIn : rulePutIn EOF ;
    public final void entryRulePutIn() throws RecognitionException {
        try {
            // InternalMyMML.g:111:1: ( rulePutIn EOF )
            // InternalMyMML.g:112:1: rulePutIn EOF
            {
             before(grammarAccess.getPutInRule()); 
            pushFollow(FOLLOW_1);
            rulePutIn();

            state._fsp--;

             after(grammarAccess.getPutInRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePutIn"


    // $ANTLR start "rulePutIn"
    // InternalMyMML.g:119:1: rulePutIn : ( ( rule__PutIn__Group__0 ) ) ;
    public final void rulePutIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:123:2: ( ( ( rule__PutIn__Group__0 ) ) )
            // InternalMyMML.g:124:2: ( ( rule__PutIn__Group__0 ) )
            {
            // InternalMyMML.g:124:2: ( ( rule__PutIn__Group__0 ) )
            // InternalMyMML.g:125:3: ( rule__PutIn__Group__0 )
            {
             before(grammarAccess.getPutInAccess().getGroup()); 
            // InternalMyMML.g:126:3: ( rule__PutIn__Group__0 )
            // InternalMyMML.g:126:4: rule__PutIn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PutIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPutInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePutIn"


    // $ANTLR start "entryRuleElement"
    // InternalMyMML.g:135:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyMML.g:136:1: ( ruleElement EOF )
            // InternalMyMML.g:137:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyMML.g:144:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:148:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyMML.g:149:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyMML.g:149:2: ( ( rule__Element__Alternatives ) )
            // InternalMyMML.g:150:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMyMML.g:151:3: ( rule__Element__Alternatives )
            // InternalMyMML.g:151:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFileSet"
    // InternalMyMML.g:160:1: entryRuleFileSet : ruleFileSet EOF ;
    public final void entryRuleFileSet() throws RecognitionException {
        try {
            // InternalMyMML.g:161:1: ( ruleFileSet EOF )
            // InternalMyMML.g:162:1: ruleFileSet EOF
            {
             before(grammarAccess.getFileSetRule()); 
            pushFollow(FOLLOW_1);
            ruleFileSet();

            state._fsp--;

             after(grammarAccess.getFileSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileSet"


    // $ANTLR start "ruleFileSet"
    // InternalMyMML.g:169:1: ruleFileSet : ( ( rule__FileSet__Group__0 ) ) ;
    public final void ruleFileSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:173:2: ( ( ( rule__FileSet__Group__0 ) ) )
            // InternalMyMML.g:174:2: ( ( rule__FileSet__Group__0 ) )
            {
            // InternalMyMML.g:174:2: ( ( rule__FileSet__Group__0 ) )
            // InternalMyMML.g:175:3: ( rule__FileSet__Group__0 )
            {
             before(grammarAccess.getFileSetAccess().getGroup()); 
            // InternalMyMML.g:176:3: ( rule__FileSet__Group__0 )
            // InternalMyMML.g:176:4: rule__FileSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileSet"


    // $ANTLR start "entryRulePredictiveColumns"
    // InternalMyMML.g:185:1: entryRulePredictiveColumns : rulePredictiveColumns EOF ;
    public final void entryRulePredictiveColumns() throws RecognitionException {
        try {
            // InternalMyMML.g:186:1: ( rulePredictiveColumns EOF )
            // InternalMyMML.g:187:1: rulePredictiveColumns EOF
            {
             before(grammarAccess.getPredictiveColumnsRule()); 
            pushFollow(FOLLOW_1);
            rulePredictiveColumns();

            state._fsp--;

             after(grammarAccess.getPredictiveColumnsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredictiveColumns"


    // $ANTLR start "rulePredictiveColumns"
    // InternalMyMML.g:194:1: rulePredictiveColumns : ( ( rule__PredictiveColumns__Group__0 ) ) ;
    public final void rulePredictiveColumns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:198:2: ( ( ( rule__PredictiveColumns__Group__0 ) ) )
            // InternalMyMML.g:199:2: ( ( rule__PredictiveColumns__Group__0 ) )
            {
            // InternalMyMML.g:199:2: ( ( rule__PredictiveColumns__Group__0 ) )
            // InternalMyMML.g:200:3: ( rule__PredictiveColumns__Group__0 )
            {
             before(grammarAccess.getPredictiveColumnsAccess().getGroup()); 
            // InternalMyMML.g:201:3: ( rule__PredictiveColumns__Group__0 )
            // InternalMyMML.g:201:4: rule__PredictiveColumns__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveColumnsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictiveColumns"


    // $ANTLR start "entryRuleCibleColumn"
    // InternalMyMML.g:210:1: entryRuleCibleColumn : ruleCibleColumn EOF ;
    public final void entryRuleCibleColumn() throws RecognitionException {
        try {
            // InternalMyMML.g:211:1: ( ruleCibleColumn EOF )
            // InternalMyMML.g:212:1: ruleCibleColumn EOF
            {
             before(grammarAccess.getCibleColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleCibleColumn();

            state._fsp--;

             after(grammarAccess.getCibleColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCibleColumn"


    // $ANTLR start "ruleCibleColumn"
    // InternalMyMML.g:219:1: ruleCibleColumn : ( ( rule__CibleColumn__Group__0 ) ) ;
    public final void ruleCibleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:223:2: ( ( ( rule__CibleColumn__Group__0 ) ) )
            // InternalMyMML.g:224:2: ( ( rule__CibleColumn__Group__0 ) )
            {
            // InternalMyMML.g:224:2: ( ( rule__CibleColumn__Group__0 ) )
            // InternalMyMML.g:225:3: ( rule__CibleColumn__Group__0 )
            {
             before(grammarAccess.getCibleColumnAccess().getGroup()); 
            // InternalMyMML.g:226:3: ( rule__CibleColumn__Group__0 )
            // InternalMyMML.g:226:4: rule__CibleColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CibleColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCibleColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCibleColumn"


    // $ANTLR start "entryRuleTestValueSize"
    // InternalMyMML.g:235:1: entryRuleTestValueSize : ruleTestValueSize EOF ;
    public final void entryRuleTestValueSize() throws RecognitionException {
        try {
            // InternalMyMML.g:236:1: ( ruleTestValueSize EOF )
            // InternalMyMML.g:237:1: ruleTestValueSize EOF
            {
             before(grammarAccess.getTestValueSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleTestValueSize();

            state._fsp--;

             after(grammarAccess.getTestValueSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestValueSize"


    // $ANTLR start "ruleTestValueSize"
    // InternalMyMML.g:244:1: ruleTestValueSize : ( ( rule__TestValueSize__Group__0 ) ) ;
    public final void ruleTestValueSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:248:2: ( ( ( rule__TestValueSize__Group__0 ) ) )
            // InternalMyMML.g:249:2: ( ( rule__TestValueSize__Group__0 ) )
            {
            // InternalMyMML.g:249:2: ( ( rule__TestValueSize__Group__0 ) )
            // InternalMyMML.g:250:3: ( rule__TestValueSize__Group__0 )
            {
             before(grammarAccess.getTestValueSizeAccess().getGroup()); 
            // InternalMyMML.g:251:3: ( rule__TestValueSize__Group__0 )
            // InternalMyMML.g:251:4: rule__TestValueSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestValueSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestValueSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestValueSize"


    // $ANTLR start "entryRuleTrainValueSize"
    // InternalMyMML.g:260:1: entryRuleTrainValueSize : ruleTrainValueSize EOF ;
    public final void entryRuleTrainValueSize() throws RecognitionException {
        try {
            // InternalMyMML.g:261:1: ( ruleTrainValueSize EOF )
            // InternalMyMML.g:262:1: ruleTrainValueSize EOF
            {
             before(grammarAccess.getTrainValueSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainValueSize();

            state._fsp--;

             after(grammarAccess.getTrainValueSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainValueSize"


    // $ANTLR start "ruleTrainValueSize"
    // InternalMyMML.g:269:1: ruleTrainValueSize : ( ( rule__TrainValueSize__Group__0 ) ) ;
    public final void ruleTrainValueSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:273:2: ( ( ( rule__TrainValueSize__Group__0 ) ) )
            // InternalMyMML.g:274:2: ( ( rule__TrainValueSize__Group__0 ) )
            {
            // InternalMyMML.g:274:2: ( ( rule__TrainValueSize__Group__0 ) )
            // InternalMyMML.g:275:3: ( rule__TrainValueSize__Group__0 )
            {
             before(grammarAccess.getTrainValueSizeAccess().getGroup()); 
            // InternalMyMML.g:276:3: ( rule__TrainValueSize__Group__0 )
            // InternalMyMML.g:276:4: rule__TrainValueSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainValueSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainValueSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainValueSize"


    // $ANTLR start "entryRuleAlgorithmSet"
    // InternalMyMML.g:285:1: entryRuleAlgorithmSet : ruleAlgorithmSet EOF ;
    public final void entryRuleAlgorithmSet() throws RecognitionException {
        try {
            // InternalMyMML.g:286:1: ( ruleAlgorithmSet EOF )
            // InternalMyMML.g:287:1: ruleAlgorithmSet EOF
            {
             before(grammarAccess.getAlgorithmSetRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithmSet();

            state._fsp--;

             after(grammarAccess.getAlgorithmSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithmSet"


    // $ANTLR start "ruleAlgorithmSet"
    // InternalMyMML.g:294:1: ruleAlgorithmSet : ( ( rule__AlgorithmSet__Group__0 ) ) ;
    public final void ruleAlgorithmSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:298:2: ( ( ( rule__AlgorithmSet__Group__0 ) ) )
            // InternalMyMML.g:299:2: ( ( rule__AlgorithmSet__Group__0 ) )
            {
            // InternalMyMML.g:299:2: ( ( rule__AlgorithmSet__Group__0 ) )
            // InternalMyMML.g:300:3: ( rule__AlgorithmSet__Group__0 )
            {
             before(grammarAccess.getAlgorithmSetAccess().getGroup()); 
            // InternalMyMML.g:301:3: ( rule__AlgorithmSet__Group__0 )
            // InternalMyMML.g:301:4: rule__AlgorithmSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithmSet"


    // $ANTLR start "ruleAlgo"
    // InternalMyMML.g:310:1: ruleAlgo : ( ( rule__Algo__Alternatives ) ) ;
    public final void ruleAlgo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:314:1: ( ( ( rule__Algo__Alternatives ) ) )
            // InternalMyMML.g:315:2: ( ( rule__Algo__Alternatives ) )
            {
            // InternalMyMML.g:315:2: ( ( rule__Algo__Alternatives ) )
            // InternalMyMML.g:316:3: ( rule__Algo__Alternatives )
            {
             before(grammarAccess.getAlgoAccess().getAlternatives()); 
            // InternalMyMML.g:317:3: ( rule__Algo__Alternatives )
            // InternalMyMML.g:317:4: rule__Algo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Algo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgo"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyMML.g:325:1: rule__Element__Alternatives : ( ( ruleFileSet ) | ( rulePredictiveColumns ) | ( ruleCibleColumn ) | ( ruleTestValueSize ) | ( ruleTrainValueSize ) | ( ruleAlgorithmSet ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:329:1: ( ( ruleFileSet ) | ( rulePredictiveColumns ) | ( ruleCibleColumn ) | ( ruleTestValueSize ) | ( ruleTrainValueSize ) | ( ruleAlgorithmSet ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 23:
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
                    // InternalMyMML.g:330:2: ( ruleFileSet )
                    {
                    // InternalMyMML.g:330:2: ( ruleFileSet )
                    // InternalMyMML.g:331:3: ruleFileSet
                    {
                     before(grammarAccess.getElementAccess().getFileSetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFileSet();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFileSetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:336:2: ( rulePredictiveColumns )
                    {
                    // InternalMyMML.g:336:2: ( rulePredictiveColumns )
                    // InternalMyMML.g:337:3: rulePredictiveColumns
                    {
                     before(grammarAccess.getElementAccess().getPredictiveColumnsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredictiveColumns();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPredictiveColumnsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyMML.g:342:2: ( ruleCibleColumn )
                    {
                    // InternalMyMML.g:342:2: ( ruleCibleColumn )
                    // InternalMyMML.g:343:3: ruleCibleColumn
                    {
                     before(grammarAccess.getElementAccess().getCibleColumnParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCibleColumn();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCibleColumnParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyMML.g:348:2: ( ruleTestValueSize )
                    {
                    // InternalMyMML.g:348:2: ( ruleTestValueSize )
                    // InternalMyMML.g:349:3: ruleTestValueSize
                    {
                     before(grammarAccess.getElementAccess().getTestValueSizeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTestValueSize();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTestValueSizeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyMML.g:354:2: ( ruleTrainValueSize )
                    {
                    // InternalMyMML.g:354:2: ( ruleTrainValueSize )
                    // InternalMyMML.g:355:3: ruleTrainValueSize
                    {
                     before(grammarAccess.getElementAccess().getTrainValueSizeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTrainValueSize();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTrainValueSizeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyMML.g:360:2: ( ruleAlgorithmSet )
                    {
                    // InternalMyMML.g:360:2: ( ruleAlgorithmSet )
                    // InternalMyMML.g:361:3: ruleAlgorithmSet
                    {
                     before(grammarAccess.getElementAccess().getAlgorithmSetParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAlgorithmSet();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAlgorithmSetParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Algo__Alternatives"
    // InternalMyMML.g:370:1: rule__Algo__Alternatives : ( ( ( 'DecisionTreeClassifier' ) ) | ( ( 'SVM' ) ) | ( ( 'J48' ) ) | ( ( 'NaiveBayes' ) ) );
    public final void rule__Algo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:374:1: ( ( ( 'DecisionTreeClassifier' ) ) | ( ( 'SVM' ) ) | ( ( 'J48' ) ) | ( ( 'NaiveBayes' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
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
                    // InternalMyMML.g:375:2: ( ( 'DecisionTreeClassifier' ) )
                    {
                    // InternalMyMML.g:375:2: ( ( 'DecisionTreeClassifier' ) )
                    // InternalMyMML.g:376:3: ( 'DecisionTreeClassifier' )
                    {
                     before(grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0()); 
                    // InternalMyMML.g:377:3: ( 'DecisionTreeClassifier' )
                    // InternalMyMML.g:377:4: 'DecisionTreeClassifier'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoAccess().getDecisionTreeClassifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyMML.g:381:2: ( ( 'SVM' ) )
                    {
                    // InternalMyMML.g:381:2: ( ( 'SVM' ) )
                    // InternalMyMML.g:382:3: ( 'SVM' )
                    {
                     before(grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1()); 
                    // InternalMyMML.g:383:3: ( 'SVM' )
                    // InternalMyMML.g:383:4: 'SVM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoAccess().getSVMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyMML.g:387:2: ( ( 'J48' ) )
                    {
                    // InternalMyMML.g:387:2: ( ( 'J48' ) )
                    // InternalMyMML.g:388:3: ( 'J48' )
                    {
                     before(grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2()); 
                    // InternalMyMML.g:389:3: ( 'J48' )
                    // InternalMyMML.g:389:4: 'J48'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoAccess().getJ48EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyMML.g:393:2: ( ( 'NaiveBayes' ) )
                    {
                    // InternalMyMML.g:393:2: ( ( 'NaiveBayes' ) )
                    // InternalMyMML.g:394:3: ( 'NaiveBayes' )
                    {
                     before(grammarAccess.getAlgoAccess().getNaiveBayesEnumLiteralDeclaration_3()); 
                    // InternalMyMML.g:395:3: ( 'NaiveBayes' )
                    // InternalMyMML.g:395:4: 'NaiveBayes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoAccess().getNaiveBayesEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Alternatives"


    // $ANTLR start "rule__PutIn__Group__0"
    // InternalMyMML.g:403:1: rule__PutIn__Group__0 : rule__PutIn__Group__0__Impl rule__PutIn__Group__1 ;
    public final void rule__PutIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:407:1: ( rule__PutIn__Group__0__Impl rule__PutIn__Group__1 )
            // InternalMyMML.g:408:2: rule__PutIn__Group__0__Impl rule__PutIn__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PutIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__0"


    // $ANTLR start "rule__PutIn__Group__0__Impl"
    // InternalMyMML.g:415:1: rule__PutIn__Group__0__Impl : ( 'putIn' ) ;
    public final void rule__PutIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:419:1: ( ( 'putIn' ) )
            // InternalMyMML.g:420:1: ( 'putIn' )
            {
            // InternalMyMML.g:420:1: ( 'putIn' )
            // InternalMyMML.g:421:2: 'putIn'
            {
             before(grammarAccess.getPutInAccess().getPutInKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPutInAccess().getPutInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__0__Impl"


    // $ANTLR start "rule__PutIn__Group__1"
    // InternalMyMML.g:430:1: rule__PutIn__Group__1 : rule__PutIn__Group__1__Impl rule__PutIn__Group__2 ;
    public final void rule__PutIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:434:1: ( rule__PutIn__Group__1__Impl rule__PutIn__Group__2 )
            // InternalMyMML.g:435:2: rule__PutIn__Group__1__Impl rule__PutIn__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PutIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__1"


    // $ANTLR start "rule__PutIn__Group__1__Impl"
    // InternalMyMML.g:442:1: rule__PutIn__Group__1__Impl : ( ( rule__PutIn__PutIdAssignment_1 ) ) ;
    public final void rule__PutIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:446:1: ( ( ( rule__PutIn__PutIdAssignment_1 ) ) )
            // InternalMyMML.g:447:1: ( ( rule__PutIn__PutIdAssignment_1 ) )
            {
            // InternalMyMML.g:447:1: ( ( rule__PutIn__PutIdAssignment_1 ) )
            // InternalMyMML.g:448:2: ( rule__PutIn__PutIdAssignment_1 )
            {
             before(grammarAccess.getPutInAccess().getPutIdAssignment_1()); 
            // InternalMyMML.g:449:2: ( rule__PutIn__PutIdAssignment_1 )
            // InternalMyMML.g:449:3: rule__PutIn__PutIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PutIn__PutIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPutInAccess().getPutIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__1__Impl"


    // $ANTLR start "rule__PutIn__Group__2"
    // InternalMyMML.g:457:1: rule__PutIn__Group__2 : rule__PutIn__Group__2__Impl ;
    public final void rule__PutIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:461:1: ( rule__PutIn__Group__2__Impl )
            // InternalMyMML.g:462:2: rule__PutIn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PutIn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__2"


    // $ANTLR start "rule__PutIn__Group__2__Impl"
    // InternalMyMML.g:468:1: rule__PutIn__Group__2__Impl : ( ( rule__PutIn__ValueAssignment_2 ) ) ;
    public final void rule__PutIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:472:1: ( ( ( rule__PutIn__ValueAssignment_2 ) ) )
            // InternalMyMML.g:473:1: ( ( rule__PutIn__ValueAssignment_2 ) )
            {
            // InternalMyMML.g:473:1: ( ( rule__PutIn__ValueAssignment_2 ) )
            // InternalMyMML.g:474:2: ( rule__PutIn__ValueAssignment_2 )
            {
             before(grammarAccess.getPutInAccess().getValueAssignment_2()); 
            // InternalMyMML.g:475:2: ( rule__PutIn__ValueAssignment_2 )
            // InternalMyMML.g:475:3: rule__PutIn__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PutIn__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPutInAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__Group__2__Impl"


    // $ANTLR start "rule__FileSet__Group__0"
    // InternalMyMML.g:484:1: rule__FileSet__Group__0 : rule__FileSet__Group__0__Impl rule__FileSet__Group__1 ;
    public final void rule__FileSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:488:1: ( rule__FileSet__Group__0__Impl rule__FileSet__Group__1 )
            // InternalMyMML.g:489:2: rule__FileSet__Group__0__Impl rule__FileSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FileSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__0"


    // $ANTLR start "rule__FileSet__Group__0__Impl"
    // InternalMyMML.g:496:1: rule__FileSet__Group__0__Impl : ( 'fileSet' ) ;
    public final void rule__FileSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:500:1: ( ( 'fileSet' ) )
            // InternalMyMML.g:501:1: ( 'fileSet' )
            {
            // InternalMyMML.g:501:1: ( 'fileSet' )
            // InternalMyMML.g:502:2: 'fileSet'
            {
             before(grammarAccess.getFileSetAccess().getFileSetKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileSetAccess().getFileSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__0__Impl"


    // $ANTLR start "rule__FileSet__Group__1"
    // InternalMyMML.g:511:1: rule__FileSet__Group__1 : rule__FileSet__Group__1__Impl rule__FileSet__Group__2 ;
    public final void rule__FileSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:515:1: ( rule__FileSet__Group__1__Impl rule__FileSet__Group__2 )
            // InternalMyMML.g:516:2: rule__FileSet__Group__1__Impl rule__FileSet__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FileSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__1"


    // $ANTLR start "rule__FileSet__Group__1__Impl"
    // InternalMyMML.g:523:1: rule__FileSet__Group__1__Impl : ( '<' ) ;
    public final void rule__FileSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:527:1: ( ( '<' ) )
            // InternalMyMML.g:528:1: ( '<' )
            {
            // InternalMyMML.g:528:1: ( '<' )
            // InternalMyMML.g:529:2: '<'
            {
             before(grammarAccess.getFileSetAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileSetAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__1__Impl"


    // $ANTLR start "rule__FileSet__Group__2"
    // InternalMyMML.g:538:1: rule__FileSet__Group__2 : rule__FileSet__Group__2__Impl rule__FileSet__Group__3 ;
    public final void rule__FileSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:542:1: ( rule__FileSet__Group__2__Impl rule__FileSet__Group__3 )
            // InternalMyMML.g:543:2: rule__FileSet__Group__2__Impl rule__FileSet__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FileSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__2"


    // $ANTLR start "rule__FileSet__Group__2__Impl"
    // InternalMyMML.g:550:1: rule__FileSet__Group__2__Impl : ( ( rule__FileSet__TextAssignment_2 ) ) ;
    public final void rule__FileSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:554:1: ( ( ( rule__FileSet__TextAssignment_2 ) ) )
            // InternalMyMML.g:555:1: ( ( rule__FileSet__TextAssignment_2 ) )
            {
            // InternalMyMML.g:555:1: ( ( rule__FileSet__TextAssignment_2 ) )
            // InternalMyMML.g:556:2: ( rule__FileSet__TextAssignment_2 )
            {
             before(grammarAccess.getFileSetAccess().getTextAssignment_2()); 
            // InternalMyMML.g:557:2: ( rule__FileSet__TextAssignment_2 )
            // InternalMyMML.g:557:3: rule__FileSet__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileSet__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileSetAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__2__Impl"


    // $ANTLR start "rule__FileSet__Group__3"
    // InternalMyMML.g:565:1: rule__FileSet__Group__3 : rule__FileSet__Group__3__Impl ;
    public final void rule__FileSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:569:1: ( rule__FileSet__Group__3__Impl )
            // InternalMyMML.g:570:2: rule__FileSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__3"


    // $ANTLR start "rule__FileSet__Group__3__Impl"
    // InternalMyMML.g:576:1: rule__FileSet__Group__3__Impl : ( '>' ) ;
    public final void rule__FileSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:580:1: ( ( '>' ) )
            // InternalMyMML.g:581:1: ( '>' )
            {
            // InternalMyMML.g:581:1: ( '>' )
            // InternalMyMML.g:582:2: '>'
            {
             before(grammarAccess.getFileSetAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFileSetAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__Group__3__Impl"


    // $ANTLR start "rule__PredictiveColumns__Group__0"
    // InternalMyMML.g:592:1: rule__PredictiveColumns__Group__0 : rule__PredictiveColumns__Group__0__Impl rule__PredictiveColumns__Group__1 ;
    public final void rule__PredictiveColumns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:596:1: ( rule__PredictiveColumns__Group__0__Impl rule__PredictiveColumns__Group__1 )
            // InternalMyMML.g:597:2: rule__PredictiveColumns__Group__0__Impl rule__PredictiveColumns__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PredictiveColumns__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__0"


    // $ANTLR start "rule__PredictiveColumns__Group__0__Impl"
    // InternalMyMML.g:604:1: rule__PredictiveColumns__Group__0__Impl : ( 'predictiveColumns' ) ;
    public final void rule__PredictiveColumns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:608:1: ( ( 'predictiveColumns' ) )
            // InternalMyMML.g:609:1: ( 'predictiveColumns' )
            {
            // InternalMyMML.g:609:1: ( 'predictiveColumns' )
            // InternalMyMML.g:610:2: 'predictiveColumns'
            {
             before(grammarAccess.getPredictiveColumnsAccess().getPredictiveColumnsKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredictiveColumnsAccess().getPredictiveColumnsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__0__Impl"


    // $ANTLR start "rule__PredictiveColumns__Group__1"
    // InternalMyMML.g:619:1: rule__PredictiveColumns__Group__1 : rule__PredictiveColumns__Group__1__Impl rule__PredictiveColumns__Group__2 ;
    public final void rule__PredictiveColumns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:623:1: ( rule__PredictiveColumns__Group__1__Impl rule__PredictiveColumns__Group__2 )
            // InternalMyMML.g:624:2: rule__PredictiveColumns__Group__1__Impl rule__PredictiveColumns__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PredictiveColumns__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__1"


    // $ANTLR start "rule__PredictiveColumns__Group__1__Impl"
    // InternalMyMML.g:631:1: rule__PredictiveColumns__Group__1__Impl : ( '<' ) ;
    public final void rule__PredictiveColumns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:635:1: ( ( '<' ) )
            // InternalMyMML.g:636:1: ( '<' )
            {
            // InternalMyMML.g:636:1: ( '<' )
            // InternalMyMML.g:637:2: '<'
            {
             before(grammarAccess.getPredictiveColumnsAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredictiveColumnsAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__1__Impl"


    // $ANTLR start "rule__PredictiveColumns__Group__2"
    // InternalMyMML.g:646:1: rule__PredictiveColumns__Group__2 : rule__PredictiveColumns__Group__2__Impl rule__PredictiveColumns__Group__3 ;
    public final void rule__PredictiveColumns__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:650:1: ( rule__PredictiveColumns__Group__2__Impl rule__PredictiveColumns__Group__3 )
            // InternalMyMML.g:651:2: rule__PredictiveColumns__Group__2__Impl rule__PredictiveColumns__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PredictiveColumns__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__2"


    // $ANTLR start "rule__PredictiveColumns__Group__2__Impl"
    // InternalMyMML.g:658:1: rule__PredictiveColumns__Group__2__Impl : ( ( rule__PredictiveColumns__ColumnAssignment_2 ) ) ;
    public final void rule__PredictiveColumns__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:662:1: ( ( ( rule__PredictiveColumns__ColumnAssignment_2 ) ) )
            // InternalMyMML.g:663:1: ( ( rule__PredictiveColumns__ColumnAssignment_2 ) )
            {
            // InternalMyMML.g:663:1: ( ( rule__PredictiveColumns__ColumnAssignment_2 ) )
            // InternalMyMML.g:664:2: ( rule__PredictiveColumns__ColumnAssignment_2 )
            {
             before(grammarAccess.getPredictiveColumnsAccess().getColumnAssignment_2()); 
            // InternalMyMML.g:665:2: ( rule__PredictiveColumns__ColumnAssignment_2 )
            // InternalMyMML.g:665:3: rule__PredictiveColumns__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveColumnsAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__2__Impl"


    // $ANTLR start "rule__PredictiveColumns__Group__3"
    // InternalMyMML.g:673:1: rule__PredictiveColumns__Group__3 : rule__PredictiveColumns__Group__3__Impl ;
    public final void rule__PredictiveColumns__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:677:1: ( rule__PredictiveColumns__Group__3__Impl )
            // InternalMyMML.g:678:2: rule__PredictiveColumns__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveColumns__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__3"


    // $ANTLR start "rule__PredictiveColumns__Group__3__Impl"
    // InternalMyMML.g:684:1: rule__PredictiveColumns__Group__3__Impl : ( '>' ) ;
    public final void rule__PredictiveColumns__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:688:1: ( ( '>' ) )
            // InternalMyMML.g:689:1: ( '>' )
            {
            // InternalMyMML.g:689:1: ( '>' )
            // InternalMyMML.g:690:2: '>'
            {
             before(grammarAccess.getPredictiveColumnsAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredictiveColumnsAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__Group__3__Impl"


    // $ANTLR start "rule__CibleColumn__Group__0"
    // InternalMyMML.g:700:1: rule__CibleColumn__Group__0 : rule__CibleColumn__Group__0__Impl rule__CibleColumn__Group__1 ;
    public final void rule__CibleColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:704:1: ( rule__CibleColumn__Group__0__Impl rule__CibleColumn__Group__1 )
            // InternalMyMML.g:705:2: rule__CibleColumn__Group__0__Impl rule__CibleColumn__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CibleColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CibleColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__0"


    // $ANTLR start "rule__CibleColumn__Group__0__Impl"
    // InternalMyMML.g:712:1: rule__CibleColumn__Group__0__Impl : ( 'CibleColumn' ) ;
    public final void rule__CibleColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:716:1: ( ( 'CibleColumn' ) )
            // InternalMyMML.g:717:1: ( 'CibleColumn' )
            {
            // InternalMyMML.g:717:1: ( 'CibleColumn' )
            // InternalMyMML.g:718:2: 'CibleColumn'
            {
             before(grammarAccess.getCibleColumnAccess().getCibleColumnKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCibleColumnAccess().getCibleColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__0__Impl"


    // $ANTLR start "rule__CibleColumn__Group__1"
    // InternalMyMML.g:727:1: rule__CibleColumn__Group__1 : rule__CibleColumn__Group__1__Impl rule__CibleColumn__Group__2 ;
    public final void rule__CibleColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:731:1: ( rule__CibleColumn__Group__1__Impl rule__CibleColumn__Group__2 )
            // InternalMyMML.g:732:2: rule__CibleColumn__Group__1__Impl rule__CibleColumn__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CibleColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CibleColumn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__1"


    // $ANTLR start "rule__CibleColumn__Group__1__Impl"
    // InternalMyMML.g:739:1: rule__CibleColumn__Group__1__Impl : ( '<' ) ;
    public final void rule__CibleColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:743:1: ( ( '<' ) )
            // InternalMyMML.g:744:1: ( '<' )
            {
            // InternalMyMML.g:744:1: ( '<' )
            // InternalMyMML.g:745:2: '<'
            {
             before(grammarAccess.getCibleColumnAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCibleColumnAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__1__Impl"


    // $ANTLR start "rule__CibleColumn__Group__2"
    // InternalMyMML.g:754:1: rule__CibleColumn__Group__2 : rule__CibleColumn__Group__2__Impl rule__CibleColumn__Group__3 ;
    public final void rule__CibleColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:758:1: ( rule__CibleColumn__Group__2__Impl rule__CibleColumn__Group__3 )
            // InternalMyMML.g:759:2: rule__CibleColumn__Group__2__Impl rule__CibleColumn__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CibleColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CibleColumn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__2"


    // $ANTLR start "rule__CibleColumn__Group__2__Impl"
    // InternalMyMML.g:766:1: rule__CibleColumn__Group__2__Impl : ( ( rule__CibleColumn__ColumnAssignment_2 ) ) ;
    public final void rule__CibleColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:770:1: ( ( ( rule__CibleColumn__ColumnAssignment_2 ) ) )
            // InternalMyMML.g:771:1: ( ( rule__CibleColumn__ColumnAssignment_2 ) )
            {
            // InternalMyMML.g:771:1: ( ( rule__CibleColumn__ColumnAssignment_2 ) )
            // InternalMyMML.g:772:2: ( rule__CibleColumn__ColumnAssignment_2 )
            {
             before(grammarAccess.getCibleColumnAccess().getColumnAssignment_2()); 
            // InternalMyMML.g:773:2: ( rule__CibleColumn__ColumnAssignment_2 )
            // InternalMyMML.g:773:3: rule__CibleColumn__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CibleColumn__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCibleColumnAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__2__Impl"


    // $ANTLR start "rule__CibleColumn__Group__3"
    // InternalMyMML.g:781:1: rule__CibleColumn__Group__3 : rule__CibleColumn__Group__3__Impl ;
    public final void rule__CibleColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:785:1: ( rule__CibleColumn__Group__3__Impl )
            // InternalMyMML.g:786:2: rule__CibleColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CibleColumn__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__3"


    // $ANTLR start "rule__CibleColumn__Group__3__Impl"
    // InternalMyMML.g:792:1: rule__CibleColumn__Group__3__Impl : ( '>' ) ;
    public final void rule__CibleColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:796:1: ( ( '>' ) )
            // InternalMyMML.g:797:1: ( '>' )
            {
            // InternalMyMML.g:797:1: ( '>' )
            // InternalMyMML.g:798:2: '>'
            {
             before(grammarAccess.getCibleColumnAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCibleColumnAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__Group__3__Impl"


    // $ANTLR start "rule__TestValueSize__Group__0"
    // InternalMyMML.g:808:1: rule__TestValueSize__Group__0 : rule__TestValueSize__Group__0__Impl rule__TestValueSize__Group__1 ;
    public final void rule__TestValueSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:812:1: ( rule__TestValueSize__Group__0__Impl rule__TestValueSize__Group__1 )
            // InternalMyMML.g:813:2: rule__TestValueSize__Group__0__Impl rule__TestValueSize__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TestValueSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestValueSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__0"


    // $ANTLR start "rule__TestValueSize__Group__0__Impl"
    // InternalMyMML.g:820:1: rule__TestValueSize__Group__0__Impl : ( 'testValueSize' ) ;
    public final void rule__TestValueSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:824:1: ( ( 'testValueSize' ) )
            // InternalMyMML.g:825:1: ( 'testValueSize' )
            {
            // InternalMyMML.g:825:1: ( 'testValueSize' )
            // InternalMyMML.g:826:2: 'testValueSize'
            {
             before(grammarAccess.getTestValueSizeAccess().getTestValueSizeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTestValueSizeAccess().getTestValueSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__0__Impl"


    // $ANTLR start "rule__TestValueSize__Group__1"
    // InternalMyMML.g:835:1: rule__TestValueSize__Group__1 : rule__TestValueSize__Group__1__Impl rule__TestValueSize__Group__2 ;
    public final void rule__TestValueSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:839:1: ( rule__TestValueSize__Group__1__Impl rule__TestValueSize__Group__2 )
            // InternalMyMML.g:840:2: rule__TestValueSize__Group__1__Impl rule__TestValueSize__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TestValueSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestValueSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__1"


    // $ANTLR start "rule__TestValueSize__Group__1__Impl"
    // InternalMyMML.g:847:1: rule__TestValueSize__Group__1__Impl : ( '<' ) ;
    public final void rule__TestValueSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:851:1: ( ( '<' ) )
            // InternalMyMML.g:852:1: ( '<' )
            {
            // InternalMyMML.g:852:1: ( '<' )
            // InternalMyMML.g:853:2: '<'
            {
             before(grammarAccess.getTestValueSizeAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTestValueSizeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__1__Impl"


    // $ANTLR start "rule__TestValueSize__Group__2"
    // InternalMyMML.g:862:1: rule__TestValueSize__Group__2 : rule__TestValueSize__Group__2__Impl rule__TestValueSize__Group__3 ;
    public final void rule__TestValueSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:866:1: ( rule__TestValueSize__Group__2__Impl rule__TestValueSize__Group__3 )
            // InternalMyMML.g:867:2: rule__TestValueSize__Group__2__Impl rule__TestValueSize__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TestValueSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestValueSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__2"


    // $ANTLR start "rule__TestValueSize__Group__2__Impl"
    // InternalMyMML.g:874:1: rule__TestValueSize__Group__2__Impl : ( ( rule__TestValueSize__SizeAssignment_2 ) ) ;
    public final void rule__TestValueSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:878:1: ( ( ( rule__TestValueSize__SizeAssignment_2 ) ) )
            // InternalMyMML.g:879:1: ( ( rule__TestValueSize__SizeAssignment_2 ) )
            {
            // InternalMyMML.g:879:1: ( ( rule__TestValueSize__SizeAssignment_2 ) )
            // InternalMyMML.g:880:2: ( rule__TestValueSize__SizeAssignment_2 )
            {
             before(grammarAccess.getTestValueSizeAccess().getSizeAssignment_2()); 
            // InternalMyMML.g:881:2: ( rule__TestValueSize__SizeAssignment_2 )
            // InternalMyMML.g:881:3: rule__TestValueSize__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TestValueSize__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestValueSizeAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__2__Impl"


    // $ANTLR start "rule__TestValueSize__Group__3"
    // InternalMyMML.g:889:1: rule__TestValueSize__Group__3 : rule__TestValueSize__Group__3__Impl ;
    public final void rule__TestValueSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:893:1: ( rule__TestValueSize__Group__3__Impl )
            // InternalMyMML.g:894:2: rule__TestValueSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestValueSize__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__3"


    // $ANTLR start "rule__TestValueSize__Group__3__Impl"
    // InternalMyMML.g:900:1: rule__TestValueSize__Group__3__Impl : ( '>' ) ;
    public final void rule__TestValueSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:904:1: ( ( '>' ) )
            // InternalMyMML.g:905:1: ( '>' )
            {
            // InternalMyMML.g:905:1: ( '>' )
            // InternalMyMML.g:906:2: '>'
            {
             before(grammarAccess.getTestValueSizeAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTestValueSizeAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__Group__3__Impl"


    // $ANTLR start "rule__TrainValueSize__Group__0"
    // InternalMyMML.g:916:1: rule__TrainValueSize__Group__0 : rule__TrainValueSize__Group__0__Impl rule__TrainValueSize__Group__1 ;
    public final void rule__TrainValueSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:920:1: ( rule__TrainValueSize__Group__0__Impl rule__TrainValueSize__Group__1 )
            // InternalMyMML.g:921:2: rule__TrainValueSize__Group__0__Impl rule__TrainValueSize__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TrainValueSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainValueSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__0"


    // $ANTLR start "rule__TrainValueSize__Group__0__Impl"
    // InternalMyMML.g:928:1: rule__TrainValueSize__Group__0__Impl : ( 'trainValueSize' ) ;
    public final void rule__TrainValueSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:932:1: ( ( 'trainValueSize' ) )
            // InternalMyMML.g:933:1: ( 'trainValueSize' )
            {
            // InternalMyMML.g:933:1: ( 'trainValueSize' )
            // InternalMyMML.g:934:2: 'trainValueSize'
            {
             before(grammarAccess.getTrainValueSizeAccess().getTrainValueSizeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTrainValueSizeAccess().getTrainValueSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__0__Impl"


    // $ANTLR start "rule__TrainValueSize__Group__1"
    // InternalMyMML.g:943:1: rule__TrainValueSize__Group__1 : rule__TrainValueSize__Group__1__Impl rule__TrainValueSize__Group__2 ;
    public final void rule__TrainValueSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:947:1: ( rule__TrainValueSize__Group__1__Impl rule__TrainValueSize__Group__2 )
            // InternalMyMML.g:948:2: rule__TrainValueSize__Group__1__Impl rule__TrainValueSize__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TrainValueSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainValueSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__1"


    // $ANTLR start "rule__TrainValueSize__Group__1__Impl"
    // InternalMyMML.g:955:1: rule__TrainValueSize__Group__1__Impl : ( '<' ) ;
    public final void rule__TrainValueSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:959:1: ( ( '<' ) )
            // InternalMyMML.g:960:1: ( '<' )
            {
            // InternalMyMML.g:960:1: ( '<' )
            // InternalMyMML.g:961:2: '<'
            {
             before(grammarAccess.getTrainValueSizeAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTrainValueSizeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__1__Impl"


    // $ANTLR start "rule__TrainValueSize__Group__2"
    // InternalMyMML.g:970:1: rule__TrainValueSize__Group__2 : rule__TrainValueSize__Group__2__Impl rule__TrainValueSize__Group__3 ;
    public final void rule__TrainValueSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:974:1: ( rule__TrainValueSize__Group__2__Impl rule__TrainValueSize__Group__3 )
            // InternalMyMML.g:975:2: rule__TrainValueSize__Group__2__Impl rule__TrainValueSize__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TrainValueSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainValueSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__2"


    // $ANTLR start "rule__TrainValueSize__Group__2__Impl"
    // InternalMyMML.g:982:1: rule__TrainValueSize__Group__2__Impl : ( ( rule__TrainValueSize__SizeAssignment_2 ) ) ;
    public final void rule__TrainValueSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:986:1: ( ( ( rule__TrainValueSize__SizeAssignment_2 ) ) )
            // InternalMyMML.g:987:1: ( ( rule__TrainValueSize__SizeAssignment_2 ) )
            {
            // InternalMyMML.g:987:1: ( ( rule__TrainValueSize__SizeAssignment_2 ) )
            // InternalMyMML.g:988:2: ( rule__TrainValueSize__SizeAssignment_2 )
            {
             before(grammarAccess.getTrainValueSizeAccess().getSizeAssignment_2()); 
            // InternalMyMML.g:989:2: ( rule__TrainValueSize__SizeAssignment_2 )
            // InternalMyMML.g:989:3: rule__TrainValueSize__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrainValueSize__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainValueSizeAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__2__Impl"


    // $ANTLR start "rule__TrainValueSize__Group__3"
    // InternalMyMML.g:997:1: rule__TrainValueSize__Group__3 : rule__TrainValueSize__Group__3__Impl ;
    public final void rule__TrainValueSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1001:1: ( rule__TrainValueSize__Group__3__Impl )
            // InternalMyMML.g:1002:2: rule__TrainValueSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainValueSize__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__3"


    // $ANTLR start "rule__TrainValueSize__Group__3__Impl"
    // InternalMyMML.g:1008:1: rule__TrainValueSize__Group__3__Impl : ( '>' ) ;
    public final void rule__TrainValueSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1012:1: ( ( '>' ) )
            // InternalMyMML.g:1013:1: ( '>' )
            {
            // InternalMyMML.g:1013:1: ( '>' )
            // InternalMyMML.g:1014:2: '>'
            {
             before(grammarAccess.getTrainValueSizeAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrainValueSizeAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__Group__3__Impl"


    // $ANTLR start "rule__AlgorithmSet__Group__0"
    // InternalMyMML.g:1024:1: rule__AlgorithmSet__Group__0 : rule__AlgorithmSet__Group__0__Impl rule__AlgorithmSet__Group__1 ;
    public final void rule__AlgorithmSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1028:1: ( rule__AlgorithmSet__Group__0__Impl rule__AlgorithmSet__Group__1 )
            // InternalMyMML.g:1029:2: rule__AlgorithmSet__Group__0__Impl rule__AlgorithmSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AlgorithmSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__0"


    // $ANTLR start "rule__AlgorithmSet__Group__0__Impl"
    // InternalMyMML.g:1036:1: rule__AlgorithmSet__Group__0__Impl : ( 'algorithmSet' ) ;
    public final void rule__AlgorithmSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1040:1: ( ( 'algorithmSet' ) )
            // InternalMyMML.g:1041:1: ( 'algorithmSet' )
            {
            // InternalMyMML.g:1041:1: ( 'algorithmSet' )
            // InternalMyMML.g:1042:2: 'algorithmSet'
            {
             before(grammarAccess.getAlgorithmSetAccess().getAlgorithmSetKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlgorithmSetAccess().getAlgorithmSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__0__Impl"


    // $ANTLR start "rule__AlgorithmSet__Group__1"
    // InternalMyMML.g:1051:1: rule__AlgorithmSet__Group__1 : rule__AlgorithmSet__Group__1__Impl rule__AlgorithmSet__Group__2 ;
    public final void rule__AlgorithmSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1055:1: ( rule__AlgorithmSet__Group__1__Impl rule__AlgorithmSet__Group__2 )
            // InternalMyMML.g:1056:2: rule__AlgorithmSet__Group__1__Impl rule__AlgorithmSet__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AlgorithmSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__1"


    // $ANTLR start "rule__AlgorithmSet__Group__1__Impl"
    // InternalMyMML.g:1063:1: rule__AlgorithmSet__Group__1__Impl : ( '<' ) ;
    public final void rule__AlgorithmSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1067:1: ( ( '<' ) )
            // InternalMyMML.g:1068:1: ( '<' )
            {
            // InternalMyMML.g:1068:1: ( '<' )
            // InternalMyMML.g:1069:2: '<'
            {
             before(grammarAccess.getAlgorithmSetAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlgorithmSetAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__1__Impl"


    // $ANTLR start "rule__AlgorithmSet__Group__2"
    // InternalMyMML.g:1078:1: rule__AlgorithmSet__Group__2 : rule__AlgorithmSet__Group__2__Impl rule__AlgorithmSet__Group__3 ;
    public final void rule__AlgorithmSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1082:1: ( rule__AlgorithmSet__Group__2__Impl rule__AlgorithmSet__Group__3 )
            // InternalMyMML.g:1083:2: rule__AlgorithmSet__Group__2__Impl rule__AlgorithmSet__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AlgorithmSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__2"


    // $ANTLR start "rule__AlgorithmSet__Group__2__Impl"
    // InternalMyMML.g:1090:1: rule__AlgorithmSet__Group__2__Impl : ( ( rule__AlgorithmSet__AlgoNameAssignment_2 ) ) ;
    public final void rule__AlgorithmSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1094:1: ( ( ( rule__AlgorithmSet__AlgoNameAssignment_2 ) ) )
            // InternalMyMML.g:1095:1: ( ( rule__AlgorithmSet__AlgoNameAssignment_2 ) )
            {
            // InternalMyMML.g:1095:1: ( ( rule__AlgorithmSet__AlgoNameAssignment_2 ) )
            // InternalMyMML.g:1096:2: ( rule__AlgorithmSet__AlgoNameAssignment_2 )
            {
             before(grammarAccess.getAlgorithmSetAccess().getAlgoNameAssignment_2()); 
            // InternalMyMML.g:1097:2: ( rule__AlgorithmSet__AlgoNameAssignment_2 )
            // InternalMyMML.g:1097:3: rule__AlgorithmSet__AlgoNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__AlgoNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmSetAccess().getAlgoNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__2__Impl"


    // $ANTLR start "rule__AlgorithmSet__Group__3"
    // InternalMyMML.g:1105:1: rule__AlgorithmSet__Group__3 : rule__AlgorithmSet__Group__3__Impl ;
    public final void rule__AlgorithmSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1109:1: ( rule__AlgorithmSet__Group__3__Impl )
            // InternalMyMML.g:1110:2: rule__AlgorithmSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlgorithmSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__3"


    // $ANTLR start "rule__AlgorithmSet__Group__3__Impl"
    // InternalMyMML.g:1116:1: rule__AlgorithmSet__Group__3__Impl : ( '>' ) ;
    public final void rule__AlgorithmSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1120:1: ( ( '>' ) )
            // InternalMyMML.g:1121:1: ( '>' )
            {
            // InternalMyMML.g:1121:1: ( '>' )
            // InternalMyMML.g:1122:2: '>'
            {
             before(grammarAccess.getAlgorithmSetAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlgorithmSetAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__Group__3__Impl"


    // $ANTLR start "rule__MMLGenerator__InstructionsAssignment"
    // InternalMyMML.g:1132:1: rule__MMLGenerator__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__MMLGenerator__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1136:1: ( ( ruleInstruction ) )
            // InternalMyMML.g:1137:2: ( ruleInstruction )
            {
            // InternalMyMML.g:1137:2: ( ruleInstruction )
            // InternalMyMML.g:1138:3: ruleInstruction
            {
             before(grammarAccess.getMMLGeneratorAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getMMLGeneratorAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLGenerator__InstructionsAssignment"


    // $ANTLR start "rule__PutIn__PutIdAssignment_1"
    // InternalMyMML.g:1147:1: rule__PutIn__PutIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__PutIn__PutIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1151:1: ( ( RULE_ID ) )
            // InternalMyMML.g:1152:2: ( RULE_ID )
            {
            // InternalMyMML.g:1152:2: ( RULE_ID )
            // InternalMyMML.g:1153:3: RULE_ID
            {
             before(grammarAccess.getPutInAccess().getPutIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPutInAccess().getPutIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__PutIdAssignment_1"


    // $ANTLR start "rule__PutIn__ValueAssignment_2"
    // InternalMyMML.g:1162:1: rule__PutIn__ValueAssignment_2 : ( ruleElement ) ;
    public final void rule__PutIn__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1166:1: ( ( ruleElement ) )
            // InternalMyMML.g:1167:2: ( ruleElement )
            {
            // InternalMyMML.g:1167:2: ( ruleElement )
            // InternalMyMML.g:1168:3: ruleElement
            {
             before(grammarAccess.getPutInAccess().getValueElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPutInAccess().getValueElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PutIn__ValueAssignment_2"


    // $ANTLR start "rule__FileSet__TextAssignment_2"
    // InternalMyMML.g:1177:1: rule__FileSet__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileSet__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1181:1: ( ( RULE_STRING ) )
            // InternalMyMML.g:1182:2: ( RULE_STRING )
            {
            // InternalMyMML.g:1182:2: ( RULE_STRING )
            // InternalMyMML.g:1183:3: RULE_STRING
            {
             before(grammarAccess.getFileSetAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileSetAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSet__TextAssignment_2"


    // $ANTLR start "rule__PredictiveColumns__ColumnAssignment_2"
    // InternalMyMML.g:1192:1: rule__PredictiveColumns__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PredictiveColumns__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1196:1: ( ( RULE_STRING ) )
            // InternalMyMML.g:1197:2: ( RULE_STRING )
            {
            // InternalMyMML.g:1197:2: ( RULE_STRING )
            // InternalMyMML.g:1198:3: RULE_STRING
            {
             before(grammarAccess.getPredictiveColumnsAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPredictiveColumnsAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveColumns__ColumnAssignment_2"


    // $ANTLR start "rule__CibleColumn__ColumnAssignment_2"
    // InternalMyMML.g:1207:1: rule__CibleColumn__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CibleColumn__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1211:1: ( ( RULE_STRING ) )
            // InternalMyMML.g:1212:2: ( RULE_STRING )
            {
            // InternalMyMML.g:1212:2: ( RULE_STRING )
            // InternalMyMML.g:1213:3: RULE_STRING
            {
             before(grammarAccess.getCibleColumnAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCibleColumnAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CibleColumn__ColumnAssignment_2"


    // $ANTLR start "rule__TestValueSize__SizeAssignment_2"
    // InternalMyMML.g:1222:1: rule__TestValueSize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__TestValueSize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1226:1: ( ( RULE_INT ) )
            // InternalMyMML.g:1227:2: ( RULE_INT )
            {
            // InternalMyMML.g:1227:2: ( RULE_INT )
            // InternalMyMML.g:1228:3: RULE_INT
            {
             before(grammarAccess.getTestValueSizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTestValueSizeAccess().getSizeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestValueSize__SizeAssignment_2"


    // $ANTLR start "rule__TrainValueSize__SizeAssignment_2"
    // InternalMyMML.g:1237:1: rule__TrainValueSize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__TrainValueSize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1241:1: ( ( RULE_INT ) )
            // InternalMyMML.g:1242:2: ( RULE_INT )
            {
            // InternalMyMML.g:1242:2: ( RULE_INT )
            // InternalMyMML.g:1243:3: RULE_INT
            {
             before(grammarAccess.getTrainValueSizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrainValueSizeAccess().getSizeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainValueSize__SizeAssignment_2"


    // $ANTLR start "rule__AlgorithmSet__AlgoNameAssignment_2"
    // InternalMyMML.g:1252:1: rule__AlgorithmSet__AlgoNameAssignment_2 : ( ruleAlgo ) ;
    public final void rule__AlgorithmSet__AlgoNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyMML.g:1256:1: ( ( ruleAlgo ) )
            // InternalMyMML.g:1257:2: ( ruleAlgo )
            {
            // InternalMyMML.g:1257:2: ( ruleAlgo )
            // InternalMyMML.g:1258:3: ruleAlgo
            {
             before(grammarAccess.getAlgorithmSetAccess().getAlgoNameAlgoEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgo();

            state._fsp--;

             after(grammarAccess.getAlgorithmSetAccess().getAlgoNameAlgoEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmSet__AlgoNameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F90000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});

}