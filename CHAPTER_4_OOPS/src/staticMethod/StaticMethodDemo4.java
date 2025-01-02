package staticMethod;

class A2 {
    static int a = 10;

    static void show2() {
        System.out.println(a);
    }
}

public class StaticMethodDemo4 {
    public static void main(String[] args) {
        A2 ob = new A2();
        ob.show2();


    }
}
