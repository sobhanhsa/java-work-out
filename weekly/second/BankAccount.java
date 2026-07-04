public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (isValidAmount(balance))
            this.balance = balance;
        else
            this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private boolean isValidAmount(Object amount) {
        if (amount == null) return false;

        if (amount instanceof Number) {
            double val = ((Number) amount).doubleValue();
            return val >= 0;
        }

        System.out.println("Invalid amount: " + amount);
        return false;
    }

    public void deposit(Object amount) {
        if (!isValidAmount(amount)) return;

        double val = ((Number) amount).doubleValue();
        balance += val;
    }

    public void withdraw(Object amount) {
        if (!isValidAmount(amount)) return;

        double val = ((Number) amount).doubleValue();

        if (val <= balance) {
            balance -= val;
        }
    }
}