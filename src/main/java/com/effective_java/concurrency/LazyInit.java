package com.effective_java.concurrency;


public class LazyInit {
    private final int i = init();//Normal initialization of an instance filed

    private int init() { return 2; }

    public int getI(){ return i; }

    static int getNumber(){ return FiledHolder.number; }//Lazy initialization holder class idiom for static fields

    private static class FiledHolder{
        static final int number = initNumber();

        private static int initNumber() {
            return 3;
        }
    }

    private volatile Object obj;
    Object getObj(){
        Object result = obj;
        if (result == null) {//First check (no locking)
            synchronized (this) {
                result = obj;
                if (result == null) {//Second check (with locking)
//                    obj = result = computeFieldValue();
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        final LazyInit test = new LazyInit();
        System.out.println(test.getI());
    }
}
