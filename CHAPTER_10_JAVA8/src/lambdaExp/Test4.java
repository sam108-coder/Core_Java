package lambdaExp;

interface I4 {
    void m3();
}

public class Test4 {
    public static void main(String[] args) {
        I4 i = () -> System.out.println("hi");
        i.m3();
    }
}
