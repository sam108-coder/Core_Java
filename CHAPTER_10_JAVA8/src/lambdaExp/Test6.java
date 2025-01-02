package lambdaExp;

interface I6 {
//    void m5(int a);

    void m6(int a, int b);
}

public class Test6 {
    public static void main(String[] args) {
       /* I6 i = (a) -> System.out.println(a * a);
        i.m5(12);*/

       /* I6 i2 = a -> System.out.println(a * a);
        i2.m5(10);*/

        I6 i3 = (a, b) -> System.out.println(a + b);
        i3.m6(12, 13);
    }
}
