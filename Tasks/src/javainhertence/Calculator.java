package javainhertence;

public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public String add(String a, String b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("int add: " + calc.add(5, 10));                // 15
        System.out.println("double add: " + calc.add(5.5, 4.5));          // 10.0
        System.out.println("string add: " + calc.add("Hello, ", "World")); // Hello, World
    }
}
