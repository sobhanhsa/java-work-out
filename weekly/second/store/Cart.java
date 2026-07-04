public class Cart {

    private Product product;
    private int quantity;

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        if (quantity <= 0) {
            return -1;
        }

        if (product.getStock() < quantity) {
            return -1;
        }

        return product.getPrice() * quantity;
    }
}