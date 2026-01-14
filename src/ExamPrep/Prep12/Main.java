package ExamPrep.Prep12;

public class Main {
    public static void main(String[] args) {
        MusicTrack t1 = new MusicTrack("title1", "Michael Jackson", 400);
        MusicTrack t2 = new MusicTrack("title1", "Michael Buble", 280);
        MusicTrack t3 = new MusicTrack("title1", "George Michael", 600);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();

        System.out.println("Is t1 long?: " + t1.isLongTrack());

        System.out.println("t1 artist initials: " + t1.getArtistInitials());
    }
}
