package jme3.common.noise;

import com.simsilica.event.EventType;

public interface NoiseEvents {

	EventType<NoiseSettings> noiseChange = EventType.create("noiseChange", NoiseSettings.class);
	
}
