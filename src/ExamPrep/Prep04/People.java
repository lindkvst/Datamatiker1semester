package ExamPrep.Prep04;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> people = new ArrayList<>();

    public People() {
        //do nothing
    }

    public People(ArrayList<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void findOldest() {
        String oldest = "";
        int ageOldest = 0;
        for (int i = 0; i < people.size(); i++) {
            if (i == 0) {
                oldest = people.get(i).toString();
                ageOldest = people.get(i).getAge();
            } else if (people.get(i).getAge() > ageOldest) {
                oldest = people.get(i).toString();
                ageOldest = people.get(i).getAge();

            }
        }
        System.out.println(oldest);
    }

    public void findAverage() {
        int devider = people.size();
        int sumAge = 0;
        for (Person p : people) {
            sumAge += p.getAge();
        }

        System.out.println("The average age is: " + sumAge/devider);
    }


}
