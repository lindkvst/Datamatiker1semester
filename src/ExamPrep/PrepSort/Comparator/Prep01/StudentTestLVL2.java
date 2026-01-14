package ExamPrep.PrepSort.Comparator.Prep01;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentTestLVL2 {
    public static void main(String[] args) {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Potter", House.GRYFFINDOR);
        HogwartsStudent s2 = new HogwartsStudent("Johnny", "Brian", House.RAVENCLAW);
        HogwartsStudent s3 = new HogwartsStudent("Johnny", "Allan", House.SLYTHERIN);

        ArrayList<HogwartsStudent> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        //LVL 3 comparator
//        students.sort(new LastNameComparator());
//
//        System.out.println(students);

        students.sort(Comparator.comparing(HogwartsStudent::getLastName));

        System.out.println(students);

        students.sort(Comparator.comparing(HogwartsStudent::getLastName).reversed());

        System.out.println(students);

        students.sort(Comparator.comparing(HogwartsStudent::getFirstName));

        System.out.println(students);

        students.sort(Comparator.comparing(HogwartsStudent::getFirstName).thenComparing(HogwartsStudent::getLastName));

        System.out.println(students);

    }

}
