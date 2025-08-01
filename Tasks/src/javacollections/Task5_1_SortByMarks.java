package javacollections;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class Task5_1_SortByMarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 90),
            new Student("Bob", 75),
            new Student("Charlie", 85)
        );

        Collections.sort(students);
        System.out.println(students);
    }
}

