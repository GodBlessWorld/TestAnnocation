/**
 */
package ArcadeTongame_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.Opener#isIsOpener <em>Is Opener</em>}</li>
 *   <li>{@link ArcadeTongame_editor.Opener#getOpens <em>Opens</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getOpener()
 * @model abstract="true"
 * @generated
 */
public interface Opener extends Element
{
  /**
	 * Returns the value of the '<em><b>Is Opener</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Opener</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opener</em>' attribute.
	 * @see #setIsOpener(boolean)
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getOpener_IsOpener()
	 * @model
	 * @generated
	 */
  boolean isIsOpener();

  /**
	 * Sets the value of the '{@link ArcadeTongame_editor.Opener#isIsOpener <em>Is Opener</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Opener</em>' attribute.
	 * @see #isIsOpener()
	 * @generated
	 */
  void setIsOpener(boolean value);

  /**
	 * Returns the value of the '<em><b>Opens</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opens</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens</em>' reference.
	 * @see #setOpens(Out)
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#getOpener_Opens()
	 * @model annotation="gmf.link target.decoration='arrow' style='solid' tool.small.bundle='Eugenia_ArcadeTongame' tool.small.path='icons/opens24x24.ico'"
	 * @generated
	 */
  Out getOpens();

  /**
	 * Sets the value of the '{@link ArcadeTongame_editor.Opener#getOpens <em>Opens</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens</em>' reference.
	 * @see #getOpens()
	 * @generated
	 */
  void setOpens(Out value);

} // Opener
