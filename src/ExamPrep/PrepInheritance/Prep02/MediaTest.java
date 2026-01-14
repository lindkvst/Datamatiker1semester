package ExamPrep.PrepInheritance.Prep02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class MediaTest {
    public static void main(String[] args) {
        Media m1 = new Audio("name1", 300, -10.0);
        Media m2 = new Audio("name2", 260, 1.0);
        Media m3 = new Audio("name3", 30, -20.0);
        Media m4 = new Video("nam41", 500, "16:9");
        Media m5 = new Video("name4", 5400, "4:3");
        Media m6 = new Video("name15", 100, "16:10");


        ArrayList<Media> library = new ArrayList<>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);
        library.add(m6);

        System.out.println(library);

        try {
            File file = new File("mediainfo.txt");
            PrintStream out = new PrintStream(file);

            for (Media m : library) {
                out.println(m);
            }

            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }



    }
}
