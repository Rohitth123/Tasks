package javacollections;

import java.util.*;

public class Task1_3_RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C", "Java", "Python");
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set); 
    }
}

