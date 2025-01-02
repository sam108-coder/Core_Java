package dependencyInjection;

class A1 {
}

class B1 {
    int bb;

    public void setBb(A1 a1) {
        System.out.println("2");
    }
}

public class SetterMethodDI {
    public static void main(String[] args) {
        A1 ob2 = new A1();
        B1 ob1 = new B1();
        ob1.setBb(ob2);
    }
}
