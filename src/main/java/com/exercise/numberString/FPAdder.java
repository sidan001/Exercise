package com.exercise.numberString;


import java.text.DecimalFormat;

public class FPAdder {
    //执行 java FPAdder 1 1e2 3.0 4.754
    public static void main(String[] args) {
        int numArgs = args.length;

        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } else {
            double sum = 0.0;

            for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
            }

            //format the sum
            DecimalFormat myFormatter = new DecimalFormat("###,###.##");
            String output = myFormatter.format(sum);

            //print the sum
            System.out.println(output);
        }
    }
}
