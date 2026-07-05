import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Creature[] creatures = new Creature[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int a = sc.nextInt();
            int d = sc.nextInt();

            switch (type) {
                case "H" -> creatures[i] = new Human(a, d);
                case "E" -> creatures[i] = new Elf(a, d);
                case "D" -> creatures[i] = new Dragon(a, d);
                default -> throw new IllegalArgumentException("Unknown creature type: " + type);
            }
        }

        sc.close();
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            Creature c1 = creatures[i];
            Creature c2 = creatures[i + 1];

            boolean c1Wins = c1.fight(c2);

            if (c1Wins) {
                System.out.println("Creature " + i + " wins against Creature " + (i + 1));
            } else {
                System.out.println("Creature " + (i + 1) + " wins against Creature " + i);
            }
        }

        int maxAttack = creatures[0].calculateFinalAttack();
        int idx = 0;

        for (int i = 1; i < n; i++) {
            int val = creatures[i].calculateFinalAttack();
            if (val > maxAttack) {
                maxAttack = val;
                idx = i;
            }
        }

        if (creatures[idx] instanceof Human) {
            System.out.println("Human");
        } else if (creatures[idx] instanceof Elf) {
            System.out.println("Elf");
        } else {
            System.out.println("Dragon");
        }
    }
}