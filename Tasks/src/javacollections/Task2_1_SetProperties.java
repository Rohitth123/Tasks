package javacollections;

import java.util.*;

public class Task2_1_SetProperties {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate
        set.add("Mango");

        System.out.println(set); // Output: No duplicates
    }
}

