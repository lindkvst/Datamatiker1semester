package Lesson07.Homework;

public class TileTest {

    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        Tile t1 = new Tile('Z', 10);
        System.out.println(t1);
        printTile(t1);

        Tile t2 = new Tile('T', 8);
        System.out.println(t2);
        printTile(t2);

        Tile t3 = new Tile('Z', 10);
        System.out.println(t3);
        printTile(t3);

        char newValue = 90; //Z in ASCII

        Tile t4 = new Tile(newValue, (8+2));
        printTile(t4);

        System.out.print("Is t1 equal to t3?: ");
        System.out.println(t1.equals(t3));

        System.out.print("Is t1 equal to t4?: ");
        System.out.println(t1.equals(t4));
    }

    //printTile metode
    public static void printTile(Tile t) {
        char letter = t.getLetter();
        int value = t.getValue();
        System.out.printf("The letter of the tile is %c\nThe value of the tile is %d\n\n", letter, value);

    }


}