/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.Game;
import ArcadeTongame_editor.Stage;
import ArcadeTongame_editor.StagesConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArcadeTongame_editor.impl.GameImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.GameImpl#getStagesconnections <em>Stagesconnections</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.GameImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ArcadeTongame_editor.impl.GameImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends EObjectImpl implements Game
{
  /**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
  protected EList<Stage> stages;

  /**
	 * The cached value of the '{@link #getStagesconnections() <em>Stagesconnections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStagesconnections()
	 * @generated
	 * @ordered
	 */
  protected EList<StagesConnection> stagesconnections;

  /**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
  protected static final float HEIGHT_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
  protected float height = HEIGHT_EDEFAULT;

  /**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected static final float WIDTH_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected float width = WIDTH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GameImpl()
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
		return ArcadeTongame_editorPackage.Literals.GAME;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Stage> getStages()
  {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, ArcadeTongame_editorPackage.GAME__STAGES);
		}
		return stages;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<StagesConnection> getStagesconnections()
  {
		if (stagesconnections == null) {
			stagesconnections = new EObjectContainmentEList<StagesConnection>(StagesConnection.class, this, ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS);
		}
		return stagesconnections;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getHeight()
  {
		return height;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHeight(float newHeight)
  {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.GAME__HEIGHT, oldHeight, height));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getWidth()
  {
		return width;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWidth(float newWidth)
  {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArcadeTongame_editorPackage.GAME__WIDTH, oldWidth, width));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ArcadeTongame_editorPackage.GAME__STAGES:
				return ((InternalEList<?>)getStages()).basicRemove(otherEnd, msgs);
			case ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS:
				return ((InternalEList<?>)getStagesconnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ArcadeTongame_editorPackage.GAME__STAGES:
				return getStages();
			case ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS:
				return getStagesconnections();
			case ArcadeTongame_editorPackage.GAME__HEIGHT:
				return getHeight();
			case ArcadeTongame_editorPackage.GAME__WIDTH:
				return getWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ArcadeTongame_editorPackage.GAME__STAGES:
				getStages().clear();
				getStages().addAll((Collection<? extends Stage>)newValue);
				return;
			case ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS:
				getStagesconnections().clear();
				getStagesconnections().addAll((Collection<? extends StagesConnection>)newValue);
				return;
			case ArcadeTongame_editorPackage.GAME__HEIGHT:
				setHeight((Float)newValue);
				return;
			case ArcadeTongame_editorPackage.GAME__WIDTH:
				setWidth((Float)newValue);
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
			case ArcadeTongame_editorPackage.GAME__STAGES:
				getStages().clear();
				return;
			case ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS:
				getStagesconnections().clear();
				return;
			case ArcadeTongame_editorPackage.GAME__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ArcadeTongame_editorPackage.GAME__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case ArcadeTongame_editorPackage.GAME__STAGES:
				return stages != null && !stages.isEmpty();
			case ArcadeTongame_editorPackage.GAME__STAGESCONNECTIONS:
				return stagesconnections != null && !stagesconnections.isEmpty();
			case ArcadeTongame_editorPackage.GAME__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ArcadeTongame_editorPackage.GAME__WIDTH:
				return width != WIDTH_EDEFAULT;
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
		result.append(" (height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //GameImpl
