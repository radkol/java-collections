package com.primeholding.collections.lists.linkedlist;

import java.util.ArrayDeque;
import java.util.LinkedList;

import static com.primeholding.collections.Print.*;

/**
 * Doubly-linked list implementation of the List and Deque interfaces.
 * Implements all optional list operations, and permits all elements (including null).
 * All of the operations perform as could be expected for a doubly-linked list.
 * Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.
 */
public class Run {

    public static void main(String[] args) {

        heading("-----Default Usage----");
        defaultUsage();

        heading("-----Peek / Offer Usage----");
        peekOfferUsage();
    }

    private static void peekOfferUsage() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        message("peek  - looks up the element, without removing it!");

        message("peek and peek first, same thing");
        object(linkedList.peek());
        message("peek first");
        object(linkedList.peekFirst());
        message("peek last");
        object(linkedList.peekLast());

        message("offer and add method are the same!");
        linkedList.offer(200);
        object(linkedList);
    }

    private static void defaultUsage() {

        LinkedList<Integer> linkedList = new LinkedList<>();

        message("adding at the beginning");
        linkedList.addFirst(100);

        message("adding at the end");
        linkedList.addLast(500);

        message("adding at the end");
        linkedList.add(300);

        message("adding at position 0");
        linkedList.add(0, -100);

        object(linkedList);

    }

}
