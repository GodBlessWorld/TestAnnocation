/**
 */
package ArcadeTongame_editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stages Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.StagesConnection#getSource <em>Source</em>}</li>
 *   <li>{@link ArcadeTongame_editor.StagesConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStagesConnection()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2'"
 * @generated
 */
public interface StagesConnection extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Out)
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStagesConnection_Source()
	 * @model
	 * @generated
	 */
  Out getSource();

  /**
	 * Sets the value of the '{@link ArcadeTongame_editor.StagesConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(Out value);

  /**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(In)
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStagesConnection_Target()
	 * @model
	 * @generated
	 */
  In getTarget();

  /**
	 * Sets the value of the '{@link ArcadeTongame_editor.StagesConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
  void setTarget(In value);

} // StagesConnection
