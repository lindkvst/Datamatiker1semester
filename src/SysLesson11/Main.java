package SysLesson11;

public class Main {
    public static void main(String[] args) {
        Factory eriksFabrik = new Factory("Eriks Fabrik");
        //Car eriksCar = new Car(eriksFabrik.createCar("V50"));
        eriksFabrik.createCar("V50");
        eriksFabrik.createCar("Skoda");

        eriksFabrik.showCars();


    }
}
