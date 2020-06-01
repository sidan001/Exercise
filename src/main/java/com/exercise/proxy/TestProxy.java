package com.exercise.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {

        HellWorldInterface a = (HellWorldInterface) Proxy.newProxyInstance(ProxyCls.class.getClassLoader(), ProxyCls.class.getInterfaces(), new DynamicProxy(new ProxyCls()));
        a.helloWorld();

        SayHiInterFace b = (SayHiInterFace) Proxy.newProxyInstance(ProxyCls.class.getClassLoader(), ProxyCls.class.getInterfaces(), new DynamicProxy(new ProxyCls()));
        b.sayHi();

        CharSequence str = (CharSequence) Proxy.newProxyInstance(String.class.getClassLoader(), String.class.getInterfaces(), new DynamicProxy("fifi"));

        System.out.println(str.toString());


    }
}
