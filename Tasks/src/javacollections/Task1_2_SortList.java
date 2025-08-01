package javacollections;

import java.util.*;

public class Task1_2_SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> asc = new ArrayList<>(list);
        Collections.sort(asc);
        System.out.println("Ascending: " + asc);

        List<Integer> desc = new ArrayList<>(list);
        desc.sort(Collections.reverseOrder());
        System.out.println("Descending: " + desc);
    }
}
