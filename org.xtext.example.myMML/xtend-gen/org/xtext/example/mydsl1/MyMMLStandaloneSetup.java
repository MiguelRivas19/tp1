/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1;

import org.xtext.example.mydsl1.MyMMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyMMLStandaloneSetup extends MyMMLStandaloneSetupGenerated {
  public static void doSetup() {
    new MyMMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}