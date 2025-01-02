package keywords.staticKeyword;

public class StaticDemo6 {
    static int no = 10;

    static void m1() {
        System.out.println(no);
    }

    public static void main(String[] args) {
        StaticDemo6.m1();
        StaticDemo6 ob = new StaticDemo6();
        ob.m1();
    }
}
