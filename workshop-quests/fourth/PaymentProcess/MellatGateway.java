public class MellatGateway extends PaymentGateway {
    public MellatGateway(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 500;
    }
}
