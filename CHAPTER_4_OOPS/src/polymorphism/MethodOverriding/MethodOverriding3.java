package polymorphism.MethodOverriding;


class A2{
    void show(int a){
        System.out.println("1");
    }
}
/*class B2 extends A2{
    void show(){
        System.out.println("2");
    }
}*/
class B2 extends A2{
    void show(int a){
        System.out.println("2");
    }
}
public class MethodOverriding3 {
    public static void main(String[] args) {
        A2 ob1=new B2();
        ob1.show(20);
    }
}
