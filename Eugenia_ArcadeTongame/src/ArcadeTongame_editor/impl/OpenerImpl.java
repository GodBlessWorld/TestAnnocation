/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.Opener;
import ArcadeTongame_editor.Out;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.impl.OpenerImpl#isIsOpener <em>Is Opener</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.OpenerImpl#getOpens <em>Opens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OpenerImpl extends ElementImpl implements Opener
{
  /**
	 * The default value of the '{@link #isIsOpener() <em>Is Opener</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIsOpener()
	 * @generated
	 * @ordered
	 */
  protected static final boolean IS_OPENER_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isIsOpener() <em>Is Opener</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIsOpener()
	 * @generated
	 * @ordered
	 */
  protected boolean isOpener = IS_OPENER_EDEFAULT;

  /**
	 * The cached value of the '{@link #getOpens() <em>Opens</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOpens()
	 * @generated
	 * @ordered
	 */
  protected Out opens;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OpenerImpl()
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
		return ArcadeTongame_editorPackage.Literals.OPENER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isIsOpener()
  {
		return isOpener;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIsOpener(boolean newIsOpener)
  {
		boolean oldIsOpener = isOpener;
		isOpener = newIsOpener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.OPENER__IS_OPENER, oldIsOpener, isOpener));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Out getOpens()
  {
		if (opens != null && opens.eIsProxy()) {
			InternalEObject oldOpens = (InternalEObject)opens;
			opens = (Out)eResolveProxy(oldOpens);
			if (opens != oldOpens) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArcadeTongame_editorPackage.OPENER__OPENS, oldOpens, opens));
			}
		}
		return opens;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Out basicGetOpens()
  {
		return opens;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOpens(Out newOpens)
  {
		Out oldOpens = opens;
		opens = newOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.OPENER__OPENS, oldOpens, opens));
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
			case ArcadeTongame_editorPackage.OPENER__IS_OPENER:
				return isIsOpener();
			case ArcadeTongame_editorPackage.OPENER__OPENS:
				if (resolve) return getOpens();
				return basicGetOpens();
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
			case ArcadeTongame_editorPackage.OPENER__IS_OPENER:
				setIsOpener((Boolean)newValue);
				return;
			case ArcadeTongame_editorPackage.OPENER__OPENS:
				setOpens((Out)newValue);
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
			case ArcadeTongame_editorPackage.OPENER__IS_OPENER:
				setIsOpener(IS_OPENER_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.OPENER__OPENS:
				setOpens((Out)null);
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
			case ArcadeTongame_editorPackage.OPENER__IS_OPENER:
				return isOpener != IS_OPENER_EDEFAULT;
			case ArcadeTongame_editorPackage.OPENER__OPENS:
				return opens != null;
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
		result.append(" (isOpener: ");
		result.append(isOpener);
		result.append(')');
		return result.toString();
	}

} //OpenerImpl
