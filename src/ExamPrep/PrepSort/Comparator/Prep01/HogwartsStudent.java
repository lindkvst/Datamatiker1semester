package ExamPrep.PrepSort.Comparator.Prep01;

import java.util.Comparator;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private House house;

    public HogwartsStudent(String firstName, String lastName, House house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(String houseName) {
        if (houseName.toUpperCase().equals("GRYFFINDOR") ||
                houseName.toUpperCase().equals("HUFFLEPUFF") ||
                houseName.toUpperCase().equals("SLYTHERIN") ||
                houseName.toUpperCase().equals("RAVENCLAW")
        ) {
            this.house = House.valueOf(houseName);
        } else {
            throw new RuntimeException("Forkert husnavn");
        }
    }

    @Override
    public String toString() {
        return "Navn: " + firstName + " " + lastName + ", Hus: " + house;
    }
}
