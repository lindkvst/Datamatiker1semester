package Lesson03.Lesson;

public class RectangleTest01 {
    public static void main(String[] args) {
        CreateRectangles();
    }

    public static void CreateRectangles() {
        //jeg opretter rektangler vhja konstruktør
        Rectangle01 r1 = new Rectangle01(5, 3);
        PrintRectangles(r1);
        Rectangle01 r2 = new Rectangle01(7,4);
        PrintRectangles(r2);

    }

    public static void PrintRectangles(Rectangle01 r) {
        //udskriv areal på given cirkel
//      System.out.println("Bredde af rektangel: " + this)
        System.out.println("Bredde af rektangel: " + r.getWidth());
        System.out.println("Længde af rektangel: " + r.getLength());
        System.out.println("Omkreds af rektangel: " + r.getPerimiter());
        System.out.println("Areal af rektangel: " + r.getArea());
        System.out.println(r.getSize());
        System.out.println();

    }
}
