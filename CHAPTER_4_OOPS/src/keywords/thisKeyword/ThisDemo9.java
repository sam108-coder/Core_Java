package keywords.thisKeyword;

class Test2 {
    Test2 m1() {
        return this;
    }
}

public class ThisDemo9 {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        Test2 t = ob.m1();
        System.out.println(t);
    }
}
