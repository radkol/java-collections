package com.primeholding.collections.map.hashmap;

import com.primeholding.collections.common.Item;

import java.util.HashMap;
import java.util.Map;

import static com.primeholding.collections.Print.message;
import static com.primeholding.collections.Print.object;

/**
 * Hash table based implementation of the Map interface.
 * This implementation provides all of the optional map operations and permits null values and the null key.
 * HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits null.
 * This class makes no guarantees for the order of the map.
 * This implementation provides constant-time performance for the basic operations (get and put).
 * It provides constructors to set initial capacity and load factor for the collection.
 */
public class Run {

    public static void main(String[] args) {

        Map<Item, Integer> target = new HashMap<>();

        Item item = Item.newItem();
        Item itemSize2 = Item.newItem(2);
        Item itemSize5 = Item.newItem(5);

        target.put(item, 1);
        target.put(itemSize2, 2);
        target.put(itemSize5, 5);

        message("look up item by its hashcode and get the value");
        object(target.get(itemSize2));

        message("check if key contains by its hashcode");
        object(target.containsKey(itemSize2));

        message("remove item");
        object(target.remove(itemSize2));
        object("Object is removed now " + !target.containsKey(itemSize2));

    }
}
