package javacollections;

import java.util.*;

public class Task3_2_CharFrequency {
    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(freqMap); // Output: {h=1, e=1, l=2, o=1}
    }
}

