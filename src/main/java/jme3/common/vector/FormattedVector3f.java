package jme3.common.vector;

import com.jme3.math.Vector3f;

public final class FormattedVector3f {

	private final Vector3f value;

	public FormattedVector3f(Vector3f value) {
		this.value = value;
	}

	public String format() {
		return String.format("[x=%.03f, y=%.03f, z=%.03f]", value.x, value.y, value.z);
	}

}
