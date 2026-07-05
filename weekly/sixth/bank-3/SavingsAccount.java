public class SavingsAccount extends BankAccount {

    private InterestPolicy interestPolicy;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
        this.interestPolicy = new FixedInterestPolicy(0.01);
    }

    public SavingsAccount(double initialBalance, InterestPolicy interestPolicy) {
        super(initialBalance);
        this.interestPolicy = (interestPolicy == null)
                ? new FixedInterestPolicy(0)
                : interestPolicy;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount <= getBalance();
    }

    @Override
    public void processMonth() {
        double interest = interestPolicy.calculateInterest(getBalance());
        if (interest > 0) {
            applyCredit(interest, TransactionType.INTEREST, null);
        }
    }
}