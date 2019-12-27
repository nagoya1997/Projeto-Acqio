package com.acqio.exceptions;

public class StateResourceException extends Exception {

    public StateResourceException() {
        super();
    }

    public StateResourceException(String message) {
        super(message);
    }

    public StateResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public StateResourceException(Throwable cause) {
        super(cause);
    }

    protected StateResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
