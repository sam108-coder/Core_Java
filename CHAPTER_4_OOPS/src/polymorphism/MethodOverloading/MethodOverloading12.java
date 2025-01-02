package polymorphism.MethodOverloading;

// Main Method Overloading
public class MethodOverloading12 {
    public static void main(String[] args) {

        System.out.println("1");
        MethodOverloading12 ob = new MethodOverloading12();
        int[] arr = {10, 20};
        ob.main(arr);
    }

    public static void main(int[] args) {
        System.out.println("2");
    }

}
