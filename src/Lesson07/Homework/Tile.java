package Lesson07.Homework;

public class Tile {
    //Class til nye tiles
    private char letter;
    private int value;

    //laver konstruktør med alle attributter
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    //Default Konstruktør uden attributter
    public Tile() {
        this.letter = '0';
        this.value = 0;
    }


    public char getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //toString metode
    @Override
    public String toString() {
        return String.format("Letter: %c\nValue: %d", this.letter, this.value);
    }


    //equals metode
    //@Override
    // har slettet @Override, da det gav fejl - does not override or implement a method
    //from a supertype
    public boolean equals(Tile that) {
        boolean resultTitle;
        boolean resultValue;
        boolean result;

        resultTitle = false;
        resultValue = false;
        result = false;

        if (this.letter == that.getLetter()){
            resultTitle = true;
        }

        if (this.value == that.getValue()) {
            resultValue = true;
        }

        if (resultTitle && resultValue == true) {
            result = true;
        }

        return result;
    }

}


