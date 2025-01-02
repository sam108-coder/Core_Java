package variable;

public class VariableDemo3 {
    int f = 700;
    int d = 300;
    static int e = 500;

    void sum() {
        int a = 100;
    }

    void mul() {
        int b = 200;
        //    int c = a + b;
        int c1 = d + b + e;
    }

    static void divide() {
        int rollNo = 101;
        //    int res = d;
    }

    public static void main(String[] args) {
        VariableDemo3 obj1 = new VariableDemo3();
        obj1.sum();

        VariableDemo3 obj2 = new VariableDemo3();


    }
}
