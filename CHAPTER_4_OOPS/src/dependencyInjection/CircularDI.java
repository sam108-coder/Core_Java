package dependencyInjection;

class A3 {
    B3 b1;

    public void setB3(B3 b2) {
        b1 = b2;

    }
}

class B3 {
    A3 a1;

    public void setA3(A3 a2) {
        a1 = a2;
    }
}

public class CircularDI {
    public static void main(String[] args) {
        A3 ob1 = new A3();
        B3 ob2 = new B3();

        ob1.setB3(ob2);
        ob2.setA3(ob1);

    }
}
