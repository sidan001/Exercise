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
}
