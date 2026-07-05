public class Villager extends Mob {

    public Villager(String name, int health) {
        super(name, health);
    }

    @Override
    void move() {
        System.out.println("Villager walks around the village");
    }
}
