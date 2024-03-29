/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl1.MyMMLRuntimeModule;
import org.xtext.example.mydsl1.MyMMLStandaloneSetup;
import org.xtext.example.mydsl1.ide.MyMMLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyMMLIdeSetup extends MyMMLStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyMMLRuntimeModule _myMMLRuntimeModule = new MyMMLRuntimeModule();
    MyMMLIdeModule _myMMLIdeModule = new MyMMLIdeModule();
    return Guice.createInjector(Modules2.mixin(_myMMLRuntimeModule, _myMMLIdeModule));
  }
}
