public class Elf extends Creature {

    public Elf(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }

    @Override
    public int calculateFinalAttack() {
        return attackPower + 10;
    }

    @Override
    public int calculateFinalDefense() {
        return defensePower + 5;
    }
}