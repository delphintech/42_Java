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
		int		coef;

		coef = p_coordinates.getLongitude() + p_coordinates.getLatitude() + p_coordinates.getHeight();
		coef = coef % 4;
		return weather[coef];
	}
}