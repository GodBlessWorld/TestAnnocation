/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.Out;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.impl.OutImpl#isIsOpen <em>Is Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutImpl extends ElementImpl implements Out
{
  /**
	 * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
  protected static final boolean IS_OPEN_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
  protected boolean isOpen = IS_OPEN_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OutImpl()
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
		return ArcadeTongame_editorPackage.Literals.OUT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isIsOpen()
  {
		return isOpen;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIsOpen(boolean newIsOpen)
  {
		boolean oldIsOpen = isOpen;
		isOpen = newIsOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.OUT__IS_OPEN, oldIsOpen, isOpen));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ArcadeTongame_editorPackage.OUT__IS_OPEN:
				return isIsOpen();
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
		switch (featureID) {
			case ArcadeTongame_editorPackage.OUT__IS_OPEN:
				setIsOpen((Boolean)newValue);
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
		switch (featureID) {
			case ArcadeTongame_editorPackage.OUT__IS_OPEN:
				setIsOpen(IS_OPEN_EDEFAULT);
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
		switch (featureID) {
			case ArcadeTongame_editorPackage.OUT__IS_OPEN:
				return isOpen != IS_OPEN_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOpen: ");
		result.append(isOpen);
		result.append(')');
		return result.toString();
	}

} //OutImpl
