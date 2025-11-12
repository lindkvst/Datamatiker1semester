package ExamPrep.Prep01;

import java.util.ArrayList;

public class Temperatur {
    private ArrayList<Double> readings = new ArrayList<>();

    public Temperatur(ArrayList<Double> readings) {
        this.readings = readings;
    }

    public ArrayList<Double> getReadings() {
        return readings;
    }

    public void addReading(double reading) {
        readings.add(reading);
    }

    public Double calcMean() {
        Double sum = 0.0;
        int size = readings.size();
        for (Double r : readings) {
            sum += r;
        }
        return sum/size;
    }

    public Double findLowest() {
        Double lowest = 0.0;
        for (int i = 0; i < readings.size(); i++) {
            if (i == 0) {
                lowest = readings.get(i);
            } else {
                if (readings.get(i) < lowest) {
                    lowest = readings.get(i);
                }
            }

        }
        return lowest;
    }

    public Double findHighest() {
        Double highest = 0.0;
        for (int i = 0; i < readings.size(); i++) {
            if (i == 0) {
                highest = readings.get(i);
            } else {
                if (readings.get(i) > highest) {
                    highest = readings.get(i);
                }
            }

        }
        return highest;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Double r : readings) {
            returnString.concat(r + "\n");
        }
        return returnString;
    }

}
