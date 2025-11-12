package ExamPrep.Prep05;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("movie1", 2001, Genre.ACTION);
        Movie m2 = new Movie("movie2", 2025, Genre.KOMEDIE);
        Movie m3 = new Movie("movie3", 2020, Genre.DRAMA);

        System.out.println(m1 + "Is the movie new?: " + m1.isNew());
        System.out.println(m2 + "Is the movie new?: " + m2.isNew());
        System.out.println(m3 + "Is the movie new?: " + m3.isNew());

    }
}
