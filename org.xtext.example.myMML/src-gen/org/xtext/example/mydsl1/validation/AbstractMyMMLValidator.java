/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyMMLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.mydsl1.myMML.MyMMLPackage.eINSTANCE);
		return result;
	}
}
