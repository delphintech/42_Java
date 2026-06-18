package com.dabouab.exception;

public class AircraftException extends Exception {
	public AircraftException() {
        super();
    }

    public AircraftException(String message) {
        super(message);
    }

    public AircraftException(String message, Throwable cause) {
        super(message, cause);
    }

    public AircraftException(Throwable cause) {
        super(cause);
    }
}