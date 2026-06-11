package com.dabouab.model;

import com.dabouab.model.Coordinates;

public class WeatherProvider {
	// ********** Field ********** //
	private static WeatherProvider	instance;
	private static final String[]	weather = {"RAIN", "FOG", "SUN", "SNOW"};

	// ********** Methods ********** //
	private	WeatherProvider() {}

	public static WeatherProvider	getInstance() {
		if (instance == null) {
			instance = new WeatherProvider();
		}
		return instance;
	}

	public String	getCurrentWeather(Coordinates p_coordinates) {
		// TODO: implement algorithm to return a weather according to the coordinates 
	}

}