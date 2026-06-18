package com.dabouab.model.flyables;

import com.dabouab.exception.AircraftException;
import com.dabouab.model.Coordinates;
import com.dabouab.util.Color;


public class JetPlane extends Aircraft {
	// ********** Methods ********** //
	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) throws AircraftException {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	protected String	log(String condition) {
		String	msg;

		switch(condition) {
			case "SUN":
				msg = "Good visibility for a good day ! ☀️";
				break;
			case "RAIN":
				msg = "Not a good day for a picnic, right ? 🌧️";
				break;
			case "FOG":
				msg = "Only navigating thanks to my instruments. 😶‍🌫️";
				break;
			case "SNOW":
				msg = "Hope the landing strip won't be to slippery ❄️";
				break;
			default:
				msg = "";
		}
		return Color.GRAY + super.log(condition) + msg + Color.RESET; 
	}

	@Override
	protected void	updateCoordinates(String weather) {
		switch(weather) {
			case "SUN":
				this.coordinates.moveCoordinates(0, 10, 2);
				break;
			case "RAIN":
				this.coordinates.moveCoordinates(0, 5, 0);
				break;
			case "FOG":
				this.coordinates.moveCoordinates(0, 1, 0);
				break;
			case "SNOW":
				this.coordinates.moveCoordinates(0, 0, -7);
				break;
		}
	}

	public String	toString() {
		return "✈️ " + super.toString();
	}
}