package com.primeholding.collections.lists.linkedlist.custom_implementation;

import static com.primeholding.collections.Print.message;

public class Run {

    public static void main(String[] args) {

        SimpleListImpl<Integer> simpleList = new SimpleListImpl<>();
        simpleList.addFirst(200);
        simpleList.addLast(300);
        simpleList.add(400);
        simpleList.add(500);
        simpleList.addFirst(100);

        message("print the list");
        simpleList.print();

        message("reverse the list");
        simpleList.reverse();

        message("print the list");
        simpleList.print();

        message("remove 100 from list");
        simpleList.remove(100);

        message("print the list");
        simpleList.print();

        message("reverse the list");
        simpleList.reverse();

        message("print the list");
        simpleList.print();


    }
}
