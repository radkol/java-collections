package com.primeholding.collections.map.treemap;

import com.primeholding.collections.common.Item;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import static com.primeholding.collections.Print.message;
import static com.primeholding.collections.Print.object;

/**
 * A Red-Black tree based NavigableMap implementation.
 * The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
 * This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations.
 * Algorithms are adaptations of those in Cormen, Leiserson, and Rivest’s Introduction to Algorithms.
 * Note that the ordering maintained by a TreeMap, like any sorted map, and whether or not an explicit comparator is provided,
 * must be consistent with equals if this sorted map is to correctly implement the Map interface.
 * (See Comparable or Comparator for a precise definition of consistent with equals.) This is so because the Map interface is defined in terms of the equals operation,
 * but a sorted map performs all key comparisons using its compareTo (or compare) method, so two keys that are deemed equal by this method are, from the standpoint of the sorted map, equal.
 * The behavior of a sorted map is well-defined even if its ordering is inconsistent with equals; it just fails to obey the general contract of the Map interface.
 */
public class Run {

    public static void main(String args[]) {

        TreeMap<Item, Integer> items = new TreeMap<>(Comparator.comparing(item -> item.getName().length()));
        Item itemS3 = Item.newItem(3);
        Item itemS4 = Item.newItem(4);
        Item itemS5 = Item.newItem(5);
        Item itemS6 = Item.newItem(6);
        Item itemS7 = Item.newItem(7);

        items.put(itemS6, 6);
        items.put(itemS4, 4);
        items.put(itemS7, 7);
        items.put(itemS3, 3);
        items.put(itemS5, 5);

        message("items are ordered because TreeMap is sorted based on the Comparable");
        object(items);

        message("get subview of that map with all keys that are less than itemS5");
        SortedMap<Item, Integer> subSortedMap = items.headMap(itemS5);
        object(subSortedMap);

        message("removing element from the sub-map, remove the element from the original map too!");
        subSortedMap.remove(itemS3);

        message("element is missing from both maps");
        object(items);
        object(subSortedMap);
    }
}
