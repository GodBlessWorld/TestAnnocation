/**
 */
package ArcadeTongame_editor.util;

import ArcadeTongame_editor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage
 * @generated
 */
public class ArcadeTongame_editorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArcadeTongame_editorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArcadeTongame_editorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArcadeTongame_editorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArcadeTongame_editorPackage.GAME:
      {
        Game game = (Game)theEObject;
        T result = caseGame(game);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.STAGE:
      {
        Stage stage = (Stage)theEObject;
        T result = caseStage(stage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.STAGES_CONNECTION:
      {
        StagesConnection stagesConnection = (StagesConnection)theEObject;
        T result = caseStagesConnection(stagesConnection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.OPENER:
      {
        Opener opener = (Opener)theEObject;
        T result = caseOpener(opener);
        if (result == null) result = caseElement(opener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.WALL:
      {
        Wall wall = (Wall)theEObject;
        T result = caseWall(wall);
        if (result == null) result = caseOpener(wall);
        if (result == null) result = caseElement(wall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.SOUND:
      {
        Sound sound = (Sound)theEObject;
        T result = caseSound(sound);
        if (result == null) result = caseOpener(sound);
        if (result == null) result = caseElement(sound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseOpener(text);
        if (result == null) result = caseElement(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.IN:
      {
        In in = (In)theEObject;
        T result = caseIn(in);
        if (result == null) result = caseElement(in);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArcadeTongame_editorPackage.OUT:
      {
        Out out = (Out)theEObject;
        T result = caseOut(out);
        if (result == null) result = caseElement(out);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGame(Game object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStage(Stage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stages Connection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stages Connection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStagesConnection(StagesConnection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opener</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpener(Opener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wall</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wall</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWall(Wall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSound(Sound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn(In object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOut(Out object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArcadeTongame_editorSwitch
