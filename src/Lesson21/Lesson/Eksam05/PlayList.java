package Lesson21.Lesson.Eksam05;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<Song> songs;


    public PlayList() {
        this.songs = new ArrayList<>();
    }

    public PlayList(ArrayList<Song> songs) {
        this.songs = songs;
    }



    //getters
    public int getTotalDuration() {
        int duration = 0;
        for (Song s : songs) {
            duration = duration + s.getDuration();
        }
        return duration;
    }

    //setters
    public void addSong(Song song) {
        songs.add(song);
    }





}
