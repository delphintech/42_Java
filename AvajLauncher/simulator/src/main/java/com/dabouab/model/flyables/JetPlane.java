package com.dabouab.model.flyables;

import com.dabouab.model.Coordinates;

public class JetPlane extends Aircraft {
	// ********** Methods ********** //
	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	public void	updateConditions() {
		// TODO
	}
}