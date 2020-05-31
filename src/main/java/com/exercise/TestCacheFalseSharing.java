package com.exercise;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestCacheFalseSharing {

    public static final int MID_VALUE = 250_0000;
    public static final int MAX_VALUE  = 500_0000;
    static Random random = new Random();

    //两个线程计算数组数字总和
    static int nums[] = new int[MAX_VALUE];

    static int result[] = new int[2];

    static ExecutorService executorService = Executors.newFixedThreadPool(2);


    public static void main(String[] args) throws InterruptedException {

        long b = System.currentTimeMillis();
        System.out.println("构建数组-----------------------------");
        for (int i = 0; i < MAX_VALUE; i++) {
            nums[i] =  random.nextInt(6) % 3;
        }
        long e = System.currentTimeMillis();

        System.out.println("开始计算-----------------------------   "+ (e - b)+ "ms");


        TestCacheFalseSharing test = new TestCacheFalseSharing();

        System.out.println("falseSharing--------> begin");
        test.falseSharing();
        System.out.println("falseSharing--------> end");

        System.out.println("=============================");

        System.out.println("useRefrence--------> begin");
        test.useRefrence();
        System.out.println("useRefrence--------> end");



    }

    private void useRefrence() throws InterruptedException {
        long begin = System.currentTimeMillis();

        MyArgs args1 = new MyArgs(0, MID_VALUE, 0);
        MyArgs args2 = new MyArgs(MID_VALUE, MAX_VALUE, 0);
        Thread thread1 = new Thread(getRunnableUseRefrence(args1));
        Thread thread2 = new Thread(getRunnableUseRefrence(args2));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(args1.n);
        System.out.println(args2.n);
        System.out.println(" sum = " + args1.n + args2.n);

        long end = System.currentTimeMillis();

        System.out.println("time: "+ (end - begin) );
    }
    private static Runnable getRunnableUseRefrence(MyArgs args) {
        return () -> {
            int sum = args.n;
            for (int i = args.first; i < args.last; i++) {
                sum = sum + nums[i];
            }
            args.n = sum;
        };
    }

    private void falseSharing() throws InterruptedException {
        long begin = System.currentTimeMillis();

        Thread thread1 = new Thread(getRunnable(new MyArgs(0, MID_VALUE, 0)));
        Thread thread2 = new Thread(getRunnable(new MyArgs(MID_VALUE, MAX_VALUE, 1)));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(" sum = " + result[0] + result[1]);

        long end = System.currentTimeMillis();

        System.out.println("time: "+ (end - begin) );
    }

    private static Runnable getRunnable(MyArgs args) {
        return () -> {
            int sum = result[args.n];
            for (int i = args.first; i < args.last; i++) {
                sum = sum + nums[i];
            }
            result[args.n] =sum;
        };
    }

    class MyArgs{
        private int first;
        private int last;
        private int n;

        public MyArgs(int first, int last, int n) {
            this.first = first;
            this.last = last;
            this.n = n;
        }
    }


}
