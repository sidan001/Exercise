package com.jvm;


import java.time.Instant;

/**
 *  逃逸分析，标量替换
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -xlog:c5_gc
 */
public class TestTLAB {

    class User{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    void alloc(int i ){
        new User(i, "name" + i);
    }
    public static void main(String[] args) {

        TestTLAB testTLAB = new TestTLAB();

        Instant before = Instant.now();
        for (int i = 0; i < 1000_0000; i++) {
            testTLAB.alloc(i);
        }
        Instant after = Instant.now();

        System.out.println(after.toEpochMilli() - before.toEpochMilli());

    }
}
