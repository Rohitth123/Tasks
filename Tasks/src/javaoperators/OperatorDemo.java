package javaoperators;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Pre and post increment
        System.out.println("Initial a: " + a);
        System.out.println("Post-increment a++: " + (a++)); // prints 5, then a becomes 6
        System.out.println("After post-increment a: " + a);
        System.out.println("Pre-increment ++a: " + (++a)); // a becomes 7, then prints 7

        // Bitwise shift operators
        int num = 8; // binary: 1000
        System.out.println("\nBitwise Left Shift (8 << 1): " + (num << 1)); // 16
        System.out.println("Bitwise Right Shift (8 >> 1): " + (num >> 1)); // 4

        // Logical vs Bitwise AND
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical AND (x && y): " + (x && y)); // short-circuiting
        System.out.println("Bitwise AND (x & y): " + (x & y));     // evaluates both

        
        int i = 5;
        boolean result1 = (i < 5) && (++i > 0); // short-circuits, ++i not executed
        System.out.println("\nAfter logical AND, i = " + i + ", result = " + result1);

        i = 5;
        boolean result2 = (i < 5) & (++i > 0); // both sides evaluated, i incremented
        System.out.println("After bitwise AND, i = " + i + ", result = " + result2);
    }
}

