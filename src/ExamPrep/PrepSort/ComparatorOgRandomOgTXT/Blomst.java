package ExamPrep.PrepSort.ComparatorOgRandomOgTXT;

import javax.management.InvalidAttributeValueException;
import java.util.Random;

public class Blomst {
    private String name;
    private Color color;
    private int cutLength;


    public Blomst(String name, Color color) {
        this.name = name;
        this.color = color;
        Random random = new Random();
        int r = random.nextInt(30);
        this.cutLength = r;
    }

    //getters
    public String getName() { return name; }
    public Color getColor() { return  color; }
    public int getCutLength() { return cutLength; }

    @Override
    public String toString() {
        return "Navn: " + name + ", Farve: " + color + ", Afklip Længde: " + cutLength + " cm. \n";
    }


}
