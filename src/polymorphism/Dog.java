package polymorphism;

// Dog inherits Animal
public class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
