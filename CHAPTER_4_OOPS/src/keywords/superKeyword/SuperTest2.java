package keywords.superKeyword;

class A1 {
    void show1() {
        System.out.println("I am in class A1");
    }
}

class B1 extends A1 {
    void show2() {
        super.show1();
        System.out.println("I am in class B1");
    }
}

public class SuperTest2 {
    public static void main(String[] args) {
        B1 ob = new B1();
        ob.show2();
    }
}
