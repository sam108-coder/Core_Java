package tryCatchBlock;

public class TryCatch5 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (ArithmeticException e) {
            System.out.println("3 Catch");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4 Catch");
        }
        System.out.println("5");
    }
}
