package com.effective_java.create_and_destory_obj;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
    /*    final Elvis instance = Elvis.getInstance();

        final Class<Elvis> elvisClass = Elvis.class;

            final Constructor<Elvis>[] declaredConstructors = (Constructor<Elvis>[]) elvisClass.getDeclaredConstructors();
            final Constructor<Elvis> declaredConstructor = declaredConstructors[0];
            declaredConstructor.setAccessible(true);
            try {
                final Elvis elvis = declaredConstructor.newInstance();
                System.out.println(Objects.equals(elvis,instance));
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }*/

        System.out.printf("hello %d %n %s", 1,"s");

    }
}
