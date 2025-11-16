package ExamPrep.Prep07;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Event> cal = new ArrayList<>();
        cal.add(new Event("test1", LocalDate.of(2025, 11, 29), "test11"));
        cal.add(new Event("test2", LocalDate.of(2025, 1, 29), "test22"));
        cal.add(new Event("test3", LocalDate.of(2025, 3, 29), "test33"));
        cal.add(new Event("test3", LocalDate.of(2025, 12, 29), "test33"));

        Calendar calendar = new Calendar(cal);

        System.out.println("The Next event is: ");
        calendar.findNext();
        calendar.printNext();
    }
}
