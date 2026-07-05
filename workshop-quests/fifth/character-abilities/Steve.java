public class Steve extends MinecraftCharacter {

    public Steve(String name, int health) {
        super(name, health);
    }

    @Override
    void useAbility() {
        System.out.println("Steve is mining blocks");
    }
}