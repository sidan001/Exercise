package com.exercise.proxy;

public final class ProxyCls implements HellWorldInterface,SayHiInterFace {

    @Override
    public void helloWorld() {
        System.out.println("hell world");
    }

    @Override
    public void sayHi() {
        System.out.println("Hi, baby");
    }
}