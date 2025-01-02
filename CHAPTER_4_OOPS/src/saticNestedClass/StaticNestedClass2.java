package saticNestedClass;

class Outer1 {
    static class Inner1 {
        static void show() {
            System.out.println("1");

        }
    }
}

public class StaticNestedClass2 {
    public static void main(String[] args) {
        Outer1.Inner1.show();
    }

}
