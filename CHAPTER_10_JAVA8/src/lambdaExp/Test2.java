package lambdaExp;

interface I2 {
    void m1();

    void m2();
}

public class Test2 {
    public static void main(String[] args) {
        I2 ob = new I2() {
            public void m1() {
                System.out.println("I am in m1() method---!!!");
            }

            public void m2() {

            }
        };
        ob.m1();
    }
}
