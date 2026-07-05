public class FixedInterestPolicy implements InterestPolicy {

    private double rate;

    public FixedInterestPolicy(double rate) {
        this.rate = Math.max(0, rate);
    }

    @Override
    public double calculateInterest(double balance) {
        if (balance <= 0) return 0;
        return balance * rate;
    }
}