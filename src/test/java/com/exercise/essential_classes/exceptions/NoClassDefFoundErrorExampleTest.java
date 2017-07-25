package com.exercise.essential_classes.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;


public class NoClassDefFoundErrorExampleTest {

    @Test(expected = ClassNotFoundException.class)
    public void givenNoDrivers_whenLoadDriverClass_thenClassNotFoundException()
            throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    @Test(expected = NoClassDefFoundError.class)
    public void givenInitErrorInClass_whenloadClass_thenNoClassDefFoundError() {

        NoClassDefFoundErrorExample sample
                = new NoClassDefFoundErrorExample();
        sample.getClassWithInitErrors();
    }
    @Test(expected = ExceptionInInitializerError.class)
    public void givenClassName_whenLoadClass_thenExceptionInInitializerError()
            throws ClassNotFoundException {
        Class.forName("com.exercise.essential_classes.exceptions.ClassWithInitErrors");
    }


}