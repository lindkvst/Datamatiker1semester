package ExamPrep.Prep10;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> classRoom = new ArrayList<>();

        classRoom.add(new Student("bjarne", 7));
        classRoom.add(new Student("børge", 10));
        classRoom.add(new Student("Brian", 2));
        classRoom.add(new Student("Micael", 12));
        Collections.sort(classRoom);

        System.out.println(classRoom);

    }
}
