package ExamPrep.Prep13;

public class LibraryBook {
    private String title;
    private String author;
    private int pages;

    public LibraryBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        if (pages < 1) {
            throw new RuntimeException("Pages are less than 1");
        } else {
            this.pages = pages;
        }

    }

    public boolean isLongBook() {
        int pagesToCheck = 300;
        if (pages > pagesToCheck) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }




}
