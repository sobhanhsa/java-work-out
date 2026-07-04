import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String nationalId;
    private String phone;
    private List<BankAccount> accounts;

    public Customer(String name, String nationalId, String phone) {
        this.name = name;
        this.nationalId = nationalId;
        this.phone = phone;
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<BankAccount>(accounts);
    }

    public String getName() {
        return name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getPhone() {
        return phone;
    }
}