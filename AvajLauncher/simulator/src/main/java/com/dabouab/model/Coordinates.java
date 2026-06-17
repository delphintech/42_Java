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

		if (p_height <= 0 || p_height > 100) {
			throw new CoordinatesException("Height must be between 1 and 100");
		}

		/* TODO
			raise exception if not correct conditions
			Coordinates are positive numbers.
			The height is in the 0-100 range.
		*/
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