/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.myMML.CibleColumn;
import org.xtext.example.mydsl1.myMML.MyMMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cible Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myMML.impl.CibleColumnImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CibleColumnImpl extends ElementImpl implements CibleColumn
{
  /**
   * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected String column = COLUMN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CibleColumnImpl()
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
    return MyMMLPackage.Literals.CIBLE_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColumn(String newColumn)
  {
    String oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyMMLPackage.CIBLE_COLUMN__COLUMN, oldColumn, column));
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
      case MyMMLPackage.CIBLE_COLUMN__COLUMN:
        return getColumn();
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
      case MyMMLPackage.CIBLE_COLUMN__COLUMN:
        setColumn((String)newValue);
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
      case MyMMLPackage.CIBLE_COLUMN__COLUMN:
        setColumn(COLUMN_EDEFAULT);
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
      case MyMMLPackage.CIBLE_COLUMN__COLUMN:
        return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
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
    result.append(" (column: ");
    result.append(column);
    result.append(')');
    return result.toString();
  }

} //CibleColumnImpl