public final class CommanderRobot extends Robot {

    public CommanderRobot(String name, int basePower) {
        super(name, basePower);
    }

    @Override
    public int calcDamage() {
        return basePower * 3;
    }

    public void issueCommand() {
        System.out.println("Commander " + name + " issued a command!");
    }
}