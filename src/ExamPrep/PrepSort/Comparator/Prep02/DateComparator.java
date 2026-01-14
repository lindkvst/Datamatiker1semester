package ExamPrep.PrepSort.Comparator.Prep02;

import java.util.Comparator;

public class DateComparator implements Comparator<Meeting> {

    @Override
    public int compare(Meeting m1, Meeting m2) {
        return m2.getDate().compareTo(m1.getDate());
    }
}
