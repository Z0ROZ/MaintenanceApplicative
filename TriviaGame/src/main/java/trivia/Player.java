package trivia;

public class Player {
    private final String name;
    private int purses = 0;
    private int position = 1;
    private boolean inPenaltyBox = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPurses() {
        return purses;
    }

    public int getPosition() {
        return position;
    }

    public boolean isInPenaltyBox() {
        return inPenaltyBox;
    }

    public void addPurses(int purses) {
        this.purses += purses;
    }

    public void move(int roll) {
        position += roll;
        if (position > 12) position -= 12;
    }

    public void sendToPenaltyBox() {
        inPenaltyBox = true;
    }



}
