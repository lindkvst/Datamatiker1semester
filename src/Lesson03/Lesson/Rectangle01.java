package Lesson03.Lesson;

public class Rectangle01 {
    private double length;
    private double width;

    //jeg laver min konstruktør til input af data
    public Rectangle01(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Return length
    public double getLength() {
        return length;
    }

    //Return width
    public double getWidth() {
        return width;
    }

    //jeg laver en metode til beregning af omkreds
    public double getPerimiter() {
        return (length * 2) + (width * 2);
    }

    //jeg laver en metode til beregning af areal
    public double getArea() {
        return length * width;
    }

    public String getSize() {
        String text;
        if (getPerimiter() > 20) {
            text = "Rektanglen er stor!";
        } else {
            text = "Rektanglen er lille!";
        }
        return text;
    }
/*
    //jeg laver en metode til at printe til consollen
    public void printInfo() {
       System.out.println("Rektanglens længde er: " + this.length);
       System.out.println("Rektanglens bredde er: " + this.width);
       System.out.println("Rektanglens omkreds er: " + this.getPerimiter());

        //System.out.println("Rektanglens bredde er: " + r.getPerimiter());



    }
*/
}
