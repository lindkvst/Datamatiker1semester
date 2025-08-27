package Lesson02.Homework;

public class Lesson0203 {
    public static void main(String[] args) {
        //print skriver indholdet af metoden PrintExample til console
        System.out.print(PrintExample());
        //println skriver indholdet af metoden PrintExample OG indsætter en newline
        System.out.println(PrintExample());
        //derfor vil det efterfølgende print stå på sin egen linje
        System.out.print(PrintExample());
    }

    public static String PrintExample() {
        String text = "This is a test";
        return text;
    }
}
