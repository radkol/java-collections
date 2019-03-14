package com.primeholding.collections.queues.custom_implementation;

public interface SimpleQueue<T> {

    void enqueue(T element);

    T dequeue();

    int size();

    boolean isEmpty();

    T peek();
}
