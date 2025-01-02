package polymorphism.MethodOverloading;

class Test5 {
    void display(float a) {
        System.out.println(a);
    }
}

public class MethodOverloading6 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        t.display('d'); // 100.0
        t.display(11);  // 11.0
    }
}
