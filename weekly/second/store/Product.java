public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String name) {
        this.name = name;
        this.price = 0;
        this.stock = 0;
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = Math.max(price, 0);
        this.stock = Math.max(stock, 0);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void decreaseStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        }
    }
}