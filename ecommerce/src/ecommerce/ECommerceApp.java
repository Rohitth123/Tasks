package ecommerce;



import model.*;
import payment.*;
import util.*;

import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter customer email: ");
        String email = sc.nextLine();
        Customer customer = new Customer(1, name, email);

        // Choose product type
        System.out.print("Choose product type (1: Electronics, 2: Clothing): ");
        int type = sc.nextInt();
        sc.nextLine();  // consume newline

        Product product = null;
        if (type == 1) {
            System.out.print("Enter product name: ");
            String pname = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            sc.nextLine(); // consume newline
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter warranty in months: ");
            int warranty = sc.nextInt();

            product = new Electronics(101, pname, price, brand, warranty);
        } else {
            System.out.print("Enter product name: ");
            String pname = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            sc.nextLine(); // consume newline
            System.out.print("Enter size: ");
            String size = sc.nextLine();

            System.out.print("Enter material: ");
            String material = sc.nextLine();

            product = new Clothing(102, pname, price, size, material);
        }

        // Choose payment method
        System.out.print("Choose payment method (1: UPI, 2: Credit Card, 3: COD): ");
        int payType = sc.nextInt();
        sc.nextLine();

        Payment payment = null;
        if (payType == 1) {
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            payment = new UPIPayment(product.getPrice(), upi);
        } else if (payType == 2) {
            System.out.print("Enter Card Number: ");
            String card = sc.nextLine();
            payment = new CreditCardPayment(product.getPrice(), card);
        } else {
            payment = new CODPayment(product.getPrice());
        }

        // Apply lambda discount
        System.out.print("Enter discount percentage (e.g., 10 for 10%): ");
        double discountPercent = sc.nextDouble();
        Discountable discount = (amount) -> amount * ((100 - discountPercent) / 100);

        // Place order
        Order order = new Order(5001, product, customer, payment);
        order.placeOrder(discount);
    }
}
