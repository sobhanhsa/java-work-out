public class Vengefly extends Enemy {

    public Vengefly(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println("Vengefly attacks from the air");
    }

    void fly() {
        System.out.println("Vengefly is flying!");
    }
}