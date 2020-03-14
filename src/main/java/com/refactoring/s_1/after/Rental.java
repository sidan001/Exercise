package com.refactoring.s_1.after;

/**
 * 租赁:某一个租客租了一部影片
 *
 * @create 2018-05-23 10:50
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }


    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }

    public int getFequentRenterPoints( ) {
        return getMovie().getFequentRenterPoints(getDaysRented());
    }

}
