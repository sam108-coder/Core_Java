package polymorphism.MethodOverriding;

// We can not Override main() method BCZ main() is static method.
class A8{
    public static void main(String[] args){
        System.out.println("1");
    }
}
class B8 extends A8{
    public static void main(String[] args){
        System.out.println("2");
    }
}
public class MethodOverriding9 {
    public static void main(String[] args) {
        A8 ob1=new B8();
        String[] arr={"a","b","c"};
    //    ob1.main(str);
    }
}
