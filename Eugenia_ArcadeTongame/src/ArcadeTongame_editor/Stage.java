/**
 */
package ArcadeTongame_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.Stage#getElements <em>Elements</em>}</li>
 *   <li>{@link ArcadeTongame_editor.Stage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStage()
 * @model annotation="gmf.node label='name' size='250,200' tool.small.bundle='Eugenia_ArcadeTongame' tool.small.path='icons/Stage24x24.ico'"
 * @generated
 */
public interface Stage extends EObject
{
  /**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ArcadeTongame_editor.Element}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStage_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  EList<Element> getElements();

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getStage_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link ArcadeTongame_editor.Stage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Stage
