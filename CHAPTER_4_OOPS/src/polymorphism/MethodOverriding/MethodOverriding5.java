package polymorphism.MethodOverriding;

// If we change the return type in method overriding then it will provide compile time error
class A4{
    int show(){
        System.out.println("1");
        return 0;
    }
}
class B4 extends A4{
    // Error
   /* void show(){
        System.out.println("2");
    }*/
}

public class MethodOverriding5 {
    public static void main(String[] args) {
        A4 ob1=new B4();
        ob1.show();
    }
}
