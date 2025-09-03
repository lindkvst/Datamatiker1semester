package Lesson04.Homework;

public class Tid01Test {
    public static void main(String[] args) {

        nyTid();

    }
    //opretter tid

    public static void nyTid() {
        Tid01 t1 = new Tid01(7, 25, 49);
        visTid(t1);
        Tid01 t2 = new Tid01(7, 57, 40);
      System.out.println("opgaven har taget " + (visForbrug(t2) - visForbrug(t1)) + " sekunder");
    }

    //printer til consollen
    public static void visTid(Tid01 t) {
        System.out.println("Timen er: " + t.getTime());
        System.out.println("Minutter er: " + t.getMinut());
        System.out.println("Sekunder er: " + t.getSekund());
        System.out.println("");
        System.out.println("Siden midnat er der gået "
                + t.getSekunderSiden() +
                " sekunder.");
        System.out.println("");
        System.out.println("Der er "
                + t.getSekunderFor() +
                " sekunder tilbage af i dag");
        System.out.println("");

    }
    //laver metode, der retunerer antal sekunder siden midnat
    public static int visForbrug(Tid01 t) {
        int Sekunder = t.getSekunderSiden();
        return Sekunder;
    }


/*
    public static void visForbrug(Tid01 t, 2) {
        System.out.println(t.getSekunderSiden() - s.getSekunderSiden());
    }
*/

}
