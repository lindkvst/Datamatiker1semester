package ExamPrep.PrepInheritance.Prep02;

public class Video extends Media {
    private String aspectRatio;

    public Video (String name, int duration, String aspectRatio) {
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }

    public String getAspectRatio() { return aspectRatio; }
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Duration: " + getDuration() + ", AspectRatio: " + aspectRatio;
    }
}
