/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MML Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myMML.MMLGenerator#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myMML.MyMMLPackage#getMMLGenerator()
 * @model
 * @generated
 */
public interface MMLGenerator extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myMML.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myMML.MyMMLPackage#getMMLGenerator_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // MMLGenerator