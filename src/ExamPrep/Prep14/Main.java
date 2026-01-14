package ExamPrep.Prep14;

public class Main {
    public static void main(String[] args) {
        MusicTrack mt1 = new MusicTrack("title1", 300, "rock");
        MusicTrack mt2 = new MusicTrack("title2", 400, "hiphop");
        MusicTrack mt3 = new MusicTrack("title3", 400, "classic");
        MusicTrack mt4 = new MusicTrack("title4", 400, "rock");

        Playlist pl = new Playlist();

        pl.addSong(mt1);
        pl.addSong(mt2);
        pl.addSong(mt3);
        pl.addSong(mt4);

        System.out.println("tracks that are rock: " + pl.TracksByGenre("rock"));


    }
}
