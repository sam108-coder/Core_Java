package nestedClass;

class Outer4 {
    void show() {
        class Inner4 {
            public int a = 10;

            void show2() {
                System.out.println(a);
            }
        }
        Inner4 i = new Inner4();
        i.show2();
    }
}

public class MethodLocalInnerClass3 {
    public static void main(String[] args) {
        Outer4 ob = new Outer4();
        ob.show();
    }
}
