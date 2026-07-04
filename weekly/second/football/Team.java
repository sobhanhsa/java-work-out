public class Team {

    private String teamName;
    private Coach coach;
    private int wins;
    private static int totalTeams = 0;

    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.wins = 0;
        totalTeams++;
    }

    public void addWin() {
        wins++;
    }

    public void showInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Coach: " + coach.getName());
        System.out.println("Wins: " + wins);
    }

    public String getTeamName() {
        return teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getWins() {
        return wins;
    }

    public static int getTotalTeams() {
        return totalTeams;
    }
}