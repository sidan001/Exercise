package com.exercise.Lambda;

/**
 * Created by Administrator on 2016/12/14.
 */
public class TestConverter {
    public static void main(String[] args) {

        Converter<String, Integer> converter = i -> Integer.valueOf(i);

        Integer i = converter.convert("8");

        System.out.println(converter.sqrt(4));
    }
}
