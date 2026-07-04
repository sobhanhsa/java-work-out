public class Main {

    public static void main(String[] args) {

        Coach coach1 = new Coach("Keyrosh", 5000);
        // too bad we don't have HAS_BENTEN_WATCH field :(
        Coach coach2 = new Coach("Ghalenoii", 6000);

        Team teamA = new Team("Team A", coach1);
        Team teamB = new Team("Team B", coach2);

        Match match = new Match(teamA, teamB);

        match.setResult(2, 1);
        match.showResult(true);

        System.out.println(teamA.getTeamName() + " Score: " + teamA.getWins());
        System.out.println(teamB.getTeamName() + " Score: " + teamB.getWins());
    }
}