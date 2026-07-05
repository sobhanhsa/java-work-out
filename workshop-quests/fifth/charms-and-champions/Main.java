public class Main {
    public static void main(String[] args) {

        HallownestCharacter[] chars = new HallownestCharacter[3];

        chars[0] = new Knight("Knight", 100);
        chars[1] = new Hornet("Hornet", 90);
        chars[2] = new Quirrel("Quirrel", 95);

        for (HallownestCharacter c : chars) {
            c.useSkill();
        }

        chars[0].showWorldRule();

        CharmRules cr = new CharmRules();
        cr.showCharmRule();
    }
}