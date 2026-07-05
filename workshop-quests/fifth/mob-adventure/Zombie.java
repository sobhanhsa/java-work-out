public class Zombie extends Mob {

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    void move() {
        System.out.println("Zombie walks slowly");
    }
}