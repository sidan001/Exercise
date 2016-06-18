package com.exercise.numberString;


import java.util.Calendar;
import java.util.Locale;

/**
 * @see
 * java.util.Formatter
 */
public class PrintStreamDemo {

    public static void main(String args[]) {
        int i = 461012;
        System.out.format("The value of i is: %d%n", i);

        System.out.format(Locale.CHINESE,"The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s", 1.1f, 2, "hello");


        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        System.out.format("%tD%n", c);    // -->  "05/29/06"

        System.out.format("%tY-%tm-%td%n", c,c,c);//2016-06-18
        System.out.format("%tY-%tB-%td%n", c,c,c);//2016-六月-18
    }
}
