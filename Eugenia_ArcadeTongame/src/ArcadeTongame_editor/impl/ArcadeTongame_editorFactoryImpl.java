/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcadeTongame_editorFactoryImpl extends EFactoryImpl implements ArcadeTongame_editorFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ArcadeTongame_editorFactory init()
  {
		try {
			ArcadeTongame_editorFactory theArcadeTongame_editorFactory = (ArcadeTongame_editorFactory)EPackage.Registry.INSTANCE.getEFactory("http://wikis.uca.es/wikiPLII/index.php/Videojuegos_Educativos_DSL"); 
			if (theArcadeTongame_editorFactory != null) {
				return theArcadeTongame_editorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArcadeTongame_editorFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArcadeTongame_editorFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ArcadeTongame_editorPackage.GAME: return createGame();
			case ArcadeTongame_editorPackage.STAGE: return createStage();
			case ArcadeTongame_editorPackage.STAGES_CONNECTION: return createStagesConnection();
			case ArcadeTongame_editorPackage.WALL: return createWall();
			case ArcadeTongame_editorPackage.SOUND: return createSound();
			case ArcadeTongame_editorPackage.TEXT: return createText();
			case ArcadeTongame_editorPackage.IN: return createIn();
			case ArcadeTongame_editorPackage.OUT: return createOut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Game createGame()
  {
		GameImpl game = new GameImpl();
		return game;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Stage createStage()
  {
		StageImpl stage = new StageImpl();
		return stage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StagesConnection createStagesConnection()
  {
		StagesConnectionImpl stagesConnection = new StagesConnectionImpl();
		return stagesConnection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Wall createWall()
  {
		WallImpl wall = new WallImpl();
		return wall;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sound createSound()
  {
		SoundImpl sound = new SoundImpl();
		return sound;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Text createText()
  {
		TextImpl text = new TextImpl();
		return text;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public In createIn()
  {
		InImpl in = new InImpl();
		return in;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Out createOut()
  {
		OutImpl out = new OutImpl();
		return out;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArcadeTongame_editorPackage getArcadeTongame_editorPackage()
  {
		return (ArcadeTongame_editorPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ArcadeTongame_editorPackage getPackage()
  {
		return ArcadeTongame_editorPackage.eINSTANCE;
	}

} //ArcadeTongame_editorFactoryImpl
