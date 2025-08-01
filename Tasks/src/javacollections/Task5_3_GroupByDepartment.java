package javacollections;

import java.util.*;

class Employee {
    String name, department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class Task5_3_GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT"),
            new Employee("Bob", "HR"),
            new Employee("Charlie", "IT")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        System.out.println(grouped);
    }
}

