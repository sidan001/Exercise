package com.effective_java.concurrency.building_blocks;


interface Computable<A, V> {
    V compute(A arg) throws InterruptedException;
}