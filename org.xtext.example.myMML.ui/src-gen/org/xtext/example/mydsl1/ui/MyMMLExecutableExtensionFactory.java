/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.myMML.ui.internal.MyMMLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyMMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MyMMLActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MyMMLActivator activator = MyMMLActivator.getInstance();
		return activator != null ? activator.getInjector(MyMMLActivator.ORG_XTEXT_EXAMPLE_MYDSL1_MYMML) : null;
	}

}
