package polymorphism.MethodOverloading;

class Test8 {
    void display(Object a) {
        System.out.println("1");
    }

    void display(String a) {
        System.out.println("2");
    }
}

public class MethodOverloading9 {
    public static void main(String[] args) {
        Test8 t = new Test8();
        t.display(null);
        t.display(t);
    }
}
