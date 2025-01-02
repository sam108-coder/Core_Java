package polymorphism.MethodOverriding;

// We can not Override private methods, final and static method
class A6{
    private void show(){
        System.out.println("1");
    }
}
class B6 extends A6{
    public void show(){
        System.out.println("2");
    }
}
public class MethodOverriding7 {
    public static void main(String[] args) {
        A6 ob1=new B6();
    //    ob1.show(); // show() has private access

    }
}
