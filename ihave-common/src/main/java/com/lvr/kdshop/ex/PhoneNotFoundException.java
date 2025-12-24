package com.lvr.kdshop.ex;

public class PhoneNotFoundException extends ServiceException{
    public PhoneNotFoundException() {
        super();
    }

    public PhoneNotFoundException(String message) {
        super(message);
    }

    public PhoneNotFoundException(String message, Throwable cause) {
        super(message);
    }

    public PhoneNotFoundException(Throwable cause) {
        super(cause.getMessage());
    }

    protected PhoneNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message);
    }
}
