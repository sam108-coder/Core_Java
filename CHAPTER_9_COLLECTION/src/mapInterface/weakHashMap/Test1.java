package mapInterface.weakHashMap;

class A {
    A() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Deleted");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A ob = new A();
        ob = null;
        System.gc();
    }
}
