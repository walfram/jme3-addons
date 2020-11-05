package jme3.common.collision;

import com.jme3.bounding.BoundingBox;
import com.jme3.math.Vector3f;
import com.simsilica.lemur.Axis;

public class InfiniteCollidable extends BoundingBox {

	private static final Vector3f[] COLLIDABLE_EXTENTS = new Vector3f[] {
			new Vector3f(Float.POSITIVE_INFINITY, 0f, Float.POSITIVE_INFINITY),
			new Vector3f(0f, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
			new Vector3f(Float.POSITIVE_INFINITY, 0f, Float.POSITIVE_INFINITY) };

	public InfiniteCollidable() {
		this(new Vector3f(), Float.POSITIVE_INFINITY, 0, Float.POSITIVE_INFINITY);
	}

	public InfiniteCollidable(Vector3f center) {
		this(center, Float.POSITIVE_INFINITY, 0, Float.POSITIVE_INFINITY);
	}

	private InfiniteCollidable(Vector3f center, float xExtent, float yExtent, float zExtent) {
		super(center, xExtent, yExtent, zExtent);
	}

	public InfiniteCollidable(Vector3f center, Axis axis) {
		this(center, COLLIDABLE_EXTENTS[axis.index()]);
	}

	public InfiniteCollidable(Vector3f center, Vector3f extents) {
		this(center, extents.x, extents.y, extents.z);
	}

}
