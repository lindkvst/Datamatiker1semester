package ExamPrep.Prep10again;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> classRoom = new ArrayList<>();

        classRoom.add(new Student("navn1", 7));
        classRoom.add(new Student("navn2", 12));
        classRoom.add(new Student("navn3", 4));
        classRoom.add(new Student("navn4", 2));

        Collections.sort(classRoom);

        System.out.println(classRoom);

    }



}
