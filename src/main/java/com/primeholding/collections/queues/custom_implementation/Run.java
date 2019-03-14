package com.primeholding.collections.queues.custom_implementation;

import static com.primeholding.collections.Print.message;
import static com.primeholding.collections.Print.object;

public class Run {

    public static void main(String[] args) {

        SimpleQueueImpl<Integer> queue = new SimpleQueueImpl<>();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        message("print the queue");
        queue.print();

        object(queue.dequeue());
        object(queue.dequeue());
        object(queue.dequeue());
        object(queue.dequeue());
        object(queue.dequeue());

        object(queue.size());
        object(queue.isEmpty());
    }
}
