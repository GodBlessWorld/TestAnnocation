package ArcadeTongame_editor.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class ArcadeTongame_editorCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.diagram.part.ArcadeTongame_editorCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected ArcadeTongame_editor.diagram.part.ArcadeTongame_editorCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizardTitle);
		setDefaultPageImageDescriptor(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewArcadeTongame_editorWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorCreationWizardPage(
				"DiagramModelFile", getSelection(), "arcadetongame_editor_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorCreationWizardPage(
				"DomainModelFile", getSelection(), "arcadetongame_editor") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".arcadetongame_editor_diagram".length()); //$NON-NLS-1$
					setFileName(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "arcadetongame_editor")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								ArcadeTongame_editor.diagram.part.Messages.ArcadeTongame_editorCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
