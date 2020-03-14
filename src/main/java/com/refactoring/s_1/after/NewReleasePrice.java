package com.refactoring.s_1.after;

/**
 * @author liuchou@lvmama.com
 * @create 2018-05-23 16:12
 */
public class NewReleasePrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    public int getFequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
