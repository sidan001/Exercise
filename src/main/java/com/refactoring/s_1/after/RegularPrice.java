package com.refactoring.s_1.after;

/**
 * @author liuchou@lvmama.com
 * @create 2018-05-23 16:12
 */
public class RegularPrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFequentRenterPoints(int daysRented) {
        return 1;
    }
}
