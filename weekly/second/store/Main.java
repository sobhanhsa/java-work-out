public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 400, 5);
        Product p2 = new Product("Monitor", 200, 10);

        Store.addProduct(p1);
        Store.addProduct(p2);

        Customer customer = new Customer("Ali", 2000);

        Cart cart1 = new Cart(p1, 2);
        customer.buy(cart1);

        Cart cart2 = new Cart(p1, 10);
        customer.buy(cart2);

        System.out.println();

        System.out.println("Customer Balance: " + customer.getBalance());
        System.out.println("Remaining Stock for " + p1.getName() + ": " + p1.getStock());
        System.out.println("Remaining Stock for " + p2.getName() + ": " + p2.getStock());

        Store.showTotalSales();
    }
}