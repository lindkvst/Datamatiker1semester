package ExamPrep.Prep07;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> cal = new ArrayList<>();

    public Calendar(ArrayList<Event> cal) {
        this.cal = cal;
    }

    public void findNext() {
        LocalDate now = LocalDate.now();
        Period diff = Period.of(0,0,0);
        String event = "";

        for (int i = 0; i < cal.size(); i++) {
            if (i == 0) {
                diff = now.until(cal.get(i).getDate());
            } else {
                Period thisDiff = now.until(cal.get(i).getDate());
                if (diff.getDays() < thisDiff.getDays()) {
                    event = cal.get(i).toString();
                    diff = now.until(cal.get(i).getDate());
                }
            }
        }

        System.out.println(event);
    }

    public void printNext() {
        for (Event e : cal) {
            if (e.getDate().isAfter(LocalDate.now())) {
                System.out.println(e);
            }
        }
    }




}
