package ExamPrep.PrepSort.ComparatorOgRandomOgTXT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;

public class BlomstTest {
    public static void main(String[] args) {
        Blomst b1 = new Blomst("navn1", Color.RED);
        Blomst b2 = new Blomst("navn2", Color.BROWN);
        Blomst b3 = new Blomst("navn3", Color.YELLOW);
        Blomst b4 = new Blomst("navn4", Color.RED);
        Blomst b5 = new Blomst("navn5", Color.RED);
        Blomst b6 = new Blomst("navn6", Color.RED);
        Blomst b7 = new Blomst("navn7", Color.BROWN);
        Blomst b8 = new Blomst("navn8", Color.YELLOW);
        Blomst b9 = new Blomst("navn9", Color.YELLOW);
        Blomst b10 = new Blomst("navn10", Color.RED);

        ArrayList<Blomst> blomsterBed = new ArrayList<>();

        blomsterBed.add(b1);
        blomsterBed.add(b2);
        blomsterBed.add(b3);
        blomsterBed.add(b4);
        blomsterBed.add(b5);
        blomsterBed.add(b6);
        blomsterBed.add(b7);
        blomsterBed.add(b8);
        blomsterBed.add(b9);
        blomsterBed.add(b10);

        System.out.println(blomsterBed);

        blomsterBed.sort(Comparator.comparing(Blomst::getCutLength).thenComparing(Blomst::getName));

        System.out.println(blomsterBed);

        File file = new File("blomsterbuket.txt");

        try {
            PrintStream out = new PrintStream(file);
            for (Blomst b : blomsterBed) {
                out.print(b);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fil findes ikke: " + e.getMessage());
        }


    }
}
