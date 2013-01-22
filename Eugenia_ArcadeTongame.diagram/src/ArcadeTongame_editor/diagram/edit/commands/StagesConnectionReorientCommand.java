package ArcadeTongame_editor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class StagesConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public StagesConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ArcadeTongame_editor.StagesConnection) {
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
		if (!(oldEnd instanceof ArcadeTongame_editor.Out && newEnd instanceof ArcadeTongame_editor.Out)) {
			return false;
		}
		ArcadeTongame_editor.In target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ArcadeTongame_editor.Game)) {
			return false;
		}
		ArcadeTongame_editor.Game container = (ArcadeTongame_editor.Game) getLink()
				.eContainer();
		return ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistStagesConnection_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArcadeTongame_editor.In && newEnd instanceof ArcadeTongame_editor.In)) {
			return false;
		}
		ArcadeTongame_editor.Out source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ArcadeTongame_editor.Game)) {
			return false;
		}
		ArcadeTongame_editor.Game container = (ArcadeTongame_editor.Game) getLink()
				.eContainer();
		return ArcadeTongame_editor.diagram.edit.policies.ArcadeTongame_editorBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistStagesConnection_4001(container,
						getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.StagesConnection getLink() {
		return (ArcadeTongame_editor.StagesConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Out getOldSource() {
		return (ArcadeTongame_editor.Out) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.Out getNewSource() {
		return (ArcadeTongame_editor.Out) newEnd;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.In getOldTarget() {
		return (ArcadeTongame_editor.In) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.In getNewTarget() {
		return (ArcadeTongame_editor.In) newEnd;
	}
}
