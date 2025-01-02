package polymorphism.MethodOverriding;

class A1 {
    void show() {
        System.out.println("1");
    }
}

class B1 extends A1 {
    void show() {
        System.out.println("2");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        A1 ob1 = new A1();
        ob1.show();

        B1 ob2 = new B1();
        ob2.show();

        A1 ob3 = new B1(); // call child class method
        ob3.show();
    }
}
