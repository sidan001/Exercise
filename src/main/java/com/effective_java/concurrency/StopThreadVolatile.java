package com.effective_java.concurrency;


import java.util.concurrent.TimeUnit;

/**
 * While the volatile modifier performs no mutual exclusion, it
 * guarantees that any thread that reads the field will see the
 * most recently written value
 */
public class StopThreadVolatile {
    private static volatile boolean stopRequested;
    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
                i++;
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
