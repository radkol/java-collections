package com.primeholding.collections.queues.custom_implementation;

import com.primeholding.collections.lists.linkedlist.custom_implementation.SimpleList;

/**
 * This is custom implementation of a queue
 * Queue is represented as a consecutive Nodes, where every node has value and link to the next node.
 * Last Node is null, representing the end of the queue.
 * Operations complexity:
 * enqueue(add at the end) -> O(n)
 * dequeue(remove first)  -> O(1)
 */
public class SimpleQueueImpl<T> implements SimpleQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void enqueue(T element) {
        Node newNode = new Node(element, null);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Can't remove from empty queue");
        }
        T val = head.value;
        head = head.next;
        size--;
        return val;

    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Can't peek element that doesn't exists");
        }
        return head.value;
    }

    public void print() {

        Node<T> current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
