package ExamPrep.Prep08;

public class AnimalTest {
    public static void main(String[] args) {
        Animal d1 = new Dog("Brian");
        Animal d2 = new Cat("Lisa");
        Animal d3 = new Dog("Lizzie");

        System.out.println(d1.makeSound());
        System.out.println(d2.makeSound());
        System.out.println(d3.makeSound());
    }
}
