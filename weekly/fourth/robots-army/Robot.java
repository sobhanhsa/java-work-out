public abstract class Robot {
    protected String name;
    protected int basePower;

    public Robot(String name, int basePower) {
        this.name = name;
        this.basePower = basePower;
    }

    public abstract int calcDamage();

    public final String getName() {
        return name;
    }
}