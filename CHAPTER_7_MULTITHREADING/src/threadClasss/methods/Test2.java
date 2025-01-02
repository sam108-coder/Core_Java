package threadClasss.methods;

public class Test2 {

    void divide() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("Deepak");
        Test2 t2 = new Test2();
        t2.divide();
    }
}
