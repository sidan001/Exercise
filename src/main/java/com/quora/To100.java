package com.quora;

import java.util.BitSet;

/**
 * Can one write Java code that prints 1 through 100 without using any loop or conditions?
 */
public class To100 {
    public static void main(String[] args) {
//        Solution_1.print();
        Solution_2.print(1);
    }


}


class Solution_1{
    static  void print(){
        final String set = new BitSet() {{
            set(1, 100 + 1);
        }}.toString();

        System.out.println(set);

        System.out.append(set, 1, set.length()-1);

        System.out.println();

        System.out.print(set.subSequence(1, set.length()-1).toString());
    }
}

class Solution_2{
    public static void print(int value) {
        System.out.println(value);
        notZero(value - 100).execute(()->print(value + 1));
    }

    private static Executor notZero(int value) {
        Executor conditions [] = new Executor[2];
        conditions[0] = new Executor();
        conditions[1] = new ActiveExecutor();
        return conditions[((value | -value) >>> 31) & 1];
    }

    private static class Executor {
        void execute(Runnable block) {}
    }

    private static class ActiveExecutor extends Executor {
        void execute(Runnable block) { block.run(); }
    }
}

