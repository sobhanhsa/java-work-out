public class Crawlid extends Enemy {

    public Crawlid(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println("Crawlid attacks from the ground");
    }
}