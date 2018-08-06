package com.refactoring.s_1.after;

/**
 * @create 2018-05-23 16:10
 */
public interface Price {
    int getPriceCode();

    double getCharge(int daysRented);

    int getFequentRenterPoints(int daysRented);
}
