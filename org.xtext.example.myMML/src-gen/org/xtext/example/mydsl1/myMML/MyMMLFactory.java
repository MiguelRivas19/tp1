/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.myMML.MyMMLPackage
 * @generated
 */
public interface MyMMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyMMLFactory eINSTANCE = org.xtext.example.mydsl1.myMML.impl.MyMMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>MML Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MML Generator</em>'.
   * @generated
   */
  MMLGenerator createMMLGenerator();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Strategy Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strategy Set</em>'.
   * @generated
   */
  StrategySet createStrategySet();

  /**
   * Returns a new object of class '<em>Result Display Params Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Display Params Set</em>'.
   * @generated
   */
  ResultDisplayParamsSet createResultDisplayParamsSet();

  /**
   * Returns a new object of class '<em>Put In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Put In</em>'.
   * @generated
   */
  PutIn createPutIn();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>File Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Set</em>'.
   * @generated
   */
  FileSet createFileSet();

  /**
   * Returns a new object of class '<em>Predictive Columns</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predictive Columns</em>'.
   * @generated
   */
  PredictiveColumns createPredictiveColumns();

  /**
   * Returns a new object of class '<em>Cible Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cible Column</em>'.
   * @generated
   */
  CibleColumn createCibleColumn();

  /**
   * Returns a new object of class '<em>Test Value Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Value Size</em>'.
   * @generated
   */
  TestValueSize createTestValueSize();

  /**
   * Returns a new object of class '<em>Train Value Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Train Value Size</em>'.
   * @generated
   */
  TrainValueSize createTrainValueSize();

  /**
   * Returns a new object of class '<em>Algorithm Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm Set</em>'.
   * @generated
   */
  AlgorithmSet createAlgorithmSet();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyMMLPackage getMyMMLPackage();

} //MyMMLFactory
