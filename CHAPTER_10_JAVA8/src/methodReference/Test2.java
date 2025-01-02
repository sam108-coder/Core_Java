package methodReference;

interface I2 {
    void m1();
}

class A2 {
    static void m2() {
        System.out.println("Hi");
    }
}

public class Test2 {
    public static void main(String[] args) {
        I2 i = A2::m2;
        i.m1();
    }
}
