public class BusinessAccount extends Account {

    public BusinessAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void tax() {
        double t = balance * 0.08;
        balance -= t;
        addTransaction("Tax", t);
    }

    @Override
    public String getAccountType() {
        return "BusinessAccount";
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance * 1.2) return;

        balance -= amount;

        if (balance < 0) {
            double penalty = amount * 0.02;
            balance -= penalty;
            addTransaction("Penalty", penalty);
        }

        addTransaction("Withdraw", amount);
    }

    public void takeLoan(double amount) {
        balance += amount;
        addTransaction("Loan", amount);
    }
}
