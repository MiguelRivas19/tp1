/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl1.MyMMLRuntimeModule;
import org.xtext.example.mydsl1.MyMMLStandaloneSetup;
import org.xtext.example.mydsl1.ide.MyMMLIdeModule;
import org.xtext.example.mydsl1.web.MyMMLWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class MyMMLWebSetup extends MyMMLStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyMMLRuntimeModule _myMMLRuntimeModule = new MyMMLRuntimeModule();
    MyMMLIdeModule _myMMLIdeModule = new MyMMLIdeModule();
    MyMMLWebModule _myMMLWebModule = new MyMMLWebModule();
    return Guice.createInjector(Modules2.mixin(_myMMLRuntimeModule, _myMMLIdeModule, _myMMLWebModule));
  }
}