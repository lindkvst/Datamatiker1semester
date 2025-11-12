package ExamPrep.Prep02;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1", 1989);
        Book book2 = new Book("title2", "author2", 1922);
        Book book3 = new Book("title3", "author1", 1966);
        Book book4 = new Book("title4", "author2", 2005);
        Book book5 = new Book("title5", "author1", 1953);
        ArrayList<Book> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        Library myLibrary = new Library(library);

        myLibrary.addBook(new Book("title6", "author2", 2001));
        myLibrary.addBook(new Book("title7", "author2", 2002));
        System.out.println("fandt denne bog: " + myLibrary.searchBook("le1"));

        System.out.print("Den ældste bog er: ");
        myLibrary.findOldestBook();



    }
}
