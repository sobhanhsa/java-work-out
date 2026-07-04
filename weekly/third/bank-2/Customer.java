import java.util.ArrayList;

class Customer {
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
        if (account == null) return;

        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                return; // duplicate
            }
        }

        accounts.add(account);
    }

    public boolean removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (BankAccount acc : accounts) {
            sum += acc.getBalance();
        }
        return sum;
    }

    public void showAllAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountNumber() + " " + acc.getBalance());
        }
    }
}