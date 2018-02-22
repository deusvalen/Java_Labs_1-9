package com.company.laba8;

/**
 * Created by User on 11.02.2018.
 */
public class Class {

    public Class(Integer value) throws Exception1 {
        if (value == null) {
            throw new Exception1();
        }
    }

    public void methode (int a) throws Exception2,Exception3 {
    if (a == 0) {
        throw new Exception2();
    }
    if (a < 0) {
        throw new Exception3();
    }
    }

}
