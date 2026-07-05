import java.util.ArrayList;

public class Customer {

    private String name;
    private String nationalId;
    private String phone;
    private ArrayList<BankAccount> accounts;

    public Customer(String name, String nationalId, String phone) {
        this.name = name;
        this.nationalId = nationalId;
        this.phone = phone;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    private BankAccount findAccount(String accNum) {
        for (BankAccount a : accounts) {
            if (a.getAccountNumber().equals(accNum)) {
                return a;
            }
        }
        return null;
    }

    public boolean transfer(String source, String dest, double amount) {
        BankAccount s = findAccount(source);
        BankAccount d = findAccount(dest);

        if (s == null || d == null) return false;

        return s.transferTo(d, amount);
    }

    public void processMonthlyOperations() {
        for (BankAccount a : accounts) {
            a.processMonth();
        }
    }
}