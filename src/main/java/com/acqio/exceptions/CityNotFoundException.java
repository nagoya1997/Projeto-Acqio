package com.acqio.exceptions;

public class CityNotFoundException extends Exception {
    public CityNotFoundException() {
        super();
    }

    public CityNotFoundException(String message) {
        super(message);
    }

    public CityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CityNotFoundException(Throwable cause) {
        super(cause);
    }

    protected CityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
