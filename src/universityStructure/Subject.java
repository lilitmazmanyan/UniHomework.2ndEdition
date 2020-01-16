package universityStructure;

public class Subject {
    public String name;

    public int getScore() {
        return score;
    }

    private int score;

    public Subject(String name) {
        this.name = name;
    }

    public void setScore() {
        throw new RuntimeException(this.name.toUpperCase() + "Doesn't have a score");
    }

    public Subject() {
    }

    public void setScore(int score) {
        if (score < 0 || score > 10) throw new RuntimeException("Inputted score is out of range");
        this.score = score;
    }
}

