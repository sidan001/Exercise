package com.exercise.lottery;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by chou on 2018/8/4.
 */
public class BigLotto {
    public static void main(String[] args) {

        randomBigLotto(1);


    }

    private static void randomBigLotto(int number) {
        randomBigLotto(number, 0);
    }
    private static void randomBigLotto(int number, int satgeNum) {
        IntStream.range(0, number).forEach(t -> createNums(satgeNum));
    }



    private static void createNums(int satgeNum) {
        List<Integer> redBalls = IntStream.rangeClosed(1, 35).boxed().collect(Collectors.toList());
        List<Integer> buleBalls = IntStream.rangeClosed(1, 12).boxed().collect(Collectors.toList());

        Random random = satgeNum > 0 ? new Random(satgeNum) : new Random();
        for (int i = 0; i < 30; i++) {
            redBalls.remove(random.nextInt(redBalls.size()));
        }
        for (int i = 0; i < 10; i++) {
            buleBalls.remove(random.nextInt(buleBalls.size()));
        }

        String red = redBalls.stream().map(s -> String.format("%2d", s)).collect(Collectors.joining(", "));
        String blue = buleBalls.stream().map(s -> String.format("%2d", s)).collect(Collectors.joining(", "));

        System.out.println(red + " + " + blue);
    }
}
