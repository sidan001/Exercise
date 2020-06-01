package com.exercise.Generic.exercise4;


import java.io.UnsupportedEncodingException;

public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int x = 4;
        int y = 1;
        int r;
        while ((r = x%y)!=0){
            x = y;
            y=r;
        }
        System.out.println(y);
        System.out.println("H".getBytes().length);
        System.out.println("中".getBytes().length);
        byte[] b_gbk = "中".getBytes("GBK");
        System.out.printf("b_gbk:   %s  ", b_gbk.length);
        byte[] b_utf8 = "中".getBytes("UTF-8");
        System.out.printf("b_utf8:   %s ", b_utf8.length);
        byte[] b_iso88591 = "中".getBytes("ISO8859-1");
        System.out.printf("b_iso88591:   %s ", b_iso88591.length);
//        System.out.println("testreturn: " + testreturn());



        Thread t1 = new Thread();
        System.out.println(t1.isDaemon());
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());

        t1.setDaemon(false);


    }

    private static int  testreturn() {
        int y;
        try {
            if (true) {
                System.out.println("return before finally");
                return  1;
            }
            y = 1/ 0;
        } finally {
            System.out.println("finally");
        }
        return 0;
    }
}
