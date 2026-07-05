public abstract class HallownestCharacter {
    String name;
    int health;

    public HallownestCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    abstract void useSkill();

    final void showWorldRule() {
        System.out.println("The rules of Hallownest cannot be changed.");
    }
}