package payment;

public class UPIPayment extends Payment {
    String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    public void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount + " using UPI ID: " + upiId);
    }

    public String getUpiId() {
        return upiId;
    }
}
