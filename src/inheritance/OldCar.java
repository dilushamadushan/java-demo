package inheritance;

// OldCar inherits Car
// This is multilevel inheritance
public class OldCar extends Car {

    // Method to display old car details
    public void oldCarDetails(){

        // Variables inherited from Vehicle
        name = "TOYOTS";
        color = "Red";
        wheels = 4;

        // Variable inherited from Car
        noOfDoors = 4;

        System.out.println("Old car Details");
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Wheels : " + wheels);
        System.out.println("No of Doors : " + noOfDoors);
    }
}
