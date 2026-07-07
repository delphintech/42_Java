package com.dabouab.model.flyables;

import com.dabouab.util.Color;
import com.dabouab.model.Coordinates;
import com.dabouab.exception.AircraftException;

public class Balloon extends Aircraft {
	// ********** Methods ********** //
	public Balloon(long p_id, String p_name, Coordinates p_coordinate) throws AircraftException {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	protected String	log(String condition) {
		String	msg;

		switch(condition) {
			case "SUN":
				msg = "I'm having my living my best life ! ☀️";
				break;
			case "RAIN":
				msg = "I am socking wet ! 🌧️";
				break;
			case "FOG":
				msg = "I can't see shit and can't manoeuvre. Please try to avoid ne I am fragile. 🌫️";
				break;
			case "SNOW":
				msg = "The snow is pilling on my basket. Help ! ❄️";
				break;
			default:
				msg = "";
		}
		return Color.PURPLE + super.log(condition) + msg + Color.RESET; 
	}

	@Override
	protected void	updateCoordinates(String weather) {
		String	msg;

		switch(weather) {
			case "SUN":
				this.coordinates.moveCoordinates(2, 0, 4);
				break;
			case "RAIN":
				this.coordinates.moveCoordinates(0, 0, -5);
				break;
			case "FOG":
				this.coordinates.moveCoordinates(0, 0, -3);
				break;
			case "SNOW":
				this.coordinates.moveCoordinates(0, 0, -15);
				break;
		}
	}

	public String	toString() {
		return "🎈 " + super.toString();
	}
}