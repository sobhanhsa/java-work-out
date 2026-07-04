public class Player {

    private String name;
    private int number;
    private int goals;

    public Player(String name, int number, int goals) {
        setName(name);;
        setNumber(number);
        setGoals(goals);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getGoals() {
        return goals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public void setGoals(int goals) {
        if (goals >= 0) {
            this.goals = goals;
        }
    }
}