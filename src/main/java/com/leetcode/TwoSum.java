package com.leetcode;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class TwoSum {

    //nums = [2, 7, 11, 15], 分别记录2和7的位置
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    // 如 nums = [2, 7, 11, 15] ,记录两次7的位置
    public static int[] twoSumAnother(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                result[0] = map.get(numbers[i]);
                result[1] = i;
                break;
            }
            map.put(target - numbers[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        IntStream intStream = Arrays.stream(twoSumAnother(nums, target));

        intStream.forEach(System.out::println);


    }

}
