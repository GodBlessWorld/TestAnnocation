package ArcadeTongame_editor.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ArcadeTongame_editorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				ArcadeTongame_editor.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createIn1CreationTool());
		paletteContainer.add(createOut2CreationTool());
		paletteContainer.add(createSound3CreationTool());
		paletteContainer.add(createStage4CreationTool());
		paletteContainer.add(createText5CreationTool());
		paletteContainer.add(createWall6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				ArcadeTongame_editor.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createOpens1CreationTool());
		paletteContainer.add(createStagesConnection2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIn1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.In1CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.In1CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.In_3004));
		entry.setId("createIn1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/In24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOut2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Out2CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Out2CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Out_3005));
		entry.setId("createOut2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/Out24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSound3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Sound3CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Sound3CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Sound_3002));
		entry.setId("createSound3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/Sound24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStage4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Stage4CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Stage4CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Stage_2001));
		entry.setId("createStage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/Stage24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createText5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Text5CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Text5CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Text_3003));
		entry.setId("createText5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/Text24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWall6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Wall6CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Wall6CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.Wall_3001));
		entry.setId("createWall6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/Wall24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpens1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.Opens1CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.Opens1CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.OpenerOpens_4002));
		entry.setId("createOpens1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
				.findImageDescriptor("/Eugenia_ArcadeTongame/icons/opens24x24.ico")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStagesConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ArcadeTongame_editor.diagram.part.Messages.StagesConnection2CreationTool_title,
				ArcadeTongame_editor.diagram.part.Messages.StagesConnection2CreationTool_desc,
				Collections
						.singletonList(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001));
		entry.setId("createStagesConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes
				.getImageDescriptor(ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
