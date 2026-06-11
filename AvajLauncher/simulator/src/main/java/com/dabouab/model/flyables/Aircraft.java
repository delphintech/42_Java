package com.dabouab.model.flyables;

import	com.dabouab.model.Coordinates;
import com.dabouab.model.WeatherProvider;

public class Aircraft extends Flyable {
	// ********** Field ********** //
	protected Long			id;
	protected String		name;
	protected Coordinates	coordinates;

	// ********** Methods ********** //
	@Override
	public void updateConditions() {
		/* TODO
			Get weather from tower
			Log message
			Change coordinates
			If an aircraft needs to pass the upper limit height it remains at 100.
			If an aircraft reaches height 0 or needs to go below it, the aircraft lands, unregisters
				from the weather tower and logs a message.
		 */
	}

	public Coordinates	getCoordinates() {
		return this.coordinates;
	}

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinate;
		this.updateConditions();
		// FIXME: Do you need super to call FLyable and register to a new tower ? 
	}

	public String	toString() {
		return this.getClass() + "#" + this.name + "(" + this.id + ")";
	}
}