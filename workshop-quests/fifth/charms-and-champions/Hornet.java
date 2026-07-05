public class Hornet extends HallownestCharacter {

    public Hornet(String name, int health) {
        super(name, health);
    }

    @Override
    void useSkill() {
        System.out.println("Hornet uses her needle");
    }
}