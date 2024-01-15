package activity;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: $" + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Initial balance of $1000

        atm.withdraw(550); // This should trigger Max Withdrawal Exception

        atm.withdraw(900); // This should trigger Insufficient Funds Exception
    }
}