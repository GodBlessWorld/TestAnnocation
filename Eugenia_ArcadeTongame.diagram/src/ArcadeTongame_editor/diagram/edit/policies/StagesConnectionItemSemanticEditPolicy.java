package ArcadeTongame_editor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class StagesConnectionItemSemanticEditPolicy
		extends
		ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StagesConnectionItemSemanticEditPolicy() {
		super(
				ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
