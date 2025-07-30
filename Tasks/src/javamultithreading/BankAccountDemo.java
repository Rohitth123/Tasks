package javamultithreading;



class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Synchronized withdrawal method to ensure thread safety
    public synchronized void withdraw(int amount, String user) {
        if (amount <= balance) {
            System.out.println(user + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(user + " attempted to withdraw " + amount + " but insufficient balance. Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawalThread extends Thread {
    private BankAccount account;
    private int amount;
    private String user;

    public WithdrawalThread(BankAccount account, int amount, String user) {
        this.account = account;
        this.amount = amount;
        this.user = user;
    }

    public void run() {
        account.withdraw(amount, user);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance

        // Two users attempting to withdraw from the same account
        WithdrawalThread user1 = new WithdrawalThread(account, 700, "User1");
        WithdrawalThread user2 = new WithdrawalThread(account, 500, "User2");

        user1.start();
        user2.start();

        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}

