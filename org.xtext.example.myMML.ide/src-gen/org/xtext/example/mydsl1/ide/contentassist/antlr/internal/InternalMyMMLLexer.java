package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyMMLLexer extends Lexer {
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

    public InternalMyMMLLexer() {;} 
    public InternalMyMMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyMMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyMML.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:11:7: ( 'DecisionTreeClassifier' )
            // InternalMyMML.g:11:9: 'DecisionTreeClassifier'
            {
            match("DecisionTreeClassifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:12:7: ( 'SVM' )
            // InternalMyMML.g:12:9: 'SVM'
            {
            match("SVM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:13:7: ( 'J48' )
            // InternalMyMML.g:13:9: 'J48'
            {
            match("J48"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:14:7: ( 'NaiveBayes' )
            // InternalMyMML.g:14:9: 'NaiveBayes'
            {
            match("NaiveBayes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:15:7: ( 'putIn' )
            // InternalMyMML.g:15:9: 'putIn'
            {
            match("putIn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:16:7: ( 'fileSet' )
            // InternalMyMML.g:16:9: 'fileSet'
            {
            match("fileSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:17:7: ( '<' )
            // InternalMyMML.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:18:7: ( '>' )
            // InternalMyMML.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:19:7: ( 'predictiveColumns' )
            // InternalMyMML.g:19:9: 'predictiveColumns'
            {
            match("predictiveColumns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:20:7: ( 'CibleColumn' )
            // InternalMyMML.g:20:9: 'CibleColumn'
            {
            match("CibleColumn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:21:7: ( 'testValueSize' )
            // InternalMyMML.g:21:9: 'testValueSize'
            {
            match("testValueSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:22:7: ( 'trainValueSize' )
            // InternalMyMML.g:22:9: 'trainValueSize'
            {
            match("trainValueSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:23:7: ( 'algorithmSet' )
            // InternalMyMML.g:23:9: 'algorithmSet'
            {
            match("algorithmSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1267:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyMML.g:1267:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyMML.g:1267:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyMML.g:1267:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyMML.g:1267:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyMML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1269:10: ( ( '0' .. '9' )+ )
            // InternalMyMML.g:1269:12: ( '0' .. '9' )+
            {
            // InternalMyMML.g:1269:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyMML.g:1269:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1271:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyMML.g:1271:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyMML.g:1271:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyMML.g:1271:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyMML.g:1271:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyMML.g:1271:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyMML.g:1271:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyMML.g:1271:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyMML.g:1271:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyMML.g:1271:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyMML.g:1271:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1273:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyMML.g:1273:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyMML.g:1273:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyMML.g:1273:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1275:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyMML.g:1275:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyMML.g:1275:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyMML.g:1275:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyMML.g:1275:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyMML.g:1275:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyMML.g:1275:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyMML.g:1275:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1277:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyMML.g:1277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyMML.g:1277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyMML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyMML.g:1279:16: ( . )
            // InternalMyMML.g:1279:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyMML.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=20;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyMML.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyMML.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyMML.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyMML.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyMML.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyMML.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyMML.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyMML.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyMML.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyMML.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyMML.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyMML.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyMML.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyMML.g:1:88: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalMyMML.g:1:96: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalMyMML.g:1:105: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalMyMML.g:1:117: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalMyMML.g:1:133: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalMyMML.g:1:149: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalMyMML.g:1:157: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\25\2\uffff\3\25\1\23\2\uffff\3\23\2\uffff\1\25\1\uffff\6\25\2\uffff\4\25\5\uffff\1\25\1\63\1\64\11\25\2\uffff\12\25\1\110\10\25\1\uffff\11\25\1\132\7\25\1\uffff\14\25\1\156\6\25\1\uffff\1\25\1\166\5\25\1\uffff\2\25\1\176\2\25\1\u0081\1\25\1\uffff\2\25\1\uffff\1\u0085\2\25\1\uffff\3\25\1\u008b\1\25\1\uffff\3\25\1\u0090\1\uffff";
    static final String DFA12_eofS =
        "\u0091\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\126\1\64\1\141\1\162\1\151\2\uffff\1\151\1\145\1\154\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\uffff\1\115\1\70\1\151\1\164\1\145\1\154\2\uffff\1\142\1\163\1\141\1\147\5\uffff\1\151\2\60\1\166\1\111\1\144\1\145\1\154\1\164\1\151\1\157\1\163\2\uffff\1\145\1\156\1\151\1\123\1\145\1\126\1\156\1\162\1\151\1\102\1\60\1\143\1\145\1\103\1\141\1\126\1\151\1\157\1\141\1\uffff\2\164\1\157\1\154\1\141\1\164\1\156\1\171\1\151\1\60\1\154\1\165\1\154\1\150\1\124\1\145\1\166\1\uffff\1\165\1\145\1\165\1\155\1\162\1\163\1\145\1\155\1\123\1\145\1\123\1\145\1\60\1\103\1\156\1\151\1\123\2\145\1\uffff\1\157\1\60\1\172\1\151\1\164\1\103\1\154\1\uffff\1\145\1\172\1\60\1\154\1\165\1\60\1\145\1\uffff\1\141\1\155\1\uffff\1\60\1\163\1\156\1\uffff\2\163\1\151\1\60\1\146\1\uffff\1\151\1\145\1\162\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\126\1\64\1\141\1\165\1\151\2\uffff\1\151\1\162\1\154\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\uffff\1\115\1\70\1\151\1\164\1\145\1\154\2\uffff\1\142\1\163\1\141\1\147\5\uffff\1\151\2\172\1\166\1\111\1\144\1\145\1\154\1\164\1\151\1\157\1\163\2\uffff\1\145\1\156\1\151\1\123\1\145\1\126\1\156\1\162\1\151\1\102\1\172\1\143\1\145\1\103\1\141\1\126\1\151\1\157\1\141\1\uffff\2\164\1\157\1\154\1\141\1\164\1\156\1\171\1\151\1\172\1\154\1\165\1\154\1\150\1\124\1\145\1\166\1\uffff\1\165\1\145\1\165\1\155\1\162\1\163\1\145\1\155\1\123\1\145\1\123\1\145\1\172\1\103\1\156\1\151\1\123\2\145\1\uffff\1\157\2\172\1\151\1\164\1\103\1\154\1\uffff\1\145\2\172\1\154\1\165\1\172\1\145\1\uffff\1\141\1\155\1\uffff\1\172\1\163\1\156\1\uffff\2\163\1\151\1\172\1\146\1\uffff\1\151\1\145\1\162\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\7\1\10\4\uffff\1\16\1\17\3\uffff\1\23\1\24\1\uffff\1\16\6\uffff\1\7\1\10\4\uffff\1\17\1\20\1\21\1\22\1\23\14\uffff\1\2\1\3\23\uffff\1\5\21\uffff\1\6\23\uffff\1\4\7\uffff\1\12\7\uffff\1\15\2\uffff\1\13\3\uffff\1\14\5\uffff\1\11\4\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\16\uffff\1\2\1\0\u0080\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\7\23\1\21\12\16\2\23\1\7\1\23\1\10\2\23\2\15\1\11\1\1\5\15\1\3\3\15\1\4\4\15\1\2\7\15\3\23\1\14\1\15\1\23\1\13\4\15\1\6\11\15\1\5\3\15\1\12\6\15\uff85\23",
            "\1\24",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\2\uffff\1\31",
            "\1\33",
            "",
            "",
            "\1\36",
            "\1\37\14\uffff\1\40",
            "\1\41",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\177",
            "\1\u0080",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='D') ) {s = 1;}

                        else if ( (LA12_0=='S') ) {s = 2;}

                        else if ( (LA12_0=='J') ) {s = 3;}

                        else if ( (LA12_0=='N') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='<') ) {s = 7;}

                        else if ( (LA12_0=='>') ) {s = 8;}

                        else if ( (LA12_0=='C') ) {s = 9;}

                        else if ( (LA12_0=='t') ) {s = 10;}

                        else if ( (LA12_0=='a') ) {s = 11;}

                        else if ( (LA12_0=='^') ) {s = 12;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='E' && LA12_0<='I')||(LA12_0>='K' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 13;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 14;}

                        else if ( (LA12_0=='\"') ) {s = 15;}

                        else if ( (LA12_0=='\'') ) {s = 16;}

                        else if ( (LA12_0=='/') ) {s = 17;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 18;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}