public class GroundUnit extends ArenaUnit {

    public GroundUnit(String unitName, int health) {
        super(unitName, health);
    }

    @Override
    void move() {
        System.out.println(unitName + " walks toward the enemy tower");
    }
}