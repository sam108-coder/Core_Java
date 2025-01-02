package staticMethod;

class A3 {
    void show1() {
        System.out.println("1");
    }

    static void show2() {
        //    this.show1();  // 'staticMethod.A3.this' cannot be referenced from a static context
        System.out.println("2");
    }
}

public class StaticMethodDemo5 {
    public static void main(String[] args) {
        A3.show2();
    }
}
