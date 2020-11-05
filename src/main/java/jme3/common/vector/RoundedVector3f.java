package jme3.common.vector;

import com.jme3.math.Vector3f;

public final class RoundedVector3f {

	private final Vector3f source;
	private final float precision;

	public RoundedVector3f(Vector3f source, float precision) {
		this.source = source;
		this.precision = precision;
	}

	public Vector3f round() {
		Vector3f value = new Vector3f(source).mult(precision);

		value.x = Math.round(value.x);
		value.z = Math.round(value.z);
		value.divideLocal(precision);

		return value;
	}

}
