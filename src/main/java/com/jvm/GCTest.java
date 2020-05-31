package com.jvm;

import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * -XX:+UseSerialGC -XX:+PrintGCDetails -Xms16m -Xmx16m
 * -XX:+UseParNewGC (工作在年轻代上)
 * -XX:+UseParallelGC （年轻的使用ParallelGC，年老代使用串型GC）
 * -XX:+UseParallelOldGC （年轻代-->ParallelGC   年老代-->ParallelOldGC   ）
 * -XX:+UseConcMarkSweepGC  年老代 只能和年轻代的ParNewGC搭配使用
 *
 * ==========================================
 * -XX:+UseG1GC -XX:MaxGCPauseMillis=100 -XX:+PrintGCDetails -Xmx16m
 * -XX:+UseG1GC 使用G1垃圾收集器
 * -XX:MaxGCPauseMillis 默认200ms
 * -XX:G1HeapRegionSize=n  region的大小，2的幂次方，划分出2048个region
 *
 *
 */
public class GCTest {

    public static void main(String[] args) throws InterruptedException {

        for (; ; ) {

            List<Object> list = new ArrayList<>();

            SecureRandom secureRandom = new SecureRandom();
            int sleep = secureRandom.nextInt(100);

            if (sleep % 2 == 0) {
                list.clear();
            } else {
                for (int i = 0; i < 10000; i++) {
                    Properties properties = new Properties();
                    properties.put("key:" + i, "value:" + Instant.now()+ i);

                    list.add(properties);
                }
            }

            Thread.sleep(sleep);

        }


    }
}