package javacollections;

import java.util.*;

public class Task1_1_ArrayListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "C", "C++", "Ruby", "Python"));
        list.remove(1); 
        System.out.println(list); 
    }
}

