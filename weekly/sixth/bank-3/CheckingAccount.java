public class CheckingAccount extends BankAccount {

    private double overdraftLimit;
    private double monthlyFee;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this(initialBalance, overdraftLimit, 0);
    }

    public CheckingAccount(double initialBalance, double overdraftLimit, double monthlyFee) {
        super(initialBalance);
        this.overdraftLimit = Math.max(0, overdraftLimit);
        this.monthlyFee = Math.max(0, monthlyFee);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return ((getBalance() - amount) >= (-overdraftLimit));
    }

    @Override
    public void processMonth() {
        if (monthlyFee <= 0) return;

        if (canWithdraw(monthlyFee)) {
            applyDebit(monthlyFee, TransactionType.FEE, null);
        }
    }
}