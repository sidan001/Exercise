package com.nowcoder;

import java.util.Arrays;

/**
 *
 * 简明题意：
 *
 * 给定一个数组 nums，其中有 n 个非负整数。你的目的是进行两次操作，使得数组的元素之和最小。
 * 每次操作形如：任选一个整数 x ，将数组中所有大于等于 x 的数减去 x 。
 *
 *
 * 输入   [2, 1, 3]
 * 输出 0
 * 说明
 * 初始数组为 [2, 1, 3]。
 * 先选择 x = 2，则所有大于等于 2 的元素减去 2 ，变成 [0, 1, 1]。
 * 再选择 x = 1，则所有大于等于 1 的元素减去 1 ，变成 [0, 0, 0]。
 * 所以数组元素之和的最小值为 0。
 */
public class MinimumValueAfterDispel {

    public static void main(String[] args) {
        System.out.println(lastWorldLength("hello world"));
    }

    /**
     * 返回两次操作后，数组元素之和的最小值
     * @param nums int整型一维数组 这你你需要操作的数组
     * @return long长整型
     */
    public static long minimumValueAfterDispel (int[] nums) {
        // write code here
        Arrays.sort(nums);
        long sum = 0;
        long max = 0;
        for(int j=0; j<nums.length; j++)
        {
            sum =sum+nums[j];
            int index = j;
            int index2 = j;
            int index3 = j;
            for(int i=0; i<=j; i++)
            {
                while(index < nums.length && (long)nums[index] < (long)nums[i] + nums[j])
                {
                    index++;
                }
                while(index2 > 0 && nums[index2-1] >= nums[j] - nums[i])
                {
                    index2--;
                }
                while(index3 > i && nums[index3-1] >= nums[j] - nums[i])
                {
                    index3--;
                }
                long tmp = (nums.length-i)*(long)nums[i] + (nums.length-j+i-index2)*((long)nums[j]-nums[i]);
                long tmp2 = (nums.length-j)*(long)nums[j] + (nums.length-index+j-i)*(long)nums[i];
                long tmp3 = (long)nums[i]*(index3 -i) + ((long)nums[j]-nums[i])*(j-index3) + (long)nums[j]*(nums.length-j);
                max = Math.max(max, tmp);
                max = Math.max(max, tmp2);
                max = Math.max(max, tmp3);
            }
        }
        return sum - max;
    }


    public static int lastWorldLength(String strings){

        int spaceIndex = strings.lastIndexOf(" ");

        return strings.substring(spaceIndex + 1, strings.length()).length();
    }
}
