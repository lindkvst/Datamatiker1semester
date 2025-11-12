package ExamPrep.Prep04;

import java.util.ArrayList;


public class PersonTest {


    public static void main(String[] args) {
        People family = new People();
        family.addPerson(new Person("Biran", 20));
        family.addPerson(new Person("Bisdfran", 22));
        family.addPerson(new Person("Biraddn", 72));
        family.addPerson(new Person("Birdsan", 15));
        family.addPerson(new Person("Biraaaan", 54));

        family.findAverage();
        family.findOldest();

    }
}
