package ExamPrep.PrepInheritance.Prep01;

public abstract class Food {
    private String name;
    private double price;

    protected Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() { return name; }
    protected double getPrice() { return price; }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }


}
