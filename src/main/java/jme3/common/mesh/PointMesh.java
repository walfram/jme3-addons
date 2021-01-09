package jme3.common.mesh;

import java.util.List;

import com.jme3.math.Vector3f;
import com.jme3.scene.Mesh;
import com.jme3.scene.VertexBuffer.Type;
import com.jme3.util.BufferUtils;

public final class PointMesh extends Mesh {

	public PointMesh(List<Vector3f> vertices) {
		this(vertices.stream().toArray(Vector3f[]::new));
	}

	public PointMesh(Vector3f[] vertices) {
		setMode(Mode.Points);

		setBuffer(Type.Position, 3, BufferUtils.createFloatBuffer(vertices));

		updateCounts();
		updateBound();
	}

}
