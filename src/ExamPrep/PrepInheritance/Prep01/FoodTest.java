package ExamPrep.PrepInheritance.Prep01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;

public class FoodTest {
    public static void main(String[] args) {
        ArrayList<Food> basket = new ArrayList<>();

        basket.add(new FastFood("name1", 50.0, 400));
        basket.add(new FastFood("name2", 200.0, 470));
        basket.add(new FastFood("name2", 2.0, 4000));
        basket.add(new Vegetable("name2", 2.0, Season.SPRING));
        basket.add(new Vegetable("name2", 50.0, Season.SPRING));
        basket.add(new Vegetable("name2", 80.0, Season.WINTER));

        System.out.println(basket);

        basket.sort(Comparator.comparing(Food::getPrice));

        System.out.println(basket);

        try {
            File file = new File("foodinfo.txt");
            PrintStream out = new PrintStream(file);

            for (Food f : basket) {
                out.println(f);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke: " + e.getMessage());
        }
    }
}
