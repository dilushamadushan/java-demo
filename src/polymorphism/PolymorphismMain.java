package polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {

        /*
         ================= POLYMORPHISM RULES =================

         1. Polymorphism means "many forms"
            → One method behaves differently for different objects

         2. Achieved using:
            ✔ Method Overriding
            ✔ Inheritance

         3. Parent class reference can refer to child class object
            → Animal a = new Dog();

         4. Method call is decided at runtime
            → Runtime Polymorphism

         5. Overridden method is executed
            → Not parent method

         6. Method signature must be same
            → Same name, same parameters

         7. Static methods do NOT support polymorphism

         ======================================================
        */

        // Parent reference, Child object
        Animal a1 = new Dog();
        a1.sound();    // Dog barks

        // Parent reference, Child object
        Animal a2 = new Cat();
        a2.sound();    // Cat meows

        // Parent object
        Animal a3 = new Animal();
        a3.sound();    // Animal makes a sound
    }
}
