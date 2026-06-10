package com.dabouab.model.flyables;

import com.dabouab.model.flyables.Aircraft;

public class JetPlane extends Aircraft {
	// ********** Methods ********** //
	public JetPlane(long p_id, String p_name, Coordinate p_coordinate) {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	public void	updateConditions() {
		// TODO
	}
}