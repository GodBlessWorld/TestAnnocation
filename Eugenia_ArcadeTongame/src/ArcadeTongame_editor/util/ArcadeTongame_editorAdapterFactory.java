/**
 */
package ArcadeTongame_editor.util;

import ArcadeTongame_editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage
 * @generated
 */
public class ArcadeTongame_editorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArcadeTongame_editorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArcadeTongame_editorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArcadeTongame_editorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArcadeTongame_editorSwitch<Adapter> modelSwitch =
    new ArcadeTongame_editorSwitch<Adapter>()
    {
      @Override
      public Adapter caseGame(Game object)
      {
        return createGameAdapter();
      }
      @Override
      public Adapter caseStage(Stage object)
      {
        return createStageAdapter();
      }
      @Override
      public Adapter caseStagesConnection(StagesConnection object)
      {
        return createStagesConnectionAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseOpener(Opener object)
      {
        return createOpenerAdapter();
      }
      @Override
      public Adapter caseWall(Wall object)
      {
        return createWallAdapter();
      }
      @Override
      public Adapter caseSound(Sound object)
      {
        return createSoundAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseIn(In object)
      {
        return createInAdapter();
      }
      @Override
      public Adapter caseOut(Out object)
      {
        return createOutAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Game
   * @generated
   */
  public Adapter createGameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Stage <em>Stage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Stage
   * @generated
   */
  public Adapter createStageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.StagesConnection <em>Stages Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.StagesConnection
   * @generated
   */
  public Adapter createStagesConnectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Opener <em>Opener</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Opener
   * @generated
   */
  public Adapter createOpenerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Wall <em>Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Wall
   * @generated
   */
  public Adapter createWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Sound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Sound
   * @generated
   */
  public Adapter createSoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.In
   * @generated
   */
  public Adapter createInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ArcadeTongame_editor.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ArcadeTongame_editor.Out
   * @generated
   */
  public Adapter createOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArcadeTongame_editorAdapterFactory
