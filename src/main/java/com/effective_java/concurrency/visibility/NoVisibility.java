package com.effective_java.concurrency.visibility;


import java.util.concurrent.TimeUnit;

public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
//        new Thread(() -> {
//            while (!ready)
//                Thread.yield();
//            System.out.println(number);
//        }).start();
        TimeUnit.SECONDS.sleep(1);
        number = 42;
        ready = true;
    }
}
