package ExamPrep.Prep01;

import java.util.ArrayList;

public class TemperaturTest {
    public static void main(String[] args) {
        ArrayList<Double> readings = new ArrayList<>();
        readings.add(0.2);
        readings.add(23.3);
        readings.add(18.3);
        readings.add(35.3);
        readings.add(5.3);

        Temperatur temp = new Temperatur(readings);

        temp.addReading(12.0);
        System.out.println(temp.calcMean() );
        System.out.println(temp.findHighest() );
        System.out.println(temp.findLowest() );


    }
}
