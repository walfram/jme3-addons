package jme3.common.ui;

import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.simsilica.lemur.Panel;

public final class UiCenteredTop {

	private final Panel subject;
	private final Camera camera;

	public UiCenteredTop(Panel subject, Camera camera) {
		this.subject = subject;
		this.camera = camera;
	}

	public void center() {
		Vector3f prefSize = subject.getPreferredSize();

		float left = camera.getWidth() * 0.5f - prefSize.x * 0.5f;
		float top = camera.getHeight() - 5f;

		subject.setLocalTranslation(left, top, 0);
	}

}
