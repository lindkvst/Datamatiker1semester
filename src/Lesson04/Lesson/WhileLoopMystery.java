package Lesson04.Lesson;

public class WhileLoopMystery {
    public static void main(String[] args) {
        mysteryOne();
        mysteryTwo();
        mysteryThree();
    }

    public static void mysteryOne() {
        int x =10;
        while (x >= 2) {
            System.out.println("Loop 1: " + x);
            x -= 2;
        }
    }

    public static void mysteryTwo() {
        int y = 10;
        while (y > 6) {
            System.out.print("Loop 2: " + y + " ");
            y--;
        }
        System.out.println();
    }

    public static void mysteryThree() {
        int z = 2;
        while (z < 20) {
            System.out.print(z + " ");
            z *= 2;
        }
        System.out.println();
    }
}
