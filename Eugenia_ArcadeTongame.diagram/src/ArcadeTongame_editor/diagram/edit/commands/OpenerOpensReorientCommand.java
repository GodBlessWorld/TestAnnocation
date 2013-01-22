package ArcadeTongame_editor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class OpenerOpensReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public OpenerOpensReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ArcadeTongame_editor.Opener) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ArcadeTongame_editor.Out && newEnd instanceof ArcadeTongame_editor.Opener)) {
			return false;
		}
		return ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOpenerOpens_4002(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArcadeTongame_editor.Out && newEnd instanceof ArcadeTongame_editor.Out)) {
			return false;
		}
		return ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOpenerOpens_4002(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setOpens(null);
		getNewSource().setOpens(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setOpens(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Opener getOldSource() {
		return (ArcadeTongame_editor.Opener) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Opener getNewSource() {
		return (ArcadeTongame_editor.Opener) newEnd;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Out getOldTarget() {
		return (ArcadeTongame_editor.Out) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Out getNewTarget() {
		return (ArcadeTongame_editor.Out) newEnd;
	}
}
