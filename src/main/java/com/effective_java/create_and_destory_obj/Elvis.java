package com.effective_java.create_and_destory_obj;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Administrator on 2016/9/23.
 */
// Singleton with static factory
public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        if (getInstance() != null) {
            throw new AssertionError();
        }
    }
    public static Elvis getInstance() {
        return INSTANCE;
    }

    //preserve singleton property
    private Object readResolve() {//反序列化时保留单例模式的特性
        return INSTANCE;
    }

}