package com.dabouab.model;

import com.dabouab.model.flyables.*;

public class AircraftFactory {
	// ********** Field ********** //
	private static int	nextId = 0;

	// ********** Methods ********** //
	public static Flyable	newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		Flyable		newAircraft = null;

		switch(p_type.toLowerCase())
		{
			case "baloon":
				newAircraft = new Baloon(nextId, p_name, p_coordinates);
				break;
			case "helicopter":
				newAircraft = new Helicopter(nextId, p_name, p_coordinates);
				break;
			case "jetplane":
				newAircraft = new JetPlane(nextId, p_name, p_coordinates);
				break;
			default:
				// TODO: Raise error
				// TODO: "any" case
		}
		nextId++;

		return newAircraft;
	}
}