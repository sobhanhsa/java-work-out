public class Main {
    public static void main(String[] args) {

        Enemy[] enemies = new Enemy[3];

        enemies[0] = new Crawlid("C1", 50);
        enemies[1] = new Vengefly("V1", 40);
        enemies[2] = new MantisWarrior("M1", 80);

        for (Enemy e : enemies) {
            e.attack();

            if (e instanceof Vengefly) {
                Vengefly v = (Vengefly) e; // downcasting
                v.fly();
            }
        }
    }
}

// بخدا فهمیدیم داون کستینگ چیه 