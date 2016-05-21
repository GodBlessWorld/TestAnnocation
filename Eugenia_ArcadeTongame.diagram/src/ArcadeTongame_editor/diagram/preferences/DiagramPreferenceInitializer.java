package ArcadeTongame_editor.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ArcadeTongame_editor.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		ArcadeTongame_editor.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		ArcadeTongame_editor.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		ArcadeTongame_editor.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		ArcadeTongame_editor.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
