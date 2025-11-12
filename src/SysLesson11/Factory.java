package SysLesson11;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Car> createdCars = new ArrayList<>();

    public Factory(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    class Car {
        private String modelName;

        Car(String modelName) {
            this.modelName = modelName;
            System.out.println("du har lavet en bil af typen " + this.modelName);
            createdCars.add(this);
        }

        @Override
        public String toString() {
            return modelName;
        }
    }

    public void showCars() {
        for (Car c : createdCars) {
            System.out.println(c);
        }

    }

    public void createCar(String modelName) {
        Car car = new Car(modelName);

       // return Car;
    }
}
