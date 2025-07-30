package payment;

public class CreditCardPayment extends Payment {
    String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void processPayment() {
        System.out.println("Processing Credit Card payment of ₹" + amount + " using card: " + cardNumber);
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
