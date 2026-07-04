import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Team t1 = new Team(sc.next());
        Team t2 = new Team(sc.next());

        QuidditchGame game = new QuidditchGame();
        game.setTeams(t1, t2);

        ArrayList<Player> players = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String house = sc.next();
            String role = sc.next();
            int goals = sc.nextInt();
            int teamNumber = sc.nextInt();

            Player p = new Player(name, house, role, goals);
            players.add(p);

            if (teamNumber == 1)
                t1.addPlayer(p);
            else
                t2.addPlayer(p);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String event = sc.next();
            String playerName = sc.next();

            Player current = null;
            for (Player p : players) {
                if (p.getName().equals(playerName)) {
                    current = p;
                    break;
                }
            }

            if (current != null) {
                if (event.equals("GOAL"))
                    game.goal(current);
                else if (event.equals("SNITCH"))
                    game.snitchCaught(current);
            }
        }

        sc.close();

        for (Player p : players)
            p.showInfo();

        System.out.println();

        t1.showTeamInfo();
        t2.showTeamInfo();

        System.out.println();

        game.showWinner();

        System.out.println();
        System.out.println("Total Players: " + Player.getPlayersCount());
    }
}