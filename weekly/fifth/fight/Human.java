public class Human extends Creature {

    public Human(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }

    @Override
    public int calculateFinalAttack() {
        return attackPower;
    }

    @Override
    public int calculateFinalDefense() {
        return defensePower;
    }
}