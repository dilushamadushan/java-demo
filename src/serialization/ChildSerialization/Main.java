package serialization.ChildSerialization;

public class Main {
    public static void main(String[] args) {
        MySerialization sm = new MySerialization();

        Cat cat = new Cat("abc", 23, "red", "dd");

        sm.serializer(cat);
        sm.deserializer();
    }
}
