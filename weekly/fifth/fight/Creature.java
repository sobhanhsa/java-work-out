public abstract class Creature {
    int attackPower;
    int defensePower;

    public Creature(int attackPower, int defensePower) {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public abstract int calculateFinalAttack();
    public abstract int calculateFinalDefense();

    public final boolean fight(Creature opponent) {
        int myAttack = this.calculateFinalAttack();
        int myDefense = this.calculateFinalDefense();

        int oppAttack = opponent.calculateFinalAttack();
        int oppDefense = opponent.calculateFinalDefense();

        boolean meWin = myAttack > oppDefense;
        boolean oppWin = oppAttack > myDefense;

        if (meWin && !oppWin) return true;
        if (!meWin && oppWin) return false;

        return true;
    }
}