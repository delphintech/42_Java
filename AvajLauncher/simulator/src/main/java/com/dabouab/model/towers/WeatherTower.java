package com.dabouab.model.towers;

import com.dabouab.model.Coordinates;
import com.dabouab.model.WeatherProvider;

public class WeatherTower extends Tower {
	// ********** Methods ********** //
	public String getWeather(Coordinates p_coordinates) {
		WeatherProvider	weatherProvider = WeatherProvider.getInstance();

		return weatherProvider.getCurrentWeather(p_coordinates);
	}

	public void changeWeather() {
		super.conditionChanged();
	}
}