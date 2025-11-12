package ExamPrep.Prep05;

import java.time.LocalDate;

public class Movie {
    private String title;
    private int year;
    private Genre genre;

    public Movie(String title, int year, Genre genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isNew() {
        if ((LocalDate.now().getYear() - year) < 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year + ", Genre: " + genre;
    }
}
