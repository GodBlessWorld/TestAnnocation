/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.ElementImpl#getPosition_x <em>Position x</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.ElementImpl#getPosition_y <em>Position y</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.ElementImpl#getSize_x <em>Size x</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.ElementImpl#getSize_y <em>Size y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition_x() <em>Position x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_x()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosition_x() <em>Position x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_x()
	 * @generated
	 * @ordered
	 */
	protected float position_x = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition_y() <em>Position y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_y()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosition_y() <em>Position y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_y()
	 * @generated
	 * @ordered
	 */
	protected float position_y = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize_x() <em>Size x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_x()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize_x() <em>Size x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_x()
	 * @generated
	 * @ordered
	 */
	protected float size_x = SIZE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize_y() <em>Size y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_y()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize_y() <em>Size y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_y()
	 * @generated
	 * @ordered
	 */
	protected float size_y = SIZE_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArcadeTongame_editorPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosition_x() {
		return position_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition_x(float newPosition_x) {
		float oldPosition_x = position_x;
		position_x = newPosition_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.ELEMENT__POSITION_X, oldPosition_x, position_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosition_y() {
		return position_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition_y(float newPosition_y) {
		float oldPosition_y = position_y;
		position_y = newPosition_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.ELEMENT__POSITION_Y, oldPosition_y, position_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize_x() {
		return size_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_x(float newSize_x) {
		float oldSize_x = size_x;
		size_x = newSize_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.ELEMENT__SIZE_X, oldSize_x, size_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize_y() {
		return size_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_y(float newSize_y) {
		float oldSize_y = size_y;
		size_y = newSize_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.ELEMENT__SIZE_Y, oldSize_y, size_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArcadeTongame_editorPackage.ELEMENT__NAME:
				return getName();
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_X:
				return getPosition_x();
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_Y:
				return getPosition_y();
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_X:
				return getSize_x();
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_Y:
				return getSize_y();
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
			case ArcadeTongame_editorPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_X:
				setPosition_x((Float)newValue);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_Y:
				setPosition_y((Float)newValue);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_X:
				setSize_x((Float)newValue);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_Y:
				setSize_y((Float)newValue);
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
			case ArcadeTongame_editorPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_X:
				setPosition_x(POSITION_X_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_Y:
				setPosition_y(POSITION_Y_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_X:
				setSize_x(SIZE_X_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_Y:
				setSize_y(SIZE_Y_EDEFAULT);
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
			case ArcadeTongame_editorPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_X:
				return position_x != POSITION_X_EDEFAULT;
			case ArcadeTongame_editorPackage.ELEMENT__POSITION_Y:
				return position_y != POSITION_Y_EDEFAULT;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_X:
				return size_x != SIZE_X_EDEFAULT;
			case ArcadeTongame_editorPackage.ELEMENT__SIZE_Y:
				return size_y != SIZE_Y_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", position_x: ");
		result.append(position_x);
		result.append(", position_y: ");
		result.append(position_y);
		result.append(", size_x: ");
		result.append(size_x);
		result.append(", size_y: ");
		result.append(size_y);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
