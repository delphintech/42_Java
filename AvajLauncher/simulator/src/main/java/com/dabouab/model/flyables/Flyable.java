package com.dabouab.model.flyables;

import com.dabouab.model.towers.WeatherTower;

public abstract class Flyable {
	// ********** Field ********** //
	protected	 WeatherTower weatherTower;

	// ********** Methods ********** //
	abstract public void	updateConditions();
	abstract private String	log(String condition);
	abstract private void	updateCoordinates(String weather);

	public void registerTower(WeatherTower p_tower) {
		if (p_tower == null) return;

		this.weatherTower = p_tower;
		p_tower.register(this);
	}
}