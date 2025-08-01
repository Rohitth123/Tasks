package javacollections;

import java.util.*;

public class Task3_3_SortMapByKeys {
    public static void main(String[] args) {
        Map<Integer, String> unsorted = new HashMap<>();
        unsorted.put(3, "Three");
        unsorted.put(1, "One");
        unsorted.put(2, "Two");

        Map<Integer, String> sorted = new TreeMap<>(unsorted);
        System.out.println(sorted);
    }
}

