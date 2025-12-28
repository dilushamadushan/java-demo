package polymorphism;

// Cat inherits Animal
public class Cat extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
