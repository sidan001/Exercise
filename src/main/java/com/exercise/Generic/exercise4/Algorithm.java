package com.exercise.Generic.exercise4;

import java.util.List;

/**
 * 找出list指定区间范围中的第一个integer和定义的另外一个集合中的所有元素是互质数.
 * <p>
 * 互质,若N个整数的最大公因数是1，则称这N个整数互质。
 * 7,11,13的最大公因数是1，因此这是整数互质。
 */
public class Algorithm {
    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {

        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }

    // x > 0 and y > 0

    /**
     * 判断x,y是否互质,返回最大公因数.
     * @param x
     * @param y
     * @return
     */
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) {
        }
        return y;
    }

    public static void main(String[] args) {

        int i;
        for (int x = 2; x <= 100; x++) {
            //质数：只有1和自身能整除
            for (i = 2; i <= x; i++) {
                if (x % i == 0)
                    break;
            }
            if (i == x)
                System.out.print(x + ", ");

        }
    }
}
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,