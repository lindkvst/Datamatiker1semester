package ExamPrep.PrepInheritance.Prep01;

public class FastFood extends Food {
    private int calories;

    public FastFood(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Price: " + getPrice() + ", Calories: " + calories;
    }
}
