public class ZarinPalGateway extends PaymentGateway {
    public ZarinPalGateway(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return this.amount * 0.01;
    }
}
