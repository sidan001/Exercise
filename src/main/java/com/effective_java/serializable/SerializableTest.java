package com.effective_java.serializable;


import com.effective_java.create_and_destory_obj.Elvis;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class SerializableTest {
    static final String dataFile = "ObjectData";

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        final Calendar instance = Calendar.getInstance();
        final Elvis elvis = Elvis.getInstance();
        final Man man = new Man("tom");
        final Foo foo = new Foo(1, 2);
        final Hello hello = new Hello("world", 2);

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));

            out.writeObject(instance);
            out.writeObject(elvis);
            out.writeObject(man);
            out.writeObject(foo);
            out.writeObject(hello);

        } finally {
            out.close();
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));


            Calendar date = (Calendar) in.readObject();
            Elvis    e    = (Elvis) in.readObject();
            Man      m    = (Man) in.readObject();
            Foo      f    = (Foo) in.readObject();
            Hello    h    = (Hello) in.readObject();

            System.out.printf("Calendar　: %s%n", Objects.equals(date, instance));
            System.out.printf("Elvis　: %s%n", Objects.equals(elvis, e));
            System.out.printf("Man　: %s%n", Objects.equals(man, m));
            System.out.printf("Man.name: %s　equals  m.name: %s  %s%n", man.name, m.name,Objects.equals(man.name, m.name));
            System.out.printf("Foo　: %s%n", Objects.equals(foo, f));
            System.out.printf("foo: %s%n", foo.toString());
            System.out.printf("f: %s%n", f.toString());
            System.out.printf("h: %s ,%s %n", h.getGretting(),h.getNum());


        } finally {
            in.close();
        }
    }
}
