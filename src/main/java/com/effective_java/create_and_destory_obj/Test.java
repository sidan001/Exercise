package com.effective_java.create_and_destory_obj;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

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

//        System.out.printf("hello %d %n %s", 1,"s");
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        List<String> unmodifiableList=Collections.unmodifiableList(list);

        System.out.println(unmodifiableList);

        List<String> unmodifiableList1= Collections.unmodifiableList(Arrays.asList("a","b","c"));
        System.out.println(unmodifiableList1);

        String temp=unmodifiableList.get(0);
        System.out.println("unmodifiableList [0]："+temp);

        list.add("baby");
        System.out.println("list add a item after list:"+list);
        System.out.println("list add a item after unmodifiableList:"+unmodifiableList);


        unmodifiableList1.add("bb");
        System.out.println("unmodifiableList add a item after list:"+unmodifiableList1);

    }
}
