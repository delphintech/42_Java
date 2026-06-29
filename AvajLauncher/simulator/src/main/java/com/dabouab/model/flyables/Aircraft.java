package com.dabouab.model.flyables;

import com.dabouab.exception.*;

import com.dabouab.util.Color;
import com.dabouab.model.Coordinates;
import com.dabouab.model.WeatherProvider;

public class Aircraft extends Flyable {
	// ********** Field ********** //
	protected Long			id;
	protected String		name;
	protected Coordinates	coordinates;

	// ********** Methods ********** //
	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) throws AircraftException {
		if (p_name.length() < 2 | p_name.length() > 20) {
			throw new AircraftException("Aircraft name must be betwen 2 and 20 characters.");
		}
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinate;
	}

	@Override
	public void updateConditions() {
		String weather;

		weather = this.weatherTower.getWeather(this.coordinates);
		System.out.println(this.log(weather));
		this.updateCoordinates(weather);
		if (coordinates.getHeight() == 0) {
			System.out.println(this.log("landing"));
			this.weatherTower.unregister(this);
		}
	}

	@Override
	protected String	log(String condition) {
		if (condition == "LAND") {
			return Color.YELLOW_BG + this.toString() + ": landing. 🛬";
		}
		return this.toString() + ": ";
	}

	@Override
	protected void	updateCoordinates(String Weather) {}

	public String	toString() {
		return this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")";
	}
}