package polymorphism.MethodOverloading;

class Test3 {
    void display(String a, int b) {
        System.out.println(a + "," + b);
    }

    void display(int a, String b) {
        System.out.println(a + "," + b);
    }
}

public class MethodOverloading4 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.display(10, "deepak");
        t.display("rahul", 20);
    }
}
