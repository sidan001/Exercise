package com.effective_java.create_and_destory_obj;

/**
 * Created by Administrator on 2016/9/23.
 */
// A builder for objects of type T
public interface Builder<T> {
    public T build();
}