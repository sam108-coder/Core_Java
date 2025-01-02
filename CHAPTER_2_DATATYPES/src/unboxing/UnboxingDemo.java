package unboxing;

public class UnboxingDemo {
    public static void main(String[] args) {
        Integer i=new Integer(20);
        int a=i.intValue();
        int aa=i;
        System.out.println(i);
        System.out.println(a);
        System.out.println(aa);
    }
}
