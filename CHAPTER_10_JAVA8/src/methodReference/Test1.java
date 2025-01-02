package methodReference;

@FunctionalInterface
interface I1 {
    void m1();
}

class A1 {
    public void m2() {
        System.out.println("I am m2() method in class A");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A1 ob = new A1();
        I1 i = ob::m2;
        i.m1();
    }
}
