package com.primeholding.collections.lists.arraydeque;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

import static com.primeholding.collections.Print.heading;
import static com.primeholding.collections.Print.message;

/**
 * A linear collection that supports element insertion and removal at both ends. The name deque is short for “double-ended queue” and is usually pronounced “deck”.
 * Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.
 * This interface defines methods to access the elements at both ends of the deque. Methods are provided to insert, remove, and examine the element.
 */
public class Run {

    public static void main(String[] args) {

        heading("Array Deque - Resizeable java.util.Deque");
        ArrayDeque<Integer> deck = new ArrayDeque<>();

        message("adding at front, at the end");
        deck.addFirst(100);
        deck.addLast(200);
        deck.add(500);

        message("offer, same as adding");
        deck.offerFirst(0);
        deck.offerLast(Integer.MAX_VALUE);


        message("remove last element. throw exception if no element");
        deck.removeLast();

        message("remove first element. throw exception if no element");
        deck.removeFirst();

        message("remove first element. no exception");
        deck.pollFirst();

        deck.removeLast();
        deck.removeLast();
        try {
            deck.removeFirst();
        } catch ( NoSuchElementException ex) {
            message("trying to remove element that doesnt exists ");
        }

        message("No exception when poll method is called");
        deck.pollFirst();
    }

}
