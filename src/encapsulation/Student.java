package encapsulation;

// Encapsulation example
// Data is hidden using private variables
public class Student {

    // Private variables (Data Hiding)
    private int id;
    private String name;
    private int age;

    // Public Getter method
    // Used to read value
    public int getId() {
        return id;
    }

    // Public Setter method
    // Used to set value
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    // Validation can be added
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
