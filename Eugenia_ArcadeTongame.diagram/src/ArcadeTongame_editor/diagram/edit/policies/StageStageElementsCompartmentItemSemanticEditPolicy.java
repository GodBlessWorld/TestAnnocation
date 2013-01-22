package ArcadeTongame_editor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StageStageElementsCompartmentItemSemanticEditPolicy
		extends
		ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StageStageElementsCompartmentItemSemanticEditPolicy() {
		super(
				ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Stage_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Wall_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ArcadeTongame_editor.diagram.edit.commands.WallCreateCommand(
					req));
		}
		if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Sound_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ArcadeTongame_editor.diagram.edit.commands.SoundCreateCommand(
					req));
		}
		if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Text_3003 == req
				.getElementType()) {
			return getGEFWrapper(new ArcadeTongame_editor.diagram.edit.commands.TextCreateCommand(
					req));
		}
		if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.In_3004 == req
				.getElementType()) {
			return getGEFWrapper(new ArcadeTongame_editor.diagram.edit.commands.InCreateCommand(
					req));
		}
		if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Out_3005 == req
				.getElementType()) {
			return getGEFWrapper(new ArcadeTongame_editor.diagram.edit.commands.OutCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
