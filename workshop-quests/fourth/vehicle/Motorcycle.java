public class Motorcycle extends Vehicle {
    private boolean helmetIncluded;

    public Motorcycle(String brand, int speed, boolean helmetIncluded) {
        super(brand, speed);
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving fast.");
    }
}