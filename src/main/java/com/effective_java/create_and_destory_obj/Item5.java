package com.effective_java.create_and_destory_obj;

//Item 5: Avoid creating unnecessary objects
public class Item5 {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
//        Long sum = 0L;//7208 ms
        long sum = 0L;//867 ms
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i ;
        }
        System.out.println(sum);

        final long end = System.currentTimeMillis();
        System.out.printf("\u001b[34m%d ms%n", end - start);

    }
}
