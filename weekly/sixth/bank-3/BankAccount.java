import java.util.ArrayList;

public abstract class BankAccount {

    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    private static int nextAccountNumber = 1000;
    private static int totalAccounts = 0;

    protected BankAccount(double initialBalance) {
        this.accountNumber = String.valueOf(nextAccountNumber++);
        totalAccounts++;

        this.balance = Math.max(0, initialBalance);
        this.transactions = new ArrayList<Transaction>();
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;

        applyCredit(amount, TransactionType.DEPOSIT, null);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;

        if (!canWithdraw(amount)) return false;

        applyDebit(amount, TransactionType.WITHDRAW, null);
        return true;
    }

    public boolean transferTo(BankAccount destination, double amount) {
        if (destination == null) return false;
        if (destination == this) return false;
        if (amount <= 0) return false;

        if (!canWithdraw(amount)) return false;

        applyDebit(amount, TransactionType.TRANSFER_OUT, destination.accountNumber);
        destination.applyCredit(amount, TransactionType.TRANSFER_IN, this.accountNumber);

        return true;
    }

    protected final void applyCredit(double amount, TransactionType type, String related) {
        balance += amount;
        transactions.add(new Transaction(type, amount, related));
    }

    protected final void applyDebit(double amount, TransactionType type, String related) {
        balance -= amount;
        transactions.add(new Transaction(type, amount, related));
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        // return shallow list !
        return new ArrayList<>(transactions);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    protected abstract boolean canWithdraw(double amount);

    public abstract void processMonth();
}