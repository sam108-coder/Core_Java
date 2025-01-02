package p1;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }
    public void m1(){
        System.out.println("Sammy");
    }

    public static void main(String[] args) {

    }
}
class C {
    void m2(){
        Singleton.getInstance().m1();
    }


}