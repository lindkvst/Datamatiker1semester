package ExamPrep.Prep14;

public class MusicTrack {
    private String title;
    private int durationSeconds;
    private String genre;

    public MusicTrack(String title, int durationSeconds, String genre) {
        this.title = title;
        this.durationSeconds = durationSeconds;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isLongTrack() {
        if (durationSeconds>300) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + durationSeconds + " secs, Genre: " + genre;
    }


}
