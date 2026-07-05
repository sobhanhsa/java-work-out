public class Creeper extends Mob {

    public Creeper(String name, int health) {
        super(name, health);
    }

    @Override
    void move() {
        System.out.println("Creeper moves silently");
    }

    void explode() {
        System.out.println("Creeper explodes!");
    }
}