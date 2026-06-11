package com.dabouab.model.flyables;

import com.dabouab.model.Coordinates;

public class Balloon extends Aircraft {
	// ********** Methods ********** //
	public Balloon(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	public void	updateConditions() {
		// TODO
	}
}

// ◦ SUN - Longitude increases with 2, Height increases with 4
// ◦ RAIN - Height decreases with 5
// ◦ FOG - Height decreases with 3
// ◦ SNOW - Height decreases with 15