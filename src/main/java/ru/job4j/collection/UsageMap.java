package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bestJedi@yandex.ru", "Obi Wan Kenobi");
        map.put("KolBask@mail.ru", "Nikolay Olegovich Baskov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}