package tryCatchBlock;


public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        //    System.out.println(100 / 10);
            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception---------");
        } catch (ArithmeticException e) {
            System.out.println("You Can Not Divide By Zero");
        }
        System.out.println("------Thank You------");
    }
}
