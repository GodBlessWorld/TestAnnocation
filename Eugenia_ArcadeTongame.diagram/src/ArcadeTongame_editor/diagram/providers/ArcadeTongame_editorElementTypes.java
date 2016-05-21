package ArcadeTongame_editor.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ArcadeTongame_editorElementTypes {

	/**
	 * @generated
	 */
	private ArcadeTongame_editorElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Game_1000 = getElementType("Eugenia_ArcadeTongame.diagram.Game_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Stage_2001 = getElementType("Eugenia_ArcadeTongame.diagram.Stage_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wall_3001 = getElementType("Eugenia_ArcadeTongame.diagram.Wall_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sound_3002 = getElementType("Eugenia_ArcadeTongame.diagram.Sound_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Text_3003 = getElementType("Eugenia_ArcadeTongame.diagram.Text_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType In_3004 = getElementType("Eugenia_ArcadeTongame.diagram.In_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Out_3005 = getElementType("Eugenia_ArcadeTongame.diagram.Out_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StagesConnection_4001 = getElementType("Eugenia_ArcadeTongame.diagram.StagesConnection_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpenerOpens_4002 = getElementType("Eugenia_ArcadeTongame.diagram.OpenerOpens_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Game_1000,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getGame());

			elements.put(Stage_2001,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getStage());

			elements.put(Wall_3001,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getWall());

			elements.put(Sound_3002,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getSound());

			elements.put(Text_3003,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getText());

			elements.put(In_3004,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getIn());

			elements.put(Out_3005,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getOut());

			elements.put(StagesConnection_4001,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getStagesConnection());

			elements.put(OpenerOpens_4002,
					ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
							.getOpener_Opens());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Game_1000);
			KNOWN_ELEMENT_TYPES.add(Stage_2001);
			KNOWN_ELEMENT_TYPES.add(Wall_3001);
			KNOWN_ELEMENT_TYPES.add(Sound_3002);
			KNOWN_ELEMENT_TYPES.add(Text_3003);
			KNOWN_ELEMENT_TYPES.add(In_3004);
			KNOWN_ELEMENT_TYPES.add(Out_3005);
			KNOWN_ELEMENT_TYPES.add(StagesConnection_4001);
			KNOWN_ELEMENT_TYPES.add(OpenerOpens_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			return Game_1000;
		case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
			return Stage_2001;
		case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
			return Wall_3001;
		case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
			return Sound_3002;
		case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return Text_3003;
		case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
			return In_3004;
		case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
			return Out_3005;
		case ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID:
			return StagesConnection_4001;
		case ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart.VISUAL_ID:
			return OpenerOpens_4002;
		}
		return null;
	}

}
