package ExamPrep.PrepSort.Comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("title1", "director1", 9);
        Movie m2 = new Movie("title2", "director2", 4);
        Movie m3 = new Movie("title3", "director1", 2);
        Movie m4 = new Movie("title4", "director1", 10);

        System.out.println(m1);

        m1.setRating(10);

        System.out.println(m1);

        ArrayList<Movie> library = new ArrayList<>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);

        System.out.println(library);

        Collections.sort(library);

        System.out.println(library);


    }


}
