/**
 */
package ArcadeTongame_editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ArcadeTongame_editor.ArcadeTongame_editorFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ArcadeTongame_editorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ArcadeTongame_editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://wikis.uca.es/wikiPLII/index.php/Videojuegos_Educativos_DSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ArcadeTongame_editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArcadeTongame_editorPackage eINSTANCE = ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl.init();

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.GameImpl <em>Game</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.GameImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getGame()
   * @generated
   */
  int GAME = 0;

  /**
   * The feature id for the '<em><b>Stages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__STAGES = 0;

  /**
   * The feature id for the '<em><b>Stagesconnections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__STAGESCONNECTIONS = 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__HEIGHT = 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__WIDTH = 3;

  /**
   * The number of structural features of the '<em>Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.StageImpl <em>Stage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.StageImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getStage()
   * @generated
   */
  int STAGE = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__NAME = 1;

  /**
   * The number of structural features of the '<em>Stage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.StagesConnectionImpl <em>Stages Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.StagesConnectionImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getStagesConnection()
   * @generated
   */
  int STAGES_CONNECTION = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGES_CONNECTION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGES_CONNECTION__TARGET = 1;

  /**
   * The number of structural features of the '<em>Stages Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGES_CONNECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.ElementImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__POSITION_X = 1;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__POSITION_Y = 2;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__SIZE_X = 3;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__SIZE_Y = 4;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.OpenerImpl <em>Opener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.OpenerImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getOpener()
   * @generated
   */
  int OPENER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__POSITION_X = ELEMENT__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__POSITION_Y = ELEMENT__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__SIZE_X = ELEMENT__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__SIZE_Y = ELEMENT__SIZE_Y;

  /**
   * The feature id for the '<em><b>Opens</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER__OPENS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Opener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPENER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.WallImpl <em>Wall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.WallImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getWall()
   * @generated
   */
  int WALL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__NAME = OPENER__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__POSITION_X = OPENER__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__POSITION_Y = OPENER__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__SIZE_X = OPENER__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__SIZE_Y = OPENER__SIZE_Y;

  /**
   * The feature id for the '<em><b>Opens</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL__OPENS = OPENER__OPENS;

  /**
   * The number of structural features of the '<em>Wall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WALL_FEATURE_COUNT = OPENER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.SoundImpl <em>Sound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.SoundImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getSound()
   * @generated
   */
  int SOUND = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__NAME = OPENER__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__POSITION_X = OPENER__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__POSITION_Y = OPENER__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__SIZE_X = OPENER__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__SIZE_Y = OPENER__SIZE_Y;

  /**
   * The feature id for the '<em><b>Opens</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__OPENS = OPENER__OPENS;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__FILENAME = OPENER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND_FEATURE_COUNT = OPENER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.TextImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getText()
   * @generated
   */
  int TEXT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__NAME = OPENER__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__POSITION_X = OPENER__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__POSITION_Y = OPENER__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__SIZE_X = OPENER__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__SIZE_Y = OPENER__SIZE_Y;

  /**
   * The feature id for the '<em><b>Opens</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__OPENS = OPENER__OPENS;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXT = OPENER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = OPENER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.InImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getIn()
   * @generated
   */
  int IN = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__POSITION_X = ELEMENT__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__POSITION_Y = ELEMENT__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__SIZE_X = ELEMENT__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__SIZE_Y = ELEMENT__SIZE_Y;

  /**
   * The feature id for the '<em><b>Is Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__IS_START = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ArcadeTongame_editor.impl.OutImpl <em>Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ArcadeTongame_editor.impl.OutImpl
   * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getOut()
   * @generated
   */
  int OUT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Position x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__POSITION_X = ELEMENT__POSITION_X;

  /**
   * The feature id for the '<em><b>Position y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__POSITION_Y = ELEMENT__POSITION_Y;

  /**
   * The feature id for the '<em><b>Size x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__SIZE_X = ELEMENT__SIZE_X;

  /**
   * The feature id for the '<em><b>Size y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__SIZE_Y = ELEMENT__SIZE_Y;

  /**
   * The feature id for the '<em><b>Is Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__IS_OPEN = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game</em>'.
   * @see ArcadeTongame_editor.Game
   * @generated
   */
  EClass getGame();

  /**
   * Returns the meta object for the containment reference list '{@link ArcadeTongame_editor.Game#getStages <em>Stages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stages</em>'.
   * @see ArcadeTongame_editor.Game#getStages()
   * @see #getGame()
   * @generated
   */
  EReference getGame_Stages();

  /**
   * Returns the meta object for the containment reference list '{@link ArcadeTongame_editor.Game#getStagesconnections <em>Stagesconnections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stagesconnections</em>'.
   * @see ArcadeTongame_editor.Game#getStagesconnections()
   * @see #getGame()
   * @generated
   */
  EReference getGame_Stagesconnections();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Game#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see ArcadeTongame_editor.Game#getHeight()
   * @see #getGame()
   * @generated
   */
  EAttribute getGame_Height();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Game#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see ArcadeTongame_editor.Game#getWidth()
   * @see #getGame()
   * @generated
   */
  EAttribute getGame_Width();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Stage <em>Stage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stage</em>'.
   * @see ArcadeTongame_editor.Stage
   * @generated
   */
  EClass getStage();

  /**
   * Returns the meta object for the containment reference list '{@link ArcadeTongame_editor.Stage#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see ArcadeTongame_editor.Stage#getElements()
   * @see #getStage()
   * @generated
   */
  EReference getStage_Elements();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Stage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ArcadeTongame_editor.Stage#getName()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Name();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.StagesConnection <em>Stages Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stages Connection</em>'.
   * @see ArcadeTongame_editor.StagesConnection
   * @generated
   */
  EClass getStagesConnection();

  /**
   * Returns the meta object for the reference '{@link ArcadeTongame_editor.StagesConnection#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see ArcadeTongame_editor.StagesConnection#getSource()
   * @see #getStagesConnection()
   * @generated
   */
  EReference getStagesConnection_Source();

  /**
   * Returns the meta object for the reference '{@link ArcadeTongame_editor.StagesConnection#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see ArcadeTongame_editor.StagesConnection#getTarget()
   * @see #getStagesConnection()
   * @generated
   */
  EReference getStagesConnection_Target();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see ArcadeTongame_editor.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ArcadeTongame_editor.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Element#getPosition_x <em>Position x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position x</em>'.
   * @see ArcadeTongame_editor.Element#getPosition_x()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Position_x();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Element#getPosition_y <em>Position y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position y</em>'.
   * @see ArcadeTongame_editor.Element#getPosition_y()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Position_y();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Element#getSize_x <em>Size x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size x</em>'.
   * @see ArcadeTongame_editor.Element#getSize_x()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Size_x();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Element#getSize_y <em>Size y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size y</em>'.
   * @see ArcadeTongame_editor.Element#getSize_y()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Size_y();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Opener <em>Opener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opener</em>'.
   * @see ArcadeTongame_editor.Opener
   * @generated
   */
  EClass getOpener();

  /**
   * Returns the meta object for the reference '{@link ArcadeTongame_editor.Opener#getOpens <em>Opens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opens</em>'.
   * @see ArcadeTongame_editor.Opener#getOpens()
   * @see #getOpener()
   * @generated
   */
  EReference getOpener_Opens();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Wall <em>Wall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wall</em>'.
   * @see ArcadeTongame_editor.Wall
   * @generated
   */
  EClass getWall();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Sound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sound</em>'.
   * @see ArcadeTongame_editor.Sound
   * @generated
   */
  EClass getSound();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Sound#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see ArcadeTongame_editor.Sound#getFilename()
   * @see #getSound()
   * @generated
   */
  EAttribute getSound_Filename();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see ArcadeTongame_editor.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Text#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see ArcadeTongame_editor.Text#getText()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Text();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In</em>'.
   * @see ArcadeTongame_editor.In
   * @generated
   */
  EClass getIn();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.In#isIsStart <em>Is Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Start</em>'.
   * @see ArcadeTongame_editor.In#isIsStart()
   * @see #getIn()
   * @generated
   */
  EAttribute getIn_IsStart();

  /**
   * Returns the meta object for class '{@link ArcadeTongame_editor.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out</em>'.
   * @see ArcadeTongame_editor.Out
   * @generated
   */
  EClass getOut();

  /**
   * Returns the meta object for the attribute '{@link ArcadeTongame_editor.Out#isIsOpen <em>Is Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Open</em>'.
   * @see ArcadeTongame_editor.Out#isIsOpen()
   * @see #getOut()
   * @generated
   */
  EAttribute getOut_IsOpen();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArcadeTongame_editorFactory getArcadeTongame_editorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.GameImpl <em>Game</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.GameImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getGame()
     * @generated
     */
    EClass GAME = eINSTANCE.getGame();

    /**
     * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME__STAGES = eINSTANCE.getGame_Stages();

    /**
     * The meta object literal for the '<em><b>Stagesconnections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME__STAGESCONNECTIONS = eINSTANCE.getGame_Stagesconnections();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME__HEIGHT = eINSTANCE.getGame_Height();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME__WIDTH = eINSTANCE.getGame_Width();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.StageImpl <em>Stage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.StageImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getStage()
     * @generated
     */
    EClass STAGE = eINSTANCE.getStage();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAGE__ELEMENTS = eINSTANCE.getStage_Elements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.StagesConnectionImpl <em>Stages Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.StagesConnectionImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getStagesConnection()
     * @generated
     */
    EClass STAGES_CONNECTION = eINSTANCE.getStagesConnection();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAGES_CONNECTION__SOURCE = eINSTANCE.getStagesConnection_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAGES_CONNECTION__TARGET = eINSTANCE.getStagesConnection_Target();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.ElementImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Position x</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__POSITION_X = eINSTANCE.getElement_Position_x();

    /**
     * The meta object literal for the '<em><b>Position y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__POSITION_Y = eINSTANCE.getElement_Position_y();

    /**
     * The meta object literal for the '<em><b>Size x</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__SIZE_X = eINSTANCE.getElement_Size_x();

    /**
     * The meta object literal for the '<em><b>Size y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__SIZE_Y = eINSTANCE.getElement_Size_y();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.OpenerImpl <em>Opener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.OpenerImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getOpener()
     * @generated
     */
    EClass OPENER = eINSTANCE.getOpener();

    /**
     * The meta object literal for the '<em><b>Opens</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPENER__OPENS = eINSTANCE.getOpener_Opens();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.WallImpl <em>Wall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.WallImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getWall()
     * @generated
     */
    EClass WALL = eINSTANCE.getWall();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.SoundImpl <em>Sound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.SoundImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getSound()
     * @generated
     */
    EClass SOUND = eINSTANCE.getSound();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOUND__FILENAME = eINSTANCE.getSound_Filename();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.TextImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.InImpl <em>In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.InImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getIn()
     * @generated
     */
    EClass IN = eINSTANCE.getIn();

    /**
     * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN__IS_START = eINSTANCE.getIn_IsStart();

    /**
     * The meta object literal for the '{@link ArcadeTongame_editor.impl.OutImpl <em>Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ArcadeTongame_editor.impl.OutImpl
     * @see ArcadeTongame_editor.impl.ArcadeTongame_editorPackageImpl#getOut()
     * @generated
     */
    EClass OUT = eINSTANCE.getOut();

    /**
     * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT__IS_OPEN = eINSTANCE.getOut_IsOpen();

  }

} //ArcadeTongame_editorPackage
