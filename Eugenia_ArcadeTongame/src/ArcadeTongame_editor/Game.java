/**
 */
package ArcadeTongame_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.Game#getStages <em>Stages</em>}</li>
 *   <li>{@link ArcadeTongame_editor.Game#getStagesconnections <em>Stagesconnections</em>}</li>
 *   <li>{@link ArcadeTongame_editor.Game#getHeight <em>Height</em>}</li>
 *   <li>{@link ArcadeTongame_editor.Game#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getGame()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
   * The list contents are of type {@link ArcadeTongame_editor.Stage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stages</em>' containment reference list.
   * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getGame_Stages()
   * @model containment="true"
   * @generated
   */
  EList<Stage> getStages();

  /**
   * Returns the value of the '<em><b>Stagesconnections</b></em>' containment reference list.
   * The list contents are of type {@link ArcadeTongame_editor.StagesConnection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stagesconnections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stagesconnections</em>' containment reference list.
   * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getGame_Stagesconnections()
   * @model containment="true"
   * @generated
   */
  EList<StagesConnection> getStagesconnections();

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(float)
   * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getGame_Height()
   * @model
   * @generated
   */
  float getHeight();

  /**
   * Sets the value of the '{@link ArcadeTongame_editor.Game#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(float value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(float)
   * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getGame_Width()
   * @model
   * @generated
   */
  float getWidth();

  /**
   * Sets the value of the '{@link ArcadeTongame_editor.Game#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(float value);

} // Game
