class QuidditchGame {
    private Team team1;
    private Team team2;

    public void setTeams(Team t1, Team t2) {
        team1 = t1;
        team2 = t2;
    }

    public void goal(Player player) {
        player.scoreGoal();
    }

    public void snitchCaught(Player player) {
        if (player.getRole().equals("Seeker")) {
            player.getTeam().addScore(150);
        }
    }

    public void showWinner() {
        if (team1.getScore() > team2.getScore()) {
            System.out.println("Winner: " + team1.getTeamName());
        } else if (team2.getScore() > team1.getScore()) {
            System.out.println("Winner: " + team2.getTeamName());
        } else {
            System.out.println("Draw!");
        }
    }
}