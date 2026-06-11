package com.dabouab.model.flyables;

import com.dabouab.model.Coordinates;

public class Helicopter extends Aircraft {
	// ********** Methods ********** //
	public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	public void	updateConditions() {
		// TODO
	}
}

// ◦ SUN - Longitude increases with 10, Height increases with 2
// ◦ RAIN - Longitude increases with 5
// ◦ FOG - Longitude increases with 1
// ◦ SNOW - Height decreases with 12