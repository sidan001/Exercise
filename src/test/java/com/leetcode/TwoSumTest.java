package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSumTest = new TwoSum();

    @Test
    void twoSum() {
        int[] arr = twoSumTest.twoSum(new int[]{2, 3, 7, 8}, 9);

        assertArrayEquals(new int[]{0, 2}, arr);
    }

    @Test
    void twoSumAnother() {

    }
}