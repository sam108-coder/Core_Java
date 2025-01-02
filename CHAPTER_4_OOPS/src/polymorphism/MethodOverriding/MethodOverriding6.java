package polymorphism.MethodOverriding;

// We can provide child class as a return type for overriding method and this concept and this concept is as COVARIANT return type.
class Parent {

}

class Child extends Parent {

}

class Child2 extends Parent {

}

class A5 {
    Parent show() {
        System.out.println("1");
        return new Parent();
    }
}

class B5 extends A5 {
    Child show() {
        System.out.println("2");
        return new Child();
    }
}

public class MethodOverriding6 {
    public static void main(String[] args) {
        A5 ob1 = new B5();
        ob1.show();
    }
}
