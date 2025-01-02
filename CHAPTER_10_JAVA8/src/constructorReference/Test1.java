package constructorReference;

interface I4 {
    void m1();
}

class A4 {
    public A4() {
        System.out.println("Constructor...!!!");
    }
}

public class Test1 {
    public static void main(String[] args) {
        //   new A4();

        I4 i = A4::new;
        i.m1();
    }
}
