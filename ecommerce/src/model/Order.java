package model;

import payment.*;
import util.Discountable;

public class Order {
    private int orderId;
    private Product product;
    private Customer customer;
    private Payment payment;

    public Order(int orderId, Product product, Customer customer, Payment payment) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.payment = payment;
    }

    public void placeOrder(Discountable discountStrategy) {
        System.out.println("\nPlacing Order ID: " + orderId);
        customer.displayCustomer();
        product.displayDetails();

        double discountedPrice = discountStrategy.applyDiscount(product.getPrice());
        System.out.println("Discounted Price: ₹" + discountedPrice);

        payment = recreatePaymentWithDiscount(discountedPrice);
        payment.processPayment();

        System.out.println("Order placed successfully!\n");
    }

    private Payment recreatePaymentWithDiscount(double amount) {
        if (payment instanceof UPIPayment upi) {
            return new UPIPayment(amount, upi.getUpiId());
        } else if (payment instanceof CreditCardPayment cc) {
            return new CreditCardPayment(amount, cc.getCardNumber());
        } else {
            return new CODPayment(amount);
        }
    }
}
