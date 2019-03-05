package com.primeholding.collections.sets.hashset;

import java.util.HashSet;
import java.util.Set;

import com.primeholding.collections.common.Item;

import static com.primeholding.collections.Print.empty;
import static com.primeholding.collections.Print.heading;
import static com.primeholding.collections.Print.object;
import static com.primeholding.collections.Print.objectSameLine;
/**
 * Java HashSet is the basic implementation the Set interface that is backed by
 * a HashMap. It makes no guarantees for iteration order of the set and permits
 * the null element.
 * 
 * This class offers constant time performance for basic operations (add,
 * remove, contains and size), assuming the hash function disperses the elements
 * properly among the buckets. We can set the initial capacity and load factor
 * for this collection. The load factor is a measure of how full the hash map is
 * allowed to get before its capacity is automatically increased.
 *  * 
 * @author rlyut
 *
 */
public class Run {

	public static void main(String[] args) {
		
		
		heading("Default Usage");
		Set<Item> items = new HashSet<>();
		
		Item firstItem = Item.newItem();
		items.add(firstItem);
		items.add(Item.newItem());
		items.add(Item.newItem());
		items.add(Item.newItem());
		items.add(Item.newItem());
		
		heading("Using foreach on Set (can do it as it is iterable");
		for(Item item : items) {
			
		}
		
		
		
		
		
	}

}
