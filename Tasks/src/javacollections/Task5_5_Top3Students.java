package javacollections;

import java.util.*;

public class Task5_5_Top3Students {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 80),
            new Student("Bob", 95),
            new Student("Charlie", 85),
            new Student("David", 92)
        );

        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> b.marks - a.marks);
        pq.addAll(students);

        System.out.println("Top 3 Students:");
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}

