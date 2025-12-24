package com.lvr.ihave.ex;

public class UsernameTakenException extends ServiceException{
    public UsernameTakenException() {
        super();
    }

    public UsernameTakenException(String message) {
        super(message);
    }

    public UsernameTakenException(String message, Throwable cause) {
        super(message);
    }

    public UsernameTakenException(Throwable cause) {
        super(cause.getMessage());
    }

    protected UsernameTakenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message);
    }
}
