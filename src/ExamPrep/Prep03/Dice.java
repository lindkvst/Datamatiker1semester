package ExamPrep.Prep03;

import java.util.Random;

public class Dice {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public Dice() {
        //do nothing
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void throwDice() {
        Random random = new Random();
        value = random.nextInt(6)+1;
    }

    @Override
    public String toString() {
        return "The dice value is " + value;
    }

}
