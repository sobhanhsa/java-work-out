class Student {
    public int score;

    public Student(int score) {
        this.score = score;
    }
}

// this class definition is without encapsulation so it causes :
// invalid score assignements 
// cookies is a public variable and can be modified from outside the class ( without any rules!)
class BetterStudent {
    private int score;

    public BetterStudent(int score) {
        if (score < 0 ) {
            this.score = 0; // set to minimum score if negative
        } else if (score > 20) {
            this.score = 20; // set to maximum score if greater than 20
        } else {
            this.score = score; // set to the provided score if valid
        }
    }

    public int getScore() {
        return score;
    }

    public int setScore(int score) {
        if (score < 0 || score > 20) {
            System.out.println("Invalid score assignment: " + score);
            return this.score; // return current score without changing it
        }
        this.score = score;
        return this.score;
    }
}
