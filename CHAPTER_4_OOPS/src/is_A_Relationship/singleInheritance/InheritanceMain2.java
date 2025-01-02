package is_A_Relationship.singleInheritance;

class A1{
    private int aa=10;
    private void show(){
        System.out.println("hi");
    }
}
class B1 extends A1{

}

public class InheritanceMain2 {
    public static void main(String[] args) {
        B1 ob=new B1();
    //    System.out.println(ob.aa); // error aa is private variable
    //    ob.show(); // error show() is private method
    }
}
