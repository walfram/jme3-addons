package jme3.common.misc;

public final class PercentOf {

	private final float min;
	private final float max;
	private final float value;

	public PercentOf(float min, float max, float value) {
		this.min = min;
		this.max = max;
		this.value = value;
	}

	public float value() {
		return Math.abs(value - min) / (max - min);
	}
	
}
