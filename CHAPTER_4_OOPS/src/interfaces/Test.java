package interfaces;

// We can achieve MULTIPLE INHERITANCE through INTERFACE
interface A1 {
    void start();
}

interface B1 {
    void start();
}

public class Test implements A1, B1 {


    public static void main(String[] args) {
        A1 ob = new Test();
        ob.start();
    }

    @Override
    public void start() {
        System.out.println("1");
    }
}
