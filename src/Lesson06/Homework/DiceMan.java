package Lesson06.Homework;

public class DiceMan {
    private String name;
    private int numOfActivities;
    private boolean forceBed;
    private int bedMax;

    // Constructor
    public DiceMan(String name, int numOfActivities, boolean forceBed, int bedMax) {
        this.name = name;
        this.numOfActivities = numOfActivities;
        this.forceBed = forceBed;
        this.bedMax = bedMax;
    }

    // Random number generator
    public static int rollDice() {
 //       Random rand = new Random();
        int dice = (int)(Math.random()*6) +1; // genererer rnd nummer mellem 1 og 6
        return dice;
    }

    // laver getter for DiceMan name
    public String getName() {
        return this.name;
    }

    // laver getter for DiceMan numOfAct
    public int getNumOfActivities() {
        return this.numOfActivities;
    }

    //laver getter for DiceMan forceBed
    public boolean getForceBed() {
        return this.forceBed;
    }

    //laver getter for DiceMan bedMax
    public int getBedMax() {
        return this.bedMax;
    }

    // laver setter for DiceMan forceBed
    public void setForceBed(boolean forceBed) {
        this.forceBed = forceBed;
    }

    // laver array
    public static String[] choices = {
            "Nothing",
            "eats Breakfast 🥐😛",
            "Studies Something Boring 📚😢" ,
            "Goes Swimming 🏊‍😅️",
            "Goes Fishing 🎣😎",
            "Calls Mom 📞🤠",
            "Goes Back to Bed 😴💤"
    };



}



