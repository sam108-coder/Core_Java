package nestedClass;

class Vehicle4 {
    void start() {
        System.out.println("1");
    }
}

public class AnonymousInnerClass4 {
    public static void main(String[] args) {
        Vehicle4 v = new Vehicle4() {
            public void start() {
                System.out.println("Starts With Key");
            }
        };
        v.start();
    }
}
