/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl1.parser.antlr.internal.InternalMyMMLParser;
import org.xtext.example.mydsl1.services.MyMMLGrammarAccess;

public class MyMMLParser extends AbstractAntlrParser {

	@Inject
	private MyMMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyMMLParser createParser(XtextTokenStream stream) {
		return new InternalMyMMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MMLGenerator";
	}

	public MyMMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyMMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}