package abstraction;

public class Abstract_main {
    public static void main(String[] args) {

        /*
         ================== ABSTRACTION RULES ==================

         1. Abstraction hides implementation details
            → We know WHAT object does, not HOW it does

         2. Abstract class cannot be instantiated
            ❌ Vehical v = new Vehical(); (Not allowed)

         3. Abstract class can have:
            ✔ Abstract methods
            ✔ Non-abstract methods
            ✔ Constructors
            ✔ Final variables

         4. Child class MUST implement all abstract methods
            → Bike must implement run()

         5. Abstract methods do NOT have body
            → abstract void run();

         6. Constructor of abstract class is called
            → When child object is created

         7. Abstract class can provide partial abstraction
            → Both abstract + normal methods

         =======================================================
        */

        // Creating object of child class
        // Parent reference is possible
        Bike bike = new Bike();

        // Calling implemented abstract method
        bike.run();

        // Calling normal method from abstract class
        bike.changeGear();
    }
}
