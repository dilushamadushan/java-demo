package inheritance;

// Car class inherits Vehicle class
public class Car extends Vehicle {

    // Car specific variable
    int noOfDoors;

    // Method to display car details
    public void carDetails(){

        // Accessing parent class variables
        name = "TOYOTS";
        color = "Red";
        wheels = 4;
        noOfDoors = 4;

        // Accessing parent variable using super keyword
        int speed = (int) super.speed;

        System.out.println("This is the car details.");
        System.out.println("Car Type : " + name);
        System.out.println("Car Color : " + color);
        System.out.println("Car speed : " + speed);
        System.out.println("Car Wheels : " + wheels);
    }

    // Static method (method hiding, not overriding)
    public static void drive(){
        System.out.println("Car driving...");
    }

    // Method overriding example (commented)
    // @Override
    // public void start(){
    //     super.start();
    //     System.out.println("Car starting...");
    // }
}
