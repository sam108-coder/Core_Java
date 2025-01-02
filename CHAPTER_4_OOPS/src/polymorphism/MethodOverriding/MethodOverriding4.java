package polymorphism.MethodOverriding;

// It is not Method Overriding BCZ Parameter is not Same.
class A3 {
    void show(int a) {
        System.out.println(a);
    }
}

class B3 extends A3 {
    void show(String a) {
        System.out.println(a);
    }
}

public class MethodOverriding4 {
    public static void main(String[] args) {
        A3 ob1 = new B3();
        ob1.show(10);
    //    ob1.show("deepak"); // error
    }
}
