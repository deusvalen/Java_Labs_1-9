package com.company.level1.level2.level3.level4;

/**
 * Created by User on 10.02.2018.
 */
public class E {
    private int var;

    public E(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }
}
