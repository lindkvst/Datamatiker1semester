package Lesson07.Lesson;


public class BattleShipGame {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {

        GameHelper gh = new GameHelper();

        gh.startGame(); // printer welcome message.

        //Ship s1 = new Ship(); //default metode - opretter positionHit = 0;
        Ship s1 = new Ship(2, 3, 4, 0, 0, 0, 0, 3, false);
        boolean isSunk = s1.getSunk();

        //bruger scanner til at spørge hvor der skal rammes
        int placement = gh.askNumber("Where you you want to place your ship?");

        s1.placeShip(placement);

        while (!isSunk) {
            System.out.println("Sunk Status: " + isSunk);
            int guess = gh.askNumber("Where do you want to hit it?");
            s1.checkHit(guess);
            s1.checkSunk();
            isSunk = s1.getSunk();
            gh.gameCountInc(); //inkremerer hvor mange runder, der bruges på gæt

            if (isSunk) {
                System.out.printf("You've completed the game in %d turns. Congrats!", gh.getGameCount() );
            }
        }
    }

}