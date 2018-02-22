package com.company.level1.level2;

/**
 * Created by User on 10.02.2018.
 */
public class B {
    private int var;

    public B(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
