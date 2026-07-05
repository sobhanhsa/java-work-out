abstract class PaymentGateway {
    protected double amount;

    public PaymentGateway(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFee();
}