package keywords.finalKeyword;
class A2{
    final void m1(){
        System.out.println("I am in class A2 - m1 method");
    }
}
class B2 extends A2{

    // m1()' cannot override 'm1()' in 'keywords.finalKeyword.A2'; overridden method is final
    /*void m1(){
        System.out.println("I am in class B2 - m1 method");
    }*/

}
public class FinalTest2 {
    public static void main(String[] args) {

    }
}
