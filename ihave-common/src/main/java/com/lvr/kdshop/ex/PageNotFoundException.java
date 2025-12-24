package com.lvr.kdshop.ex;

public class PageNotFoundException extends ServiceException {
    public PageNotFoundException() {
        super();
    }

    public PageNotFoundException(String message) {
        super(message);
    }

    public PageNotFoundException(String message, Throwable cause) {
        super(message);
    }

    public PageNotFoundException(Throwable cause) {
        super(cause.getMessage());
    }

    protected PageNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message);
    }
}
