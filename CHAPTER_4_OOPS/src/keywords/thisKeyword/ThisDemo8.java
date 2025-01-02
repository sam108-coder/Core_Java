package keywords.thisKeyword;


class Test1 {
    void m1() {
        XYZ ob = new XYZ(this);
    }
}

class XYZ {
    XYZ(Test1 t) {
        System.out.println(t);
    }
}

public class ThisDemo8 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1();
    }
}
