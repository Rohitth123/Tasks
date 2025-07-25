package service;

import model.Student;

public class StudentService {
    private Student savedStudent;

    public void saveStudent(Student student) {
        this.savedStudent = student;
        System.out.println("Student saved successfully.");
    }

    public void printStudent() {
        if (savedStudent != null) {
            System.out.println("Student Details:");
            System.out.println("ID: " + savedStudent.getId());
            System.out.println("Name: " + savedStudent.getName());
        } else {
            System.out.println("No student saved.");
        }
    }
}
