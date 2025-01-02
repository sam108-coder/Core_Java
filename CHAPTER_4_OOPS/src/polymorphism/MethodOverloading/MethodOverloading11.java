package polymorphism.MethodOverloading;

// This program is Not Method Overloading BCZ return type is Not Same
class Test10{
    void display(int a){
        System.out.println("1");
    }
    int display(String a){
        System.out.println("2");
        return 0;
    }
}
public class MethodOverloading11 {
    public static void main(String[] args) {
        Test10 t=new Test10();
        t.display(10);
        t.display("deepak");
    }
}
