package com.effective_java.create_and_destory_obj;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Item 6: Eliminate obsolete object references
 *
 *
 * So where is the memory leak? If a stack grows and then shrinks, the objects
 * that were popped off the stack will not be garbage collected, even if the program
 * using the stack has no more references to them.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];

      /*  Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;*/
    }
    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }


    public static void main(String[] args) throws InterruptedException {
        Stack s  = new Stack();
        for(;;) {
            for (int i = 0; i < 10; i++) {
                s.push(String.valueOf(i));
            }
            for (int i = 0; i < 5; i++) {
                final Object pop = s.pop();
            }
            Thread.sleep(1L*1000L);
        }



    }
}
