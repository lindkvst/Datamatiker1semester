package ExamPrep.PrepSort.Comparator.Prep01;

import java.util.Comparator;

public class LastNameComparator implements Comparator<HogwartsStudent> {

    @Override
    public int compare(HogwartsStudent h1, HogwartsStudent h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}
