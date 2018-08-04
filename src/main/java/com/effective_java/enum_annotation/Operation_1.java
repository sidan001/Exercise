package com.effective_java.enum_annotation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuchou@lvmama.com
 * @create 2017-07-04 14:24
 */
public enum  Operation_1 {
    PLUS("+") {
        double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        double apply(double x, double y) { return x / y; }
    };

    private final String symbol;
    Operation_1(String symbol) { this.symbol = symbol; }

    @Override
    public String toString() { return symbol; }

    abstract double apply(double x, double y);


    // Implementing a fromString method on an enum type
    private static final Map<String, Operation_1> stringToEnum = new HashMap<String, Operation_1>();

    // Initialize map from constant name to enum constant
    static {
        for (Operation_1 op : values())
            stringToEnum.put(op.toString(), op);
    }

    // Returns Operation for string, or null if string is invalid
    public static Operation_1 fromString(String symbol) {
        return stringToEnum.get(symbol);
    }


    public static void main(String[] args) {
        double x = 1.2;
        double y = 2.2;
        for (Operation_1 op : Operation_1.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));


        final Operation_1 times = Operation_1.valueOf("TIMES");
        System.out.println(times);

    }
}
