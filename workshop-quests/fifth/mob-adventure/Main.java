public class Main {
    public static void main(String[] args) {

        Mob[] mobs = new Mob[4];

        mobs[0] = new Zombie("Z1", 100);
        mobs[1] = new Creeper("C1", 50);
        mobs[2] = new Villager("V1", 80);
        mobs[3] = new Creeper("C2", 50);

        for (Mob m : mobs) {
            m.move();

            if (m instanceof Creeper) {
                Creeper c = (Creeper) m; // downcasting
                c.explode();
            }
        }
    }
}

// Mob m = new Creeper();
// m.explode();
// Java

// Why does the second line cause a compilation error?
// How can it be fixed?
// because Mob class itself does not have the explode() method, so when you declare m as a Mob type, it cannot access the explode() method.
// it should be down catsted to Creeper


// Write the conceptual answer as a comment at the end of your code.
// Creeper c = (Creeper) m;