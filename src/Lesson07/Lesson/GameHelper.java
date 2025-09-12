package Lesson07.Lesson;
import java.util.Scanner; //importerer scanner


public class GameHelper {
    private Scanner scanner;
    int gameCount;

    //Konstruktør til oprettelse af Scanner
    public GameHelper() {
        this.scanner = new Scanner(System.in);
        this.gameCount = 0;

    }
    //getter for gameCount
    public int getGameCount() {
        return gameCount;
    }
    //setter for gameCount
    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void startGame() {
        System.out.println("====== Welcome Fighters of the Big Sea ======\n\n");
    }

    //metode til at stille spørgsmål og returnere scanner input String.
    public String askQuestion(String question) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(question + ": "); // printer inputString - spørgsmål til bruger
        String answer = Sc.nextLine();
        return answer;
    }

    //metode til at stille spørgsmål og returnere scanner input int.
    public int askNumber(String question) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(question + ": ");
        int answer = Sc.nextInt();
        return answer;
    }

    //metode til at inkremere gameCount;
    public void gameCountInc() {
        this.gameCount++;
    }



}
