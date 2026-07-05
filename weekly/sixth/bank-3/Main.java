import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        {
            System.out.println("-------------Transactions TESTS-------------");

            BankAccount account = new SavingsAccount(500);

            System.out.println(account.deposit(100));
            System.out.println(account.withdraw(200));
            System.out.println(account.withdraw(1000));

            System.out.println(account.getBalance());
            System.out.println(account.getTransactionHistory().size());
        }

        {
            System.out.println("-------------POLY & monthly processes-------------");
            ArrayList<BankAccount> accounts = new ArrayList<>();

            accounts.add(
                new SavingsAccount(
                    1000,
                    new FixedInterestPolicy(0.10)
                )
            );

            accounts.add(
                new CheckingAccount(500, 200, 50)
            );

            for (BankAccount account : accounts) {
                account.processMonth();
                System.out.println(account.getBalance());
            }
        }
        {
            System.out.println("------------------- Transfer TEST-----------------");

            Customer customer = new Customer(
                "Ali",
                "1234567890",
                "09120000000"
            );

            BankAccount source = new SavingsAccount(1000);
            BankAccount destination = new CheckingAccount(100, 200, 10);

            customer.addAccount(source);
            customer.addAccount(destination);

            System.out.println(
                customer.transfer(
                    source.getAccountNumber(),
                    destination.getAccountNumber(),
                    300
                )
            );

            System.out.println(source.getBalance());
            System.out.println(destination.getBalance());

            System.out.println(
                source.getTransactionHistory().get(0).getType()
            );

            System.out.println(
                destination.getTransactionHistory().get(0).getType()
            );
        }
    
        {
            System.out.println("--------------------History link---------------------------");


            BankAccount account = new SavingsAccount(500);

            account.deposit(100);

            ArrayList<Transaction> history =
                    account.getTransactionHistory();

            history.clear();

            System.out.println(history.size());
            System.out.println(
                account.getTransactionHistory().size()
            );
        }
    
        {
            System.out.println("------------------------tiered intrest--------------------------");


            InterestPolicy policy = new TieredInterestPolicy(
                1000,
                0.02,
                0.05
            );

            BankAccount account = new SavingsAccount(2000, policy);

            account.processMonth();

            System.out.println(account.getBalance());
            System.out.println(
                account.getTransactionHistory().get(0).getType()
            );

        }
    
    
    
    
    }
}