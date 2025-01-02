package polymorphism.MethodOverloading;

class Test1 {
    void sum(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }

    void sum(float a, float b) {
        float res = a + b;
        System.out.println(res);
    }

    void sum(String s1, String s2) {
        String s3 = s1 + s2;
        System.out.println(s3);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.sum(10, 20);
        t.sum(12.3f, 23.89f);
        t.sum("Rahul", "Kumar");
    }
}
