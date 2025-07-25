package javaoperators;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result;

        
        result = a + b;
        System.out.println("Addition: " + result);

        result = a - b;
        System.out.println("Subtraction: " + result);

        result = a * b;
        System.out.println("Multiplication: " + result);

        result = a / b;
        System.out.println("Division: " + result);

        result = a % b;
        System.out.println("Modulus: " + result);

        
        int x = a;
        x += b;
        System.out.println("After x += b: " + x);

        x = a;
        x *= b;
        System.out.println("After x *= b: " + x);

        x = a;
        x -= b;
        System.out.println("After x -= b: " + x);
    }
}
