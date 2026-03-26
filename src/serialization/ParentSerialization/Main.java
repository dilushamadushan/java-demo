package serialization.ParentSerialization;

public class Main {
    public static void main(String[] args) {
        MySerialization sm = new MySerialization();

        Cat cat = new Cat("abc", 23, "red");

        sm.serializer(cat);
        sm.deserializer();
    }
}
