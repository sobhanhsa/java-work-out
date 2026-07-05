public class Quirrel extends HallownestCharacter {

    public Quirrel(String name, int health) {
        super(name, health);
    }

    @Override
    void useSkill() {
        System.out.println("Quirrel strikes with his sword");
    }
}