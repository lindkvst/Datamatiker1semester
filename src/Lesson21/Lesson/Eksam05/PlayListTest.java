package Lesson21.Lesson.Eksam05;

import java.util.ArrayList;

public class PlayListTest {
    public static void main(String[] args) {
        runProgram();

    }

    public static void runProgram() {
        ArrayList<Song> allSongs = new ArrayList<>();
        allSongs.add(new Song("Here Comes the Sun", "The Beatles", 320));
        allSongs.add(new Song("Something", "The Beatles", 340));
        allSongs.add(new Song("Careless Whisper", "George Michael", 410));
        allSongs.add(new Song("Jump Around", "Various Artists", 410));

        PlayList chill = new PlayList();
        chill.addSong(allSongs.get(0));
        chill.addSong(allSongs.get(1));
        chill.addSong(allSongs.get(3));

        System.out.println("Samlet varighed for playlisten er: " + chill.getTotalDuration());



    }
}
