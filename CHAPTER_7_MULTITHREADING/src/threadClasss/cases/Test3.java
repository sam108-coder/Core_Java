package threadClasss.cases;

class Abc3 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Abc3 ob1 = new Abc3();
        ob1.run();
    }
}
