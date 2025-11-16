package ExamPrep.Prep08;

abstract class Animal {
    private String name;
    private Type type;
    private String sound;

    public Animal(String name, Type type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }



    public String makeSound() {
        return sound;
    }

    public String toString() {
        return "Name: " + name  + ", Type: " + type + ", Sound: " + sound;
    }



}
