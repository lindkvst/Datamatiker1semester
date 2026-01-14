package ExamPrep.Prep11;

public class Main {

    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("title1", "author1", 1950);
        LibraryBook lb2 = new LibraryBook("title2", "author2", 1971);
        LibraryBook lb3 = new LibraryBook("title4", "author1", 1981);

        System.out.println(lb1);
        System.out.println(lb2);
        System.out.println(lb3);

        System.out.println("is lb1 a classic? : " + lb1.isClassic());
        System.out.println("is lb3 a classic? : " + lb3.isClassic());

        System.out.println("is lb1 and lb2 same author? : " + lb1.sameAuthor(lb2) );
        System.out.println("is lb1 and lb3 same author? : " + lb1.sameAuthor(lb3) );
    }
}
