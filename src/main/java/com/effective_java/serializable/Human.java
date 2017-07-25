package com.effective_java.serializable;


public abstract class Human {

    public String name;

    public Human(String name) {
        this.name = name;
    }
    //父类不可序列化但子类需要序列化时，父类需要提供一个无参构造函数。反序列化时会调用
    protected Human() {
        System.out.println("Human Constructor invoked");
    }

}
