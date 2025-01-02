package polymorphism.MethodOverloading;

class Test7 {
    void display(int a) {
        System.out.println("First Method : " + a);
    }

    void display(int... a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

public class MethodOverloading8 {
    public static void main(String[] args) {
        Test7 t = new Test7();
        t.display();
        t.display(10);
        t.display(20, 30);
        t.display(11,12,13,14,15);
    }
}
