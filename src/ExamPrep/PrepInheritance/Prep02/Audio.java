package ExamPrep.PrepInheritance.Prep02;

public class Audio extends Media {
    private double loudness;

    public Audio (String name, int duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    public double getLoudness() { return loudness; }
    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Duration: " + getDuration() + ", Loudness: " + loudness;
    }
}
