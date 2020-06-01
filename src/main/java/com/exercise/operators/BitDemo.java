/**
* @Description: TODO
 */
package com.exercise.operators;

import java.util.Arrays;

public class BitDemo {

        private static final int COUNT_BITS = Integer.SIZE - 3;

        // runState is stored in the high-order bits
        private static final int RUNNING    = -1 << COUNT_BITS;
        private static final int SHUTDOWN   =  0 << COUNT_BITS;
        private static final int STOP       =  1 << COUNT_BITS;
        private static final int TIDYING    =  2 << COUNT_BITS;
        private static final int TERMINATED =  3 << COUNT_BITS;

        public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.print("val:" + Integer.toBinaryString(val));
        System.out.print(" & ");
        System.out.println("bitmask:" +  Integer.toBinaryString(bitmask));
        
        // prints "2"
        System.out.println(val & bitmask);

        System.out.println("-2:         "+Integer.toBinaryString(-2));
        System.out.println("-1:         "+Integer.toBinaryString(-1));
        System.out.println("RUNNING:    "+Integer.toBinaryString(RUNNING));
        System.out.println("RUNNING:    "+RUNNING);

        System.out.println(Integer.toBinaryString(0));
        System.out.println("SHUTDOWN:   "+SHUTDOWN);
        System.out.println("SHUTDOWN:   "+Integer.toBinaryString(SHUTDOWN));

        System.out.println("1   :       "+Integer.toBinaryString(1));
        System.out.println("STOP:       "+STOP);
        System.out.println("STOP:       "+Integer.toBinaryString(STOP));

        System.out.println("2      :    "+Integer.toBinaryString(2));
        System.out.println("TIDYING:    "+TIDYING);
        System.out.println("TIDYING:    "+Integer.toBinaryString(TIDYING));
        System.out.println("3         : "+Integer.toBinaryString(3));
        System.out.println("TERMINATED: "+TERMINATED);
        System.out.println("TERMINATED: "+Integer.toBinaryString(TERMINATED));

        System.out.println(Integer.parseUnsignedInt("10000000000000000000000000000000", 2));


        String[] split = "123".split("");
        Arrays.stream(split).forEach(System.out::println);


        System.out.println(Long.parseLong("b2f81b08", 16));
        System.out.println(Long.toString(3002604296L, 16));

        }
}
