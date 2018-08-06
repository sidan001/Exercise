package com.refactoring.s_1.after;

/**
 * @create 2018-05-23 16:11
 */
public class ChildrensPrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENDS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int getFequentRenterPoints(int daysRented) {
        return 1;
    }
}
