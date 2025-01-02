package keywords.superKeyword;

class A3 {
    void show() {
        System.out.println("I am in class A3");
    }
}

class B3 extends A3 {
    void show() {
        System.out.println("I am in class B3");
    }

    void m1() {
        System.out.println("1");
        super.show();
        System.out.println("2");
    }
}

public class SuperTest3 {
    public static void main(String[] args) {
        B3 ob = new B3();
        ob.m1();
    }
}
