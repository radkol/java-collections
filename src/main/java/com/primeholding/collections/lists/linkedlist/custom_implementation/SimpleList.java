package com.primeholding.collections.lists.linkedlist.custom_implementation;

public interface SimpleList<T> {

    void addFirst(T element);

    void add(T element);

    void addLast(T element);

    void remove(T element);

    void reverse();

    int size();

    boolean isEmpty();

    T getFirst();

    T getLast();

}
