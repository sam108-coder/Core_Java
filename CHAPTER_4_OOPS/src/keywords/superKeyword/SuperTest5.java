package keywords.superKeyword;

class A5{
    A5(){
        System.out.println("I am A5 class Constructor");
    }
}
class B5 extends A4{
    B5(){
        System.out.println("I am in B5 class Constructor");
    //    super(); // Call to 'super()' must be first statement in constructor body
    }
}
public class SuperTest5 {
    public static void main(String[] args) {
        B5 ob=new B5();
    }
}
