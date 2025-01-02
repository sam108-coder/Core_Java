package keywords.thisKeyword;

class Test {
    void m1() {
        System.out.println("1");
        m2(this);
    }

    void m2(Test t) {
        System.out.println(t);
    }

}

public class ThisDemo7 {

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
