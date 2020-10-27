package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftNum = left.split(". ", 2);
        String[] rightNum = right.split(". ", 2);
        return Integer.valueOf(leftNum[0]).compareTo(Integer.valueOf(rightNum[0]));
    }
}
