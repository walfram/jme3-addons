package jme3.common.models;

import com.jme3.asset.AssetManager;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Torus;

import jme3.common.material.MtlLighting;
import jme3.common.mesh.FlatShaded;
import jme3utilities.mesh.Octasphere;
import jme3utilities.mesh.Prism;

public final class NdCigar extends Node {

	public NdCigar(AssetManager assetManager) {
		Geometry body = new Geometry("body", new FlatShaded(new Octasphere(2, 1f)).mesh());
		body.setMaterial(new MtlLighting(assetManager, ColorRGBA.Gray));
		body.scale(3f, 2f, 20f);
		attachChild(body);

		Geometry ring = new Geometry("ring", new FlatShaded(new Torus(12, 7, 0.25f, 1f)).mesh());
		ring.setMaterial(new MtlLighting(assetManager, ColorRGBA.Gray));
		ring.scale(4f);
		attachChild(ring);

		Geometry tail = new Geometry("tail", new Prism(3, 1f, 0.125f, true));
		tail.setMaterial(new MtlLighting(assetManager, ColorRGBA.Gray));
		tail.scale(5f);
		tail.move(0f, 0f, -10f);
		attachChild(tail);
	}

}
