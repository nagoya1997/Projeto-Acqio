package com.acqio.exceptions;

public class CityResourceException extends Exception{

    public CityResourceException() {
        super();
    }

    public CityResourceException(String message) {
        super(message);
    }

    public CityResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CityResourceException(Throwable cause) {
        super(cause);
    }

    protected CityResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
