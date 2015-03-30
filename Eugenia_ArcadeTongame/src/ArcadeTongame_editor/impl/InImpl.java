/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.In;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.impl.InImpl#isIsStart <em>Is Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InImpl extends ElementImpl implements In {
	/**
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArcadeTongame_editorPackage.Literals.IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.IN__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArcadeTongame_editorPackage.IN__IS_START:
				return isIsStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArcadeTongame_editorPackage.IN__IS_START:
				setIsStart((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArcadeTongame_editorPackage.IN__IS_START:
				setIsStart(IS_START_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArcadeTongame_editorPackage.IN__IS_START:
				return isStart != IS_START_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStart: ");
		result.append(isStart);
		result.append(')');
		return result.toString();
	}

} //InImpl
