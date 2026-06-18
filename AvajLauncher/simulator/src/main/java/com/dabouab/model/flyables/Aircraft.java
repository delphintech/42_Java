package com.dabouab.model.flyables;

import com.dabouab.exception.*;

import com.dabouab.util.color;
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
		String weather;

		weather = this.weatherTower.getWeather(this.coordinates);
		this.log(weather);
		this.updateCoordinates(weather);
		if (coordinates.height <= 0) {
			System.out.PrintLn(this.log("landing"));
			this.weatherTower.unregisters(this);
		}
	}

	@Override
	private String	log(String condition) {
		if (condition == "LAND") {
			return Color.YELLOW_BG + this.toString() + ": landing. 🛬"
		}
		return this.toString() + ": ";
	}

	@Override
	private void	updateCoordinates(String Weather) {}

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) throws AircraftException {
		if (p_name. length < 2 | p_name.length > 20) {
			throw new AircraftException("Aircraft name must be betwen 2 and 20 characters.");
		}
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinate;
	}

	public String	toString() {
		return this.getClass() + "#" + this.name + "(" + this.id + ")";
	}
}