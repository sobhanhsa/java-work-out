public class Customer {

    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = Math.max(balance, 0);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean buy(Cart cart) {
        double total = cart.getTotalPrice();

        if (total == -1 || balance < total) {
            System.out.println("Purchase Failed");
            return false;
        }

        balance -= total;
        cart.getProduct().decreaseStock(cart.getQuantity());
        Store.addSale(total);

        System.out.println("Purchase Successful");
        return true;
    }
}