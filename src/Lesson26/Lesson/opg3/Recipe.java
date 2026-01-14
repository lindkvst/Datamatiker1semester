package Lesson26.Lesson.opg3;

public class Recipe {
    private String name;
    private String ingredients;

    public Recipe (String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    //get og set
    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean containsIngredient(String query) {
        if (ingredients.contains(query)) {
            return true;
        } else {
            return false;
        }
    }

    public String prettyContainsIngredient(String query) {
        if (ingredients.contains(query)) {
            return "Ja, opskriften indeholder " + query;
        } else {
            return "Nej, opskriften indeholder ikke " + query;
        }
    }

    @Override
    public String toString() {
        return "Opskriften hedder " + name + " og indeholder følgende ingredienser: " + ingredients;
    }
}
