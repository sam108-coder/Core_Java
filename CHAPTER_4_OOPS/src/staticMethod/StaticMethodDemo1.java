package staticMethod;

public class StaticMethodDemo1 {

    void show1() {
        System.out.println("1");
    }

    static void show2() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        StaticMethodDemo1 ob = new StaticMethodDemo1();
        ob.show1();

        StaticMethodDemo1.show2();
        show2();
    }
}
