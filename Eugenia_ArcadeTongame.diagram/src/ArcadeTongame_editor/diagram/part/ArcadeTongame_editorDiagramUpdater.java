package ArcadeTongame_editor.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ArcadeTongame_editorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getVisualID(view)) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			return getGame_1000SemanticChildren(view);
		case ArcadeTongame_editor.diagram.edit.parts.StageStageElementsCompartmentEditPart.VISUAL_ID:
			return getStageStageElementsCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> getGame_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArcadeTongame_editor.Game modelElement = (ArcadeTongame_editor.Game) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStages().iterator(); it.hasNext();) {
			ArcadeTongame_editor.Stage childElement = (ArcadeTongame_editor.Stage) it
					.next();
			int visualID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> getStageStageElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ArcadeTongame_editor.Stage modelElement = (ArcadeTongame_editor.Stage) containerView
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			ArcadeTongame_editor.Element childElement = (ArcadeTongame_editor.Element) it
					.next();
			int visualID = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getContainedLinks(
			View view) {
		switch (ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getVisualID(view)) {
		case ArcadeTongame_editor.diagram.edit.parts.GameEditPart.VISUAL_ID:
			return getGame_1000ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
			return getStage_2001ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
			return getWall_3001ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
			return getSound_3002ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3003ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
			return getIn_3004ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
			return getOut_3005ContainedLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID:
			return getStagesConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIncomingLinks(
			View view) {
		switch (ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getVisualID(view)) {
		case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
			return getStage_2001IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
			return getWall_3001IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
			return getSound_3002IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3003IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
			return getIn_3004IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
			return getOut_3005IncomingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID:
			return getStagesConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
				.getVisualID(view)) {
		case ArcadeTongame_editor.diagram.edit.parts.StageEditPart.VISUAL_ID:
			return getStage_2001OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.WallEditPart.VISUAL_ID:
			return getWall_3001OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.SoundEditPart.VISUAL_ID:
			return getSound_3002OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3003OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.InEditPart.VISUAL_ID:
			return getIn_3004OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.OutEditPart.VISUAL_ID:
			return getOut_3005OutgoingLinks(view);
		case ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID:
			return getStagesConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getGame_1000ContainedLinks(
			View view) {
		ArcadeTongame_editor.Game modelElement = (ArcadeTongame_editor.Game) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StagesConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getWall_3001ContainedLinks(
			View view) {
		ArcadeTongame_editor.Wall modelElement = (ArcadeTongame_editor.Wall) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getSound_3002ContainedLinks(
			View view) {
		ArcadeTongame_editor.Sound modelElement = (ArcadeTongame_editor.Sound) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getText_3003ContainedLinks(
			View view) {
		ArcadeTongame_editor.Text modelElement = (ArcadeTongame_editor.Text) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIn_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOut_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStagesConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getWall_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getSound_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getText_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIn_3004IncomingLinks(
			View view) {
		ArcadeTongame_editor.In modelElement = (ArcadeTongame_editor.In) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_StagesConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOut_3005IncomingLinks(
			View view) {
		ArcadeTongame_editor.Out modelElement = (ArcadeTongame_editor.Out) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Opener_Opens_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStagesConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getWall_3001OutgoingLinks(
			View view) {
		ArcadeTongame_editor.Wall modelElement = (ArcadeTongame_editor.Wall) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getSound_3002OutgoingLinks(
			View view) {
		ArcadeTongame_editor.Sound modelElement = (ArcadeTongame_editor.Sound) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getText_3003OutgoingLinks(
			View view) {
		ArcadeTongame_editor.Text modelElement = (ArcadeTongame_editor.Text) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIn_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOut_3005OutgoingLinks(
			View view) {
		ArcadeTongame_editor.Out modelElement = (ArcadeTongame_editor.Out) view
				.getElement();
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_StagesConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getStagesConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getContainedTypeModelFacetLinks_StagesConnection_4001(
			ArcadeTongame_editor.Game container) {
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		for (Iterator<?> links = container.getStagesconnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ArcadeTongame_editor.StagesConnection) {
				continue;
			}
			ArcadeTongame_editor.StagesConnection link = (ArcadeTongame_editor.StagesConnection) linkObject;
			if (ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID != ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ArcadeTongame_editor.In dst = link.getTarget();
			ArcadeTongame_editor.Out src = link.getSource();
			result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor(
					src,
					dst,
					link,
					ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001,
					ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIncomingTypeModelFacetLinks_StagesConnection_4001(
			ArcadeTongame_editor.In target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getStagesConnection_Target()
					|| false == setting.getEObject() instanceof ArcadeTongame_editor.StagesConnection) {
				continue;
			}
			ArcadeTongame_editor.StagesConnection link = (ArcadeTongame_editor.StagesConnection) setting
					.getEObject();
			if (ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID != ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ArcadeTongame_editor.Out src = link.getSource();
			result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor(
					src,
					target,
					link,
					ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001,
					ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIncomingFeatureModelFacetLinks_Opener_Opens_4002(
			ArcadeTongame_editor.Out target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getOpener_Opens()) {
				result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor(
						setting.getEObject(),
						target,
						ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.OpenerOpens_4002,
						ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOutgoingTypeModelFacetLinks_StagesConnection_4001(
			ArcadeTongame_editor.Out source) {
		ArcadeTongame_editor.Game container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ArcadeTongame_editor.Game) {
				container = (ArcadeTongame_editor.Game) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		for (Iterator<?> links = container.getStagesconnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ArcadeTongame_editor.StagesConnection) {
				continue;
			}
			ArcadeTongame_editor.StagesConnection link = (ArcadeTongame_editor.StagesConnection) linkObject;
			if (ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID != ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ArcadeTongame_editor.In dst = link.getTarget();
			ArcadeTongame_editor.Out src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor(
					src,
					dst,
					link,
					ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.StagesConnection_4001,
					ArcadeTongame_editor.diagram.edit.parts.StagesConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Opener_Opens_4002(
			ArcadeTongame_editor.Opener source) {
		LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> result = new LinkedList<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor>();
		ArcadeTongame_editor.Out destination = source.getOpens();
		if (destination == null) {
			return result;
		}
		result.add(new ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor(
				source,
				destination,
				ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes.OpenerOpens_4002,
				ArcadeTongame_editor.diagram.edit.parts.OpenerOpensEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorNodeDescriptor> getSemanticChildren(
				View view) {
			return ArcadeTongame_editorDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getContainedLinks(
				View view) {
			return ArcadeTongame_editorDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getIncomingLinks(
				View view) {
			return ArcadeTongame_editorDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArcadeTongame_editor.diagram.part.ArcadeTongame_editorLinkDescriptor> getOutgoingLinks(
				View view) {
			return ArcadeTongame_editorDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
