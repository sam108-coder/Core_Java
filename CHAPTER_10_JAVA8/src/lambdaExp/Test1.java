package lambdaExp;

interface I1 {
    void m1();
}

class A1 implements I1 {
    @Override
    public void m1() {
        System.out.println("I am in m1() method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A1 ob = new A1();
        ob.m1();
    }
}
