package Lesson03.Homework;

public class tShirt {
    String print;
    String size;
    String color;
    double cost;

    void listShirt() {
        System.out.println(
                "You've chosen the T-Shirt with " +
                        print + " print" +
                        " in size " + size + ". " +
                        "\n" +
                        "The shirt is in beautiful " + color + " colors" +
                        " and cost " + cost + " kr."
        );
    }

    void chooseShirt() {
        System.out.println(
                "Today you should wear the T-shirt with " +
                        print + " print" +
                        " in size " + size + ". " +
                        "\n" +
                        "The shirt is in beautiful " + color + " colors" +
                        " and cost " + cost + " kr."
        );
    }
}