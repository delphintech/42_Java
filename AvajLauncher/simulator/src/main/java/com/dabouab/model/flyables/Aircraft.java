package com.dabouab.model.flyables;

import com.dabouab.model.flyables.Flyable;

public class Aircraft extends Flyable {
	// ********** Field ********** //
	protected long			id;
	protected String		name;
	protected Coordinate	coordinates;

	// ********** Methods ********** //
	protected Aircraft(long p_id, String p_name, Coordinate p_coordinate) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinate;
		// FIXME: Do you need super to call FLyable and register to a new tower ? 
	}
}