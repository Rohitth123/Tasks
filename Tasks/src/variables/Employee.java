package variables;

public class Employee {
    
    static int count = 0;

    
    String name;
    int id;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        count++; // Increment count when an employee is created
    }

    
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Ravi", 101);
        Employee emp2 = new Employee("Sneha", 102);
        Employee emp3 = new Employee("Amit", 103);

        
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        
        System.out.println("Total number of employees: " + Employee.count);
    }
}

