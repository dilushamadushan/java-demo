package encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {

        /*
         ================= ENCAPSULATION RULES =================

         1. Encapsulation means wrapping data and methods together
            → Data + Methods = One unit (Class)

         2. Data hiding is achieved using private keyword

         3. Direct access to variables is NOT allowed
            ❌ student.id = 10;

         4. Data is accessed using public getter and setter methods

         5. Encapsulation improves:
            ✔ Security
            ✔ Maintainability
            ✔ Control over data

         6. Validation can be added in setter methods

         ========================================================
        */

        // Creating object of Student class
        Student student = new Student();

        // Setting values using setter methods
        student.setId(101);
        student.setName("Dilusha");
        student.setAge(22);

        // Getting values using getter methods
        System.out.println("ID : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}
