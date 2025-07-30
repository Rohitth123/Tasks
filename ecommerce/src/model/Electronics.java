package model;

public class Electronics extends Product {
    private String brand;
    private int warrantyInMonths;

    public Electronics(int id, String name, double price, String brand, int warranty) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyInMonths = warranty;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Brand: " + brand + ", Warranty: " + warrantyInMonths + " months, Price: ₹" + price);
    }
}
