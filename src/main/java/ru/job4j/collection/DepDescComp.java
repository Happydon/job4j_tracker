package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split("/");
        String[] second = o2.split("/");
        if (!first[0].equals(second[0])) {
            return second[0].compareTo(first[0]);
        }
        int rsl;
        for (int i = 1; i < Math.min(first.length, second.length); i++) {
            rsl = first[i].compareTo(second[i]);
            if (rsl != 0) {
                return rsl;
            }
        }
        if (first.length != second.length) {
            return Integer.compare(first.length, second.length);
        }
        return 0;
    }
}