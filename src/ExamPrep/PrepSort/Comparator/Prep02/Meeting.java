package ExamPrep.PrepSort.Comparator.Prep02;

import java.time.LocalDate;

public class Meeting {
    private LocalDate date;
    private int duration;
    private Type type;

    public Meeting(LocalDate date, int duration, Type type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    //set og get
    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public Type getType() {
        return type;
    }

    public boolean externalParticipant() {
        if (type == Type.OPSTARTSMOEDE && duration > 60) {
            return true;
        } else if (type == Type.PLANLAEGNINGSMOEDE && duration > 120) {
            return true;
        } else if (type == Type.KONFLIKTLOESENDE) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Dato: " + date + ", Varighed: " + duration + ", Type: " + type;
    }

}
