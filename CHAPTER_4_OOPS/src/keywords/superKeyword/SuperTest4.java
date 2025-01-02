package keywords.superKeyword;

class A4 {
    A4() {
        System.out.println("I am A4 class Constructor");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("I am in B4 class Constructor");
    }
}

public class SuperTest4 {
    public static void main(String[] args) {
        B4 ob = new B4();
    }
}
