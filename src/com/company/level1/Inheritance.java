package com.company.level1;

import com.company.level1x.A2;

/**
 * Created by User on 10.02.2018.
 */
public class Inheritance extends A2 {
    public Inheritance(int var) {
        super(var);
    }

    @Override
    public String toString() {
        return "Inheritance works: " + super.toString();
    }
}
