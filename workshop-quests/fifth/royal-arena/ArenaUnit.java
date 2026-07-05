public class ArenaUnit {
    String unitName;
    int health;

    public ArenaUnit(String unitName, int health) {
        this.unitName = unitName;
        this.health = health;
    }

    void move() {
        System.out.println("Unit moves");
    }
}