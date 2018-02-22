package com.company.level1x;

import com.company.level1.A;

/**
 * Created by User on 10.02.2018.
 */
public class A2 {
    private int var;

    public A2(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " var: " + var;
    }

    public void method() {
        A obj = new A(1);
        System.out.println(obj.toString());
    }
}
