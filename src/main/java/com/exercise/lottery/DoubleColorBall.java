package com.exercise.lottery;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 双色球
 * @create 2018-08-08 9:57
 */
public class DoubleColorBall {

    public static void main(String[] args) {
        randomResult(1);
    }

    private static void randomResult(int number) {
        IntStream.range(0, number).forEach(t -> createNums());
    }

    private static void createNums() {
        List<Integer> redBalls = IntStream.rangeClosed(1, 33).boxed().collect(Collectors.toList());
        List<Integer> buleBalls = IntStream.rangeClosed(1, 16).boxed().collect(Collectors.toList());

        Random random = new Random();
        for (int i = 0; i < 27; i++) {
            redBalls.remove(random.nextInt(redBalls.size()));
        }
        for (int i = 0; i < 15; i++) {
            buleBalls.remove(random.nextInt(buleBalls.size()));
        }

        String red = redBalls.stream().map(s -> String.format("%2d", s)).collect(Collectors.joining(", "));
        String blue = buleBalls.stream().map(s -> String.format("%2d", s)).collect(Collectors.joining(", "));

        System.out.println(red + " + " + blue);
    }
}
