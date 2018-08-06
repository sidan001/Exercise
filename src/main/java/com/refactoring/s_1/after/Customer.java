package com.refactoring.s_1.after;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 *
 * @create 2018-05-23 10:52
 */
public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    public String getName() {
        return _name;
    }

    public String statement(){
        double totalAmout = 0;
        int fequentRenterPoints = 0;
        final Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmout()) + "\n";
        result += "You earned " + String.valueOf(getFequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private int getFequentRenterPoints() {
        int result = 0;
        final Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFequentRenterPoints();

        }
        return result;
    }

    private double getTotalAmout() {
        double result = 0;
        final Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();

        }
        return result;
    }
}
