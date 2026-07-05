public abstract class Mob {
    String name;
    int health;

    public Mob(String name, int health) {
        this.name = name;
        this.health = health;
    }

    abstract void move(); 
}