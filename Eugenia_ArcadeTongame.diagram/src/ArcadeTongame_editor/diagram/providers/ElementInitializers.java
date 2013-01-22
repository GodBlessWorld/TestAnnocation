package ArcadeTongame_editor.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
