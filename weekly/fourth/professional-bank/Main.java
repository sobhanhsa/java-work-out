public class Main {
    public static void main(String[] args) {

        StudentAccount student = new StudentAccount("Ali", 1000);
        PremiumStudentAccount premium = new PremiumStudentAccount("Reza", 1200, 19);
        FamilyAccount family = new FamilyAccount("Sara", 800);
        BusinessAccount business = new BusinessAccount("Hossein", 500);

        Account[] accounts = {student, premium, family, business};

        System.out.println("=== INITIAL STATE ===\n");
        for (Account a : accounts) {
            System.out.println(a.toString());
        }

        student.deposit(200);
        student.withdraw(200);
        student.tax();
        student.receiveScholarship(300);

        premium.deposit(100);
        premium.withdraw(500);
        premium.tax();

        family.deposit(600);
        family.familyBonus(600);
        family.withdraw(200);
        family.tax();

        business.deposit(300);
        business.withdraw(600);
        business.tax();
        business.takeLoan(1000);
        business.withdraw(1320);

        System.out.println("=== FINAL STATE ===\n");
        for (Account a : accounts) {
            System.out.println(a.toString());
        }
    }
}