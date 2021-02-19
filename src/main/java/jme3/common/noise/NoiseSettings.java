package jme3.common.noise;

import jme3.common.noise.FastNoiseLite.CellularDistanceFunction;
import jme3.common.noise.FastNoiseLite.CellularReturnType;
import jme3.common.noise.FastNoiseLite.DomainWarpType;
import jme3.common.noise.FastNoiseLite.FractalType;
import jme3.common.noise.FastNoiseLite.NoiseType;
import jme3.common.noise.FastNoiseLite.RotationType3D;

public class NoiseSettings {

	public NoiseType mNoiseType = NoiseType.OpenSimplex2;
	public RotationType3D mRotationType3D = RotationType3D.None;
	public FractalType mFractalType = FractalType.None;

	public float mFrequency = 0.01f;
	public int mOctaves = 3;
	public float mLacunarity = 2.0f;
	public float mGain = 0.5f;
	public float mWeightedStrength = 0.0f;
	public float mPingPongStength = 2.0f;

	public CellularDistanceFunction mCellularDistanceFunction = CellularDistanceFunction.EuclideanSq;
	public CellularReturnType mCellularReturnType = CellularReturnType.Distance;
	public float mCellularJitterModifier = 1.0f;

	public DomainWarpType mDomainWarpType = DomainWarpType.OpenSimplex2;
	public float mDomainWarpAmp = 1.0f;

	public void setup(FastNoiseLite noise) {
		noise.SetNoiseType(mNoiseType);
		noise.SetRotationType3D(mRotationType3D);
		noise.SetFractalType(mFractalType);

		noise.SetFrequency(mFrequency);
		noise.SetFractalOctaves(mOctaves);
		noise.SetFractalLacunarity(mLacunarity);
		noise.SetFractalGain(mGain);
		noise.SetFractalWeightedStrength(mWeightedStrength);
		noise.SetFractalPingPongStrength(mPingPongStength);

		noise.SetCellularDistanceFunction(mCellularDistanceFunction);
		noise.SetCellularReturnType(mCellularReturnType);
		noise.SetCellularJitter(mCellularJitterModifier);

		noise.SetDomainWarpType(mDomainWarpType);
		noise.SetDomainWarpAmp(mDomainWarpAmp);
	}

}
