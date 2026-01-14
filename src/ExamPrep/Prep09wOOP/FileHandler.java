package ExamPrep.Prep09wOOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandler {
    static void fileWriter(File file, String fileString) {
        try {
            PrintStream out = new PrintStream(file);
            out.println(fileString);

            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke.");
            System.out.println("Fejlmeddelelse: " + e);
        }
    }

    static String fileReader(File file) {
        int numOfLines = 0;
        String line = "";
        String allLines = "";
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                line = in.nextLine();
                allLines = allLines.concat(line + "\n");
                numOfLines++;
            }

            System.out.println("Du har læst " + numOfLines + " linjer");

        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke.");
            System.out.println("Fejlmeddelelse: " + e);
        }
        return allLines;
    }
}
