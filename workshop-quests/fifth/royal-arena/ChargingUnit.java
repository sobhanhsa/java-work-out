public class ChargingUnit extends ArenaUnit {

    public ChargingUnit(String unitName, int health) {
        super(unitName, health);
    }

    @Override
    void move() {
        System.out.println(unitName + " charges toward the enemy");
    }

    void chargeAttack() {
        System.out.println(unitName + " performs a powerful charge attack!");
    }
}