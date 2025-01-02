package keywords.thisKeyword;

public class ThisDemo1 {
    void m1() {
        System.out.println("I am in m1() method : " + this);
    }

    public static void main(String[] args) {
        ThisDemo1 ob = new ThisDemo1();
        System.out.println("I am in main method : " + ob);
        ob.m1();
    }
}
