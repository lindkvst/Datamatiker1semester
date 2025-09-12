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
            //nedenstående viser SunkStatus
            //System.out.println("Sunk Status: " + isSunk);

            //bruger askNumber() metoden til at få en int som svar fra brugeren.
            int guess = gh.askNumber("Where do you want to hit it?");

            //undersøger om gættet rammer skibet
            s1.checkHit(guess);

            //undersøger om skibet nu er sunket.
            s1.checkSunk();

            //ændrer lokal variabel hvis skibet er sunket.
            isSunk = s1.getSunk();

            //viser antal ture, hvis skibet er sunket i denne runde.
            if (isSunk) {
                System.out.printf("You've completed the game in %d turns. Congrats!", gh.getGameCount() );
            }

            gh.gameCountInc(); //inkremerer hvor mange runder, der er brugt på gæt
        }
    }

}