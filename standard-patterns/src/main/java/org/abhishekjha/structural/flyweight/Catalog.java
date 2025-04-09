package org.abhishekjha.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private final Map<String, Item> items = new HashMap<>();

    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }
    public int totalItems() {
        return items.size();
    }
}
