package ExamPrep.PrepSort.Comparator.Prep03;

import java.util.ArrayList;
import java.util.Comparator;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("movie 1", "director 1", 2);
        Movie m2 = new Movie("movie 2", "director 1", 4);
        Movie m3 = new Movie("movie 3", "director 2", 10);
        Movie m4 = new Movie("movie 4", "director 2", 5);
        Movie m5 = new Movie("movie 5", "director 3", 1);
        Movie m6 = new Movie("movie 6", "director 1", 8);

        System.out.println(m1);

        ArrayList<Movie> library = new ArrayList<>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);
        library.add(m6);

        System.out.println(library);

        //niveau 1 - Lambda

        //library.sort((mo2, mo1) -> Integer.compare(mo1.getRating(), mo2.getRating()));

        //library.sort((mo1, mo2) -> mo1.getDirector().compareTo( mo2.getDirector()));
        //library.sort((Comparator.comparing(Movie::getDirector).thenComparing(Movie::getRating)));

        //library.sort(Comparator.comparing(Movie::getRating).reversed());

        //niveau 2 - Comparator.comparing()
//
//        library.sort(Comparator.comparing(Movie::getRating));

        //niveau 3 - Selvstændig MovieRatingComparator
        //library.sort(new MovieRatingComparator().reversed());

        System.out.println(library);


    }
}
