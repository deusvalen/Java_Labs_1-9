package com.company.level1.level2.level3;

/**
 * Created by User on 10.02.2018.
 */
public class D {
    private int var;

    public D(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
