package p1;

public interface Test  {
   default void m1(){
       System.out.println("Sammy");
   }

}

class A implements Test {
    int x=12;
  //  m1();

}
class B extends A{
    B ob=new B();

    @Override
    public void m1() {
        super.m1();
    }
}


