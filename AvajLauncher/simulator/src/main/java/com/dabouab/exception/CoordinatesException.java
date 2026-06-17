package com.dabouab.exception;

public class CoordinatesException extends Exception {
    public CoordinatesException() {
        super();
    }

    public CoordinatesException(String message) {
        super(message);
    }

    public CoordinatesException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoordinatesException(Throwable cause) {
        super(cause);
    }
}

