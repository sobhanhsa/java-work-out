public class Enderman extends MinecraftCharacter {

    public Enderman(String name, int health) {
        super(name, health);
    }

    @Override
    void useAbility() {
        System.out.println("Enderman is teleporting");
    }
}