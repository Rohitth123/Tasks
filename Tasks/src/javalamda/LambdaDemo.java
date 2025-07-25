package javalamda;

public class LambdaDemo {
    public static void main(String[] args) {

        // Lambda for addition
        MathOperation add = (a, b) -> a + b;

        // Lambda for subtraction
        MathOperation subtract = (a, b) -> a - b;

        // Lambda for multiplication
        MathOperation multiply = (a, b) -> a * b;

        // Call each operation
        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + subtract.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
    }
}

