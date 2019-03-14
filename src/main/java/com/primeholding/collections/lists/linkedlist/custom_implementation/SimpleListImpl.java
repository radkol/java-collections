package com.primeholding.collections.lists.linkedlist.custom_implementation;

/**
 * This is custom implementation of a linked list
 * Linked list is represented as a consecutive Nodes, where every node has value and link to the next node.
 * Last Node is null, representing the end of the list.
 * Operations complexity:
 * addFirst -> O(1)
 * addLast -> O(n)
 * remove -> O(n)
 * reverse -> O(n)
 */
public class SimpleListImpl<T> implements SimpleList<T>{

    private Node<T> head;
    private int size;

    @Override
    public void addFirst(T element) {
        Node newNode = new Node(element, head);
        head = newNode;
        size++;
    }

    @Override
    public void add(T element) {
        addLast(element);
    }

    @Override
    public void addLast(T element) {
        Node newNode = new Node(element, null);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    @Override
    public void remove(T element) {
        if(isEmpty()) {
            throw new IllegalStateException("Can't remove from empty list");
        }

        if(head.getValue().equals(element)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head.next;
        Node<T> prev = head;
        while(current != null) {
            if(current.getValue().equals(element)) {
                prev.next = current.next;
                current = null;
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }

    }

    @Override
    public void reverse() {
        if(isEmpty()) {
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        while(current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
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

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
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
