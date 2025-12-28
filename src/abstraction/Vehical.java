package abstraction;

// ABSTRACT CLASS
// Cannot create object from this class
public abstract class Vehical {

    // Final variable
    // Value cannot be changed
    final int age = 10;

    // Constructor of abstract class
    // Constructor is called when child class object is created
    Vehical(){
        System.out.println("Vehical Constructor");
    }

    // Abstract method
    // Must be implemented by child class
    abstract void run();

    // Normal method
    // Child class can use or override
    void changeGear(){
        System.out.println("Changed Gear");
    }
}
