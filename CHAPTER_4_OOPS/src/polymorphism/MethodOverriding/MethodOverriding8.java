package polymorphism.MethodOverriding;

class A7{
    final void show(){
        System.out.println("1");
    }
}
class B7 extends A7{
    // error : final method not overriden
   /* public void show(){
        System.out.println("2");
    }*/
}
public class MethodOverriding8 {
    public static void main(String[] args) {
        A7 ob1=new B7();
        ob1.show();
    }
}
