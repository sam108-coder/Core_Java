package interfaces;

interface I3 {
    static void show() {
        System.out.println("I am static method");
    }
}

public class InterfaceNewFeatures2 {
    public static void main(String[] args) {
        I3.show();
    }
}
