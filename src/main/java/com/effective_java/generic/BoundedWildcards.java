package com.effective_java.generic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * PECS stands for producer-extends, consumer-super.
 *
 * Item 28: Use bounded wildcards to increase API flexibility
 */
public abstract class BoundedWildcards {


    static <T extends Comparable<? super T>> T max(
            List<? extends T> list) {

        /***************************************/
        Iterator<? extends T> i = list.iterator();
        /***************************************/

        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }


    abstract <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2);

    abstract <T extends Comparable<? super T>> T Max(List<? extends T> list);

    static void swap(List<?> list, int i, int j) {
        swapHelper(list,i,j);
    }
    //Private helper method for wildcard capture
    private static  <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
}
