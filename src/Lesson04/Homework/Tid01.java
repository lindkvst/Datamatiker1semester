package Lesson04.Homework;

public class Tid01 {
    //jeg laver tidspunkt variabler
    private int time;
    private int minut;
    private int sekund;

    //jeg laver konstruktør til input af data

    public Tid01(int time, int minut, int sekund) {
        this.time = time;
        this.minut = minut;
        this.sekund = sekund;
    }


    //returner time
    public int getTime() {
        return time;
    }

    //returner minut
    public int getMinut() {
        return minut;
    }

    //returner sekund
    public int getSekund() {
        return sekund;
    }

    //beregn siden midnat
    public int getSekunderSiden() {
        int totalSekunder = time*3600 + minut * 60 + sekund;
        return totalSekunder;
    }

    //beregn til midnat
    public int getSekunderFor() {
        int totalSekunder = time*3600 + minut * 60 + sekund;
        totalSekunder = 86400 - totalSekunder;
        return totalSekunder;
    }

/*
    //print af tidspunkt
    public String visTid() {
        String text = "Timer = " + this.time +
                "Minutter " + this.minut +
                "Sekunder " + this.sekund;
        return text;
    }


    */

}
