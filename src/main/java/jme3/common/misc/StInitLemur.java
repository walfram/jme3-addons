package jme3.common.misc;

import com.jme3.app.Application;
import com.jme3.app.state.BaseAppState;
import com.simsilica.lemur.GuiGlobals;
import com.simsilica.lemur.style.BaseStyles;

public final class StInitLemur extends BaseAppState {

	@Override
	protected void initialize(Application app) {
		GuiGlobals.initialize(app);
		BaseStyles.loadGlassStyle();
		GuiGlobals.getInstance().getStyles().setDefaultStyle(BaseStyles.GLASS);
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

}
