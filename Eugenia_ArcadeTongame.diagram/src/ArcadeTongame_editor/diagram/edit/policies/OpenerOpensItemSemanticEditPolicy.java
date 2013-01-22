package ArcadeTongame_editor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class OpenerOpensItemSemanticEditPolicy
		extends
		ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OpenerOpensItemSemanticEditPolicy() {
		super(
				ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.OpenerOpens_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
