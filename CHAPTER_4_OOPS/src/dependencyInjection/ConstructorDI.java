package dependencyInjection;

class A {
    String aa;

    A(B b) {

    }
}

class B {
    int b;

    B(int bb) {
        b = bb;
    }
}

public class ConstructorDI {
    public static void main(String[] args) {
        B ob1 = new B(100);
        A ob2 = new A(ob1);
    }
}
