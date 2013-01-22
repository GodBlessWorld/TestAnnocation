package ArcadeTongame_editor.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ArcadeTongame_editorEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(view)) {

			case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.GameEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.StageEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.StageNameEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.StageNameEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.WallEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.SoundEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.TextEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.InEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.OutEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart(
						view);

			case ArcadeTongame_editor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new ArcadeTongame_editor.diagram.edit.parts.WrappingLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
