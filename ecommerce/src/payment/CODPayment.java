package payment;

public class CODPayment extends Payment {
    public CODPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Cash on Delivery selected. Amount due: ₹" + amount);
    }
}
