package ExamPrep.Prep11;

public class LibraryBook {

    private String title;
    private String author;
    private int yearPublished;

    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClassic() {
        int currentYear = 2026;
        int age = currentYear - yearPublished;
        if (age>50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sameAuthor(LibraryBook lb) {
        if (author.equals(lb.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }
}
