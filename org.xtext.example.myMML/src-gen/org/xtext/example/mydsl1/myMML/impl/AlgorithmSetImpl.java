/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.myMML.Algo;
import org.xtext.example.mydsl1.myMML.AlgorithmSet;
import org.xtext.example.mydsl1.myMML.MyMMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myMML.impl.AlgorithmSetImpl#getAlgoName <em>Algo Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmSetImpl extends ElementImpl implements AlgorithmSet
{
  /**
   * The default value of the '{@link #getAlgoName() <em>Algo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgoName()
   * @generated
   * @ordered
   */
  protected static final Algo ALGO_NAME_EDEFAULT = Algo.DECISION_TREE_CLASSIFIER;

  /**
   * The cached value of the '{@link #getAlgoName() <em>Algo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgoName()
   * @generated
   * @ordered
   */
  protected Algo algoName = ALGO_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlgorithmSetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyMMLPackage.Literals.ALGORITHM_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algo getAlgoName()
  {
    return algoName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgoName(Algo newAlgoName)
  {
    Algo oldAlgoName = algoName;
    algoName = newAlgoName == null ? ALGO_NAME_EDEFAULT : newAlgoName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyMMLPackage.ALGORITHM_SET__ALGO_NAME, oldAlgoName, algoName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyMMLPackage.ALGORITHM_SET__ALGO_NAME:
        return getAlgoName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyMMLPackage.ALGORITHM_SET__ALGO_NAME:
        setAlgoName((Algo)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyMMLPackage.ALGORITHM_SET__ALGO_NAME:
        setAlgoName(ALGO_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyMMLPackage.ALGORITHM_SET__ALGO_NAME:
        return algoName != ALGO_NAME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (algoName: ");
    result.append(algoName);
    result.append(')');
    return result.toString();
  }

} //AlgorithmSetImpl
