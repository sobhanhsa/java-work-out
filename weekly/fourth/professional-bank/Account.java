import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Account {

    protected String name;
    protected int accountNumber;
    protected double balance;
    protected LocalDate dateCreated;
    protected ArrayList<String> transactions;

    private static int nextAccountNumber = 1000;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = ++nextAccountNumber;
        this.dateCreated = LocalDate.now();
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) return;

        balance += amount;
        addTransaction("Deposit", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) return;

        balance -= amount;
        addTransaction("Withdraw", amount);
    }

    protected void addTransaction(String op, double amount) {
        transactions.add(op + " | " + amount + " | " + LocalDate.now());
    }

    public abstract void tax();

    public abstract String getAccountType();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Type: ").append(getAccountType()).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Account Number: ").append(accountNumber).append("\n");
        sb.append("Balance: ").append(balance).append("\n");
        sb.append("Date Created: ").append(dateCreated).append("\n\n");

        sb.append("Last Transactions:\n");

        if (transactions.isEmpty()) {
            sb.append("No transactions\n");
        } else {
            int start = Math.max(0, transactions.size() - 5);
            for (int i = start; i < transactions.size(); i++) {
                sb.append(transactions.get(i)).append("\n");
            }
        }

        return sb.toString();
    }
}
