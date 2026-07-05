public class FamilyAccount extends Account {

    public FamilyAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void tax() {
        double t = balance * 0.04;
        balance -= t;
        addTransaction("Tax", t);
    }

    @Override
    public String getAccountType() {
        return "FamilyAccount";
    }

    public void familyBonus(double amount) {
        double finalAmount = amount;

        if (amount > 500) {
            finalAmount = amount + amount * 0.04;
        }

        balance += finalAmount;
        addTransaction("FamilyBonus", finalAmount);
    }
}
