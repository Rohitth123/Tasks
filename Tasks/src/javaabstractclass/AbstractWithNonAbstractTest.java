package javaabstractclass;


abstract class Shape2 {
 abstract double area();  // Abstract method

 void displayShapeType() {
     System.out.println("This is a geometric shape.");
 }
}

//Subclass - Circle
class Circle2 extends Shape2 {
 private double radius;

 Circle2(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

//Subclass - Rectangle
class Rectangle2 extends Shape2 {
 private double length, width;

 Rectangle2(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }
}

//Main class
public class AbstractWithNonAbstractTest {
 public static void main(String[] args) {
     Shape2 shape1 = new Circle2(3.5);
     Shape2 shape2 = new Rectangle2(4, 7);

     shape1.displayShapeType();
     System.out.println("Circle Area: " + shape1.area());

     shape2.displayShapeType();
     System.out.println("Rectangle Area: " + shape2.area());
 }
}

