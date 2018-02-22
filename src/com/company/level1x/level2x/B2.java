package com.company.level1x.level2x;

/**
 * Created by User on 10.02.2018.
 */
public class B2 {
    private int var;

    public B2(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
