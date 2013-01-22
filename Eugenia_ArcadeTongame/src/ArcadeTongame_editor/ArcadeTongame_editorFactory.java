/**
 */
package ArcadeTongame_editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage
 * @generated
 */
public interface ArcadeTongame_editorFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ArcadeTongame_editorFactory eINSTANCE = ArcadeTongame_editor.impl.ArcadeTongame_editorFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
  Game createGame();

  /**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
  Stage createStage();

  /**
	 * Returns a new object of class '<em>Stages Connection</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stages Connection</em>'.
	 * @generated
	 */
  StagesConnection createStagesConnection();

  /**
	 * Returns a new object of class '<em>Wall</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall</em>'.
	 * @generated
	 */
  Wall createWall();

  /**
	 * Returns a new object of class '<em>Sound</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound</em>'.
	 * @generated
	 */
  Sound createSound();

  /**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
  Text createText();

  /**
	 * Returns a new object of class '<em>In</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>In</em>'.
	 * @generated
	 */
  In createIn();

  /**
	 * Returns a new object of class '<em>Out</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out</em>'.
	 * @generated
	 */
  Out createOut();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ArcadeTongame_editorPackage getArcadeTongame_editorPackage();

} //ArcadeTongame_editorFactory
