package jme3.common.noise;

import jme3.common.noise.FastNoiseLite.CellularDistanceFunction;
import jme3.common.noise.FastNoiseLite.CellularReturnType;
import jme3.common.noise.FastNoiseLite.FractalType;
import jme3.common.noise.FastNoiseLite.NoiseType;
import jme3.common.noise.FastNoiseLite.RotationType3D;

public final class NoiseSettings {

	public 	float strength = 1.0f;

	public float mFrequency = 0.01f;
	public NoiseType mNoiseType = NoiseType.OpenSimplex2;
	public FractalType mFractalType = FractalType.None;
	public RotationType3D mRotationType3D = RotationType3D.None;
	public CellularDistanceFunction mCellularDistanceFunction = CellularDistanceFunction.EuclideanSq;
	public CellularReturnType mCellularReturnType = CellularReturnType.Distance;
	public int mOctaves = 3;
	public float mLacunarity = 2.0f;
	public float mGain = 0.5f;

	public void bind(FastNoiseLite noise) {
		noise.SetFrequency(mFrequency);
		noise.SetNoiseType(mNoiseType);
		noise.SetFractalType(mFractalType);
		noise.SetRotationType3D(mRotationType3D);
		noise.SetCellularDistanceFunction(mCellularDistanceFunction);
		noise.SetCellularReturnType(mCellularReturnType);
		noise.SetFractalOctaves(mOctaves);
		noise.SetFractalLacunarity(mLacunarity);
		noise.SetFractalGain(mGain);
	}

}
