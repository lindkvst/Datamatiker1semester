package ExamPrep.Prep03;

public class DiceTest {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
        Dice d4 = new Dice();
        Dice d5 = new Dice();

        d1.throwDice();
        d2.throwDice();
        d3.throwDice();
        d4.throwDice();
        d5.throwDice();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);


    }

}
