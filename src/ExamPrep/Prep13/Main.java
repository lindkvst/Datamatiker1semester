package ExamPrep.Prep13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("title1", "author1", 302);

        System.out.println(lb1);
      //  LibraryBook lb2 = new LibraryBook("title2", "author1", 0);
        LibraryBook lb3 = new LibraryBook("title3", "author1", 250);
        LibraryBook lb4 = new LibraryBook("title4", "author2", 270);
        LibraryBook lb5 = new LibraryBook("title5", "author2", 500);
        System.out.println(lb3);

        System.out.println("is lb1 long?: " + lb1.isLongBook());
        System.out.println("is lb2 long?: " + lb3.isLongBook());

        Library lib = new Library();

        lib.addBook(lb1);
        lib.addBook(lb3);
        lib.addBook(lb4);
        lib.addBook(lb5);

        ArrayList<LibraryBook> longBooks = new ArrayList<>();

        longBooks = lib.getLongBooks();

        System.out.println(longBooks);

    }
}
