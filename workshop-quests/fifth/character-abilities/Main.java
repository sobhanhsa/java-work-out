public class Main {
    public static void main(String[] args) {

        MinecraftCharacter[] chars = new MinecraftCharacter[3];

        chars[0] = new Steve("Steve", 100);
        chars[1] = new Alex("Alex", 100);
        chars[2] = new Enderman("Enderman", 200);

        for (MinecraftCharacter c : chars) {
            c.useAbility();
        }

        chars[0].showGameRule();

        WorldSettings ws = new WorldSettings();
        ws.showSettings();
    }
}