package javaencapsulation;

public class BankAccount {
    
    private String accountNumber;
    private double balance;

   
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1234567890", 1000.00);

        acc1.deposit(500.00);
        acc1.withdraw(300.00);
        System.out.println("Current Balance: ₹" + acc1.getBalance());
    }
}

