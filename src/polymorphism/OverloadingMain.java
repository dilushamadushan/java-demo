package polymorphism;

public class OverloadingMain {
    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
        System.out.println(m.add(10.5, 20.5));
    }
}
