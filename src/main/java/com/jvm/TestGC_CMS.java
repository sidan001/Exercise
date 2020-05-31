package com.jvm;

//-verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC
public class TestGC_CMS {
    public static void main(String[] args) {
        int size_1M = 1024 * 1024;


        System.out.println("-------开始分配1MB-------------");
        byte[] arr1 = new byte[4 * size_1M];
        System.out.println("-------分配1MB结束-------------");


        System.out.println("-------开始分配1MB-------------");
        byte[] arr2 = new byte[4 * size_1M];
        System.out.println("-------分配1MB结束-------------");

        System.out.println("-------开始分配1MB-------------");
        byte[] arr3 = new byte[4 * size_1M];
        System.out.println("-------分配1MB结束-------------");

        System.out.println("-------开始分配1MB-------------");
        byte[] arr4 = new byte[4 * size_1M];
        System.out.println("-------分配1MB结束-------------");
    }
}
