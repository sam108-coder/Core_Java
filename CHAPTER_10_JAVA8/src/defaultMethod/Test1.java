package defaultMethod;

interface I1 {
    void m1();

    default void m2() {
        System.out.println("hi");
    }
}

class A implements I1 {

    @Override
    public void m1() {
        System.out.println("Abstract method calling");
    }

    @Override
    public void m2() {
        System.out.println("hello");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob = new A();
        ob.m1();
        ob.m2();

    }
}
