package com.guava;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class RateLimiterExample {
    public static void main(String[] args) throws InterruptedException {
//        RateLimiter r = RateLimiter.create(5);
//        while (true) {
//            System.out.println("get 5 tokens: " + r.acquire(5) + "s");
//            System.out.println("get 1 tokens: " + r.acquire(1) + "s");
//            System.out.println("get 1 tokens: " + r.acquire(1) + "s");
//            System.out.println("get 1 tokens: " + r.acquire(1) + "s");
//            System.out.println("end");
//        }
        method1();


    }

    private static void method1() throws InterruptedException {
        // qps设置为5，代表一秒钟只允许处理五个并发请求
        RateLimiter rateLimiter = RateLimiter.create(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        int nTasks = 10;
        CountDownLatch countDownLatch = new CountDownLatch(nTasks);
        long start = System.currentTimeMillis();
        for (int i = 0; i < nTasks; i++) {
            final int j = i;
            rateLimiter.acquire(1);
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + " gets job " + j + " done");
                countDownLatch.countDown();
            });
        }
        executorService.shutdown();
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("10 jobs gets done by 5 threads concurrently in " + (end - start) + " milliseconds");
    }

}
