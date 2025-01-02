package staticMethod;

interface I1 {
    void m1();

    static void m2() {
        System.out.println("I am in static method");
    }
}

class A implements I1 {

    @Override
    public void m1() {

    }
}

public class Test1 {
    public static void main(String[] args) {
        I1.m2();
    }
}
