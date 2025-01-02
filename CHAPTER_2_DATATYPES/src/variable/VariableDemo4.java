package variable;

public class VariableDemo4 {

    int d;
    int f = 700;
    public static int e = 500;

    void sum() {
        int a = 100;
    }

    void mul() {
        int b = 400;
        //    int c=a+b;
        int c1 = d + b + e;
    }

    void divide(){
        int rollNo=101;
        int res=d;
    }

    public static void main(String[] args) {

        VariableDemo4 obj=new VariableDemo4();
        obj.sum();

       // System.out.println(f);
        System.out.println(obj.f);

        System.out.println(e);
        System.out.println(obj.e);
        System.out.println(VariableDemo4.e);
    }
}
