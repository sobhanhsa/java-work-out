public class Store {

    private static int totalProducts = 0;
    private static double totalSales = 0;

    public static void addProduct(Product product) {
        if (product != null) {
            totalProducts++;
        }
    }

    public static void addSale(double amount) {
        totalSales += amount;
    }

    public static void showTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void showTotalSales() {
        System.out.println("Total Sales: " + totalSales);
    }
}