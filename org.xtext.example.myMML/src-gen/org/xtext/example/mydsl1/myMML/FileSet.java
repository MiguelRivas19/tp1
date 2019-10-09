/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myMML.FileSet#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myMML.MyMMLPackage#getFileSet()
 * @model
 * @generated
 */
public interface FileSet extends Element
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.xtext.example.mydsl1.myMML.MyMMLPackage#getFileSet_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myMML.FileSet#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // FileSet
