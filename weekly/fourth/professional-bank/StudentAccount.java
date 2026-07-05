public class StudentAccount extends PersonalAccount {

    public StudentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void tax() {
        double t = balance * 0.05;
        balance -= t;
        addTransaction("Tax", t);
    }

    @Override
    public String getAccountType() {
        return "StudentAccount";
    }

    public void receiveScholarship(double amount) {
        balance += amount;
        addTransaction("Scholarship", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance * 0.3) return;
        super.withdraw(amount);
    }
}
