package ExamPrep.Prep14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<MusicTrack> playlist = new ArrayList<>();

    public Playlist() {

    }

    public void addSong(MusicTrack mt) {
        playlist.add(mt);
    }

    public ArrayList<MusicTrack> TracksByGenre(String genre) {
        ArrayList<MusicTrack> tracks = new ArrayList<>();

        for (MusicTrack mt : playlist) {
            if (mt.getGenre().equals(genre)) {
                tracks.add(mt);
            }
        }
        return tracks;
    }


}
