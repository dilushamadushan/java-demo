package inheritance;

// Parent class (Base class)
public class Vehicle {

    // Protected variables
    // Can be accessed by child classes
    protected String name;
    protected String color;
    protected int wheels;

    // Default access variable
    // Can be accessed inside the same package
    double speed = 40.0;

    // Private variable
    // Cannot be accessed outside this class
    private String enginCapasity;

    // Method to start the vehicle
    public void start(){
        System.out.println("Vehicle starting...");
    }

    // Method to stop the vehicle
    public void stop(){
        System.out.println("Vehicle stoping...");
    }

    // Static method
    // Belongs to class, not object
    public static void drive(){
        System.out.println("Vehicle driving...");
    }
}
