package ExamPrep.PrepSort.Comparator.Prep03;

public class Movie {
    private String title;
    private String director;
    private int rating;

    public Movie(String title, String director, int rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() { return title; }

    public String getDirector() { return director; }

    public int getRating() { return rating; }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new RuntimeException("Rating er større eller mindre end 10");
        }
    }

    @Override
    public String toString() {
        return "Titel: " + title + ", Instruktør: " + director + ", Bedømmelse: " + rating + "\n";
    }




}
