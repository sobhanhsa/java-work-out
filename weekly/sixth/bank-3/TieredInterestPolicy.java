public class TieredInterestPolicy implements InterestPolicy {

    private double threshold;
    private double normalRate;
    private double premiumRate;

    public TieredInterestPolicy(double threshold, double normalRate, double premiumRate) {
        this.threshold = Math.max(0, threshold);
        this.normalRate = Math.max(0, normalRate);
        this.premiumRate = Math.max(0, premiumRate);
    }

    @Override
    public double calculateInterest(double balance) {
        if (balance <= 0) return 0;

        double rate = (balance < threshold) ? normalRate : premiumRate;
        return balance * rate;
    }
}