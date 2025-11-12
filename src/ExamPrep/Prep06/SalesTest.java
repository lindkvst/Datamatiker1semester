package ExamPrep.Prep06;

import java.util.ArrayList;

public class SalesTest {
    public static void main(String[] args) {
        ArrayList<Sales> allSales = new ArrayList<>();

        allSales.add(new Sales("computer", 2, 2000));
        allSales.add(new Sales("machine", 20, 500));
        allSales.add(new Sales("Carrots", 20, 20));

        double totalSales = 0;

        for (Sales s : allSales) {
            totalSales += s.calculateTotal();
        }
        System.out.println("Total sales are: " + totalSales);

        String highest = "";
        double highSum = 0;
        for (Sales s : allSales) {
            if (s.calculateTotal() > highSum) {
                highest = s.toString();
                highSum = s.calculateTotal();
            }
        }

        System.out.println(highest + " is the highest with " + highSum + " DKK sold in total");

    }
}
