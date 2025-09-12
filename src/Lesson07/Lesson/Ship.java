package Lesson07.Lesson;

import java.util.Arrays;

public class Ship {
    private int[] oceanPosition;
    private int[] positionHit;
    private int hitCount;
    private int length;
    boolean isSunk;


    //Konstruktør der opdaterer oceanPosition
    public Ship(int pos1, int pos2, int pos3, int hit1, int hit2, int hit3, int hitCount, int length, boolean isSunk) {
        this.oceanPosition = new int[] {pos1, pos2, pos3};
        this.positionHit = new int[] {hit1, hit2, hit3};
        this.hitCount = hitCount;
        this.length = length;
        this.isSunk = isSunk;
    }
/*
    //Konstruktør til default værdi - positionHit
    public Ship(){
        this.positionHit = new int[] {0,0,0};
    }
*/
    //laver getters
    public int[] getOceanPosition() {
        return oceanPosition;
    }

    public int[] getPositionHit() {
        return positionHit;
    }

    public int hitCount() {
        return hitCount;
    }

    public int getLength() {
        return length;
    }

    public boolean getSunk() {
        return isSunk;
    }

    //laver setters
    // er i tvivl om nedenstående for arrays
    public void setOceanPosition(int pos1, int pos2, int pos3) {
        this.oceanPosition = new int[] {pos1, pos2, pos3};
    }
    // er i tvivl om nedenstående for arrays
    public void setPositionHit(int indexPos, int hit) {
        this.positionHit[indexPos] = hit;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSunk(boolean isSunk) {
        this.isSunk = isSunk;
    }

    public void checkHit(int position) {

  //      while (!hit) {
        int hit = 0; // 0 = miss, 1 = first hit, 2 = you already hit this
            //normalt for loop, da jeg skal bruge loop index værdien i til at slå op
            // i array positionHit[] hvorvidt den allerede er ramt på denne position.
            for (int i = 0; i < this.oceanPosition.length; i++) {
                //tjekker om det nuværende gæt rammer en position, der allerede er ramt
                if (this.positionHit[i] == 1 && this.oceanPosition[i] == position) {
                    hit = 2;
                    break;
                } else if (this.oceanPosition[i] == position) {
                    hit = 1;
                    this.positionHit[i] = 1;
                }

            }

            switch (hit) {
                case 0:
                    System.out.println("It's a miss");
                    break;
                case 1:
                    System.out.println("It's a hit. Congratulations!");
                    break;
                case 2:
                    System.out.println("You've already hit this.");
                    break;

            }
        }

    public void checkSunk() {
            int checkSunk = 0;

            for (int hit : this.positionHit) {
                if (hit == 1) {
                    checkSunk++; //incremerer checkSunk, hvis skibet er ramt på positionen.
                }
            }

            if (checkSunk == (this.length) ) {
                isSunk = true;
                System.out.println("You've completely destroyed the ship. Good one mate!");
            }
    }


 // placeShip metode
    public void placeShip(int shipStartPos) {

        //nedenstående printer Ocean array før ship start pos er opdateret.
        System.out.println("The user typed: " + shipStartPos);
        System.out.println("Old oceanPos: " + Arrays.toString(this.oceanPosition));
            if (shipStartPos <= 4) {
                int oceanPos = shipStartPos;
                for (int i = 0; i<this.oceanPosition.length; i++) {


                    this.oceanPosition[i] = oceanPos;

                    oceanPos++;
                }
            } else {
                int oceanPos = 4;
                for (int i = 0; i<this.oceanPosition.length; i++) {

                    this.oceanPosition[i] = oceanPos;

                    oceanPos++;
                }
                }
        //nedenstående printer Ocean array efter ship start pos er opdateret.
        System.out.println("New OceanPos: " + Arrays.toString(this.oceanPosition));
            }



 /*
 // lavet med enhanched for loop, men det virker ikke.
    public void placeShip(int shipStartPos) {
        //test af skibsplacering
        System.out.println(Arrays.toString(this.oceanPosition));
            if (shipStartPos <= 4) {
                int oceanPos = shipStartPos;
                for (int pos : this.oceanPosition) {
                    System.out.println(pos);
                    pos = oceanPos;
                }
            } else {
                int oceanPos = 4;
                for (int pos : this.oceanPosition) {
                    pos = oceanPos;
                }


            }
        System.out.println(Arrays.toString(this.oceanPosition));
    }
*/













    //Konstruktør der opdaterer resten;

}
