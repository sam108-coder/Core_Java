package is_A_Relationship.singleInheritance;

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

public class SingleInheritance {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show1();
        //    ob1.show2(); // error
        System.out.println("--------------------");

        B ob2 = new B();
        ob2.show1();
        ob2.show2();

    }

}
