public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("1001", 500);

        acc.deposit(100);
        acc.deposit("+!#");
        acc.deposit(0);

        acc.withdraw(50);
        acc.withdraw(1000);

        System.out.println(acc.getBalance());

        Customer customer = new Customer("John Doe", "123456789", "555-1234");
        customer.addAccount(acc);
    }
}