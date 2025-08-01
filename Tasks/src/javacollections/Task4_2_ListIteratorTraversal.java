package javacollections;

import java.util.*;

public class Task4_2_ListIteratorTraversal {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
