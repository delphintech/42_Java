package com.dabouab.model.flyables;

import com.dabouab.model.Coordinates;

public class JetPlane extends Aircraft {
	// ********** Methods ********** //
	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
	}

	@Override
	private String	log(String condition) {
		String msg;

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
		return Color.PURPLE + super(condition) + msg + Color.RESET; 
	}

	@Override
	private void	updateCoordinates(String weather) {
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
		return "✈️ " + super();
	}
}

// ◦ SUN - Latitude increases with 10, Height increases with 2
// ◦ RAIN - Latitude increases with 5
// ◦ FOG - Latitude increases with 1
// ◦ SNOW - Height decreases with 7