package com.company.laba4;

/**
 * Created by User on 10.02.2018.
 */
public class CCC {
    public int x;
    private int y;

    public CCC() {
        x = 0;
        y = 0;
    }

    public CCC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int sum () {
        return x + y;
    }

    public static int ssub (int x, int y) {
        return x - y;
    }
}
