/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.myMML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.myMML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyMMLFactoryImpl extends EFactoryImpl implements MyMMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyMMLFactory init()
  {
    try
    {
      MyMMLFactory theMyMMLFactory = (MyMMLFactory)EPackage.Registry.INSTANCE.getEFactory(MyMMLPackage.eNS_URI);
      if (theMyMMLFactory != null)
      {
        return theMyMMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyMMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyMMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyMMLPackage.MML_GENERATOR: return createMMLGenerator();
      case MyMMLPackage.INSTRUCTION: return createInstruction();
      case MyMMLPackage.PUT_IN: return createPutIn();
      case MyMMLPackage.ELEMENT: return createElement();
      case MyMMLPackage.FILE_SET: return createFileSet();
      case MyMMLPackage.PREDICTIVE_COLUMNS: return createPredictiveColumns();
      case MyMMLPackage.CIBLE_COLUMN: return createCibleColumn();
      case MyMMLPackage.TEST_VALUE_SIZE: return createTestValueSize();
      case MyMMLPackage.TRAIN_VALUE_SIZE: return createTrainValueSize();
      case MyMMLPackage.ALGORITHM_SET: return createAlgorithmSet();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyMMLPackage.ALGO:
        return createAlgoFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyMMLPackage.ALGO:
        return convertAlgoToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MMLGenerator createMMLGenerator()
  {
    MMLGeneratorImpl mmlGenerator = new MMLGeneratorImpl();
    return mmlGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PutIn createPutIn()
  {
    PutInImpl putIn = new PutInImpl();
    return putIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileSet createFileSet()
  {
    FileSetImpl fileSet = new FileSetImpl();
    return fileSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredictiveColumns createPredictiveColumns()
  {
    PredictiveColumnsImpl predictiveColumns = new PredictiveColumnsImpl();
    return predictiveColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CibleColumn createCibleColumn()
  {
    CibleColumnImpl cibleColumn = new CibleColumnImpl();
    return cibleColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestValueSize createTestValueSize()
  {
    TestValueSizeImpl testValueSize = new TestValueSizeImpl();
    return testValueSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TrainValueSize createTrainValueSize()
  {
    TrainValueSizeImpl trainValueSize = new TrainValueSizeImpl();
    return trainValueSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgorithmSet createAlgorithmSet()
  {
    AlgorithmSetImpl algorithmSet = new AlgorithmSetImpl();
    return algorithmSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Algo createAlgoFromString(EDataType eDataType, String initialValue)
  {
    Algo result = Algo.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAlgoToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyMMLPackage getMyMMLPackage()
  {
    return (MyMMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyMMLPackage getPackage()
  {
    return MyMMLPackage.eINSTANCE;
  }

} //MyMMLFactoryImpl
