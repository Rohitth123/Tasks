package javainhertence;


class Vehicle {
 String brand;
 int speed;


 public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 
 public void showDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}


class Car extends Vehicle {
 int numberOfDoors;

 public Car(String brand, int speed, int numberOfDoors) {
     super(brand, speed);
     this.numberOfDoors = numberOfDoors;
 }

 
 @Override
 public void showDetails() {
     System.out.println("Car Details:");
     super.showDetails();
     System.out.println("Doors: " + numberOfDoors);
     System.out.println("-----------------------");
 }
}


class Bike extends Vehicle {
 boolean hasCarrier;

 public Bike(String brand, int speed, boolean hasCarrier) {
     super(brand, speed);
     this.hasCarrier = hasCarrier;
 }

 
 @Override
 public void showDetails() {
     System.out.println("Bike Details:");
     super.showDetails();
     System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
     System.out.println("-----------------------");
 }
}


public class VehicleTest {
 public static void main(String[] args) {
     Car car = new Car("Toyota", 180, 4);
     Bike bike = new Bike("Yamaha", 120, true);

     car.showDetails();
     bike.showDetails();
 }
}
