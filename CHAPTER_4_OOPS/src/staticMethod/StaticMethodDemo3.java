package staticMethod;

class A1 {
    static void show2() {
        System.out.println("2");
    }
}

public class StaticMethodDemo3 {
    public static void main(String[] args) {
        A1 ob = new A1();
        ob.show2();

    }
}
