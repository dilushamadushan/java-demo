package Class_and_Object;

// This is a CLASS
// A class is a blueprint (plan) to create objects
public class student {

    // These are VARIABLES (data members)
    // Each object will have its own id and name
    int id;
    String name;

    // This is a METHOD
    // It is used to insert data into the object
    public void insertData(int x, String y){
        id = x;      // assigning value to id
        name = y;    // assigning value to name
    }

    public static void main(String[] args) {

        // Creating OBJECT 'a' of class student
        // Object is a real instance of a class
        student a = new student();

        // Setting values to object 'a'
        a.id = 100;
        a.name = "Jack";

        // Printing values of object 'a'
        System.out.println("id : " + a.id + " name : " + a.name);

        // Creating another OBJECT 'b'
        student b = new student();

        // Setting values using method
        b.insertData(101, "Dilusha");

        // Printing values of object 'b'
        System.out.println("id : " + b.id + " name : " + b.name);
    }
}
