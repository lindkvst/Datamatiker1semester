package ExamPrep.PrepInheritance.Prep02;

public abstract class Media {
    private String name;
    private int duration;

    protected Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    protected String getName() { return name; }
    protected int getDuration() { return duration; }

    @Override
    public String toString() {
        return "";
    }
}
