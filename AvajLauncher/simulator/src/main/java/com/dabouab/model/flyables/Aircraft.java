package com.dabouab.model.flyables;

import com.dabouab.model.Coordinates;

public class Aircraft extends Flyable {
	// ********** Field ********** //
	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;

	// ********** Methods ********** //
	@Override
	public void updateConditions() {
		// TODO
	}

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinate;
		// FIXME: Do you need super to call FLyable and register to a new tower ? 
	}
}