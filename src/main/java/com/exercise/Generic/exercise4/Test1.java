package com.exercise.Generic.exercise4;


public class Test1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 2;
        int r;
        while ((r = x%y)!=0){
            x = y;
            y=r;
        }

    }
}
