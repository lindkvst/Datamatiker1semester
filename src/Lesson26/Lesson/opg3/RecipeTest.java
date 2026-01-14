package Lesson26.Lesson.opg3;

public class RecipeTest {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("opskrift1", "kartoffel, mel, vand");
        Recipe r2 = new Recipe("opskrift2", "kommen, mælk, vand");
        Recipe r3 = new Recipe("opskrift3", "kød, pasta");



        System.out.println("Indeholder r1 mel? : " + r1.containsIngredient("mel"));
        System.out.println("Indeholder r2 mel? : " + r2.prettyContainsIngredient("mel"));
        System.out.println("Indeholder r2 mel? : " + r2.prettyContainsIngredient("mælk"));
    }
}
