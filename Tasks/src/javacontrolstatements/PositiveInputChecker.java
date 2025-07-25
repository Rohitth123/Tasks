package javacontrolstatements;

import java.util.Scanner;

public class PositiveInputChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (-1 to exit): ");
            number = sc.nextInt();

            if (number > 0) {
                System.out.println("You entered: " + number);
            } else if (number != -1) {
                System.out.println("Only positive numbers are allowed.");
            }

        } while (number != -1);

        System.out.println("Program ended.");
    }
}
