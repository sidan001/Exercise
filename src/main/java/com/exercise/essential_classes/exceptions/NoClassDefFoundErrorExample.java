package com.exercise.essential_classes.exceptions;

/**
 * NoClassDefFoundError is a fatal error. It occurs when JVM can not find the definition of the class while trying to:

 Instantiate a class by using the new keyword
 Load a class with a method call

 The error occurs when a compiler could successfully compile the class,
 but Java runtime could not locate the class file.
 It usually happens when there is an exception while executing a static block or initializing static fields of the class,
 so class initialization fails.
 */
public class NoClassDefFoundErrorExample {
    public ClassWithInitErrors getClassWithInitErrors() {
        ClassWithInitErrors test;
        try {
            test = new ClassWithInitErrors();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        test = new ClassWithInitErrors();
        return test;
    }
}

