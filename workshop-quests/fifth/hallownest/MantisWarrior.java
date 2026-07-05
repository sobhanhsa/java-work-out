public class MantisWarrior extends Enemy {

    public MantisWarrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println("Mantis Warrior attacks with a blade");
    }
}