package ExamPrep.Prep13;

import java.sql.Array;
import java.util.ArrayList;

public class Library {
    ArrayList<LibraryBook> library = new ArrayList<>();

    public Library() {

    }

    public void addBook(LibraryBook lb) {
        library.add(lb);
    }

    public ArrayList<LibraryBook> getLongBooks() {
        ArrayList<LibraryBook> longList = new ArrayList<>();
        for (LibraryBook lb : library) {
            if (lb.isLongBook()) {
                longList.add(lb);
            }
        }

        return longList;
    }
}
