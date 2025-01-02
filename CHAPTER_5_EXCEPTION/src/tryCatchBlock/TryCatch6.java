package tryCatchBlock;

public class TryCatch6 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3 !!!!!");
        }
        // Exception 'java.lang.ArrayIndexOutOfBoundsException' has already been caught
      /*  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4 !!!!!!");
        }*/
        System.out.println("5");
    }
}
