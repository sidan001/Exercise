package com.jvm;

/**
 * -Xss159k
 */
public class VMStackSOF {
    private int statckLength = 1;

    public void statckLeak(){
        statckLength++;

        statckLeak();
    }

    public static void main(String[] args) {
        VMStackSOF vmStackSOF = new VMStackSOF();
        try {

            vmStackSOF.statckLeak();
        } catch (Throwable e) {
            System.out.println("stack 深度：" + vmStackSOF.statckLength);
            throw e;
        }
    }
}
