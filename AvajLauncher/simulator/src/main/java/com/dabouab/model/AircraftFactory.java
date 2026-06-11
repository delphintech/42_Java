package com.dabouab.model;

import com.dabouab.model.flyables.*;

public class AircraftFactory {
	// ********** Field ********** //
	private	static AircraftFactory	instance;
	private static long				nextId = 0;

	// ********** Methods ********** //
	private AircraftFactory() {}

	public static AircraftFactory	getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}
		return instance;
	}

	public Flyable	newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		Flyable		newAircraft;

		switch(p_type.toLowerCase())
		{
			case "balloon":
				newAircraft = new Balloon(nextId, p_name, p_coordinates);
				break;
			case "helicopter":
				newAircraft = new Helicopter(nextId, p_name, p_coordinates);
				break;
			case "jetplane":
				newAircraft = new JetPlane(nextId, p_name, p_coordinates);
				break;
			default:
				return null;
		}
		nextId++;

		return newAircraft;
	}
}