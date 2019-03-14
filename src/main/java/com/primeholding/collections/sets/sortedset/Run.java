package com.primeholding.collections.sets.sortedset;

import com.primeholding.collections.common.Item;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.primeholding.collections.Print.*;

/**
 A NavigableSet implementation based on a TreeMap.
 The elements are ordered using their natural ordering,
 or by a Comparator provided at set creation time, depending on which constructor is used.
 This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
 Note that the ordering maintained by a set (whether or not an explicit comparator is provided)
 must be consistent with equals if it is to correctly implement the Set interface.
 (See Comparable or Comparator for a precise definition of consistent with equals.)
 This is so because the Set interface is defined in terms of the equals operation,
 but a TreeSet instance performs all element comparisons using its compareTo (or compare) method,
 so two elements that are deemed equal by this method are, from the standpoint of the set, equal.
 * @author rlyut
 *
 */
public class Run {

	public static void main(String[] args) {

		heading("Default Usage of TreeSet");
        TreeSet<Item> items = new TreeSet<>();

		message("can add elements in the sorted set because @Item implements Comparable!");
		Item firstItem = Item.newItem();
		items.add(firstItem);
		items.add(Item.newItem());
		items.add(Item.newItem());
		items.add(Item.newItem());
		items.add(Item.newItem());

		heading("Using foreach on Set (can do it as it is iterable). Check that items are properly ordered based on the Comparable.compareTo method in the @Item class.");
        object(items);

		message("Removing element from the set");
		items.remove(firstItem);

		message("check if set contains the object");
		object("set doesn't contain removed element " + items.contains(firstItem));

        message("Retrieve size of the set");
        object(items.size());

        message("retrieve the first element!");
        object(items.first());

        message("retrieve the first element and remove it from the set!");
        object(items.pollFirst());

        message("retrieve subset of that set having element as a threshold!");
        object(items.headSet(firstItem, true));
	}

}
