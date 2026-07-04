class Player {
    private String name;
    private String house;
    private String role;
    private int goals;
    private Team team;
    private static int playersCount = 0;

    public Player(String name, String house, String role, int goals) {
        setName(name);
        setHouse(house);
        setRole(role);
        setGoals(goals);
        playersCount++;
    }

    public Player(String name, String house) {
        this(name, house, "Chaser", 0);
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }

    public void setHouse(String house) {
        if (house.equals("Gryffindor") || house.equals("Slytherin")
                || house.equals("Ravenclaw") || house.equals("Hufflepuff"))
            this.house = house;
    }

    public void setRole(String role) {
        if (role.equals("Seeker") || role.equals("Keeper")
                || role.equals("Chaser"))
            this.role = role;
    }

    public void setGoals(int goals) {
        if (goals >= 0)
            this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public String getRole() {
        return role;
    }

    public int getGoals() {
        return goals;
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void scoreGoal() {
        goals++;
        if (team != null)
            team.addScore(10);
    }

    public void showInfo() {
        System.out.println("Player: " + name + " " + house + " " + role + " Goals:" + goals);
    }
}