package ExamPrep.Prep09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {

        File myFile = new File("savedText.txt");

        try {
            PrintStream out = new PrintStream(myFile);
            out.println("dette bliver første linje");
            out.println("dette bliver linje 2");
            out.println("og linje 3");

            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen");
        }

        int numOfLines = 0;
        String line = "";
        String allLines = "";

        try {
            Scanner in = new Scanner(myFile);

            while (in.hasNextLine()) {
                line = in.nextLine();
                allLines = allLines + line + "\n";
                numOfLines++;
            }

            System.out.println(allLines);
            System.out.println("\n" + "Du har printet " + numOfLines + " linjer");


        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke. Fejlmeddelelse: " + e);


    }


    }
}
