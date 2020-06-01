package com.exercise.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    Object obj;
    public DynamicProxy(Object object) {
        this.obj = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object result = method.invoke(obj, args);
        System.out.println(result );
        System.out.println("after invoke ");
        return result;
    }
}