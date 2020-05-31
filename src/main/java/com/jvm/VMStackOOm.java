package com.jvm;

//-Xss200M
public class VMStackOOm {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread(){
        while (true) {
            new Thread(() -> dontStop()).start();
        }
    }

    public static void main(String[] args) {
        VMStackOOm vmStackOOm = new VMStackOOm();
        vmStackOOm.stackLeakByThread();
    }
}
