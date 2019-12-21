package com.acqio.exceptions;

public class PersonResourceException extends Exception {

    public PersonResourceException() {
    }

    public PersonResourceException(String message) {
        super(message);
    }

    public PersonResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonResourceException(Throwable cause) {
        super(cause);
    }

    public PersonResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
