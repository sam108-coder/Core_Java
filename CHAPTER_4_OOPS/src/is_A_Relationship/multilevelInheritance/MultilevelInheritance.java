package is_A_Relationship.multilevelInheritance;

class A {
    void show1() {
        System.out.println("I am in class A");
    }
}

class B extends A {
    void show2() {
        System.out.println("I am in class B");
    }
}

class C extends B {
    void show3() {
        System.out.println("I am in class C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show1();
        //    ob1.show2();
        //    ob1.show3();
        System.out.println("--------------------");

        B ob2 = new B();
        ob2.show1();
        ob2.show2();
        //    ob2.show3();
        System.out.println("--------------------");

        C ob3 = new C();
        ob3.show1();
        ob3.show2();
        ob3.show3();


    }
}
