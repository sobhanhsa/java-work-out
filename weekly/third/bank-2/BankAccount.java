public class BankAccount {
    private String accountNumber;
    private double balance;

    private static int nextAccountNumber = 1000;
    private static int totalAccounts = 0;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0)
            this.balance = 0;
        else
            this.balance = initialBalance;

        this.accountNumber = generateAccountNumber();
        totalAccounts++;
    }

    private String generateAccountNumber() {
        return String.valueOf(nextAccountNumber++);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}