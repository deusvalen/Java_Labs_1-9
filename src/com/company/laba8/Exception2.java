package com.company.laba8;

/**
 * Created by User on 11.02.2018.
 */
public class Exception2 extends Exception {
    public Exception2() {
        super();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public String toString() {
        return "Exception2 :" +  super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
