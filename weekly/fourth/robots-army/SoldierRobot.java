public class SoldierRobot extends Robot {

    public SoldierRobot(String name, int basePower) {
        super(name, basePower);
    }

    @Override
    public int calcDamage() {
        return basePower * 2;
    }
}