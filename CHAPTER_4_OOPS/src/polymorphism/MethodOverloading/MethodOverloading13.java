package polymorphism.MethodOverloading;

public class MethodOverloading13 {
    public static void main(String[] args) {
        System.out.println("1");
        MethodOverloading13 ob = new MethodOverloading13();
        ob.main("deepak");
    }

    public static void main(String args) {
        System.out.println("2");
    }
}
