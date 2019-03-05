package com.primeholding.collections.lists.arraylist;

import static com.primeholding.collections.Print.empty;
import static com.primeholding.collections.Print.heading;
import static com.primeholding.collections.Print.object;
import static com.primeholding.collections.Print.objectSameLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.primeholding.collections.common.Item;

/**
 * Java ArrayList is the resizable-array implementation of the List interface.
 * Implements all optional list operations, and permits all elements, including
 * null. In addition to implementing the List interface, this class provides
 * methods to manipulate the size of the array that is used internally to store
 * the list. (This class is roughly equivalent to Vector, except that it is
 * unsynchronized.) The size, isEmpty, get, set, iterator, and listIterator
 * operations run in constant time. The add operation runs in amortized constant
 * time, that is, adding n elements requires O(n) time. All of the other
 * operations run in linear time (roughly speaking). The constant factor is low
 * compared to that for the LinkedList implementation.
 *
 */
public class Run {

	public static void main(String[] args) {
		
		heading("-----Default Usage----");
		defaultUsage();
		
		heading("-----Iterator Usage----");
		iteratorUsage();
		
		heading("-----List Iterator Usage----");
		listIteratorUsage();
	}

	private static void listIteratorUsage() {
		List<Item> source = new ArrayList<>();
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		
		heading("print elements");
		ListIterator<Item> listIterator = source.listIterator();
		while(listIterator.hasNext()) {
			Item next = listIterator.next();
			objectSameLine(next + (listIterator.hasNext() ? ", " : ""));
		}
		empty();
		heading("print elements backwards");
		
		while(listIterator.hasPrevious()) {
			Item prev = listIterator.previous();
			objectSameLine(prev + (listIterator.hasPrevious() ? ", " : ""));
		}
		
		while(listIterator.hasNext()) {
			Item next = listIterator.next();
			objectSameLine(next + (listIterator.hasNext() ? ", " : ""));
			listIterator.remove();
		}
	}

	private static void iteratorUsage() {
		List<Item> source = new ArrayList<>();
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());

		Iterator<Item> iterator = source.iterator();

		// get all elements
		while (iterator.hasNext()) {
			Item next = iterator.next();
			objectSameLine(next + (iterator.hasNext() ? ", " : ""));
		}

		empty();
		heading("Visualize List removing issue while interating on it (fail fast)");
		
		iterator = source.iterator();

		try {
			// after remove is called, the hasNext will throw exception
			while (iterator.hasNext()) {
				iterator.next();
				// you cannot delete element in the middle of the iteration.
				source.remove(3);
			}
		} catch (ConcurrentModificationException cme) {
			heading("Exception Handled for education purpose. That should never be done this way!");
			heading("But here, list size will be reduced by one!");
			heading("Size is " + source.size());
		}
		
		heading("Valid way of removing elements");
		
		iterator = source.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
	}

	private static void defaultUsage() {

		List<Item> source = new ArrayList<>(4);
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());
		source.add(Item.newItem());

		// auto-resize so we can add fifth element
		source.add(Item.newItem());

		heading("nicely printing as List implements toString");
		object(source);

		heading("easy sorting alphabetically - Item is Comparable so it can be sorted");
		Collections.sort(source);
		object(source);

		heading("easy custom sorting - using Comparator");
		Collections.sort(source, Comparator.comparing(item -> item.getName().length()));
		object(source);
		
		heading("get exact element");
		object(source.get(3));
	}

}
