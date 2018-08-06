package com.refactoring.s_1.before;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

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
            double thisAmount = 0;
            Rental each = rentals.nextElement();


            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENDS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }

            //add frequent renter points
            fequentRenterPoints++;
            //add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
                fequentRenterPoints++;
            }

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmout += thisAmount;

        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmout) + "\n";
        result += "You earned " + String.valueOf(fequentRenterPoints) + " frequent renter points";

        return result;
    }
}
