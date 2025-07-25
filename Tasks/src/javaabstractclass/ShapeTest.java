package javaabstractclass;


abstract class Shape {
 
 abstract double area();
}


class Circle extends Shape {
 private double radius;

 
 public Circle(double radius) {
     this.radius = radius;
 }

 
 public double area() {
     return Math.PI * radius * radius;
 }
}


class Rectangle extends Shape {
 private double length;
 private double width;

 
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 
 public double area() {
     return length * width;
 }
}


public class ShapeTest {
 public static void main(String[] args) {
     Shape circle = new Circle(5); // radius = 5
     Shape rectangle = new Rectangle(4, 6); // length = 4, width = 6

     System.out.println("Area of Circle: " + circle.area());
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}
