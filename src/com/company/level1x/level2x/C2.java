package com.company.level1x.level2x;

/**
 * Created by User on 10.02.2018.
 */
public class C2 {
    private int var;

    public C2(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
