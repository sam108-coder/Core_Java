package multiCatchBlock;

public class MultiCatchBlock1 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 20);
            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
