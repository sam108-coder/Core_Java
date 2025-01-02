package lambdaExp;

interface I5 {
    //    void m4(int a);

    //    void m5(int a, int b);
    void m6(String name);
}

public class Test5 {
    public static void main(String[] args) {
     /*   I5 i = (int a) -> System.out.println(a * a);
        i.m4(20);

        I5 i2 = (int a, int b) -> System.out.println(a + b);
        i2.m5(12, 13);

        I5 i3 = (a, b) -> {
            int res = a + b;
            System.out.println(res);
        };
        i3.m5(100, 103);*/

        I5 i4 = (String name) -> System.out.println(name.length());
        i4.m6("Rahul Kumar");
    }
}
