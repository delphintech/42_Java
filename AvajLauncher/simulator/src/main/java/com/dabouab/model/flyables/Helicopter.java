package com.dabouab.model.flyables;

import com.dabouab.exception.AircraftException;
import com.dabouab.model.Coordinates;
import com.dabouab.util.Color;

public class Helicopter extends Aircraft {
	// ********** Methods ********** //
	public Helicopter(long p_id, String p_name, Coordinates p_coordinate) throws AircraftException {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	protected String	log(String condition) {
		String	msg;

		switch(condition) {
			case "SUN":
				msg = "My cabin does not have air conditioning ! ☀️";
				break;
			case "RAIN":
				msg = "Time to turn on the windscreen wipers ! 🌧️";
				break;
			case "FOG":
				msg = "Trying to find my way guys. 🌫️";
				break;
			case "SNOW":
				msg = "I'm freezing here ! ❄️";
				break;
			default:
				msg = "";
		}
		return Color.CYAN + super.log(condition) + msg + Color.RESET; 
	}

	@Override
	protected void	updateCoordinates(String weather) {
		switch(weather) {
			case "SUN":
				this.coordinates.moveCoordinates(10, 0, 2);
				break;
			case "RAIN":
				this.coordinates.moveCoordinates(5, 0, 0);
				break;
			case "FOG":
				this.coordinates.moveCoordinates(1, 0, 0);
				break;
			case "SNOW":
				this.coordinates.moveCoordinates(0, 0, -12);
				break;
		}
	}

	public String	toString() {
		return "🚁 " + super.toString();
	}
}