package javalamda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaWithCollections {
    public static void main(String[] args) {
        // Create a List of names
        List<String> names = Arrays.asList("Anita", "Ravi", "Aman", "Sneha", "Arjun", "Kiran");

        // Print all names using lambda
        System.out.println("All Names:");
        names.forEach(name -> System.out.println(name));

        // Filter names starting with "A"
        System.out.println("\nNames starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Sort names alphabetically
        System.out.println("\nSorted Names:");
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}

