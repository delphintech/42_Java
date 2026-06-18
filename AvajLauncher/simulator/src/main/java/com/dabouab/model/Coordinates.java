package com.dabouab.model;

import com.dabouab.exception.CoordinatesException;

public class Coordinates {
	// ********** Field ********** //
	private int	longitude;
	private int	latitude;
	private int	height;

	// ********** Methods ********** //
	Coordinates(int p_longitude, int p_latitude, int p_height) throws CoordinatesException {
		this.longitude = p_longitude;
		this.latitude = p_latitude;
		this.height = p_height;

		if (p_longitude < 0 || p_longitude > 1000) {
			throw new CoordinatesException("Longitude must be between 0 and 1000");
		}

		if (p_latitude < 0 || p_latitude > 1000) {
			throw new CoordinatesException("Latitude must be between 0 and 1000");
		}

		if (p_height <= 0 || p_height > 100) {
			throw new CoordinatesException("Height must be between 1 and 100");
		}
	}

	public void	moveCoordinates(int lon_offset, int lat_offset, int hei_offset) {
		this.longitude += lon_offset;
		this.latitude += lat_offset;
		this.height += hei_offset;

		// Coordinates change limitation
		if (this.height < 0) this.height = 0;
		if (this.height > 100) this.height = 100;

		if (this.longitude < 0) this.longitude = 0;
		if (this.longitude > 1000) this.longitude = 1000;
		
		if (this.latitude < 0) this.latitude = 0;
		if (this.latitude > 1000) this.latitude = 1000;
	}

	public int	getLongitude() {
		return this.longitude;
	}

	public int	getLatitude() {
		return this.latitude;
	}

	public int	getHeight() {
		return this.height;
	}
}