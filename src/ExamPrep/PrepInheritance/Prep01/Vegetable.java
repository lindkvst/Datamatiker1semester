package ExamPrep.PrepInheritance.Prep01;

public class Vegetable extends Food {

    private Season season;

    public Vegetable(String name, double price, Season season) {
        super(name, price);
        this.season = season;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Price: " + getPrice() + ", Season: " + season;
    }
}
