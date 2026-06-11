package com.dabouab.model;

public class Coordinates {
	// ********** Field ********** //
	private int	longitude;
	private int	latitude;
	private int	height;

	// ********** Methods ********** //
	Coordinates(int p_longitude, int p_latitude, int p_height) {
		this.longitude = p_longitude;
		this.latitude = p_latitude;
		this.height = p_height;
	}

	public int	getLongitude() {
		return this.longitude;
	}

	public int	getLatitude() {
		return this.latitude;
	}

	public int	getHeigut() {
		return this.height;
	}
}