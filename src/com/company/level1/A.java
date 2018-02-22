package com.company.level1;

/**
 * Created by User on 10.02.2018.
 */
public class A {
    private int var;

    public A(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
