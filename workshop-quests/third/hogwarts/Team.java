import java.util.ArrayList;

public class Team {
    private String teamName;
    private int score;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        score = 0;
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        player.setTeam(this);
    }

    public void addScore(int amount) {
        score += amount;
    }

    public int getScore() {
        return score;
    }

    public String getTeamName() {
        return teamName;
    }

    public void showTeamInfo() {
        System.out.println("Team: " + teamName + " Score:" + score);
    }
}
