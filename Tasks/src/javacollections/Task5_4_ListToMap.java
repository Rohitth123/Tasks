package javacollections;

import java.util.*;

class StudentWithID {
    String id, name;
    int marks;

    StudentWithID(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class Task5_4_ListToMap {
    public static void main(String[] args) {
        List<StudentWithID> students = Arrays.asList(
            new StudentWithID("S1", "Alice", 85),
            new StudentWithID("S2", "Bob", 90)
        );

        Map<String, StudentWithID> map = new HashMap<>();
        for (StudentWithID s : students) {
            map.put(s.id, s);
        }

        System.out.println(map);
    }
}

