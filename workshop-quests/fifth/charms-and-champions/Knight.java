public class Knight extends HallownestCharacter {

    public Knight(String name, int health) {
        super(name, health);
    }

    @Override
    void useSkill() {
        System.out.println("Knight attacks with the nail");
    }
}