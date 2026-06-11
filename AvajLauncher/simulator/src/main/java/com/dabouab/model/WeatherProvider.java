package com.dabouab.model;

import com.dabouab.model.Coordinates;

public class WeatherProvider {
	// ********** Field ********** //
	private static WeatherProvider	instance;
	private static String[]			weather;

	// ********** Methods ********** //
	private	WeatherProvider() {
		// TODO ?
	}

	public String	getCurrentWeather(Coordinates p_coordinates) {
		if (instance == null) {
			instance = new WeatherProvider();
		}
		// TODO: return current weather
	}

}