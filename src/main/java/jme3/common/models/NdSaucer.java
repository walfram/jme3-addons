package jme3.common.models;

import com.jme3.asset.AssetManager;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;

import jme3.common.material.MtlLighting;
import jme3.common.mesh.FlatShaded;
import jme3utilities.mesh.Octasphere;

public class NdSaucer extends Node {

	public NdSaucer(AssetManager assetManager) {
		Geometry cockpit = new Geometry("cockpit", new FlatShaded(new Octasphere(2, 5f)).mesh());
		cockpit.setMaterial(new MtlLighting(assetManager, ColorRGBA.Gray));
		attachChild(cockpit);

		Geometry body = new Geometry("body", new FlatShaded(new Octasphere(2, 10f)).mesh());
		body.setMaterial(new MtlLighting(assetManager, ColorRGBA.Gray));
		body.scale(1.5f, 0.25f, 1.5f);
		body.move(0, -2.0f, 0);
		attachChild(body);
	}

}
