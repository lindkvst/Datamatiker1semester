package ExamPrep.PrepSort.Comparable;

public class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private int rating;

    public Movie (String title, String director, int rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getRating() { return rating; }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new RuntimeException("Rating er lavere end 0 eller højere end 10. Prøv igen");
        }
    }

    @Override
    public String toString() {
        return "Titel: " + title + ", Instruktør: " + director + ", Bedømmelse: " + rating + "\n";
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.rating, other.rating);
    }
}
