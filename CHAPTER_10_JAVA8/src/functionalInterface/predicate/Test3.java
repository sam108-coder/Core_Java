package functionalInterface.predicate;


interface I2 {
    boolean test(int no);
}

class A1 implements I2 {

    @Override
    public boolean test(int no) {
        return no % 2 == 0;
    }
}

public class Test3 {
    public static void main(String[] args) {
        I2 ob = new A1();
        System.out.println(ob.test(12));
    }
}
