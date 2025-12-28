package inheritance;

// Main class to test inheritance
public class VehicaleDemo {

    public static void main(String[] args) {

        // Creating Car object
        Car car = new Car();
        car.carDetails();
        car.start();   // inherited method
        car.stop();    // inherited method
        car.drive();   // Car's static method

        System.out.println(" ");

        // Creating Van object
        Van van = new Van();
        van.vanDetails();
        van.start();
        van.stop();

        System.out.println(" ");

        // Creating OldCar object
        // Multilevel inheritance example
        OldCar oldCar = new OldCar();
        oldCar.oldCarDetails();
        oldCar.start();
        oldCar.stop();
    }
}
