package com.acqio.exceptions;

public class StateNotFoundException extends Exception {
    public StateNotFoundException() {
        super();
    }

    public StateNotFoundException(String message) {
        super(message);
    }

    public StateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StateNotFoundException(Throwable cause) {
        super(cause);
    }

    protected StateNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
