package ArcadeTongame_editor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ArcadeTongame_editorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Eugenia_ArcadeTongame.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArcadeTongame_editor.diagram.edit.parts.GameEditPart.MODEL_ID
					.equals(view.getType())) {
				return ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
				.getGame().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArcadeTongame_editor.Game) domainElement)) {
			return ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getModelID(containerView);
		if (!ArcadeTongame_editor.diagram.edit.parts.GameEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArcadeTongame_editor.diagram.edit.parts.GameEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getStage().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID;
			}
			break;
		case ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getWall().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID;
			}
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getSound().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID;
			}
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getText().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getIn().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID;
			}
			if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getOut().isSuperTypeOf(domainElement.eClass())) {
				return ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getModelID(containerView);
		if (!ArcadeTongame_editor.diagram.edit.parts.GameEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArcadeTongame_editor.diagram.edit.parts.GameEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.diagram.edit.parts.StageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart.VISUAL_ID:
			if (ArcadeTongame_editor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
				.getStagesConnection().isSuperTypeOf(domainElement.eClass())) {
			return ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ArcadeTongame_editor.Game element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			return false;
		case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
		case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
		case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
		case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
		case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
