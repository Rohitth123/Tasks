package model;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Clothing: " + name + ", Size: " + size + ", Material: " + material + ", Price: ₹" + price);
    }
}
