package com.crazykid.myexception;

public class NotInTheListException extends RuntimeException{
    public NotInTheListException() {
        super();
    }

    public NotInTheListException(String message) {
        super(message);
    }

    public NotInTheListException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotInTheListException(Throwable cause) {
        super(cause);
    }

    protected NotInTheListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
