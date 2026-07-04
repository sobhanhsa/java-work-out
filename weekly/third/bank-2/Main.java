public class Main {
    public static void main(String[] args) {

        // Test 1
        BankAccount acc = new BankAccount(500);

        acc.deposit(100);
        acc.withdraw(200);

        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
        System.out.println(BankAccount.getTotalAccounts());

        // Test 2
        Customer customer = new Customer("Ali", "1234567890", "09120000000");

        BankAccount acc1 = new BankAccount(400);
        BankAccount acc2 = new BankAccount(700);

        customer.addAccount(acc1);
        customer.addAccount(acc2);

        System.out.println(customer.getTotalBalance());
        System.out.println(customer.findAccount(acc1.getAccountNumber()).getBalance());
        System.out.println(customer.removeAccount(acc1.getAccountNumber()));
        System.out.println(customer.getTotalBalance());

        // Test 3
        Customer customer2 = new Customer("Sara", "9876543210", "09350000000");

        BankAccount acc3 = new BankAccount(500);

        acc3.deposit(-50);
        acc3.withdraw(1000);

        customer2.addAccount(null);
        customer2.addAccount(acc3);
        customer2.addAccount(acc3);

        System.out.println(acc3.getBalance());
        System.out.println(customer2.findAccount("9999") == null);
        System.out.println(customer2.removeAccount("9999"));
        System.out.println(customer2.getTotalBalance());
    }
}