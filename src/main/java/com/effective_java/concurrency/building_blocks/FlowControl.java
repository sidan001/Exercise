package com.effective_java.concurrency.building_blocks;

import java.util.Date;
import java.util.concurrent.*;

/**
 *
 *
 * 代码中，我们模拟了 100 个线程，每个线程无限调用 RPC。
 同时使用另一个定时任务，定时更新 Semaphore 可用许可为 100。
 客户端线程调用时，会尝试获取信号量，当获取成功时，才会调用调用 RPC，反之，打印失败。
 这个小程序实现了每秒钟限制 100 个请求的 RPC 的流量控制。
 * Semaphore 实现流控
 * @create 2018-09-20 14:57
 */
public class FlowControl {
    static Semaphore semaphore = new Semaphore(100);

    public static void main(String[] args) {

            Executor timeTask = Executors.newScheduledThreadPool(1);
            ((ScheduledExecutorService) timeTask).scheduleAtFixedRate(
                    () -> semaphore.release(100 - semaphore.availablePermits()), 1000, 1000,
                    TimeUnit.MILLISECONDS);

            Executor pool = Executors.newFixedThreadPool(100);

            for (int i = 0; i < 100; i++) {
                final int num = i;
                pool.execute(() -> {
                    for (; ; ) {
                        for (int j = 0; j < 200; j++) {
                            if (semaphore.tryAcquire()) {
                                callRpc(num, j);
                            } else {
                                System.err.println("call fail");
                            }
                        }
                    }
                });
            }
    }
    private static void callRpc(int num, int j) {
        System.out.println(String.format("%s - %s: %d %d", new Date(), Thread.currentThread(), num, j));
    }
}
