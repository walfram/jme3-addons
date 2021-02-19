package jme3.common.misc;

import com.google.common.primitives.Floats;
import com.jme3.bounding.BoundingBox;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.scene.Spatial;

import jme3utilities.MyCamera;

// TODO refactor name to better reflect purpose
public final class FocusCamera {

	private final Camera camera;

	public FocusCamera(Camera camera) {
		this.camera = camera;
	}

	// https://stackoverflow.com/questions/2866350/move-camera-to-fit-3d-scene
	public void focusOn(Spatial target) {
		BoundingBox bound = (BoundingBox) target.getWorldBound().clone();

		float s = Floats.max(bound.getXExtent(), bound.getYExtent(), bound.getZExtent());
		float a = MyCamera.fovY(camera);

		float distance = (s / 1.75f) / (FastMath.tan(a / 2f));

		Vector3f offset = camera.getDirection().negate().mult(distance);

		Vector3f location = target.getWorldTranslation().add(offset);

		camera.setLocation(location);
		camera.lookAt(target.getWorldTranslation(), Vector3f.UNIT_Y);
	}

}
