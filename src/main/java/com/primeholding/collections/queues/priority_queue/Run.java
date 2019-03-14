package com.primeholding.collections.queues.priority_queue;

import com.primeholding.collections.common.Item;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.primeholding.collections.Print.message;
import static com.primeholding.collections.Print.object;

/**
 * PriorityQueue is an unbounded queue based on a priority heap and the elements of the priority queue are ordered by default in natural order.
 * We can provide a Comparator for ordering at the time of instantiation of priority queue.
 * Java Priority Queue doesn’t allow null values and we can’t create PriorityQueue of Objects that are non-comparable.
 * e use java Comparable and Comparator for sorting Objects and Priority Queue use them for priority processing of it’s elements.
 * The head of the priority queue is the least element based on the natural ordering or comparator based ordering, if there are multiple objects with same ordering, then it can poll any one of them randomly.
 * When we poll the queue, it returns the head object from the queue.
 * Java Priority Queue size is unbounded but we can specify the initial capacity at the time of it’s creation. When we add elements to the priority queue, it’s capacity grows automatically.
 */
public class Run {

    public static void main(String[] args) {

        Queue<Item> priorityQueue = new PriorityQueue<>(Comparator.comparing(item -> item.getName().length()));

        priorityQueue.add(Item.newItem(20));
        priorityQueue.add(Item.newItem(1));
        priorityQueue.add(Item.newItem(2));
        priorityQueue.add(Item.newItem(3));
        priorityQueue.add(Item.newItem());
        priorityQueue.add(Item.newItem());
        priorityQueue.add(Item.newItem());
        priorityQueue.add(Item.newItem());

        object(priorityQueue);

        object(priorityQueue.poll());
        object(priorityQueue.poll());
        object(priorityQueue.poll());
        object(priorityQueue.poll());
        object(priorityQueue.poll());
        object(priorityQueue.poll());
        object(priorityQueue.poll());

        try {
            priorityQueue.add(null);
        } catch(NullPointerException npe) {
            message("can't add null element");
        }



    }
}
