package threadClasss.methods;

public class Test3 extends Thread {

    public void run() {
        System.out.println("Hi");
        System.out.println("Old Child Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("My_Child_Thread");
        System.out.println("New Child Thread Name : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Old Main Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("My_Main_Thread");
        System.out.println("New Main Thread Name : " + Thread.currentThread().getName());

        Test3 t3 = new Test3();
        t3.start();
        System.out.println("Old Main Thread Name : " + t3.getName());

    }
}
