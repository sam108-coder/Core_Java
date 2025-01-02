package lambdaExp;

@FunctionalInterface
interface I3 {
    void m2();
}

public class Test3 {
    public static void main(String[] args) {
        I3 i = () -> {
            System.out.println("hi I am Lambda Function...!!");
        };
        i.m2();

        I3 i2 = () -> {
            System.out.println("hi I am Lambda Function 2");
        };
        i2.m2();
    }
}
