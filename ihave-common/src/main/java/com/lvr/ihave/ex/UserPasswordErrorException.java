package com.lvr.ihave.ex;

public class UserPasswordErrorException extends ServiceException{
    public UserPasswordErrorException() {
        super();
    }

    public UserPasswordErrorException(String message) {
        super(message);
    }

    public UserPasswordErrorException(String message, Throwable cause) {
        super(message);
    }

    public UserPasswordErrorException(Throwable cause) {
        super(cause.getMessage());
    }

    protected UserPasswordErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message);
    }
}
