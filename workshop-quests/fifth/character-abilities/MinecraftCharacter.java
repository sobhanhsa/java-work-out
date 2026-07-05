public abstract class MinecraftCharacter {
    String name;
    int health;

    public MinecraftCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    abstract void useAbility();

    final void showGameRule() {
        System.out.println("Game rules cannot be changed.");
    }
}

// Explain why a final class cannot be inherited.
// cuz its final
// A final class cannot be inherited because it is explicitly marked as "final" in its declaration. 
// This means that the class is intended to be complete and cannot be extended or subclassed.
//  The purpose of making a class final is to