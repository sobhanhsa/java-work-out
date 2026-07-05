public class PremiumStudentAccount extends StudentAccount {

    private double averageGrade;

    public PremiumStudentAccount(String name, double balance, double averageGrade) {
        super(name, balance);
        this.averageGrade = averageGrade;
    }

    @Override
    public void tax() {
        if (averageGrade >= 18) {
            addTransaction("Tax", 0);
            return;
        }
        super.tax();
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public String getAccountType() {
        return "PremiumStudentAccount";
    }
}