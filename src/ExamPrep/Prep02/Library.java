package ExamPrep.Prep02;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        //initerer bibliotek
    }

    public Library(ArrayList<Book> library) {
        this.library = library;
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public void removeBook(Book book) {
        library.remove(book);
    }

    public String searchBook(String bookTitle) {
        String returnString = "";
        for (Book b : library) {
            if (b.getTitle().contains(bookTitle) ) {
                returnString = returnString + b.toString() + "\n";
            }
        }
        return returnString;
    }

    public void findOldestBook() {
        String print = "";
        int oldYear = 0;
        for (int i = 0; i < library.size(); i++) {
            if (i == 0) {
                oldYear = library.get(i).getYear();
            } else if (library.get(i).getYear() < oldYear) {
                oldYear = library.get(i).getYear();
                print = library.get(i).toString();
            }
        }
        System.out.println(print);
    }

}
