public class RangedUnit extends ArenaUnit {

    public RangedUnit(String unitName, int health) {
        super(unitName, health);
    }

    @Override
    void move() {
        System.out.println(unitName + " moves and attacks from a distance");
    }
}