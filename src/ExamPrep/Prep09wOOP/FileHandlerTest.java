package ExamPrep.Prep09wOOP;

import java.io.File;

public class FileHandlerTest {
    public static void main(String[] args) {
        File myFile = new File("savedText.txt");
        String printString = "Dette er min streng til print " +
                "\nDette bliver linje 2. " +
                "\nDette bliver linje 3. " +
                "\nog her kommer en linje fire";
        FileHandler.fileWriter(myFile, printString);

        String readString = "";
        readString = FileHandler.fileReader(myFile);
        System.out.println();

        System.out.println(readString);


    }
}
