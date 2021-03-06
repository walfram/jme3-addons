package jme3.common.material;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.Materials;
import com.jme3.math.ColorRGBA;

public final class MtlUnshaded extends Material {

	public MtlUnshaded(AssetManager assetManager, ColorRGBA color) {
		super(assetManager, Materials.UNSHADED);
		setColor("Color", color);
	}

	public MtlUnshaded(AssetManager assetManager, ColorRGBA color, float lineWidth) {
		this(assetManager, color);
		getAdditionalRenderState().setLineWidth(lineWidth);
	}

}
