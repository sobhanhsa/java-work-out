public class Match {

    private Team team1;
    private Team team2;
    private int score1;
    private int score2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setResult(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;

        if (score1 > score2) {
            team1.addWin();
        } else if (score2 > score1) {
            team2.addWin();
        }
    }

    public void showResult() {
        System.out.println( score1 + " : " + score2 );
    }

    public void showResult(boolean detailed) {
        if (!detailed) {
            showResult();
            return;
        }

        if (score1 > score2) {
            System.out.println("Winner: " + team1.getTeamName());
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2.getTeamName());
        } else {
            System.out.println("Draw");
        }
    }
}