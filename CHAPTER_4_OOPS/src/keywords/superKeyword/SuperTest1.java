package keywords.superKeyword;

class A {
    int no = 10;
}

class B extends A {
    int no = 20;

    void show(int no) {
        System.out.println(no);
        System.out.println(this.no);
        System.out.println(super.no);
    }

}

public class SuperTest1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show(33);
    }
}
