package com.exercise.lottery;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @create 2018-08-06 13:42
 */
public class FuCai3D {
    public static void main(String[] args) {
        random3D(1);
    }

    private static void random3D(int number) {
        IntStream.range(0, number).forEach(t -> createResult());
    }


    private static void createResult() {
        List<Integer> gw = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());
        List<Integer> sw = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());
        List<Integer> bw = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());


        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            gw.remove(random.nextInt(gw.size()));
        }
        for (int i = 0; i < 9; i++) {
            sw.remove(random.nextInt(sw.size()));
        }
        for (int i = 0; i < 9; i++) {
            bw.remove(random.nextInt(bw.size()));
        }


        String 个 = gw.stream().map(s -> String.format("%2d", s)).findFirst().get();
        String 十 = sw.stream().map(s -> String.format("%2d", s)).findFirst().get();
        String 百 = bw.stream().map(s -> String.format("%2d", s)).findFirst().get();


        System.out.println(百 + " " + 十 + " " + 个);
    }
}
