package methodReference;

interface I3 {
    void m1(String a);
}

class A3 {
    public void m2(String a) {
        System.out.println("Hello : " + a);
    }
}

public class Test3 {
    public static void main(String[] args) {
        A3 ob = new A3();
        I3 i = ob::m2;
        i.m1("deepak");
    }
}
