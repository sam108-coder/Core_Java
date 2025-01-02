package nestedClass;

abstract class Vehicle {
    abstract void start();

    abstract void showName();
}

public class AnonymousInnerClass1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {
            @Override
            void start() {
                System.out.println("Starts With Key");
            }

            @Override
            void showName() {
                System.out.println("Tata Naxon");
            }
        };
        v.start();
        v.showName();
    }
}
