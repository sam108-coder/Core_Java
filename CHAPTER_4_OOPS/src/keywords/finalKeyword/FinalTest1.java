package keywords.finalKeyword;

class A1 {
    void m1() {
        final int a = 10;
    //    a=a+22; // Cannot assign a value to final variable 'a'
        System.out.println(a + 20);
    }
}

public class FinalTest1 {
    public static void main(String[] args) {
        A1 ob = new A1();
        ob.m1();

    }
}
