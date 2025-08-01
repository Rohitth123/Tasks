package javacollections;

import java.util.*;

public class Task5_2_SortByName {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Charlie", 85),
            new Student("Bob", 75),
            new Student("Alice", 90)
        );

        students.sort(Comparator.comparing(s -> s.name));
        System.out.println(students);
    }
}

