package ExamPrep.Prep12;

public class MusicTrack {
    private String title;
    private String artist;
    private int durationSeconds;

    public MusicTrack(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isLongTrack() {
        int durationCheck = 300;
        if (durationSeconds > durationCheck) {
            return true;
        } else {
            return false;
        }
    }

    public String getArtistInitials() {
        String[] artistInitials = artist.split(" ");
        String initials = "";

        for (String parts : artistInitials) {
            initials = initials + parts.charAt(0);
        }
        return initials.toUpperCase();
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Duration " + durationSeconds + " secs";
    }
}
