package Lesson03.Lesson;

import java.util.Scanner; //importerer Scanner til input

public class InputScanner {
    public static void main(String[] args) {
        Scanner uNameInput = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = uNameInput.nextLine();
        System.out.println("Username is: " + userName);
    }


}
