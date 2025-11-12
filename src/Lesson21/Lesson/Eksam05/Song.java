package Lesson21.Lesson.Eksam05;

public class Song {
    private String name;
    private String musician;
    private int duration;

    public Song(String name, String musician, int duration) {
        this.name = name;
        this.musician = musician;
        this.duration = duration;
    }



    //getters
    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }


}
