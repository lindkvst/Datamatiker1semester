package Lesson06.Homework;

import static Lesson06.Homework.DiceMan.rollDice; //importerer rollDice metode
import static Lesson06.Homework.DiceMan.choices; //importerer choices String -aktiviteter ud fra terningeslag
import java.util.Scanner;

public class DiceManTest {
    public static void main(String[] args) {

        DiceManChoice(); //

    }

//opretter Diceman-objekt vhja konstruktør
public static void DiceManChoice() {

    DiceMan d1 = new DiceMan("Mr. DiceyDice", 5, false, 2);
    WriteChoice(d1);
    DiceMan d2 = new DiceMan("Mrs. DiceyD", 20, false, 3);
    WriteChoice(d2);
}


    //opretter trin i spil
    public static void WriteChoice(DiceMan d) {
        //nulstiller variable til hver runde af spillet
        int gameCount = 0; //nulstiller antal runder i spillet
        int bedCount = 0; // antal gange DiceMan er sendt i seng

        //getter attributes fra DiceMan objekt
        String name = d.getName(); //får navn fra DiceMan objekt
        int numOfActivities = d.getNumOfActivities(); //får antal aktiviteter per dag
        boolean forceBed = d.getForceBed(); // hvorvidt DiceMan tvinges is seng
        int bedMax = d.getBedMax(); // maks 3 gange i seng

        Scanner sc = new Scanner(System.in); // opretter scanner input

        while (gameCount < numOfActivities && forceBed == false) {

            System.out.print("\nRoll dice? (y/n): ");
            String answer = sc.nextLine(); //scanner input y/n/"fejl"
                if (answer.equals("y")) {

                    int diceValue = rollDice(); //slår med terningen

                    if (diceValue == 6) { //inkremerer når DiceMan sendes i seng
                        bedCount++;
                    }
                    //linje til test af forceBed if statement
                    System.out.println("| bedCount = " + bedCount + " |");

                    System.out.print(name + " " + choices[diceValue]); // navn og valg ud fra terningeslag

                    if (bedMax == bedCount) {//Spillet sluttes hvis DiceMan sendes i seng BedMax gange
                        d.setForceBed(true);
                        System.out.println(". " + bedMax + " times a Strike. " + name + " goes back to bed!");
                        System.out.println("********************************************");
                        break;
                    }

                    gameCount++; //inkremere runder

                    activityPrint(d, gameCount, numOfActivities);


                } else if (answer.equals("n")) {
                System.out.println("We hate to see you go!");

                } else {
                    System.out.println("Didn't get that. Try again");
                    //break;
                }

                }

/*
            int diceValue = rollDice();

            System.out.println("GameCount is " + gameCount
                    + "\n Num of Tries is " + d.getNumOfActivities()
                    + "\n Rnd number is " + diceValue
                    + "\n" + d.getName() + " " + choices[diceValue]
                        );
            gameCount++;
  /*          switch (rndNum()) {
                case 1:
                    System.out.println



            }

   */
        }


    public static void activityPrint(DiceMan d, int g, int i) {
        String name = d.getName();
        int gameCount = g;
        int numOfActivities = i;

        int activitiesLeft = numOfActivities - gameCount;

        if (gameCount < (numOfActivities -1 )) {
            System.out.println(". " + name + " has " + activitiesLeft
            + " activities left to do");
        } else if (gameCount == (numOfActivities - 1)) {

            System.out.println(". " + name + " has only " + activitiesLeft
                    + " activity left to do");
        } else if (gameCount == numOfActivities) {
            System.out.println(". " + name + " is done for today. See you tomorrow!");
            System.out.println("********************************************");

        }

    }
    }



