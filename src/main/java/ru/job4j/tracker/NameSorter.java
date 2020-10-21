package ru.job4j.tracker;

import ru.job4j.collection.ReverseSortByNameItem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Snacks"),
                new Item("Meat"),
                new Item("Vegetables")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, new ReverseSortByNameItem());
        System.out.println(items);
    }
}
