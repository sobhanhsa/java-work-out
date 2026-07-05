public class Dragon extends Creature {

    public Dragon(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }

    @Override
    public int calculateFinalAttack() {
        return attackPower * 2;
    }

    @Override
    public int calculateFinalDefense() {
        return defensePower * 2;
    }
}