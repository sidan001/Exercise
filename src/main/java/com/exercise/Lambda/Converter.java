package com.exercise.Lambda;

/**
 * Created by Administrator on 2016/12/14.
 */
@FunctionalInterface
public interface Converter <F, T> {
    T convert(F from);


    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
