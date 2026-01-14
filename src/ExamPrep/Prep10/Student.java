package ExamPrep.Prep10;

public class Student implements Comparable<Student> {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public int compareTo(Student other) {
        if (grade < other.getGrade()) return 1;
        if (grade > other.getGrade()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }


}
