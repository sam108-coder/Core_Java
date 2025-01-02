package abstraction;

class XYZ {

}

abstract class A extends XYZ {
    void sum() {

    }

    abstract void show();

    abstract void show(int a);
}

class B extends A {

    @Override
    void show() {

    }

    @Override
    void show(int a) {

    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        A ob1;
    //    A ob2 = new A(); // 'A' is abstract; cannot be instantiated
    }
}
