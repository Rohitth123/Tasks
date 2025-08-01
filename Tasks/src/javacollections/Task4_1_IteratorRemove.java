package javacollections;

import java.util.*;

public class Task4_1_IteratorRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Avocado", "Cherry"));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith("A")) {
                it.remove();
            }
        }

        System.out.println(list); 
    }
}
