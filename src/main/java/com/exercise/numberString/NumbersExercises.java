package com.exercise.numberString;


import java.math.BigDecimal;

public class NumbersExercises {

    public static void  main(String args[]){

        String hexString = Integer.toHexString(187);
        System.out.println(hexString);

        String binaryString = Integer.toBinaryString(3);//3转为2进制的字符串
        System.out.println(binaryString);
        int parseInt = Integer.parseInt(binaryString, 2);//2进制的字符串"11"转为int-->3
        System.out.println(parseInt);


        String base5String = "230";
        Integer integer1 = Integer.valueOf(base5String, 5);
        System.out.println(integer1);

        Integer integer =  Integer.valueOf("5");
        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));

        double d = Double.NaN;
        System.out.println(d);
        boolean naN = Double.isNaN(d);//用于条件判断,如d声明后是否被修改过
        System.out.println(naN);

        System.out.println(2e3);

        System.out.println( new BigDecimal(12.35).multiply(new BigDecimal(100)).longValue());

        Double ddd =  new BigDecimal(12.35).multiply(new BigDecimal(100)).doubleValue();
        System.out.println(ddd.longValue());


    }

}
