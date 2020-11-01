package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        LinkedHashSet<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.isBlank() ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        List<String> list = new ArrayList<>(tmp);
        return list;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }
}
