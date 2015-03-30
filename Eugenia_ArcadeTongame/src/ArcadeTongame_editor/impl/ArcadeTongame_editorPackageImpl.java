/**
 */
package ArcadeTongame_editor.impl;

import ArcadeTongame_editor.ArcadeTongame_editorFactory;
import ArcadeTongame_editor.ArcadeTongame_editorPackage;
import ArcadeTongame_editor.Element;
import ArcadeTongame_editor.Game;
import ArcadeTongame_editor.In;
import ArcadeTongame_editor.Opener;
import ArcadeTongame_editor.Out;
import ArcadeTongame_editor.Sound;
import ArcadeTongame_editor.Stage;
import ArcadeTongame_editor.StagesConnection;
import ArcadeTongame_editor.Text;
import ArcadeTongame_editor.Wall;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcadeTongame_editorPackageImpl extends EPackageImpl implements ArcadeTongame_editorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stagesConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ArcadeTongame_editor.ArcadeTongame_editorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArcadeTongame_editorPackageImpl() {
		super(eNS_URI, ArcadeTongame_editorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArcadeTongame_editorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArcadeTongame_editorPackage init() {
		if (isInited) return (ArcadeTongame_editorPackage)EPackage.Registry.INSTANCE.getEPackage(ArcadeTongame_editorPackage.eNS_URI);

		// Obtain or create and register package
		ArcadeTongame_editorPackageImpl theArcadeTongame_editorPackage = (ArcadeTongame_editorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArcadeTongame_editorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArcadeTongame_editorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArcadeTongame_editorPackage.createPackageContents();

		// Initialize created meta-data
		theArcadeTongame_editorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArcadeTongame_editorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArcadeTongame_editorPackage.eNS_URI, theArcadeTongame_editorPackage);
		return theArcadeTongame_editorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Stages() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Stagesconnections() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Height() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Width() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Elements() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_Name() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStagesConnection() {
		return stagesConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStagesConnection_Source() {
		return (EReference)stagesConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStagesConnection_Target() {
		return (EReference)stagesConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Position_x() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Position_y() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Size_x() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Size_y() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpener() {
		return openerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpener_IsOpener() {
		return (EAttribute)openerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpener_Opens() {
		return (EReference)openerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWall() {
		return wallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSound() {
		return soundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSound_Filename() {
		return (EAttribute)soundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIn() {
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIn_IsStart() {
		return (EAttribute)inEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOut() {
		return outEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOut_IsOpen() {
		return (EAttribute)outEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcadeTongame_editorFactory getArcadeTongame_editorFactory() {
		return (ArcadeTongame_editorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__STAGES);
		createEReference(gameEClass, GAME__STAGESCONNECTIONS);
		createEAttribute(gameEClass, GAME__HEIGHT);
		createEAttribute(gameEClass, GAME__WIDTH);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__ELEMENTS);
		createEAttribute(stageEClass, STAGE__NAME);

		stagesConnectionEClass = createEClass(STAGES_CONNECTION);
		createEReference(stagesConnectionEClass, STAGES_CONNECTION__SOURCE);
		createEReference(stagesConnectionEClass, STAGES_CONNECTION__TARGET);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__POSITION_X);
		createEAttribute(elementEClass, ELEMENT__POSITION_Y);
		createEAttribute(elementEClass, ELEMENT__SIZE_X);
		createEAttribute(elementEClass, ELEMENT__SIZE_Y);

		openerEClass = createEClass(OPENER);
		createEAttribute(openerEClass, OPENER__IS_OPENER);
		createEReference(openerEClass, OPENER__OPENS);

		wallEClass = createEClass(WALL);

		soundEClass = createEClass(SOUND);
		createEAttribute(soundEClass, SOUND__FILENAME);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		inEClass = createEClass(IN);
		createEAttribute(inEClass, IN__IS_START);

		outEClass = createEClass(OUT);
		createEAttribute(outEClass, OUT__IS_OPEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		openerEClass.getESuperTypes().add(this.getElement());
		wallEClass.getESuperTypes().add(this.getOpener());
		soundEClass.getESuperTypes().add(this.getOpener());
		textEClass.getESuperTypes().add(this.getOpener());
		inEClass.getESuperTypes().add(this.getElement());
		outEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Stages(), this.getStage(), null, "stages", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Stagesconnections(), this.getStagesConnection(), null, "stagesconnections", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Elements(), this.getElement(), null, "elements", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stagesConnectionEClass, StagesConnection.class, "StagesConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStagesConnection_Source(), this.getOut(), null, "source", null, 0, 1, StagesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStagesConnection_Target(), this.getIn(), null, "target", null, 0, 1, StagesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Position_x(), ecorePackage.getEFloat(), "position_x", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Position_y(), ecorePackage.getEFloat(), "position_y", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Size_x(), ecorePackage.getEFloat(), "size_x", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Size_y(), ecorePackage.getEFloat(), "size_y", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openerEClass, Opener.class, "Opener", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpener_IsOpener(), ecorePackage.getEBoolean(), "isOpener", null, 0, 1, Opener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpener_Opens(), this.getOut(), null, "opens", null, 0, 1, Opener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wallEClass, Wall.class, "Wall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soundEClass, Sound.class, "Sound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSound_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Sound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIn_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, In.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outEClass, Out.class, "Out", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOut_IsOpen(), ecorePackage.getEBoolean(), "isOpen", null, 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });											
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";			
		addAnnotation
		  (gameEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });										
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";				
		addAnnotation
		  (stageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "90,250",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Stage32.ico"
		   });				
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });			
		addAnnotation
		  (wallEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.Wall",
			 "label.icon", "false",
			 "label.placement", "none",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Wall32.ico"
		   });		
		addAnnotation
		  (soundEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.Sound",
			 "label.icon", "false",
			 "label.placement", "none",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Sound32.ico"
		   });		
		addAnnotation
		  (textEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.Text",
			 "label.icon", "false",
			 "label.placement", "none",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Text32.ico"
		   });		
		addAnnotation
		  (inEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.In",
			 "label.icon", "false",
			 "label.placement", "none",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/In32.ico"
		   });		
		addAnnotation
		  (outEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.Out",
			 "label.icon", "false",
			 "label.placement", "none",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Out32.ico"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";					
		addAnnotation
		  (getStage_Elements(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });								
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";						
		addAnnotation
		  (stagesConnectionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "4",
			 "color", "35,35,142",
			 "target.decoration", "arrow",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/StagesConnection32.ico"
		   });			
		addAnnotation
		  (getOpener_Opens(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "width", "3",
			 "color", "0,100,0",
			 "tool.small.bundle", "Eugenia_ArcadeTongame",
			 "tool.small.path", "icons/Opens32.ico"
		   });					
	}

} //ArcadeTongame_editorPackageImpl
