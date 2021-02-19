package jme3.common.noise;

import com.jme3.app.Application;
import com.jme3.app.state.BaseAppState;
import com.jme3.scene.Node;
import com.simsilica.lemur.Action;
import com.simsilica.lemur.ActionButton;
import com.simsilica.lemur.Container;
import com.simsilica.lemur.RollupPanel;
import com.simsilica.lemur.props.PropertyPanel;
import com.simsilica.lemur.style.BaseStyles;

public final class NoiseUiState extends BaseAppState {

	private final Node scene = new Node("scene");
	private final NoiseSettings settings = new NoiseSettings();
	private final Action action;

	public NoiseUiState(Node guiNode, Action action) {
		guiNode.attachChild(scene);
		this.action = action;
	}

	@Override
	protected void initialize(Application app) {
		PropertyPanel props = new PropertyPanel(BaseStyles.GLASS);

		props.addEnumField("Noise type", settings, "mNoiseType");
		props.addEnumField("Rotation", settings, "mRotationType3D");
		props.addEnumField("Fractal type", settings, "mFractalType");

		props.addFloatField("Frequency", settings, "mFrequency", 0, 1, 0.001f);
		props.addIntField("Octaves", settings, "mOctaves", 0, 10, 1);
		props.addFloatField("Lacunarity", settings, "mLacunarity", 0, 4, 0.001f);

		props.addFloatField("Gain", settings, "mGain", 0, 2, 0.001f);
		props.addFloatField("WeightedStrength", settings, "mWeightedStrength", 0, 4, 0.001f);
		props.addFloatField("PingPongStength", settings, "mPingPongStength", 0, 4, 0.001f);

		props.addEnumField("CellularDistanceFunction", settings, "mCellularDistanceFunction");
		props.addEnumField("CellularReturnType", settings, "mCellularReturnType");
		props.addFloatField("CellularJitterModifier", settings, "mCellularJitterModifier", 0, 2, 0.001f);

		props.addEnumField("mDomainWarpType", settings, "mDomainWarpType");
		props.addFloatField("DomainWarpAmp", settings, "mDomainWarpAmp", 0, 2, 0.001f);

		Container container = new Container();
		container.addChild(props);
		container.addChild(new ActionButton(action));

		RollupPanel panel = new RollupPanel("noise settings", container, BaseStyles.GLASS);

		float width = app.getCamera().getWidth() * 0.5f - 10f;
		panel.getTitleElement().setMaxWidth(width);

		scene.attachChild(panel);
		panel.setLocalTranslation(5, app.getCamera().getHeight() - 5, 0);
	}

	@Override
	protected void cleanup(Application app) {
	}

	@Override
	protected void onEnable() {
	}

	@Override
	protected void onDisable() {
	}

	public NoiseSettings settings() {
		return settings;
	}

}
