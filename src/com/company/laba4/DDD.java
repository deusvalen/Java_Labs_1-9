package com.company.laba4;

/**
 * Created by User on 10.02.2018.
 */
public class DDD extends CCC {
    public int x;
    private int y;

    public DDD() {
        super();
        x = 1;
        y = 1;
    }

    public DDD(int x, int y, int x1, int y1) {
        super(x, y);
        this.x = x1;
        this.y = y1;
    }

    @Override
    public int sum() {
        return x + y + super.sum();
    }

    public int calc() {
        return x*y + super.x*super.getY();
    }
}
